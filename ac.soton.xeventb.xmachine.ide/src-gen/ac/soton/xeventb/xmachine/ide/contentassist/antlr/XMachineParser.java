/*
 * generated by Xtext 2.22.0
 */
package ac.soton.xeventb.xmachine.ide.contentassist.antlr;

import ac.soton.xeventb.xmachine.ide.contentassist.antlr.internal.InternalXMachineParser;
import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class XMachineParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(XMachineGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, XMachineGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMachineAccess().getCommentAlternatives_1_0(), "rule__Machine__CommentAlternatives_1_0");
			builder.put(grammarAccess.getXEventAccess().getAlternatives_5(), "rule__XEvent__Alternatives_5");
			builder.put(grammarAccess.getXEventAccess().getAlternatives_8_0(), "rule__XEvent__Alternatives_8_0");
			builder.put(grammarAccess.getXEventAccess().getAlternatives_9_0(), "rule__XEvent__Alternatives_9_0");
			builder.put(grammarAccess.getXFormulaAccess().getAlternatives(), "rule__XFormula__Alternatives");
			builder.put(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives(), "rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives");
			builder.put(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives(), "rule__EVENTB_PREDICATE_SYMBOLS__Alternatives");
			builder.put(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives(), "rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives");
			builder.put(grammarAccess.getFieldTypeAccess().getAlternatives(), "rule__FieldType__Alternatives");
			builder.put(grammarAccess.getXConvergenceAccess().getAlternatives(), "rule__XConvergence__Alternatives");
			builder.put(grammarAccess.getMultiplicityAccess().getAlternatives(), "rule__Multiplicity__Alternatives");
			builder.put(grammarAccess.getMachineAccess().getGroup(), "rule__Machine__Group__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_4_1(), "rule__Machine__Group_4_1__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_4_2(), "rule__Machine__Group_4_2__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_5(), "rule__Machine__Group_5__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_6(), "rule__Machine__Group_6__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_7(), "rule__Machine__Group_7__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_8(), "rule__Machine__Group_8__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_9(), "rule__Machine__Group_9__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_10(), "rule__Machine__Group_10__0");
			builder.put(grammarAccess.getMContainsAccess().getGroup(), "rule__MContains__Group__0");
			builder.put(grammarAccess.getMIncludesAccess().getGroup(), "rule__MIncludes__Group__0");
			builder.put(grammarAccess.getMIncludesAccess().getGroup_1(), "rule__MIncludes__Group_1__0");
			builder.put(grammarAccess.getMIncludesAccess().getGroup_2(), "rule__MIncludes__Group_2__0");
			builder.put(grammarAccess.getMIncludesAccess().getGroup_3(), "rule__MIncludes__Group_3__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getXVariableAccess().getGroup(), "rule__XVariable__Group__0");
			builder.put(grammarAccess.getXInvariantAccess().getGroup(), "rule__XInvariant__Group__0");
			builder.put(grammarAccess.getXVariantAccess().getGroup(), "rule__XVariant__Group__0");
			builder.put(grammarAccess.getXEventAccess().getGroup(), "rule__XEvent__Group__0");
			builder.put(grammarAccess.getXEventAccess().getGroup_5_0(), "rule__XEvent__Group_5_0__0");
			builder.put(grammarAccess.getXEventAccess().getGroup_5_1(), "rule__XEvent__Group_5_1__0");
			builder.put(grammarAccess.getXEventAccess().getGroup_6(), "rule__XEvent__Group_6__0");
			builder.put(grammarAccess.getXEventAccess().getGroup_8(), "rule__XEvent__Group_8__0");
			builder.put(grammarAccess.getXEventAccess().getGroup_9(), "rule__XEvent__Group_9__0");
			builder.put(grammarAccess.getXEventAccess().getGroup_10(), "rule__XEvent__Group_10__0");
			builder.put(grammarAccess.getEventSyncAccess().getGroup(), "rule__EventSync__Group__0");
			builder.put(grammarAccess.getEventSyncAccess().getGroup_1(), "rule__EventSync__Group_1__0");
			builder.put(grammarAccess.getEventSyncAccess().getGroup_1_1(), "rule__EventSync__Group_1_1__0");
			builder.put(grammarAccess.getXParameterAccess().getGroup(), "rule__XParameter__Group__0");
			builder.put(grammarAccess.getXGuardAccess().getGroup(), "rule__XGuard__Group__0");
			builder.put(grammarAccess.getXWitnessAccess().getGroup(), "rule__XWitness__Group__0");
			builder.put(grammarAccess.getXActionAccess().getGroup(), "rule__XAction__Group__0");
			builder.put(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32(), "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0");
			builder.put(grammarAccess.getRecordAccess().getGroup(), "rule__Record__Group__0");
			builder.put(grammarAccess.getRecordAccess().getGroup_3(), "rule__Record__Group_3__0");
			builder.put(grammarAccess.getRecordAccess().getGroup_4(), "rule__Record__Group_4__0");
			builder.put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
			builder.put(grammarAccess.getMachineAccess().getCommentAssignment_1(), "rule__Machine__CommentAssignment_1");
			builder.put(grammarAccess.getMachineAccess().getNameAssignment_3(), "rule__Machine__NameAssignment_3");
			builder.put(grammarAccess.getMachineAccess().getExtensionsAssignment_4_0(), "rule__Machine__ExtensionsAssignment_4_0");
			builder.put(grammarAccess.getMachineAccess().getRefinesAssignment_4_1_1(), "rule__Machine__RefinesAssignment_4_1_1");
			builder.put(grammarAccess.getMachineAccess().getSeesAssignment_4_2_1(), "rule__Machine__SeesAssignment_4_2_1");
			builder.put(grammarAccess.getMachineAccess().getExtensionsAssignment_5_1(), "rule__Machine__ExtensionsAssignment_5_1");
			builder.put(grammarAccess.getMachineAccess().getVariablesAssignment_6_1(), "rule__Machine__VariablesAssignment_6_1");
			builder.put(grammarAccess.getMachineAccess().getExtensionsAssignment_7_1(), "rule__Machine__ExtensionsAssignment_7_1");
			builder.put(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1(), "rule__Machine__InvariantsAssignment_8_1");
			builder.put(grammarAccess.getMachineAccess().getVariantsAssignment_9_1(), "rule__Machine__VariantsAssignment_9_1");
			builder.put(grammarAccess.getMachineAccess().getEventsAssignment_10_1(), "rule__Machine__EventsAssignment_10_1");
			builder.put(grammarAccess.getMContainsAccess().getExtensionAssignment_1(), "rule__MContains__ExtensionAssignment_1");
			builder.put(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1(), "rule__MIncludes__AbstractMachineAssignment_1_1");
			builder.put(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1(), "rule__MIncludes__ConcreteMachineAssignment_2_1");
			builder.put(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1(), "rule__MIncludes__PrefixesAssignment_3_1");
			builder.put(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2(), "rule__MIncludes__PrefixesAssignment_3_2");
			builder.put(grammarAccess.getXVariableAccess().getNameAssignment_1(), "rule__XVariable__NameAssignment_1");
			builder.put(grammarAccess.getXVariableAccess().getCommentAssignment_2(), "rule__XVariable__CommentAssignment_2");
			builder.put(grammarAccess.getXInvariantAccess().getTheoremAssignment_1(), "rule__XInvariant__TheoremAssignment_1");
			builder.put(grammarAccess.getXInvariantAccess().getNameAssignment_2(), "rule__XInvariant__NameAssignment_2");
			builder.put(grammarAccess.getXInvariantAccess().getPredicateAssignment_3(), "rule__XInvariant__PredicateAssignment_3");
			builder.put(grammarAccess.getXVariantAccess().getNameAssignment_1(), "rule__XVariant__NameAssignment_1");
			builder.put(grammarAccess.getXVariantAccess().getExpressionAssignment_2(), "rule__XVariant__ExpressionAssignment_2");
			builder.put(grammarAccess.getXEventAccess().getConvergenceAssignment_1(), "rule__XEvent__ConvergenceAssignment_1");
			builder.put(grammarAccess.getXEventAccess().getNameAssignment_3(), "rule__XEvent__NameAssignment_3");
			builder.put(grammarAccess.getXEventAccess().getCommentAssignment_4(), "rule__XEvent__CommentAssignment_4");
			builder.put(grammarAccess.getXEventAccess().getRefinesAssignment_5_0_1(), "rule__XEvent__RefinesAssignment_5_0_1");
			builder.put(grammarAccess.getXEventAccess().getExtendedAssignment_5_1_0(), "rule__XEvent__ExtendedAssignment_5_1_0");
			builder.put(grammarAccess.getXEventAccess().getRefinesAssignment_5_1_1(), "rule__XEvent__RefinesAssignment_5_1_1");
			builder.put(grammarAccess.getXEventAccess().getParametersAssignment_6_1(), "rule__XEvent__ParametersAssignment_6_1");
			builder.put(grammarAccess.getXEventAccess().getExtensionsAssignment_7(), "rule__XEvent__ExtensionsAssignment_7");
			builder.put(grammarAccess.getXEventAccess().getGuardsAssignment_8_1(), "rule__XEvent__GuardsAssignment_8_1");
			builder.put(grammarAccess.getXEventAccess().getActionsAssignment_9_1(), "rule__XEvent__ActionsAssignment_9_1");
			builder.put(grammarAccess.getXEventAccess().getWitnessesAssignment_10_1(), "rule__XEvent__WitnessesAssignment_10_1");
			builder.put(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0(), "rule__EventSync__PrefixAssignment_1_1_0");
			builder.put(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2(), "rule__EventSync__SynchronisedEventAssignment_1_2");
			builder.put(grammarAccess.getXParameterAccess().getNameAssignment_1(), "rule__XParameter__NameAssignment_1");
			builder.put(grammarAccess.getXGuardAccess().getTheoremAssignment_1(), "rule__XGuard__TheoremAssignment_1");
			builder.put(grammarAccess.getXGuardAccess().getNameAssignment_2(), "rule__XGuard__NameAssignment_2");
			builder.put(grammarAccess.getXGuardAccess().getPredicateAssignment_3(), "rule__XGuard__PredicateAssignment_3");
			builder.put(grammarAccess.getXWitnessAccess().getNameAssignment_1(), "rule__XWitness__NameAssignment_1");
			builder.put(grammarAccess.getXWitnessAccess().getPredicateAssignment_2(), "rule__XWitness__PredicateAssignment_2");
			builder.put(grammarAccess.getXActionAccess().getNameAssignment_1(), "rule__XAction__NameAssignment_1");
			builder.put(grammarAccess.getXActionAccess().getActionAssignment_2(), "rule__XAction__ActionAssignment_2");
			builder.put(grammarAccess.getRecordAccess().getNameAssignment_2(), "rule__Record__NameAssignment_2");
			builder.put(grammarAccess.getRecordAccess().getSubsetsAssignment_3_1(), "rule__Record__SubsetsAssignment_3_1");
			builder.put(grammarAccess.getRecordAccess().getFieldsAssignment_4_0(), "rule__Record__FieldsAssignment_4_0");
			builder.put(grammarAccess.getRecordAccess().getFieldsAssignment_4_1(), "rule__Record__FieldsAssignment_4_1");
			builder.put(grammarAccess.getFieldAccess().getNameAssignment_0(), "rule__Field__NameAssignment_0");
			builder.put(grammarAccess.getFieldAccess().getMultiplicityAssignment_2(), "rule__Field__MultiplicityAssignment_2");
			builder.put(grammarAccess.getFieldAccess().getTypeAssignment_3(), "rule__Field__TypeAssignment_3");
			builder.put(grammarAccess.getMachineAccess().getUnorderedGroup_4(), "rule__Machine__UnorderedGroup_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private XMachineGrammarAccess grammarAccess;

	@Override
	protected InternalXMachineParser createParser() {
		InternalXMachineParser result = new InternalXMachineParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public XMachineGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XMachineGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
