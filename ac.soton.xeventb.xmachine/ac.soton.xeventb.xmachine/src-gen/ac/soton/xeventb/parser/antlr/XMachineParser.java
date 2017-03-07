/*
 * generated by Xtext
 */
package ac.soton.xeventb.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import ac.soton.xeventb.services.XMachineGrammarAccess;

public class XMachineParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private XMachineGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected ac.soton.xeventb.parser.antlr.internal.InternalXMachineParser createParser(XtextTokenStream stream) {
		return new ac.soton.xeventb.parser.antlr.internal.InternalXMachineParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Machine";
	}
	
	public XMachineGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XMachineGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
