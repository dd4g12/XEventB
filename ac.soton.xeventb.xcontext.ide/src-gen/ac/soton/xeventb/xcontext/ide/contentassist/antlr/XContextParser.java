/*
 * generated by Xtext 2.15.0
 */
package ac.soton.xeventb.xcontext.ide.contentassist.antlr;

import ac.soton.xeventb.xcontext.ide.contentassist.antlr.internal.InternalXContextParser;
import ac.soton.xeventb.xcontext.services.XContextGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class XContextParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(XContextGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, XContextGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getXContextAccess().getCommentAlternatives_1_0(), "rule__XContext__CommentAlternatives_1_0");
			builder.put(grammarAccess.getXPredicateAccess().getAlternatives(), "rule__XPredicate__Alternatives");
			builder.put(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives(), "rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives");
			builder.put(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives(), "rule__EVENTB_PREDICATE_SYMBOLS__Alternatives");
			builder.put(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives(), "rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives");
			builder.put(grammarAccess.getXContextAccess().getGroup(), "rule__XContext__Group__0");
			builder.put(grammarAccess.getXContextAccess().getGroup_4(), "rule__XContext__Group_4__0");
			builder.put(grammarAccess.getXContextAccess().getGroup_5(), "rule__XContext__Group_5__0");
			builder.put(grammarAccess.getXContextAccess().getGroup_6(), "rule__XContext__Group_6__0");
			builder.put(grammarAccess.getXContextAccess().getGroup_7(), "rule__XContext__Group_7__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getXCarrierSetAccess().getGroup(), "rule__XCarrierSet__Group__0");
			builder.put(grammarAccess.getXConstantAccess().getGroup(), "rule__XConstant__Group__0");
			builder.put(grammarAccess.getXAxiomAccess().getGroup(), "rule__XAxiom__Group__0");
			builder.put(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32(), "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0");
			builder.put(grammarAccess.getXContextAccess().getCommentAssignment_1(), "rule__XContext__CommentAssignment_1");
			builder.put(grammarAccess.getXContextAccess().getNameAssignment_3(), "rule__XContext__NameAssignment_3");
			builder.put(grammarAccess.getXContextAccess().getExtendsAssignment_4_1(), "rule__XContext__ExtendsAssignment_4_1");
			builder.put(grammarAccess.getXContextAccess().getSetsAssignment_5_1(), "rule__XContext__SetsAssignment_5_1");
			builder.put(grammarAccess.getXContextAccess().getConstantsAssignment_6_1(), "rule__XContext__ConstantsAssignment_6_1");
			builder.put(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1(), "rule__XContext__AxiomsAssignment_7_1");
			builder.put(grammarAccess.getXCarrierSetAccess().getNameAssignment_1(), "rule__XCarrierSet__NameAssignment_1");
			builder.put(grammarAccess.getXConstantAccess().getNameAssignment_1(), "rule__XConstant__NameAssignment_1");
			builder.put(grammarAccess.getXAxiomAccess().getNameAssignment_1(), "rule__XAxiom__NameAssignment_1");
			builder.put(grammarAccess.getXAxiomAccess().getPredicateAssignment_2(), "rule__XAxiom__PredicateAssignment_2");
			builder.put(grammarAccess.getXAxiomAccess().getTheoremAssignment_3(), "rule__XAxiom__TheoremAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private XContextGrammarAccess grammarAccess;

	@Override
	protected InternalXContextParser createParser() {
		InternalXContextParser result = new InternalXContextParser(null);
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

	public XContextGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XContextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
