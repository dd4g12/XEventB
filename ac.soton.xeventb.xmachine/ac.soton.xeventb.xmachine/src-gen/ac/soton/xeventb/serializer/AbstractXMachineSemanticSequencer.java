/*
 * generated by Xtext
 */
package ac.soton.xeventb.serializer;

import ac.soton.eventb.emf.inclusion.EventSynchronisation;
import ac.soton.eventb.emf.inclusion.InclusionPackage;
import ac.soton.eventb.emf.inclusion.MachineInclusion;
import ac.soton.xeventb.services.XMachineGrammarAccess;
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
public abstract class AbstractXMachineSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XMachineGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == InclusionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case InclusionPackage.EVENT_SYNCHRONISATION:
				sequence_EventSync(context, (EventSynchronisation) semanticObject); 
				return; 
			case InclusionPackage.MACHINE_INCLUSION:
				sequence_MIncludes(context, (MachineInclusion) semanticObject); 
				return; 
			}
		else if (epackage == MachinePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MachinePackage.ACTION:
				if (rule == grammarAccess.getXActionMLCommentRule()) {
					sequence_XActionMLComment(context, (org.eventb.emf.core.machine.Action) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXActionRule()) {
					sequence_XActionMLComment_XActionNoComment_XActionSLComment(context, (org.eventb.emf.core.machine.Action) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXActionNoCommentRule()) {
					sequence_XActionNoComment(context, (org.eventb.emf.core.machine.Action) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXActionSLCommentRule()) {
					sequence_XActionSLComment(context, (org.eventb.emf.core.machine.Action) semanticObject); 
					return; 
				}
				else break;
			case MachinePackage.EVENT:
				if (rule == grammarAccess.getXEventMLCommentRule()) {
					sequence_XEventMLComment(context, (Event) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXEventRule()) {
					sequence_XEventMLComment_XEventNoComment_XEventSLComment(context, (Event) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXEventNoCommentRule()) {
					sequence_XEventNoComment(context, (Event) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXEventSLCommentRule()) {
					sequence_XEventSLComment(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case MachinePackage.GUARD:
				if (rule == grammarAccess.getXGuardMLCommentRule()) {
					sequence_XGuardMLComment(context, (Guard) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXGuardRule()) {
					sequence_XGuardMLComment_XGuardNoComment_XGuardSLComment(context, (Guard) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXGuardNoCommentRule()) {
					sequence_XGuardNoComment(context, (Guard) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXGuardSLCommentRule()) {
					sequence_XGuardSLComment(context, (Guard) semanticObject); 
					return; 
				}
				else break;
			case MachinePackage.INVARIANT:
				if (rule == grammarAccess.getXInvariantMLCommentRule()) {
					sequence_XInvariantMLComment(context, (Invariant) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXInvariantRule()) {
					sequence_XInvariantMLComment_XInvariantNoComment_XInvariantSLComment(context, (Invariant) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXInvariantNoCommentRule()) {
					sequence_XInvariantNoComment(context, (Invariant) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXInvariantSLCommentRule()) {
					sequence_XInvariantSLComment(context, (Invariant) semanticObject); 
					return; 
				}
				else break;
			case MachinePackage.MACHINE:
				sequence_Machine(context, (Machine) semanticObject); 
				return; 
			case MachinePackage.PARAMETER:
				if (rule == grammarAccess.getXParameterMLCommentRule()) {
					sequence_XParameterMLComment(context, (org.eventb.emf.core.machine.Parameter) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXParameterRule()) {
					sequence_XParameterMLComment_XParameterNoComment_XParameterSLComment(context, (org.eventb.emf.core.machine.Parameter) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXParameterNoCommentRule()) {
					sequence_XParameterNoComment(context, (org.eventb.emf.core.machine.Parameter) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXParameterSLCommentRule()) {
					sequence_XParameterSLComment(context, (org.eventb.emf.core.machine.Parameter) semanticObject); 
					return; 
				}
				else break;
			case MachinePackage.VARIABLE:
				if (rule == grammarAccess.getXVariableMLCommentRule()) {
					sequence_XVariableMLComment(context, (Variable) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXVariableRule()) {
					sequence_XVariableMLComment_XVariableNoComment_XVariableSLComment(context, (Variable) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXVariableNoCommentRule()) {
					sequence_XVariableNoComment(context, (Variable) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXVariableSLCommentRule()) {
					sequence_XVariableSLComment(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case MachinePackage.VARIANT:
				if (rule == grammarAccess.getXVariantMLCommentRule()) {
					sequence_XVariantMLComment(context, (Variant) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXVariantRule()) {
					sequence_XVariantMLComment_XVariantNoComment_XVariantSLComment(context, (Variant) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXVariantNoCommentRule()) {
					sequence_XVariantNoComment(context, (Variant) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXVariantSLCommentRule()) {
					sequence_XVariantSLComment(context, (Variant) semanticObject); 
					return; 
				}
				else break;
			case MachinePackage.WITNESS:
				if (rule == grammarAccess.getXWitnessMLCommentRule()) {
					sequence_XWitnessMLComment(context, (Witness) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXWitnessRule()) {
					sequence_XWitnessMLComment_XWitnessNoComment_XWitnessSLComment(context, (Witness) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXWitnessNoCommentRule()) {
					sequence_XWitnessNoComment(context, (Witness) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXWitnessSLCommentRule()) {
					sequence_XWitnessSLComment(context, (Witness) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     EventSync returns EventSynchronisation
	 *
	 * Constraint:
	 *     (extensionId='synchronises' prefix=ID? synchronisedEvent=[Event|ID])
	 */
	protected void sequence_EventSync(ISerializationContext context, EventSynchronisation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MIncludes returns MachineInclusion
	 *
	 * Constraint:
	 *     (extensionId='includes' abstractMachine=[Machine|ID] concreteMachine=[Machine|ID]? (prefixes+=ID prefixes+=ID*)?)
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
	 *         (comment=ML_COMMENT | comment=SL_COMMENT)? 
	 *         name=ID 
	 *         extensions+=MIncludes* 
	 *         refines+=[Machine|ID]? 
	 *         sees+=[Context|ID]* 
	 *         variables+=XVariable* 
	 *         invariants+=XInvariant* 
	 *         variant=XVariant? 
	 *         (events+=XEvent events+=XEvent*)?
	 *     )
	 */
	protected void sequence_Machine(ISerializationContext context, Machine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XActionMLComment returns Action
	 *
	 * Constraint:
	 *     (comment=ML_COMMENT name=XLABEL action=STRING)
	 */
	protected void sequence_XActionMLComment(ISerializationContext context, org.eventb.emf.core.machine.Action semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BACTION__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BACTION__ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXActionMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0(), semanticObject.getComment());
		feeder.accept(grammarAccess.getXActionMLCommentAccess().getNameXLABELTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getXActionMLCommentAccess().getActionSTRINGTerminalRuleCall_3_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XAction returns Action
	 *
	 * Constraint:
	 *     ((name=XLABEL action=STRING) | (comment=ML_COMMENT name=XLABEL action=STRING) | (name=XLABEL action=STRING comment=SL_COMMENT))
	 */
	protected void sequence_XActionMLComment_XActionNoComment_XActionSLComment(ISerializationContext context, org.eventb.emf.core.machine.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XActionNoComment returns Action
	 *
	 * Constraint:
	 *     (name=XLABEL action=STRING)
	 */
	protected void sequence_XActionNoComment(ISerializationContext context, org.eventb.emf.core.machine.Action semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BACTION__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BACTION__ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXActionNoCommentAccess().getNameXLABELTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getXActionNoCommentAccess().getActionSTRINGTerminalRuleCall_2_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XActionSLComment returns Action
	 *
	 * Constraint:
	 *     (name=XLABEL action=STRING comment=SL_COMMENT)
	 */
	protected void sequence_XActionSLComment(ISerializationContext context, org.eventb.emf.core.machine.Action semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BACTION__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BACTION__ACTION));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXActionSLCommentAccess().getNameXLABELTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getXActionSLCommentAccess().getActionSTRINGTerminalRuleCall_2_0(), semanticObject.getAction());
		feeder.accept(grammarAccess.getXActionSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_3_0(), semanticObject.getComment());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XEventMLComment returns Event
	 *
	 * Constraint:
	 *     (
	 *         comment=ML_COMMENT 
	 *         name=ID 
	 *         (extended?='extended' | convergence=XConvergence)* 
	 *         extensions+=EventSync* 
	 *         refines+=[Event|ID]* 
	 *         (
	 *             (witnesses+=XWitness* actions+=XAction+) | 
	 *             (guards+=XGuard+ witnesses+=XWitness* actions+=XAction*) | 
	 *             (parameters+=XParameter+ guards+=XGuard+ witnesses+=XWitness* actions+=XAction*)
	 *         )?
	 *     )
	 */
	protected void sequence_XEventMLComment(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XEvent returns Event
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             name=ID 
	 *             (extended?='extended' | convergence=XConvergence)* 
	 *             extensions+=EventSync* 
	 *             refines+=[Event|ID]* 
	 *             (
	 *                 (witnesses+=XWitness* actions+=XAction+) | 
	 *                 (guards+=XGuard+ witnesses+=XWitness* actions+=XAction*) | 
	 *                 (parameters+=XParameter+ guards+=XGuard+ witnesses+=XWitness* actions+=XAction*)
	 *             )?
	 *         ) | 
	 *         (
	 *             comment=ML_COMMENT 
	 *             name=ID 
	 *             (extended?='extended' | convergence=XConvergence)* 
	 *             extensions+=EventSync* 
	 *             refines+=[Event|ID]* 
	 *             (
	 *                 (witnesses+=XWitness* actions+=XAction+) | 
	 *                 (guards+=XGuard+ witnesses+=XWitness* actions+=XAction*) | 
	 *                 (parameters+=XParameter+ guards+=XGuard+ witnesses+=XWitness* actions+=XAction*)
	 *             )?
	 *         ) | 
	 *         (
	 *             name=ID 
	 *             (extended?='extended' | convergence=XConvergence)* 
	 *             comment=SL_COMMENT 
	 *             extensions+=EventSync* 
	 *             refines+=[Event|ID]* 
	 *             (
	 *                 (witnesses+=XWitness* actions+=XAction+) | 
	 *                 (guards+=XGuard+ witnesses+=XWitness* actions+=XAction*) | 
	 *                 (parameters+=XParameter+ guards+=XGuard+ witnesses+=XWitness* actions+=XAction*)
	 *             )?
	 *         )
	 *     )
	 */
	protected void sequence_XEventMLComment_XEventNoComment_XEventSLComment(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XEventNoComment returns Event
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (extended?='extended' | convergence=XConvergence)* 
	 *         extensions+=EventSync* 
	 *         refines+=[Event|ID]* 
	 *         (
	 *             (witnesses+=XWitness* actions+=XAction+) | 
	 *             (guards+=XGuard+ witnesses+=XWitness* actions+=XAction*) | 
	 *             (parameters+=XParameter+ guards+=XGuard+ witnesses+=XWitness* actions+=XAction*)
	 *         )?
	 *     )
	 */
	protected void sequence_XEventNoComment(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XEventSLComment returns Event
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (extended?='extended' | convergence=XConvergence)* 
	 *         comment=SL_COMMENT 
	 *         extensions+=EventSync* 
	 *         refines+=[Event|ID]* 
	 *         (
	 *             (witnesses+=XWitness* actions+=XAction+) | 
	 *             (guards+=XGuard+ witnesses+=XWitness* actions+=XAction*) | 
	 *             (parameters+=XParameter+ guards+=XGuard+ witnesses+=XWitness* actions+=XAction*)
	 *         )?
	 *     )
	 */
	protected void sequence_XEventSLComment(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XGuardMLComment returns Guard
	 *
	 * Constraint:
	 *     (comment=ML_COMMENT name=XLABEL predicate=STRING theorem?='theorem'?)
	 */
	protected void sequence_XGuardMLComment(ISerializationContext context, Guard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XGuard returns Guard
	 *
	 * Constraint:
	 *     (
	 *         (name=XLABEL predicate=STRING theorem?='theorem'?) | 
	 *         (comment=ML_COMMENT name=XLABEL predicate=STRING theorem?='theorem'?) | 
	 *         (name=XLABEL predicate=STRING theorem?='theorem'? comment=SL_COMMENT)
	 *     )
	 */
	protected void sequence_XGuardMLComment_XGuardNoComment_XGuardSLComment(ISerializationContext context, Guard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XGuardNoComment returns Guard
	 *
	 * Constraint:
	 *     (name=XLABEL predicate=STRING theorem?='theorem'?)
	 */
	protected void sequence_XGuardNoComment(ISerializationContext context, Guard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XGuardSLComment returns Guard
	 *
	 * Constraint:
	 *     (name=XLABEL predicate=STRING theorem?='theorem'? comment=SL_COMMENT)
	 */
	protected void sequence_XGuardSLComment(ISerializationContext context, Guard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XInvariantMLComment returns Invariant
	 *
	 * Constraint:
	 *     (comment=ML_COMMENT name=XLABEL predicate=STRING theorem?='theorem'?)
	 */
	protected void sequence_XInvariantMLComment(ISerializationContext context, Invariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XInvariant returns Invariant
	 *
	 * Constraint:
	 *     (
	 *         (name=XLABEL predicate=STRING theorem?='theorem'?) | 
	 *         (comment=ML_COMMENT name=XLABEL predicate=STRING theorem?='theorem'?) | 
	 *         (name=XLABEL predicate=STRING theorem?='theorem'? comment=SL_COMMENT)
	 *     )
	 */
	protected void sequence_XInvariantMLComment_XInvariantNoComment_XInvariantSLComment(ISerializationContext context, Invariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XInvariantNoComment returns Invariant
	 *
	 * Constraint:
	 *     (name=XLABEL predicate=STRING theorem?='theorem'?)
	 */
	protected void sequence_XInvariantNoComment(ISerializationContext context, Invariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XInvariantSLComment returns Invariant
	 *
	 * Constraint:
	 *     (name=XLABEL predicate=STRING theorem?='theorem'? comment=SL_COMMENT)
	 */
	protected void sequence_XInvariantSLComment(ISerializationContext context, Invariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XParameterMLComment returns Parameter
	 *
	 * Constraint:
	 *     (comment=ML_COMMENT name=ID)
	 */
	protected void sequence_XParameterMLComment(ISerializationContext context, org.eventb.emf.core.machine.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXParameterMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0(), semanticObject.getComment());
		feeder.accept(grammarAccess.getXParameterMLCommentAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XParameter returns Parameter
	 *
	 * Constraint:
	 *     (name=ID | (comment=ML_COMMENT name=ID) | (name=ID comment=SL_COMMENT))
	 */
	protected void sequence_XParameterMLComment_XParameterNoComment_XParameterSLComment(ISerializationContext context, org.eventb.emf.core.machine.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XParameterNoComment returns Parameter
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_XParameterNoComment(ISerializationContext context, org.eventb.emf.core.machine.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXParameterNoCommentAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XParameterSLComment returns Parameter
	 *
	 * Constraint:
	 *     (name=ID comment=SL_COMMENT)
	 */
	protected void sequence_XParameterSLComment(ISerializationContext context, org.eventb.emf.core.machine.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXParameterSLCommentAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getXParameterSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0(), semanticObject.getComment());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XVariableMLComment returns Variable
	 *
	 * Constraint:
	 *     (comment=ML_COMMENT name=ID)
	 */
	protected void sequence_XVariableMLComment(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXVariableMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0(), semanticObject.getComment());
		feeder.accept(grammarAccess.getXVariableMLCommentAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XVariable returns Variable
	 *
	 * Constraint:
	 *     (name=ID | (comment=ML_COMMENT name=ID) | (name=ID comment=SL_COMMENT))
	 */
	protected void sequence_XVariableMLComment_XVariableNoComment_XVariableSLComment(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XVariableNoComment returns Variable
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_XVariableNoComment(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXVariableNoCommentAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XVariableSLComment returns Variable
	 *
	 * Constraint:
	 *     (name=ID comment=SL_COMMENT)
	 */
	protected void sequence_XVariableSLComment(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXVariableSLCommentAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getXVariableSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0(), semanticObject.getComment());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XVariantMLComment returns Variant
	 *
	 * Constraint:
	 *     (comment=ML_COMMENT expression=STRING)
	 */
	protected void sequence_XVariantMLComment(ISerializationContext context, Variant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BEXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BEXPRESSION__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXVariantMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0(), semanticObject.getComment());
		feeder.accept(grammarAccess.getXVariantMLCommentAccess().getExpressionSTRINGTerminalRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XVariant returns Variant
	 *
	 * Constraint:
	 *     (expression=STRING | (comment=ML_COMMENT expression=STRING) | (expression=STRING comment=SL_COMMENT))
	 */
	protected void sequence_XVariantMLComment_XVariantNoComment_XVariantSLComment(ISerializationContext context, Variant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XVariantNoComment returns Variant
	 *
	 * Constraint:
	 *     expression=STRING
	 */
	protected void sequence_XVariantNoComment(ISerializationContext context, Variant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BEXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BEXPRESSION__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXVariantNoCommentAccess().getExpressionSTRINGTerminalRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XVariantSLComment returns Variant
	 *
	 * Constraint:
	 *     (expression=STRING comment=SL_COMMENT)
	 */
	protected void sequence_XVariantSLComment(ISerializationContext context, Variant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BEXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BEXPRESSION__EXPRESSION));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXVariantSLCommentAccess().getExpressionSTRINGTerminalRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getXVariantSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0(), semanticObject.getComment());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XWitnessMLComment returns Witness
	 *
	 * Constraint:
	 *     (comment=ML_COMMENT name=XLABEL predicate=STRING)
	 */
	protected void sequence_XWitnessMLComment(ISerializationContext context, Witness semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BPREDICATE__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BPREDICATE__PREDICATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXWitnessMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0(), semanticObject.getComment());
		feeder.accept(grammarAccess.getXWitnessMLCommentAccess().getNameXLABELTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getXWitnessMLCommentAccess().getPredicateSTRINGTerminalRuleCall_3_0(), semanticObject.getPredicate());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XWitness returns Witness
	 *
	 * Constraint:
	 *     ((name=XLABEL predicate=STRING) | (comment=ML_COMMENT name=XLABEL predicate=STRING) | (name=XLABEL predicate=STRING comment=SL_COMMENT))
	 */
	protected void sequence_XWitnessMLComment_XWitnessNoComment_XWitnessSLComment(ISerializationContext context, Witness semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XWitnessNoComment returns Witness
	 *
	 * Constraint:
	 *     (name=XLABEL predicate=STRING)
	 */
	protected void sequence_XWitnessNoComment(ISerializationContext context, Witness semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BPREDICATE__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BPREDICATE__PREDICATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXWitnessNoCommentAccess().getNameXLABELTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getXWitnessNoCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0(), semanticObject.getPredicate());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XWitnessSLComment returns Witness
	 *
	 * Constraint:
	 *     (name=XLABEL predicate=STRING comment=SL_COMMENT)
	 */
	protected void sequence_XWitnessSLComment(ISerializationContext context, Witness semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BPREDICATE__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BPREDICATE__PREDICATE));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BCOMMENTED__COMMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXWitnessSLCommentAccess().getNameXLABELTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getXWitnessSLCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0(), semanticObject.getPredicate());
		feeder.accept(grammarAccess.getXWitnessSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_3_0(), semanticObject.getComment());
		feeder.finish();
	}
	
	
}
