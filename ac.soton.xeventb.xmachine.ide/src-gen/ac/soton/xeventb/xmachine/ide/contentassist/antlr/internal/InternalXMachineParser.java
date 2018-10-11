package ac.soton.xeventb.xmachine.ide.contentassist.antlr.internal;

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
import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalXMachineParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_XLABEL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'in'", "'out'", "'ordinary'", "'convergent'", "'anticipated'", "'machine'", "'end'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variant'", "'events'", "'includes'", "'to'", "'as'", "'.'", "'group'", "'('", "')'", "','", "'begin'", "'event'", "'with'", "'when'", "'then'", "'any'", "'where'", "'synchronises'", "'theorem'", "'extended'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_XLABEL=6;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalXMachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXMachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXMachineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXMachine.g"; }


    	private XMachineGrammarAccess grammarAccess;

    	public void setGrammarAccess(XMachineGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMachine"
    // InternalXMachine.g:53:1: entryRuleMachine : ruleMachine EOF ;
    public final void entryRuleMachine() throws RecognitionException {
        try {
            // InternalXMachine.g:54:1: ( ruleMachine EOF )
            // InternalXMachine.g:55:1: ruleMachine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMachine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalXMachine.g:62:1: ruleMachine : ( ( rule__Machine__Group__0 ) ) ;
    public final void ruleMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:66:2: ( ( ( rule__Machine__Group__0 ) ) )
            // InternalXMachine.g:67:2: ( ( rule__Machine__Group__0 ) )
            {
            // InternalXMachine.g:67:2: ( ( rule__Machine__Group__0 ) )
            // InternalXMachine.g:68:3: ( rule__Machine__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup()); 
            }
            // InternalXMachine.g:69:3: ( rule__Machine__Group__0 )
            // InternalXMachine.g:69:4: rule__Machine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleMIncludes"
    // InternalXMachine.g:78:1: entryRuleMIncludes : ruleMIncludes EOF ;
    public final void entryRuleMIncludes() throws RecognitionException {
        try {
            // InternalXMachine.g:79:1: ( ruleMIncludes EOF )
            // InternalXMachine.g:80:1: ruleMIncludes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMIncludes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMIncludes"


    // $ANTLR start "ruleMIncludes"
    // InternalXMachine.g:87:1: ruleMIncludes : ( ( rule__MIncludes__Group__0 ) ) ;
    public final void ruleMIncludes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:91:2: ( ( ( rule__MIncludes__Group__0 ) ) )
            // InternalXMachine.g:92:2: ( ( rule__MIncludes__Group__0 ) )
            {
            // InternalXMachine.g:92:2: ( ( rule__MIncludes__Group__0 ) )
            // InternalXMachine.g:93:3: ( rule__MIncludes__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup()); 
            }
            // InternalXMachine.g:94:3: ( rule__MIncludes__Group__0 )
            // InternalXMachine.g:94:4: rule__MIncludes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMIncludes"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalXMachine.g:103:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalXMachine.g:104:1: ( ruleQualifiedName EOF )
            // InternalXMachine.g:105:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalXMachine.g:112:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:116:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalXMachine.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalXMachine.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalXMachine.g:118:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalXMachine.g:119:3: ( rule__QualifiedName__Group__0 )
            // InternalXMachine.g:119:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleXVariable"
    // InternalXMachine.g:128:1: entryRuleXVariable : ruleXVariable EOF ;
    public final void entryRuleXVariable() throws RecognitionException {
        try {
            // InternalXMachine.g:129:1: ( ruleXVariable EOF )
            // InternalXMachine.g:130:1: ruleXVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXVariable"


    // $ANTLR start "ruleXVariable"
    // InternalXMachine.g:137:1: ruleXVariable : ( ( rule__XVariable__Group__0 ) ) ;
    public final void ruleXVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:141:2: ( ( ( rule__XVariable__Group__0 ) ) )
            // InternalXMachine.g:142:2: ( ( rule__XVariable__Group__0 ) )
            {
            // InternalXMachine.g:142:2: ( ( rule__XVariable__Group__0 ) )
            // InternalXMachine.g:143:3: ( rule__XVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariableAccess().getGroup()); 
            }
            // InternalXMachine.g:144:3: ( rule__XVariable__Group__0 )
            // InternalXMachine.g:144:4: rule__XVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXVariable"


    // $ANTLR start "entryRuleXInvariant"
    // InternalXMachine.g:153:1: entryRuleXInvariant : ruleXInvariant EOF ;
    public final void entryRuleXInvariant() throws RecognitionException {
        try {
            // InternalXMachine.g:154:1: ( ruleXInvariant EOF )
            // InternalXMachine.g:155:1: ruleXInvariant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXInvariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXInvariant"


    // $ANTLR start "ruleXInvariant"
    // InternalXMachine.g:162:1: ruleXInvariant : ( ( rule__XInvariant__Group__0 ) ) ;
    public final void ruleXInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:166:2: ( ( ( rule__XInvariant__Group__0 ) ) )
            // InternalXMachine.g:167:2: ( ( rule__XInvariant__Group__0 ) )
            {
            // InternalXMachine.g:167:2: ( ( rule__XInvariant__Group__0 ) )
            // InternalXMachine.g:168:3: ( rule__XInvariant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getGroup()); 
            }
            // InternalXMachine.g:169:3: ( rule__XInvariant__Group__0 )
            // InternalXMachine.g:169:4: rule__XInvariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXInvariant"


    // $ANTLR start "entryRuleXVariant"
    // InternalXMachine.g:178:1: entryRuleXVariant : ruleXVariant EOF ;
    public final void entryRuleXVariant() throws RecognitionException {
        try {
            // InternalXMachine.g:179:1: ( ruleXVariant EOF )
            // InternalXMachine.g:180:1: ruleXVariant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXVariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXVariant"


    // $ANTLR start "ruleXVariant"
    // InternalXMachine.g:187:1: ruleXVariant : ( ( rule__XVariant__Group__0 ) ) ;
    public final void ruleXVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:191:2: ( ( ( rule__XVariant__Group__0 ) ) )
            // InternalXMachine.g:192:2: ( ( rule__XVariant__Group__0 ) )
            {
            // InternalXMachine.g:192:2: ( ( rule__XVariant__Group__0 ) )
            // InternalXMachine.g:193:3: ( rule__XVariant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getGroup()); 
            }
            // InternalXMachine.g:194:3: ( rule__XVariant__Group__0 )
            // InternalXMachine.g:194:4: rule__XVariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXVariant"


    // $ANTLR start "entryRuleXGroup"
    // InternalXMachine.g:203:1: entryRuleXGroup : ruleXGroup EOF ;
    public final void entryRuleXGroup() throws RecognitionException {
        try {
            // InternalXMachine.g:204:1: ( ruleXGroup EOF )
            // InternalXMachine.g:205:1: ruleXGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXGroup"


    // $ANTLR start "ruleXGroup"
    // InternalXMachine.g:212:1: ruleXGroup : ( ( rule__XGroup__Group__0 ) ) ;
    public final void ruleXGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:216:2: ( ( ( rule__XGroup__Group__0 ) ) )
            // InternalXMachine.g:217:2: ( ( rule__XGroup__Group__0 ) )
            {
            // InternalXMachine.g:217:2: ( ( rule__XGroup__Group__0 ) )
            // InternalXMachine.g:218:3: ( rule__XGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getGroup()); 
            }
            // InternalXMachine.g:219:3: ( rule__XGroup__Group__0 )
            // InternalXMachine.g:219:4: rule__XGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXGroup"


    // $ANTLR start "entryRuleXFormalParameter"
    // InternalXMachine.g:228:1: entryRuleXFormalParameter : ruleXFormalParameter EOF ;
    public final void entryRuleXFormalParameter() throws RecognitionException {
        try {
            // InternalXMachine.g:229:1: ( ruleXFormalParameter EOF )
            // InternalXMachine.g:230:1: ruleXFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormalParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXFormalParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFormalParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXFormalParameter"


    // $ANTLR start "ruleXFormalParameter"
    // InternalXMachine.g:237:1: ruleXFormalParameter : ( ( rule__XFormalParameter__Group__0 ) ) ;
    public final void ruleXFormalParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:241:2: ( ( ( rule__XFormalParameter__Group__0 ) ) )
            // InternalXMachine.g:242:2: ( ( rule__XFormalParameter__Group__0 ) )
            {
            // InternalXMachine.g:242:2: ( ( rule__XFormalParameter__Group__0 ) )
            // InternalXMachine.g:243:3: ( rule__XFormalParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormalParameterAccess().getGroup()); 
            }
            // InternalXMachine.g:244:3: ( rule__XFormalParameter__Group__0 )
            // InternalXMachine.g:244:4: rule__XFormalParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XFormalParameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFormalParameterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXFormalParameter"


    // $ANTLR start "entryRuleXEvent"
    // InternalXMachine.g:253:1: entryRuleXEvent : ruleXEvent EOF ;
    public final void entryRuleXEvent() throws RecognitionException {
        try {
            // InternalXMachine.g:254:1: ( ruleXEvent EOF )
            // InternalXMachine.g:255:1: ruleXEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXEvent"


    // $ANTLR start "ruleXEvent"
    // InternalXMachine.g:262:1: ruleXEvent : ( ( rule__XEvent__Group__0 ) ) ;
    public final void ruleXEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:266:2: ( ( ( rule__XEvent__Group__0 ) ) )
            // InternalXMachine.g:267:2: ( ( rule__XEvent__Group__0 ) )
            {
            // InternalXMachine.g:267:2: ( ( rule__XEvent__Group__0 ) )
            // InternalXMachine.g:268:3: ( rule__XEvent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup()); 
            }
            // InternalXMachine.g:269:3: ( rule__XEvent__Group__0 )
            // InternalXMachine.g:269:4: rule__XEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXEvent"


    // $ANTLR start "entryRuleEventSync"
    // InternalXMachine.g:278:1: entryRuleEventSync : ruleEventSync EOF ;
    public final void entryRuleEventSync() throws RecognitionException {
        try {
            // InternalXMachine.g:279:1: ( ruleEventSync EOF )
            // InternalXMachine.g:280:1: ruleEventSync EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEventSync();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventSync"


    // $ANTLR start "ruleEventSync"
    // InternalXMachine.g:287:1: ruleEventSync : ( ( rule__EventSync__Group__0 ) ) ;
    public final void ruleEventSync() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:291:2: ( ( ( rule__EventSync__Group__0 ) ) )
            // InternalXMachine.g:292:2: ( ( rule__EventSync__Group__0 ) )
            {
            // InternalXMachine.g:292:2: ( ( rule__EventSync__Group__0 ) )
            // InternalXMachine.g:293:3: ( rule__EventSync__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup()); 
            }
            // InternalXMachine.g:294:3: ( rule__EventSync__Group__0 )
            // InternalXMachine.g:294:4: rule__EventSync__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventSync"


    // $ANTLR start "entryRuleGroupSync"
    // InternalXMachine.g:303:1: entryRuleGroupSync : ruleGroupSync EOF ;
    public final void entryRuleGroupSync() throws RecognitionException {
        try {
            // InternalXMachine.g:304:1: ( ruleGroupSync EOF )
            // InternalXMachine.g:305:1: ruleGroupSync EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGroupSync();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupSync"


    // $ANTLR start "ruleGroupSync"
    // InternalXMachine.g:312:1: ruleGroupSync : ( ( rule__GroupSync__Group__0 ) ) ;
    public final void ruleGroupSync() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:316:2: ( ( ( rule__GroupSync__Group__0 ) ) )
            // InternalXMachine.g:317:2: ( ( rule__GroupSync__Group__0 ) )
            {
            // InternalXMachine.g:317:2: ( ( rule__GroupSync__Group__0 ) )
            // InternalXMachine.g:318:3: ( rule__GroupSync__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getGroup()); 
            }
            // InternalXMachine.g:319:3: ( rule__GroupSync__Group__0 )
            // InternalXMachine.g:319:4: rule__GroupSync__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupSync"


    // $ANTLR start "entryRuleXGroupOrEvent"
    // InternalXMachine.g:328:1: entryRuleXGroupOrEvent : ruleXGroupOrEvent EOF ;
    public final void entryRuleXGroupOrEvent() throws RecognitionException {
        try {
            // InternalXMachine.g:329:1: ( ruleXGroupOrEvent EOF )
            // InternalXMachine.g:330:1: ruleXGroupOrEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupOrEventRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXGroupOrEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupOrEventRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXGroupOrEvent"


    // $ANTLR start "ruleXGroupOrEvent"
    // InternalXMachine.g:337:1: ruleXGroupOrEvent : ( ( rule__XGroupOrEvent__Alternatives ) ) ;
    public final void ruleXGroupOrEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:341:2: ( ( ( rule__XGroupOrEvent__Alternatives ) ) )
            // InternalXMachine.g:342:2: ( ( rule__XGroupOrEvent__Alternatives ) )
            {
            // InternalXMachine.g:342:2: ( ( rule__XGroupOrEvent__Alternatives ) )
            // InternalXMachine.g:343:3: ( rule__XGroupOrEvent__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupOrEventAccess().getAlternatives()); 
            }
            // InternalXMachine.g:344:3: ( rule__XGroupOrEvent__Alternatives )
            // InternalXMachine.g:344:4: rule__XGroupOrEvent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XGroupOrEvent__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupOrEventAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXGroupOrEvent"


    // $ANTLR start "entryRuleXParameter"
    // InternalXMachine.g:353:1: entryRuleXParameter : ruleXParameter EOF ;
    public final void entryRuleXParameter() throws RecognitionException {
        try {
            // InternalXMachine.g:354:1: ( ruleXParameter EOF )
            // InternalXMachine.g:355:1: ruleXParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXParameter"


    // $ANTLR start "ruleXParameter"
    // InternalXMachine.g:362:1: ruleXParameter : ( ( rule__XParameter__Group__0 ) ) ;
    public final void ruleXParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:366:2: ( ( ( rule__XParameter__Group__0 ) ) )
            // InternalXMachine.g:367:2: ( ( rule__XParameter__Group__0 ) )
            {
            // InternalXMachine.g:367:2: ( ( rule__XParameter__Group__0 ) )
            // InternalXMachine.g:368:3: ( rule__XParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getGroup()); 
            }
            // InternalXMachine.g:369:3: ( rule__XParameter__Group__0 )
            // InternalXMachine.g:369:4: rule__XParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXParameterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXParameter"


    // $ANTLR start "entryRuleXGuard"
    // InternalXMachine.g:378:1: entryRuleXGuard : ruleXGuard EOF ;
    public final void entryRuleXGuard() throws RecognitionException {
        try {
            // InternalXMachine.g:379:1: ( ruleXGuard EOF )
            // InternalXMachine.g:380:1: ruleXGuard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXGuard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXGuard"


    // $ANTLR start "ruleXGuard"
    // InternalXMachine.g:387:1: ruleXGuard : ( ( rule__XGuard__Group__0 ) ) ;
    public final void ruleXGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:391:2: ( ( ( rule__XGuard__Group__0 ) ) )
            // InternalXMachine.g:392:2: ( ( rule__XGuard__Group__0 ) )
            {
            // InternalXMachine.g:392:2: ( ( rule__XGuard__Group__0 ) )
            // InternalXMachine.g:393:3: ( rule__XGuard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getGroup()); 
            }
            // InternalXMachine.g:394:3: ( rule__XGuard__Group__0 )
            // InternalXMachine.g:394:4: rule__XGuard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXGuard"


    // $ANTLR start "entryRuleXWitness"
    // InternalXMachine.g:403:1: entryRuleXWitness : ruleXWitness EOF ;
    public final void entryRuleXWitness() throws RecognitionException {
        try {
            // InternalXMachine.g:404:1: ( ruleXWitness EOF )
            // InternalXMachine.g:405:1: ruleXWitness EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXWitness();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXWitness"


    // $ANTLR start "ruleXWitness"
    // InternalXMachine.g:412:1: ruleXWitness : ( ( rule__XWitness__Group__0 ) ) ;
    public final void ruleXWitness() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:416:2: ( ( ( rule__XWitness__Group__0 ) ) )
            // InternalXMachine.g:417:2: ( ( rule__XWitness__Group__0 ) )
            {
            // InternalXMachine.g:417:2: ( ( rule__XWitness__Group__0 ) )
            // InternalXMachine.g:418:3: ( rule__XWitness__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getGroup()); 
            }
            // InternalXMachine.g:419:3: ( rule__XWitness__Group__0 )
            // InternalXMachine.g:419:4: rule__XWitness__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXWitness"


    // $ANTLR start "entryRuleXAction"
    // InternalXMachine.g:428:1: entryRuleXAction : ruleXAction EOF ;
    public final void entryRuleXAction() throws RecognitionException {
        try {
            // InternalXMachine.g:429:1: ( ruleXAction EOF )
            // InternalXMachine.g:430:1: ruleXAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXAction"


    // $ANTLR start "ruleXAction"
    // InternalXMachine.g:437:1: ruleXAction : ( ( rule__XAction__Group__0 ) ) ;
    public final void ruleXAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:441:2: ( ( ( rule__XAction__Group__0 ) ) )
            // InternalXMachine.g:442:2: ( ( rule__XAction__Group__0 ) )
            {
            // InternalXMachine.g:442:2: ( ( rule__XAction__Group__0 ) )
            // InternalXMachine.g:443:3: ( rule__XAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getGroup()); 
            }
            // InternalXMachine.g:444:3: ( rule__XAction__Group__0 )
            // InternalXMachine.g:444:4: rule__XAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XAction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXAction"


    // $ANTLR start "entryRuleXPredicate"
    // InternalXMachine.g:453:1: entryRuleXPredicate : ruleXPredicate EOF ;
    public final void entryRuleXPredicate() throws RecognitionException {
        try {
            // InternalXMachine.g:454:1: ( ruleXPredicate EOF )
            // InternalXMachine.g:455:1: ruleXPredicate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXPredicateRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXPredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXPredicateRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXPredicate"


    // $ANTLR start "ruleXPredicate"
    // InternalXMachine.g:462:1: ruleXPredicate : ( RULE_STRING ) ;
    public final void ruleXPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:466:2: ( ( RULE_STRING ) )
            // InternalXMachine.g:467:2: ( RULE_STRING )
            {
            // InternalXMachine.g:467:2: ( RULE_STRING )
            // InternalXMachine.g:468:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXPredicateAccess().getSTRINGTerminalRuleCall()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXPredicateAccess().getSTRINGTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXPredicate"


    // $ANTLR start "ruleXDirection"
    // InternalXMachine.g:478:1: ruleXDirection : ( ( rule__XDirection__Alternatives ) ) ;
    public final void ruleXDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:482:1: ( ( ( rule__XDirection__Alternatives ) ) )
            // InternalXMachine.g:483:2: ( ( rule__XDirection__Alternatives ) )
            {
            // InternalXMachine.g:483:2: ( ( rule__XDirection__Alternatives ) )
            // InternalXMachine.g:484:3: ( rule__XDirection__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXDirectionAccess().getAlternatives()); 
            }
            // InternalXMachine.g:485:3: ( rule__XDirection__Alternatives )
            // InternalXMachine.g:485:4: rule__XDirection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XDirection__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXDirectionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXDirection"


    // $ANTLR start "ruleXConvergence"
    // InternalXMachine.g:494:1: ruleXConvergence : ( ( rule__XConvergence__Alternatives ) ) ;
    public final void ruleXConvergence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:498:1: ( ( ( rule__XConvergence__Alternatives ) ) )
            // InternalXMachine.g:499:2: ( ( rule__XConvergence__Alternatives ) )
            {
            // InternalXMachine.g:499:2: ( ( rule__XConvergence__Alternatives ) )
            // InternalXMachine.g:500:3: ( rule__XConvergence__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConvergenceAccess().getAlternatives()); 
            }
            // InternalXMachine.g:501:3: ( rule__XConvergence__Alternatives )
            // InternalXMachine.g:501:4: rule__XConvergence__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XConvergence__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXConvergenceAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXConvergence"


    // $ANTLR start "rule__XEvent__Alternatives_6"
    // InternalXMachine.g:509:1: rule__XEvent__Alternatives_6 : ( ( ( rule__XEvent__Group_6_0__0 ) ) | ( ( rule__XEvent__Group_6_1__0 ) ) | ( ( rule__XEvent__Group_6_2__0 ) ) );
    public final void rule__XEvent__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:513:1: ( ( ( rule__XEvent__Group_6_0__0 ) ) | ( ( rule__XEvent__Group_6_1__0 ) ) | ( ( rule__XEvent__Group_6_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 33:
            case 35:
                {
                alt1=1;
                }
                break;
            case 36:
                {
                alt1=2;
                }
                break;
            case 38:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalXMachine.g:514:2: ( ( rule__XEvent__Group_6_0__0 ) )
                    {
                    // InternalXMachine.g:514:2: ( ( rule__XEvent__Group_6_0__0 ) )
                    // InternalXMachine.g:515:3: ( rule__XEvent__Group_6_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_6_0()); 
                    }
                    // InternalXMachine.g:516:3: ( rule__XEvent__Group_6_0__0 )
                    // InternalXMachine.g:516:4: rule__XEvent__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getGroup_6_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:520:2: ( ( rule__XEvent__Group_6_1__0 ) )
                    {
                    // InternalXMachine.g:520:2: ( ( rule__XEvent__Group_6_1__0 ) )
                    // InternalXMachine.g:521:3: ( rule__XEvent__Group_6_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_6_1()); 
                    }
                    // InternalXMachine.g:522:3: ( rule__XEvent__Group_6_1__0 )
                    // InternalXMachine.g:522:4: rule__XEvent__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getGroup_6_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:526:2: ( ( rule__XEvent__Group_6_2__0 ) )
                    {
                    // InternalXMachine.g:526:2: ( ( rule__XEvent__Group_6_2__0 ) )
                    // InternalXMachine.g:527:3: ( rule__XEvent__Group_6_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_6_2()); 
                    }
                    // InternalXMachine.g:528:3: ( rule__XEvent__Group_6_2__0 )
                    // InternalXMachine.g:528:4: rule__XEvent__Group_6_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getGroup_6_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Alternatives_6"


    // $ANTLR start "rule__XGroupOrEvent__Alternatives"
    // InternalXMachine.g:536:1: rule__XGroupOrEvent__Alternatives : ( ( ruleGroupSync ) | ( ruleEventSync ) );
    public final void rule__XGroupOrEvent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:540:1: ( ( ruleGroupSync ) | ( ruleEventSync ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==40) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==29) ) {
                    alt2=1;
                }
                else if ( (LA2_1==RULE_ID) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXMachine.g:541:2: ( ruleGroupSync )
                    {
                    // InternalXMachine.g:541:2: ( ruleGroupSync )
                    // InternalXMachine.g:542:3: ruleGroupSync
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXGroupOrEventAccess().getGroupSyncParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGroupSync();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXGroupOrEventAccess().getGroupSyncParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:547:2: ( ruleEventSync )
                    {
                    // InternalXMachine.g:547:2: ( ruleEventSync )
                    // InternalXMachine.g:548:3: ruleEventSync
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXGroupOrEventAccess().getEventSyncParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEventSync();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXGroupOrEventAccess().getEventSyncParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupOrEvent__Alternatives"


    // $ANTLR start "rule__XDirection__Alternatives"
    // InternalXMachine.g:557:1: rule__XDirection__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );
    public final void rule__XDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:561:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXMachine.g:562:2: ( ( 'in' ) )
                    {
                    // InternalXMachine.g:562:2: ( ( 'in' ) )
                    // InternalXMachine.g:563:3: ( 'in' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXDirectionAccess().getInEnumLiteralDeclaration_0()); 
                    }
                    // InternalXMachine.g:564:3: ( 'in' )
                    // InternalXMachine.g:564:4: 'in'
                    {
                    match(input,12,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXDirectionAccess().getInEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:568:2: ( ( 'out' ) )
                    {
                    // InternalXMachine.g:568:2: ( ( 'out' ) )
                    // InternalXMachine.g:569:3: ( 'out' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXDirectionAccess().getOutEnumLiteralDeclaration_1()); 
                    }
                    // InternalXMachine.g:570:3: ( 'out' )
                    // InternalXMachine.g:570:4: 'out'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXDirectionAccess().getOutEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XDirection__Alternatives"


    // $ANTLR start "rule__XConvergence__Alternatives"
    // InternalXMachine.g:578:1: rule__XConvergence__Alternatives : ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) );
    public final void rule__XConvergence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:582:1: ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalXMachine.g:583:2: ( ( 'ordinary' ) )
                    {
                    // InternalXMachine.g:583:2: ( ( 'ordinary' ) )
                    // InternalXMachine.g:584:3: ( 'ordinary' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    }
                    // InternalXMachine.g:585:3: ( 'ordinary' )
                    // InternalXMachine.g:585:4: 'ordinary'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:589:2: ( ( 'convergent' ) )
                    {
                    // InternalXMachine.g:589:2: ( ( 'convergent' ) )
                    // InternalXMachine.g:590:3: ( 'convergent' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    }
                    // InternalXMachine.g:591:3: ( 'convergent' )
                    // InternalXMachine.g:591:4: 'convergent'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:595:2: ( ( 'anticipated' ) )
                    {
                    // InternalXMachine.g:595:2: ( ( 'anticipated' ) )
                    // InternalXMachine.g:596:3: ( 'anticipated' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    }
                    // InternalXMachine.g:597:3: ( 'anticipated' )
                    // InternalXMachine.g:597:4: 'anticipated'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConvergence__Alternatives"


    // $ANTLR start "rule__Machine__Group__0"
    // InternalXMachine.g:605:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:609:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalXMachine.g:610:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Machine__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0"


    // $ANTLR start "rule__Machine__Group__0__Impl"
    // InternalXMachine.g:617:1: rule__Machine__Group__0__Impl : ( () ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:621:1: ( ( () ) )
            // InternalXMachine.g:622:1: ( () )
            {
            // InternalXMachine.g:622:1: ( () )
            // InternalXMachine.g:623:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineAction_0()); 
            }
            // InternalXMachine.g:624:2: ()
            // InternalXMachine.g:624:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getMachineAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0__Impl"


    // $ANTLR start "rule__Machine__Group__1"
    // InternalXMachine.g:632:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:636:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalXMachine.g:637:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1"


    // $ANTLR start "rule__Machine__Group__1__Impl"
    // InternalXMachine.g:644:1: rule__Machine__Group__1__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:648:1: ( ( 'machine' ) )
            // InternalXMachine.g:649:1: ( 'machine' )
            {
            // InternalXMachine.g:649:1: ( 'machine' )
            // InternalXMachine.g:650:2: 'machine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineKeyword_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getMachineKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1__Impl"


    // $ANTLR start "rule__Machine__Group__2"
    // InternalXMachine.g:659:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:663:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalXMachine.g:664:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2"


    // $ANTLR start "rule__Machine__Group__2__Impl"
    // InternalXMachine.g:671:1: rule__Machine__Group__2__Impl : ( ( rule__Machine__NameAssignment_2 ) ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:675:1: ( ( ( rule__Machine__NameAssignment_2 ) ) )
            // InternalXMachine.g:676:1: ( ( rule__Machine__NameAssignment_2 ) )
            {
            // InternalXMachine.g:676:1: ( ( rule__Machine__NameAssignment_2 ) )
            // InternalXMachine.g:677:2: ( rule__Machine__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:678:2: ( rule__Machine__NameAssignment_2 )
            // InternalXMachine.g:678:3: rule__Machine__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Machine__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2__Impl"


    // $ANTLR start "rule__Machine__Group__3"
    // InternalXMachine.g:686:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:690:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // InternalXMachine.g:691:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Machine__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3"


    // $ANTLR start "rule__Machine__Group__3__Impl"
    // InternalXMachine.g:698:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__UnorderedGroup_3 ) ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:702:1: ( ( ( rule__Machine__UnorderedGroup_3 ) ) )
            // InternalXMachine.g:703:1: ( ( rule__Machine__UnorderedGroup_3 ) )
            {
            // InternalXMachine.g:703:1: ( ( rule__Machine__UnorderedGroup_3 ) )
            // InternalXMachine.g:704:2: ( rule__Machine__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getUnorderedGroup_3()); 
            }
            // InternalXMachine.g:705:2: ( rule__Machine__UnorderedGroup_3 )
            // InternalXMachine.g:705:3: rule__Machine__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__Machine__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getUnorderedGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3__Impl"


    // $ANTLR start "rule__Machine__Group__4"
    // InternalXMachine.g:713:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:717:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // InternalXMachine.g:718:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Machine__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__4"


    // $ANTLR start "rule__Machine__Group__4__Impl"
    // InternalXMachine.g:725:1: rule__Machine__Group__4__Impl : ( ( rule__Machine__Group_4__0 )? ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:729:1: ( ( ( rule__Machine__Group_4__0 )? ) )
            // InternalXMachine.g:730:1: ( ( rule__Machine__Group_4__0 )? )
            {
            // InternalXMachine.g:730:1: ( ( rule__Machine__Group_4__0 )? )
            // InternalXMachine.g:731:2: ( rule__Machine__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_4()); 
            }
            // InternalXMachine.g:732:2: ( rule__Machine__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXMachine.g:732:3: rule__Machine__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__4__Impl"


    // $ANTLR start "rule__Machine__Group__5"
    // InternalXMachine.g:740:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:744:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // InternalXMachine.g:745:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Machine__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__5"


    // $ANTLR start "rule__Machine__Group__5__Impl"
    // InternalXMachine.g:752:1: rule__Machine__Group__5__Impl : ( ( rule__Machine__Group_5__0 )? ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:756:1: ( ( ( rule__Machine__Group_5__0 )? ) )
            // InternalXMachine.g:757:1: ( ( rule__Machine__Group_5__0 )? )
            {
            // InternalXMachine.g:757:1: ( ( rule__Machine__Group_5__0 )? )
            // InternalXMachine.g:758:2: ( rule__Machine__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_5()); 
            }
            // InternalXMachine.g:759:2: ( rule__Machine__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:759:3: rule__Machine__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__5__Impl"


    // $ANTLR start "rule__Machine__Group__6"
    // InternalXMachine.g:767:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl rule__Machine__Group__7 ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:771:1: ( rule__Machine__Group__6__Impl rule__Machine__Group__7 )
            // InternalXMachine.g:772:2: rule__Machine__Group__6__Impl rule__Machine__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Machine__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__6"


    // $ANTLR start "rule__Machine__Group__6__Impl"
    // InternalXMachine.g:779:1: rule__Machine__Group__6__Impl : ( ( rule__Machine__Group_6__0 )? ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:783:1: ( ( ( rule__Machine__Group_6__0 )? ) )
            // InternalXMachine.g:784:1: ( ( rule__Machine__Group_6__0 )? )
            {
            // InternalXMachine.g:784:1: ( ( rule__Machine__Group_6__0 )? )
            // InternalXMachine.g:785:2: ( rule__Machine__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_6()); 
            }
            // InternalXMachine.g:786:2: ( rule__Machine__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXMachine.g:786:3: rule__Machine__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__6__Impl"


    // $ANTLR start "rule__Machine__Group__7"
    // InternalXMachine.g:794:1: rule__Machine__Group__7 : rule__Machine__Group__7__Impl rule__Machine__Group__8 ;
    public final void rule__Machine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:798:1: ( rule__Machine__Group__7__Impl rule__Machine__Group__8 )
            // InternalXMachine.g:799:2: rule__Machine__Group__7__Impl rule__Machine__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Machine__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__7"


    // $ANTLR start "rule__Machine__Group__7__Impl"
    // InternalXMachine.g:806:1: rule__Machine__Group__7__Impl : ( ( rule__Machine__Group_7__0 )? ) ;
    public final void rule__Machine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:810:1: ( ( ( rule__Machine__Group_7__0 )? ) )
            // InternalXMachine.g:811:1: ( ( rule__Machine__Group_7__0 )? )
            {
            // InternalXMachine.g:811:1: ( ( rule__Machine__Group_7__0 )? )
            // InternalXMachine.g:812:2: ( rule__Machine__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_7()); 
            }
            // InternalXMachine.g:813:2: ( rule__Machine__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:813:3: rule__Machine__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__7__Impl"


    // $ANTLR start "rule__Machine__Group__8"
    // InternalXMachine.g:821:1: rule__Machine__Group__8 : rule__Machine__Group__8__Impl rule__Machine__Group__9 ;
    public final void rule__Machine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:825:1: ( rule__Machine__Group__8__Impl rule__Machine__Group__9 )
            // InternalXMachine.g:826:2: rule__Machine__Group__8__Impl rule__Machine__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Machine__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__8"


    // $ANTLR start "rule__Machine__Group__8__Impl"
    // InternalXMachine.g:833:1: rule__Machine__Group__8__Impl : ( ( rule__Machine__ExtensionsAssignment_8 )* ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:837:1: ( ( ( rule__Machine__ExtensionsAssignment_8 )* ) )
            // InternalXMachine.g:838:1: ( ( rule__Machine__ExtensionsAssignment_8 )* )
            {
            // InternalXMachine.g:838:1: ( ( rule__Machine__ExtensionsAssignment_8 )* )
            // InternalXMachine.g:839:2: ( rule__Machine__ExtensionsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getExtensionsAssignment_8()); 
            }
            // InternalXMachine.g:840:2: ( rule__Machine__ExtensionsAssignment_8 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXMachine.g:840:3: rule__Machine__ExtensionsAssignment_8
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Machine__ExtensionsAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getExtensionsAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__8__Impl"


    // $ANTLR start "rule__Machine__Group__9"
    // InternalXMachine.g:848:1: rule__Machine__Group__9 : rule__Machine__Group__9__Impl ;
    public final void rule__Machine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:852:1: ( rule__Machine__Group__9__Impl )
            // InternalXMachine.g:853:2: rule__Machine__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__9"


    // $ANTLR start "rule__Machine__Group__9__Impl"
    // InternalXMachine.g:859:1: rule__Machine__Group__9__Impl : ( 'end' ) ;
    public final void rule__Machine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:863:1: ( ( 'end' ) )
            // InternalXMachine.g:864:1: ( 'end' )
            {
            // InternalXMachine.g:864:1: ( 'end' )
            // InternalXMachine.g:865:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEndKeyword_9()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEndKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__9__Impl"


    // $ANTLR start "rule__Machine__Group_3_0__0"
    // InternalXMachine.g:875:1: rule__Machine__Group_3_0__0 : rule__Machine__Group_3_0__0__Impl rule__Machine__Group_3_0__1 ;
    public final void rule__Machine__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:879:1: ( rule__Machine__Group_3_0__0__Impl rule__Machine__Group_3_0__1 )
            // InternalXMachine.g:880:2: rule__Machine__Group_3_0__0__Impl rule__Machine__Group_3_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_3_0__0"


    // $ANTLR start "rule__Machine__Group_3_0__0__Impl"
    // InternalXMachine.g:887:1: rule__Machine__Group_3_0__0__Impl : ( 'refines' ) ;
    public final void rule__Machine__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:891:1: ( ( 'refines' ) )
            // InternalXMachine.g:892:1: ( 'refines' )
            {
            // InternalXMachine.g:892:1: ( 'refines' )
            // InternalXMachine.g:893:2: 'refines'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesKeyword_3_0_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getRefinesKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_3_0__0__Impl"


    // $ANTLR start "rule__Machine__Group_3_0__1"
    // InternalXMachine.g:902:1: rule__Machine__Group_3_0__1 : rule__Machine__Group_3_0__1__Impl ;
    public final void rule__Machine__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:906:1: ( rule__Machine__Group_3_0__1__Impl )
            // InternalXMachine.g:907:2: rule__Machine__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_3_0__1"


    // $ANTLR start "rule__Machine__Group_3_0__1__Impl"
    // InternalXMachine.g:913:1: rule__Machine__Group_3_0__1__Impl : ( ( rule__Machine__RefinesAssignment_3_0_1 ) ) ;
    public final void rule__Machine__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:917:1: ( ( ( rule__Machine__RefinesAssignment_3_0_1 ) ) )
            // InternalXMachine.g:918:1: ( ( rule__Machine__RefinesAssignment_3_0_1 ) )
            {
            // InternalXMachine.g:918:1: ( ( rule__Machine__RefinesAssignment_3_0_1 ) )
            // InternalXMachine.g:919:2: ( rule__Machine__RefinesAssignment_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesAssignment_3_0_1()); 
            }
            // InternalXMachine.g:920:2: ( rule__Machine__RefinesAssignment_3_0_1 )
            // InternalXMachine.g:920:3: rule__Machine__RefinesAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__RefinesAssignment_3_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getRefinesAssignment_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_3_0__1__Impl"


    // $ANTLR start "rule__Machine__Group_3_1__0"
    // InternalXMachine.g:929:1: rule__Machine__Group_3_1__0 : rule__Machine__Group_3_1__0__Impl rule__Machine__Group_3_1__1 ;
    public final void rule__Machine__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:933:1: ( rule__Machine__Group_3_1__0__Impl rule__Machine__Group_3_1__1 )
            // InternalXMachine.g:934:2: rule__Machine__Group_3_1__0__Impl rule__Machine__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_3_1__0"


    // $ANTLR start "rule__Machine__Group_3_1__0__Impl"
    // InternalXMachine.g:941:1: rule__Machine__Group_3_1__0__Impl : ( 'sees' ) ;
    public final void rule__Machine__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:945:1: ( ( 'sees' ) )
            // InternalXMachine.g:946:1: ( 'sees' )
            {
            // InternalXMachine.g:946:1: ( 'sees' )
            // InternalXMachine.g:947:2: 'sees'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesKeyword_3_1_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getSeesKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_3_1__0__Impl"


    // $ANTLR start "rule__Machine__Group_3_1__1"
    // InternalXMachine.g:956:1: rule__Machine__Group_3_1__1 : rule__Machine__Group_3_1__1__Impl ;
    public final void rule__Machine__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:960:1: ( rule__Machine__Group_3_1__1__Impl )
            // InternalXMachine.g:961:2: rule__Machine__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_3_1__1"


    // $ANTLR start "rule__Machine__Group_3_1__1__Impl"
    // InternalXMachine.g:967:1: rule__Machine__Group_3_1__1__Impl : ( ( ( rule__Machine__SeesAssignment_3_1_1 ) ) ( ( rule__Machine__SeesAssignment_3_1_1 )* ) ) ;
    public final void rule__Machine__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:971:1: ( ( ( ( rule__Machine__SeesAssignment_3_1_1 ) ) ( ( rule__Machine__SeesAssignment_3_1_1 )* ) ) )
            // InternalXMachine.g:972:1: ( ( ( rule__Machine__SeesAssignment_3_1_1 ) ) ( ( rule__Machine__SeesAssignment_3_1_1 )* ) )
            {
            // InternalXMachine.g:972:1: ( ( ( rule__Machine__SeesAssignment_3_1_1 ) ) ( ( rule__Machine__SeesAssignment_3_1_1 )* ) )
            // InternalXMachine.g:973:2: ( ( rule__Machine__SeesAssignment_3_1_1 ) ) ( ( rule__Machine__SeesAssignment_3_1_1 )* )
            {
            // InternalXMachine.g:973:2: ( ( rule__Machine__SeesAssignment_3_1_1 ) )
            // InternalXMachine.g:974:3: ( rule__Machine__SeesAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesAssignment_3_1_1()); 
            }
            // InternalXMachine.g:975:3: ( rule__Machine__SeesAssignment_3_1_1 )
            // InternalXMachine.g:975:4: rule__Machine__SeesAssignment_3_1_1
            {
            pushFollow(FOLLOW_8);
            rule__Machine__SeesAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getSeesAssignment_3_1_1()); 
            }

            }

            // InternalXMachine.g:978:2: ( ( rule__Machine__SeesAssignment_3_1_1 )* )
            // InternalXMachine.g:979:3: ( rule__Machine__SeesAssignment_3_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesAssignment_3_1_1()); 
            }
            // InternalXMachine.g:980:3: ( rule__Machine__SeesAssignment_3_1_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXMachine.g:980:4: rule__Machine__SeesAssignment_3_1_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__SeesAssignment_3_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getSeesAssignment_3_1_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_3_1__1__Impl"


    // $ANTLR start "rule__Machine__Group_4__0"
    // InternalXMachine.g:990:1: rule__Machine__Group_4__0 : rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1 ;
    public final void rule__Machine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:994:1: ( rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1 )
            // InternalXMachine.g:995:2: rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4__0"


    // $ANTLR start "rule__Machine__Group_4__0__Impl"
    // InternalXMachine.g:1002:1: rule__Machine__Group_4__0__Impl : ( 'variables' ) ;
    public final void rule__Machine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1006:1: ( ( 'variables' ) )
            // InternalXMachine.g:1007:1: ( 'variables' )
            {
            // InternalXMachine.g:1007:1: ( 'variables' )
            // InternalXMachine.g:1008:2: 'variables'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesKeyword_4_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariablesKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4__0__Impl"


    // $ANTLR start "rule__Machine__Group_4__1"
    // InternalXMachine.g:1017:1: rule__Machine__Group_4__1 : rule__Machine__Group_4__1__Impl ;
    public final void rule__Machine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1021:1: ( rule__Machine__Group_4__1__Impl )
            // InternalXMachine.g:1022:2: rule__Machine__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4__1"


    // $ANTLR start "rule__Machine__Group_4__1__Impl"
    // InternalXMachine.g:1028:1: rule__Machine__Group_4__1__Impl : ( ( ( rule__Machine__VariablesAssignment_4_1 ) ) ( ( rule__Machine__VariablesAssignment_4_1 )* ) ) ;
    public final void rule__Machine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1032:1: ( ( ( ( rule__Machine__VariablesAssignment_4_1 ) ) ( ( rule__Machine__VariablesAssignment_4_1 )* ) ) )
            // InternalXMachine.g:1033:1: ( ( ( rule__Machine__VariablesAssignment_4_1 ) ) ( ( rule__Machine__VariablesAssignment_4_1 )* ) )
            {
            // InternalXMachine.g:1033:1: ( ( ( rule__Machine__VariablesAssignment_4_1 ) ) ( ( rule__Machine__VariablesAssignment_4_1 )* ) )
            // InternalXMachine.g:1034:2: ( ( rule__Machine__VariablesAssignment_4_1 ) ) ( ( rule__Machine__VariablesAssignment_4_1 )* )
            {
            // InternalXMachine.g:1034:2: ( ( rule__Machine__VariablesAssignment_4_1 ) )
            // InternalXMachine.g:1035:3: ( rule__Machine__VariablesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesAssignment_4_1()); 
            }
            // InternalXMachine.g:1036:3: ( rule__Machine__VariablesAssignment_4_1 )
            // InternalXMachine.g:1036:4: rule__Machine__VariablesAssignment_4_1
            {
            pushFollow(FOLLOW_8);
            rule__Machine__VariablesAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariablesAssignment_4_1()); 
            }

            }

            // InternalXMachine.g:1039:2: ( ( rule__Machine__VariablesAssignment_4_1 )* )
            // InternalXMachine.g:1040:3: ( rule__Machine__VariablesAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesAssignment_4_1()); 
            }
            // InternalXMachine.g:1041:3: ( rule__Machine__VariablesAssignment_4_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXMachine.g:1041:4: rule__Machine__VariablesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__VariablesAssignment_4_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariablesAssignment_4_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4__1__Impl"


    // $ANTLR start "rule__Machine__Group_5__0"
    // InternalXMachine.g:1051:1: rule__Machine__Group_5__0 : rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 ;
    public final void rule__Machine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1055:1: ( rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 )
            // InternalXMachine.g:1056:2: rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Machine__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__0"


    // $ANTLR start "rule__Machine__Group_5__0__Impl"
    // InternalXMachine.g:1063:1: rule__Machine__Group_5__0__Impl : ( 'invariants' ) ;
    public final void rule__Machine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1067:1: ( ( 'invariants' ) )
            // InternalXMachine.g:1068:1: ( 'invariants' )
            {
            // InternalXMachine.g:1068:1: ( 'invariants' )
            // InternalXMachine.g:1069:2: 'invariants'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsKeyword_5_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInvariantsKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__0__Impl"


    // $ANTLR start "rule__Machine__Group_5__1"
    // InternalXMachine.g:1078:1: rule__Machine__Group_5__1 : rule__Machine__Group_5__1__Impl ;
    public final void rule__Machine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1082:1: ( rule__Machine__Group_5__1__Impl )
            // InternalXMachine.g:1083:2: rule__Machine__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__1"


    // $ANTLR start "rule__Machine__Group_5__1__Impl"
    // InternalXMachine.g:1089:1: rule__Machine__Group_5__1__Impl : ( ( ( rule__Machine__InvariantsAssignment_5_1 ) ) ( ( rule__Machine__InvariantsAssignment_5_1 )* ) ) ;
    public final void rule__Machine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1093:1: ( ( ( ( rule__Machine__InvariantsAssignment_5_1 ) ) ( ( rule__Machine__InvariantsAssignment_5_1 )* ) ) )
            // InternalXMachine.g:1094:1: ( ( ( rule__Machine__InvariantsAssignment_5_1 ) ) ( ( rule__Machine__InvariantsAssignment_5_1 )* ) )
            {
            // InternalXMachine.g:1094:1: ( ( ( rule__Machine__InvariantsAssignment_5_1 ) ) ( ( rule__Machine__InvariantsAssignment_5_1 )* ) )
            // InternalXMachine.g:1095:2: ( ( rule__Machine__InvariantsAssignment_5_1 ) ) ( ( rule__Machine__InvariantsAssignment_5_1 )* )
            {
            // InternalXMachine.g:1095:2: ( ( rule__Machine__InvariantsAssignment_5_1 ) )
            // InternalXMachine.g:1096:3: ( rule__Machine__InvariantsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsAssignment_5_1()); 
            }
            // InternalXMachine.g:1097:3: ( rule__Machine__InvariantsAssignment_5_1 )
            // InternalXMachine.g:1097:4: rule__Machine__InvariantsAssignment_5_1
            {
            pushFollow(FOLLOW_10);
            rule__Machine__InvariantsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInvariantsAssignment_5_1()); 
            }

            }

            // InternalXMachine.g:1100:2: ( ( rule__Machine__InvariantsAssignment_5_1 )* )
            // InternalXMachine.g:1101:3: ( rule__Machine__InvariantsAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsAssignment_5_1()); 
            }
            // InternalXMachine.g:1102:3: ( rule__Machine__InvariantsAssignment_5_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_XLABEL) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXMachine.g:1102:4: rule__Machine__InvariantsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Machine__InvariantsAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInvariantsAssignment_5_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__1__Impl"


    // $ANTLR start "rule__Machine__Group_6__0"
    // InternalXMachine.g:1112:1: rule__Machine__Group_6__0 : rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 ;
    public final void rule__Machine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1116:1: ( rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 )
            // InternalXMachine.g:1117:2: rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Machine__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__0"


    // $ANTLR start "rule__Machine__Group_6__0__Impl"
    // InternalXMachine.g:1124:1: rule__Machine__Group_6__0__Impl : ( 'variant' ) ;
    public final void rule__Machine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1128:1: ( ( 'variant' ) )
            // InternalXMachine.g:1129:1: ( 'variant' )
            {
            // InternalXMachine.g:1129:1: ( 'variant' )
            // InternalXMachine.g:1130:2: 'variant'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariantKeyword_6_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariantKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__0__Impl"


    // $ANTLR start "rule__Machine__Group_6__1"
    // InternalXMachine.g:1139:1: rule__Machine__Group_6__1 : rule__Machine__Group_6__1__Impl ;
    public final void rule__Machine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1143:1: ( rule__Machine__Group_6__1__Impl )
            // InternalXMachine.g:1144:2: rule__Machine__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__1"


    // $ANTLR start "rule__Machine__Group_6__1__Impl"
    // InternalXMachine.g:1150:1: rule__Machine__Group_6__1__Impl : ( ( rule__Machine__VariantAssignment_6_1 ) ) ;
    public final void rule__Machine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1154:1: ( ( ( rule__Machine__VariantAssignment_6_1 ) ) )
            // InternalXMachine.g:1155:1: ( ( rule__Machine__VariantAssignment_6_1 ) )
            {
            // InternalXMachine.g:1155:1: ( ( rule__Machine__VariantAssignment_6_1 ) )
            // InternalXMachine.g:1156:2: ( rule__Machine__VariantAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariantAssignment_6_1()); 
            }
            // InternalXMachine.g:1157:2: ( rule__Machine__VariantAssignment_6_1 )
            // InternalXMachine.g:1157:3: rule__Machine__VariantAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__VariantAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariantAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__1__Impl"


    // $ANTLR start "rule__Machine__Group_7__0"
    // InternalXMachine.g:1166:1: rule__Machine__Group_7__0 : rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 ;
    public final void rule__Machine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1170:1: ( rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 )
            // InternalXMachine.g:1171:2: rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__Machine__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__0"


    // $ANTLR start "rule__Machine__Group_7__0__Impl"
    // InternalXMachine.g:1178:1: rule__Machine__Group_7__0__Impl : ( 'events' ) ;
    public final void rule__Machine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1182:1: ( ( 'events' ) )
            // InternalXMachine.g:1183:1: ( 'events' )
            {
            // InternalXMachine.g:1183:1: ( 'events' )
            // InternalXMachine.g:1184:2: 'events'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsKeyword_7_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEventsKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__0__Impl"


    // $ANTLR start "rule__Machine__Group_7__1"
    // InternalXMachine.g:1193:1: rule__Machine__Group_7__1 : rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2 ;
    public final void rule__Machine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1197:1: ( rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2 )
            // InternalXMachine.g:1198:2: rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__Machine__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__1"


    // $ANTLR start "rule__Machine__Group_7__1__Impl"
    // InternalXMachine.g:1205:1: rule__Machine__Group_7__1__Impl : ( ( rule__Machine__EventsAssignment_7_1 ) ) ;
    public final void rule__Machine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1209:1: ( ( ( rule__Machine__EventsAssignment_7_1 ) ) )
            // InternalXMachine.g:1210:1: ( ( rule__Machine__EventsAssignment_7_1 ) )
            {
            // InternalXMachine.g:1210:1: ( ( rule__Machine__EventsAssignment_7_1 ) )
            // InternalXMachine.g:1211:2: ( rule__Machine__EventsAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsAssignment_7_1()); 
            }
            // InternalXMachine.g:1212:2: ( rule__Machine__EventsAssignment_7_1 )
            // InternalXMachine.g:1212:3: rule__Machine__EventsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__EventsAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEventsAssignment_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__1__Impl"


    // $ANTLR start "rule__Machine__Group_7__2"
    // InternalXMachine.g:1220:1: rule__Machine__Group_7__2 : rule__Machine__Group_7__2__Impl ;
    public final void rule__Machine__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1224:1: ( rule__Machine__Group_7__2__Impl )
            // InternalXMachine.g:1225:2: rule__Machine__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__2"


    // $ANTLR start "rule__Machine__Group_7__2__Impl"
    // InternalXMachine.g:1231:1: rule__Machine__Group_7__2__Impl : ( ( rule__Machine__EventsAssignment_7_2 )* ) ;
    public final void rule__Machine__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1235:1: ( ( ( rule__Machine__EventsAssignment_7_2 )* ) )
            // InternalXMachine.g:1236:1: ( ( rule__Machine__EventsAssignment_7_2 )* )
            {
            // InternalXMachine.g:1236:1: ( ( rule__Machine__EventsAssignment_7_2 )* )
            // InternalXMachine.g:1237:2: ( rule__Machine__EventsAssignment_7_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsAssignment_7_2()); 
            }
            // InternalXMachine.g:1238:2: ( rule__Machine__EventsAssignment_7_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXMachine.g:1238:3: rule__Machine__EventsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Machine__EventsAssignment_7_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEventsAssignment_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__2__Impl"


    // $ANTLR start "rule__MIncludes__Group__0"
    // InternalXMachine.g:1247:1: rule__MIncludes__Group__0 : rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 ;
    public final void rule__MIncludes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1251:1: ( rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 )
            // InternalXMachine.g:1252:2: rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MIncludes__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__0"


    // $ANTLR start "rule__MIncludes__Group__0__Impl"
    // InternalXMachine.g:1259:1: rule__MIncludes__Group__0__Impl : ( () ) ;
    public final void rule__MIncludes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1263:1: ( ( () ) )
            // InternalXMachine.g:1264:1: ( () )
            {
            // InternalXMachine.g:1264:1: ( () )
            // InternalXMachine.g:1265:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 
            }
            // InternalXMachine.g:1266:2: ()
            // InternalXMachine.g:1266:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__0__Impl"


    // $ANTLR start "rule__MIncludes__Group__1"
    // InternalXMachine.g:1274:1: rule__MIncludes__Group__1 : rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 ;
    public final void rule__MIncludes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1278:1: ( rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 )
            // InternalXMachine.g:1279:2: rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__MIncludes__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__1"


    // $ANTLR start "rule__MIncludes__Group__1__Impl"
    // InternalXMachine.g:1286:1: rule__MIncludes__Group__1__Impl : ( ( rule__MIncludes__Group_1__0 ) ) ;
    public final void rule__MIncludes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1290:1: ( ( ( rule__MIncludes__Group_1__0 ) ) )
            // InternalXMachine.g:1291:1: ( ( rule__MIncludes__Group_1__0 ) )
            {
            // InternalXMachine.g:1291:1: ( ( rule__MIncludes__Group_1__0 ) )
            // InternalXMachine.g:1292:2: ( rule__MIncludes__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_1()); 
            }
            // InternalXMachine.g:1293:2: ( rule__MIncludes__Group_1__0 )
            // InternalXMachine.g:1293:3: rule__MIncludes__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__1__Impl"


    // $ANTLR start "rule__MIncludes__Group__2"
    // InternalXMachine.g:1301:1: rule__MIncludes__Group__2 : rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 ;
    public final void rule__MIncludes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1305:1: ( rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 )
            // InternalXMachine.g:1306:2: rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__MIncludes__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__2"


    // $ANTLR start "rule__MIncludes__Group__2__Impl"
    // InternalXMachine.g:1313:1: rule__MIncludes__Group__2__Impl : ( ( rule__MIncludes__Group_2__0 )? ) ;
    public final void rule__MIncludes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1317:1: ( ( ( rule__MIncludes__Group_2__0 )? ) )
            // InternalXMachine.g:1318:1: ( ( rule__MIncludes__Group_2__0 )? )
            {
            // InternalXMachine.g:1318:1: ( ( rule__MIncludes__Group_2__0 )? )
            // InternalXMachine.g:1319:2: ( rule__MIncludes__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_2()); 
            }
            // InternalXMachine.g:1320:2: ( rule__MIncludes__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMachine.g:1320:3: rule__MIncludes__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MIncludes__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__2__Impl"


    // $ANTLR start "rule__MIncludes__Group__3"
    // InternalXMachine.g:1328:1: rule__MIncludes__Group__3 : rule__MIncludes__Group__3__Impl ;
    public final void rule__MIncludes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1332:1: ( rule__MIncludes__Group__3__Impl )
            // InternalXMachine.g:1333:2: rule__MIncludes__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__3"


    // $ANTLR start "rule__MIncludes__Group__3__Impl"
    // InternalXMachine.g:1339:1: rule__MIncludes__Group__3__Impl : ( ( rule__MIncludes__Group_3__0 )? ) ;
    public final void rule__MIncludes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1343:1: ( ( ( rule__MIncludes__Group_3__0 )? ) )
            // InternalXMachine.g:1344:1: ( ( rule__MIncludes__Group_3__0 )? )
            {
            // InternalXMachine.g:1344:1: ( ( rule__MIncludes__Group_3__0 )? )
            // InternalXMachine.g:1345:2: ( rule__MIncludes__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_3()); 
            }
            // InternalXMachine.g:1346:2: ( rule__MIncludes__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXMachine.g:1346:3: rule__MIncludes__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MIncludes__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__3__Impl"


    // $ANTLR start "rule__MIncludes__Group_1__0"
    // InternalXMachine.g:1355:1: rule__MIncludes__Group_1__0 : rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 ;
    public final void rule__MIncludes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1359:1: ( rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 )
            // InternalXMachine.g:1360:2: rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__MIncludes__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_1__0"


    // $ANTLR start "rule__MIncludes__Group_1__0__Impl"
    // InternalXMachine.g:1367:1: rule__MIncludes__Group_1__0__Impl : ( 'includes' ) ;
    public final void rule__MIncludes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1371:1: ( ( 'includes' ) )
            // InternalXMachine.g:1372:1: ( 'includes' )
            {
            // InternalXMachine.g:1372:1: ( 'includes' )
            // InternalXMachine.g:1373:2: 'includes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_1__0__Impl"


    // $ANTLR start "rule__MIncludes__Group_1__1"
    // InternalXMachine.g:1382:1: rule__MIncludes__Group_1__1 : rule__MIncludes__Group_1__1__Impl ;
    public final void rule__MIncludes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1386:1: ( rule__MIncludes__Group_1__1__Impl )
            // InternalXMachine.g:1387:2: rule__MIncludes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_1__1"


    // $ANTLR start "rule__MIncludes__Group_1__1__Impl"
    // InternalXMachine.g:1393:1: rule__MIncludes__Group_1__1__Impl : ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) ;
    public final void rule__MIncludes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1397:1: ( ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) )
            // InternalXMachine.g:1398:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            {
            // InternalXMachine.g:1398:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            // InternalXMachine.g:1399:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 
            }
            // InternalXMachine.g:1400:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            // InternalXMachine.g:1400:3: rule__MIncludes__AbstractMachineAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__AbstractMachineAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_1__1__Impl"


    // $ANTLR start "rule__MIncludes__Group_2__0"
    // InternalXMachine.g:1409:1: rule__MIncludes__Group_2__0 : rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 ;
    public final void rule__MIncludes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1413:1: ( rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 )
            // InternalXMachine.g:1414:2: rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__MIncludes__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_2__0"


    // $ANTLR start "rule__MIncludes__Group_2__0__Impl"
    // InternalXMachine.g:1421:1: rule__MIncludes__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__MIncludes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1425:1: ( ( 'to' ) )
            // InternalXMachine.g:1426:1: ( 'to' )
            {
            // InternalXMachine.g:1426:1: ( 'to' )
            // InternalXMachine.g:1427:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getToKeyword_2_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getToKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_2__0__Impl"


    // $ANTLR start "rule__MIncludes__Group_2__1"
    // InternalXMachine.g:1436:1: rule__MIncludes__Group_2__1 : rule__MIncludes__Group_2__1__Impl ;
    public final void rule__MIncludes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1440:1: ( rule__MIncludes__Group_2__1__Impl )
            // InternalXMachine.g:1441:2: rule__MIncludes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_2__1"


    // $ANTLR start "rule__MIncludes__Group_2__1__Impl"
    // InternalXMachine.g:1447:1: rule__MIncludes__Group_2__1__Impl : ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) ;
    public final void rule__MIncludes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1451:1: ( ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) )
            // InternalXMachine.g:1452:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            {
            // InternalXMachine.g:1452:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            // InternalXMachine.g:1453:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 
            }
            // InternalXMachine.g:1454:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            // InternalXMachine.g:1454:3: rule__MIncludes__ConcreteMachineAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__ConcreteMachineAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_2__1__Impl"


    // $ANTLR start "rule__MIncludes__Group_3__0"
    // InternalXMachine.g:1463:1: rule__MIncludes__Group_3__0 : rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 ;
    public final void rule__MIncludes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1467:1: ( rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 )
            // InternalXMachine.g:1468:2: rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__MIncludes__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_3__0"


    // $ANTLR start "rule__MIncludes__Group_3__0__Impl"
    // InternalXMachine.g:1475:1: rule__MIncludes__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__MIncludes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1479:1: ( ( 'as' ) )
            // InternalXMachine.g:1480:1: ( 'as' )
            {
            // InternalXMachine.g:1480:1: ( 'as' )
            // InternalXMachine.g:1481:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAsKeyword_3_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getAsKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_3__0__Impl"


    // $ANTLR start "rule__MIncludes__Group_3__1"
    // InternalXMachine.g:1490:1: rule__MIncludes__Group_3__1 : rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 ;
    public final void rule__MIncludes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1494:1: ( rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 )
            // InternalXMachine.g:1495:2: rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2
            {
            pushFollow(FOLLOW_4);
            rule__MIncludes__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_3__1"


    // $ANTLR start "rule__MIncludes__Group_3__1__Impl"
    // InternalXMachine.g:1502:1: rule__MIncludes__Group_3__1__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) ;
    public final void rule__MIncludes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1506:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) )
            // InternalXMachine.g:1507:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            {
            // InternalXMachine.g:1507:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            // InternalXMachine.g:1508:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 
            }
            // InternalXMachine.g:1509:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            // InternalXMachine.g:1509:3: rule__MIncludes__PrefixesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__PrefixesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_3__1__Impl"


    // $ANTLR start "rule__MIncludes__Group_3__2"
    // InternalXMachine.g:1517:1: rule__MIncludes__Group_3__2 : rule__MIncludes__Group_3__2__Impl ;
    public final void rule__MIncludes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1521:1: ( rule__MIncludes__Group_3__2__Impl )
            // InternalXMachine.g:1522:2: rule__MIncludes__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_3__2"


    // $ANTLR start "rule__MIncludes__Group_3__2__Impl"
    // InternalXMachine.g:1528:1: rule__MIncludes__Group_3__2__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) ;
    public final void rule__MIncludes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1532:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) )
            // InternalXMachine.g:1533:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            {
            // InternalXMachine.g:1533:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            // InternalXMachine.g:1534:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 
            }
            // InternalXMachine.g:1535:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalXMachine.g:1535:3: rule__MIncludes__PrefixesAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MIncludes__PrefixesAssignment_3_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_3__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalXMachine.g:1544:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1548:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXMachine.g:1549:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalXMachine.g:1556:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1560:1: ( ( RULE_ID ) )
            // InternalXMachine.g:1561:1: ( RULE_ID )
            {
            // InternalXMachine.g:1561:1: ( RULE_ID )
            // InternalXMachine.g:1562:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalXMachine.g:1571:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1575:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXMachine.g:1576:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalXMachine.g:1582:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )? ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1586:1: ( ( ( rule__QualifiedName__Group_1__0 )? ) )
            // InternalXMachine.g:1587:1: ( ( rule__QualifiedName__Group_1__0 )? )
            {
            // InternalXMachine.g:1587:1: ( ( rule__QualifiedName__Group_1__0 )? )
            // InternalXMachine.g:1588:2: ( rule__QualifiedName__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalXMachine.g:1589:2: ( rule__QualifiedName__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:1589:3: rule__QualifiedName__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedName__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalXMachine.g:1598:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1602:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXMachine.g:1603:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalXMachine.g:1610:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1614:1: ( ( '.' ) )
            // InternalXMachine.g:1615:1: ( '.' )
            {
            // InternalXMachine.g:1615:1: ( '.' )
            // InternalXMachine.g:1616:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalXMachine.g:1625:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1629:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXMachine.g:1630:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalXMachine.g:1636:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1640:1: ( ( RULE_ID ) )
            // InternalXMachine.g:1641:1: ( RULE_ID )
            {
            // InternalXMachine.g:1641:1: ( RULE_ID )
            // InternalXMachine.g:1642:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__XVariable__Group__0"
    // InternalXMachine.g:1652:1: rule__XVariable__Group__0 : rule__XVariable__Group__0__Impl rule__XVariable__Group__1 ;
    public final void rule__XVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1656:1: ( rule__XVariable__Group__0__Impl rule__XVariable__Group__1 )
            // InternalXMachine.g:1657:2: rule__XVariable__Group__0__Impl rule__XVariable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__XVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XVariable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__Group__0"


    // $ANTLR start "rule__XVariable__Group__0__Impl"
    // InternalXMachine.g:1664:1: rule__XVariable__Group__0__Impl : ( () ) ;
    public final void rule__XVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1668:1: ( ( () ) )
            // InternalXMachine.g:1669:1: ( () )
            {
            // InternalXMachine.g:1669:1: ( () )
            // InternalXMachine.g:1670:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariableAccess().getVariableAction_0()); 
            }
            // InternalXMachine.g:1671:2: ()
            // InternalXMachine.g:1671:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariableAccess().getVariableAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__Group__0__Impl"


    // $ANTLR start "rule__XVariable__Group__1"
    // InternalXMachine.g:1679:1: rule__XVariable__Group__1 : rule__XVariable__Group__1__Impl ;
    public final void rule__XVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1683:1: ( rule__XVariable__Group__1__Impl )
            // InternalXMachine.g:1684:2: rule__XVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__Group__1"


    // $ANTLR start "rule__XVariable__Group__1__Impl"
    // InternalXMachine.g:1690:1: rule__XVariable__Group__1__Impl : ( ( rule__XVariable__NameAssignment_1 ) ) ;
    public final void rule__XVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1694:1: ( ( ( rule__XVariable__NameAssignment_1 ) ) )
            // InternalXMachine.g:1695:1: ( ( rule__XVariable__NameAssignment_1 ) )
            {
            // InternalXMachine.g:1695:1: ( ( rule__XVariable__NameAssignment_1 ) )
            // InternalXMachine.g:1696:2: ( rule__XVariable__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariableAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:1697:2: ( rule__XVariable__NameAssignment_1 )
            // InternalXMachine.g:1697:3: rule__XVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariableAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__Group__1__Impl"


    // $ANTLR start "rule__XInvariant__Group__0"
    // InternalXMachine.g:1706:1: rule__XInvariant__Group__0 : rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 ;
    public final void rule__XInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1710:1: ( rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 )
            // InternalXMachine.g:1711:2: rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XInvariant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__0"


    // $ANTLR start "rule__XInvariant__Group__0__Impl"
    // InternalXMachine.g:1718:1: rule__XInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1722:1: ( ( () ) )
            // InternalXMachine.g:1723:1: ( () )
            {
            // InternalXMachine.g:1723:1: ( () )
            // InternalXMachine.g:1724:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getInvariantAction_0()); 
            }
            // InternalXMachine.g:1725:2: ()
            // InternalXMachine.g:1725:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getInvariantAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__0__Impl"


    // $ANTLR start "rule__XInvariant__Group__1"
    // InternalXMachine.g:1733:1: rule__XInvariant__Group__1 : rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 ;
    public final void rule__XInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1737:1: ( rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 )
            // InternalXMachine.g:1738:2: rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XInvariant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__1"


    // $ANTLR start "rule__XInvariant__Group__1__Impl"
    // InternalXMachine.g:1745:1: rule__XInvariant__Group__1__Impl : ( ( rule__XInvariant__NameAssignment_1 ) ) ;
    public final void rule__XInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1749:1: ( ( ( rule__XInvariant__NameAssignment_1 ) ) )
            // InternalXMachine.g:1750:1: ( ( rule__XInvariant__NameAssignment_1 ) )
            {
            // InternalXMachine.g:1750:1: ( ( rule__XInvariant__NameAssignment_1 ) )
            // InternalXMachine.g:1751:2: ( rule__XInvariant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:1752:2: ( rule__XInvariant__NameAssignment_1 )
            // InternalXMachine.g:1752:3: rule__XInvariant__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__1__Impl"


    // $ANTLR start "rule__XInvariant__Group__2"
    // InternalXMachine.g:1760:1: rule__XInvariant__Group__2 : rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 ;
    public final void rule__XInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1764:1: ( rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 )
            // InternalXMachine.g:1765:2: rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__XInvariant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__2"


    // $ANTLR start "rule__XInvariant__Group__2__Impl"
    // InternalXMachine.g:1772:1: rule__XInvariant__Group__2__Impl : ( ( rule__XInvariant__PredicateAssignment_2 ) ) ;
    public final void rule__XInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1776:1: ( ( ( rule__XInvariant__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:1777:1: ( ( rule__XInvariant__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:1777:1: ( ( rule__XInvariant__PredicateAssignment_2 ) )
            // InternalXMachine.g:1778:2: ( rule__XInvariant__PredicateAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getPredicateAssignment_2()); 
            }
            // InternalXMachine.g:1779:2: ( rule__XInvariant__PredicateAssignment_2 )
            // InternalXMachine.g:1779:3: rule__XInvariant__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__PredicateAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getPredicateAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__2__Impl"


    // $ANTLR start "rule__XInvariant__Group__3"
    // InternalXMachine.g:1787:1: rule__XInvariant__Group__3 : rule__XInvariant__Group__3__Impl ;
    public final void rule__XInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1791:1: ( rule__XInvariant__Group__3__Impl )
            // InternalXMachine.g:1792:2: rule__XInvariant__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__3"


    // $ANTLR start "rule__XInvariant__Group__3__Impl"
    // InternalXMachine.g:1798:1: rule__XInvariant__Group__3__Impl : ( ( rule__XInvariant__TheoremAssignment_3 )? ) ;
    public final void rule__XInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1802:1: ( ( ( rule__XInvariant__TheoremAssignment_3 )? ) )
            // InternalXMachine.g:1803:1: ( ( rule__XInvariant__TheoremAssignment_3 )? )
            {
            // InternalXMachine.g:1803:1: ( ( rule__XInvariant__TheoremAssignment_3 )? )
            // InternalXMachine.g:1804:2: ( rule__XInvariant__TheoremAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getTheoremAssignment_3()); 
            }
            // InternalXMachine.g:1805:2: ( rule__XInvariant__TheoremAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXMachine.g:1805:3: rule__XInvariant__TheoremAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XInvariant__TheoremAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getTheoremAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__3__Impl"


    // $ANTLR start "rule__XVariant__Group__0"
    // InternalXMachine.g:1814:1: rule__XVariant__Group__0 : rule__XVariant__Group__0__Impl rule__XVariant__Group__1 ;
    public final void rule__XVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1818:1: ( rule__XVariant__Group__0__Impl rule__XVariant__Group__1 )
            // InternalXMachine.g:1819:2: rule__XVariant__Group__0__Impl rule__XVariant__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__XVariant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__0"


    // $ANTLR start "rule__XVariant__Group__0__Impl"
    // InternalXMachine.g:1826:1: rule__XVariant__Group__0__Impl : ( () ) ;
    public final void rule__XVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1830:1: ( ( () ) )
            // InternalXMachine.g:1831:1: ( () )
            {
            // InternalXMachine.g:1831:1: ( () )
            // InternalXMachine.g:1832:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getVariantAction_0()); 
            }
            // InternalXMachine.g:1833:2: ()
            // InternalXMachine.g:1833:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getVariantAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__0__Impl"


    // $ANTLR start "rule__XVariant__Group__1"
    // InternalXMachine.g:1841:1: rule__XVariant__Group__1 : rule__XVariant__Group__1__Impl ;
    public final void rule__XVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1845:1: ( rule__XVariant__Group__1__Impl )
            // InternalXMachine.g:1846:2: rule__XVariant__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__1"


    // $ANTLR start "rule__XVariant__Group__1__Impl"
    // InternalXMachine.g:1852:1: rule__XVariant__Group__1__Impl : ( ( rule__XVariant__ExpressionAssignment_1 ) ) ;
    public final void rule__XVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1856:1: ( ( ( rule__XVariant__ExpressionAssignment_1 ) ) )
            // InternalXMachine.g:1857:1: ( ( rule__XVariant__ExpressionAssignment_1 ) )
            {
            // InternalXMachine.g:1857:1: ( ( rule__XVariant__ExpressionAssignment_1 ) )
            // InternalXMachine.g:1858:2: ( rule__XVariant__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getExpressionAssignment_1()); 
            }
            // InternalXMachine.g:1859:2: ( rule__XVariant__ExpressionAssignment_1 )
            // InternalXMachine.g:1859:3: rule__XVariant__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getExpressionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__1__Impl"


    // $ANTLR start "rule__XGroup__Group__0"
    // InternalXMachine.g:1868:1: rule__XGroup__Group__0 : rule__XGroup__Group__0__Impl rule__XGroup__Group__1 ;
    public final void rule__XGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1872:1: ( rule__XGroup__Group__0__Impl rule__XGroup__Group__1 )
            // InternalXMachine.g:1873:2: rule__XGroup__Group__0__Impl rule__XGroup__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__XGroup__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGroup__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group__0"


    // $ANTLR start "rule__XGroup__Group__0__Impl"
    // InternalXMachine.g:1880:1: rule__XGroup__Group__0__Impl : ( () ) ;
    public final void rule__XGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1884:1: ( ( () ) )
            // InternalXMachine.g:1885:1: ( () )
            {
            // InternalXMachine.g:1885:1: ( () )
            // InternalXMachine.g:1886:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventCasesAction_0()); 
            }
            // InternalXMachine.g:1887:2: ()
            // InternalXMachine.g:1887:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getEventCasesAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group__0__Impl"


    // $ANTLR start "rule__XGroup__Group__1"
    // InternalXMachine.g:1895:1: rule__XGroup__Group__1 : rule__XGroup__Group__1__Impl rule__XGroup__Group__2 ;
    public final void rule__XGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1899:1: ( rule__XGroup__Group__1__Impl rule__XGroup__Group__2 )
            // InternalXMachine.g:1900:2: rule__XGroup__Group__1__Impl rule__XGroup__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__XGroup__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGroup__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group__1"


    // $ANTLR start "rule__XGroup__Group__1__Impl"
    // InternalXMachine.g:1907:1: rule__XGroup__Group__1__Impl : ( 'group' ) ;
    public final void rule__XGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1911:1: ( ( 'group' ) )
            // InternalXMachine.g:1912:1: ( 'group' )
            {
            // InternalXMachine.g:1912:1: ( 'group' )
            // InternalXMachine.g:1913:2: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getGroupKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getGroupKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group__1__Impl"


    // $ANTLR start "rule__XGroup__Group__2"
    // InternalXMachine.g:1922:1: rule__XGroup__Group__2 : rule__XGroup__Group__2__Impl rule__XGroup__Group__3 ;
    public final void rule__XGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1926:1: ( rule__XGroup__Group__2__Impl rule__XGroup__Group__3 )
            // InternalXMachine.g:1927:2: rule__XGroup__Group__2__Impl rule__XGroup__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__XGroup__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGroup__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group__2"


    // $ANTLR start "rule__XGroup__Group__2__Impl"
    // InternalXMachine.g:1934:1: rule__XGroup__Group__2__Impl : ( ( rule__XGroup__NameAssignment_2 ) ) ;
    public final void rule__XGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1938:1: ( ( ( rule__XGroup__NameAssignment_2 ) ) )
            // InternalXMachine.g:1939:1: ( ( rule__XGroup__NameAssignment_2 ) )
            {
            // InternalXMachine.g:1939:1: ( ( rule__XGroup__NameAssignment_2 ) )
            // InternalXMachine.g:1940:2: ( rule__XGroup__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:1941:2: ( rule__XGroup__NameAssignment_2 )
            // InternalXMachine.g:1941:3: rule__XGroup__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group__2__Impl"


    // $ANTLR start "rule__XGroup__Group__3"
    // InternalXMachine.g:1949:1: rule__XGroup__Group__3 : rule__XGroup__Group__3__Impl rule__XGroup__Group__4 ;
    public final void rule__XGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1953:1: ( rule__XGroup__Group__3__Impl rule__XGroup__Group__4 )
            // InternalXMachine.g:1954:2: rule__XGroup__Group__3__Impl rule__XGroup__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__XGroup__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGroup__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group__3"


    // $ANTLR start "rule__XGroup__Group__3__Impl"
    // InternalXMachine.g:1961:1: rule__XGroup__Group__3__Impl : ( ( rule__XGroup__Group_3__0 )? ) ;
    public final void rule__XGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1965:1: ( ( ( rule__XGroup__Group_3__0 )? ) )
            // InternalXMachine.g:1966:1: ( ( rule__XGroup__Group_3__0 )? )
            {
            // InternalXMachine.g:1966:1: ( ( rule__XGroup__Group_3__0 )? )
            // InternalXMachine.g:1967:2: ( rule__XGroup__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getGroup_3()); 
            }
            // InternalXMachine.g:1968:2: ( rule__XGroup__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXMachine.g:1968:3: rule__XGroup__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGroup__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group__3__Impl"


    // $ANTLR start "rule__XGroup__Group__4"
    // InternalXMachine.g:1976:1: rule__XGroup__Group__4 : rule__XGroup__Group__4__Impl rule__XGroup__Group__5 ;
    public final void rule__XGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1980:1: ( rule__XGroup__Group__4__Impl rule__XGroup__Group__5 )
            // InternalXMachine.g:1981:2: rule__XGroup__Group__4__Impl rule__XGroup__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__XGroup__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGroup__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group__4"


    // $ANTLR start "rule__XGroup__Group__4__Impl"
    // InternalXMachine.g:1988:1: rule__XGroup__Group__4__Impl : ( ( rule__XGroup__Group_4__0 )? ) ;
    public final void rule__XGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1992:1: ( ( ( rule__XGroup__Group_4__0 )? ) )
            // InternalXMachine.g:1993:1: ( ( rule__XGroup__Group_4__0 )? )
            {
            // InternalXMachine.g:1993:1: ( ( rule__XGroup__Group_4__0 )? )
            // InternalXMachine.g:1994:2: ( rule__XGroup__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getGroup_4()); 
            }
            // InternalXMachine.g:1995:2: ( rule__XGroup__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXMachine.g:1995:3: rule__XGroup__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGroup__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group__4__Impl"


    // $ANTLR start "rule__XGroup__Group__5"
    // InternalXMachine.g:2003:1: rule__XGroup__Group__5 : rule__XGroup__Group__5__Impl ;
    public final void rule__XGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2007:1: ( rule__XGroup__Group__5__Impl )
            // InternalXMachine.g:2008:2: rule__XGroup__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group__5"


    // $ANTLR start "rule__XGroup__Group__5__Impl"
    // InternalXMachine.g:2014:1: rule__XGroup__Group__5__Impl : ( 'end' ) ;
    public final void rule__XGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2018:1: ( ( 'end' ) )
            // InternalXMachine.g:2019:1: ( 'end' )
            {
            // InternalXMachine.g:2019:1: ( 'end' )
            // InternalXMachine.g:2020:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEndKeyword_5()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getEndKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group__5__Impl"


    // $ANTLR start "rule__XGroup__Group_3__0"
    // InternalXMachine.g:2030:1: rule__XGroup__Group_3__0 : rule__XGroup__Group_3__0__Impl rule__XGroup__Group_3__1 ;
    public final void rule__XGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2034:1: ( rule__XGroup__Group_3__0__Impl rule__XGroup__Group_3__1 )
            // InternalXMachine.g:2035:2: rule__XGroup__Group_3__0__Impl rule__XGroup__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__XGroup__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGroup__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_3__0"


    // $ANTLR start "rule__XGroup__Group_3__0__Impl"
    // InternalXMachine.g:2042:1: rule__XGroup__Group_3__0__Impl : ( '(' ) ;
    public final void rule__XGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2046:1: ( ( '(' ) )
            // InternalXMachine.g:2047:1: ( '(' )
            {
            // InternalXMachine.g:2047:1: ( '(' )
            // InternalXMachine.g:2048:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_3__0__Impl"


    // $ANTLR start "rule__XGroup__Group_3__1"
    // InternalXMachine.g:2057:1: rule__XGroup__Group_3__1 : rule__XGroup__Group_3__1__Impl rule__XGroup__Group_3__2 ;
    public final void rule__XGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2061:1: ( rule__XGroup__Group_3__1__Impl rule__XGroup__Group_3__2 )
            // InternalXMachine.g:2062:2: rule__XGroup__Group_3__1__Impl rule__XGroup__Group_3__2
            {
            pushFollow(FOLLOW_20);
            rule__XGroup__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGroup__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_3__1"


    // $ANTLR start "rule__XGroup__Group_3__1__Impl"
    // InternalXMachine.g:2069:1: rule__XGroup__Group_3__1__Impl : ( ( rule__XGroup__FormalParametersAssignment_3_1 ) ) ;
    public final void rule__XGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2073:1: ( ( ( rule__XGroup__FormalParametersAssignment_3_1 ) ) )
            // InternalXMachine.g:2074:1: ( ( rule__XGroup__FormalParametersAssignment_3_1 ) )
            {
            // InternalXMachine.g:2074:1: ( ( rule__XGroup__FormalParametersAssignment_3_1 ) )
            // InternalXMachine.g:2075:2: ( rule__XGroup__FormalParametersAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getFormalParametersAssignment_3_1()); 
            }
            // InternalXMachine.g:2076:2: ( rule__XGroup__FormalParametersAssignment_3_1 )
            // InternalXMachine.g:2076:3: rule__XGroup__FormalParametersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__FormalParametersAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getFormalParametersAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_3__1__Impl"


    // $ANTLR start "rule__XGroup__Group_3__2"
    // InternalXMachine.g:2084:1: rule__XGroup__Group_3__2 : rule__XGroup__Group_3__2__Impl rule__XGroup__Group_3__3 ;
    public final void rule__XGroup__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2088:1: ( rule__XGroup__Group_3__2__Impl rule__XGroup__Group_3__3 )
            // InternalXMachine.g:2089:2: rule__XGroup__Group_3__2__Impl rule__XGroup__Group_3__3
            {
            pushFollow(FOLLOW_20);
            rule__XGroup__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGroup__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_3__2"


    // $ANTLR start "rule__XGroup__Group_3__2__Impl"
    // InternalXMachine.g:2096:1: rule__XGroup__Group_3__2__Impl : ( ( rule__XGroup__Group_3_2__0 )* ) ;
    public final void rule__XGroup__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2100:1: ( ( ( rule__XGroup__Group_3_2__0 )* ) )
            // InternalXMachine.g:2101:1: ( ( rule__XGroup__Group_3_2__0 )* )
            {
            // InternalXMachine.g:2101:1: ( ( rule__XGroup__Group_3_2__0 )* )
            // InternalXMachine.g:2102:2: ( rule__XGroup__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getGroup_3_2()); 
            }
            // InternalXMachine.g:2103:2: ( rule__XGroup__Group_3_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXMachine.g:2103:3: rule__XGroup__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__XGroup__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_3__2__Impl"


    // $ANTLR start "rule__XGroup__Group_3__3"
    // InternalXMachine.g:2111:1: rule__XGroup__Group_3__3 : rule__XGroup__Group_3__3__Impl ;
    public final void rule__XGroup__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2115:1: ( rule__XGroup__Group_3__3__Impl )
            // InternalXMachine.g:2116:2: rule__XGroup__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_3__3"


    // $ANTLR start "rule__XGroup__Group_3__3__Impl"
    // InternalXMachine.g:2122:1: rule__XGroup__Group_3__3__Impl : ( ')' ) ;
    public final void rule__XGroup__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2126:1: ( ( ')' ) )
            // InternalXMachine.g:2127:1: ( ')' )
            {
            // InternalXMachine.g:2127:1: ( ')' )
            // InternalXMachine.g:2128:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getRightParenthesisKeyword_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_3__3__Impl"


    // $ANTLR start "rule__XGroup__Group_3_2__0"
    // InternalXMachine.g:2138:1: rule__XGroup__Group_3_2__0 : rule__XGroup__Group_3_2__0__Impl rule__XGroup__Group_3_2__1 ;
    public final void rule__XGroup__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2142:1: ( rule__XGroup__Group_3_2__0__Impl rule__XGroup__Group_3_2__1 )
            // InternalXMachine.g:2143:2: rule__XGroup__Group_3_2__0__Impl rule__XGroup__Group_3_2__1
            {
            pushFollow(FOLLOW_19);
            rule__XGroup__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGroup__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_3_2__0"


    // $ANTLR start "rule__XGroup__Group_3_2__0__Impl"
    // InternalXMachine.g:2150:1: rule__XGroup__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__XGroup__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2154:1: ( ( ',' ) )
            // InternalXMachine.g:2155:1: ( ',' )
            {
            // InternalXMachine.g:2155:1: ( ',' )
            // InternalXMachine.g:2156:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getCommaKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_3_2__0__Impl"


    // $ANTLR start "rule__XGroup__Group_3_2__1"
    // InternalXMachine.g:2165:1: rule__XGroup__Group_3_2__1 : rule__XGroup__Group_3_2__1__Impl ;
    public final void rule__XGroup__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2169:1: ( rule__XGroup__Group_3_2__1__Impl )
            // InternalXMachine.g:2170:2: rule__XGroup__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_3_2__1"


    // $ANTLR start "rule__XGroup__Group_3_2__1__Impl"
    // InternalXMachine.g:2176:1: rule__XGroup__Group_3_2__1__Impl : ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) ) ;
    public final void rule__XGroup__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2180:1: ( ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) ) )
            // InternalXMachine.g:2181:1: ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) )
            {
            // InternalXMachine.g:2181:1: ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) )
            // InternalXMachine.g:2182:2: ( rule__XGroup__FormalParametersAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getFormalParametersAssignment_3_2_1()); 
            }
            // InternalXMachine.g:2183:2: ( rule__XGroup__FormalParametersAssignment_3_2_1 )
            // InternalXMachine.g:2183:3: rule__XGroup__FormalParametersAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__FormalParametersAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getFormalParametersAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_3_2__1__Impl"


    // $ANTLR start "rule__XGroup__Group_4__0"
    // InternalXMachine.g:2192:1: rule__XGroup__Group_4__0 : rule__XGroup__Group_4__0__Impl rule__XGroup__Group_4__1 ;
    public final void rule__XGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2196:1: ( rule__XGroup__Group_4__0__Impl rule__XGroup__Group_4__1 )
            // InternalXMachine.g:2197:2: rule__XGroup__Group_4__0__Impl rule__XGroup__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__XGroup__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGroup__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_4__0"


    // $ANTLR start "rule__XGroup__Group_4__0__Impl"
    // InternalXMachine.g:2204:1: rule__XGroup__Group_4__0__Impl : ( 'begin' ) ;
    public final void rule__XGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2208:1: ( ( 'begin' ) )
            // InternalXMachine.g:2209:1: ( 'begin' )
            {
            // InternalXMachine.g:2209:1: ( 'begin' )
            // InternalXMachine.g:2210:2: 'begin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getBeginKeyword_4_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getBeginKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_4__0__Impl"


    // $ANTLR start "rule__XGroup__Group_4__1"
    // InternalXMachine.g:2219:1: rule__XGroup__Group_4__1 : rule__XGroup__Group_4__1__Impl rule__XGroup__Group_4__2 ;
    public final void rule__XGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2223:1: ( rule__XGroup__Group_4__1__Impl rule__XGroup__Group_4__2 )
            // InternalXMachine.g:2224:2: rule__XGroup__Group_4__1__Impl rule__XGroup__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__XGroup__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGroup__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_4__1"


    // $ANTLR start "rule__XGroup__Group_4__1__Impl"
    // InternalXMachine.g:2231:1: rule__XGroup__Group_4__1__Impl : ( ( rule__XGroup__EventsAssignment_4_1 ) ) ;
    public final void rule__XGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2235:1: ( ( ( rule__XGroup__EventsAssignment_4_1 ) ) )
            // InternalXMachine.g:2236:1: ( ( rule__XGroup__EventsAssignment_4_1 ) )
            {
            // InternalXMachine.g:2236:1: ( ( rule__XGroup__EventsAssignment_4_1 ) )
            // InternalXMachine.g:2237:2: ( rule__XGroup__EventsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventsAssignment_4_1()); 
            }
            // InternalXMachine.g:2238:2: ( rule__XGroup__EventsAssignment_4_1 )
            // InternalXMachine.g:2238:3: rule__XGroup__EventsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__EventsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getEventsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_4__1__Impl"


    // $ANTLR start "rule__XGroup__Group_4__2"
    // InternalXMachine.g:2246:1: rule__XGroup__Group_4__2 : rule__XGroup__Group_4__2__Impl ;
    public final void rule__XGroup__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2250:1: ( rule__XGroup__Group_4__2__Impl )
            // InternalXMachine.g:2251:2: rule__XGroup__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_4__2"


    // $ANTLR start "rule__XGroup__Group_4__2__Impl"
    // InternalXMachine.g:2257:1: rule__XGroup__Group_4__2__Impl : ( ( rule__XGroup__EventsAssignment_4_2 )* ) ;
    public final void rule__XGroup__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2261:1: ( ( ( rule__XGroup__EventsAssignment_4_2 )* ) )
            // InternalXMachine.g:2262:1: ( ( rule__XGroup__EventsAssignment_4_2 )* )
            {
            // InternalXMachine.g:2262:1: ( ( rule__XGroup__EventsAssignment_4_2 )* )
            // InternalXMachine.g:2263:2: ( rule__XGroup__EventsAssignment_4_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventsAssignment_4_2()); 
            }
            // InternalXMachine.g:2264:2: ( rule__XGroup__EventsAssignment_4_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXMachine.g:2264:3: rule__XGroup__EventsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XGroup__EventsAssignment_4_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getEventsAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_4__2__Impl"


    // $ANTLR start "rule__XFormalParameter__Group__0"
    // InternalXMachine.g:2273:1: rule__XFormalParameter__Group__0 : rule__XFormalParameter__Group__0__Impl rule__XFormalParameter__Group__1 ;
    public final void rule__XFormalParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2277:1: ( rule__XFormalParameter__Group__0__Impl rule__XFormalParameter__Group__1 )
            // InternalXMachine.g:2278:2: rule__XFormalParameter__Group__0__Impl rule__XFormalParameter__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__XFormalParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XFormalParameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFormalParameter__Group__0"


    // $ANTLR start "rule__XFormalParameter__Group__0__Impl"
    // InternalXMachine.g:2285:1: rule__XFormalParameter__Group__0__Impl : ( () ) ;
    public final void rule__XFormalParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2289:1: ( ( () ) )
            // InternalXMachine.g:2290:1: ( () )
            {
            // InternalXMachine.g:2290:1: ( () )
            // InternalXMachine.g:2291:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormalParameterAccess().getFormalParameterAction_0()); 
            }
            // InternalXMachine.g:2292:2: ()
            // InternalXMachine.g:2292:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFormalParameterAccess().getFormalParameterAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFormalParameter__Group__0__Impl"


    // $ANTLR start "rule__XFormalParameter__Group__1"
    // InternalXMachine.g:2300:1: rule__XFormalParameter__Group__1 : rule__XFormalParameter__Group__1__Impl rule__XFormalParameter__Group__2 ;
    public final void rule__XFormalParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2304:1: ( rule__XFormalParameter__Group__1__Impl rule__XFormalParameter__Group__2 )
            // InternalXMachine.g:2305:2: rule__XFormalParameter__Group__1__Impl rule__XFormalParameter__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__XFormalParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XFormalParameter__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFormalParameter__Group__1"


    // $ANTLR start "rule__XFormalParameter__Group__1__Impl"
    // InternalXMachine.g:2312:1: rule__XFormalParameter__Group__1__Impl : ( ( rule__XFormalParameter__DirectionAssignment_1 ) ) ;
    public final void rule__XFormalParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2316:1: ( ( ( rule__XFormalParameter__DirectionAssignment_1 ) ) )
            // InternalXMachine.g:2317:1: ( ( rule__XFormalParameter__DirectionAssignment_1 ) )
            {
            // InternalXMachine.g:2317:1: ( ( rule__XFormalParameter__DirectionAssignment_1 ) )
            // InternalXMachine.g:2318:2: ( rule__XFormalParameter__DirectionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormalParameterAccess().getDirectionAssignment_1()); 
            }
            // InternalXMachine.g:2319:2: ( rule__XFormalParameter__DirectionAssignment_1 )
            // InternalXMachine.g:2319:3: rule__XFormalParameter__DirectionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XFormalParameter__DirectionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFormalParameterAccess().getDirectionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFormalParameter__Group__1__Impl"


    // $ANTLR start "rule__XFormalParameter__Group__2"
    // InternalXMachine.g:2327:1: rule__XFormalParameter__Group__2 : rule__XFormalParameter__Group__2__Impl ;
    public final void rule__XFormalParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2331:1: ( rule__XFormalParameter__Group__2__Impl )
            // InternalXMachine.g:2332:2: rule__XFormalParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XFormalParameter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFormalParameter__Group__2"


    // $ANTLR start "rule__XFormalParameter__Group__2__Impl"
    // InternalXMachine.g:2338:1: rule__XFormalParameter__Group__2__Impl : ( ( rule__XFormalParameter__NameAssignment_2 ) ) ;
    public final void rule__XFormalParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2342:1: ( ( ( rule__XFormalParameter__NameAssignment_2 ) ) )
            // InternalXMachine.g:2343:1: ( ( rule__XFormalParameter__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2343:1: ( ( rule__XFormalParameter__NameAssignment_2 ) )
            // InternalXMachine.g:2344:2: ( rule__XFormalParameter__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormalParameterAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:2345:2: ( rule__XFormalParameter__NameAssignment_2 )
            // InternalXMachine.g:2345:3: rule__XFormalParameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XFormalParameter__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFormalParameterAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFormalParameter__Group__2__Impl"


    // $ANTLR start "rule__XEvent__Group__0"
    // InternalXMachine.g:2354:1: rule__XEvent__Group__0 : rule__XEvent__Group__0__Impl rule__XEvent__Group__1 ;
    public final void rule__XEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2358:1: ( rule__XEvent__Group__0__Impl rule__XEvent__Group__1 )
            // InternalXMachine.g:2359:2: rule__XEvent__Group__0__Impl rule__XEvent__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__XEvent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__0"


    // $ANTLR start "rule__XEvent__Group__0__Impl"
    // InternalXMachine.g:2366:1: rule__XEvent__Group__0__Impl : ( () ) ;
    public final void rule__XEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2370:1: ( ( () ) )
            // InternalXMachine.g:2371:1: ( () )
            {
            // InternalXMachine.g:2371:1: ( () )
            // InternalXMachine.g:2372:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEventAction_0()); 
            }
            // InternalXMachine.g:2373:2: ()
            // InternalXMachine.g:2373:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getEventAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__0__Impl"


    // $ANTLR start "rule__XEvent__Group__1"
    // InternalXMachine.g:2381:1: rule__XEvent__Group__1 : rule__XEvent__Group__1__Impl rule__XEvent__Group__2 ;
    public final void rule__XEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2385:1: ( rule__XEvent__Group__1__Impl rule__XEvent__Group__2 )
            // InternalXMachine.g:2386:2: rule__XEvent__Group__1__Impl rule__XEvent__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__XEvent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__1"


    // $ANTLR start "rule__XEvent__Group__1__Impl"
    // InternalXMachine.g:2393:1: rule__XEvent__Group__1__Impl : ( 'event' ) ;
    public final void rule__XEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2397:1: ( ( 'event' ) )
            // InternalXMachine.g:2398:1: ( 'event' )
            {
            // InternalXMachine.g:2398:1: ( 'event' )
            // InternalXMachine.g:2399:2: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEventKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getEventKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__1__Impl"


    // $ANTLR start "rule__XEvent__Group__2"
    // InternalXMachine.g:2408:1: rule__XEvent__Group__2 : rule__XEvent__Group__2__Impl rule__XEvent__Group__3 ;
    public final void rule__XEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2412:1: ( rule__XEvent__Group__2__Impl rule__XEvent__Group__3 )
            // InternalXMachine.g:2413:2: rule__XEvent__Group__2__Impl rule__XEvent__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__XEvent__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__2"


    // $ANTLR start "rule__XEvent__Group__2__Impl"
    // InternalXMachine.g:2420:1: rule__XEvent__Group__2__Impl : ( ( rule__XEvent__NameAssignment_2 ) ) ;
    public final void rule__XEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2424:1: ( ( ( rule__XEvent__NameAssignment_2 ) ) )
            // InternalXMachine.g:2425:1: ( ( rule__XEvent__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2425:1: ( ( rule__XEvent__NameAssignment_2 ) )
            // InternalXMachine.g:2426:2: ( rule__XEvent__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:2427:2: ( rule__XEvent__NameAssignment_2 )
            // InternalXMachine.g:2427:3: rule__XEvent__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__2__Impl"


    // $ANTLR start "rule__XEvent__Group__3"
    // InternalXMachine.g:2435:1: rule__XEvent__Group__3 : rule__XEvent__Group__3__Impl rule__XEvent__Group__4 ;
    public final void rule__XEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2439:1: ( rule__XEvent__Group__3__Impl rule__XEvent__Group__4 )
            // InternalXMachine.g:2440:2: rule__XEvent__Group__3__Impl rule__XEvent__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__XEvent__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__3"


    // $ANTLR start "rule__XEvent__Group__3__Impl"
    // InternalXMachine.g:2447:1: rule__XEvent__Group__3__Impl : ( ( rule__XEvent__UnorderedGroup_3 ) ) ;
    public final void rule__XEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2451:1: ( ( ( rule__XEvent__UnorderedGroup_3 ) ) )
            // InternalXMachine.g:2452:1: ( ( rule__XEvent__UnorderedGroup_3 ) )
            {
            // InternalXMachine.g:2452:1: ( ( rule__XEvent__UnorderedGroup_3 ) )
            // InternalXMachine.g:2453:2: ( rule__XEvent__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getUnorderedGroup_3()); 
            }
            // InternalXMachine.g:2454:2: ( rule__XEvent__UnorderedGroup_3 )
            // InternalXMachine.g:2454:3: rule__XEvent__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getUnorderedGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__3__Impl"


    // $ANTLR start "rule__XEvent__Group__4"
    // InternalXMachine.g:2462:1: rule__XEvent__Group__4 : rule__XEvent__Group__4__Impl rule__XEvent__Group__5 ;
    public final void rule__XEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2466:1: ( rule__XEvent__Group__4__Impl rule__XEvent__Group__5 )
            // InternalXMachine.g:2467:2: rule__XEvent__Group__4__Impl rule__XEvent__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__XEvent__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__4"


    // $ANTLR start "rule__XEvent__Group__4__Impl"
    // InternalXMachine.g:2474:1: rule__XEvent__Group__4__Impl : ( ( rule__XEvent__ExtensionsAssignment_4 )* ) ;
    public final void rule__XEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2478:1: ( ( ( rule__XEvent__ExtensionsAssignment_4 )* ) )
            // InternalXMachine.g:2479:1: ( ( rule__XEvent__ExtensionsAssignment_4 )* )
            {
            // InternalXMachine.g:2479:1: ( ( rule__XEvent__ExtensionsAssignment_4 )* )
            // InternalXMachine.g:2480:2: ( rule__XEvent__ExtensionsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtensionsAssignment_4()); 
            }
            // InternalXMachine.g:2481:2: ( rule__XEvent__ExtensionsAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalXMachine.g:2481:3: rule__XEvent__ExtensionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__XEvent__ExtensionsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtensionsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__4__Impl"


    // $ANTLR start "rule__XEvent__Group__5"
    // InternalXMachine.g:2489:1: rule__XEvent__Group__5 : rule__XEvent__Group__5__Impl rule__XEvent__Group__6 ;
    public final void rule__XEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2493:1: ( rule__XEvent__Group__5__Impl rule__XEvent__Group__6 )
            // InternalXMachine.g:2494:2: rule__XEvent__Group__5__Impl rule__XEvent__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__XEvent__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__5"


    // $ANTLR start "rule__XEvent__Group__5__Impl"
    // InternalXMachine.g:2501:1: rule__XEvent__Group__5__Impl : ( ( rule__XEvent__Group_5__0 )? ) ;
    public final void rule__XEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2505:1: ( ( ( rule__XEvent__Group_5__0 )? ) )
            // InternalXMachine.g:2506:1: ( ( rule__XEvent__Group_5__0 )? )
            {
            // InternalXMachine.g:2506:1: ( ( rule__XEvent__Group_5__0 )? )
            // InternalXMachine.g:2507:2: ( rule__XEvent__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_5()); 
            }
            // InternalXMachine.g:2508:2: ( rule__XEvent__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXMachine.g:2508:3: rule__XEvent__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__5__Impl"


    // $ANTLR start "rule__XEvent__Group__6"
    // InternalXMachine.g:2516:1: rule__XEvent__Group__6 : rule__XEvent__Group__6__Impl rule__XEvent__Group__7 ;
    public final void rule__XEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2520:1: ( rule__XEvent__Group__6__Impl rule__XEvent__Group__7 )
            // InternalXMachine.g:2521:2: rule__XEvent__Group__6__Impl rule__XEvent__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__XEvent__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__6"


    // $ANTLR start "rule__XEvent__Group__6__Impl"
    // InternalXMachine.g:2528:1: rule__XEvent__Group__6__Impl : ( ( rule__XEvent__Alternatives_6 )? ) ;
    public final void rule__XEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2532:1: ( ( ( rule__XEvent__Alternatives_6 )? ) )
            // InternalXMachine.g:2533:1: ( ( rule__XEvent__Alternatives_6 )? )
            {
            // InternalXMachine.g:2533:1: ( ( rule__XEvent__Alternatives_6 )? )
            // InternalXMachine.g:2534:2: ( rule__XEvent__Alternatives_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_6()); 
            }
            // InternalXMachine.g:2535:2: ( rule__XEvent__Alternatives_6 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33||(LA25_0>=35 && LA25_0<=36)||LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXMachine.g:2535:3: rule__XEvent__Alternatives_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Alternatives_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getAlternatives_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__6__Impl"


    // $ANTLR start "rule__XEvent__Group__7"
    // InternalXMachine.g:2543:1: rule__XEvent__Group__7 : rule__XEvent__Group__7__Impl ;
    public final void rule__XEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2547:1: ( rule__XEvent__Group__7__Impl )
            // InternalXMachine.g:2548:2: rule__XEvent__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__7"


    // $ANTLR start "rule__XEvent__Group__7__Impl"
    // InternalXMachine.g:2554:1: rule__XEvent__Group__7__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2558:1: ( ( 'end' ) )
            // InternalXMachine.g:2559:1: ( 'end' )
            {
            // InternalXMachine.g:2559:1: ( 'end' )
            // InternalXMachine.g:2560:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEndKeyword_7()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getEndKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__7__Impl"


    // $ANTLR start "rule__XEvent__Group_5__0"
    // InternalXMachine.g:2570:1: rule__XEvent__Group_5__0 : rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1 ;
    public final void rule__XEvent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2574:1: ( rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1 )
            // InternalXMachine.g:2575:2: rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__XEvent__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5__0"


    // $ANTLR start "rule__XEvent__Group_5__0__Impl"
    // InternalXMachine.g:2582:1: rule__XEvent__Group_5__0__Impl : ( 'refines' ) ;
    public final void rule__XEvent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2586:1: ( ( 'refines' ) )
            // InternalXMachine.g:2587:1: ( 'refines' )
            {
            // InternalXMachine.g:2587:1: ( 'refines' )
            // InternalXMachine.g:2588:2: 'refines'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesKeyword_5_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5__1"
    // InternalXMachine.g:2597:1: rule__XEvent__Group_5__1 : rule__XEvent__Group_5__1__Impl ;
    public final void rule__XEvent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2601:1: ( rule__XEvent__Group_5__1__Impl )
            // InternalXMachine.g:2602:2: rule__XEvent__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5__1"


    // $ANTLR start "rule__XEvent__Group_5__1__Impl"
    // InternalXMachine.g:2608:1: rule__XEvent__Group_5__1__Impl : ( ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* ) ) ;
    public final void rule__XEvent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2612:1: ( ( ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* ) ) )
            // InternalXMachine.g:2613:1: ( ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* ) )
            {
            // InternalXMachine.g:2613:1: ( ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* ) )
            // InternalXMachine.g:2614:2: ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* )
            {
            // InternalXMachine.g:2614:2: ( ( rule__XEvent__RefinesAssignment_5_1 ) )
            // InternalXMachine.g:2615:3: ( rule__XEvent__RefinesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_5_1()); 
            }
            // InternalXMachine.g:2616:3: ( rule__XEvent__RefinesAssignment_5_1 )
            // InternalXMachine.g:2616:4: rule__XEvent__RefinesAssignment_5_1
            {
            pushFollow(FOLLOW_8);
            rule__XEvent__RefinesAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesAssignment_5_1()); 
            }

            }

            // InternalXMachine.g:2619:2: ( ( rule__XEvent__RefinesAssignment_5_1 )* )
            // InternalXMachine.g:2620:3: ( rule__XEvent__RefinesAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_5_1()); 
            }
            // InternalXMachine.g:2621:3: ( rule__XEvent__RefinesAssignment_5_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalXMachine.g:2621:4: rule__XEvent__RefinesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XEvent__RefinesAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesAssignment_5_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5__1__Impl"


    // $ANTLR start "rule__XEvent__Group_6_0__0"
    // InternalXMachine.g:2631:1: rule__XEvent__Group_6_0__0 : rule__XEvent__Group_6_0__0__Impl rule__XEvent__Group_6_0__1 ;
    public final void rule__XEvent__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2635:1: ( rule__XEvent__Group_6_0__0__Impl rule__XEvent__Group_6_0__1 )
            // InternalXMachine.g:2636:2: rule__XEvent__Group_6_0__0__Impl rule__XEvent__Group_6_0__1
            {
            pushFollow(FOLLOW_25);
            rule__XEvent__Group_6_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0__0"


    // $ANTLR start "rule__XEvent__Group_6_0__0__Impl"
    // InternalXMachine.g:2643:1: rule__XEvent__Group_6_0__0__Impl : ( ( rule__XEvent__Group_6_0_0__0 )? ) ;
    public final void rule__XEvent__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2647:1: ( ( ( rule__XEvent__Group_6_0_0__0 )? ) )
            // InternalXMachine.g:2648:1: ( ( rule__XEvent__Group_6_0_0__0 )? )
            {
            // InternalXMachine.g:2648:1: ( ( rule__XEvent__Group_6_0_0__0 )? )
            // InternalXMachine.g:2649:2: ( rule__XEvent__Group_6_0_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_6_0_0()); 
            }
            // InternalXMachine.g:2650:2: ( rule__XEvent__Group_6_0_0__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXMachine.g:2650:3: rule__XEvent__Group_6_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup_6_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0__0__Impl"


    // $ANTLR start "rule__XEvent__Group_6_0__1"
    // InternalXMachine.g:2658:1: rule__XEvent__Group_6_0__1 : rule__XEvent__Group_6_0__1__Impl rule__XEvent__Group_6_0__2 ;
    public final void rule__XEvent__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2662:1: ( rule__XEvent__Group_6_0__1__Impl rule__XEvent__Group_6_0__2 )
            // InternalXMachine.g:2663:2: rule__XEvent__Group_6_0__1__Impl rule__XEvent__Group_6_0__2
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0__1"


    // $ANTLR start "rule__XEvent__Group_6_0__1__Impl"
    // InternalXMachine.g:2670:1: rule__XEvent__Group_6_0__1__Impl : ( 'begin' ) ;
    public final void rule__XEvent__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2674:1: ( ( 'begin' ) )
            // InternalXMachine.g:2675:1: ( 'begin' )
            {
            // InternalXMachine.g:2675:1: ( 'begin' )
            // InternalXMachine.g:2676:2: 'begin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getBeginKeyword_6_0_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getBeginKeyword_6_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0__1__Impl"


    // $ANTLR start "rule__XEvent__Group_6_0__2"
    // InternalXMachine.g:2685:1: rule__XEvent__Group_6_0__2 : rule__XEvent__Group_6_0__2__Impl ;
    public final void rule__XEvent__Group_6_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2689:1: ( rule__XEvent__Group_6_0__2__Impl )
            // InternalXMachine.g:2690:2: rule__XEvent__Group_6_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0__2"


    // $ANTLR start "rule__XEvent__Group_6_0__2__Impl"
    // InternalXMachine.g:2696:1: rule__XEvent__Group_6_0__2__Impl : ( ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* ) ) ;
    public final void rule__XEvent__Group_6_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2700:1: ( ( ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* ) ) )
            // InternalXMachine.g:2701:1: ( ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* ) )
            {
            // InternalXMachine.g:2701:1: ( ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* ) )
            // InternalXMachine.g:2702:2: ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* )
            {
            // InternalXMachine.g:2702:2: ( ( rule__XEvent__ActionsAssignment_6_0_2 ) )
            // InternalXMachine.g:2703:3: ( rule__XEvent__ActionsAssignment_6_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_6_0_2()); 
            }
            // InternalXMachine.g:2704:3: ( rule__XEvent__ActionsAssignment_6_0_2 )
            // InternalXMachine.g:2704:4: rule__XEvent__ActionsAssignment_6_0_2
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_6_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getActionsAssignment_6_0_2()); 
            }

            }

            // InternalXMachine.g:2707:2: ( ( rule__XEvent__ActionsAssignment_6_0_2 )* )
            // InternalXMachine.g:2708:3: ( rule__XEvent__ActionsAssignment_6_0_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_6_0_2()); 
            }
            // InternalXMachine.g:2709:3: ( rule__XEvent__ActionsAssignment_6_0_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_XLABEL) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalXMachine.g:2709:4: rule__XEvent__ActionsAssignment_6_0_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_6_0_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getActionsAssignment_6_0_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0__2__Impl"


    // $ANTLR start "rule__XEvent__Group_6_0_0__0"
    // InternalXMachine.g:2719:1: rule__XEvent__Group_6_0_0__0 : rule__XEvent__Group_6_0_0__0__Impl rule__XEvent__Group_6_0_0__1 ;
    public final void rule__XEvent__Group_6_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2723:1: ( rule__XEvent__Group_6_0_0__0__Impl rule__XEvent__Group_6_0_0__1 )
            // InternalXMachine.g:2724:2: rule__XEvent__Group_6_0_0__0__Impl rule__XEvent__Group_6_0_0__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0_0__0"


    // $ANTLR start "rule__XEvent__Group_6_0_0__0__Impl"
    // InternalXMachine.g:2731:1: rule__XEvent__Group_6_0_0__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_6_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2735:1: ( ( 'with' ) )
            // InternalXMachine.g:2736:1: ( 'with' )
            {
            // InternalXMachine.g:2736:1: ( 'with' )
            // InternalXMachine.g:2737:2: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWithKeyword_6_0_0_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWithKeyword_6_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0_0__0__Impl"


    // $ANTLR start "rule__XEvent__Group_6_0_0__1"
    // InternalXMachine.g:2746:1: rule__XEvent__Group_6_0_0__1 : rule__XEvent__Group_6_0_0__1__Impl ;
    public final void rule__XEvent__Group_6_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2750:1: ( rule__XEvent__Group_6_0_0__1__Impl )
            // InternalXMachine.g:2751:2: rule__XEvent__Group_6_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0_0__1"


    // $ANTLR start "rule__XEvent__Group_6_0_0__1__Impl"
    // InternalXMachine.g:2757:1: rule__XEvent__Group_6_0_0__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* ) ) ;
    public final void rule__XEvent__Group_6_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2761:1: ( ( ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* ) ) )
            // InternalXMachine.g:2762:1: ( ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* ) )
            {
            // InternalXMachine.g:2762:1: ( ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* ) )
            // InternalXMachine.g:2763:2: ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* )
            {
            // InternalXMachine.g:2763:2: ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) )
            // InternalXMachine.g:2764:3: ( rule__XEvent__WitnessesAssignment_6_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_0_0_1()); 
            }
            // InternalXMachine.g:2765:3: ( rule__XEvent__WitnessesAssignment_6_0_0_1 )
            // InternalXMachine.g:2765:4: rule__XEvent__WitnessesAssignment_6_0_0_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_6_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_0_0_1()); 
            }

            }

            // InternalXMachine.g:2768:2: ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* )
            // InternalXMachine.g:2769:3: ( rule__XEvent__WitnessesAssignment_6_0_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_0_0_1()); 
            }
            // InternalXMachine.g:2770:3: ( rule__XEvent__WitnessesAssignment_6_0_0_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_XLABEL) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalXMachine.g:2770:4: rule__XEvent__WitnessesAssignment_6_0_0_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_6_0_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_0_0_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0_0__1__Impl"


    // $ANTLR start "rule__XEvent__Group_6_1__0"
    // InternalXMachine.g:2780:1: rule__XEvent__Group_6_1__0 : rule__XEvent__Group_6_1__0__Impl rule__XEvent__Group_6_1__1 ;
    public final void rule__XEvent__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2784:1: ( rule__XEvent__Group_6_1__0__Impl rule__XEvent__Group_6_1__1 )
            // InternalXMachine.g:2785:2: rule__XEvent__Group_6_1__0__Impl rule__XEvent__Group_6_1__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__0"


    // $ANTLR start "rule__XEvent__Group_6_1__0__Impl"
    // InternalXMachine.g:2792:1: rule__XEvent__Group_6_1__0__Impl : ( 'when' ) ;
    public final void rule__XEvent__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2796:1: ( ( 'when' ) )
            // InternalXMachine.g:2797:1: ( 'when' )
            {
            // InternalXMachine.g:2797:1: ( 'when' )
            // InternalXMachine.g:2798:2: 'when'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWhenKeyword_6_1_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWhenKeyword_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__0__Impl"


    // $ANTLR start "rule__XEvent__Group_6_1__1"
    // InternalXMachine.g:2807:1: rule__XEvent__Group_6_1__1 : rule__XEvent__Group_6_1__1__Impl rule__XEvent__Group_6_1__2 ;
    public final void rule__XEvent__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2811:1: ( rule__XEvent__Group_6_1__1__Impl rule__XEvent__Group_6_1__2 )
            // InternalXMachine.g:2812:2: rule__XEvent__Group_6_1__1__Impl rule__XEvent__Group_6_1__2
            {
            pushFollow(FOLLOW_26);
            rule__XEvent__Group_6_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__1"


    // $ANTLR start "rule__XEvent__Group_6_1__1__Impl"
    // InternalXMachine.g:2819:1: rule__XEvent__Group_6_1__1__Impl : ( ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* ) ) ;
    public final void rule__XEvent__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2823:1: ( ( ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* ) ) )
            // InternalXMachine.g:2824:1: ( ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* ) )
            {
            // InternalXMachine.g:2824:1: ( ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* ) )
            // InternalXMachine.g:2825:2: ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* )
            {
            // InternalXMachine.g:2825:2: ( ( rule__XEvent__GuardsAssignment_6_1_1 ) )
            // InternalXMachine.g:2826:3: ( rule__XEvent__GuardsAssignment_6_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsAssignment_6_1_1()); 
            }
            // InternalXMachine.g:2827:3: ( rule__XEvent__GuardsAssignment_6_1_1 )
            // InternalXMachine.g:2827:4: rule__XEvent__GuardsAssignment_6_1_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__GuardsAssignment_6_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGuardsAssignment_6_1_1()); 
            }

            }

            // InternalXMachine.g:2830:2: ( ( rule__XEvent__GuardsAssignment_6_1_1 )* )
            // InternalXMachine.g:2831:3: ( rule__XEvent__GuardsAssignment_6_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsAssignment_6_1_1()); 
            }
            // InternalXMachine.g:2832:3: ( rule__XEvent__GuardsAssignment_6_1_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_XLABEL) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalXMachine.g:2832:4: rule__XEvent__GuardsAssignment_6_1_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__GuardsAssignment_6_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGuardsAssignment_6_1_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__1__Impl"


    // $ANTLR start "rule__XEvent__Group_6_1__2"
    // InternalXMachine.g:2841:1: rule__XEvent__Group_6_1__2 : rule__XEvent__Group_6_1__2__Impl rule__XEvent__Group_6_1__3 ;
    public final void rule__XEvent__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2845:1: ( rule__XEvent__Group_6_1__2__Impl rule__XEvent__Group_6_1__3 )
            // InternalXMachine.g:2846:2: rule__XEvent__Group_6_1__2__Impl rule__XEvent__Group_6_1__3
            {
            pushFollow(FOLLOW_26);
            rule__XEvent__Group_6_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__2"


    // $ANTLR start "rule__XEvent__Group_6_1__2__Impl"
    // InternalXMachine.g:2853:1: rule__XEvent__Group_6_1__2__Impl : ( ( rule__XEvent__Group_6_1_2__0 )? ) ;
    public final void rule__XEvent__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2857:1: ( ( ( rule__XEvent__Group_6_1_2__0 )? ) )
            // InternalXMachine.g:2858:1: ( ( rule__XEvent__Group_6_1_2__0 )? )
            {
            // InternalXMachine.g:2858:1: ( ( rule__XEvent__Group_6_1_2__0 )? )
            // InternalXMachine.g:2859:2: ( rule__XEvent__Group_6_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_6_1_2()); 
            }
            // InternalXMachine.g:2860:2: ( rule__XEvent__Group_6_1_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXMachine.g:2860:3: rule__XEvent__Group_6_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup_6_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__2__Impl"


    // $ANTLR start "rule__XEvent__Group_6_1__3"
    // InternalXMachine.g:2868:1: rule__XEvent__Group_6_1__3 : rule__XEvent__Group_6_1__3__Impl ;
    public final void rule__XEvent__Group_6_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2872:1: ( rule__XEvent__Group_6_1__3__Impl )
            // InternalXMachine.g:2873:2: rule__XEvent__Group_6_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__3"


    // $ANTLR start "rule__XEvent__Group_6_1__3__Impl"
    // InternalXMachine.g:2879:1: rule__XEvent__Group_6_1__3__Impl : ( ( rule__XEvent__Group_6_1_3__0 )? ) ;
    public final void rule__XEvent__Group_6_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2883:1: ( ( ( rule__XEvent__Group_6_1_3__0 )? ) )
            // InternalXMachine.g:2884:1: ( ( rule__XEvent__Group_6_1_3__0 )? )
            {
            // InternalXMachine.g:2884:1: ( ( rule__XEvent__Group_6_1_3__0 )? )
            // InternalXMachine.g:2885:2: ( rule__XEvent__Group_6_1_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_6_1_3()); 
            }
            // InternalXMachine.g:2886:2: ( rule__XEvent__Group_6_1_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXMachine.g:2886:3: rule__XEvent__Group_6_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup_6_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__3__Impl"


    // $ANTLR start "rule__XEvent__Group_6_1_2__0"
    // InternalXMachine.g:2895:1: rule__XEvent__Group_6_1_2__0 : rule__XEvent__Group_6_1_2__0__Impl rule__XEvent__Group_6_1_2__1 ;
    public final void rule__XEvent__Group_6_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2899:1: ( rule__XEvent__Group_6_1_2__0__Impl rule__XEvent__Group_6_1_2__1 )
            // InternalXMachine.g:2900:2: rule__XEvent__Group_6_1_2__0__Impl rule__XEvent__Group_6_1_2__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1_2__0"


    // $ANTLR start "rule__XEvent__Group_6_1_2__0__Impl"
    // InternalXMachine.g:2907:1: rule__XEvent__Group_6_1_2__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_6_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2911:1: ( ( 'with' ) )
            // InternalXMachine.g:2912:1: ( 'with' )
            {
            // InternalXMachine.g:2912:1: ( 'with' )
            // InternalXMachine.g:2913:2: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWithKeyword_6_1_2_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWithKeyword_6_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1_2__0__Impl"


    // $ANTLR start "rule__XEvent__Group_6_1_2__1"
    // InternalXMachine.g:2922:1: rule__XEvent__Group_6_1_2__1 : rule__XEvent__Group_6_1_2__1__Impl ;
    public final void rule__XEvent__Group_6_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2926:1: ( rule__XEvent__Group_6_1_2__1__Impl )
            // InternalXMachine.g:2927:2: rule__XEvent__Group_6_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1_2__1"


    // $ANTLR start "rule__XEvent__Group_6_1_2__1__Impl"
    // InternalXMachine.g:2933:1: rule__XEvent__Group_6_1_2__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* ) ) ;
    public final void rule__XEvent__Group_6_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2937:1: ( ( ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* ) ) )
            // InternalXMachine.g:2938:1: ( ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* ) )
            {
            // InternalXMachine.g:2938:1: ( ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* ) )
            // InternalXMachine.g:2939:2: ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* )
            {
            // InternalXMachine.g:2939:2: ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) )
            // InternalXMachine.g:2940:3: ( rule__XEvent__WitnessesAssignment_6_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_1_2_1()); 
            }
            // InternalXMachine.g:2941:3: ( rule__XEvent__WitnessesAssignment_6_1_2_1 )
            // InternalXMachine.g:2941:4: rule__XEvent__WitnessesAssignment_6_1_2_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_6_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_1_2_1()); 
            }

            }

            // InternalXMachine.g:2944:2: ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* )
            // InternalXMachine.g:2945:3: ( rule__XEvent__WitnessesAssignment_6_1_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_1_2_1()); 
            }
            // InternalXMachine.g:2946:3: ( rule__XEvent__WitnessesAssignment_6_1_2_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_XLABEL) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalXMachine.g:2946:4: rule__XEvent__WitnessesAssignment_6_1_2_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_6_1_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_1_2_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1_2__1__Impl"


    // $ANTLR start "rule__XEvent__Group_6_1_3__0"
    // InternalXMachine.g:2956:1: rule__XEvent__Group_6_1_3__0 : rule__XEvent__Group_6_1_3__0__Impl rule__XEvent__Group_6_1_3__1 ;
    public final void rule__XEvent__Group_6_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2960:1: ( rule__XEvent__Group_6_1_3__0__Impl rule__XEvent__Group_6_1_3__1 )
            // InternalXMachine.g:2961:2: rule__XEvent__Group_6_1_3__0__Impl rule__XEvent__Group_6_1_3__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1_3__0"


    // $ANTLR start "rule__XEvent__Group_6_1_3__0__Impl"
    // InternalXMachine.g:2968:1: rule__XEvent__Group_6_1_3__0__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_6_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2972:1: ( ( 'then' ) )
            // InternalXMachine.g:2973:1: ( 'then' )
            {
            // InternalXMachine.g:2973:1: ( 'then' )
            // InternalXMachine.g:2974:2: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getThenKeyword_6_1_3_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getThenKeyword_6_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1_3__0__Impl"


    // $ANTLR start "rule__XEvent__Group_6_1_3__1"
    // InternalXMachine.g:2983:1: rule__XEvent__Group_6_1_3__1 : rule__XEvent__Group_6_1_3__1__Impl ;
    public final void rule__XEvent__Group_6_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2987:1: ( rule__XEvent__Group_6_1_3__1__Impl )
            // InternalXMachine.g:2988:2: rule__XEvent__Group_6_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1_3__1"


    // $ANTLR start "rule__XEvent__Group_6_1_3__1__Impl"
    // InternalXMachine.g:2994:1: rule__XEvent__Group_6_1_3__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* ) ) ;
    public final void rule__XEvent__Group_6_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2998:1: ( ( ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* ) ) )
            // InternalXMachine.g:2999:1: ( ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* ) )
            {
            // InternalXMachine.g:2999:1: ( ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* ) )
            // InternalXMachine.g:3000:2: ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* )
            {
            // InternalXMachine.g:3000:2: ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) )
            // InternalXMachine.g:3001:3: ( rule__XEvent__ActionsAssignment_6_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_6_1_3_1()); 
            }
            // InternalXMachine.g:3002:3: ( rule__XEvent__ActionsAssignment_6_1_3_1 )
            // InternalXMachine.g:3002:4: rule__XEvent__ActionsAssignment_6_1_3_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_6_1_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getActionsAssignment_6_1_3_1()); 
            }

            }

            // InternalXMachine.g:3005:2: ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* )
            // InternalXMachine.g:3006:3: ( rule__XEvent__ActionsAssignment_6_1_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_6_1_3_1()); 
            }
            // InternalXMachine.g:3007:3: ( rule__XEvent__ActionsAssignment_6_1_3_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_XLABEL) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalXMachine.g:3007:4: rule__XEvent__ActionsAssignment_6_1_3_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_6_1_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getActionsAssignment_6_1_3_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1_3__1__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2__0"
    // InternalXMachine.g:3017:1: rule__XEvent__Group_6_2__0 : rule__XEvent__Group_6_2__0__Impl rule__XEvent__Group_6_2__1 ;
    public final void rule__XEvent__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3021:1: ( rule__XEvent__Group_6_2__0__Impl rule__XEvent__Group_6_2__1 )
            // InternalXMachine.g:3022:2: rule__XEvent__Group_6_2__0__Impl rule__XEvent__Group_6_2__1
            {
            pushFollow(FOLLOW_4);
            rule__XEvent__Group_6_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__0"


    // $ANTLR start "rule__XEvent__Group_6_2__0__Impl"
    // InternalXMachine.g:3029:1: rule__XEvent__Group_6_2__0__Impl : ( 'any' ) ;
    public final void rule__XEvent__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3033:1: ( ( 'any' ) )
            // InternalXMachine.g:3034:1: ( 'any' )
            {
            // InternalXMachine.g:3034:1: ( 'any' )
            // InternalXMachine.g:3035:2: 'any'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAnyKeyword_6_2_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getAnyKeyword_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__0__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2__1"
    // InternalXMachine.g:3044:1: rule__XEvent__Group_6_2__1 : rule__XEvent__Group_6_2__1__Impl rule__XEvent__Group_6_2__2 ;
    public final void rule__XEvent__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3048:1: ( rule__XEvent__Group_6_2__1__Impl rule__XEvent__Group_6_2__2 )
            // InternalXMachine.g:3049:2: rule__XEvent__Group_6_2__1__Impl rule__XEvent__Group_6_2__2
            {
            pushFollow(FOLLOW_27);
            rule__XEvent__Group_6_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__1"


    // $ANTLR start "rule__XEvent__Group_6_2__1__Impl"
    // InternalXMachine.g:3056:1: rule__XEvent__Group_6_2__1__Impl : ( ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* ) ) ;
    public final void rule__XEvent__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3060:1: ( ( ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* ) ) )
            // InternalXMachine.g:3061:1: ( ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* ) )
            {
            // InternalXMachine.g:3061:1: ( ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* ) )
            // InternalXMachine.g:3062:2: ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* )
            {
            // InternalXMachine.g:3062:2: ( ( rule__XEvent__ParametersAssignment_6_2_1 ) )
            // InternalXMachine.g:3063:3: ( rule__XEvent__ParametersAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getParametersAssignment_6_2_1()); 
            }
            // InternalXMachine.g:3064:3: ( rule__XEvent__ParametersAssignment_6_2_1 )
            // InternalXMachine.g:3064:4: rule__XEvent__ParametersAssignment_6_2_1
            {
            pushFollow(FOLLOW_8);
            rule__XEvent__ParametersAssignment_6_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getParametersAssignment_6_2_1()); 
            }

            }

            // InternalXMachine.g:3067:2: ( ( rule__XEvent__ParametersAssignment_6_2_1 )* )
            // InternalXMachine.g:3068:3: ( rule__XEvent__ParametersAssignment_6_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getParametersAssignment_6_2_1()); 
            }
            // InternalXMachine.g:3069:3: ( rule__XEvent__ParametersAssignment_6_2_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalXMachine.g:3069:4: rule__XEvent__ParametersAssignment_6_2_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XEvent__ParametersAssignment_6_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getParametersAssignment_6_2_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__1__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2__2"
    // InternalXMachine.g:3078:1: rule__XEvent__Group_6_2__2 : rule__XEvent__Group_6_2__2__Impl rule__XEvent__Group_6_2__3 ;
    public final void rule__XEvent__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3082:1: ( rule__XEvent__Group_6_2__2__Impl rule__XEvent__Group_6_2__3 )
            // InternalXMachine.g:3083:2: rule__XEvent__Group_6_2__2__Impl rule__XEvent__Group_6_2__3
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__2"


    // $ANTLR start "rule__XEvent__Group_6_2__2__Impl"
    // InternalXMachine.g:3090:1: rule__XEvent__Group_6_2__2__Impl : ( 'where' ) ;
    public final void rule__XEvent__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3094:1: ( ( 'where' ) )
            // InternalXMachine.g:3095:1: ( 'where' )
            {
            // InternalXMachine.g:3095:1: ( 'where' )
            // InternalXMachine.g:3096:2: 'where'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWhereKeyword_6_2_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWhereKeyword_6_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__2__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2__3"
    // InternalXMachine.g:3105:1: rule__XEvent__Group_6_2__3 : rule__XEvent__Group_6_2__3__Impl rule__XEvent__Group_6_2__4 ;
    public final void rule__XEvent__Group_6_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3109:1: ( rule__XEvent__Group_6_2__3__Impl rule__XEvent__Group_6_2__4 )
            // InternalXMachine.g:3110:2: rule__XEvent__Group_6_2__3__Impl rule__XEvent__Group_6_2__4
            {
            pushFollow(FOLLOW_26);
            rule__XEvent__Group_6_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__3"


    // $ANTLR start "rule__XEvent__Group_6_2__3__Impl"
    // InternalXMachine.g:3117:1: rule__XEvent__Group_6_2__3__Impl : ( ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* ) ) ;
    public final void rule__XEvent__Group_6_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3121:1: ( ( ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* ) ) )
            // InternalXMachine.g:3122:1: ( ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* ) )
            {
            // InternalXMachine.g:3122:1: ( ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* ) )
            // InternalXMachine.g:3123:2: ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* )
            {
            // InternalXMachine.g:3123:2: ( ( rule__XEvent__GuardsAssignment_6_2_3 ) )
            // InternalXMachine.g:3124:3: ( rule__XEvent__GuardsAssignment_6_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsAssignment_6_2_3()); 
            }
            // InternalXMachine.g:3125:3: ( rule__XEvent__GuardsAssignment_6_2_3 )
            // InternalXMachine.g:3125:4: rule__XEvent__GuardsAssignment_6_2_3
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__GuardsAssignment_6_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGuardsAssignment_6_2_3()); 
            }

            }

            // InternalXMachine.g:3128:2: ( ( rule__XEvent__GuardsAssignment_6_2_3 )* )
            // InternalXMachine.g:3129:3: ( rule__XEvent__GuardsAssignment_6_2_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsAssignment_6_2_3()); 
            }
            // InternalXMachine.g:3130:3: ( rule__XEvent__GuardsAssignment_6_2_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_XLABEL) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalXMachine.g:3130:4: rule__XEvent__GuardsAssignment_6_2_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__GuardsAssignment_6_2_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGuardsAssignment_6_2_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__3__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2__4"
    // InternalXMachine.g:3139:1: rule__XEvent__Group_6_2__4 : rule__XEvent__Group_6_2__4__Impl rule__XEvent__Group_6_2__5 ;
    public final void rule__XEvent__Group_6_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3143:1: ( rule__XEvent__Group_6_2__4__Impl rule__XEvent__Group_6_2__5 )
            // InternalXMachine.g:3144:2: rule__XEvent__Group_6_2__4__Impl rule__XEvent__Group_6_2__5
            {
            pushFollow(FOLLOW_26);
            rule__XEvent__Group_6_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__4"


    // $ANTLR start "rule__XEvent__Group_6_2__4__Impl"
    // InternalXMachine.g:3151:1: rule__XEvent__Group_6_2__4__Impl : ( ( rule__XEvent__Group_6_2_4__0 )? ) ;
    public final void rule__XEvent__Group_6_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3155:1: ( ( ( rule__XEvent__Group_6_2_4__0 )? ) )
            // InternalXMachine.g:3156:1: ( ( rule__XEvent__Group_6_2_4__0 )? )
            {
            // InternalXMachine.g:3156:1: ( ( rule__XEvent__Group_6_2_4__0 )? )
            // InternalXMachine.g:3157:2: ( rule__XEvent__Group_6_2_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_6_2_4()); 
            }
            // InternalXMachine.g:3158:2: ( rule__XEvent__Group_6_2_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXMachine.g:3158:3: rule__XEvent__Group_6_2_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_2_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup_6_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__4__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2__5"
    // InternalXMachine.g:3166:1: rule__XEvent__Group_6_2__5 : rule__XEvent__Group_6_2__5__Impl ;
    public final void rule__XEvent__Group_6_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3170:1: ( rule__XEvent__Group_6_2__5__Impl )
            // InternalXMachine.g:3171:2: rule__XEvent__Group_6_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__5"


    // $ANTLR start "rule__XEvent__Group_6_2__5__Impl"
    // InternalXMachine.g:3177:1: rule__XEvent__Group_6_2__5__Impl : ( ( rule__XEvent__Group_6_2_5__0 )? ) ;
    public final void rule__XEvent__Group_6_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3181:1: ( ( ( rule__XEvent__Group_6_2_5__0 )? ) )
            // InternalXMachine.g:3182:1: ( ( rule__XEvent__Group_6_2_5__0 )? )
            {
            // InternalXMachine.g:3182:1: ( ( rule__XEvent__Group_6_2_5__0 )? )
            // InternalXMachine.g:3183:2: ( rule__XEvent__Group_6_2_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_6_2_5()); 
            }
            // InternalXMachine.g:3184:2: ( rule__XEvent__Group_6_2_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXMachine.g:3184:3: rule__XEvent__Group_6_2_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_2_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup_6_2_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__5__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2_4__0"
    // InternalXMachine.g:3193:1: rule__XEvent__Group_6_2_4__0 : rule__XEvent__Group_6_2_4__0__Impl rule__XEvent__Group_6_2_4__1 ;
    public final void rule__XEvent__Group_6_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3197:1: ( rule__XEvent__Group_6_2_4__0__Impl rule__XEvent__Group_6_2_4__1 )
            // InternalXMachine.g:3198:2: rule__XEvent__Group_6_2_4__0__Impl rule__XEvent__Group_6_2_4__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_2_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2_4__0"


    // $ANTLR start "rule__XEvent__Group_6_2_4__0__Impl"
    // InternalXMachine.g:3205:1: rule__XEvent__Group_6_2_4__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_6_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3209:1: ( ( 'with' ) )
            // InternalXMachine.g:3210:1: ( 'with' )
            {
            // InternalXMachine.g:3210:1: ( 'with' )
            // InternalXMachine.g:3211:2: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWithKeyword_6_2_4_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWithKeyword_6_2_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2_4__0__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2_4__1"
    // InternalXMachine.g:3220:1: rule__XEvent__Group_6_2_4__1 : rule__XEvent__Group_6_2_4__1__Impl ;
    public final void rule__XEvent__Group_6_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3224:1: ( rule__XEvent__Group_6_2_4__1__Impl )
            // InternalXMachine.g:3225:2: rule__XEvent__Group_6_2_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2_4__1"


    // $ANTLR start "rule__XEvent__Group_6_2_4__1__Impl"
    // InternalXMachine.g:3231:1: rule__XEvent__Group_6_2_4__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* ) ) ;
    public final void rule__XEvent__Group_6_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3235:1: ( ( ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* ) ) )
            // InternalXMachine.g:3236:1: ( ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* ) )
            {
            // InternalXMachine.g:3236:1: ( ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* ) )
            // InternalXMachine.g:3237:2: ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* )
            {
            // InternalXMachine.g:3237:2: ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) )
            // InternalXMachine.g:3238:3: ( rule__XEvent__WitnessesAssignment_6_2_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_2_4_1()); 
            }
            // InternalXMachine.g:3239:3: ( rule__XEvent__WitnessesAssignment_6_2_4_1 )
            // InternalXMachine.g:3239:4: rule__XEvent__WitnessesAssignment_6_2_4_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_6_2_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_2_4_1()); 
            }

            }

            // InternalXMachine.g:3242:2: ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* )
            // InternalXMachine.g:3243:3: ( rule__XEvent__WitnessesAssignment_6_2_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_2_4_1()); 
            }
            // InternalXMachine.g:3244:3: ( rule__XEvent__WitnessesAssignment_6_2_4_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_XLABEL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalXMachine.g:3244:4: rule__XEvent__WitnessesAssignment_6_2_4_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_6_2_4_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_2_4_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2_4__1__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2_5__0"
    // InternalXMachine.g:3254:1: rule__XEvent__Group_6_2_5__0 : rule__XEvent__Group_6_2_5__0__Impl rule__XEvent__Group_6_2_5__1 ;
    public final void rule__XEvent__Group_6_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3258:1: ( rule__XEvent__Group_6_2_5__0__Impl rule__XEvent__Group_6_2_5__1 )
            // InternalXMachine.g:3259:2: rule__XEvent__Group_6_2_5__0__Impl rule__XEvent__Group_6_2_5__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_2_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2_5__0"


    // $ANTLR start "rule__XEvent__Group_6_2_5__0__Impl"
    // InternalXMachine.g:3266:1: rule__XEvent__Group_6_2_5__0__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_6_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3270:1: ( ( 'then' ) )
            // InternalXMachine.g:3271:1: ( 'then' )
            {
            // InternalXMachine.g:3271:1: ( 'then' )
            // InternalXMachine.g:3272:2: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getThenKeyword_6_2_5_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getThenKeyword_6_2_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2_5__0__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2_5__1"
    // InternalXMachine.g:3281:1: rule__XEvent__Group_6_2_5__1 : rule__XEvent__Group_6_2_5__1__Impl ;
    public final void rule__XEvent__Group_6_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3285:1: ( rule__XEvent__Group_6_2_5__1__Impl )
            // InternalXMachine.g:3286:2: rule__XEvent__Group_6_2_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2_5__1"


    // $ANTLR start "rule__XEvent__Group_6_2_5__1__Impl"
    // InternalXMachine.g:3292:1: rule__XEvent__Group_6_2_5__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* ) ) ;
    public final void rule__XEvent__Group_6_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3296:1: ( ( ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* ) ) )
            // InternalXMachine.g:3297:1: ( ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* ) )
            {
            // InternalXMachine.g:3297:1: ( ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* ) )
            // InternalXMachine.g:3298:2: ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* )
            {
            // InternalXMachine.g:3298:2: ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) )
            // InternalXMachine.g:3299:3: ( rule__XEvent__ActionsAssignment_6_2_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_6_2_5_1()); 
            }
            // InternalXMachine.g:3300:3: ( rule__XEvent__ActionsAssignment_6_2_5_1 )
            // InternalXMachine.g:3300:4: rule__XEvent__ActionsAssignment_6_2_5_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_6_2_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getActionsAssignment_6_2_5_1()); 
            }

            }

            // InternalXMachine.g:3303:2: ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* )
            // InternalXMachine.g:3304:3: ( rule__XEvent__ActionsAssignment_6_2_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_6_2_5_1()); 
            }
            // InternalXMachine.g:3305:3: ( rule__XEvent__ActionsAssignment_6_2_5_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_XLABEL) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalXMachine.g:3305:4: rule__XEvent__ActionsAssignment_6_2_5_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_6_2_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getActionsAssignment_6_2_5_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2_5__1__Impl"


    // $ANTLR start "rule__EventSync__Group__0"
    // InternalXMachine.g:3315:1: rule__EventSync__Group__0 : rule__EventSync__Group__0__Impl rule__EventSync__Group__1 ;
    public final void rule__EventSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3319:1: ( rule__EventSync__Group__0__Impl rule__EventSync__Group__1 )
            // InternalXMachine.g:3320:2: rule__EventSync__Group__0__Impl rule__EventSync__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__EventSync__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventSync__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group__0"


    // $ANTLR start "rule__EventSync__Group__0__Impl"
    // InternalXMachine.g:3327:1: rule__EventSync__Group__0__Impl : ( () ) ;
    public final void rule__EventSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3331:1: ( ( () ) )
            // InternalXMachine.g:3332:1: ( () )
            {
            // InternalXMachine.g:3332:1: ( () )
            // InternalXMachine.g:3333:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 
            }
            // InternalXMachine.g:3334:2: ()
            // InternalXMachine.g:3334:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group__0__Impl"


    // $ANTLR start "rule__EventSync__Group__1"
    // InternalXMachine.g:3342:1: rule__EventSync__Group__1 : rule__EventSync__Group__1__Impl ;
    public final void rule__EventSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3346:1: ( rule__EventSync__Group__1__Impl )
            // InternalXMachine.g:3347:2: rule__EventSync__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group__1"


    // $ANTLR start "rule__EventSync__Group__1__Impl"
    // InternalXMachine.g:3353:1: rule__EventSync__Group__1__Impl : ( ( rule__EventSync__Group_1__0 ) ) ;
    public final void rule__EventSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3357:1: ( ( ( rule__EventSync__Group_1__0 ) ) )
            // InternalXMachine.g:3358:1: ( ( rule__EventSync__Group_1__0 ) )
            {
            // InternalXMachine.g:3358:1: ( ( rule__EventSync__Group_1__0 ) )
            // InternalXMachine.g:3359:2: ( rule__EventSync__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup_1()); 
            }
            // InternalXMachine.g:3360:2: ( rule__EventSync__Group_1__0 )
            // InternalXMachine.g:3360:3: rule__EventSync__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group__1__Impl"


    // $ANTLR start "rule__EventSync__Group_1__0"
    // InternalXMachine.g:3369:1: rule__EventSync__Group_1__0 : rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 ;
    public final void rule__EventSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3373:1: ( rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 )
            // InternalXMachine.g:3374:2: rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__EventSync__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__0"


    // $ANTLR start "rule__EventSync__Group_1__0__Impl"
    // InternalXMachine.g:3381:1: rule__EventSync__Group_1__0__Impl : ( 'synchronises' ) ;
    public final void rule__EventSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3385:1: ( ( 'synchronises' ) )
            // InternalXMachine.g:3386:1: ( 'synchronises' )
            {
            // InternalXMachine.g:3386:1: ( 'synchronises' )
            // InternalXMachine.g:3387:2: 'synchronises'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__0__Impl"


    // $ANTLR start "rule__EventSync__Group_1__1"
    // InternalXMachine.g:3396:1: rule__EventSync__Group_1__1 : rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 ;
    public final void rule__EventSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3400:1: ( rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 )
            // InternalXMachine.g:3401:2: rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__EventSync__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__1"


    // $ANTLR start "rule__EventSync__Group_1__1__Impl"
    // InternalXMachine.g:3408:1: rule__EventSync__Group_1__1__Impl : ( ( rule__EventSync__Group_1_1__0 )? ) ;
    public final void rule__EventSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3412:1: ( ( ( rule__EventSync__Group_1_1__0 )? ) )
            // InternalXMachine.g:3413:1: ( ( rule__EventSync__Group_1_1__0 )? )
            {
            // InternalXMachine.g:3413:1: ( ( rule__EventSync__Group_1_1__0 )? )
            // InternalXMachine.g:3414:2: ( rule__EventSync__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup_1_1()); 
            }
            // InternalXMachine.g:3415:2: ( rule__EventSync__Group_1_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==28) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalXMachine.g:3415:3: rule__EventSync__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventSync__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__1__Impl"


    // $ANTLR start "rule__EventSync__Group_1__2"
    // InternalXMachine.g:3423:1: rule__EventSync__Group_1__2 : rule__EventSync__Group_1__2__Impl ;
    public final void rule__EventSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3427:1: ( rule__EventSync__Group_1__2__Impl )
            // InternalXMachine.g:3428:2: rule__EventSync__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__2"


    // $ANTLR start "rule__EventSync__Group_1__2__Impl"
    // InternalXMachine.g:3434:1: rule__EventSync__Group_1__2__Impl : ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) ;
    public final void rule__EventSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3438:1: ( ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) )
            // InternalXMachine.g:3439:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            {
            // InternalXMachine.g:3439:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            // InternalXMachine.g:3440:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2()); 
            }
            // InternalXMachine.g:3441:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            // InternalXMachine.g:3441:3: rule__EventSync__SynchronisedEventAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__SynchronisedEventAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__2__Impl"


    // $ANTLR start "rule__EventSync__Group_1_1__0"
    // InternalXMachine.g:3450:1: rule__EventSync__Group_1_1__0 : rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 ;
    public final void rule__EventSync__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3454:1: ( rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 )
            // InternalXMachine.g:3455:2: rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1
            {
            pushFollow(FOLLOW_15);
            rule__EventSync__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1_1__0"


    // $ANTLR start "rule__EventSync__Group_1_1__0__Impl"
    // InternalXMachine.g:3462:1: rule__EventSync__Group_1_1__0__Impl : ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) ;
    public final void rule__EventSync__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3466:1: ( ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) )
            // InternalXMachine.g:3467:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            {
            // InternalXMachine.g:3467:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            // InternalXMachine.g:3468:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0()); 
            }
            // InternalXMachine.g:3469:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            // InternalXMachine.g:3469:3: rule__EventSync__PrefixAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__PrefixAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1_1__0__Impl"


    // $ANTLR start "rule__EventSync__Group_1_1__1"
    // InternalXMachine.g:3477:1: rule__EventSync__Group_1_1__1 : rule__EventSync__Group_1_1__1__Impl ;
    public final void rule__EventSync__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3481:1: ( rule__EventSync__Group_1_1__1__Impl )
            // InternalXMachine.g:3482:2: rule__EventSync__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1_1__1"


    // $ANTLR start "rule__EventSync__Group_1_1__1__Impl"
    // InternalXMachine.g:3488:1: rule__EventSync__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__EventSync__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3492:1: ( ( '.' ) )
            // InternalXMachine.g:3493:1: ( '.' )
            {
            // InternalXMachine.g:3493:1: ( '.' )
            // InternalXMachine.g:3494:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1_1__1__Impl"


    // $ANTLR start "rule__GroupSync__Group__0"
    // InternalXMachine.g:3504:1: rule__GroupSync__Group__0 : rule__GroupSync__Group__0__Impl rule__GroupSync__Group__1 ;
    public final void rule__GroupSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3508:1: ( rule__GroupSync__Group__0__Impl rule__GroupSync__Group__1 )
            // InternalXMachine.g:3509:2: rule__GroupSync__Group__0__Impl rule__GroupSync__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__GroupSync__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group__0"


    // $ANTLR start "rule__GroupSync__Group__0__Impl"
    // InternalXMachine.g:3516:1: rule__GroupSync__Group__0__Impl : ( () ) ;
    public final void rule__GroupSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3520:1: ( ( () ) )
            // InternalXMachine.g:3521:1: ( () )
            {
            // InternalXMachine.g:3521:1: ( () )
            // InternalXMachine.g:3522:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getEventSynchronisationAction_0()); 
            }
            // InternalXMachine.g:3523:2: ()
            // InternalXMachine.g:3523:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getEventSynchronisationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group__0__Impl"


    // $ANTLR start "rule__GroupSync__Group__1"
    // InternalXMachine.g:3531:1: rule__GroupSync__Group__1 : rule__GroupSync__Group__1__Impl rule__GroupSync__Group__2 ;
    public final void rule__GroupSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3535:1: ( rule__GroupSync__Group__1__Impl rule__GroupSync__Group__2 )
            // InternalXMachine.g:3536:2: rule__GroupSync__Group__1__Impl rule__GroupSync__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__GroupSync__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group__1"


    // $ANTLR start "rule__GroupSync__Group__1__Impl"
    // InternalXMachine.g:3543:1: rule__GroupSync__Group__1__Impl : ( ( rule__GroupSync__Group_1__0 ) ) ;
    public final void rule__GroupSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3547:1: ( ( ( rule__GroupSync__Group_1__0 ) ) )
            // InternalXMachine.g:3548:1: ( ( rule__GroupSync__Group_1__0 ) )
            {
            // InternalXMachine.g:3548:1: ( ( rule__GroupSync__Group_1__0 ) )
            // InternalXMachine.g:3549:2: ( rule__GroupSync__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getGroup_1()); 
            }
            // InternalXMachine.g:3550:2: ( rule__GroupSync__Group_1__0 )
            // InternalXMachine.g:3550:3: rule__GroupSync__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group__1__Impl"


    // $ANTLR start "rule__GroupSync__Group__2"
    // InternalXMachine.g:3558:1: rule__GroupSync__Group__2 : rule__GroupSync__Group__2__Impl ;
    public final void rule__GroupSync__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3562:1: ( rule__GroupSync__Group__2__Impl )
            // InternalXMachine.g:3563:2: rule__GroupSync__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group__2"


    // $ANTLR start "rule__GroupSync__Group__2__Impl"
    // InternalXMachine.g:3569:1: rule__GroupSync__Group__2__Impl : ( ( rule__GroupSync__Group_2__0 )? ) ;
    public final void rule__GroupSync__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3573:1: ( ( ( rule__GroupSync__Group_2__0 )? ) )
            // InternalXMachine.g:3574:1: ( ( rule__GroupSync__Group_2__0 )? )
            {
            // InternalXMachine.g:3574:1: ( ( rule__GroupSync__Group_2__0 )? )
            // InternalXMachine.g:3575:2: ( rule__GroupSync__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getGroup_2()); 
            }
            // InternalXMachine.g:3576:2: ( rule__GroupSync__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==30) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXMachine.g:3576:3: rule__GroupSync__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroupSync__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group__2__Impl"


    // $ANTLR start "rule__GroupSync__Group_1__0"
    // InternalXMachine.g:3585:1: rule__GroupSync__Group_1__0 : rule__GroupSync__Group_1__0__Impl rule__GroupSync__Group_1__1 ;
    public final void rule__GroupSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3589:1: ( rule__GroupSync__Group_1__0__Impl rule__GroupSync__Group_1__1 )
            // InternalXMachine.g:3590:2: rule__GroupSync__Group_1__0__Impl rule__GroupSync__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__GroupSync__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_1__0"


    // $ANTLR start "rule__GroupSync__Group_1__0__Impl"
    // InternalXMachine.g:3597:1: rule__GroupSync__Group_1__0__Impl : ( 'synchronises' ) ;
    public final void rule__GroupSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3601:1: ( ( 'synchronises' ) )
            // InternalXMachine.g:3602:1: ( 'synchronises' )
            {
            // InternalXMachine.g:3602:1: ( 'synchronises' )
            // InternalXMachine.g:3603:2: 'synchronises'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getSynchronisesKeyword_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getSynchronisesKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_1__0__Impl"


    // $ANTLR start "rule__GroupSync__Group_1__1"
    // InternalXMachine.g:3612:1: rule__GroupSync__Group_1__1 : rule__GroupSync__Group_1__1__Impl rule__GroupSync__Group_1__2 ;
    public final void rule__GroupSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3616:1: ( rule__GroupSync__Group_1__1__Impl rule__GroupSync__Group_1__2 )
            // InternalXMachine.g:3617:2: rule__GroupSync__Group_1__1__Impl rule__GroupSync__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__GroupSync__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_1__1"


    // $ANTLR start "rule__GroupSync__Group_1__1__Impl"
    // InternalXMachine.g:3624:1: rule__GroupSync__Group_1__1__Impl : ( 'group' ) ;
    public final void rule__GroupSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3628:1: ( ( 'group' ) )
            // InternalXMachine.g:3629:1: ( 'group' )
            {
            // InternalXMachine.g:3629:1: ( 'group' )
            // InternalXMachine.g:3630:2: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getGroupKeyword_1_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getGroupKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_1__1__Impl"


    // $ANTLR start "rule__GroupSync__Group_1__2"
    // InternalXMachine.g:3639:1: rule__GroupSync__Group_1__2 : rule__GroupSync__Group_1__2__Impl rule__GroupSync__Group_1__3 ;
    public final void rule__GroupSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3643:1: ( rule__GroupSync__Group_1__2__Impl rule__GroupSync__Group_1__3 )
            // InternalXMachine.g:3644:2: rule__GroupSync__Group_1__2__Impl rule__GroupSync__Group_1__3
            {
            pushFollow(FOLLOW_4);
            rule__GroupSync__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_1__2"


    // $ANTLR start "rule__GroupSync__Group_1__2__Impl"
    // InternalXMachine.g:3651:1: rule__GroupSync__Group_1__2__Impl : ( ( rule__GroupSync__Group_1_2__0 )? ) ;
    public final void rule__GroupSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3655:1: ( ( ( rule__GroupSync__Group_1_2__0 )? ) )
            // InternalXMachine.g:3656:1: ( ( rule__GroupSync__Group_1_2__0 )? )
            {
            // InternalXMachine.g:3656:1: ( ( rule__GroupSync__Group_1_2__0 )? )
            // InternalXMachine.g:3657:2: ( rule__GroupSync__Group_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getGroup_1_2()); 
            }
            // InternalXMachine.g:3658:2: ( rule__GroupSync__Group_1_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==28) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalXMachine.g:3658:3: rule__GroupSync__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroupSync__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_1__2__Impl"


    // $ANTLR start "rule__GroupSync__Group_1__3"
    // InternalXMachine.g:3666:1: rule__GroupSync__Group_1__3 : rule__GroupSync__Group_1__3__Impl ;
    public final void rule__GroupSync__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3670:1: ( rule__GroupSync__Group_1__3__Impl )
            // InternalXMachine.g:3671:2: rule__GroupSync__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_1__3"


    // $ANTLR start "rule__GroupSync__Group_1__3__Impl"
    // InternalXMachine.g:3677:1: rule__GroupSync__Group_1__3__Impl : ( ( rule__GroupSync__SynchronisedCasesAssignment_1_3 ) ) ;
    public final void rule__GroupSync__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3681:1: ( ( ( rule__GroupSync__SynchronisedCasesAssignment_1_3 ) ) )
            // InternalXMachine.g:3682:1: ( ( rule__GroupSync__SynchronisedCasesAssignment_1_3 ) )
            {
            // InternalXMachine.g:3682:1: ( ( rule__GroupSync__SynchronisedCasesAssignment_1_3 ) )
            // InternalXMachine.g:3683:2: ( rule__GroupSync__SynchronisedCasesAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getSynchronisedCasesAssignment_1_3()); 
            }
            // InternalXMachine.g:3684:2: ( rule__GroupSync__SynchronisedCasesAssignment_1_3 )
            // InternalXMachine.g:3684:3: rule__GroupSync__SynchronisedCasesAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__SynchronisedCasesAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getSynchronisedCasesAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_1__3__Impl"


    // $ANTLR start "rule__GroupSync__Group_1_2__0"
    // InternalXMachine.g:3693:1: rule__GroupSync__Group_1_2__0 : rule__GroupSync__Group_1_2__0__Impl rule__GroupSync__Group_1_2__1 ;
    public final void rule__GroupSync__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3697:1: ( rule__GroupSync__Group_1_2__0__Impl rule__GroupSync__Group_1_2__1 )
            // InternalXMachine.g:3698:2: rule__GroupSync__Group_1_2__0__Impl rule__GroupSync__Group_1_2__1
            {
            pushFollow(FOLLOW_15);
            rule__GroupSync__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_1_2__0"


    // $ANTLR start "rule__GroupSync__Group_1_2__0__Impl"
    // InternalXMachine.g:3705:1: rule__GroupSync__Group_1_2__0__Impl : ( ( rule__GroupSync__PrefixAssignment_1_2_0 ) ) ;
    public final void rule__GroupSync__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3709:1: ( ( ( rule__GroupSync__PrefixAssignment_1_2_0 ) ) )
            // InternalXMachine.g:3710:1: ( ( rule__GroupSync__PrefixAssignment_1_2_0 ) )
            {
            // InternalXMachine.g:3710:1: ( ( rule__GroupSync__PrefixAssignment_1_2_0 ) )
            // InternalXMachine.g:3711:2: ( rule__GroupSync__PrefixAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getPrefixAssignment_1_2_0()); 
            }
            // InternalXMachine.g:3712:2: ( rule__GroupSync__PrefixAssignment_1_2_0 )
            // InternalXMachine.g:3712:3: rule__GroupSync__PrefixAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__PrefixAssignment_1_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getPrefixAssignment_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_1_2__0__Impl"


    // $ANTLR start "rule__GroupSync__Group_1_2__1"
    // InternalXMachine.g:3720:1: rule__GroupSync__Group_1_2__1 : rule__GroupSync__Group_1_2__1__Impl ;
    public final void rule__GroupSync__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3724:1: ( rule__GroupSync__Group_1_2__1__Impl )
            // InternalXMachine.g:3725:2: rule__GroupSync__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_1_2__1"


    // $ANTLR start "rule__GroupSync__Group_1_2__1__Impl"
    // InternalXMachine.g:3731:1: rule__GroupSync__Group_1_2__1__Impl : ( '.' ) ;
    public final void rule__GroupSync__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3735:1: ( ( '.' ) )
            // InternalXMachine.g:3736:1: ( '.' )
            {
            // InternalXMachine.g:3736:1: ( '.' )
            // InternalXMachine.g:3737:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getFullStopKeyword_1_2_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getFullStopKeyword_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_1_2__1__Impl"


    // $ANTLR start "rule__GroupSync__Group_2__0"
    // InternalXMachine.g:3747:1: rule__GroupSync__Group_2__0 : rule__GroupSync__Group_2__0__Impl rule__GroupSync__Group_2__1 ;
    public final void rule__GroupSync__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3751:1: ( rule__GroupSync__Group_2__0__Impl rule__GroupSync__Group_2__1 )
            // InternalXMachine.g:3752:2: rule__GroupSync__Group_2__0__Impl rule__GroupSync__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__GroupSync__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_2__0"


    // $ANTLR start "rule__GroupSync__Group_2__0__Impl"
    // InternalXMachine.g:3759:1: rule__GroupSync__Group_2__0__Impl : ( '(' ) ;
    public final void rule__GroupSync__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3763:1: ( ( '(' ) )
            // InternalXMachine.g:3764:1: ( '(' )
            {
            // InternalXMachine.g:3764:1: ( '(' )
            // InternalXMachine.g:3765:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_2__0__Impl"


    // $ANTLR start "rule__GroupSync__Group_2__1"
    // InternalXMachine.g:3774:1: rule__GroupSync__Group_2__1 : rule__GroupSync__Group_2__1__Impl rule__GroupSync__Group_2__2 ;
    public final void rule__GroupSync__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3778:1: ( rule__GroupSync__Group_2__1__Impl rule__GroupSync__Group_2__2 )
            // InternalXMachine.g:3779:2: rule__GroupSync__Group_2__1__Impl rule__GroupSync__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__GroupSync__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_2__1"


    // $ANTLR start "rule__GroupSync__Group_2__1__Impl"
    // InternalXMachine.g:3786:1: rule__GroupSync__Group_2__1__Impl : ( ( rule__GroupSync__ActualParametersAssignment_2_1 ) ) ;
    public final void rule__GroupSync__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3790:1: ( ( ( rule__GroupSync__ActualParametersAssignment_2_1 ) ) )
            // InternalXMachine.g:3791:1: ( ( rule__GroupSync__ActualParametersAssignment_2_1 ) )
            {
            // InternalXMachine.g:3791:1: ( ( rule__GroupSync__ActualParametersAssignment_2_1 ) )
            // InternalXMachine.g:3792:2: ( rule__GroupSync__ActualParametersAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getActualParametersAssignment_2_1()); 
            }
            // InternalXMachine.g:3793:2: ( rule__GroupSync__ActualParametersAssignment_2_1 )
            // InternalXMachine.g:3793:3: rule__GroupSync__ActualParametersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__ActualParametersAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getActualParametersAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_2__1__Impl"


    // $ANTLR start "rule__GroupSync__Group_2__2"
    // InternalXMachine.g:3801:1: rule__GroupSync__Group_2__2 : rule__GroupSync__Group_2__2__Impl rule__GroupSync__Group_2__3 ;
    public final void rule__GroupSync__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3805:1: ( rule__GroupSync__Group_2__2__Impl rule__GroupSync__Group_2__3 )
            // InternalXMachine.g:3806:2: rule__GroupSync__Group_2__2__Impl rule__GroupSync__Group_2__3
            {
            pushFollow(FOLLOW_20);
            rule__GroupSync__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_2__2"


    // $ANTLR start "rule__GroupSync__Group_2__2__Impl"
    // InternalXMachine.g:3813:1: rule__GroupSync__Group_2__2__Impl : ( ( rule__GroupSync__Group_2_2__0 )* ) ;
    public final void rule__GroupSync__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3817:1: ( ( ( rule__GroupSync__Group_2_2__0 )* ) )
            // InternalXMachine.g:3818:1: ( ( rule__GroupSync__Group_2_2__0 )* )
            {
            // InternalXMachine.g:3818:1: ( ( rule__GroupSync__Group_2_2__0 )* )
            // InternalXMachine.g:3819:2: ( rule__GroupSync__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getGroup_2_2()); 
            }
            // InternalXMachine.g:3820:2: ( rule__GroupSync__Group_2_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==32) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalXMachine.g:3820:3: rule__GroupSync__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__GroupSync__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_2__2__Impl"


    // $ANTLR start "rule__GroupSync__Group_2__3"
    // InternalXMachine.g:3828:1: rule__GroupSync__Group_2__3 : rule__GroupSync__Group_2__3__Impl ;
    public final void rule__GroupSync__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3832:1: ( rule__GroupSync__Group_2__3__Impl )
            // InternalXMachine.g:3833:2: rule__GroupSync__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_2__3"


    // $ANTLR start "rule__GroupSync__Group_2__3__Impl"
    // InternalXMachine.g:3839:1: rule__GroupSync__Group_2__3__Impl : ( ')' ) ;
    public final void rule__GroupSync__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3843:1: ( ( ')' ) )
            // InternalXMachine.g:3844:1: ( ')' )
            {
            // InternalXMachine.g:3844:1: ( ')' )
            // InternalXMachine.g:3845:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_2__3__Impl"


    // $ANTLR start "rule__GroupSync__Group_2_2__0"
    // InternalXMachine.g:3855:1: rule__GroupSync__Group_2_2__0 : rule__GroupSync__Group_2_2__0__Impl rule__GroupSync__Group_2_2__1 ;
    public final void rule__GroupSync__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3859:1: ( rule__GroupSync__Group_2_2__0__Impl rule__GroupSync__Group_2_2__1 )
            // InternalXMachine.g:3860:2: rule__GroupSync__Group_2_2__0__Impl rule__GroupSync__Group_2_2__1
            {
            pushFollow(FOLLOW_4);
            rule__GroupSync__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_2_2__0"


    // $ANTLR start "rule__GroupSync__Group_2_2__0__Impl"
    // InternalXMachine.g:3867:1: rule__GroupSync__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__GroupSync__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3871:1: ( ( ',' ) )
            // InternalXMachine.g:3872:1: ( ',' )
            {
            // InternalXMachine.g:3872:1: ( ',' )
            // InternalXMachine.g:3873:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_2_2__0__Impl"


    // $ANTLR start "rule__GroupSync__Group_2_2__1"
    // InternalXMachine.g:3882:1: rule__GroupSync__Group_2_2__1 : rule__GroupSync__Group_2_2__1__Impl ;
    public final void rule__GroupSync__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3886:1: ( rule__GroupSync__Group_2_2__1__Impl )
            // InternalXMachine.g:3887:2: rule__GroupSync__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_2_2__1"


    // $ANTLR start "rule__GroupSync__Group_2_2__1__Impl"
    // InternalXMachine.g:3893:1: rule__GroupSync__Group_2_2__1__Impl : ( ( rule__GroupSync__ActualParametersAssignment_2_2_1 ) ) ;
    public final void rule__GroupSync__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3897:1: ( ( ( rule__GroupSync__ActualParametersAssignment_2_2_1 ) ) )
            // InternalXMachine.g:3898:1: ( ( rule__GroupSync__ActualParametersAssignment_2_2_1 ) )
            {
            // InternalXMachine.g:3898:1: ( ( rule__GroupSync__ActualParametersAssignment_2_2_1 ) )
            // InternalXMachine.g:3899:2: ( rule__GroupSync__ActualParametersAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getActualParametersAssignment_2_2_1()); 
            }
            // InternalXMachine.g:3900:2: ( rule__GroupSync__ActualParametersAssignment_2_2_1 )
            // InternalXMachine.g:3900:3: rule__GroupSync__ActualParametersAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__ActualParametersAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getActualParametersAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_2_2__1__Impl"


    // $ANTLR start "rule__XParameter__Group__0"
    // InternalXMachine.g:3909:1: rule__XParameter__Group__0 : rule__XParameter__Group__0__Impl rule__XParameter__Group__1 ;
    public final void rule__XParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3913:1: ( rule__XParameter__Group__0__Impl rule__XParameter__Group__1 )
            // InternalXMachine.g:3914:2: rule__XParameter__Group__0__Impl rule__XParameter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__XParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XParameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__Group__0"


    // $ANTLR start "rule__XParameter__Group__0__Impl"
    // InternalXMachine.g:3921:1: rule__XParameter__Group__0__Impl : ( () ) ;
    public final void rule__XParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3925:1: ( ( () ) )
            // InternalXMachine.g:3926:1: ( () )
            {
            // InternalXMachine.g:3926:1: ( () )
            // InternalXMachine.g:3927:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getParameterAction_0()); 
            }
            // InternalXMachine.g:3928:2: ()
            // InternalXMachine.g:3928:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXParameterAccess().getParameterAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__Group__0__Impl"


    // $ANTLR start "rule__XParameter__Group__1"
    // InternalXMachine.g:3936:1: rule__XParameter__Group__1 : rule__XParameter__Group__1__Impl ;
    public final void rule__XParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3940:1: ( rule__XParameter__Group__1__Impl )
            // InternalXMachine.g:3941:2: rule__XParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__Group__1"


    // $ANTLR start "rule__XParameter__Group__1__Impl"
    // InternalXMachine.g:3947:1: rule__XParameter__Group__1__Impl : ( ( rule__XParameter__NameAssignment_1 ) ) ;
    public final void rule__XParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3951:1: ( ( ( rule__XParameter__NameAssignment_1 ) ) )
            // InternalXMachine.g:3952:1: ( ( rule__XParameter__NameAssignment_1 ) )
            {
            // InternalXMachine.g:3952:1: ( ( rule__XParameter__NameAssignment_1 ) )
            // InternalXMachine.g:3953:2: ( rule__XParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:3954:2: ( rule__XParameter__NameAssignment_1 )
            // InternalXMachine.g:3954:3: rule__XParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXParameterAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__Group__1__Impl"


    // $ANTLR start "rule__XGuard__Group__0"
    // InternalXMachine.g:3963:1: rule__XGuard__Group__0 : rule__XGuard__Group__0__Impl rule__XGuard__Group__1 ;
    public final void rule__XGuard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3967:1: ( rule__XGuard__Group__0__Impl rule__XGuard__Group__1 )
            // InternalXMachine.g:3968:2: rule__XGuard__Group__0__Impl rule__XGuard__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XGuard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__0"


    // $ANTLR start "rule__XGuard__Group__0__Impl"
    // InternalXMachine.g:3975:1: rule__XGuard__Group__0__Impl : ( () ) ;
    public final void rule__XGuard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3979:1: ( ( () ) )
            // InternalXMachine.g:3980:1: ( () )
            {
            // InternalXMachine.g:3980:1: ( () )
            // InternalXMachine.g:3981:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getGuardAction_0()); 
            }
            // InternalXMachine.g:3982:2: ()
            // InternalXMachine.g:3982:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getGuardAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__0__Impl"


    // $ANTLR start "rule__XGuard__Group__1"
    // InternalXMachine.g:3990:1: rule__XGuard__Group__1 : rule__XGuard__Group__1__Impl rule__XGuard__Group__2 ;
    public final void rule__XGuard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3994:1: ( rule__XGuard__Group__1__Impl rule__XGuard__Group__2 )
            // InternalXMachine.g:3995:2: rule__XGuard__Group__1__Impl rule__XGuard__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XGuard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__1"


    // $ANTLR start "rule__XGuard__Group__1__Impl"
    // InternalXMachine.g:4002:1: rule__XGuard__Group__1__Impl : ( ( rule__XGuard__NameAssignment_1 ) ) ;
    public final void rule__XGuard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4006:1: ( ( ( rule__XGuard__NameAssignment_1 ) ) )
            // InternalXMachine.g:4007:1: ( ( rule__XGuard__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4007:1: ( ( rule__XGuard__NameAssignment_1 ) )
            // InternalXMachine.g:4008:2: ( rule__XGuard__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:4009:2: ( rule__XGuard__NameAssignment_1 )
            // InternalXMachine.g:4009:3: rule__XGuard__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__1__Impl"


    // $ANTLR start "rule__XGuard__Group__2"
    // InternalXMachine.g:4017:1: rule__XGuard__Group__2 : rule__XGuard__Group__2__Impl rule__XGuard__Group__3 ;
    public final void rule__XGuard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4021:1: ( rule__XGuard__Group__2__Impl rule__XGuard__Group__3 )
            // InternalXMachine.g:4022:2: rule__XGuard__Group__2__Impl rule__XGuard__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__XGuard__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__2"


    // $ANTLR start "rule__XGuard__Group__2__Impl"
    // InternalXMachine.g:4029:1: rule__XGuard__Group__2__Impl : ( ( rule__XGuard__PredicateAssignment_2 ) ) ;
    public final void rule__XGuard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4033:1: ( ( ( rule__XGuard__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:4034:1: ( ( rule__XGuard__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:4034:1: ( ( rule__XGuard__PredicateAssignment_2 ) )
            // InternalXMachine.g:4035:2: ( rule__XGuard__PredicateAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getPredicateAssignment_2()); 
            }
            // InternalXMachine.g:4036:2: ( rule__XGuard__PredicateAssignment_2 )
            // InternalXMachine.g:4036:3: rule__XGuard__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__PredicateAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getPredicateAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__2__Impl"


    // $ANTLR start "rule__XGuard__Group__3"
    // InternalXMachine.g:4044:1: rule__XGuard__Group__3 : rule__XGuard__Group__3__Impl ;
    public final void rule__XGuard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4048:1: ( rule__XGuard__Group__3__Impl )
            // InternalXMachine.g:4049:2: rule__XGuard__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__3"


    // $ANTLR start "rule__XGuard__Group__3__Impl"
    // InternalXMachine.g:4055:1: rule__XGuard__Group__3__Impl : ( ( rule__XGuard__TheoremAssignment_3 )? ) ;
    public final void rule__XGuard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4059:1: ( ( ( rule__XGuard__TheoremAssignment_3 )? ) )
            // InternalXMachine.g:4060:1: ( ( rule__XGuard__TheoremAssignment_3 )? )
            {
            // InternalXMachine.g:4060:1: ( ( rule__XGuard__TheoremAssignment_3 )? )
            // InternalXMachine.g:4061:2: ( rule__XGuard__TheoremAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremAssignment_3()); 
            }
            // InternalXMachine.g:4062:2: ( rule__XGuard__TheoremAssignment_3 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:4062:3: rule__XGuard__TheoremAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGuard__TheoremAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getTheoremAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__3__Impl"


    // $ANTLR start "rule__XWitness__Group__0"
    // InternalXMachine.g:4071:1: rule__XWitness__Group__0 : rule__XWitness__Group__0__Impl rule__XWitness__Group__1 ;
    public final void rule__XWitness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4075:1: ( rule__XWitness__Group__0__Impl rule__XWitness__Group__1 )
            // InternalXMachine.g:4076:2: rule__XWitness__Group__0__Impl rule__XWitness__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XWitness__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__0"


    // $ANTLR start "rule__XWitness__Group__0__Impl"
    // InternalXMachine.g:4083:1: rule__XWitness__Group__0__Impl : ( () ) ;
    public final void rule__XWitness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4087:1: ( ( () ) )
            // InternalXMachine.g:4088:1: ( () )
            {
            // InternalXMachine.g:4088:1: ( () )
            // InternalXMachine.g:4089:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 
            }
            // InternalXMachine.g:4090:2: ()
            // InternalXMachine.g:4090:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__0__Impl"


    // $ANTLR start "rule__XWitness__Group__1"
    // InternalXMachine.g:4098:1: rule__XWitness__Group__1 : rule__XWitness__Group__1__Impl rule__XWitness__Group__2 ;
    public final void rule__XWitness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4102:1: ( rule__XWitness__Group__1__Impl rule__XWitness__Group__2 )
            // InternalXMachine.g:4103:2: rule__XWitness__Group__1__Impl rule__XWitness__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XWitness__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__1"


    // $ANTLR start "rule__XWitness__Group__1__Impl"
    // InternalXMachine.g:4110:1: rule__XWitness__Group__1__Impl : ( ( rule__XWitness__NameAssignment_1 ) ) ;
    public final void rule__XWitness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4114:1: ( ( ( rule__XWitness__NameAssignment_1 ) ) )
            // InternalXMachine.g:4115:1: ( ( rule__XWitness__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4115:1: ( ( rule__XWitness__NameAssignment_1 ) )
            // InternalXMachine.g:4116:2: ( rule__XWitness__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:4117:2: ( rule__XWitness__NameAssignment_1 )
            // InternalXMachine.g:4117:3: rule__XWitness__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__1__Impl"


    // $ANTLR start "rule__XWitness__Group__2"
    // InternalXMachine.g:4125:1: rule__XWitness__Group__2 : rule__XWitness__Group__2__Impl ;
    public final void rule__XWitness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4129:1: ( rule__XWitness__Group__2__Impl )
            // InternalXMachine.g:4130:2: rule__XWitness__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__2"


    // $ANTLR start "rule__XWitness__Group__2__Impl"
    // InternalXMachine.g:4136:1: rule__XWitness__Group__2__Impl : ( ( rule__XWitness__PredicateAssignment_2 ) ) ;
    public final void rule__XWitness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4140:1: ( ( ( rule__XWitness__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:4141:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:4141:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            // InternalXMachine.g:4142:2: ( rule__XWitness__PredicateAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getPredicateAssignment_2()); 
            }
            // InternalXMachine.g:4143:2: ( rule__XWitness__PredicateAssignment_2 )
            // InternalXMachine.g:4143:3: rule__XWitness__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__PredicateAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getPredicateAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__2__Impl"


    // $ANTLR start "rule__XAction__Group__0"
    // InternalXMachine.g:4152:1: rule__XAction__Group__0 : rule__XAction__Group__0__Impl rule__XAction__Group__1 ;
    public final void rule__XAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4156:1: ( rule__XAction__Group__0__Impl rule__XAction__Group__1 )
            // InternalXMachine.g:4157:2: rule__XAction__Group__0__Impl rule__XAction__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XAction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XAction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__0"


    // $ANTLR start "rule__XAction__Group__0__Impl"
    // InternalXMachine.g:4164:1: rule__XAction__Group__0__Impl : ( () ) ;
    public final void rule__XAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4168:1: ( ( () ) )
            // InternalXMachine.g:4169:1: ( () )
            {
            // InternalXMachine.g:4169:1: ( () )
            // InternalXMachine.g:4170:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionAction_0()); 
            }
            // InternalXMachine.g:4171:2: ()
            // InternalXMachine.g:4171:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getActionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__0__Impl"


    // $ANTLR start "rule__XAction__Group__1"
    // InternalXMachine.g:4179:1: rule__XAction__Group__1 : rule__XAction__Group__1__Impl rule__XAction__Group__2 ;
    public final void rule__XAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4183:1: ( rule__XAction__Group__1__Impl rule__XAction__Group__2 )
            // InternalXMachine.g:4184:2: rule__XAction__Group__1__Impl rule__XAction__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XAction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XAction__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__1"


    // $ANTLR start "rule__XAction__Group__1__Impl"
    // InternalXMachine.g:4191:1: rule__XAction__Group__1__Impl : ( ( rule__XAction__NameAssignment_1 ) ) ;
    public final void rule__XAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4195:1: ( ( ( rule__XAction__NameAssignment_1 ) ) )
            // InternalXMachine.g:4196:1: ( ( rule__XAction__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4196:1: ( ( rule__XAction__NameAssignment_1 ) )
            // InternalXMachine.g:4197:2: ( rule__XAction__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:4198:2: ( rule__XAction__NameAssignment_1 )
            // InternalXMachine.g:4198:3: rule__XAction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XAction__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__1__Impl"


    // $ANTLR start "rule__XAction__Group__2"
    // InternalXMachine.g:4206:1: rule__XAction__Group__2 : rule__XAction__Group__2__Impl ;
    public final void rule__XAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4210:1: ( rule__XAction__Group__2__Impl )
            // InternalXMachine.g:4211:2: rule__XAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XAction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__2"


    // $ANTLR start "rule__XAction__Group__2__Impl"
    // InternalXMachine.g:4217:1: rule__XAction__Group__2__Impl : ( ( rule__XAction__ActionAssignment_2 ) ) ;
    public final void rule__XAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4221:1: ( ( ( rule__XAction__ActionAssignment_2 ) ) )
            // InternalXMachine.g:4222:1: ( ( rule__XAction__ActionAssignment_2 ) )
            {
            // InternalXMachine.g:4222:1: ( ( rule__XAction__ActionAssignment_2 ) )
            // InternalXMachine.g:4223:2: ( rule__XAction__ActionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionAssignment_2()); 
            }
            // InternalXMachine.g:4224:2: ( rule__XAction__ActionAssignment_2 )
            // InternalXMachine.g:4224:3: rule__XAction__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XAction__ActionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getActionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__2__Impl"


    // $ANTLR start "rule__Machine__UnorderedGroup_3"
    // InternalXMachine.g:4233:1: rule__Machine__UnorderedGroup_3 : ( rule__Machine__UnorderedGroup_3__0 )? ;
    public final void rule__Machine__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMachineAccess().getUnorderedGroup_3());
        	
        try {
            // InternalXMachine.g:4238:1: ( ( rule__Machine__UnorderedGroup_3__0 )? )
            // InternalXMachine.g:4239:2: ( rule__Machine__UnorderedGroup_3__0 )?
            {
            // InternalXMachine.g:4239:2: ( rule__Machine__UnorderedGroup_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
                alt46=1;
            }
            else if ( LA46_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:4239:2: rule__Machine__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__UnorderedGroup_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMachineAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__UnorderedGroup_3"


    // $ANTLR start "rule__Machine__UnorderedGroup_3__Impl"
    // InternalXMachine.g:4247:1: rule__Machine__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) ) ) ;
    public final void rule__Machine__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXMachine.g:4252:1: ( ( ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) ) ) )
            // InternalXMachine.g:4253:3: ( ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) ) )
            {
            // InternalXMachine.g:4253:3: ( ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) ) )
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( LA48_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
                alt48=2;
            }
            else if ( LA48_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
                alt48=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalXMachine.g:4254:3: ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) )
                    {
                    // InternalXMachine.g:4254:3: ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) )
                    // InternalXMachine.g:4255:4: {...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalXMachine.g:4255:103: ( ( ( rule__Machine__Group_3_0__0 ) ) )
                    // InternalXMachine.g:4256:5: ( ( rule__Machine__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalXMachine.g:4262:5: ( ( rule__Machine__Group_3_0__0 ) )
                    // InternalXMachine.g:4263:6: ( rule__Machine__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_3_0()); 
                    }
                    // InternalXMachine.g:4264:6: ( rule__Machine__Group_3_0__0 )
                    // InternalXMachine.g:4264:7: rule__Machine__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getGroup_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:4269:3: ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) )
                    {
                    // InternalXMachine.g:4269:3: ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) )
                    // InternalXMachine.g:4270:4: {...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalXMachine.g:4270:103: ( ( ( rule__Machine__Group_3_1__0 ) ) )
                    // InternalXMachine.g:4271:5: ( ( rule__Machine__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalXMachine.g:4277:5: ( ( rule__Machine__Group_3_1__0 ) )
                    // InternalXMachine.g:4278:6: ( rule__Machine__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_3_1()); 
                    }
                    // InternalXMachine.g:4279:6: ( rule__Machine__Group_3_1__0 )
                    // InternalXMachine.g:4279:7: rule__Machine__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getGroup_3_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:4284:3: ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) )
                    {
                    // InternalXMachine.g:4284:3: ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) )
                    // InternalXMachine.g:4285:4: {...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalXMachine.g:4285:103: ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) )
                    // InternalXMachine.g:4286:5: ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // InternalXMachine.g:4292:5: ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) )
                    // InternalXMachine.g:4293:6: ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* )
                    {
                    // InternalXMachine.g:4293:6: ( ( rule__Machine__ExtensionsAssignment_3_2 ) )
                    // InternalXMachine.g:4294:7: ( rule__Machine__ExtensionsAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getExtensionsAssignment_3_2()); 
                    }
                    // InternalXMachine.g:4295:7: ( rule__Machine__ExtensionsAssignment_3_2 )
                    // InternalXMachine.g:4295:8: rule__Machine__ExtensionsAssignment_3_2
                    {
                    pushFollow(FOLLOW_30);
                    rule__Machine__ExtensionsAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getExtensionsAssignment_3_2()); 
                    }

                    }

                    // InternalXMachine.g:4298:6: ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* )
                    // InternalXMachine.g:4299:7: ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getExtensionsAssignment_3_2()); 
                    }
                    // InternalXMachine.g:4300:7: ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==25) ) {
                            int LA47_2 = input.LA(2);

                            if ( (LA47_2==RULE_ID) ) {
                                int LA47_3 = input.LA(3);

                                if ( (synpred1_InternalXMachine()) ) {
                                    alt47=1;
                                }


                            }


                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalXMachine.g:4300:8: ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2
                    	    {
                    	    pushFollow(FOLLOW_30);
                    	    rule__Machine__ExtensionsAssignment_3_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getExtensionsAssignment_3_2()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMachineAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__Machine__UnorderedGroup_3__0"
    // InternalXMachine.g:4314:1: rule__Machine__UnorderedGroup_3__0 : rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__1 )? ;
    public final void rule__Machine__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4318:1: ( rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__1 )? )
            // InternalXMachine.g:4319:2: rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_30);
            rule__Machine__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:4320:2: ( rule__Machine__UnorderedGroup_3__1 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( LA49_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
                alt49=1;
            }
            else if ( LA49_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
                alt49=1;
            }
            else if ( LA49_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalXMachine.g:4320:2: rule__Machine__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__UnorderedGroup_3__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__UnorderedGroup_3__0"


    // $ANTLR start "rule__Machine__UnorderedGroup_3__1"
    // InternalXMachine.g:4326:1: rule__Machine__UnorderedGroup_3__1 : rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__2 )? ;
    public final void rule__Machine__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4330:1: ( rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__2 )? )
            // InternalXMachine.g:4331:2: rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_30);
            rule__Machine__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:4332:2: ( rule__Machine__UnorderedGroup_3__2 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( LA50_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
                alt50=1;
            }
            else if ( LA50_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalXMachine.g:4332:2: rule__Machine__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__UnorderedGroup_3__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__UnorderedGroup_3__1"


    // $ANTLR start "rule__Machine__UnorderedGroup_3__2"
    // InternalXMachine.g:4338:1: rule__Machine__UnorderedGroup_3__2 : rule__Machine__UnorderedGroup_3__Impl ;
    public final void rule__Machine__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4342:1: ( rule__Machine__UnorderedGroup_3__Impl )
            // InternalXMachine.g:4343:2: rule__Machine__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__UnorderedGroup_3__2"


    // $ANTLR start "rule__XEvent__UnorderedGroup_3"
    // InternalXMachine.g:4350:1: rule__XEvent__UnorderedGroup_3 : ( rule__XEvent__UnorderedGroup_3__0 )? ;
    public final void rule__XEvent__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getXEventAccess().getUnorderedGroup_3());
        	
        try {
            // InternalXMachine.g:4355:1: ( ( rule__XEvent__UnorderedGroup_3__0 )? )
            // InternalXMachine.g:4356:2: ( rule__XEvent__UnorderedGroup_3__0 )?
            {
            // InternalXMachine.g:4356:2: ( rule__XEvent__UnorderedGroup_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 >= 14 && LA51_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalXMachine.g:4356:2: rule__XEvent__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__UnorderedGroup_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getXEventAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__UnorderedGroup_3"


    // $ANTLR start "rule__XEvent__UnorderedGroup_3__Impl"
    // InternalXMachine.g:4364:1: rule__XEvent__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) ) ) ;
    public final void rule__XEvent__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXMachine.g:4369:1: ( ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) ) ) )
            // InternalXMachine.g:4370:3: ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) ) )
            {
            // InternalXMachine.g:4370:3: ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 >= 14 && LA52_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalXMachine.g:4371:3: ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) )
                    {
                    // InternalXMachine.g:4371:3: ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) )
                    // InternalXMachine.g:4372:4: {...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__XEvent__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalXMachine.g:4372:102: ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) )
                    // InternalXMachine.g:4373:5: ( ( rule__XEvent__ExtendedAssignment_3_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalXMachine.g:4379:5: ( ( rule__XEvent__ExtendedAssignment_3_0 ) )
                    // InternalXMachine.g:4380:6: ( rule__XEvent__ExtendedAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getExtendedAssignment_3_0()); 
                    }
                    // InternalXMachine.g:4381:6: ( rule__XEvent__ExtendedAssignment_3_0 )
                    // InternalXMachine.g:4381:7: rule__XEvent__ExtendedAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__ExtendedAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getExtendedAssignment_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:4386:3: ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) )
                    {
                    // InternalXMachine.g:4386:3: ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) )
                    // InternalXMachine.g:4387:4: {...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__XEvent__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalXMachine.g:4387:102: ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) )
                    // InternalXMachine.g:4388:5: ( ( rule__XEvent__ConvergenceAssignment_3_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalXMachine.g:4394:5: ( ( rule__XEvent__ConvergenceAssignment_3_1 ) )
                    // InternalXMachine.g:4395:6: ( rule__XEvent__ConvergenceAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getConvergenceAssignment_3_1()); 
                    }
                    // InternalXMachine.g:4396:6: ( rule__XEvent__ConvergenceAssignment_3_1 )
                    // InternalXMachine.g:4396:7: rule__XEvent__ConvergenceAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__ConvergenceAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getConvergenceAssignment_3_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getXEventAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__XEvent__UnorderedGroup_3__0"
    // InternalXMachine.g:4409:1: rule__XEvent__UnorderedGroup_3__0 : rule__XEvent__UnorderedGroup_3__Impl ( rule__XEvent__UnorderedGroup_3__1 )? ;
    public final void rule__XEvent__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4413:1: ( rule__XEvent__UnorderedGroup_3__Impl ( rule__XEvent__UnorderedGroup_3__1 )? )
            // InternalXMachine.g:4414:2: rule__XEvent__UnorderedGroup_3__Impl ( rule__XEvent__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_31);
            rule__XEvent__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:4415:2: ( rule__XEvent__UnorderedGroup_3__1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( LA53_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 >= 14 && LA53_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalXMachine.g:4415:2: rule__XEvent__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__UnorderedGroup_3__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__UnorderedGroup_3__0"


    // $ANTLR start "rule__XEvent__UnorderedGroup_3__1"
    // InternalXMachine.g:4421:1: rule__XEvent__UnorderedGroup_3__1 : rule__XEvent__UnorderedGroup_3__Impl ;
    public final void rule__XEvent__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4425:1: ( rule__XEvent__UnorderedGroup_3__Impl )
            // InternalXMachine.g:4426:2: rule__XEvent__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__UnorderedGroup_3__1"


    // $ANTLR start "rule__Machine__NameAssignment_2"
    // InternalXMachine.g:4433:1: rule__Machine__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4437:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4438:2: ( RULE_ID )
            {
            // InternalXMachine.g:4438:2: ( RULE_ID )
            // InternalXMachine.g:4439:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__NameAssignment_2"


    // $ANTLR start "rule__Machine__RefinesAssignment_3_0_1"
    // InternalXMachine.g:4448:1: rule__Machine__RefinesAssignment_3_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__RefinesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4452:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4453:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4453:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4454:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_3_0_1_0()); 
            }
            // InternalXMachine.g:4455:3: ( RULE_ID )
            // InternalXMachine.g:4456:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesMachineIDTerminalRuleCall_3_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getRefinesMachineIDTerminalRuleCall_3_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_3_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__RefinesAssignment_3_0_1"


    // $ANTLR start "rule__Machine__SeesAssignment_3_1_1"
    // InternalXMachine.g:4467:1: rule__Machine__SeesAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__SeesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4471:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4472:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4472:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4473:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesContextCrossReference_3_1_1_0()); 
            }
            // InternalXMachine.g:4474:3: ( RULE_ID )
            // InternalXMachine.g:4475:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesContextIDTerminalRuleCall_3_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getSeesContextIDTerminalRuleCall_3_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getSeesContextCrossReference_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__SeesAssignment_3_1_1"


    // $ANTLR start "rule__Machine__ExtensionsAssignment_3_2"
    // InternalXMachine.g:4486:1: rule__Machine__ExtensionsAssignment_3_2 : ( ruleMIncludes ) ;
    public final void rule__Machine__ExtensionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4490:1: ( ( ruleMIncludes ) )
            // InternalXMachine.g:4491:2: ( ruleMIncludes )
            {
            // InternalXMachine.g:4491:2: ( ruleMIncludes )
            // InternalXMachine.g:4492:3: ruleMIncludes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMIncludes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__ExtensionsAssignment_3_2"


    // $ANTLR start "rule__Machine__VariablesAssignment_4_1"
    // InternalXMachine.g:4501:1: rule__Machine__VariablesAssignment_4_1 : ( ruleXVariable ) ;
    public final void rule__Machine__VariablesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4505:1: ( ( ruleXVariable ) )
            // InternalXMachine.g:4506:2: ( ruleXVariable )
            {
            // InternalXMachine.g:4506:2: ( ruleXVariable )
            // InternalXMachine.g:4507:3: ruleXVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariablesAssignment_4_1"


    // $ANTLR start "rule__Machine__InvariantsAssignment_5_1"
    // InternalXMachine.g:4516:1: rule__Machine__InvariantsAssignment_5_1 : ( ruleXInvariant ) ;
    public final void rule__Machine__InvariantsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4520:1: ( ( ruleXInvariant ) )
            // InternalXMachine.g:4521:2: ( ruleXInvariant )
            {
            // InternalXMachine.g:4521:2: ( ruleXInvariant )
            // InternalXMachine.g:4522:3: ruleXInvariant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXInvariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__InvariantsAssignment_5_1"


    // $ANTLR start "rule__Machine__VariantAssignment_6_1"
    // InternalXMachine.g:4531:1: rule__Machine__VariantAssignment_6_1 : ( ruleXVariant ) ;
    public final void rule__Machine__VariantAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4535:1: ( ( ruleXVariant ) )
            // InternalXMachine.g:4536:2: ( ruleXVariant )
            {
            // InternalXMachine.g:4536:2: ( ruleXVariant )
            // InternalXMachine.g:4537:3: ruleXVariant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariantXVariantParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXVariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariantXVariantParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariantAssignment_6_1"


    // $ANTLR start "rule__Machine__EventsAssignment_7_1"
    // InternalXMachine.g:4546:1: rule__Machine__EventsAssignment_7_1 : ( ruleXEvent ) ;
    public final void rule__Machine__EventsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4550:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:4551:2: ( ruleXEvent )
            {
            // InternalXMachine.g:4551:2: ( ruleXEvent )
            // InternalXMachine.g:4552:3: ruleXEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__EventsAssignment_7_1"


    // $ANTLR start "rule__Machine__EventsAssignment_7_2"
    // InternalXMachine.g:4561:1: rule__Machine__EventsAssignment_7_2 : ( ruleXEvent ) ;
    public final void rule__Machine__EventsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4565:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:4566:2: ( ruleXEvent )
            {
            // InternalXMachine.g:4566:2: ( ruleXEvent )
            // InternalXMachine.g:4567:3: ruleXEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_7_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_7_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__EventsAssignment_7_2"


    // $ANTLR start "rule__Machine__ExtensionsAssignment_8"
    // InternalXMachine.g:4576:1: rule__Machine__ExtensionsAssignment_8 : ( ruleXGroup ) ;
    public final void rule__Machine__ExtensionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4580:1: ( ( ruleXGroup ) )
            // InternalXMachine.g:4581:2: ( ruleXGroup )
            {
            // InternalXMachine.g:4581:2: ( ruleXGroup )
            // InternalXMachine.g:4582:3: ruleXGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getExtensionsXGroupParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getExtensionsXGroupParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__ExtensionsAssignment_8"


    // $ANTLR start "rule__MIncludes__AbstractMachineAssignment_1_1"
    // InternalXMachine.g:4591:1: rule__MIncludes__AbstractMachineAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MIncludes__AbstractMachineAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4595:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:4596:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:4596:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:4597:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 
            }
            // InternalXMachine.g:4598:3: ( ruleQualifiedName )
            // InternalXMachine.g:4599:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineQualifiedNameParserRuleCall_1_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getAbstractMachineMachineQualifiedNameParserRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__AbstractMachineAssignment_1_1"


    // $ANTLR start "rule__MIncludes__ConcreteMachineAssignment_2_1"
    // InternalXMachine.g:4610:1: rule__MIncludes__ConcreteMachineAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MIncludes__ConcreteMachineAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4614:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4615:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4615:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4616:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 
            }
            // InternalXMachine.g:4617:3: ( RULE_ID )
            // InternalXMachine.g:4618:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getConcreteMachineMachineIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__ConcreteMachineAssignment_2_1"


    // $ANTLR start "rule__MIncludes__PrefixesAssignment_3_1"
    // InternalXMachine.g:4629:1: rule__MIncludes__PrefixesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4633:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4634:2: ( RULE_ID )
            {
            // InternalXMachine.g:4634:2: ( RULE_ID )
            // InternalXMachine.g:4635:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__PrefixesAssignment_3_1"


    // $ANTLR start "rule__MIncludes__PrefixesAssignment_3_2"
    // InternalXMachine.g:4644:1: rule__MIncludes__PrefixesAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4648:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4649:2: ( RULE_ID )
            {
            // InternalXMachine.g:4649:2: ( RULE_ID )
            // InternalXMachine.g:4650:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__PrefixesAssignment_3_2"


    // $ANTLR start "rule__XVariable__NameAssignment_1"
    // InternalXMachine.g:4659:1: rule__XVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4663:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4664:2: ( RULE_ID )
            {
            // InternalXMachine.g:4664:2: ( RULE_ID )
            // InternalXMachine.g:4665:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__NameAssignment_1"


    // $ANTLR start "rule__XInvariant__NameAssignment_1"
    // InternalXMachine.g:4674:1: rule__XInvariant__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XInvariant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4678:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4679:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4679:2: ( RULE_XLABEL )
            // InternalXMachine.g:4680:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_1_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__NameAssignment_1"


    // $ANTLR start "rule__XInvariant__PredicateAssignment_2"
    // InternalXMachine.g:4689:1: rule__XInvariant__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XInvariant__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4693:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:4694:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:4694:2: ( ruleXPredicate )
            // InternalXMachine.g:4695:3: ruleXPredicate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__PredicateAssignment_2"


    // $ANTLR start "rule__XInvariant__TheoremAssignment_3"
    // InternalXMachine.g:4704:1: rule__XInvariant__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XInvariant__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4708:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:4709:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:4709:2: ( ( 'theorem' ) )
            // InternalXMachine.g:4710:3: ( 'theorem' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            }
            // InternalXMachine.g:4711:3: ( 'theorem' )
            // InternalXMachine.g:4712:4: 'theorem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__TheoremAssignment_3"


    // $ANTLR start "rule__XVariant__ExpressionAssignment_1"
    // InternalXMachine.g:4723:1: rule__XVariant__ExpressionAssignment_1 : ( ruleXPredicate ) ;
    public final void rule__XVariant__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4727:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:4728:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:4728:2: ( ruleXPredicate )
            // InternalXMachine.g:4729:3: ruleXPredicate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getExpressionXPredicateParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getExpressionXPredicateParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__ExpressionAssignment_1"


    // $ANTLR start "rule__XGroup__NameAssignment_2"
    // InternalXMachine.g:4738:1: rule__XGroup__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4742:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4743:2: ( RULE_ID )
            {
            // InternalXMachine.g:4743:2: ( RULE_ID )
            // InternalXMachine.g:4744:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__NameAssignment_2"


    // $ANTLR start "rule__XGroup__FormalParametersAssignment_3_1"
    // InternalXMachine.g:4753:1: rule__XGroup__FormalParametersAssignment_3_1 : ( ruleXFormalParameter ) ;
    public final void rule__XGroup__FormalParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4757:1: ( ( ruleXFormalParameter ) )
            // InternalXMachine.g:4758:2: ( ruleXFormalParameter )
            {
            // InternalXMachine.g:4758:2: ( ruleXFormalParameter )
            // InternalXMachine.g:4759:3: ruleXFormalParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getFormalParametersXFormalParameterParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormalParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getFormalParametersXFormalParameterParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__FormalParametersAssignment_3_1"


    // $ANTLR start "rule__XGroup__FormalParametersAssignment_3_2_1"
    // InternalXMachine.g:4768:1: rule__XGroup__FormalParametersAssignment_3_2_1 : ( ruleXFormalParameter ) ;
    public final void rule__XGroup__FormalParametersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4772:1: ( ( ruleXFormalParameter ) )
            // InternalXMachine.g:4773:2: ( ruleXFormalParameter )
            {
            // InternalXMachine.g:4773:2: ( ruleXFormalParameter )
            // InternalXMachine.g:4774:3: ruleXFormalParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getFormalParametersXFormalParameterParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormalParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getFormalParametersXFormalParameterParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__FormalParametersAssignment_3_2_1"


    // $ANTLR start "rule__XGroup__EventsAssignment_4_1"
    // InternalXMachine.g:4783:1: rule__XGroup__EventsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__XGroup__EventsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4787:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4788:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4788:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4789:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventsEventCrossReference_4_1_0()); 
            }
            // InternalXMachine.g:4790:3: ( RULE_ID )
            // InternalXMachine.g:4791:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventsEventIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getEventsEventIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getEventsEventCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__EventsAssignment_4_1"


    // $ANTLR start "rule__XGroup__EventsAssignment_4_2"
    // InternalXMachine.g:4802:1: rule__XGroup__EventsAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__XGroup__EventsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4806:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4807:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4807:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4808:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventsEventCrossReference_4_2_0()); 
            }
            // InternalXMachine.g:4809:3: ( RULE_ID )
            // InternalXMachine.g:4810:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventsEventIDTerminalRuleCall_4_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getEventsEventIDTerminalRuleCall_4_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupAccess().getEventsEventCrossReference_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__EventsAssignment_4_2"


    // $ANTLR start "rule__XFormalParameter__DirectionAssignment_1"
    // InternalXMachine.g:4821:1: rule__XFormalParameter__DirectionAssignment_1 : ( ruleXDirection ) ;
    public final void rule__XFormalParameter__DirectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4825:1: ( ( ruleXDirection ) )
            // InternalXMachine.g:4826:2: ( ruleXDirection )
            {
            // InternalXMachine.g:4826:2: ( ruleXDirection )
            // InternalXMachine.g:4827:3: ruleXDirection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormalParameterAccess().getDirectionXDirectionEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXDirection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFormalParameterAccess().getDirectionXDirectionEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFormalParameter__DirectionAssignment_1"


    // $ANTLR start "rule__XFormalParameter__NameAssignment_2"
    // InternalXMachine.g:4836:1: rule__XFormalParameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XFormalParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4840:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4841:2: ( RULE_ID )
            {
            // InternalXMachine.g:4841:2: ( RULE_ID )
            // InternalXMachine.g:4842:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormalParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFormalParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFormalParameter__NameAssignment_2"


    // $ANTLR start "rule__XEvent__NameAssignment_2"
    // InternalXMachine.g:4851:1: rule__XEvent__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XEvent__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4855:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4856:2: ( RULE_ID )
            {
            // InternalXMachine.g:4856:2: ( RULE_ID )
            // InternalXMachine.g:4857:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__NameAssignment_2"


    // $ANTLR start "rule__XEvent__ExtendedAssignment_3_0"
    // InternalXMachine.g:4866:1: rule__XEvent__ExtendedAssignment_3_0 : ( ( 'extended' ) ) ;
    public final void rule__XEvent__ExtendedAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4870:1: ( ( ( 'extended' ) ) )
            // InternalXMachine.g:4871:2: ( ( 'extended' ) )
            {
            // InternalXMachine.g:4871:2: ( ( 'extended' ) )
            // InternalXMachine.g:4872:3: ( 'extended' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0_0()); 
            }
            // InternalXMachine.g:4873:3: ( 'extended' )
            // InternalXMachine.g:4874:4: 'extended'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ExtendedAssignment_3_0"


    // $ANTLR start "rule__XEvent__ConvergenceAssignment_3_1"
    // InternalXMachine.g:4885:1: rule__XEvent__ConvergenceAssignment_3_1 : ( ruleXConvergence ) ;
    public final void rule__XEvent__ConvergenceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4889:1: ( ( ruleXConvergence ) )
            // InternalXMachine.g:4890:2: ( ruleXConvergence )
            {
            // InternalXMachine.g:4890:2: ( ruleXConvergence )
            // InternalXMachine.g:4891:3: ruleXConvergence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXConvergence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ConvergenceAssignment_3_1"


    // $ANTLR start "rule__XEvent__ExtensionsAssignment_4"
    // InternalXMachine.g:4900:1: rule__XEvent__ExtensionsAssignment_4 : ( ruleXGroupOrEvent ) ;
    public final void rule__XEvent__ExtensionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4904:1: ( ( ruleXGroupOrEvent ) )
            // InternalXMachine.g:4905:2: ( ruleXGroupOrEvent )
            {
            // InternalXMachine.g:4905:2: ( ruleXGroupOrEvent )
            // InternalXMachine.g:4906:3: ruleXGroupOrEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtensionsXGroupOrEventParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXGroupOrEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtensionsXGroupOrEventParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ExtensionsAssignment_4"


    // $ANTLR start "rule__XEvent__RefinesAssignment_5_1"
    // InternalXMachine.g:4915:1: rule__XEvent__RefinesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4919:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4920:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4920:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4921:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_1_0()); 
            }
            // InternalXMachine.g:4922:3: ( RULE_ID )
            // InternalXMachine.g:4923:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__RefinesAssignment_5_1"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_6_0_0_1"
    // InternalXMachine.g:4934:1: rule__XEvent__WitnessesAssignment_6_0_0_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_6_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4938:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:4939:2: ( ruleXWitness )
            {
            // InternalXMachine.g:4939:2: ( ruleXWitness )
            // InternalXMachine.g:4940:3: ruleXWitness
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__WitnessesAssignment_6_0_0_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_6_0_2"
    // InternalXMachine.g:4949:1: rule__XEvent__ActionsAssignment_6_0_2 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_6_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4953:1: ( ( ruleXAction ) )
            // InternalXMachine.g:4954:2: ( ruleXAction )
            {
            // InternalXMachine.g:4954:2: ( ruleXAction )
            // InternalXMachine.g:4955:3: ruleXAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ActionsAssignment_6_0_2"


    // $ANTLR start "rule__XEvent__GuardsAssignment_6_1_1"
    // InternalXMachine.g:4964:1: rule__XEvent__GuardsAssignment_6_1_1 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4968:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:4969:2: ( ruleXGuard )
            {
            // InternalXMachine.g:4969:2: ( ruleXGuard )
            // InternalXMachine.g:4970:3: ruleXGuard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_6_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXGuard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_6_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__GuardsAssignment_6_1_1"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_6_1_2_1"
    // InternalXMachine.g:4979:1: rule__XEvent__WitnessesAssignment_6_1_2_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_6_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4983:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:4984:2: ( ruleXWitness )
            {
            // InternalXMachine.g:4984:2: ( ruleXWitness )
            // InternalXMachine.g:4985:3: ruleXWitness
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__WitnessesAssignment_6_1_2_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_6_1_3_1"
    // InternalXMachine.g:4994:1: rule__XEvent__ActionsAssignment_6_1_3_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_6_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4998:1: ( ( ruleXAction ) )
            // InternalXMachine.g:4999:2: ( ruleXAction )
            {
            // InternalXMachine.g:4999:2: ( ruleXAction )
            // InternalXMachine.g:5000:3: ruleXAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_1_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_1_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ActionsAssignment_6_1_3_1"


    // $ANTLR start "rule__XEvent__ParametersAssignment_6_2_1"
    // InternalXMachine.g:5009:1: rule__XEvent__ParametersAssignment_6_2_1 : ( ruleXParameter ) ;
    public final void rule__XEvent__ParametersAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5013:1: ( ( ruleXParameter ) )
            // InternalXMachine.g:5014:2: ( ruleXParameter )
            {
            // InternalXMachine.g:5014:2: ( ruleXParameter )
            // InternalXMachine.g:5015:3: ruleXParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_6_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_6_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ParametersAssignment_6_2_1"


    // $ANTLR start "rule__XEvent__GuardsAssignment_6_2_3"
    // InternalXMachine.g:5024:1: rule__XEvent__GuardsAssignment_6_2_3 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_6_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5028:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:5029:2: ( ruleXGuard )
            {
            // InternalXMachine.g:5029:2: ( ruleXGuard )
            // InternalXMachine.g:5030:3: ruleXGuard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_6_2_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXGuard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_6_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__GuardsAssignment_6_2_3"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_6_2_4_1"
    // InternalXMachine.g:5039:1: rule__XEvent__WitnessesAssignment_6_2_4_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_6_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5043:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:5044:2: ( ruleXWitness )
            {
            // InternalXMachine.g:5044:2: ( ruleXWitness )
            // InternalXMachine.g:5045:3: ruleXWitness
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_2_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_2_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__WitnessesAssignment_6_2_4_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_6_2_5_1"
    // InternalXMachine.g:5054:1: rule__XEvent__ActionsAssignment_6_2_5_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_6_2_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5058:1: ( ( ruleXAction ) )
            // InternalXMachine.g:5059:2: ( ruleXAction )
            {
            // InternalXMachine.g:5059:2: ( ruleXAction )
            // InternalXMachine.g:5060:3: ruleXAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_2_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_2_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ActionsAssignment_6_2_5_1"


    // $ANTLR start "rule__EventSync__PrefixAssignment_1_1_0"
    // InternalXMachine.g:5069:1: rule__EventSync__PrefixAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__EventSync__PrefixAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5073:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5074:2: ( RULE_ID )
            {
            // InternalXMachine.g:5074:2: ( RULE_ID )
            // InternalXMachine.g:5075:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__PrefixAssignment_1_1_0"


    // $ANTLR start "rule__EventSync__SynchronisedEventAssignment_1_2"
    // InternalXMachine.g:5084:1: rule__EventSync__SynchronisedEventAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__EventSync__SynchronisedEventAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5088:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5089:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5089:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5090:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0()); 
            }
            // InternalXMachine.g:5091:3: ( RULE_ID )
            // InternalXMachine.g:5092:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getSynchronisedEventEventIDTerminalRuleCall_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__SynchronisedEventAssignment_1_2"


    // $ANTLR start "rule__GroupSync__PrefixAssignment_1_2_0"
    // InternalXMachine.g:5103:1: rule__GroupSync__PrefixAssignment_1_2_0 : ( RULE_ID ) ;
    public final void rule__GroupSync__PrefixAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5107:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5108:2: ( RULE_ID )
            {
            // InternalXMachine.g:5108:2: ( RULE_ID )
            // InternalXMachine.g:5109:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getPrefixIDTerminalRuleCall_1_2_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getPrefixIDTerminalRuleCall_1_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__PrefixAssignment_1_2_0"


    // $ANTLR start "rule__GroupSync__SynchronisedCasesAssignment_1_3"
    // InternalXMachine.g:5118:1: rule__GroupSync__SynchronisedCasesAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__GroupSync__SynchronisedCasesAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5122:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5123:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5123:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5124:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesCrossReference_1_3_0()); 
            }
            // InternalXMachine.g:5125:3: ( RULE_ID )
            // InternalXMachine.g:5126:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesIDTerminalRuleCall_1_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesIDTerminalRuleCall_1_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesCrossReference_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__SynchronisedCasesAssignment_1_3"


    // $ANTLR start "rule__GroupSync__ActualParametersAssignment_2_1"
    // InternalXMachine.g:5137:1: rule__GroupSync__ActualParametersAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__GroupSync__ActualParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5141:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5142:2: ( RULE_ID )
            {
            // InternalXMachine.g:5142:2: ( RULE_ID )
            // InternalXMachine.g:5143:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getActualParametersIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getActualParametersIDTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__ActualParametersAssignment_2_1"


    // $ANTLR start "rule__GroupSync__ActualParametersAssignment_2_2_1"
    // InternalXMachine.g:5152:1: rule__GroupSync__ActualParametersAssignment_2_2_1 : ( RULE_ID ) ;
    public final void rule__GroupSync__ActualParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5156:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5157:2: ( RULE_ID )
            {
            // InternalXMachine.g:5157:2: ( RULE_ID )
            // InternalXMachine.g:5158:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getActualParametersIDTerminalRuleCall_2_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getActualParametersIDTerminalRuleCall_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__ActualParametersAssignment_2_2_1"


    // $ANTLR start "rule__XParameter__NameAssignment_1"
    // InternalXMachine.g:5167:1: rule__XParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5171:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5172:2: ( RULE_ID )
            {
            // InternalXMachine.g:5172:2: ( RULE_ID )
            // InternalXMachine.g:5173:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__NameAssignment_1"


    // $ANTLR start "rule__XGuard__NameAssignment_1"
    // InternalXMachine.g:5182:1: rule__XGuard__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XGuard__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5186:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5187:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5187:2: ( RULE_XLABEL )
            // InternalXMachine.g:5188:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_1_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__NameAssignment_1"


    // $ANTLR start "rule__XGuard__PredicateAssignment_2"
    // InternalXMachine.g:5197:1: rule__XGuard__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XGuard__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5201:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:5202:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:5202:2: ( ruleXPredicate )
            // InternalXMachine.g:5203:3: ruleXPredicate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__PredicateAssignment_2"


    // $ANTLR start "rule__XGuard__TheoremAssignment_3"
    // InternalXMachine.g:5212:1: rule__XGuard__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XGuard__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5216:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:5217:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:5217:2: ( ( 'theorem' ) )
            // InternalXMachine.g:5218:3: ( 'theorem' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 
            }
            // InternalXMachine.g:5219:3: ( 'theorem' )
            // InternalXMachine.g:5220:4: 'theorem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__TheoremAssignment_3"


    // $ANTLR start "rule__XWitness__NameAssignment_1"
    // InternalXMachine.g:5231:1: rule__XWitness__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XWitness__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5235:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5236:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5236:2: ( RULE_XLABEL )
            // InternalXMachine.g:5237:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_1_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__NameAssignment_1"


    // $ANTLR start "rule__XWitness__PredicateAssignment_2"
    // InternalXMachine.g:5246:1: rule__XWitness__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XWitness__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5250:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:5251:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:5251:2: ( ruleXPredicate )
            // InternalXMachine.g:5252:3: ruleXPredicate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__PredicateAssignment_2"


    // $ANTLR start "rule__XAction__NameAssignment_1"
    // InternalXMachine.g:5261:1: rule__XAction__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5265:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5266:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5266:2: ( RULE_XLABEL )
            // InternalXMachine.g:5267:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_1_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__NameAssignment_1"


    // $ANTLR start "rule__XAction__ActionAssignment_2"
    // InternalXMachine.g:5276:1: rule__XAction__ActionAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XAction__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5280:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:5281:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:5281:2: ( ruleXPredicate )
            // InternalXMachine.g:5282:3: ruleXPredicate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionXPredicateParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getActionXPredicateParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__ActionAssignment_2"

    // $ANTLR start synpred1_InternalXMachine
    public final void synpred1_InternalXMachine_fragment() throws RecognitionException {   
        // InternalXMachine.g:4300:8: ( rule__Machine__ExtensionsAssignment_3_2 )
        // InternalXMachine.g:4300:9: rule__Machine__ExtensionsAssignment_3_2
        {
        pushFollow(FOLLOW_2);
        rule__Machine__ExtensionsAssignment_3_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalXMachine

    // Delegated rules

    public final boolean synpred1_InternalXMachine() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalXMachine_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002180000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000021E40000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000240040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000004000001C000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000015A000C0000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000002180002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000004000001C002L});

}
