/*
 * generated by Xtext 2.14.0
 */
package ac.soton.xeventb.camillex.parser.antlr;

import ac.soton.xeventb.camillex.parser.antlr.internal.InternalEventBComponentParser;
import ac.soton.xeventb.camillex.services.EventBComponentGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class EventBComponentParser extends AbstractAntlrParser {

	@Inject
	private EventBComponentGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEventBComponentParser createParser(XtextTokenStream stream) {
		return new InternalEventBComponentParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "EventBComponent";
	}

	public EventBComponentGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EventBComponentGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
