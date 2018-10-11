/*
 * generated by Xtext 2.13.0
 */
package ac.soton.xeventb.xmachine.ide.contentassist.antlr;

import ac.soton.xeventb.xmachine.ide.contentassist.antlr.internal.InternalXMachineParser;
import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class XMachineParser extends AbstractContentAssistParser {

	@Inject
	private XMachineGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalXMachineParser createParser() {
		InternalXMachineParser result = new InternalXMachineParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getXEventAccess().getAlternatives_6(), "rule__XEvent__Alternatives_6");
					put(grammarAccess.getXGroupOrEventAccess().getAlternatives(), "rule__XGroupOrEvent__Alternatives");
					put(grammarAccess.getXDirectionAccess().getAlternatives(), "rule__XDirection__Alternatives");
					put(grammarAccess.getXConvergenceAccess().getAlternatives(), "rule__XConvergence__Alternatives");
					put(grammarAccess.getMachineAccess().getGroup(), "rule__Machine__Group__0");
					put(grammarAccess.getMachineAccess().getGroup_3_0(), "rule__Machine__Group_3_0__0");
					put(grammarAccess.getMachineAccess().getGroup_3_1(), "rule__Machine__Group_3_1__0");
					put(grammarAccess.getMachineAccess().getGroup_4(), "rule__Machine__Group_4__0");
					put(grammarAccess.getMachineAccess().getGroup_5(), "rule__Machine__Group_5__0");
					put(grammarAccess.getMachineAccess().getGroup_6(), "rule__Machine__Group_6__0");
					put(grammarAccess.getMachineAccess().getGroup_7(), "rule__Machine__Group_7__0");
					put(grammarAccess.getMIncludesAccess().getGroup(), "rule__MIncludes__Group__0");
					put(grammarAccess.getMIncludesAccess().getGroup_1(), "rule__MIncludes__Group_1__0");
					put(grammarAccess.getMIncludesAccess().getGroup_2(), "rule__MIncludes__Group_2__0");
					put(grammarAccess.getMIncludesAccess().getGroup_3(), "rule__MIncludes__Group_3__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getXVariableAccess().getGroup(), "rule__XVariable__Group__0");
					put(grammarAccess.getXInvariantAccess().getGroup(), "rule__XInvariant__Group__0");
					put(grammarAccess.getXVariantAccess().getGroup(), "rule__XVariant__Group__0");
					put(grammarAccess.getXGroupAccess().getGroup(), "rule__XGroup__Group__0");
					put(grammarAccess.getXGroupAccess().getGroup_3(), "rule__XGroup__Group_3__0");
					put(grammarAccess.getXGroupAccess().getGroup_3_2(), "rule__XGroup__Group_3_2__0");
					put(grammarAccess.getXGroupAccess().getGroup_4(), "rule__XGroup__Group_4__0");
					put(grammarAccess.getXFormalParameterAccess().getGroup(), "rule__XFormalParameter__Group__0");
					put(grammarAccess.getXEventAccess().getGroup(), "rule__XEvent__Group__0");
					put(grammarAccess.getXEventAccess().getGroup_5(), "rule__XEvent__Group_5__0");
					put(grammarAccess.getXEventAccess().getGroup_6_0(), "rule__XEvent__Group_6_0__0");
					put(grammarAccess.getXEventAccess().getGroup_6_0_0(), "rule__XEvent__Group_6_0_0__0");
					put(grammarAccess.getXEventAccess().getGroup_6_1(), "rule__XEvent__Group_6_1__0");
					put(grammarAccess.getXEventAccess().getGroup_6_1_2(), "rule__XEvent__Group_6_1_2__0");
					put(grammarAccess.getXEventAccess().getGroup_6_1_3(), "rule__XEvent__Group_6_1_3__0");
					put(grammarAccess.getXEventAccess().getGroup_6_2(), "rule__XEvent__Group_6_2__0");
					put(grammarAccess.getXEventAccess().getGroup_6_2_4(), "rule__XEvent__Group_6_2_4__0");
					put(grammarAccess.getXEventAccess().getGroup_6_2_5(), "rule__XEvent__Group_6_2_5__0");
					put(grammarAccess.getEventSyncAccess().getGroup(), "rule__EventSync__Group__0");
					put(grammarAccess.getEventSyncAccess().getGroup_1(), "rule__EventSync__Group_1__0");
					put(grammarAccess.getEventSyncAccess().getGroup_1_1(), "rule__EventSync__Group_1_1__0");
					put(grammarAccess.getGroupSyncAccess().getGroup(), "rule__GroupSync__Group__0");
					put(grammarAccess.getGroupSyncAccess().getGroup_1(), "rule__GroupSync__Group_1__0");
					put(grammarAccess.getGroupSyncAccess().getGroup_1_2(), "rule__GroupSync__Group_1_2__0");
					put(grammarAccess.getGroupSyncAccess().getGroup_2(), "rule__GroupSync__Group_2__0");
					put(grammarAccess.getGroupSyncAccess().getGroup_2_2(), "rule__GroupSync__Group_2_2__0");
					put(grammarAccess.getXParameterAccess().getGroup(), "rule__XParameter__Group__0");
					put(grammarAccess.getXGuardAccess().getGroup(), "rule__XGuard__Group__0");
					put(grammarAccess.getXWitnessAccess().getGroup(), "rule__XWitness__Group__0");
					put(grammarAccess.getXActionAccess().getGroup(), "rule__XAction__Group__0");
					put(grammarAccess.getMachineAccess().getNameAssignment_2(), "rule__Machine__NameAssignment_2");
					put(grammarAccess.getMachineAccess().getRefinesAssignment_3_0_1(), "rule__Machine__RefinesAssignment_3_0_1");
					put(grammarAccess.getMachineAccess().getSeesAssignment_3_1_1(), "rule__Machine__SeesAssignment_3_1_1");
					put(grammarAccess.getMachineAccess().getExtensionsAssignment_3_2(), "rule__Machine__ExtensionsAssignment_3_2");
					put(grammarAccess.getMachineAccess().getVariablesAssignment_4_1(), "rule__Machine__VariablesAssignment_4_1");
					put(grammarAccess.getMachineAccess().getInvariantsAssignment_5_1(), "rule__Machine__InvariantsAssignment_5_1");
					put(grammarAccess.getMachineAccess().getVariantAssignment_6_1(), "rule__Machine__VariantAssignment_6_1");
					put(grammarAccess.getMachineAccess().getEventsAssignment_7_1(), "rule__Machine__EventsAssignment_7_1");
					put(grammarAccess.getMachineAccess().getEventsAssignment_7_2(), "rule__Machine__EventsAssignment_7_2");
					put(grammarAccess.getMachineAccess().getExtensionsAssignment_8(), "rule__Machine__ExtensionsAssignment_8");
					put(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1(), "rule__MIncludes__AbstractMachineAssignment_1_1");
					put(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1(), "rule__MIncludes__ConcreteMachineAssignment_2_1");
					put(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1(), "rule__MIncludes__PrefixesAssignment_3_1");
					put(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2(), "rule__MIncludes__PrefixesAssignment_3_2");
					put(grammarAccess.getXVariableAccess().getNameAssignment_1(), "rule__XVariable__NameAssignment_1");
					put(grammarAccess.getXInvariantAccess().getNameAssignment_1(), "rule__XInvariant__NameAssignment_1");
					put(grammarAccess.getXInvariantAccess().getPredicateAssignment_2(), "rule__XInvariant__PredicateAssignment_2");
					put(grammarAccess.getXInvariantAccess().getTheoremAssignment_3(), "rule__XInvariant__TheoremAssignment_3");
					put(grammarAccess.getXVariantAccess().getExpressionAssignment_1(), "rule__XVariant__ExpressionAssignment_1");
					put(grammarAccess.getXGroupAccess().getNameAssignment_2(), "rule__XGroup__NameAssignment_2");
					put(grammarAccess.getXGroupAccess().getFormalParametersAssignment_3_1(), "rule__XGroup__FormalParametersAssignment_3_1");
					put(grammarAccess.getXGroupAccess().getFormalParametersAssignment_3_2_1(), "rule__XGroup__FormalParametersAssignment_3_2_1");
					put(grammarAccess.getXGroupAccess().getEventsAssignment_4_1(), "rule__XGroup__EventsAssignment_4_1");
					put(grammarAccess.getXGroupAccess().getEventsAssignment_4_2(), "rule__XGroup__EventsAssignment_4_2");
					put(grammarAccess.getXFormalParameterAccess().getDirectionAssignment_1(), "rule__XFormalParameter__DirectionAssignment_1");
					put(grammarAccess.getXFormalParameterAccess().getNameAssignment_2(), "rule__XFormalParameter__NameAssignment_2");
					put(grammarAccess.getXEventAccess().getNameAssignment_2(), "rule__XEvent__NameAssignment_2");
					put(grammarAccess.getXEventAccess().getExtendedAssignment_3_0(), "rule__XEvent__ExtendedAssignment_3_0");
					put(grammarAccess.getXEventAccess().getConvergenceAssignment_3_1(), "rule__XEvent__ConvergenceAssignment_3_1");
					put(grammarAccess.getXEventAccess().getExtensionsAssignment_4(), "rule__XEvent__ExtensionsAssignment_4");
					put(grammarAccess.getXEventAccess().getRefinesAssignment_5_1(), "rule__XEvent__RefinesAssignment_5_1");
					put(grammarAccess.getXEventAccess().getWitnessesAssignment_6_0_0_1(), "rule__XEvent__WitnessesAssignment_6_0_0_1");
					put(grammarAccess.getXEventAccess().getActionsAssignment_6_0_2(), "rule__XEvent__ActionsAssignment_6_0_2");
					put(grammarAccess.getXEventAccess().getGuardsAssignment_6_1_1(), "rule__XEvent__GuardsAssignment_6_1_1");
					put(grammarAccess.getXEventAccess().getWitnessesAssignment_6_1_2_1(), "rule__XEvent__WitnessesAssignment_6_1_2_1");
					put(grammarAccess.getXEventAccess().getActionsAssignment_6_1_3_1(), "rule__XEvent__ActionsAssignment_6_1_3_1");
					put(grammarAccess.getXEventAccess().getParametersAssignment_6_2_1(), "rule__XEvent__ParametersAssignment_6_2_1");
					put(grammarAccess.getXEventAccess().getGuardsAssignment_6_2_3(), "rule__XEvent__GuardsAssignment_6_2_3");
					put(grammarAccess.getXEventAccess().getWitnessesAssignment_6_2_4_1(), "rule__XEvent__WitnessesAssignment_6_2_4_1");
					put(grammarAccess.getXEventAccess().getActionsAssignment_6_2_5_1(), "rule__XEvent__ActionsAssignment_6_2_5_1");
					put(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0(), "rule__EventSync__PrefixAssignment_1_1_0");
					put(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2(), "rule__EventSync__SynchronisedEventAssignment_1_2");
					put(grammarAccess.getGroupSyncAccess().getPrefixAssignment_1_2_0(), "rule__GroupSync__PrefixAssignment_1_2_0");
					put(grammarAccess.getGroupSyncAccess().getSynchronisedCasesAssignment_1_3(), "rule__GroupSync__SynchronisedCasesAssignment_1_3");
					put(grammarAccess.getGroupSyncAccess().getActualParametersAssignment_2_1(), "rule__GroupSync__ActualParametersAssignment_2_1");
					put(grammarAccess.getGroupSyncAccess().getActualParametersAssignment_2_2_1(), "rule__GroupSync__ActualParametersAssignment_2_2_1");
					put(grammarAccess.getXParameterAccess().getNameAssignment_1(), "rule__XParameter__NameAssignment_1");
					put(grammarAccess.getXGuardAccess().getNameAssignment_1(), "rule__XGuard__NameAssignment_1");
					put(grammarAccess.getXGuardAccess().getPredicateAssignment_2(), "rule__XGuard__PredicateAssignment_2");
					put(grammarAccess.getXGuardAccess().getTheoremAssignment_3(), "rule__XGuard__TheoremAssignment_3");
					put(grammarAccess.getXWitnessAccess().getNameAssignment_1(), "rule__XWitness__NameAssignment_1");
					put(grammarAccess.getXWitnessAccess().getPredicateAssignment_2(), "rule__XWitness__PredicateAssignment_2");
					put(grammarAccess.getXActionAccess().getNameAssignment_1(), "rule__XAction__NameAssignment_1");
					put(grammarAccess.getXActionAccess().getActionAssignment_2(), "rule__XAction__ActionAssignment_2");
					put(grammarAccess.getMachineAccess().getUnorderedGroup_3(), "rule__Machine__UnorderedGroup_3");
					put(grammarAccess.getXEventAccess().getUnorderedGroup_3(), "rule__XEvent__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
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
}
