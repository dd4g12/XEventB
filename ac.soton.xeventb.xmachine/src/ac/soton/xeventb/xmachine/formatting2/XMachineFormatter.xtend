/*******************************************************************************
 * Copyright (c) 2016,2018 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.xeventb.xmachine.formatting2

import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eventb.emf.core.AbstractExtension
import org.eventb.emf.core.machine.Action
import org.eventb.emf.core.machine.Event
import org.eventb.emf.core.machine.Guard
import org.eventb.emf.core.machine.Invariant
import org.eventb.emf.core.machine.Machine
import org.eventb.emf.core.machine.Parameter
import org.eventb.emf.core.machine.Variable
import org.eventb.emf.core.machine.Variant
import org.eventb.emf.core.machine.Witness
import ac.soton.eventb.emf.core.^extension.coreextension.EventCases
import ac.soton.eventb.emf.inclusion.MachineInclusion

/**
 * <p>
 * XMachineFormatter contains custom formatting details
 * </p>
 * 
 * @author dd4g12
 * @since 1.0
 */
class XMachineFormatter extends AbstractFormatter2 {

	@Inject extension XMachineGrammarAccess

	def dispatch void format(Machine machine, extension IFormattableDocument document) {
		// format HiddenRegions around keywords, attributes, cross references, etc. 
		// add new lines before and after some machine keywords
		// machine.regionFor.keyword("machine").prepend[newLine];  //not needed with ML
		machine.regionFor.keyword("includes").prepend[newLine];
		machine.regionFor.keyword("refines").prepend[newLine];
		machine.regionFor.keyword("sees").prepend[newLine]
		machine.regionFor.keyword("variables").prepend[newLine]
		machine.regionFor.keyword("invariants").prepend[newLine]
		machine.regionFor.keyword("variants").prepend[newLine]
		machine.regionFor.keyword("events").prepend[newLine].append[newLine];

		// add new line after multi line comment
		machine.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]

        // adding the filter fixed the problem of 2 line with eventcases
		for (AbstractExtension abstractExtension : machine.getExtensions().filter(MachineInclusion)) {
			abstractExtension.format.prepend[newLine];

			// add new line after multi line comment
			abstractExtension.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]
		}
		for (Variable variable : machine.getVariables()) {
			variable.format.prepend[newLine];

			// add new line after multi line comment
			variable.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]
		}
		for (Invariant invariant : machine.getInvariants()) {
			invariant.format.prepend[newLine];

			// add new line after multi line comment
			invariant.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]
		}

		for (Variant variant : machine.getVariants()) {
			variant.format.prepend[newLine];

			// add new line after multi line comment
			variant.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]
		}

		for (Event event : machine.getEvents()) {
			event.format.append[newLines = 2];

		}
		
		//new
		for (EventCases group : machine.extensions.filter(EventCases)) {
			group.format.append[newLines = 2];

		}

		// indent the variables
		if (!machine.variables.empty) {
			val firstVar = machine.variables.head
			val lastVar = machine.variables.last
			set(firstVar.regionForEObject.previousHiddenRegion, lastVar.regionForEObject.nextHiddenRegion)[indent]
		}

		// indent the inavraints
		if (!machine.invariants.empty) {
			val firstInv = machine.invariants.head
			val lastInv = machine.invariants.last
			set(firstInv.regionForEObject.previousHiddenRegion, lastInv.regionForEObject.nextHiddenRegion)[indent]

		}

		// indent the variant
		if (!machine.variants.empty) {
			val firstVariant = machine.variants.head
			val lastVariant = machine.variants.last 
			set(firstVariant.regionForEObject.previousHiddenRegion, lastVariant.regionForEObject.nextHiddenRegion) [indent]
		}

		// indent the events
		if (!machine.events.empty) {
			val firstEvent = machine.events.head
			val lastEvent = machine.events.last
			set(firstEvent.regionForEObject.previousHiddenRegion, lastEvent.regionForEObject.nextHiddenRegion)[indent]
		}

		// New after CamilleX
		// indent the groups
		if (!machine.extensions.filter(EventCases).empty) {
			val firstGroup = machine.extensions.filter(EventCases).head
			val lastGroup = machine.extensions.filter(EventCases).last 
			set(firstGroup.regionForEObject.previousHiddenRegion, lastGroup.regionForEObject.nextHiddenRegion)[indent]
		}
	}

	def dispatch void format(Event event, extension IFormattableDocument document) {
		// format HiddenRegions around keywords, attributes, cross references, etc. 
		// add new lines before events keywords
		event.regionFor.keyword("synchronises").prepend[newLine];
		event.regionFor.keyword("refines").prepend[newLine];
		event.regionFor.keyword("any").prepend[newLine];
		event.regionFor.keyword("where").prepend[newLine];
		event.regionFor.keyword("with").prepend[newLine];
		event.regionFor.keyword("then").prepend[newLine];
		event.regionFor.keyword("end").prepend[newLine];

		// add new line before event attributes and after the last attribute
		for (AbstractExtension abstractExtension : event.getExtensions()) {
			abstractExtension.format.prepend[newLine];
			if (abstractExtension == event.extensions.last) // This is to avoid conflict exceptions
				abstractExtension.format.append[newLine]

			// add new line after multi line comment
			abstractExtension.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]
		}

		for (Parameter parameter : event.getParameters()) {
			parameter.format.prepend[newLine]

			// add new line after multi line comment
			parameter.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]
		}

		for (Guard guard : event.getGuards()) {
			guard.format.prepend[newLine]

			// add new line after multi line comment
			guard.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]
		}

		for (Witness witness : event.getWitnesses()) {
			witness.format.prepend[newLine];

			// add new line after multi line comment
			witness.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]
		}
		for (Action action : event.getActions()) {
			action.format.prepend[newLine];

			// add new line after multi line comment
			action.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]
		}

		// indent the parameters
		if (!event.parameters.empty) {
			val firstPar = event.parameters.head
			val lastPar = event.parameters.last
			set(firstPar.regionForEObject.previousHiddenRegion, lastPar.regionForEObject.nextHiddenRegion)[indent]

		}

		// indent the guards
		if (!event.guards.empty) {
			val firstGrd = event.guards.head
			val lastGrd = event.guards.last
			set(firstGrd.regionForEObject.previousHiddenRegion, lastGrd.regionForEObject.nextHiddenRegion)[indent]

		}

		// indent the witnesses
		if (!event.witnesses.empty) {
			val firstWit = event.witnesses.head
			val lastWit = event.witnesses.last
			set(firstWit.regionForEObject.previousHiddenRegion, lastWit.regionForEObject.nextHiddenRegion)[indent]

		}

		// indent the actions
		if (!event.actions.empty) {
			val firstAct = event.actions.head
			val lastAct = event.actions.last
			set(firstAct.regionForEObject.previousHiddenRegion, lastAct.regionForEObject.nextHiddenRegion)[indent]
		}

		// ----------------
//		if(!event.refinesNames.empty){
//			//val com = event.comment.format.append[newLine]
//			//event.allRegionsFor.features(MachinePackage.Literals.EVENT__REFINES_NAMES).forEach[prepend[indent] append[newLine]]
//			set(event.regionFor.features(MachinePackage.Literals.EVENT__REFINES).findFirst[].previousHiddenRegion,event.regionFor.features(MachinePackage.Literals.EVENT__REFINES).findLast[].nextHiddenRegion)[indent]
//		}
		// add new line after multi line comment
		event.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]

	}

	// new after CamilleX
	// formatting for group
	def dispatch void format(EventCases group, extension IFormattableDocument document) {

		// add new lines before group keywords
		group.regionFor.keyword("begin").prepend[newLine];
		group.regionFor.keyword("end").prepend[newLine];
		
		if (!group.events.empty)
			group.regionFor.keyword("begin").append[newLine];
		
    // indent the events, following the previous approach indented the original events
	interior(
			group.regionFor.keyword("begin"),
			group.regionFor.keyword("end")
		)[indent]
		
		// add new line after multi line comment
		group.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]
	}

}
