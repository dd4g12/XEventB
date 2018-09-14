/*
 * generated by Xtext 2.13.0
 */
package ac.soton.xeventb.xmachine.serializer;

import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.eventb.emf.core.extension.coreextension.EventCases;
import ac.soton.eventb.emf.core.extension.coreextension.FormalParameter;
import ac.soton.eventb.emf.inclusion.EventSynchronisation;
import ac.soton.eventb.emf.inclusion.InclusionPackage;
import ac.soton.eventb.emf.inclusion.MachineInclusion;
import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.Variable;
import org.eventb.emf.core.machine.Variant;
import org.eventb.emf.core.machine.Witness;

@SuppressWarnings("all")
public class XMachineSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XMachineGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CoreextensionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CoreextensionPackage.EVENT_CASES:
				sequence_XGroup(context, (EventCases) semanticObject); 
				return; 
			case CoreextensionPackage.FORMAL_PARAMETER:
				sequence_XFormalParameter(context, (FormalParameter) semanticObject); 
				return; 
			}
		else if (epackage == InclusionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case InclusionPackage.EVENT_SYNCHRONISATION:
				if (rule == grammarAccess.getEventSyncRule()) {
					sequence_EventSync(context, (EventSynchronisation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXGroupOrEventRule()) {
					sequence_EventSync_GroupSync(context, (EventSynchronisation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getGroupSyncRule()) {
					sequence_GroupSync(context, (EventSynchronisation) semanticObject); 
					return; 
				}
				else break;
			case InclusionPackage.MACHINE_INCLUSION:
				sequence_MIncludes(context, (MachineInclusion) semanticObject); 
				return; 
			}
		else if (epackage == MachinePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MachinePackage.ACTION:
				sequence_XAction(context, (org.eventb.emf.core.machine.Action) semanticObject); 
				return; 
			case MachinePackage.EVENT:
				sequence_XEvent(context, (Event) semanticObject); 
				return; 
			case MachinePackage.GUARD:
				sequence_XGuard(context, (Guard) semanticObject); 
				return; 
			case MachinePackage.INVARIANT:
				sequence_XInvariant(context, (Invariant) semanticObject); 
				return; 
			case MachinePackage.MACHINE:
				sequence_Machine(context, (Machine) semanticObject); 
				return; 
			case MachinePackage.PARAMETER:
				sequence_XParameter(context, (org.eventb.emf.core.machine.Parameter) semanticObject); 
				return; 
			case MachinePackage.VARIABLE:
				sequence_XVariable(context, (Variable) semanticObject); 
				return; 
			case MachinePackage.VARIANT:
				sequence_XVariant(context, (Variant) semanticObject); 
				return; 
			case MachinePackage.WITNESS:
				sequence_XWitness(context, (Witness) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     EventSync returns EventSynchronisation
	 *
	 * Constraint:
	 *     (prefix=ID? synchronisedEvent=[Event|ID])
	 */
	protected void sequence_EventSync(ISerializationContext context, EventSynchronisation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XGroupOrEvent returns EventSynchronisation
	 *
	 * Constraint:
	 *     ((prefix=ID? synchronisedEvent=[Event|ID]) | (prefix=ID? synchronisedCases=[EventCases|ID] (actualParameters+=ID actualParameters+=ID*)?))
	 */
	protected void sequence_EventSync_GroupSync(ISerializationContext context, EventSynchronisation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GroupSync returns EventSynchronisation
	 *
	 * Constraint:
	 *     (prefix=ID? synchronisedCases=[EventCases|ID] (actualParameters+=ID actualParameters+=ID*)?)
	 */
	protected void sequence_GroupSync(ISerializationContext context, EventSynchronisation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MIncludes returns MachineInclusion
	 *
	 * Constraint:
	 *     (abstractMachine=[Machine|QualifiedName] concreteMachine=[Machine|ID]? (prefixes+=ID prefixes+=ID*)?)
	 */
	protected void sequence_MIncludes(ISerializationContext context, MachineInclusion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Machine returns Machine
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         refines+=[Machine|ID]? 
	 *         sees+=[Context|ID]* 
	 *         extensions+=MIncludes* 
	 *         variables+=XVariable* 
	 *         invariants+=XInvariant* 
	 *         variant=XVariant? 
	 *         (events+=XEvent events+=XEvent*)? 
	 *         extensions+=XGroup*
	 *     )
	 */
	protected void sequence_Machine(ISerializationContext context, Machine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XAction returns Action
	 *
	 * Constraint:
	 *     (name=XLABEL action=XPredicate)
	 */
	protected void sequence_XAction(ISerializationContext context, org.eventb.emf.core.machine.Action semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BACTION__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BACTION__ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getXActionAccess().getActionXPredicateParserRuleCall_2_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XEvent returns Event
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (extended?='extended' | convergence=XConvergence)* 
	 *         extensions+=XGroupOrEvent* 
	 *         refines+=[Event|ID]* 
	 *         (
	 *             (witnesses+=XWitness* actions+=XAction+) | 
	 *             (guards+=XGuard+ witnesses+=XWitness* actions+=XAction*) | 
	 *             (parameters+=XParameter+ guards+=XGuard+ witnesses+=XWitness* actions+=XAction*)
	 *         )?
	 *     )
	 */
	protected void sequence_XEvent(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XFormalParameter returns FormalParameter
	 *
	 * Constraint:
	 *     (direction=XDirection name=ID)
	 */
	protected void sequence_XFormalParameter(ISerializationContext context, FormalParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CoreextensionPackage.Literals.FORMAL_PARAMETER__DIRECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoreextensionPackage.Literals.FORMAL_PARAMETER__DIRECTION));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXFormalParameterAccess().getDirectionXDirectionEnumRuleCall_1_0(), semanticObject.getDirection());
		feeder.accept(grammarAccess.getXFormalParameterAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XGroup returns EventCases
	 *
	 * Constraint:
	 *     (name=ID (formalParameters+=XFormalParameter formalParameters+=XFormalParameter*)? (events+=[Event|ID] events+=[Event|ID]*)?)
	 */
	protected void sequence_XGroup(ISerializationContext context, EventCases semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XGuard returns Guard
	 *
	 * Constraint:
	 *     (name=XLABEL predicate=XPredicate theorem?='theorem'?)
	 */
	protected void sequence_XGuard(ISerializationContext context, Guard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XInvariant returns Invariant
	 *
	 * Constraint:
	 *     (name=XLABEL predicate=XPredicate theorem?='theorem'?)
	 */
	protected void sequence_XInvariant(ISerializationContext context, Invariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XParameter returns Parameter
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_XParameter(ISerializationContext context, org.eventb.emf.core.machine.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XVariable returns Variable
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_XVariable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XVariant returns Variant
	 *
	 * Constraint:
	 *     expression=XPredicate
	 */
	protected void sequence_XVariant(ISerializationContext context, Variant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BEXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BEXPRESSION__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXVariantAccess().getExpressionXPredicateParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XWitness returns Witness
	 *
	 * Constraint:
	 *     (name=XLABEL predicate=XPredicate)
	 */
	protected void sequence_XWitness(ISerializationContext context, Witness semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BPREDICATE__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BPREDICATE__PREDICATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getXWitnessAccess().getPredicateXPredicateParserRuleCall_2_0(), semanticObject.getPredicate());
		feeder.finish();
	}
	
	
}
