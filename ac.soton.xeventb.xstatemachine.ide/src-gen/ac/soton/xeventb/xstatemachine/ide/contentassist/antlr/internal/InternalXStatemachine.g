/*
 * generated by Xtext 2.11.0
 */
grammar InternalXStatemachine;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package ac.soton.xeventb.xstatemachine.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package ac.soton.xeventb.xstatemachine.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ac.soton.xeventb.xstatemachine.services.XStatemachineGrammarAccess;

}
@parser::members {
	private XStatemachineGrammarAccess grammarAccess;

	public void setGrammarAccess(XStatemachineGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleStatemachine
entryRuleStatemachine
:
{ before(grammarAccess.getStatemachineRule()); }
	 ruleStatemachine
{ after(grammarAccess.getStatemachineRule()); } 
	 EOF 
;

// Rule Statemachine
ruleStatemachine 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStatemachineAccess().getGroup()); }
		(rule__Statemachine__Group__0)
		{ after(grammarAccess.getStatemachineAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statemachine__Group__0__Impl
	rule__Statemachine__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatemachineAccess().getStatemachineAction_0()); }
	()
	{ after(grammarAccess.getStatemachineAccess().getStatemachineAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statemachine__Group__1__Impl
	rule__Statemachine__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatemachineAccess().getStatemachineKeyword_1()); }
	'Statemachine'
	{ after(grammarAccess.getStatemachineAccess().getStatemachineKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statemachine__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatemachineAccess().getEndKeyword_2()); }
	'end'
	{ after(grammarAccess.getStatemachineAccess().getEndKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;