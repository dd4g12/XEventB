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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_XLABEL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'in'", "'out'", "'ordinary'", "'convergent'", "'anticipated'", "'machine'", "'end'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variant'", "'events'", "'includes'", "'to'", "'as'", "'.'", "'group'", "'('", "')'", "','", "'begin'", "'event'", "'with'", "'when'", "'then'", "'any'", "'where'", "'synchronises'", "'['", "']'", "'theorem'", "'extended'"
    };
    public static final int T__19=19;
    public static final int RULE_XLABEL=6;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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


    // $ANTLR start "entryRuleXSyncParameters"
    // InternalXMachine.g:303:1: entryRuleXSyncParameters : ruleXSyncParameters EOF ;
    public final void entryRuleXSyncParameters() throws RecognitionException {
        try {
            // InternalXMachine.g:304:1: ( ruleXSyncParameters EOF )
            // InternalXMachine.g:305:1: ruleXSyncParameters EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXSyncParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXSyncParameters();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXSyncParametersRule()); 
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
    // $ANTLR end "entryRuleXSyncParameters"


    // $ANTLR start "ruleXSyncParameters"
    // InternalXMachine.g:312:1: ruleXSyncParameters : ( ( rule__XSyncParameters__Group__0 ) ) ;
    public final void ruleXSyncParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:316:2: ( ( ( rule__XSyncParameters__Group__0 ) ) )
            // InternalXMachine.g:317:2: ( ( rule__XSyncParameters__Group__0 ) )
            {
            // InternalXMachine.g:317:2: ( ( rule__XSyncParameters__Group__0 ) )
            // InternalXMachine.g:318:3: ( rule__XSyncParameters__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXSyncParametersAccess().getGroup()); 
            }
            // InternalXMachine.g:319:3: ( rule__XSyncParameters__Group__0 )
            // InternalXMachine.g:319:4: rule__XSyncParameters__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XSyncParameters__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXSyncParametersAccess().getGroup()); 
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
    // $ANTLR end "ruleXSyncParameters"


    // $ANTLR start "entryRuleGroupSync"
    // InternalXMachine.g:328:1: entryRuleGroupSync : ruleGroupSync EOF ;
    public final void entryRuleGroupSync() throws RecognitionException {
        try {
            // InternalXMachine.g:329:1: ( ruleGroupSync EOF )
            // InternalXMachine.g:330:1: ruleGroupSync EOF
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
    // InternalXMachine.g:337:1: ruleGroupSync : ( ( rule__GroupSync__Group__0 ) ) ;
    public final void ruleGroupSync() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:341:2: ( ( ( rule__GroupSync__Group__0 ) ) )
            // InternalXMachine.g:342:2: ( ( rule__GroupSync__Group__0 ) )
            {
            // InternalXMachine.g:342:2: ( ( rule__GroupSync__Group__0 ) )
            // InternalXMachine.g:343:3: ( rule__GroupSync__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getGroup()); 
            }
            // InternalXMachine.g:344:3: ( rule__GroupSync__Group__0 )
            // InternalXMachine.g:344:4: rule__GroupSync__Group__0
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
    // InternalXMachine.g:353:1: entryRuleXGroupOrEvent : ruleXGroupOrEvent EOF ;
    public final void entryRuleXGroupOrEvent() throws RecognitionException {
        try {
            // InternalXMachine.g:354:1: ( ruleXGroupOrEvent EOF )
            // InternalXMachine.g:355:1: ruleXGroupOrEvent EOF
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
    // InternalXMachine.g:362:1: ruleXGroupOrEvent : ( ( rule__XGroupOrEvent__Alternatives ) ) ;
    public final void ruleXGroupOrEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:366:2: ( ( ( rule__XGroupOrEvent__Alternatives ) ) )
            // InternalXMachine.g:367:2: ( ( rule__XGroupOrEvent__Alternatives ) )
            {
            // InternalXMachine.g:367:2: ( ( rule__XGroupOrEvent__Alternatives ) )
            // InternalXMachine.g:368:3: ( rule__XGroupOrEvent__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupOrEventAccess().getAlternatives()); 
            }
            // InternalXMachine.g:369:3: ( rule__XGroupOrEvent__Alternatives )
            // InternalXMachine.g:369:4: rule__XGroupOrEvent__Alternatives
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
    // InternalXMachine.g:378:1: entryRuleXParameter : ruleXParameter EOF ;
    public final void entryRuleXParameter() throws RecognitionException {
        try {
            // InternalXMachine.g:379:1: ( ruleXParameter EOF )
            // InternalXMachine.g:380:1: ruleXParameter EOF
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
    // InternalXMachine.g:387:1: ruleXParameter : ( ( rule__XParameter__Group__0 ) ) ;
    public final void ruleXParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:391:2: ( ( ( rule__XParameter__Group__0 ) ) )
            // InternalXMachine.g:392:2: ( ( rule__XParameter__Group__0 ) )
            {
            // InternalXMachine.g:392:2: ( ( rule__XParameter__Group__0 ) )
            // InternalXMachine.g:393:3: ( rule__XParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getGroup()); 
            }
            // InternalXMachine.g:394:3: ( rule__XParameter__Group__0 )
            // InternalXMachine.g:394:4: rule__XParameter__Group__0
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
    // InternalXMachine.g:403:1: entryRuleXGuard : ruleXGuard EOF ;
    public final void entryRuleXGuard() throws RecognitionException {
        try {
            // InternalXMachine.g:404:1: ( ruleXGuard EOF )
            // InternalXMachine.g:405:1: ruleXGuard EOF
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
    // InternalXMachine.g:412:1: ruleXGuard : ( ( rule__XGuard__Group__0 ) ) ;
    public final void ruleXGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:416:2: ( ( ( rule__XGuard__Group__0 ) ) )
            // InternalXMachine.g:417:2: ( ( rule__XGuard__Group__0 ) )
            {
            // InternalXMachine.g:417:2: ( ( rule__XGuard__Group__0 ) )
            // InternalXMachine.g:418:3: ( rule__XGuard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getGroup()); 
            }
            // InternalXMachine.g:419:3: ( rule__XGuard__Group__0 )
            // InternalXMachine.g:419:4: rule__XGuard__Group__0
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
    // InternalXMachine.g:428:1: entryRuleXWitness : ruleXWitness EOF ;
    public final void entryRuleXWitness() throws RecognitionException {
        try {
            // InternalXMachine.g:429:1: ( ruleXWitness EOF )
            // InternalXMachine.g:430:1: ruleXWitness EOF
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
    // InternalXMachine.g:437:1: ruleXWitness : ( ( rule__XWitness__Group__0 ) ) ;
    public final void ruleXWitness() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:441:2: ( ( ( rule__XWitness__Group__0 ) ) )
            // InternalXMachine.g:442:2: ( ( rule__XWitness__Group__0 ) )
            {
            // InternalXMachine.g:442:2: ( ( rule__XWitness__Group__0 ) )
            // InternalXMachine.g:443:3: ( rule__XWitness__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getGroup()); 
            }
            // InternalXMachine.g:444:3: ( rule__XWitness__Group__0 )
            // InternalXMachine.g:444:4: rule__XWitness__Group__0
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
    // InternalXMachine.g:453:1: entryRuleXAction : ruleXAction EOF ;
    public final void entryRuleXAction() throws RecognitionException {
        try {
            // InternalXMachine.g:454:1: ( ruleXAction EOF )
            // InternalXMachine.g:455:1: ruleXAction EOF
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
    // InternalXMachine.g:462:1: ruleXAction : ( ( rule__XAction__Group__0 ) ) ;
    public final void ruleXAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:466:2: ( ( ( rule__XAction__Group__0 ) ) )
            // InternalXMachine.g:467:2: ( ( rule__XAction__Group__0 ) )
            {
            // InternalXMachine.g:467:2: ( ( rule__XAction__Group__0 ) )
            // InternalXMachine.g:468:3: ( rule__XAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getGroup()); 
            }
            // InternalXMachine.g:469:3: ( rule__XAction__Group__0 )
            // InternalXMachine.g:469:4: rule__XAction__Group__0
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
    // InternalXMachine.g:478:1: entryRuleXPredicate : ruleXPredicate EOF ;
    public final void entryRuleXPredicate() throws RecognitionException {
        try {
            // InternalXMachine.g:479:1: ( ruleXPredicate EOF )
            // InternalXMachine.g:480:1: ruleXPredicate EOF
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
    // InternalXMachine.g:487:1: ruleXPredicate : ( RULE_STRING ) ;
    public final void ruleXPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:491:2: ( ( RULE_STRING ) )
            // InternalXMachine.g:492:2: ( RULE_STRING )
            {
            // InternalXMachine.g:492:2: ( RULE_STRING )
            // InternalXMachine.g:493:3: RULE_STRING
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
    // InternalXMachine.g:503:1: ruleXDirection : ( ( rule__XDirection__Alternatives ) ) ;
    public final void ruleXDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:507:1: ( ( ( rule__XDirection__Alternatives ) ) )
            // InternalXMachine.g:508:2: ( ( rule__XDirection__Alternatives ) )
            {
            // InternalXMachine.g:508:2: ( ( rule__XDirection__Alternatives ) )
            // InternalXMachine.g:509:3: ( rule__XDirection__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXDirectionAccess().getAlternatives()); 
            }
            // InternalXMachine.g:510:3: ( rule__XDirection__Alternatives )
            // InternalXMachine.g:510:4: rule__XDirection__Alternatives
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
    // InternalXMachine.g:519:1: ruleXConvergence : ( ( rule__XConvergence__Alternatives ) ) ;
    public final void ruleXConvergence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:523:1: ( ( ( rule__XConvergence__Alternatives ) ) )
            // InternalXMachine.g:524:2: ( ( rule__XConvergence__Alternatives ) )
            {
            // InternalXMachine.g:524:2: ( ( rule__XConvergence__Alternatives ) )
            // InternalXMachine.g:525:3: ( rule__XConvergence__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConvergenceAccess().getAlternatives()); 
            }
            // InternalXMachine.g:526:3: ( rule__XConvergence__Alternatives )
            // InternalXMachine.g:526:4: rule__XConvergence__Alternatives
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
    // InternalXMachine.g:534:1: rule__XEvent__Alternatives_6 : ( ( ( rule__XEvent__Group_6_0__0 ) ) | ( ( rule__XEvent__Group_6_1__0 ) ) | ( ( rule__XEvent__Group_6_2__0 ) ) );
    public final void rule__XEvent__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:538:1: ( ( ( rule__XEvent__Group_6_0__0 ) ) | ( ( rule__XEvent__Group_6_1__0 ) ) | ( ( rule__XEvent__Group_6_2__0 ) ) )
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
                    // InternalXMachine.g:539:2: ( ( rule__XEvent__Group_6_0__0 ) )
                    {
                    // InternalXMachine.g:539:2: ( ( rule__XEvent__Group_6_0__0 ) )
                    // InternalXMachine.g:540:3: ( rule__XEvent__Group_6_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_6_0()); 
                    }
                    // InternalXMachine.g:541:3: ( rule__XEvent__Group_6_0__0 )
                    // InternalXMachine.g:541:4: rule__XEvent__Group_6_0__0
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
                    // InternalXMachine.g:545:2: ( ( rule__XEvent__Group_6_1__0 ) )
                    {
                    // InternalXMachine.g:545:2: ( ( rule__XEvent__Group_6_1__0 ) )
                    // InternalXMachine.g:546:3: ( rule__XEvent__Group_6_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_6_1()); 
                    }
                    // InternalXMachine.g:547:3: ( rule__XEvent__Group_6_1__0 )
                    // InternalXMachine.g:547:4: rule__XEvent__Group_6_1__0
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
                    // InternalXMachine.g:551:2: ( ( rule__XEvent__Group_6_2__0 ) )
                    {
                    // InternalXMachine.g:551:2: ( ( rule__XEvent__Group_6_2__0 ) )
                    // InternalXMachine.g:552:3: ( rule__XEvent__Group_6_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_6_2()); 
                    }
                    // InternalXMachine.g:553:3: ( rule__XEvent__Group_6_2__0 )
                    // InternalXMachine.g:553:4: rule__XEvent__Group_6_2__0
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
    // InternalXMachine.g:561:1: rule__XGroupOrEvent__Alternatives : ( ( ruleGroupSync ) | ( ruleEventSync ) );
    public final void rule__XGroupOrEvent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:565:1: ( ( ruleGroupSync ) | ( ruleEventSync ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==40) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=2;
                }
                else if ( (LA2_1==29) ) {
                    alt2=1;
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
                    // InternalXMachine.g:566:2: ( ruleGroupSync )
                    {
                    // InternalXMachine.g:566:2: ( ruleGroupSync )
                    // InternalXMachine.g:567:3: ruleGroupSync
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
                    // InternalXMachine.g:572:2: ( ruleEventSync )
                    {
                    // InternalXMachine.g:572:2: ( ruleEventSync )
                    // InternalXMachine.g:573:3: ruleEventSync
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
    // InternalXMachine.g:582:1: rule__XDirection__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );
    public final void rule__XDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:586:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) )
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
                    // InternalXMachine.g:587:2: ( ( 'in' ) )
                    {
                    // InternalXMachine.g:587:2: ( ( 'in' ) )
                    // InternalXMachine.g:588:3: ( 'in' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXDirectionAccess().getInEnumLiteralDeclaration_0()); 
                    }
                    // InternalXMachine.g:589:3: ( 'in' )
                    // InternalXMachine.g:589:4: 'in'
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
                    // InternalXMachine.g:593:2: ( ( 'out' ) )
                    {
                    // InternalXMachine.g:593:2: ( ( 'out' ) )
                    // InternalXMachine.g:594:3: ( 'out' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXDirectionAccess().getOutEnumLiteralDeclaration_1()); 
                    }
                    // InternalXMachine.g:595:3: ( 'out' )
                    // InternalXMachine.g:595:4: 'out'
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
    // InternalXMachine.g:603:1: rule__XConvergence__Alternatives : ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) );
    public final void rule__XConvergence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:607:1: ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) )
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
                    // InternalXMachine.g:608:2: ( ( 'ordinary' ) )
                    {
                    // InternalXMachine.g:608:2: ( ( 'ordinary' ) )
                    // InternalXMachine.g:609:3: ( 'ordinary' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    }
                    // InternalXMachine.g:610:3: ( 'ordinary' )
                    // InternalXMachine.g:610:4: 'ordinary'
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
                    // InternalXMachine.g:614:2: ( ( 'convergent' ) )
                    {
                    // InternalXMachine.g:614:2: ( ( 'convergent' ) )
                    // InternalXMachine.g:615:3: ( 'convergent' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    }
                    // InternalXMachine.g:616:3: ( 'convergent' )
                    // InternalXMachine.g:616:4: 'convergent'
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
                    // InternalXMachine.g:620:2: ( ( 'anticipated' ) )
                    {
                    // InternalXMachine.g:620:2: ( ( 'anticipated' ) )
                    // InternalXMachine.g:621:3: ( 'anticipated' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    }
                    // InternalXMachine.g:622:3: ( 'anticipated' )
                    // InternalXMachine.g:622:4: 'anticipated'
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
    // InternalXMachine.g:630:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:634:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalXMachine.g:635:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
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
    // InternalXMachine.g:642:1: rule__Machine__Group__0__Impl : ( () ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:646:1: ( ( () ) )
            // InternalXMachine.g:647:1: ( () )
            {
            // InternalXMachine.g:647:1: ( () )
            // InternalXMachine.g:648:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineAction_0()); 
            }
            // InternalXMachine.g:649:2: ()
            // InternalXMachine.g:649:3: 
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
    // InternalXMachine.g:657:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:661:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalXMachine.g:662:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
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
    // InternalXMachine.g:669:1: rule__Machine__Group__1__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:673:1: ( ( 'machine' ) )
            // InternalXMachine.g:674:1: ( 'machine' )
            {
            // InternalXMachine.g:674:1: ( 'machine' )
            // InternalXMachine.g:675:2: 'machine'
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
    // InternalXMachine.g:684:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:688:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalXMachine.g:689:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
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
    // InternalXMachine.g:696:1: rule__Machine__Group__2__Impl : ( ( rule__Machine__NameAssignment_2 ) ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:700:1: ( ( ( rule__Machine__NameAssignment_2 ) ) )
            // InternalXMachine.g:701:1: ( ( rule__Machine__NameAssignment_2 ) )
            {
            // InternalXMachine.g:701:1: ( ( rule__Machine__NameAssignment_2 ) )
            // InternalXMachine.g:702:2: ( rule__Machine__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:703:2: ( rule__Machine__NameAssignment_2 )
            // InternalXMachine.g:703:3: rule__Machine__NameAssignment_2
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
    // InternalXMachine.g:711:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:715:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // InternalXMachine.g:716:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
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
    // InternalXMachine.g:723:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__UnorderedGroup_3 ) ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:727:1: ( ( ( rule__Machine__UnorderedGroup_3 ) ) )
            // InternalXMachine.g:728:1: ( ( rule__Machine__UnorderedGroup_3 ) )
            {
            // InternalXMachine.g:728:1: ( ( rule__Machine__UnorderedGroup_3 ) )
            // InternalXMachine.g:729:2: ( rule__Machine__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getUnorderedGroup_3()); 
            }
            // InternalXMachine.g:730:2: ( rule__Machine__UnorderedGroup_3 )
            // InternalXMachine.g:730:3: rule__Machine__UnorderedGroup_3
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
    // InternalXMachine.g:738:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:742:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // InternalXMachine.g:743:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
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
    // InternalXMachine.g:750:1: rule__Machine__Group__4__Impl : ( ( rule__Machine__Group_4__0 )? ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:754:1: ( ( ( rule__Machine__Group_4__0 )? ) )
            // InternalXMachine.g:755:1: ( ( rule__Machine__Group_4__0 )? )
            {
            // InternalXMachine.g:755:1: ( ( rule__Machine__Group_4__0 )? )
            // InternalXMachine.g:756:2: ( rule__Machine__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_4()); 
            }
            // InternalXMachine.g:757:2: ( rule__Machine__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXMachine.g:757:3: rule__Machine__Group_4__0
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
    // InternalXMachine.g:765:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:769:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // InternalXMachine.g:770:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
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
    // InternalXMachine.g:777:1: rule__Machine__Group__5__Impl : ( ( rule__Machine__Group_5__0 )? ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:781:1: ( ( ( rule__Machine__Group_5__0 )? ) )
            // InternalXMachine.g:782:1: ( ( rule__Machine__Group_5__0 )? )
            {
            // InternalXMachine.g:782:1: ( ( rule__Machine__Group_5__0 )? )
            // InternalXMachine.g:783:2: ( rule__Machine__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_5()); 
            }
            // InternalXMachine.g:784:2: ( rule__Machine__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:784:3: rule__Machine__Group_5__0
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
    // InternalXMachine.g:792:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl rule__Machine__Group__7 ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:796:1: ( rule__Machine__Group__6__Impl rule__Machine__Group__7 )
            // InternalXMachine.g:797:2: rule__Machine__Group__6__Impl rule__Machine__Group__7
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
    // InternalXMachine.g:804:1: rule__Machine__Group__6__Impl : ( ( rule__Machine__Group_6__0 )? ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:808:1: ( ( ( rule__Machine__Group_6__0 )? ) )
            // InternalXMachine.g:809:1: ( ( rule__Machine__Group_6__0 )? )
            {
            // InternalXMachine.g:809:1: ( ( rule__Machine__Group_6__0 )? )
            // InternalXMachine.g:810:2: ( rule__Machine__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_6()); 
            }
            // InternalXMachine.g:811:2: ( rule__Machine__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXMachine.g:811:3: rule__Machine__Group_6__0
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
    // InternalXMachine.g:819:1: rule__Machine__Group__7 : rule__Machine__Group__7__Impl rule__Machine__Group__8 ;
    public final void rule__Machine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:823:1: ( rule__Machine__Group__7__Impl rule__Machine__Group__8 )
            // InternalXMachine.g:824:2: rule__Machine__Group__7__Impl rule__Machine__Group__8
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
    // InternalXMachine.g:831:1: rule__Machine__Group__7__Impl : ( ( rule__Machine__Group_7__0 )? ) ;
    public final void rule__Machine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:835:1: ( ( ( rule__Machine__Group_7__0 )? ) )
            // InternalXMachine.g:836:1: ( ( rule__Machine__Group_7__0 )? )
            {
            // InternalXMachine.g:836:1: ( ( rule__Machine__Group_7__0 )? )
            // InternalXMachine.g:837:2: ( rule__Machine__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_7()); 
            }
            // InternalXMachine.g:838:2: ( rule__Machine__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:838:3: rule__Machine__Group_7__0
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
    // InternalXMachine.g:846:1: rule__Machine__Group__8 : rule__Machine__Group__8__Impl rule__Machine__Group__9 ;
    public final void rule__Machine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:850:1: ( rule__Machine__Group__8__Impl rule__Machine__Group__9 )
            // InternalXMachine.g:851:2: rule__Machine__Group__8__Impl rule__Machine__Group__9
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
    // InternalXMachine.g:858:1: rule__Machine__Group__8__Impl : ( ( rule__Machine__ExtensionsAssignment_8 )* ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:862:1: ( ( ( rule__Machine__ExtensionsAssignment_8 )* ) )
            // InternalXMachine.g:863:1: ( ( rule__Machine__ExtensionsAssignment_8 )* )
            {
            // InternalXMachine.g:863:1: ( ( rule__Machine__ExtensionsAssignment_8 )* )
            // InternalXMachine.g:864:2: ( rule__Machine__ExtensionsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getExtensionsAssignment_8()); 
            }
            // InternalXMachine.g:865:2: ( rule__Machine__ExtensionsAssignment_8 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXMachine.g:865:3: rule__Machine__ExtensionsAssignment_8
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
    // InternalXMachine.g:873:1: rule__Machine__Group__9 : rule__Machine__Group__9__Impl ;
    public final void rule__Machine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:877:1: ( rule__Machine__Group__9__Impl )
            // InternalXMachine.g:878:2: rule__Machine__Group__9__Impl
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
    // InternalXMachine.g:884:1: rule__Machine__Group__9__Impl : ( 'end' ) ;
    public final void rule__Machine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:888:1: ( ( 'end' ) )
            // InternalXMachine.g:889:1: ( 'end' )
            {
            // InternalXMachine.g:889:1: ( 'end' )
            // InternalXMachine.g:890:2: 'end'
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
    // InternalXMachine.g:900:1: rule__Machine__Group_3_0__0 : rule__Machine__Group_3_0__0__Impl rule__Machine__Group_3_0__1 ;
    public final void rule__Machine__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:904:1: ( rule__Machine__Group_3_0__0__Impl rule__Machine__Group_3_0__1 )
            // InternalXMachine.g:905:2: rule__Machine__Group_3_0__0__Impl rule__Machine__Group_3_0__1
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
    // InternalXMachine.g:912:1: rule__Machine__Group_3_0__0__Impl : ( 'refines' ) ;
    public final void rule__Machine__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:916:1: ( ( 'refines' ) )
            // InternalXMachine.g:917:1: ( 'refines' )
            {
            // InternalXMachine.g:917:1: ( 'refines' )
            // InternalXMachine.g:918:2: 'refines'
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
    // InternalXMachine.g:927:1: rule__Machine__Group_3_0__1 : rule__Machine__Group_3_0__1__Impl ;
    public final void rule__Machine__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:931:1: ( rule__Machine__Group_3_0__1__Impl )
            // InternalXMachine.g:932:2: rule__Machine__Group_3_0__1__Impl
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
    // InternalXMachine.g:938:1: rule__Machine__Group_3_0__1__Impl : ( ( rule__Machine__RefinesAssignment_3_0_1 ) ) ;
    public final void rule__Machine__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:942:1: ( ( ( rule__Machine__RefinesAssignment_3_0_1 ) ) )
            // InternalXMachine.g:943:1: ( ( rule__Machine__RefinesAssignment_3_0_1 ) )
            {
            // InternalXMachine.g:943:1: ( ( rule__Machine__RefinesAssignment_3_0_1 ) )
            // InternalXMachine.g:944:2: ( rule__Machine__RefinesAssignment_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesAssignment_3_0_1()); 
            }
            // InternalXMachine.g:945:2: ( rule__Machine__RefinesAssignment_3_0_1 )
            // InternalXMachine.g:945:3: rule__Machine__RefinesAssignment_3_0_1
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
    // InternalXMachine.g:954:1: rule__Machine__Group_3_1__0 : rule__Machine__Group_3_1__0__Impl rule__Machine__Group_3_1__1 ;
    public final void rule__Machine__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:958:1: ( rule__Machine__Group_3_1__0__Impl rule__Machine__Group_3_1__1 )
            // InternalXMachine.g:959:2: rule__Machine__Group_3_1__0__Impl rule__Machine__Group_3_1__1
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
    // InternalXMachine.g:966:1: rule__Machine__Group_3_1__0__Impl : ( 'sees' ) ;
    public final void rule__Machine__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:970:1: ( ( 'sees' ) )
            // InternalXMachine.g:971:1: ( 'sees' )
            {
            // InternalXMachine.g:971:1: ( 'sees' )
            // InternalXMachine.g:972:2: 'sees'
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
    // InternalXMachine.g:981:1: rule__Machine__Group_3_1__1 : rule__Machine__Group_3_1__1__Impl ;
    public final void rule__Machine__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:985:1: ( rule__Machine__Group_3_1__1__Impl )
            // InternalXMachine.g:986:2: rule__Machine__Group_3_1__1__Impl
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
    // InternalXMachine.g:992:1: rule__Machine__Group_3_1__1__Impl : ( ( ( rule__Machine__SeesAssignment_3_1_1 ) ) ( ( rule__Machine__SeesAssignment_3_1_1 )* ) ) ;
    public final void rule__Machine__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:996:1: ( ( ( ( rule__Machine__SeesAssignment_3_1_1 ) ) ( ( rule__Machine__SeesAssignment_3_1_1 )* ) ) )
            // InternalXMachine.g:997:1: ( ( ( rule__Machine__SeesAssignment_3_1_1 ) ) ( ( rule__Machine__SeesAssignment_3_1_1 )* ) )
            {
            // InternalXMachine.g:997:1: ( ( ( rule__Machine__SeesAssignment_3_1_1 ) ) ( ( rule__Machine__SeesAssignment_3_1_1 )* ) )
            // InternalXMachine.g:998:2: ( ( rule__Machine__SeesAssignment_3_1_1 ) ) ( ( rule__Machine__SeesAssignment_3_1_1 )* )
            {
            // InternalXMachine.g:998:2: ( ( rule__Machine__SeesAssignment_3_1_1 ) )
            // InternalXMachine.g:999:3: ( rule__Machine__SeesAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesAssignment_3_1_1()); 
            }
            // InternalXMachine.g:1000:3: ( rule__Machine__SeesAssignment_3_1_1 )
            // InternalXMachine.g:1000:4: rule__Machine__SeesAssignment_3_1_1
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

            // InternalXMachine.g:1003:2: ( ( rule__Machine__SeesAssignment_3_1_1 )* )
            // InternalXMachine.g:1004:3: ( rule__Machine__SeesAssignment_3_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesAssignment_3_1_1()); 
            }
            // InternalXMachine.g:1005:3: ( rule__Machine__SeesAssignment_3_1_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXMachine.g:1005:4: rule__Machine__SeesAssignment_3_1_1
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
    // InternalXMachine.g:1015:1: rule__Machine__Group_4__0 : rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1 ;
    public final void rule__Machine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1019:1: ( rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1 )
            // InternalXMachine.g:1020:2: rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1
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
    // InternalXMachine.g:1027:1: rule__Machine__Group_4__0__Impl : ( 'variables' ) ;
    public final void rule__Machine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1031:1: ( ( 'variables' ) )
            // InternalXMachine.g:1032:1: ( 'variables' )
            {
            // InternalXMachine.g:1032:1: ( 'variables' )
            // InternalXMachine.g:1033:2: 'variables'
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
    // InternalXMachine.g:1042:1: rule__Machine__Group_4__1 : rule__Machine__Group_4__1__Impl ;
    public final void rule__Machine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1046:1: ( rule__Machine__Group_4__1__Impl )
            // InternalXMachine.g:1047:2: rule__Machine__Group_4__1__Impl
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
    // InternalXMachine.g:1053:1: rule__Machine__Group_4__1__Impl : ( ( ( rule__Machine__VariablesAssignment_4_1 ) ) ( ( rule__Machine__VariablesAssignment_4_1 )* ) ) ;
    public final void rule__Machine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1057:1: ( ( ( ( rule__Machine__VariablesAssignment_4_1 ) ) ( ( rule__Machine__VariablesAssignment_4_1 )* ) ) )
            // InternalXMachine.g:1058:1: ( ( ( rule__Machine__VariablesAssignment_4_1 ) ) ( ( rule__Machine__VariablesAssignment_4_1 )* ) )
            {
            // InternalXMachine.g:1058:1: ( ( ( rule__Machine__VariablesAssignment_4_1 ) ) ( ( rule__Machine__VariablesAssignment_4_1 )* ) )
            // InternalXMachine.g:1059:2: ( ( rule__Machine__VariablesAssignment_4_1 ) ) ( ( rule__Machine__VariablesAssignment_4_1 )* )
            {
            // InternalXMachine.g:1059:2: ( ( rule__Machine__VariablesAssignment_4_1 ) )
            // InternalXMachine.g:1060:3: ( rule__Machine__VariablesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesAssignment_4_1()); 
            }
            // InternalXMachine.g:1061:3: ( rule__Machine__VariablesAssignment_4_1 )
            // InternalXMachine.g:1061:4: rule__Machine__VariablesAssignment_4_1
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

            // InternalXMachine.g:1064:2: ( ( rule__Machine__VariablesAssignment_4_1 )* )
            // InternalXMachine.g:1065:3: ( rule__Machine__VariablesAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesAssignment_4_1()); 
            }
            // InternalXMachine.g:1066:3: ( rule__Machine__VariablesAssignment_4_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXMachine.g:1066:4: rule__Machine__VariablesAssignment_4_1
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
    // InternalXMachine.g:1076:1: rule__Machine__Group_5__0 : rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 ;
    public final void rule__Machine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1080:1: ( rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 )
            // InternalXMachine.g:1081:2: rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1
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
    // InternalXMachine.g:1088:1: rule__Machine__Group_5__0__Impl : ( 'invariants' ) ;
    public final void rule__Machine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1092:1: ( ( 'invariants' ) )
            // InternalXMachine.g:1093:1: ( 'invariants' )
            {
            // InternalXMachine.g:1093:1: ( 'invariants' )
            // InternalXMachine.g:1094:2: 'invariants'
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
    // InternalXMachine.g:1103:1: rule__Machine__Group_5__1 : rule__Machine__Group_5__1__Impl ;
    public final void rule__Machine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1107:1: ( rule__Machine__Group_5__1__Impl )
            // InternalXMachine.g:1108:2: rule__Machine__Group_5__1__Impl
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
    // InternalXMachine.g:1114:1: rule__Machine__Group_5__1__Impl : ( ( ( rule__Machine__InvariantsAssignment_5_1 ) ) ( ( rule__Machine__InvariantsAssignment_5_1 )* ) ) ;
    public final void rule__Machine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1118:1: ( ( ( ( rule__Machine__InvariantsAssignment_5_1 ) ) ( ( rule__Machine__InvariantsAssignment_5_1 )* ) ) )
            // InternalXMachine.g:1119:1: ( ( ( rule__Machine__InvariantsAssignment_5_1 ) ) ( ( rule__Machine__InvariantsAssignment_5_1 )* ) )
            {
            // InternalXMachine.g:1119:1: ( ( ( rule__Machine__InvariantsAssignment_5_1 ) ) ( ( rule__Machine__InvariantsAssignment_5_1 )* ) )
            // InternalXMachine.g:1120:2: ( ( rule__Machine__InvariantsAssignment_5_1 ) ) ( ( rule__Machine__InvariantsAssignment_5_1 )* )
            {
            // InternalXMachine.g:1120:2: ( ( rule__Machine__InvariantsAssignment_5_1 ) )
            // InternalXMachine.g:1121:3: ( rule__Machine__InvariantsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsAssignment_5_1()); 
            }
            // InternalXMachine.g:1122:3: ( rule__Machine__InvariantsAssignment_5_1 )
            // InternalXMachine.g:1122:4: rule__Machine__InvariantsAssignment_5_1
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

            // InternalXMachine.g:1125:2: ( ( rule__Machine__InvariantsAssignment_5_1 )* )
            // InternalXMachine.g:1126:3: ( rule__Machine__InvariantsAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsAssignment_5_1()); 
            }
            // InternalXMachine.g:1127:3: ( rule__Machine__InvariantsAssignment_5_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_XLABEL) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXMachine.g:1127:4: rule__Machine__InvariantsAssignment_5_1
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
    // InternalXMachine.g:1137:1: rule__Machine__Group_6__0 : rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 ;
    public final void rule__Machine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1141:1: ( rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 )
            // InternalXMachine.g:1142:2: rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1
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
    // InternalXMachine.g:1149:1: rule__Machine__Group_6__0__Impl : ( 'variant' ) ;
    public final void rule__Machine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1153:1: ( ( 'variant' ) )
            // InternalXMachine.g:1154:1: ( 'variant' )
            {
            // InternalXMachine.g:1154:1: ( 'variant' )
            // InternalXMachine.g:1155:2: 'variant'
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
    // InternalXMachine.g:1164:1: rule__Machine__Group_6__1 : rule__Machine__Group_6__1__Impl ;
    public final void rule__Machine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1168:1: ( rule__Machine__Group_6__1__Impl )
            // InternalXMachine.g:1169:2: rule__Machine__Group_6__1__Impl
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
    // InternalXMachine.g:1175:1: rule__Machine__Group_6__1__Impl : ( ( rule__Machine__VariantAssignment_6_1 ) ) ;
    public final void rule__Machine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1179:1: ( ( ( rule__Machine__VariantAssignment_6_1 ) ) )
            // InternalXMachine.g:1180:1: ( ( rule__Machine__VariantAssignment_6_1 ) )
            {
            // InternalXMachine.g:1180:1: ( ( rule__Machine__VariantAssignment_6_1 ) )
            // InternalXMachine.g:1181:2: ( rule__Machine__VariantAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariantAssignment_6_1()); 
            }
            // InternalXMachine.g:1182:2: ( rule__Machine__VariantAssignment_6_1 )
            // InternalXMachine.g:1182:3: rule__Machine__VariantAssignment_6_1
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
    // InternalXMachine.g:1191:1: rule__Machine__Group_7__0 : rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 ;
    public final void rule__Machine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1195:1: ( rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 )
            // InternalXMachine.g:1196:2: rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1
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
    // InternalXMachine.g:1203:1: rule__Machine__Group_7__0__Impl : ( 'events' ) ;
    public final void rule__Machine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1207:1: ( ( 'events' ) )
            // InternalXMachine.g:1208:1: ( 'events' )
            {
            // InternalXMachine.g:1208:1: ( 'events' )
            // InternalXMachine.g:1209:2: 'events'
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
    // InternalXMachine.g:1218:1: rule__Machine__Group_7__1 : rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2 ;
    public final void rule__Machine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1222:1: ( rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2 )
            // InternalXMachine.g:1223:2: rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2
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
    // InternalXMachine.g:1230:1: rule__Machine__Group_7__1__Impl : ( ( rule__Machine__EventsAssignment_7_1 ) ) ;
    public final void rule__Machine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1234:1: ( ( ( rule__Machine__EventsAssignment_7_1 ) ) )
            // InternalXMachine.g:1235:1: ( ( rule__Machine__EventsAssignment_7_1 ) )
            {
            // InternalXMachine.g:1235:1: ( ( rule__Machine__EventsAssignment_7_1 ) )
            // InternalXMachine.g:1236:2: ( rule__Machine__EventsAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsAssignment_7_1()); 
            }
            // InternalXMachine.g:1237:2: ( rule__Machine__EventsAssignment_7_1 )
            // InternalXMachine.g:1237:3: rule__Machine__EventsAssignment_7_1
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
    // InternalXMachine.g:1245:1: rule__Machine__Group_7__2 : rule__Machine__Group_7__2__Impl ;
    public final void rule__Machine__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1249:1: ( rule__Machine__Group_7__2__Impl )
            // InternalXMachine.g:1250:2: rule__Machine__Group_7__2__Impl
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
    // InternalXMachine.g:1256:1: rule__Machine__Group_7__2__Impl : ( ( rule__Machine__EventsAssignment_7_2 )* ) ;
    public final void rule__Machine__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1260:1: ( ( ( rule__Machine__EventsAssignment_7_2 )* ) )
            // InternalXMachine.g:1261:1: ( ( rule__Machine__EventsAssignment_7_2 )* )
            {
            // InternalXMachine.g:1261:1: ( ( rule__Machine__EventsAssignment_7_2 )* )
            // InternalXMachine.g:1262:2: ( rule__Machine__EventsAssignment_7_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsAssignment_7_2()); 
            }
            // InternalXMachine.g:1263:2: ( rule__Machine__EventsAssignment_7_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXMachine.g:1263:3: rule__Machine__EventsAssignment_7_2
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
    // InternalXMachine.g:1272:1: rule__MIncludes__Group__0 : rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 ;
    public final void rule__MIncludes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1276:1: ( rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 )
            // InternalXMachine.g:1277:2: rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1
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
    // InternalXMachine.g:1284:1: rule__MIncludes__Group__0__Impl : ( () ) ;
    public final void rule__MIncludes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1288:1: ( ( () ) )
            // InternalXMachine.g:1289:1: ( () )
            {
            // InternalXMachine.g:1289:1: ( () )
            // InternalXMachine.g:1290:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 
            }
            // InternalXMachine.g:1291:2: ()
            // InternalXMachine.g:1291:3: 
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
    // InternalXMachine.g:1299:1: rule__MIncludes__Group__1 : rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 ;
    public final void rule__MIncludes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1303:1: ( rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 )
            // InternalXMachine.g:1304:2: rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2
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
    // InternalXMachine.g:1311:1: rule__MIncludes__Group__1__Impl : ( ( rule__MIncludes__Group_1__0 ) ) ;
    public final void rule__MIncludes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1315:1: ( ( ( rule__MIncludes__Group_1__0 ) ) )
            // InternalXMachine.g:1316:1: ( ( rule__MIncludes__Group_1__0 ) )
            {
            // InternalXMachine.g:1316:1: ( ( rule__MIncludes__Group_1__0 ) )
            // InternalXMachine.g:1317:2: ( rule__MIncludes__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_1()); 
            }
            // InternalXMachine.g:1318:2: ( rule__MIncludes__Group_1__0 )
            // InternalXMachine.g:1318:3: rule__MIncludes__Group_1__0
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
    // InternalXMachine.g:1326:1: rule__MIncludes__Group__2 : rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 ;
    public final void rule__MIncludes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1330:1: ( rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 )
            // InternalXMachine.g:1331:2: rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3
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
    // InternalXMachine.g:1338:1: rule__MIncludes__Group__2__Impl : ( ( rule__MIncludes__Group_2__0 )? ) ;
    public final void rule__MIncludes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1342:1: ( ( ( rule__MIncludes__Group_2__0 )? ) )
            // InternalXMachine.g:1343:1: ( ( rule__MIncludes__Group_2__0 )? )
            {
            // InternalXMachine.g:1343:1: ( ( rule__MIncludes__Group_2__0 )? )
            // InternalXMachine.g:1344:2: ( rule__MIncludes__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_2()); 
            }
            // InternalXMachine.g:1345:2: ( rule__MIncludes__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMachine.g:1345:3: rule__MIncludes__Group_2__0
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
    // InternalXMachine.g:1353:1: rule__MIncludes__Group__3 : rule__MIncludes__Group__3__Impl ;
    public final void rule__MIncludes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1357:1: ( rule__MIncludes__Group__3__Impl )
            // InternalXMachine.g:1358:2: rule__MIncludes__Group__3__Impl
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
    // InternalXMachine.g:1364:1: rule__MIncludes__Group__3__Impl : ( ( rule__MIncludes__Group_3__0 )? ) ;
    public final void rule__MIncludes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1368:1: ( ( ( rule__MIncludes__Group_3__0 )? ) )
            // InternalXMachine.g:1369:1: ( ( rule__MIncludes__Group_3__0 )? )
            {
            // InternalXMachine.g:1369:1: ( ( rule__MIncludes__Group_3__0 )? )
            // InternalXMachine.g:1370:2: ( rule__MIncludes__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_3()); 
            }
            // InternalXMachine.g:1371:2: ( rule__MIncludes__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXMachine.g:1371:3: rule__MIncludes__Group_3__0
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
    // InternalXMachine.g:1380:1: rule__MIncludes__Group_1__0 : rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 ;
    public final void rule__MIncludes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1384:1: ( rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 )
            // InternalXMachine.g:1385:2: rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1
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
    // InternalXMachine.g:1392:1: rule__MIncludes__Group_1__0__Impl : ( 'includes' ) ;
    public final void rule__MIncludes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1396:1: ( ( 'includes' ) )
            // InternalXMachine.g:1397:1: ( 'includes' )
            {
            // InternalXMachine.g:1397:1: ( 'includes' )
            // InternalXMachine.g:1398:2: 'includes'
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
    // InternalXMachine.g:1407:1: rule__MIncludes__Group_1__1 : rule__MIncludes__Group_1__1__Impl ;
    public final void rule__MIncludes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1411:1: ( rule__MIncludes__Group_1__1__Impl )
            // InternalXMachine.g:1412:2: rule__MIncludes__Group_1__1__Impl
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
    // InternalXMachine.g:1418:1: rule__MIncludes__Group_1__1__Impl : ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) ;
    public final void rule__MIncludes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1422:1: ( ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) )
            // InternalXMachine.g:1423:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            {
            // InternalXMachine.g:1423:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            // InternalXMachine.g:1424:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 
            }
            // InternalXMachine.g:1425:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            // InternalXMachine.g:1425:3: rule__MIncludes__AbstractMachineAssignment_1_1
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
    // InternalXMachine.g:1434:1: rule__MIncludes__Group_2__0 : rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 ;
    public final void rule__MIncludes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1438:1: ( rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 )
            // InternalXMachine.g:1439:2: rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1
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
    // InternalXMachine.g:1446:1: rule__MIncludes__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__MIncludes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1450:1: ( ( 'to' ) )
            // InternalXMachine.g:1451:1: ( 'to' )
            {
            // InternalXMachine.g:1451:1: ( 'to' )
            // InternalXMachine.g:1452:2: 'to'
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
    // InternalXMachine.g:1461:1: rule__MIncludes__Group_2__1 : rule__MIncludes__Group_2__1__Impl ;
    public final void rule__MIncludes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1465:1: ( rule__MIncludes__Group_2__1__Impl )
            // InternalXMachine.g:1466:2: rule__MIncludes__Group_2__1__Impl
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
    // InternalXMachine.g:1472:1: rule__MIncludes__Group_2__1__Impl : ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) ;
    public final void rule__MIncludes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1476:1: ( ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) )
            // InternalXMachine.g:1477:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            {
            // InternalXMachine.g:1477:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            // InternalXMachine.g:1478:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 
            }
            // InternalXMachine.g:1479:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            // InternalXMachine.g:1479:3: rule__MIncludes__ConcreteMachineAssignment_2_1
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
    // InternalXMachine.g:1488:1: rule__MIncludes__Group_3__0 : rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 ;
    public final void rule__MIncludes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1492:1: ( rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 )
            // InternalXMachine.g:1493:2: rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1
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
    // InternalXMachine.g:1500:1: rule__MIncludes__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__MIncludes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1504:1: ( ( 'as' ) )
            // InternalXMachine.g:1505:1: ( 'as' )
            {
            // InternalXMachine.g:1505:1: ( 'as' )
            // InternalXMachine.g:1506:2: 'as'
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
    // InternalXMachine.g:1515:1: rule__MIncludes__Group_3__1 : rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 ;
    public final void rule__MIncludes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1519:1: ( rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 )
            // InternalXMachine.g:1520:2: rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2
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
    // InternalXMachine.g:1527:1: rule__MIncludes__Group_3__1__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) ;
    public final void rule__MIncludes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1531:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) )
            // InternalXMachine.g:1532:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            {
            // InternalXMachine.g:1532:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            // InternalXMachine.g:1533:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 
            }
            // InternalXMachine.g:1534:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            // InternalXMachine.g:1534:3: rule__MIncludes__PrefixesAssignment_3_1
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
    // InternalXMachine.g:1542:1: rule__MIncludes__Group_3__2 : rule__MIncludes__Group_3__2__Impl ;
    public final void rule__MIncludes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1546:1: ( rule__MIncludes__Group_3__2__Impl )
            // InternalXMachine.g:1547:2: rule__MIncludes__Group_3__2__Impl
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
    // InternalXMachine.g:1553:1: rule__MIncludes__Group_3__2__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) ;
    public final void rule__MIncludes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1557:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) )
            // InternalXMachine.g:1558:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            {
            // InternalXMachine.g:1558:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            // InternalXMachine.g:1559:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 
            }
            // InternalXMachine.g:1560:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalXMachine.g:1560:3: rule__MIncludes__PrefixesAssignment_3_2
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
    // InternalXMachine.g:1569:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1573:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXMachine.g:1574:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalXMachine.g:1581:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1585:1: ( ( RULE_ID ) )
            // InternalXMachine.g:1586:1: ( RULE_ID )
            {
            // InternalXMachine.g:1586:1: ( RULE_ID )
            // InternalXMachine.g:1587:2: RULE_ID
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
    // InternalXMachine.g:1596:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1600:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXMachine.g:1601:2: rule__QualifiedName__Group__1__Impl
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
    // InternalXMachine.g:1607:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )? ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1611:1: ( ( ( rule__QualifiedName__Group_1__0 )? ) )
            // InternalXMachine.g:1612:1: ( ( rule__QualifiedName__Group_1__0 )? )
            {
            // InternalXMachine.g:1612:1: ( ( rule__QualifiedName__Group_1__0 )? )
            // InternalXMachine.g:1613:2: ( rule__QualifiedName__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalXMachine.g:1614:2: ( rule__QualifiedName__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:1614:3: rule__QualifiedName__Group_1__0
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
    // InternalXMachine.g:1623:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1627:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXMachine.g:1628:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalXMachine.g:1635:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1639:1: ( ( '.' ) )
            // InternalXMachine.g:1640:1: ( '.' )
            {
            // InternalXMachine.g:1640:1: ( '.' )
            // InternalXMachine.g:1641:2: '.'
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
    // InternalXMachine.g:1650:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1654:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXMachine.g:1655:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalXMachine.g:1661:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1665:1: ( ( RULE_ID ) )
            // InternalXMachine.g:1666:1: ( RULE_ID )
            {
            // InternalXMachine.g:1666:1: ( RULE_ID )
            // InternalXMachine.g:1667:2: RULE_ID
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
    // InternalXMachine.g:1677:1: rule__XVariable__Group__0 : rule__XVariable__Group__0__Impl rule__XVariable__Group__1 ;
    public final void rule__XVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1681:1: ( rule__XVariable__Group__0__Impl rule__XVariable__Group__1 )
            // InternalXMachine.g:1682:2: rule__XVariable__Group__0__Impl rule__XVariable__Group__1
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
    // InternalXMachine.g:1689:1: rule__XVariable__Group__0__Impl : ( () ) ;
    public final void rule__XVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1693:1: ( ( () ) )
            // InternalXMachine.g:1694:1: ( () )
            {
            // InternalXMachine.g:1694:1: ( () )
            // InternalXMachine.g:1695:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariableAccess().getVariableAction_0()); 
            }
            // InternalXMachine.g:1696:2: ()
            // InternalXMachine.g:1696:3: 
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
    // InternalXMachine.g:1704:1: rule__XVariable__Group__1 : rule__XVariable__Group__1__Impl ;
    public final void rule__XVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1708:1: ( rule__XVariable__Group__1__Impl )
            // InternalXMachine.g:1709:2: rule__XVariable__Group__1__Impl
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
    // InternalXMachine.g:1715:1: rule__XVariable__Group__1__Impl : ( ( rule__XVariable__NameAssignment_1 ) ) ;
    public final void rule__XVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1719:1: ( ( ( rule__XVariable__NameAssignment_1 ) ) )
            // InternalXMachine.g:1720:1: ( ( rule__XVariable__NameAssignment_1 ) )
            {
            // InternalXMachine.g:1720:1: ( ( rule__XVariable__NameAssignment_1 ) )
            // InternalXMachine.g:1721:2: ( rule__XVariable__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariableAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:1722:2: ( rule__XVariable__NameAssignment_1 )
            // InternalXMachine.g:1722:3: rule__XVariable__NameAssignment_1
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
    // InternalXMachine.g:1731:1: rule__XInvariant__Group__0 : rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 ;
    public final void rule__XInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1735:1: ( rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 )
            // InternalXMachine.g:1736:2: rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1
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
    // InternalXMachine.g:1743:1: rule__XInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1747:1: ( ( () ) )
            // InternalXMachine.g:1748:1: ( () )
            {
            // InternalXMachine.g:1748:1: ( () )
            // InternalXMachine.g:1749:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getInvariantAction_0()); 
            }
            // InternalXMachine.g:1750:2: ()
            // InternalXMachine.g:1750:3: 
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
    // InternalXMachine.g:1758:1: rule__XInvariant__Group__1 : rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 ;
    public final void rule__XInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1762:1: ( rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 )
            // InternalXMachine.g:1763:2: rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2
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
    // InternalXMachine.g:1770:1: rule__XInvariant__Group__1__Impl : ( ( rule__XInvariant__NameAssignment_1 ) ) ;
    public final void rule__XInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1774:1: ( ( ( rule__XInvariant__NameAssignment_1 ) ) )
            // InternalXMachine.g:1775:1: ( ( rule__XInvariant__NameAssignment_1 ) )
            {
            // InternalXMachine.g:1775:1: ( ( rule__XInvariant__NameAssignment_1 ) )
            // InternalXMachine.g:1776:2: ( rule__XInvariant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:1777:2: ( rule__XInvariant__NameAssignment_1 )
            // InternalXMachine.g:1777:3: rule__XInvariant__NameAssignment_1
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
    // InternalXMachine.g:1785:1: rule__XInvariant__Group__2 : rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 ;
    public final void rule__XInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1789:1: ( rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 )
            // InternalXMachine.g:1790:2: rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3
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
    // InternalXMachine.g:1797:1: rule__XInvariant__Group__2__Impl : ( ( rule__XInvariant__PredicateAssignment_2 ) ) ;
    public final void rule__XInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1801:1: ( ( ( rule__XInvariant__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:1802:1: ( ( rule__XInvariant__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:1802:1: ( ( rule__XInvariant__PredicateAssignment_2 ) )
            // InternalXMachine.g:1803:2: ( rule__XInvariant__PredicateAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getPredicateAssignment_2()); 
            }
            // InternalXMachine.g:1804:2: ( rule__XInvariant__PredicateAssignment_2 )
            // InternalXMachine.g:1804:3: rule__XInvariant__PredicateAssignment_2
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
    // InternalXMachine.g:1812:1: rule__XInvariant__Group__3 : rule__XInvariant__Group__3__Impl ;
    public final void rule__XInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1816:1: ( rule__XInvariant__Group__3__Impl )
            // InternalXMachine.g:1817:2: rule__XInvariant__Group__3__Impl
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
    // InternalXMachine.g:1823:1: rule__XInvariant__Group__3__Impl : ( ( rule__XInvariant__TheoremAssignment_3 )? ) ;
    public final void rule__XInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1827:1: ( ( ( rule__XInvariant__TheoremAssignment_3 )? ) )
            // InternalXMachine.g:1828:1: ( ( rule__XInvariant__TheoremAssignment_3 )? )
            {
            // InternalXMachine.g:1828:1: ( ( rule__XInvariant__TheoremAssignment_3 )? )
            // InternalXMachine.g:1829:2: ( rule__XInvariant__TheoremAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getTheoremAssignment_3()); 
            }
            // InternalXMachine.g:1830:2: ( rule__XInvariant__TheoremAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXMachine.g:1830:3: rule__XInvariant__TheoremAssignment_3
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
    // InternalXMachine.g:1839:1: rule__XVariant__Group__0 : rule__XVariant__Group__0__Impl rule__XVariant__Group__1 ;
    public final void rule__XVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1843:1: ( rule__XVariant__Group__0__Impl rule__XVariant__Group__1 )
            // InternalXMachine.g:1844:2: rule__XVariant__Group__0__Impl rule__XVariant__Group__1
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
    // InternalXMachine.g:1851:1: rule__XVariant__Group__0__Impl : ( () ) ;
    public final void rule__XVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1855:1: ( ( () ) )
            // InternalXMachine.g:1856:1: ( () )
            {
            // InternalXMachine.g:1856:1: ( () )
            // InternalXMachine.g:1857:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getVariantAction_0()); 
            }
            // InternalXMachine.g:1858:2: ()
            // InternalXMachine.g:1858:3: 
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
    // InternalXMachine.g:1866:1: rule__XVariant__Group__1 : rule__XVariant__Group__1__Impl ;
    public final void rule__XVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1870:1: ( rule__XVariant__Group__1__Impl )
            // InternalXMachine.g:1871:2: rule__XVariant__Group__1__Impl
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
    // InternalXMachine.g:1877:1: rule__XVariant__Group__1__Impl : ( ( rule__XVariant__ExpressionAssignment_1 ) ) ;
    public final void rule__XVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1881:1: ( ( ( rule__XVariant__ExpressionAssignment_1 ) ) )
            // InternalXMachine.g:1882:1: ( ( rule__XVariant__ExpressionAssignment_1 ) )
            {
            // InternalXMachine.g:1882:1: ( ( rule__XVariant__ExpressionAssignment_1 ) )
            // InternalXMachine.g:1883:2: ( rule__XVariant__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getExpressionAssignment_1()); 
            }
            // InternalXMachine.g:1884:2: ( rule__XVariant__ExpressionAssignment_1 )
            // InternalXMachine.g:1884:3: rule__XVariant__ExpressionAssignment_1
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
    // InternalXMachine.g:1893:1: rule__XGroup__Group__0 : rule__XGroup__Group__0__Impl rule__XGroup__Group__1 ;
    public final void rule__XGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1897:1: ( rule__XGroup__Group__0__Impl rule__XGroup__Group__1 )
            // InternalXMachine.g:1898:2: rule__XGroup__Group__0__Impl rule__XGroup__Group__1
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
    // InternalXMachine.g:1905:1: rule__XGroup__Group__0__Impl : ( () ) ;
    public final void rule__XGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1909:1: ( ( () ) )
            // InternalXMachine.g:1910:1: ( () )
            {
            // InternalXMachine.g:1910:1: ( () )
            // InternalXMachine.g:1911:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventCasesAction_0()); 
            }
            // InternalXMachine.g:1912:2: ()
            // InternalXMachine.g:1912:3: 
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
    // InternalXMachine.g:1920:1: rule__XGroup__Group__1 : rule__XGroup__Group__1__Impl rule__XGroup__Group__2 ;
    public final void rule__XGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1924:1: ( rule__XGroup__Group__1__Impl rule__XGroup__Group__2 )
            // InternalXMachine.g:1925:2: rule__XGroup__Group__1__Impl rule__XGroup__Group__2
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
    // InternalXMachine.g:1932:1: rule__XGroup__Group__1__Impl : ( 'group' ) ;
    public final void rule__XGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1936:1: ( ( 'group' ) )
            // InternalXMachine.g:1937:1: ( 'group' )
            {
            // InternalXMachine.g:1937:1: ( 'group' )
            // InternalXMachine.g:1938:2: 'group'
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
    // InternalXMachine.g:1947:1: rule__XGroup__Group__2 : rule__XGroup__Group__2__Impl rule__XGroup__Group__3 ;
    public final void rule__XGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1951:1: ( rule__XGroup__Group__2__Impl rule__XGroup__Group__3 )
            // InternalXMachine.g:1952:2: rule__XGroup__Group__2__Impl rule__XGroup__Group__3
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
    // InternalXMachine.g:1959:1: rule__XGroup__Group__2__Impl : ( ( rule__XGroup__NameAssignment_2 ) ) ;
    public final void rule__XGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1963:1: ( ( ( rule__XGroup__NameAssignment_2 ) ) )
            // InternalXMachine.g:1964:1: ( ( rule__XGroup__NameAssignment_2 ) )
            {
            // InternalXMachine.g:1964:1: ( ( rule__XGroup__NameAssignment_2 ) )
            // InternalXMachine.g:1965:2: ( rule__XGroup__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:1966:2: ( rule__XGroup__NameAssignment_2 )
            // InternalXMachine.g:1966:3: rule__XGroup__NameAssignment_2
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
    // InternalXMachine.g:1974:1: rule__XGroup__Group__3 : rule__XGroup__Group__3__Impl rule__XGroup__Group__4 ;
    public final void rule__XGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1978:1: ( rule__XGroup__Group__3__Impl rule__XGroup__Group__4 )
            // InternalXMachine.g:1979:2: rule__XGroup__Group__3__Impl rule__XGroup__Group__4
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
    // InternalXMachine.g:1986:1: rule__XGroup__Group__3__Impl : ( ( rule__XGroup__Group_3__0 )? ) ;
    public final void rule__XGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1990:1: ( ( ( rule__XGroup__Group_3__0 )? ) )
            // InternalXMachine.g:1991:1: ( ( rule__XGroup__Group_3__0 )? )
            {
            // InternalXMachine.g:1991:1: ( ( rule__XGroup__Group_3__0 )? )
            // InternalXMachine.g:1992:2: ( rule__XGroup__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getGroup_3()); 
            }
            // InternalXMachine.g:1993:2: ( rule__XGroup__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXMachine.g:1993:3: rule__XGroup__Group_3__0
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
    // InternalXMachine.g:2001:1: rule__XGroup__Group__4 : rule__XGroup__Group__4__Impl rule__XGroup__Group__5 ;
    public final void rule__XGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2005:1: ( rule__XGroup__Group__4__Impl rule__XGroup__Group__5 )
            // InternalXMachine.g:2006:2: rule__XGroup__Group__4__Impl rule__XGroup__Group__5
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
    // InternalXMachine.g:2013:1: rule__XGroup__Group__4__Impl : ( ( rule__XGroup__Group_4__0 )? ) ;
    public final void rule__XGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2017:1: ( ( ( rule__XGroup__Group_4__0 )? ) )
            // InternalXMachine.g:2018:1: ( ( rule__XGroup__Group_4__0 )? )
            {
            // InternalXMachine.g:2018:1: ( ( rule__XGroup__Group_4__0 )? )
            // InternalXMachine.g:2019:2: ( rule__XGroup__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getGroup_4()); 
            }
            // InternalXMachine.g:2020:2: ( rule__XGroup__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXMachine.g:2020:3: rule__XGroup__Group_4__0
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
    // InternalXMachine.g:2028:1: rule__XGroup__Group__5 : rule__XGroup__Group__5__Impl ;
    public final void rule__XGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2032:1: ( rule__XGroup__Group__5__Impl )
            // InternalXMachine.g:2033:2: rule__XGroup__Group__5__Impl
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
    // InternalXMachine.g:2039:1: rule__XGroup__Group__5__Impl : ( 'end' ) ;
    public final void rule__XGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2043:1: ( ( 'end' ) )
            // InternalXMachine.g:2044:1: ( 'end' )
            {
            // InternalXMachine.g:2044:1: ( 'end' )
            // InternalXMachine.g:2045:2: 'end'
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
    // InternalXMachine.g:2055:1: rule__XGroup__Group_3__0 : rule__XGroup__Group_3__0__Impl rule__XGroup__Group_3__1 ;
    public final void rule__XGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2059:1: ( rule__XGroup__Group_3__0__Impl rule__XGroup__Group_3__1 )
            // InternalXMachine.g:2060:2: rule__XGroup__Group_3__0__Impl rule__XGroup__Group_3__1
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
    // InternalXMachine.g:2067:1: rule__XGroup__Group_3__0__Impl : ( '(' ) ;
    public final void rule__XGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2071:1: ( ( '(' ) )
            // InternalXMachine.g:2072:1: ( '(' )
            {
            // InternalXMachine.g:2072:1: ( '(' )
            // InternalXMachine.g:2073:2: '('
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
    // InternalXMachine.g:2082:1: rule__XGroup__Group_3__1 : rule__XGroup__Group_3__1__Impl rule__XGroup__Group_3__2 ;
    public final void rule__XGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2086:1: ( rule__XGroup__Group_3__1__Impl rule__XGroup__Group_3__2 )
            // InternalXMachine.g:2087:2: rule__XGroup__Group_3__1__Impl rule__XGroup__Group_3__2
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
    // InternalXMachine.g:2094:1: rule__XGroup__Group_3__1__Impl : ( ( rule__XGroup__FormalParametersAssignment_3_1 ) ) ;
    public final void rule__XGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2098:1: ( ( ( rule__XGroup__FormalParametersAssignment_3_1 ) ) )
            // InternalXMachine.g:2099:1: ( ( rule__XGroup__FormalParametersAssignment_3_1 ) )
            {
            // InternalXMachine.g:2099:1: ( ( rule__XGroup__FormalParametersAssignment_3_1 ) )
            // InternalXMachine.g:2100:2: ( rule__XGroup__FormalParametersAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getFormalParametersAssignment_3_1()); 
            }
            // InternalXMachine.g:2101:2: ( rule__XGroup__FormalParametersAssignment_3_1 )
            // InternalXMachine.g:2101:3: rule__XGroup__FormalParametersAssignment_3_1
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
    // InternalXMachine.g:2109:1: rule__XGroup__Group_3__2 : rule__XGroup__Group_3__2__Impl rule__XGroup__Group_3__3 ;
    public final void rule__XGroup__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2113:1: ( rule__XGroup__Group_3__2__Impl rule__XGroup__Group_3__3 )
            // InternalXMachine.g:2114:2: rule__XGroup__Group_3__2__Impl rule__XGroup__Group_3__3
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
    // InternalXMachine.g:2121:1: rule__XGroup__Group_3__2__Impl : ( ( rule__XGroup__Group_3_2__0 )* ) ;
    public final void rule__XGroup__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2125:1: ( ( ( rule__XGroup__Group_3_2__0 )* ) )
            // InternalXMachine.g:2126:1: ( ( rule__XGroup__Group_3_2__0 )* )
            {
            // InternalXMachine.g:2126:1: ( ( rule__XGroup__Group_3_2__0 )* )
            // InternalXMachine.g:2127:2: ( rule__XGroup__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getGroup_3_2()); 
            }
            // InternalXMachine.g:2128:2: ( rule__XGroup__Group_3_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXMachine.g:2128:3: rule__XGroup__Group_3_2__0
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
    // InternalXMachine.g:2136:1: rule__XGroup__Group_3__3 : rule__XGroup__Group_3__3__Impl ;
    public final void rule__XGroup__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2140:1: ( rule__XGroup__Group_3__3__Impl )
            // InternalXMachine.g:2141:2: rule__XGroup__Group_3__3__Impl
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
    // InternalXMachine.g:2147:1: rule__XGroup__Group_3__3__Impl : ( ')' ) ;
    public final void rule__XGroup__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2151:1: ( ( ')' ) )
            // InternalXMachine.g:2152:1: ( ')' )
            {
            // InternalXMachine.g:2152:1: ( ')' )
            // InternalXMachine.g:2153:2: ')'
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
    // InternalXMachine.g:2163:1: rule__XGroup__Group_3_2__0 : rule__XGroup__Group_3_2__0__Impl rule__XGroup__Group_3_2__1 ;
    public final void rule__XGroup__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2167:1: ( rule__XGroup__Group_3_2__0__Impl rule__XGroup__Group_3_2__1 )
            // InternalXMachine.g:2168:2: rule__XGroup__Group_3_2__0__Impl rule__XGroup__Group_3_2__1
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
    // InternalXMachine.g:2175:1: rule__XGroup__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__XGroup__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2179:1: ( ( ',' ) )
            // InternalXMachine.g:2180:1: ( ',' )
            {
            // InternalXMachine.g:2180:1: ( ',' )
            // InternalXMachine.g:2181:2: ','
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
    // InternalXMachine.g:2190:1: rule__XGroup__Group_3_2__1 : rule__XGroup__Group_3_2__1__Impl ;
    public final void rule__XGroup__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2194:1: ( rule__XGroup__Group_3_2__1__Impl )
            // InternalXMachine.g:2195:2: rule__XGroup__Group_3_2__1__Impl
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
    // InternalXMachine.g:2201:1: rule__XGroup__Group_3_2__1__Impl : ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) ) ;
    public final void rule__XGroup__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2205:1: ( ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) ) )
            // InternalXMachine.g:2206:1: ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) )
            {
            // InternalXMachine.g:2206:1: ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) )
            // InternalXMachine.g:2207:2: ( rule__XGroup__FormalParametersAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getFormalParametersAssignment_3_2_1()); 
            }
            // InternalXMachine.g:2208:2: ( rule__XGroup__FormalParametersAssignment_3_2_1 )
            // InternalXMachine.g:2208:3: rule__XGroup__FormalParametersAssignment_3_2_1
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
    // InternalXMachine.g:2217:1: rule__XGroup__Group_4__0 : rule__XGroup__Group_4__0__Impl rule__XGroup__Group_4__1 ;
    public final void rule__XGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2221:1: ( rule__XGroup__Group_4__0__Impl rule__XGroup__Group_4__1 )
            // InternalXMachine.g:2222:2: rule__XGroup__Group_4__0__Impl rule__XGroup__Group_4__1
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
    // InternalXMachine.g:2229:1: rule__XGroup__Group_4__0__Impl : ( 'begin' ) ;
    public final void rule__XGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2233:1: ( ( 'begin' ) )
            // InternalXMachine.g:2234:1: ( 'begin' )
            {
            // InternalXMachine.g:2234:1: ( 'begin' )
            // InternalXMachine.g:2235:2: 'begin'
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
    // InternalXMachine.g:2244:1: rule__XGroup__Group_4__1 : rule__XGroup__Group_4__1__Impl rule__XGroup__Group_4__2 ;
    public final void rule__XGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2248:1: ( rule__XGroup__Group_4__1__Impl rule__XGroup__Group_4__2 )
            // InternalXMachine.g:2249:2: rule__XGroup__Group_4__1__Impl rule__XGroup__Group_4__2
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
    // InternalXMachine.g:2256:1: rule__XGroup__Group_4__1__Impl : ( ( rule__XGroup__EventsAssignment_4_1 ) ) ;
    public final void rule__XGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2260:1: ( ( ( rule__XGroup__EventsAssignment_4_1 ) ) )
            // InternalXMachine.g:2261:1: ( ( rule__XGroup__EventsAssignment_4_1 ) )
            {
            // InternalXMachine.g:2261:1: ( ( rule__XGroup__EventsAssignment_4_1 ) )
            // InternalXMachine.g:2262:2: ( rule__XGroup__EventsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventsAssignment_4_1()); 
            }
            // InternalXMachine.g:2263:2: ( rule__XGroup__EventsAssignment_4_1 )
            // InternalXMachine.g:2263:3: rule__XGroup__EventsAssignment_4_1
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
    // InternalXMachine.g:2271:1: rule__XGroup__Group_4__2 : rule__XGroup__Group_4__2__Impl ;
    public final void rule__XGroup__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2275:1: ( rule__XGroup__Group_4__2__Impl )
            // InternalXMachine.g:2276:2: rule__XGroup__Group_4__2__Impl
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
    // InternalXMachine.g:2282:1: rule__XGroup__Group_4__2__Impl : ( ( rule__XGroup__EventsAssignment_4_2 )* ) ;
    public final void rule__XGroup__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2286:1: ( ( ( rule__XGroup__EventsAssignment_4_2 )* ) )
            // InternalXMachine.g:2287:1: ( ( rule__XGroup__EventsAssignment_4_2 )* )
            {
            // InternalXMachine.g:2287:1: ( ( rule__XGroup__EventsAssignment_4_2 )* )
            // InternalXMachine.g:2288:2: ( rule__XGroup__EventsAssignment_4_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventsAssignment_4_2()); 
            }
            // InternalXMachine.g:2289:2: ( rule__XGroup__EventsAssignment_4_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXMachine.g:2289:3: rule__XGroup__EventsAssignment_4_2
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
    // InternalXMachine.g:2298:1: rule__XFormalParameter__Group__0 : rule__XFormalParameter__Group__0__Impl rule__XFormalParameter__Group__1 ;
    public final void rule__XFormalParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2302:1: ( rule__XFormalParameter__Group__0__Impl rule__XFormalParameter__Group__1 )
            // InternalXMachine.g:2303:2: rule__XFormalParameter__Group__0__Impl rule__XFormalParameter__Group__1
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
    // InternalXMachine.g:2310:1: rule__XFormalParameter__Group__0__Impl : ( () ) ;
    public final void rule__XFormalParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2314:1: ( ( () ) )
            // InternalXMachine.g:2315:1: ( () )
            {
            // InternalXMachine.g:2315:1: ( () )
            // InternalXMachine.g:2316:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormalParameterAccess().getFormalParameterAction_0()); 
            }
            // InternalXMachine.g:2317:2: ()
            // InternalXMachine.g:2317:3: 
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
    // InternalXMachine.g:2325:1: rule__XFormalParameter__Group__1 : rule__XFormalParameter__Group__1__Impl rule__XFormalParameter__Group__2 ;
    public final void rule__XFormalParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2329:1: ( rule__XFormalParameter__Group__1__Impl rule__XFormalParameter__Group__2 )
            // InternalXMachine.g:2330:2: rule__XFormalParameter__Group__1__Impl rule__XFormalParameter__Group__2
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
    // InternalXMachine.g:2337:1: rule__XFormalParameter__Group__1__Impl : ( ( rule__XFormalParameter__DirectionAssignment_1 ) ) ;
    public final void rule__XFormalParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2341:1: ( ( ( rule__XFormalParameter__DirectionAssignment_1 ) ) )
            // InternalXMachine.g:2342:1: ( ( rule__XFormalParameter__DirectionAssignment_1 ) )
            {
            // InternalXMachine.g:2342:1: ( ( rule__XFormalParameter__DirectionAssignment_1 ) )
            // InternalXMachine.g:2343:2: ( rule__XFormalParameter__DirectionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormalParameterAccess().getDirectionAssignment_1()); 
            }
            // InternalXMachine.g:2344:2: ( rule__XFormalParameter__DirectionAssignment_1 )
            // InternalXMachine.g:2344:3: rule__XFormalParameter__DirectionAssignment_1
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
    // InternalXMachine.g:2352:1: rule__XFormalParameter__Group__2 : rule__XFormalParameter__Group__2__Impl ;
    public final void rule__XFormalParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2356:1: ( rule__XFormalParameter__Group__2__Impl )
            // InternalXMachine.g:2357:2: rule__XFormalParameter__Group__2__Impl
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
    // InternalXMachine.g:2363:1: rule__XFormalParameter__Group__2__Impl : ( ( rule__XFormalParameter__NameAssignment_2 ) ) ;
    public final void rule__XFormalParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2367:1: ( ( ( rule__XFormalParameter__NameAssignment_2 ) ) )
            // InternalXMachine.g:2368:1: ( ( rule__XFormalParameter__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2368:1: ( ( rule__XFormalParameter__NameAssignment_2 ) )
            // InternalXMachine.g:2369:2: ( rule__XFormalParameter__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormalParameterAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:2370:2: ( rule__XFormalParameter__NameAssignment_2 )
            // InternalXMachine.g:2370:3: rule__XFormalParameter__NameAssignment_2
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
    // InternalXMachine.g:2379:1: rule__XEvent__Group__0 : rule__XEvent__Group__0__Impl rule__XEvent__Group__1 ;
    public final void rule__XEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2383:1: ( rule__XEvent__Group__0__Impl rule__XEvent__Group__1 )
            // InternalXMachine.g:2384:2: rule__XEvent__Group__0__Impl rule__XEvent__Group__1
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
    // InternalXMachine.g:2391:1: rule__XEvent__Group__0__Impl : ( () ) ;
    public final void rule__XEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2395:1: ( ( () ) )
            // InternalXMachine.g:2396:1: ( () )
            {
            // InternalXMachine.g:2396:1: ( () )
            // InternalXMachine.g:2397:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEventAction_0()); 
            }
            // InternalXMachine.g:2398:2: ()
            // InternalXMachine.g:2398:3: 
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
    // InternalXMachine.g:2406:1: rule__XEvent__Group__1 : rule__XEvent__Group__1__Impl rule__XEvent__Group__2 ;
    public final void rule__XEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2410:1: ( rule__XEvent__Group__1__Impl rule__XEvent__Group__2 )
            // InternalXMachine.g:2411:2: rule__XEvent__Group__1__Impl rule__XEvent__Group__2
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
    // InternalXMachine.g:2418:1: rule__XEvent__Group__1__Impl : ( 'event' ) ;
    public final void rule__XEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2422:1: ( ( 'event' ) )
            // InternalXMachine.g:2423:1: ( 'event' )
            {
            // InternalXMachine.g:2423:1: ( 'event' )
            // InternalXMachine.g:2424:2: 'event'
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
    // InternalXMachine.g:2433:1: rule__XEvent__Group__2 : rule__XEvent__Group__2__Impl rule__XEvent__Group__3 ;
    public final void rule__XEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2437:1: ( rule__XEvent__Group__2__Impl rule__XEvent__Group__3 )
            // InternalXMachine.g:2438:2: rule__XEvent__Group__2__Impl rule__XEvent__Group__3
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
    // InternalXMachine.g:2445:1: rule__XEvent__Group__2__Impl : ( ( rule__XEvent__NameAssignment_2 ) ) ;
    public final void rule__XEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2449:1: ( ( ( rule__XEvent__NameAssignment_2 ) ) )
            // InternalXMachine.g:2450:1: ( ( rule__XEvent__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2450:1: ( ( rule__XEvent__NameAssignment_2 ) )
            // InternalXMachine.g:2451:2: ( rule__XEvent__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:2452:2: ( rule__XEvent__NameAssignment_2 )
            // InternalXMachine.g:2452:3: rule__XEvent__NameAssignment_2
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
    // InternalXMachine.g:2460:1: rule__XEvent__Group__3 : rule__XEvent__Group__3__Impl rule__XEvent__Group__4 ;
    public final void rule__XEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2464:1: ( rule__XEvent__Group__3__Impl rule__XEvent__Group__4 )
            // InternalXMachine.g:2465:2: rule__XEvent__Group__3__Impl rule__XEvent__Group__4
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
    // InternalXMachine.g:2472:1: rule__XEvent__Group__3__Impl : ( ( rule__XEvent__UnorderedGroup_3 ) ) ;
    public final void rule__XEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2476:1: ( ( ( rule__XEvent__UnorderedGroup_3 ) ) )
            // InternalXMachine.g:2477:1: ( ( rule__XEvent__UnorderedGroup_3 ) )
            {
            // InternalXMachine.g:2477:1: ( ( rule__XEvent__UnorderedGroup_3 ) )
            // InternalXMachine.g:2478:2: ( rule__XEvent__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getUnorderedGroup_3()); 
            }
            // InternalXMachine.g:2479:2: ( rule__XEvent__UnorderedGroup_3 )
            // InternalXMachine.g:2479:3: rule__XEvent__UnorderedGroup_3
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
    // InternalXMachine.g:2487:1: rule__XEvent__Group__4 : rule__XEvent__Group__4__Impl rule__XEvent__Group__5 ;
    public final void rule__XEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2491:1: ( rule__XEvent__Group__4__Impl rule__XEvent__Group__5 )
            // InternalXMachine.g:2492:2: rule__XEvent__Group__4__Impl rule__XEvent__Group__5
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
    // InternalXMachine.g:2499:1: rule__XEvent__Group__4__Impl : ( ( rule__XEvent__ExtensionsAssignment_4 )* ) ;
    public final void rule__XEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2503:1: ( ( ( rule__XEvent__ExtensionsAssignment_4 )* ) )
            // InternalXMachine.g:2504:1: ( ( rule__XEvent__ExtensionsAssignment_4 )* )
            {
            // InternalXMachine.g:2504:1: ( ( rule__XEvent__ExtensionsAssignment_4 )* )
            // InternalXMachine.g:2505:2: ( rule__XEvent__ExtensionsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtensionsAssignment_4()); 
            }
            // InternalXMachine.g:2506:2: ( rule__XEvent__ExtensionsAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalXMachine.g:2506:3: rule__XEvent__ExtensionsAssignment_4
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
    // InternalXMachine.g:2514:1: rule__XEvent__Group__5 : rule__XEvent__Group__5__Impl rule__XEvent__Group__6 ;
    public final void rule__XEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2518:1: ( rule__XEvent__Group__5__Impl rule__XEvent__Group__6 )
            // InternalXMachine.g:2519:2: rule__XEvent__Group__5__Impl rule__XEvent__Group__6
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
    // InternalXMachine.g:2526:1: rule__XEvent__Group__5__Impl : ( ( rule__XEvent__Group_5__0 )? ) ;
    public final void rule__XEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2530:1: ( ( ( rule__XEvent__Group_5__0 )? ) )
            // InternalXMachine.g:2531:1: ( ( rule__XEvent__Group_5__0 )? )
            {
            // InternalXMachine.g:2531:1: ( ( rule__XEvent__Group_5__0 )? )
            // InternalXMachine.g:2532:2: ( rule__XEvent__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_5()); 
            }
            // InternalXMachine.g:2533:2: ( rule__XEvent__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXMachine.g:2533:3: rule__XEvent__Group_5__0
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
    // InternalXMachine.g:2541:1: rule__XEvent__Group__6 : rule__XEvent__Group__6__Impl rule__XEvent__Group__7 ;
    public final void rule__XEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2545:1: ( rule__XEvent__Group__6__Impl rule__XEvent__Group__7 )
            // InternalXMachine.g:2546:2: rule__XEvent__Group__6__Impl rule__XEvent__Group__7
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
    // InternalXMachine.g:2553:1: rule__XEvent__Group__6__Impl : ( ( rule__XEvent__Alternatives_6 )? ) ;
    public final void rule__XEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2557:1: ( ( ( rule__XEvent__Alternatives_6 )? ) )
            // InternalXMachine.g:2558:1: ( ( rule__XEvent__Alternatives_6 )? )
            {
            // InternalXMachine.g:2558:1: ( ( rule__XEvent__Alternatives_6 )? )
            // InternalXMachine.g:2559:2: ( rule__XEvent__Alternatives_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_6()); 
            }
            // InternalXMachine.g:2560:2: ( rule__XEvent__Alternatives_6 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33||(LA25_0>=35 && LA25_0<=36)||LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXMachine.g:2560:3: rule__XEvent__Alternatives_6
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
    // InternalXMachine.g:2568:1: rule__XEvent__Group__7 : rule__XEvent__Group__7__Impl ;
    public final void rule__XEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2572:1: ( rule__XEvent__Group__7__Impl )
            // InternalXMachine.g:2573:2: rule__XEvent__Group__7__Impl
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
    // InternalXMachine.g:2579:1: rule__XEvent__Group__7__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2583:1: ( ( 'end' ) )
            // InternalXMachine.g:2584:1: ( 'end' )
            {
            // InternalXMachine.g:2584:1: ( 'end' )
            // InternalXMachine.g:2585:2: 'end'
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
    // InternalXMachine.g:2595:1: rule__XEvent__Group_5__0 : rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1 ;
    public final void rule__XEvent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2599:1: ( rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1 )
            // InternalXMachine.g:2600:2: rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1
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
    // InternalXMachine.g:2607:1: rule__XEvent__Group_5__0__Impl : ( 'refines' ) ;
    public final void rule__XEvent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2611:1: ( ( 'refines' ) )
            // InternalXMachine.g:2612:1: ( 'refines' )
            {
            // InternalXMachine.g:2612:1: ( 'refines' )
            // InternalXMachine.g:2613:2: 'refines'
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
    // InternalXMachine.g:2622:1: rule__XEvent__Group_5__1 : rule__XEvent__Group_5__1__Impl ;
    public final void rule__XEvent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2626:1: ( rule__XEvent__Group_5__1__Impl )
            // InternalXMachine.g:2627:2: rule__XEvent__Group_5__1__Impl
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
    // InternalXMachine.g:2633:1: rule__XEvent__Group_5__1__Impl : ( ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* ) ) ;
    public final void rule__XEvent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2637:1: ( ( ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* ) ) )
            // InternalXMachine.g:2638:1: ( ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* ) )
            {
            // InternalXMachine.g:2638:1: ( ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* ) )
            // InternalXMachine.g:2639:2: ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* )
            {
            // InternalXMachine.g:2639:2: ( ( rule__XEvent__RefinesAssignment_5_1 ) )
            // InternalXMachine.g:2640:3: ( rule__XEvent__RefinesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_5_1()); 
            }
            // InternalXMachine.g:2641:3: ( rule__XEvent__RefinesAssignment_5_1 )
            // InternalXMachine.g:2641:4: rule__XEvent__RefinesAssignment_5_1
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

            // InternalXMachine.g:2644:2: ( ( rule__XEvent__RefinesAssignment_5_1 )* )
            // InternalXMachine.g:2645:3: ( rule__XEvent__RefinesAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_5_1()); 
            }
            // InternalXMachine.g:2646:3: ( rule__XEvent__RefinesAssignment_5_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalXMachine.g:2646:4: rule__XEvent__RefinesAssignment_5_1
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
    // InternalXMachine.g:2656:1: rule__XEvent__Group_6_0__0 : rule__XEvent__Group_6_0__0__Impl rule__XEvent__Group_6_0__1 ;
    public final void rule__XEvent__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2660:1: ( rule__XEvent__Group_6_0__0__Impl rule__XEvent__Group_6_0__1 )
            // InternalXMachine.g:2661:2: rule__XEvent__Group_6_0__0__Impl rule__XEvent__Group_6_0__1
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
    // InternalXMachine.g:2668:1: rule__XEvent__Group_6_0__0__Impl : ( ( rule__XEvent__Group_6_0_0__0 )? ) ;
    public final void rule__XEvent__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2672:1: ( ( ( rule__XEvent__Group_6_0_0__0 )? ) )
            // InternalXMachine.g:2673:1: ( ( rule__XEvent__Group_6_0_0__0 )? )
            {
            // InternalXMachine.g:2673:1: ( ( rule__XEvent__Group_6_0_0__0 )? )
            // InternalXMachine.g:2674:2: ( rule__XEvent__Group_6_0_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_6_0_0()); 
            }
            // InternalXMachine.g:2675:2: ( rule__XEvent__Group_6_0_0__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXMachine.g:2675:3: rule__XEvent__Group_6_0_0__0
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
    // InternalXMachine.g:2683:1: rule__XEvent__Group_6_0__1 : rule__XEvent__Group_6_0__1__Impl rule__XEvent__Group_6_0__2 ;
    public final void rule__XEvent__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2687:1: ( rule__XEvent__Group_6_0__1__Impl rule__XEvent__Group_6_0__2 )
            // InternalXMachine.g:2688:2: rule__XEvent__Group_6_0__1__Impl rule__XEvent__Group_6_0__2
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
    // InternalXMachine.g:2695:1: rule__XEvent__Group_6_0__1__Impl : ( 'begin' ) ;
    public final void rule__XEvent__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2699:1: ( ( 'begin' ) )
            // InternalXMachine.g:2700:1: ( 'begin' )
            {
            // InternalXMachine.g:2700:1: ( 'begin' )
            // InternalXMachine.g:2701:2: 'begin'
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
    // InternalXMachine.g:2710:1: rule__XEvent__Group_6_0__2 : rule__XEvent__Group_6_0__2__Impl ;
    public final void rule__XEvent__Group_6_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2714:1: ( rule__XEvent__Group_6_0__2__Impl )
            // InternalXMachine.g:2715:2: rule__XEvent__Group_6_0__2__Impl
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
    // InternalXMachine.g:2721:1: rule__XEvent__Group_6_0__2__Impl : ( ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* ) ) ;
    public final void rule__XEvent__Group_6_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2725:1: ( ( ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* ) ) )
            // InternalXMachine.g:2726:1: ( ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* ) )
            {
            // InternalXMachine.g:2726:1: ( ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* ) )
            // InternalXMachine.g:2727:2: ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* )
            {
            // InternalXMachine.g:2727:2: ( ( rule__XEvent__ActionsAssignment_6_0_2 ) )
            // InternalXMachine.g:2728:3: ( rule__XEvent__ActionsAssignment_6_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_6_0_2()); 
            }
            // InternalXMachine.g:2729:3: ( rule__XEvent__ActionsAssignment_6_0_2 )
            // InternalXMachine.g:2729:4: rule__XEvent__ActionsAssignment_6_0_2
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

            // InternalXMachine.g:2732:2: ( ( rule__XEvent__ActionsAssignment_6_0_2 )* )
            // InternalXMachine.g:2733:3: ( rule__XEvent__ActionsAssignment_6_0_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_6_0_2()); 
            }
            // InternalXMachine.g:2734:3: ( rule__XEvent__ActionsAssignment_6_0_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_XLABEL) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalXMachine.g:2734:4: rule__XEvent__ActionsAssignment_6_0_2
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
    // InternalXMachine.g:2744:1: rule__XEvent__Group_6_0_0__0 : rule__XEvent__Group_6_0_0__0__Impl rule__XEvent__Group_6_0_0__1 ;
    public final void rule__XEvent__Group_6_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2748:1: ( rule__XEvent__Group_6_0_0__0__Impl rule__XEvent__Group_6_0_0__1 )
            // InternalXMachine.g:2749:2: rule__XEvent__Group_6_0_0__0__Impl rule__XEvent__Group_6_0_0__1
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
    // InternalXMachine.g:2756:1: rule__XEvent__Group_6_0_0__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_6_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2760:1: ( ( 'with' ) )
            // InternalXMachine.g:2761:1: ( 'with' )
            {
            // InternalXMachine.g:2761:1: ( 'with' )
            // InternalXMachine.g:2762:2: 'with'
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
    // InternalXMachine.g:2771:1: rule__XEvent__Group_6_0_0__1 : rule__XEvent__Group_6_0_0__1__Impl ;
    public final void rule__XEvent__Group_6_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2775:1: ( rule__XEvent__Group_6_0_0__1__Impl )
            // InternalXMachine.g:2776:2: rule__XEvent__Group_6_0_0__1__Impl
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
    // InternalXMachine.g:2782:1: rule__XEvent__Group_6_0_0__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* ) ) ;
    public final void rule__XEvent__Group_6_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2786:1: ( ( ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* ) ) )
            // InternalXMachine.g:2787:1: ( ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* ) )
            {
            // InternalXMachine.g:2787:1: ( ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* ) )
            // InternalXMachine.g:2788:2: ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* )
            {
            // InternalXMachine.g:2788:2: ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) )
            // InternalXMachine.g:2789:3: ( rule__XEvent__WitnessesAssignment_6_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_0_0_1()); 
            }
            // InternalXMachine.g:2790:3: ( rule__XEvent__WitnessesAssignment_6_0_0_1 )
            // InternalXMachine.g:2790:4: rule__XEvent__WitnessesAssignment_6_0_0_1
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

            // InternalXMachine.g:2793:2: ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* )
            // InternalXMachine.g:2794:3: ( rule__XEvent__WitnessesAssignment_6_0_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_0_0_1()); 
            }
            // InternalXMachine.g:2795:3: ( rule__XEvent__WitnessesAssignment_6_0_0_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_XLABEL) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalXMachine.g:2795:4: rule__XEvent__WitnessesAssignment_6_0_0_1
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
    // InternalXMachine.g:2805:1: rule__XEvent__Group_6_1__0 : rule__XEvent__Group_6_1__0__Impl rule__XEvent__Group_6_1__1 ;
    public final void rule__XEvent__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2809:1: ( rule__XEvent__Group_6_1__0__Impl rule__XEvent__Group_6_1__1 )
            // InternalXMachine.g:2810:2: rule__XEvent__Group_6_1__0__Impl rule__XEvent__Group_6_1__1
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
    // InternalXMachine.g:2817:1: rule__XEvent__Group_6_1__0__Impl : ( 'when' ) ;
    public final void rule__XEvent__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2821:1: ( ( 'when' ) )
            // InternalXMachine.g:2822:1: ( 'when' )
            {
            // InternalXMachine.g:2822:1: ( 'when' )
            // InternalXMachine.g:2823:2: 'when'
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
    // InternalXMachine.g:2832:1: rule__XEvent__Group_6_1__1 : rule__XEvent__Group_6_1__1__Impl rule__XEvent__Group_6_1__2 ;
    public final void rule__XEvent__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2836:1: ( rule__XEvent__Group_6_1__1__Impl rule__XEvent__Group_6_1__2 )
            // InternalXMachine.g:2837:2: rule__XEvent__Group_6_1__1__Impl rule__XEvent__Group_6_1__2
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
    // InternalXMachine.g:2844:1: rule__XEvent__Group_6_1__1__Impl : ( ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* ) ) ;
    public final void rule__XEvent__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2848:1: ( ( ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* ) ) )
            // InternalXMachine.g:2849:1: ( ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* ) )
            {
            // InternalXMachine.g:2849:1: ( ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* ) )
            // InternalXMachine.g:2850:2: ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* )
            {
            // InternalXMachine.g:2850:2: ( ( rule__XEvent__GuardsAssignment_6_1_1 ) )
            // InternalXMachine.g:2851:3: ( rule__XEvent__GuardsAssignment_6_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsAssignment_6_1_1()); 
            }
            // InternalXMachine.g:2852:3: ( rule__XEvent__GuardsAssignment_6_1_1 )
            // InternalXMachine.g:2852:4: rule__XEvent__GuardsAssignment_6_1_1
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

            // InternalXMachine.g:2855:2: ( ( rule__XEvent__GuardsAssignment_6_1_1 )* )
            // InternalXMachine.g:2856:3: ( rule__XEvent__GuardsAssignment_6_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsAssignment_6_1_1()); 
            }
            // InternalXMachine.g:2857:3: ( rule__XEvent__GuardsAssignment_6_1_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_XLABEL) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalXMachine.g:2857:4: rule__XEvent__GuardsAssignment_6_1_1
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
    // InternalXMachine.g:2866:1: rule__XEvent__Group_6_1__2 : rule__XEvent__Group_6_1__2__Impl rule__XEvent__Group_6_1__3 ;
    public final void rule__XEvent__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2870:1: ( rule__XEvent__Group_6_1__2__Impl rule__XEvent__Group_6_1__3 )
            // InternalXMachine.g:2871:2: rule__XEvent__Group_6_1__2__Impl rule__XEvent__Group_6_1__3
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
    // InternalXMachine.g:2878:1: rule__XEvent__Group_6_1__2__Impl : ( ( rule__XEvent__Group_6_1_2__0 )? ) ;
    public final void rule__XEvent__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2882:1: ( ( ( rule__XEvent__Group_6_1_2__0 )? ) )
            // InternalXMachine.g:2883:1: ( ( rule__XEvent__Group_6_1_2__0 )? )
            {
            // InternalXMachine.g:2883:1: ( ( rule__XEvent__Group_6_1_2__0 )? )
            // InternalXMachine.g:2884:2: ( rule__XEvent__Group_6_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_6_1_2()); 
            }
            // InternalXMachine.g:2885:2: ( rule__XEvent__Group_6_1_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXMachine.g:2885:3: rule__XEvent__Group_6_1_2__0
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
    // InternalXMachine.g:2893:1: rule__XEvent__Group_6_1__3 : rule__XEvent__Group_6_1__3__Impl ;
    public final void rule__XEvent__Group_6_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2897:1: ( rule__XEvent__Group_6_1__3__Impl )
            // InternalXMachine.g:2898:2: rule__XEvent__Group_6_1__3__Impl
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
    // InternalXMachine.g:2904:1: rule__XEvent__Group_6_1__3__Impl : ( ( rule__XEvent__Group_6_1_3__0 )? ) ;
    public final void rule__XEvent__Group_6_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2908:1: ( ( ( rule__XEvent__Group_6_1_3__0 )? ) )
            // InternalXMachine.g:2909:1: ( ( rule__XEvent__Group_6_1_3__0 )? )
            {
            // InternalXMachine.g:2909:1: ( ( rule__XEvent__Group_6_1_3__0 )? )
            // InternalXMachine.g:2910:2: ( rule__XEvent__Group_6_1_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_6_1_3()); 
            }
            // InternalXMachine.g:2911:2: ( rule__XEvent__Group_6_1_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXMachine.g:2911:3: rule__XEvent__Group_6_1_3__0
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
    // InternalXMachine.g:2920:1: rule__XEvent__Group_6_1_2__0 : rule__XEvent__Group_6_1_2__0__Impl rule__XEvent__Group_6_1_2__1 ;
    public final void rule__XEvent__Group_6_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2924:1: ( rule__XEvent__Group_6_1_2__0__Impl rule__XEvent__Group_6_1_2__1 )
            // InternalXMachine.g:2925:2: rule__XEvent__Group_6_1_2__0__Impl rule__XEvent__Group_6_1_2__1
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
    // InternalXMachine.g:2932:1: rule__XEvent__Group_6_1_2__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_6_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2936:1: ( ( 'with' ) )
            // InternalXMachine.g:2937:1: ( 'with' )
            {
            // InternalXMachine.g:2937:1: ( 'with' )
            // InternalXMachine.g:2938:2: 'with'
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
    // InternalXMachine.g:2947:1: rule__XEvent__Group_6_1_2__1 : rule__XEvent__Group_6_1_2__1__Impl ;
    public final void rule__XEvent__Group_6_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2951:1: ( rule__XEvent__Group_6_1_2__1__Impl )
            // InternalXMachine.g:2952:2: rule__XEvent__Group_6_1_2__1__Impl
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
    // InternalXMachine.g:2958:1: rule__XEvent__Group_6_1_2__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* ) ) ;
    public final void rule__XEvent__Group_6_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2962:1: ( ( ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* ) ) )
            // InternalXMachine.g:2963:1: ( ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* ) )
            {
            // InternalXMachine.g:2963:1: ( ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* ) )
            // InternalXMachine.g:2964:2: ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* )
            {
            // InternalXMachine.g:2964:2: ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) )
            // InternalXMachine.g:2965:3: ( rule__XEvent__WitnessesAssignment_6_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_1_2_1()); 
            }
            // InternalXMachine.g:2966:3: ( rule__XEvent__WitnessesAssignment_6_1_2_1 )
            // InternalXMachine.g:2966:4: rule__XEvent__WitnessesAssignment_6_1_2_1
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

            // InternalXMachine.g:2969:2: ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* )
            // InternalXMachine.g:2970:3: ( rule__XEvent__WitnessesAssignment_6_1_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_1_2_1()); 
            }
            // InternalXMachine.g:2971:3: ( rule__XEvent__WitnessesAssignment_6_1_2_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_XLABEL) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalXMachine.g:2971:4: rule__XEvent__WitnessesAssignment_6_1_2_1
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
    // InternalXMachine.g:2981:1: rule__XEvent__Group_6_1_3__0 : rule__XEvent__Group_6_1_3__0__Impl rule__XEvent__Group_6_1_3__1 ;
    public final void rule__XEvent__Group_6_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2985:1: ( rule__XEvent__Group_6_1_3__0__Impl rule__XEvent__Group_6_1_3__1 )
            // InternalXMachine.g:2986:2: rule__XEvent__Group_6_1_3__0__Impl rule__XEvent__Group_6_1_3__1
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
    // InternalXMachine.g:2993:1: rule__XEvent__Group_6_1_3__0__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_6_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2997:1: ( ( 'then' ) )
            // InternalXMachine.g:2998:1: ( 'then' )
            {
            // InternalXMachine.g:2998:1: ( 'then' )
            // InternalXMachine.g:2999:2: 'then'
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
    // InternalXMachine.g:3008:1: rule__XEvent__Group_6_1_3__1 : rule__XEvent__Group_6_1_3__1__Impl ;
    public final void rule__XEvent__Group_6_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3012:1: ( rule__XEvent__Group_6_1_3__1__Impl )
            // InternalXMachine.g:3013:2: rule__XEvent__Group_6_1_3__1__Impl
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
    // InternalXMachine.g:3019:1: rule__XEvent__Group_6_1_3__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* ) ) ;
    public final void rule__XEvent__Group_6_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3023:1: ( ( ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* ) ) )
            // InternalXMachine.g:3024:1: ( ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* ) )
            {
            // InternalXMachine.g:3024:1: ( ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* ) )
            // InternalXMachine.g:3025:2: ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* )
            {
            // InternalXMachine.g:3025:2: ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) )
            // InternalXMachine.g:3026:3: ( rule__XEvent__ActionsAssignment_6_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_6_1_3_1()); 
            }
            // InternalXMachine.g:3027:3: ( rule__XEvent__ActionsAssignment_6_1_3_1 )
            // InternalXMachine.g:3027:4: rule__XEvent__ActionsAssignment_6_1_3_1
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

            // InternalXMachine.g:3030:2: ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* )
            // InternalXMachine.g:3031:3: ( rule__XEvent__ActionsAssignment_6_1_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_6_1_3_1()); 
            }
            // InternalXMachine.g:3032:3: ( rule__XEvent__ActionsAssignment_6_1_3_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_XLABEL) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalXMachine.g:3032:4: rule__XEvent__ActionsAssignment_6_1_3_1
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
    // InternalXMachine.g:3042:1: rule__XEvent__Group_6_2__0 : rule__XEvent__Group_6_2__0__Impl rule__XEvent__Group_6_2__1 ;
    public final void rule__XEvent__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3046:1: ( rule__XEvent__Group_6_2__0__Impl rule__XEvent__Group_6_2__1 )
            // InternalXMachine.g:3047:2: rule__XEvent__Group_6_2__0__Impl rule__XEvent__Group_6_2__1
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
    // InternalXMachine.g:3054:1: rule__XEvent__Group_6_2__0__Impl : ( 'any' ) ;
    public final void rule__XEvent__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3058:1: ( ( 'any' ) )
            // InternalXMachine.g:3059:1: ( 'any' )
            {
            // InternalXMachine.g:3059:1: ( 'any' )
            // InternalXMachine.g:3060:2: 'any'
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
    // InternalXMachine.g:3069:1: rule__XEvent__Group_6_2__1 : rule__XEvent__Group_6_2__1__Impl rule__XEvent__Group_6_2__2 ;
    public final void rule__XEvent__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3073:1: ( rule__XEvent__Group_6_2__1__Impl rule__XEvent__Group_6_2__2 )
            // InternalXMachine.g:3074:2: rule__XEvent__Group_6_2__1__Impl rule__XEvent__Group_6_2__2
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
    // InternalXMachine.g:3081:1: rule__XEvent__Group_6_2__1__Impl : ( ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* ) ) ;
    public final void rule__XEvent__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3085:1: ( ( ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* ) ) )
            // InternalXMachine.g:3086:1: ( ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* ) )
            {
            // InternalXMachine.g:3086:1: ( ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* ) )
            // InternalXMachine.g:3087:2: ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* )
            {
            // InternalXMachine.g:3087:2: ( ( rule__XEvent__ParametersAssignment_6_2_1 ) )
            // InternalXMachine.g:3088:3: ( rule__XEvent__ParametersAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getParametersAssignment_6_2_1()); 
            }
            // InternalXMachine.g:3089:3: ( rule__XEvent__ParametersAssignment_6_2_1 )
            // InternalXMachine.g:3089:4: rule__XEvent__ParametersAssignment_6_2_1
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

            // InternalXMachine.g:3092:2: ( ( rule__XEvent__ParametersAssignment_6_2_1 )* )
            // InternalXMachine.g:3093:3: ( rule__XEvent__ParametersAssignment_6_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getParametersAssignment_6_2_1()); 
            }
            // InternalXMachine.g:3094:3: ( rule__XEvent__ParametersAssignment_6_2_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalXMachine.g:3094:4: rule__XEvent__ParametersAssignment_6_2_1
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
    // InternalXMachine.g:3103:1: rule__XEvent__Group_6_2__2 : rule__XEvent__Group_6_2__2__Impl rule__XEvent__Group_6_2__3 ;
    public final void rule__XEvent__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3107:1: ( rule__XEvent__Group_6_2__2__Impl rule__XEvent__Group_6_2__3 )
            // InternalXMachine.g:3108:2: rule__XEvent__Group_6_2__2__Impl rule__XEvent__Group_6_2__3
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
    // InternalXMachine.g:3115:1: rule__XEvent__Group_6_2__2__Impl : ( 'where' ) ;
    public final void rule__XEvent__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3119:1: ( ( 'where' ) )
            // InternalXMachine.g:3120:1: ( 'where' )
            {
            // InternalXMachine.g:3120:1: ( 'where' )
            // InternalXMachine.g:3121:2: 'where'
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
    // InternalXMachine.g:3130:1: rule__XEvent__Group_6_2__3 : rule__XEvent__Group_6_2__3__Impl rule__XEvent__Group_6_2__4 ;
    public final void rule__XEvent__Group_6_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3134:1: ( rule__XEvent__Group_6_2__3__Impl rule__XEvent__Group_6_2__4 )
            // InternalXMachine.g:3135:2: rule__XEvent__Group_6_2__3__Impl rule__XEvent__Group_6_2__4
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
    // InternalXMachine.g:3142:1: rule__XEvent__Group_6_2__3__Impl : ( ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* ) ) ;
    public final void rule__XEvent__Group_6_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3146:1: ( ( ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* ) ) )
            // InternalXMachine.g:3147:1: ( ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* ) )
            {
            // InternalXMachine.g:3147:1: ( ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* ) )
            // InternalXMachine.g:3148:2: ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* )
            {
            // InternalXMachine.g:3148:2: ( ( rule__XEvent__GuardsAssignment_6_2_3 ) )
            // InternalXMachine.g:3149:3: ( rule__XEvent__GuardsAssignment_6_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsAssignment_6_2_3()); 
            }
            // InternalXMachine.g:3150:3: ( rule__XEvent__GuardsAssignment_6_2_3 )
            // InternalXMachine.g:3150:4: rule__XEvent__GuardsAssignment_6_2_3
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

            // InternalXMachine.g:3153:2: ( ( rule__XEvent__GuardsAssignment_6_2_3 )* )
            // InternalXMachine.g:3154:3: ( rule__XEvent__GuardsAssignment_6_2_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsAssignment_6_2_3()); 
            }
            // InternalXMachine.g:3155:3: ( rule__XEvent__GuardsAssignment_6_2_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_XLABEL) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalXMachine.g:3155:4: rule__XEvent__GuardsAssignment_6_2_3
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
    // InternalXMachine.g:3164:1: rule__XEvent__Group_6_2__4 : rule__XEvent__Group_6_2__4__Impl rule__XEvent__Group_6_2__5 ;
    public final void rule__XEvent__Group_6_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3168:1: ( rule__XEvent__Group_6_2__4__Impl rule__XEvent__Group_6_2__5 )
            // InternalXMachine.g:3169:2: rule__XEvent__Group_6_2__4__Impl rule__XEvent__Group_6_2__5
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
    // InternalXMachine.g:3176:1: rule__XEvent__Group_6_2__4__Impl : ( ( rule__XEvent__Group_6_2_4__0 )? ) ;
    public final void rule__XEvent__Group_6_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3180:1: ( ( ( rule__XEvent__Group_6_2_4__0 )? ) )
            // InternalXMachine.g:3181:1: ( ( rule__XEvent__Group_6_2_4__0 )? )
            {
            // InternalXMachine.g:3181:1: ( ( rule__XEvent__Group_6_2_4__0 )? )
            // InternalXMachine.g:3182:2: ( rule__XEvent__Group_6_2_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_6_2_4()); 
            }
            // InternalXMachine.g:3183:2: ( rule__XEvent__Group_6_2_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXMachine.g:3183:3: rule__XEvent__Group_6_2_4__0
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
    // InternalXMachine.g:3191:1: rule__XEvent__Group_6_2__5 : rule__XEvent__Group_6_2__5__Impl ;
    public final void rule__XEvent__Group_6_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3195:1: ( rule__XEvent__Group_6_2__5__Impl )
            // InternalXMachine.g:3196:2: rule__XEvent__Group_6_2__5__Impl
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
    // InternalXMachine.g:3202:1: rule__XEvent__Group_6_2__5__Impl : ( ( rule__XEvent__Group_6_2_5__0 )? ) ;
    public final void rule__XEvent__Group_6_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3206:1: ( ( ( rule__XEvent__Group_6_2_5__0 )? ) )
            // InternalXMachine.g:3207:1: ( ( rule__XEvent__Group_6_2_5__0 )? )
            {
            // InternalXMachine.g:3207:1: ( ( rule__XEvent__Group_6_2_5__0 )? )
            // InternalXMachine.g:3208:2: ( rule__XEvent__Group_6_2_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_6_2_5()); 
            }
            // InternalXMachine.g:3209:2: ( rule__XEvent__Group_6_2_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXMachine.g:3209:3: rule__XEvent__Group_6_2_5__0
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
    // InternalXMachine.g:3218:1: rule__XEvent__Group_6_2_4__0 : rule__XEvent__Group_6_2_4__0__Impl rule__XEvent__Group_6_2_4__1 ;
    public final void rule__XEvent__Group_6_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3222:1: ( rule__XEvent__Group_6_2_4__0__Impl rule__XEvent__Group_6_2_4__1 )
            // InternalXMachine.g:3223:2: rule__XEvent__Group_6_2_4__0__Impl rule__XEvent__Group_6_2_4__1
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
    // InternalXMachine.g:3230:1: rule__XEvent__Group_6_2_4__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_6_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3234:1: ( ( 'with' ) )
            // InternalXMachine.g:3235:1: ( 'with' )
            {
            // InternalXMachine.g:3235:1: ( 'with' )
            // InternalXMachine.g:3236:2: 'with'
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
    // InternalXMachine.g:3245:1: rule__XEvent__Group_6_2_4__1 : rule__XEvent__Group_6_2_4__1__Impl ;
    public final void rule__XEvent__Group_6_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3249:1: ( rule__XEvent__Group_6_2_4__1__Impl )
            // InternalXMachine.g:3250:2: rule__XEvent__Group_6_2_4__1__Impl
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
    // InternalXMachine.g:3256:1: rule__XEvent__Group_6_2_4__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* ) ) ;
    public final void rule__XEvent__Group_6_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3260:1: ( ( ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* ) ) )
            // InternalXMachine.g:3261:1: ( ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* ) )
            {
            // InternalXMachine.g:3261:1: ( ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* ) )
            // InternalXMachine.g:3262:2: ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* )
            {
            // InternalXMachine.g:3262:2: ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) )
            // InternalXMachine.g:3263:3: ( rule__XEvent__WitnessesAssignment_6_2_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_2_4_1()); 
            }
            // InternalXMachine.g:3264:3: ( rule__XEvent__WitnessesAssignment_6_2_4_1 )
            // InternalXMachine.g:3264:4: rule__XEvent__WitnessesAssignment_6_2_4_1
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

            // InternalXMachine.g:3267:2: ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* )
            // InternalXMachine.g:3268:3: ( rule__XEvent__WitnessesAssignment_6_2_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_2_4_1()); 
            }
            // InternalXMachine.g:3269:3: ( rule__XEvent__WitnessesAssignment_6_2_4_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_XLABEL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalXMachine.g:3269:4: rule__XEvent__WitnessesAssignment_6_2_4_1
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
    // InternalXMachine.g:3279:1: rule__XEvent__Group_6_2_5__0 : rule__XEvent__Group_6_2_5__0__Impl rule__XEvent__Group_6_2_5__1 ;
    public final void rule__XEvent__Group_6_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3283:1: ( rule__XEvent__Group_6_2_5__0__Impl rule__XEvent__Group_6_2_5__1 )
            // InternalXMachine.g:3284:2: rule__XEvent__Group_6_2_5__0__Impl rule__XEvent__Group_6_2_5__1
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
    // InternalXMachine.g:3291:1: rule__XEvent__Group_6_2_5__0__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_6_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3295:1: ( ( 'then' ) )
            // InternalXMachine.g:3296:1: ( 'then' )
            {
            // InternalXMachine.g:3296:1: ( 'then' )
            // InternalXMachine.g:3297:2: 'then'
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
    // InternalXMachine.g:3306:1: rule__XEvent__Group_6_2_5__1 : rule__XEvent__Group_6_2_5__1__Impl ;
    public final void rule__XEvent__Group_6_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3310:1: ( rule__XEvent__Group_6_2_5__1__Impl )
            // InternalXMachine.g:3311:2: rule__XEvent__Group_6_2_5__1__Impl
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
    // InternalXMachine.g:3317:1: rule__XEvent__Group_6_2_5__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* ) ) ;
    public final void rule__XEvent__Group_6_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3321:1: ( ( ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* ) ) )
            // InternalXMachine.g:3322:1: ( ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* ) )
            {
            // InternalXMachine.g:3322:1: ( ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* ) )
            // InternalXMachine.g:3323:2: ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* )
            {
            // InternalXMachine.g:3323:2: ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) )
            // InternalXMachine.g:3324:3: ( rule__XEvent__ActionsAssignment_6_2_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_6_2_5_1()); 
            }
            // InternalXMachine.g:3325:3: ( rule__XEvent__ActionsAssignment_6_2_5_1 )
            // InternalXMachine.g:3325:4: rule__XEvent__ActionsAssignment_6_2_5_1
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

            // InternalXMachine.g:3328:2: ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* )
            // InternalXMachine.g:3329:3: ( rule__XEvent__ActionsAssignment_6_2_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_6_2_5_1()); 
            }
            // InternalXMachine.g:3330:3: ( rule__XEvent__ActionsAssignment_6_2_5_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_XLABEL) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalXMachine.g:3330:4: rule__XEvent__ActionsAssignment_6_2_5_1
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
    // InternalXMachine.g:3340:1: rule__EventSync__Group__0 : rule__EventSync__Group__0__Impl rule__EventSync__Group__1 ;
    public final void rule__EventSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3344:1: ( rule__EventSync__Group__0__Impl rule__EventSync__Group__1 )
            // InternalXMachine.g:3345:2: rule__EventSync__Group__0__Impl rule__EventSync__Group__1
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
    // InternalXMachine.g:3352:1: rule__EventSync__Group__0__Impl : ( () ) ;
    public final void rule__EventSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3356:1: ( ( () ) )
            // InternalXMachine.g:3357:1: ( () )
            {
            // InternalXMachine.g:3357:1: ( () )
            // InternalXMachine.g:3358:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 
            }
            // InternalXMachine.g:3359:2: ()
            // InternalXMachine.g:3359:3: 
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
    // InternalXMachine.g:3367:1: rule__EventSync__Group__1 : rule__EventSync__Group__1__Impl rule__EventSync__Group__2 ;
    public final void rule__EventSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3371:1: ( rule__EventSync__Group__1__Impl rule__EventSync__Group__2 )
            // InternalXMachine.g:3372:2: rule__EventSync__Group__1__Impl rule__EventSync__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__EventSync__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventSync__Group__2();

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
    // InternalXMachine.g:3379:1: rule__EventSync__Group__1__Impl : ( ( rule__EventSync__Group_1__0 ) ) ;
    public final void rule__EventSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3383:1: ( ( ( rule__EventSync__Group_1__0 ) ) )
            // InternalXMachine.g:3384:1: ( ( rule__EventSync__Group_1__0 ) )
            {
            // InternalXMachine.g:3384:1: ( ( rule__EventSync__Group_1__0 ) )
            // InternalXMachine.g:3385:2: ( rule__EventSync__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup_1()); 
            }
            // InternalXMachine.g:3386:2: ( rule__EventSync__Group_1__0 )
            // InternalXMachine.g:3386:3: rule__EventSync__Group_1__0
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


    // $ANTLR start "rule__EventSync__Group__2"
    // InternalXMachine.g:3394:1: rule__EventSync__Group__2 : rule__EventSync__Group__2__Impl ;
    public final void rule__EventSync__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3398:1: ( rule__EventSync__Group__2__Impl )
            // InternalXMachine.g:3399:2: rule__EventSync__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group__2__Impl();

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
    // $ANTLR end "rule__EventSync__Group__2"


    // $ANTLR start "rule__EventSync__Group__2__Impl"
    // InternalXMachine.g:3405:1: rule__EventSync__Group__2__Impl : ( ( ruleXSyncParameters )? ) ;
    public final void rule__EventSync__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3409:1: ( ( ( ruleXSyncParameters )? ) )
            // InternalXMachine.g:3410:1: ( ( ruleXSyncParameters )? )
            {
            // InternalXMachine.g:3410:1: ( ( ruleXSyncParameters )? )
            // InternalXMachine.g:3411:2: ( ruleXSyncParameters )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getXSyncParametersParserRuleCall_2()); 
            }
            // InternalXMachine.g:3412:2: ( ruleXSyncParameters )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==41) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXMachine.g:3412:3: ruleXSyncParameters
                    {
                    pushFollow(FOLLOW_2);
                    ruleXSyncParameters();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getXSyncParametersParserRuleCall_2()); 
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
    // $ANTLR end "rule__EventSync__Group__2__Impl"


    // $ANTLR start "rule__EventSync__Group_1__0"
    // InternalXMachine.g:3421:1: rule__EventSync__Group_1__0 : rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 ;
    public final void rule__EventSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3425:1: ( rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 )
            // InternalXMachine.g:3426:2: rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1
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
    // InternalXMachine.g:3433:1: rule__EventSync__Group_1__0__Impl : ( 'synchronises' ) ;
    public final void rule__EventSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3437:1: ( ( 'synchronises' ) )
            // InternalXMachine.g:3438:1: ( 'synchronises' )
            {
            // InternalXMachine.g:3438:1: ( 'synchronises' )
            // InternalXMachine.g:3439:2: 'synchronises'
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
    // InternalXMachine.g:3448:1: rule__EventSync__Group_1__1 : rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 ;
    public final void rule__EventSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3452:1: ( rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 )
            // InternalXMachine.g:3453:2: rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2
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
    // InternalXMachine.g:3460:1: rule__EventSync__Group_1__1__Impl : ( ( rule__EventSync__Group_1_1__0 )? ) ;
    public final void rule__EventSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3464:1: ( ( ( rule__EventSync__Group_1_1__0 )? ) )
            // InternalXMachine.g:3465:1: ( ( rule__EventSync__Group_1_1__0 )? )
            {
            // InternalXMachine.g:3465:1: ( ( rule__EventSync__Group_1_1__0 )? )
            // InternalXMachine.g:3466:2: ( rule__EventSync__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup_1_1()); 
            }
            // InternalXMachine.g:3467:2: ( rule__EventSync__Group_1_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==28) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalXMachine.g:3467:3: rule__EventSync__Group_1_1__0
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
    // InternalXMachine.g:3475:1: rule__EventSync__Group_1__2 : rule__EventSync__Group_1__2__Impl ;
    public final void rule__EventSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3479:1: ( rule__EventSync__Group_1__2__Impl )
            // InternalXMachine.g:3480:2: rule__EventSync__Group_1__2__Impl
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
    // InternalXMachine.g:3486:1: rule__EventSync__Group_1__2__Impl : ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) ;
    public final void rule__EventSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3490:1: ( ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) )
            // InternalXMachine.g:3491:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            {
            // InternalXMachine.g:3491:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            // InternalXMachine.g:3492:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2()); 
            }
            // InternalXMachine.g:3493:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            // InternalXMachine.g:3493:3: rule__EventSync__SynchronisedEventAssignment_1_2
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
    // InternalXMachine.g:3502:1: rule__EventSync__Group_1_1__0 : rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 ;
    public final void rule__EventSync__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3506:1: ( rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 )
            // InternalXMachine.g:3507:2: rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1
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
    // InternalXMachine.g:3514:1: rule__EventSync__Group_1_1__0__Impl : ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) ;
    public final void rule__EventSync__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3518:1: ( ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) )
            // InternalXMachine.g:3519:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            {
            // InternalXMachine.g:3519:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            // InternalXMachine.g:3520:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0()); 
            }
            // InternalXMachine.g:3521:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            // InternalXMachine.g:3521:3: rule__EventSync__PrefixAssignment_1_1_0
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
    // InternalXMachine.g:3529:1: rule__EventSync__Group_1_1__1 : rule__EventSync__Group_1_1__1__Impl ;
    public final void rule__EventSync__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3533:1: ( rule__EventSync__Group_1_1__1__Impl )
            // InternalXMachine.g:3534:2: rule__EventSync__Group_1_1__1__Impl
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
    // InternalXMachine.g:3540:1: rule__EventSync__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__EventSync__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3544:1: ( ( '.' ) )
            // InternalXMachine.g:3545:1: ( '.' )
            {
            // InternalXMachine.g:3545:1: ( '.' )
            // InternalXMachine.g:3546:2: '.'
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


    // $ANTLR start "rule__XSyncParameters__Group__0"
    // InternalXMachine.g:3556:1: rule__XSyncParameters__Group__0 : rule__XSyncParameters__Group__0__Impl rule__XSyncParameters__Group__1 ;
    public final void rule__XSyncParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3560:1: ( rule__XSyncParameters__Group__0__Impl rule__XSyncParameters__Group__1 )
            // InternalXMachine.g:3561:2: rule__XSyncParameters__Group__0__Impl rule__XSyncParameters__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__XSyncParameters__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XSyncParameters__Group__1();

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
    // $ANTLR end "rule__XSyncParameters__Group__0"


    // $ANTLR start "rule__XSyncParameters__Group__0__Impl"
    // InternalXMachine.g:3568:1: rule__XSyncParameters__Group__0__Impl : ( '[' ) ;
    public final void rule__XSyncParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3572:1: ( ( '[' ) )
            // InternalXMachine.g:3573:1: ( '[' )
            {
            // InternalXMachine.g:3573:1: ( '[' )
            // InternalXMachine.g:3574:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXSyncParametersAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXSyncParametersAccess().getLeftSquareBracketKeyword_0()); 
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
    // $ANTLR end "rule__XSyncParameters__Group__0__Impl"


    // $ANTLR start "rule__XSyncParameters__Group__1"
    // InternalXMachine.g:3583:1: rule__XSyncParameters__Group__1 : rule__XSyncParameters__Group__1__Impl rule__XSyncParameters__Group__2 ;
    public final void rule__XSyncParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3587:1: ( rule__XSyncParameters__Group__1__Impl rule__XSyncParameters__Group__2 )
            // InternalXMachine.g:3588:2: rule__XSyncParameters__Group__1__Impl rule__XSyncParameters__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__XSyncParameters__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XSyncParameters__Group__2();

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
    // $ANTLR end "rule__XSyncParameters__Group__1"


    // $ANTLR start "rule__XSyncParameters__Group__1__Impl"
    // InternalXMachine.g:3595:1: rule__XSyncParameters__Group__1__Impl : ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) ;
    public final void rule__XSyncParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3599:1: ( ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) )
            // InternalXMachine.g:3600:1: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            {
            // InternalXMachine.g:3600:1: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            // InternalXMachine.g:3601:2: ( ( RULE_ID ) ) ( ( RULE_ID )* )
            {
            // InternalXMachine.g:3601:2: ( ( RULE_ID ) )
            // InternalXMachine.g:3602:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXSyncParametersAccess().getIDTerminalRuleCall_1()); 
            }
            // InternalXMachine.g:3603:3: ( RULE_ID )
            // InternalXMachine.g:3603:4: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_8); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXSyncParametersAccess().getIDTerminalRuleCall_1()); 
            }

            }

            // InternalXMachine.g:3606:2: ( ( RULE_ID )* )
            // InternalXMachine.g:3607:3: ( RULE_ID )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXSyncParametersAccess().getIDTerminalRuleCall_1()); 
            }
            // InternalXMachine.g:3608:3: ( RULE_ID )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalXMachine.g:3608:4: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_8); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXSyncParametersAccess().getIDTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__XSyncParameters__Group__1__Impl"


    // $ANTLR start "rule__XSyncParameters__Group__2"
    // InternalXMachine.g:3617:1: rule__XSyncParameters__Group__2 : rule__XSyncParameters__Group__2__Impl ;
    public final void rule__XSyncParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3621:1: ( rule__XSyncParameters__Group__2__Impl )
            // InternalXMachine.g:3622:2: rule__XSyncParameters__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XSyncParameters__Group__2__Impl();

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
    // $ANTLR end "rule__XSyncParameters__Group__2"


    // $ANTLR start "rule__XSyncParameters__Group__2__Impl"
    // InternalXMachine.g:3628:1: rule__XSyncParameters__Group__2__Impl : ( ']' ) ;
    public final void rule__XSyncParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3632:1: ( ( ']' ) )
            // InternalXMachine.g:3633:1: ( ']' )
            {
            // InternalXMachine.g:3633:1: ( ']' )
            // InternalXMachine.g:3634:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXSyncParametersAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXSyncParametersAccess().getRightSquareBracketKeyword_2()); 
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
    // $ANTLR end "rule__XSyncParameters__Group__2__Impl"


    // $ANTLR start "rule__GroupSync__Group__0"
    // InternalXMachine.g:3644:1: rule__GroupSync__Group__0 : rule__GroupSync__Group__0__Impl rule__GroupSync__Group__1 ;
    public final void rule__GroupSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3648:1: ( rule__GroupSync__Group__0__Impl rule__GroupSync__Group__1 )
            // InternalXMachine.g:3649:2: rule__GroupSync__Group__0__Impl rule__GroupSync__Group__1
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
    // InternalXMachine.g:3656:1: rule__GroupSync__Group__0__Impl : ( () ) ;
    public final void rule__GroupSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3660:1: ( ( () ) )
            // InternalXMachine.g:3661:1: ( () )
            {
            // InternalXMachine.g:3661:1: ( () )
            // InternalXMachine.g:3662:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getEventSynchronisationAction_0()); 
            }
            // InternalXMachine.g:3663:2: ()
            // InternalXMachine.g:3663:3: 
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
    // InternalXMachine.g:3671:1: rule__GroupSync__Group__1 : rule__GroupSync__Group__1__Impl rule__GroupSync__Group__2 ;
    public final void rule__GroupSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3675:1: ( rule__GroupSync__Group__1__Impl rule__GroupSync__Group__2 )
            // InternalXMachine.g:3676:2: rule__GroupSync__Group__1__Impl rule__GroupSync__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalXMachine.g:3683:1: rule__GroupSync__Group__1__Impl : ( ( rule__GroupSync__Group_1__0 ) ) ;
    public final void rule__GroupSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3687:1: ( ( ( rule__GroupSync__Group_1__0 ) ) )
            // InternalXMachine.g:3688:1: ( ( rule__GroupSync__Group_1__0 ) )
            {
            // InternalXMachine.g:3688:1: ( ( rule__GroupSync__Group_1__0 ) )
            // InternalXMachine.g:3689:2: ( rule__GroupSync__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getGroup_1()); 
            }
            // InternalXMachine.g:3690:2: ( rule__GroupSync__Group_1__0 )
            // InternalXMachine.g:3690:3: rule__GroupSync__Group_1__0
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
    // InternalXMachine.g:3698:1: rule__GroupSync__Group__2 : rule__GroupSync__Group__2__Impl ;
    public final void rule__GroupSync__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3702:1: ( rule__GroupSync__Group__2__Impl )
            // InternalXMachine.g:3703:2: rule__GroupSync__Group__2__Impl
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
    // InternalXMachine.g:3709:1: rule__GroupSync__Group__2__Impl : ( ( rule__GroupSync__Group_2__0 )? ) ;
    public final void rule__GroupSync__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3713:1: ( ( ( rule__GroupSync__Group_2__0 )? ) )
            // InternalXMachine.g:3714:1: ( ( rule__GroupSync__Group_2__0 )? )
            {
            // InternalXMachine.g:3714:1: ( ( rule__GroupSync__Group_2__0 )? )
            // InternalXMachine.g:3715:2: ( rule__GroupSync__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getGroup_2()); 
            }
            // InternalXMachine.g:3716:2: ( rule__GroupSync__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==30) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalXMachine.g:3716:3: rule__GroupSync__Group_2__0
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
    // InternalXMachine.g:3725:1: rule__GroupSync__Group_1__0 : rule__GroupSync__Group_1__0__Impl rule__GroupSync__Group_1__1 ;
    public final void rule__GroupSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3729:1: ( rule__GroupSync__Group_1__0__Impl rule__GroupSync__Group_1__1 )
            // InternalXMachine.g:3730:2: rule__GroupSync__Group_1__0__Impl rule__GroupSync__Group_1__1
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
    // InternalXMachine.g:3737:1: rule__GroupSync__Group_1__0__Impl : ( 'synchronises' ) ;
    public final void rule__GroupSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3741:1: ( ( 'synchronises' ) )
            // InternalXMachine.g:3742:1: ( 'synchronises' )
            {
            // InternalXMachine.g:3742:1: ( 'synchronises' )
            // InternalXMachine.g:3743:2: 'synchronises'
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
    // InternalXMachine.g:3752:1: rule__GroupSync__Group_1__1 : rule__GroupSync__Group_1__1__Impl rule__GroupSync__Group_1__2 ;
    public final void rule__GroupSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3756:1: ( rule__GroupSync__Group_1__1__Impl rule__GroupSync__Group_1__2 )
            // InternalXMachine.g:3757:2: rule__GroupSync__Group_1__1__Impl rule__GroupSync__Group_1__2
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
    // InternalXMachine.g:3764:1: rule__GroupSync__Group_1__1__Impl : ( 'group' ) ;
    public final void rule__GroupSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3768:1: ( ( 'group' ) )
            // InternalXMachine.g:3769:1: ( 'group' )
            {
            // InternalXMachine.g:3769:1: ( 'group' )
            // InternalXMachine.g:3770:2: 'group'
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
    // InternalXMachine.g:3779:1: rule__GroupSync__Group_1__2 : rule__GroupSync__Group_1__2__Impl rule__GroupSync__Group_1__3 ;
    public final void rule__GroupSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3783:1: ( rule__GroupSync__Group_1__2__Impl rule__GroupSync__Group_1__3 )
            // InternalXMachine.g:3784:2: rule__GroupSync__Group_1__2__Impl rule__GroupSync__Group_1__3
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
    // InternalXMachine.g:3791:1: rule__GroupSync__Group_1__2__Impl : ( ( rule__GroupSync__Group_1_2__0 )? ) ;
    public final void rule__GroupSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3795:1: ( ( ( rule__GroupSync__Group_1_2__0 )? ) )
            // InternalXMachine.g:3796:1: ( ( rule__GroupSync__Group_1_2__0 )? )
            {
            // InternalXMachine.g:3796:1: ( ( rule__GroupSync__Group_1_2__0 )? )
            // InternalXMachine.g:3797:2: ( rule__GroupSync__Group_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getGroup_1_2()); 
            }
            // InternalXMachine.g:3798:2: ( rule__GroupSync__Group_1_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==28) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:3798:3: rule__GroupSync__Group_1_2__0
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
    // InternalXMachine.g:3806:1: rule__GroupSync__Group_1__3 : rule__GroupSync__Group_1__3__Impl ;
    public final void rule__GroupSync__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3810:1: ( rule__GroupSync__Group_1__3__Impl )
            // InternalXMachine.g:3811:2: rule__GroupSync__Group_1__3__Impl
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
    // InternalXMachine.g:3817:1: rule__GroupSync__Group_1__3__Impl : ( ( rule__GroupSync__SynchronisedCasesAssignment_1_3 ) ) ;
    public final void rule__GroupSync__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3821:1: ( ( ( rule__GroupSync__SynchronisedCasesAssignment_1_3 ) ) )
            // InternalXMachine.g:3822:1: ( ( rule__GroupSync__SynchronisedCasesAssignment_1_3 ) )
            {
            // InternalXMachine.g:3822:1: ( ( rule__GroupSync__SynchronisedCasesAssignment_1_3 ) )
            // InternalXMachine.g:3823:2: ( rule__GroupSync__SynchronisedCasesAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getSynchronisedCasesAssignment_1_3()); 
            }
            // InternalXMachine.g:3824:2: ( rule__GroupSync__SynchronisedCasesAssignment_1_3 )
            // InternalXMachine.g:3824:3: rule__GroupSync__SynchronisedCasesAssignment_1_3
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
    // InternalXMachine.g:3833:1: rule__GroupSync__Group_1_2__0 : rule__GroupSync__Group_1_2__0__Impl rule__GroupSync__Group_1_2__1 ;
    public final void rule__GroupSync__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3837:1: ( rule__GroupSync__Group_1_2__0__Impl rule__GroupSync__Group_1_2__1 )
            // InternalXMachine.g:3838:2: rule__GroupSync__Group_1_2__0__Impl rule__GroupSync__Group_1_2__1
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
    // InternalXMachine.g:3845:1: rule__GroupSync__Group_1_2__0__Impl : ( ( rule__GroupSync__PrefixAssignment_1_2_0 ) ) ;
    public final void rule__GroupSync__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3849:1: ( ( ( rule__GroupSync__PrefixAssignment_1_2_0 ) ) )
            // InternalXMachine.g:3850:1: ( ( rule__GroupSync__PrefixAssignment_1_2_0 ) )
            {
            // InternalXMachine.g:3850:1: ( ( rule__GroupSync__PrefixAssignment_1_2_0 ) )
            // InternalXMachine.g:3851:2: ( rule__GroupSync__PrefixAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getPrefixAssignment_1_2_0()); 
            }
            // InternalXMachine.g:3852:2: ( rule__GroupSync__PrefixAssignment_1_2_0 )
            // InternalXMachine.g:3852:3: rule__GroupSync__PrefixAssignment_1_2_0
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
    // InternalXMachine.g:3860:1: rule__GroupSync__Group_1_2__1 : rule__GroupSync__Group_1_2__1__Impl ;
    public final void rule__GroupSync__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3864:1: ( rule__GroupSync__Group_1_2__1__Impl )
            // InternalXMachine.g:3865:2: rule__GroupSync__Group_1_2__1__Impl
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
    // InternalXMachine.g:3871:1: rule__GroupSync__Group_1_2__1__Impl : ( '.' ) ;
    public final void rule__GroupSync__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3875:1: ( ( '.' ) )
            // InternalXMachine.g:3876:1: ( '.' )
            {
            // InternalXMachine.g:3876:1: ( '.' )
            // InternalXMachine.g:3877:2: '.'
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
    // InternalXMachine.g:3887:1: rule__GroupSync__Group_2__0 : rule__GroupSync__Group_2__0__Impl rule__GroupSync__Group_2__1 ;
    public final void rule__GroupSync__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3891:1: ( rule__GroupSync__Group_2__0__Impl rule__GroupSync__Group_2__1 )
            // InternalXMachine.g:3892:2: rule__GroupSync__Group_2__0__Impl rule__GroupSync__Group_2__1
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
    // InternalXMachine.g:3899:1: rule__GroupSync__Group_2__0__Impl : ( '(' ) ;
    public final void rule__GroupSync__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3903:1: ( ( '(' ) )
            // InternalXMachine.g:3904:1: ( '(' )
            {
            // InternalXMachine.g:3904:1: ( '(' )
            // InternalXMachine.g:3905:2: '('
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
    // InternalXMachine.g:3914:1: rule__GroupSync__Group_2__1 : rule__GroupSync__Group_2__1__Impl rule__GroupSync__Group_2__2 ;
    public final void rule__GroupSync__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3918:1: ( rule__GroupSync__Group_2__1__Impl rule__GroupSync__Group_2__2 )
            // InternalXMachine.g:3919:2: rule__GroupSync__Group_2__1__Impl rule__GroupSync__Group_2__2
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
    // InternalXMachine.g:3926:1: rule__GroupSync__Group_2__1__Impl : ( ( rule__GroupSync__ActualParametersAssignment_2_1 ) ) ;
    public final void rule__GroupSync__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3930:1: ( ( ( rule__GroupSync__ActualParametersAssignment_2_1 ) ) )
            // InternalXMachine.g:3931:1: ( ( rule__GroupSync__ActualParametersAssignment_2_1 ) )
            {
            // InternalXMachine.g:3931:1: ( ( rule__GroupSync__ActualParametersAssignment_2_1 ) )
            // InternalXMachine.g:3932:2: ( rule__GroupSync__ActualParametersAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getActualParametersAssignment_2_1()); 
            }
            // InternalXMachine.g:3933:2: ( rule__GroupSync__ActualParametersAssignment_2_1 )
            // InternalXMachine.g:3933:3: rule__GroupSync__ActualParametersAssignment_2_1
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
    // InternalXMachine.g:3941:1: rule__GroupSync__Group_2__2 : rule__GroupSync__Group_2__2__Impl rule__GroupSync__Group_2__3 ;
    public final void rule__GroupSync__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3945:1: ( rule__GroupSync__Group_2__2__Impl rule__GroupSync__Group_2__3 )
            // InternalXMachine.g:3946:2: rule__GroupSync__Group_2__2__Impl rule__GroupSync__Group_2__3
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
    // InternalXMachine.g:3953:1: rule__GroupSync__Group_2__2__Impl : ( ( rule__GroupSync__Group_2_2__0 )* ) ;
    public final void rule__GroupSync__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3957:1: ( ( ( rule__GroupSync__Group_2_2__0 )* ) )
            // InternalXMachine.g:3958:1: ( ( rule__GroupSync__Group_2_2__0 )* )
            {
            // InternalXMachine.g:3958:1: ( ( rule__GroupSync__Group_2_2__0 )* )
            // InternalXMachine.g:3959:2: ( rule__GroupSync__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getGroup_2_2()); 
            }
            // InternalXMachine.g:3960:2: ( rule__GroupSync__Group_2_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==32) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalXMachine.g:3960:3: rule__GroupSync__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__GroupSync__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalXMachine.g:3968:1: rule__GroupSync__Group_2__3 : rule__GroupSync__Group_2__3__Impl ;
    public final void rule__GroupSync__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3972:1: ( rule__GroupSync__Group_2__3__Impl )
            // InternalXMachine.g:3973:2: rule__GroupSync__Group_2__3__Impl
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
    // InternalXMachine.g:3979:1: rule__GroupSync__Group_2__3__Impl : ( ')' ) ;
    public final void rule__GroupSync__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3983:1: ( ( ')' ) )
            // InternalXMachine.g:3984:1: ( ')' )
            {
            // InternalXMachine.g:3984:1: ( ')' )
            // InternalXMachine.g:3985:2: ')'
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
    // InternalXMachine.g:3995:1: rule__GroupSync__Group_2_2__0 : rule__GroupSync__Group_2_2__0__Impl rule__GroupSync__Group_2_2__1 ;
    public final void rule__GroupSync__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3999:1: ( rule__GroupSync__Group_2_2__0__Impl rule__GroupSync__Group_2_2__1 )
            // InternalXMachine.g:4000:2: rule__GroupSync__Group_2_2__0__Impl rule__GroupSync__Group_2_2__1
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
    // InternalXMachine.g:4007:1: rule__GroupSync__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__GroupSync__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4011:1: ( ( ',' ) )
            // InternalXMachine.g:4012:1: ( ',' )
            {
            // InternalXMachine.g:4012:1: ( ',' )
            // InternalXMachine.g:4013:2: ','
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
    // InternalXMachine.g:4022:1: rule__GroupSync__Group_2_2__1 : rule__GroupSync__Group_2_2__1__Impl ;
    public final void rule__GroupSync__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4026:1: ( rule__GroupSync__Group_2_2__1__Impl )
            // InternalXMachine.g:4027:2: rule__GroupSync__Group_2_2__1__Impl
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
    // InternalXMachine.g:4033:1: rule__GroupSync__Group_2_2__1__Impl : ( ( rule__GroupSync__ActualParametersAssignment_2_2_1 ) ) ;
    public final void rule__GroupSync__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4037:1: ( ( ( rule__GroupSync__ActualParametersAssignment_2_2_1 ) ) )
            // InternalXMachine.g:4038:1: ( ( rule__GroupSync__ActualParametersAssignment_2_2_1 ) )
            {
            // InternalXMachine.g:4038:1: ( ( rule__GroupSync__ActualParametersAssignment_2_2_1 ) )
            // InternalXMachine.g:4039:2: ( rule__GroupSync__ActualParametersAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getActualParametersAssignment_2_2_1()); 
            }
            // InternalXMachine.g:4040:2: ( rule__GroupSync__ActualParametersAssignment_2_2_1 )
            // InternalXMachine.g:4040:3: rule__GroupSync__ActualParametersAssignment_2_2_1
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
    // InternalXMachine.g:4049:1: rule__XParameter__Group__0 : rule__XParameter__Group__0__Impl rule__XParameter__Group__1 ;
    public final void rule__XParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4053:1: ( rule__XParameter__Group__0__Impl rule__XParameter__Group__1 )
            // InternalXMachine.g:4054:2: rule__XParameter__Group__0__Impl rule__XParameter__Group__1
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
    // InternalXMachine.g:4061:1: rule__XParameter__Group__0__Impl : ( () ) ;
    public final void rule__XParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4065:1: ( ( () ) )
            // InternalXMachine.g:4066:1: ( () )
            {
            // InternalXMachine.g:4066:1: ( () )
            // InternalXMachine.g:4067:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getParameterAction_0()); 
            }
            // InternalXMachine.g:4068:2: ()
            // InternalXMachine.g:4068:3: 
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
    // InternalXMachine.g:4076:1: rule__XParameter__Group__1 : rule__XParameter__Group__1__Impl ;
    public final void rule__XParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4080:1: ( rule__XParameter__Group__1__Impl )
            // InternalXMachine.g:4081:2: rule__XParameter__Group__1__Impl
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
    // InternalXMachine.g:4087:1: rule__XParameter__Group__1__Impl : ( ( rule__XParameter__NameAssignment_1 ) ) ;
    public final void rule__XParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4091:1: ( ( ( rule__XParameter__NameAssignment_1 ) ) )
            // InternalXMachine.g:4092:1: ( ( rule__XParameter__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4092:1: ( ( rule__XParameter__NameAssignment_1 ) )
            // InternalXMachine.g:4093:2: ( rule__XParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:4094:2: ( rule__XParameter__NameAssignment_1 )
            // InternalXMachine.g:4094:3: rule__XParameter__NameAssignment_1
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
    // InternalXMachine.g:4103:1: rule__XGuard__Group__0 : rule__XGuard__Group__0__Impl rule__XGuard__Group__1 ;
    public final void rule__XGuard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4107:1: ( rule__XGuard__Group__0__Impl rule__XGuard__Group__1 )
            // InternalXMachine.g:4108:2: rule__XGuard__Group__0__Impl rule__XGuard__Group__1
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
    // InternalXMachine.g:4115:1: rule__XGuard__Group__0__Impl : ( () ) ;
    public final void rule__XGuard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4119:1: ( ( () ) )
            // InternalXMachine.g:4120:1: ( () )
            {
            // InternalXMachine.g:4120:1: ( () )
            // InternalXMachine.g:4121:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getGuardAction_0()); 
            }
            // InternalXMachine.g:4122:2: ()
            // InternalXMachine.g:4122:3: 
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
    // InternalXMachine.g:4130:1: rule__XGuard__Group__1 : rule__XGuard__Group__1__Impl rule__XGuard__Group__2 ;
    public final void rule__XGuard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4134:1: ( rule__XGuard__Group__1__Impl rule__XGuard__Group__2 )
            // InternalXMachine.g:4135:2: rule__XGuard__Group__1__Impl rule__XGuard__Group__2
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
    // InternalXMachine.g:4142:1: rule__XGuard__Group__1__Impl : ( ( rule__XGuard__NameAssignment_1 ) ) ;
    public final void rule__XGuard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4146:1: ( ( ( rule__XGuard__NameAssignment_1 ) ) )
            // InternalXMachine.g:4147:1: ( ( rule__XGuard__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4147:1: ( ( rule__XGuard__NameAssignment_1 ) )
            // InternalXMachine.g:4148:2: ( rule__XGuard__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:4149:2: ( rule__XGuard__NameAssignment_1 )
            // InternalXMachine.g:4149:3: rule__XGuard__NameAssignment_1
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
    // InternalXMachine.g:4157:1: rule__XGuard__Group__2 : rule__XGuard__Group__2__Impl rule__XGuard__Group__3 ;
    public final void rule__XGuard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4161:1: ( rule__XGuard__Group__2__Impl rule__XGuard__Group__3 )
            // InternalXMachine.g:4162:2: rule__XGuard__Group__2__Impl rule__XGuard__Group__3
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
    // InternalXMachine.g:4169:1: rule__XGuard__Group__2__Impl : ( ( rule__XGuard__PredicateAssignment_2 ) ) ;
    public final void rule__XGuard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4173:1: ( ( ( rule__XGuard__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:4174:1: ( ( rule__XGuard__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:4174:1: ( ( rule__XGuard__PredicateAssignment_2 ) )
            // InternalXMachine.g:4175:2: ( rule__XGuard__PredicateAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getPredicateAssignment_2()); 
            }
            // InternalXMachine.g:4176:2: ( rule__XGuard__PredicateAssignment_2 )
            // InternalXMachine.g:4176:3: rule__XGuard__PredicateAssignment_2
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
    // InternalXMachine.g:4184:1: rule__XGuard__Group__3 : rule__XGuard__Group__3__Impl ;
    public final void rule__XGuard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4188:1: ( rule__XGuard__Group__3__Impl )
            // InternalXMachine.g:4189:2: rule__XGuard__Group__3__Impl
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
    // InternalXMachine.g:4195:1: rule__XGuard__Group__3__Impl : ( ( rule__XGuard__TheoremAssignment_3 )? ) ;
    public final void rule__XGuard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4199:1: ( ( ( rule__XGuard__TheoremAssignment_3 )? ) )
            // InternalXMachine.g:4200:1: ( ( rule__XGuard__TheoremAssignment_3 )? )
            {
            // InternalXMachine.g:4200:1: ( ( rule__XGuard__TheoremAssignment_3 )? )
            // InternalXMachine.g:4201:2: ( rule__XGuard__TheoremAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremAssignment_3()); 
            }
            // InternalXMachine.g:4202:2: ( rule__XGuard__TheoremAssignment_3 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==43) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXMachine.g:4202:3: rule__XGuard__TheoremAssignment_3
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
    // InternalXMachine.g:4211:1: rule__XWitness__Group__0 : rule__XWitness__Group__0__Impl rule__XWitness__Group__1 ;
    public final void rule__XWitness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4215:1: ( rule__XWitness__Group__0__Impl rule__XWitness__Group__1 )
            // InternalXMachine.g:4216:2: rule__XWitness__Group__0__Impl rule__XWitness__Group__1
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
    // InternalXMachine.g:4223:1: rule__XWitness__Group__0__Impl : ( () ) ;
    public final void rule__XWitness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4227:1: ( ( () ) )
            // InternalXMachine.g:4228:1: ( () )
            {
            // InternalXMachine.g:4228:1: ( () )
            // InternalXMachine.g:4229:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 
            }
            // InternalXMachine.g:4230:2: ()
            // InternalXMachine.g:4230:3: 
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
    // InternalXMachine.g:4238:1: rule__XWitness__Group__1 : rule__XWitness__Group__1__Impl rule__XWitness__Group__2 ;
    public final void rule__XWitness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4242:1: ( rule__XWitness__Group__1__Impl rule__XWitness__Group__2 )
            // InternalXMachine.g:4243:2: rule__XWitness__Group__1__Impl rule__XWitness__Group__2
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
    // InternalXMachine.g:4250:1: rule__XWitness__Group__1__Impl : ( ( rule__XWitness__NameAssignment_1 ) ) ;
    public final void rule__XWitness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4254:1: ( ( ( rule__XWitness__NameAssignment_1 ) ) )
            // InternalXMachine.g:4255:1: ( ( rule__XWitness__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4255:1: ( ( rule__XWitness__NameAssignment_1 ) )
            // InternalXMachine.g:4256:2: ( rule__XWitness__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:4257:2: ( rule__XWitness__NameAssignment_1 )
            // InternalXMachine.g:4257:3: rule__XWitness__NameAssignment_1
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
    // InternalXMachine.g:4265:1: rule__XWitness__Group__2 : rule__XWitness__Group__2__Impl ;
    public final void rule__XWitness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4269:1: ( rule__XWitness__Group__2__Impl )
            // InternalXMachine.g:4270:2: rule__XWitness__Group__2__Impl
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
    // InternalXMachine.g:4276:1: rule__XWitness__Group__2__Impl : ( ( rule__XWitness__PredicateAssignment_2 ) ) ;
    public final void rule__XWitness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4280:1: ( ( ( rule__XWitness__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:4281:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:4281:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            // InternalXMachine.g:4282:2: ( rule__XWitness__PredicateAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getPredicateAssignment_2()); 
            }
            // InternalXMachine.g:4283:2: ( rule__XWitness__PredicateAssignment_2 )
            // InternalXMachine.g:4283:3: rule__XWitness__PredicateAssignment_2
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
    // InternalXMachine.g:4292:1: rule__XAction__Group__0 : rule__XAction__Group__0__Impl rule__XAction__Group__1 ;
    public final void rule__XAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4296:1: ( rule__XAction__Group__0__Impl rule__XAction__Group__1 )
            // InternalXMachine.g:4297:2: rule__XAction__Group__0__Impl rule__XAction__Group__1
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
    // InternalXMachine.g:4304:1: rule__XAction__Group__0__Impl : ( () ) ;
    public final void rule__XAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4308:1: ( ( () ) )
            // InternalXMachine.g:4309:1: ( () )
            {
            // InternalXMachine.g:4309:1: ( () )
            // InternalXMachine.g:4310:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionAction_0()); 
            }
            // InternalXMachine.g:4311:2: ()
            // InternalXMachine.g:4311:3: 
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
    // InternalXMachine.g:4319:1: rule__XAction__Group__1 : rule__XAction__Group__1__Impl rule__XAction__Group__2 ;
    public final void rule__XAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4323:1: ( rule__XAction__Group__1__Impl rule__XAction__Group__2 )
            // InternalXMachine.g:4324:2: rule__XAction__Group__1__Impl rule__XAction__Group__2
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
    // InternalXMachine.g:4331:1: rule__XAction__Group__1__Impl : ( ( rule__XAction__NameAssignment_1 ) ) ;
    public final void rule__XAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4335:1: ( ( ( rule__XAction__NameAssignment_1 ) ) )
            // InternalXMachine.g:4336:1: ( ( rule__XAction__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4336:1: ( ( rule__XAction__NameAssignment_1 ) )
            // InternalXMachine.g:4337:2: ( rule__XAction__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:4338:2: ( rule__XAction__NameAssignment_1 )
            // InternalXMachine.g:4338:3: rule__XAction__NameAssignment_1
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
    // InternalXMachine.g:4346:1: rule__XAction__Group__2 : rule__XAction__Group__2__Impl ;
    public final void rule__XAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4350:1: ( rule__XAction__Group__2__Impl )
            // InternalXMachine.g:4351:2: rule__XAction__Group__2__Impl
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
    // InternalXMachine.g:4357:1: rule__XAction__Group__2__Impl : ( ( rule__XAction__ActionAssignment_2 ) ) ;
    public final void rule__XAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4361:1: ( ( ( rule__XAction__ActionAssignment_2 ) ) )
            // InternalXMachine.g:4362:1: ( ( rule__XAction__ActionAssignment_2 ) )
            {
            // InternalXMachine.g:4362:1: ( ( rule__XAction__ActionAssignment_2 ) )
            // InternalXMachine.g:4363:2: ( rule__XAction__ActionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionAssignment_2()); 
            }
            // InternalXMachine.g:4364:2: ( rule__XAction__ActionAssignment_2 )
            // InternalXMachine.g:4364:3: rule__XAction__ActionAssignment_2
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
    // InternalXMachine.g:4373:1: rule__Machine__UnorderedGroup_3 : ( rule__Machine__UnorderedGroup_3__0 )? ;
    public final void rule__Machine__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMachineAccess().getUnorderedGroup_3());
        	
        try {
            // InternalXMachine.g:4378:1: ( ( rule__Machine__UnorderedGroup_3__0 )? )
            // InternalXMachine.g:4379:2: ( rule__Machine__UnorderedGroup_3__0 )?
            {
            // InternalXMachine.g:4379:2: ( rule__Machine__UnorderedGroup_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( LA48_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
                alt48=1;
            }
            else if ( LA48_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXMachine.g:4379:2: rule__Machine__UnorderedGroup_3__0
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
    // InternalXMachine.g:4387:1: rule__Machine__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) ) ) ;
    public final void rule__Machine__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXMachine.g:4392:1: ( ( ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) ) ) )
            // InternalXMachine.g:4393:3: ( ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) ) )
            {
            // InternalXMachine.g:4393:3: ( ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) ) )
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( LA50_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
                alt50=2;
            }
            else if ( LA50_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
                alt50=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalXMachine.g:4394:3: ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) )
                    {
                    // InternalXMachine.g:4394:3: ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) )
                    // InternalXMachine.g:4395:4: {...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalXMachine.g:4395:103: ( ( ( rule__Machine__Group_3_0__0 ) ) )
                    // InternalXMachine.g:4396:5: ( ( rule__Machine__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalXMachine.g:4402:5: ( ( rule__Machine__Group_3_0__0 ) )
                    // InternalXMachine.g:4403:6: ( rule__Machine__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_3_0()); 
                    }
                    // InternalXMachine.g:4404:6: ( rule__Machine__Group_3_0__0 )
                    // InternalXMachine.g:4404:7: rule__Machine__Group_3_0__0
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
                    // InternalXMachine.g:4409:3: ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) )
                    {
                    // InternalXMachine.g:4409:3: ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) )
                    // InternalXMachine.g:4410:4: {...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalXMachine.g:4410:103: ( ( ( rule__Machine__Group_3_1__0 ) ) )
                    // InternalXMachine.g:4411:5: ( ( rule__Machine__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalXMachine.g:4417:5: ( ( rule__Machine__Group_3_1__0 ) )
                    // InternalXMachine.g:4418:6: ( rule__Machine__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_3_1()); 
                    }
                    // InternalXMachine.g:4419:6: ( rule__Machine__Group_3_1__0 )
                    // InternalXMachine.g:4419:7: rule__Machine__Group_3_1__0
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
                    // InternalXMachine.g:4424:3: ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) )
                    {
                    // InternalXMachine.g:4424:3: ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) )
                    // InternalXMachine.g:4425:4: {...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalXMachine.g:4425:103: ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) )
                    // InternalXMachine.g:4426:5: ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // InternalXMachine.g:4432:5: ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) )
                    // InternalXMachine.g:4433:6: ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* )
                    {
                    // InternalXMachine.g:4433:6: ( ( rule__Machine__ExtensionsAssignment_3_2 ) )
                    // InternalXMachine.g:4434:7: ( rule__Machine__ExtensionsAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getExtensionsAssignment_3_2()); 
                    }
                    // InternalXMachine.g:4435:7: ( rule__Machine__ExtensionsAssignment_3_2 )
                    // InternalXMachine.g:4435:8: rule__Machine__ExtensionsAssignment_3_2
                    {
                    pushFollow(FOLLOW_32);
                    rule__Machine__ExtensionsAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getExtensionsAssignment_3_2()); 
                    }

                    }

                    // InternalXMachine.g:4438:6: ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* )
                    // InternalXMachine.g:4439:7: ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getExtensionsAssignment_3_2()); 
                    }
                    // InternalXMachine.g:4440:7: ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==25) ) {
                            int LA49_2 = input.LA(2);

                            if ( (LA49_2==RULE_ID) ) {
                                int LA49_3 = input.LA(3);

                                if ( (synpred1_InternalXMachine()) ) {
                                    alt49=1;
                                }


                            }


                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalXMachine.g:4440:8: ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2
                    	    {
                    	    pushFollow(FOLLOW_32);
                    	    rule__Machine__ExtensionsAssignment_3_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
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
    // InternalXMachine.g:4454:1: rule__Machine__UnorderedGroup_3__0 : rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__1 )? ;
    public final void rule__Machine__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4458:1: ( rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__1 )? )
            // InternalXMachine.g:4459:2: rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_32);
            rule__Machine__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:4460:2: ( rule__Machine__UnorderedGroup_3__1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
                alt51=1;
            }
            else if ( LA51_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalXMachine.g:4460:2: rule__Machine__UnorderedGroup_3__1
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
    // InternalXMachine.g:4466:1: rule__Machine__UnorderedGroup_3__1 : rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__2 )? ;
    public final void rule__Machine__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4470:1: ( rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__2 )? )
            // InternalXMachine.g:4471:2: rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_32);
            rule__Machine__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:4472:2: ( rule__Machine__UnorderedGroup_3__2 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
                alt52=1;
            }
            else if ( LA52_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalXMachine.g:4472:2: rule__Machine__UnorderedGroup_3__2
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
    // InternalXMachine.g:4478:1: rule__Machine__UnorderedGroup_3__2 : rule__Machine__UnorderedGroup_3__Impl ;
    public final void rule__Machine__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4482:1: ( rule__Machine__UnorderedGroup_3__Impl )
            // InternalXMachine.g:4483:2: rule__Machine__UnorderedGroup_3__Impl
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
    // InternalXMachine.g:4490:1: rule__XEvent__UnorderedGroup_3 : ( rule__XEvent__UnorderedGroup_3__0 )? ;
    public final void rule__XEvent__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getXEventAccess().getUnorderedGroup_3());
        	
        try {
            // InternalXMachine.g:4495:1: ( ( rule__XEvent__UnorderedGroup_3__0 )? )
            // InternalXMachine.g:4496:2: ( rule__XEvent__UnorderedGroup_3__0 )?
            {
            // InternalXMachine.g:4496:2: ( rule__XEvent__UnorderedGroup_3__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( LA53_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 >= 14 && LA53_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalXMachine.g:4496:2: rule__XEvent__UnorderedGroup_3__0
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
    // InternalXMachine.g:4504:1: rule__XEvent__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) ) ) ;
    public final void rule__XEvent__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXMachine.g:4509:1: ( ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) ) ) )
            // InternalXMachine.g:4510:3: ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) ) )
            {
            // InternalXMachine.g:4510:3: ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( LA54_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                alt54=1;
            }
            else if ( LA54_0 >= 14 && LA54_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalXMachine.g:4511:3: ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) )
                    {
                    // InternalXMachine.g:4511:3: ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) )
                    // InternalXMachine.g:4512:4: {...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__XEvent__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalXMachine.g:4512:102: ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) )
                    // InternalXMachine.g:4513:5: ( ( rule__XEvent__ExtendedAssignment_3_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalXMachine.g:4519:5: ( ( rule__XEvent__ExtendedAssignment_3_0 ) )
                    // InternalXMachine.g:4520:6: ( rule__XEvent__ExtendedAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getExtendedAssignment_3_0()); 
                    }
                    // InternalXMachine.g:4521:6: ( rule__XEvent__ExtendedAssignment_3_0 )
                    // InternalXMachine.g:4521:7: rule__XEvent__ExtendedAssignment_3_0
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
                    // InternalXMachine.g:4526:3: ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) )
                    {
                    // InternalXMachine.g:4526:3: ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) )
                    // InternalXMachine.g:4527:4: {...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__XEvent__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalXMachine.g:4527:102: ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) )
                    // InternalXMachine.g:4528:5: ( ( rule__XEvent__ConvergenceAssignment_3_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalXMachine.g:4534:5: ( ( rule__XEvent__ConvergenceAssignment_3_1 ) )
                    // InternalXMachine.g:4535:6: ( rule__XEvent__ConvergenceAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getConvergenceAssignment_3_1()); 
                    }
                    // InternalXMachine.g:4536:6: ( rule__XEvent__ConvergenceAssignment_3_1 )
                    // InternalXMachine.g:4536:7: rule__XEvent__ConvergenceAssignment_3_1
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
    // InternalXMachine.g:4549:1: rule__XEvent__UnorderedGroup_3__0 : rule__XEvent__UnorderedGroup_3__Impl ( rule__XEvent__UnorderedGroup_3__1 )? ;
    public final void rule__XEvent__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4553:1: ( rule__XEvent__UnorderedGroup_3__Impl ( rule__XEvent__UnorderedGroup_3__1 )? )
            // InternalXMachine.g:4554:2: rule__XEvent__UnorderedGroup_3__Impl ( rule__XEvent__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_33);
            rule__XEvent__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:4555:2: ( rule__XEvent__UnorderedGroup_3__1 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( LA55_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                alt55=1;
            }
            else if ( LA55_0 >= 14 && LA55_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalXMachine.g:4555:2: rule__XEvent__UnorderedGroup_3__1
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
    // InternalXMachine.g:4561:1: rule__XEvent__UnorderedGroup_3__1 : rule__XEvent__UnorderedGroup_3__Impl ;
    public final void rule__XEvent__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4565:1: ( rule__XEvent__UnorderedGroup_3__Impl )
            // InternalXMachine.g:4566:2: rule__XEvent__UnorderedGroup_3__Impl
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
    // InternalXMachine.g:4573:1: rule__Machine__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4577:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4578:2: ( RULE_ID )
            {
            // InternalXMachine.g:4578:2: ( RULE_ID )
            // InternalXMachine.g:4579:3: RULE_ID
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
    // InternalXMachine.g:4588:1: rule__Machine__RefinesAssignment_3_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__RefinesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4592:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4593:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4593:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4594:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_3_0_1_0()); 
            }
            // InternalXMachine.g:4595:3: ( RULE_ID )
            // InternalXMachine.g:4596:4: RULE_ID
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
    // InternalXMachine.g:4607:1: rule__Machine__SeesAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__SeesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4611:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4612:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4612:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4613:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesContextCrossReference_3_1_1_0()); 
            }
            // InternalXMachine.g:4614:3: ( RULE_ID )
            // InternalXMachine.g:4615:4: RULE_ID
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
    // InternalXMachine.g:4626:1: rule__Machine__ExtensionsAssignment_3_2 : ( ruleMIncludes ) ;
    public final void rule__Machine__ExtensionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4630:1: ( ( ruleMIncludes ) )
            // InternalXMachine.g:4631:2: ( ruleMIncludes )
            {
            // InternalXMachine.g:4631:2: ( ruleMIncludes )
            // InternalXMachine.g:4632:3: ruleMIncludes
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
    // InternalXMachine.g:4641:1: rule__Machine__VariablesAssignment_4_1 : ( ruleXVariable ) ;
    public final void rule__Machine__VariablesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4645:1: ( ( ruleXVariable ) )
            // InternalXMachine.g:4646:2: ( ruleXVariable )
            {
            // InternalXMachine.g:4646:2: ( ruleXVariable )
            // InternalXMachine.g:4647:3: ruleXVariable
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
    // InternalXMachine.g:4656:1: rule__Machine__InvariantsAssignment_5_1 : ( ruleXInvariant ) ;
    public final void rule__Machine__InvariantsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4660:1: ( ( ruleXInvariant ) )
            // InternalXMachine.g:4661:2: ( ruleXInvariant )
            {
            // InternalXMachine.g:4661:2: ( ruleXInvariant )
            // InternalXMachine.g:4662:3: ruleXInvariant
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
    // InternalXMachine.g:4671:1: rule__Machine__VariantAssignment_6_1 : ( ruleXVariant ) ;
    public final void rule__Machine__VariantAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4675:1: ( ( ruleXVariant ) )
            // InternalXMachine.g:4676:2: ( ruleXVariant )
            {
            // InternalXMachine.g:4676:2: ( ruleXVariant )
            // InternalXMachine.g:4677:3: ruleXVariant
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
    // InternalXMachine.g:4686:1: rule__Machine__EventsAssignment_7_1 : ( ruleXEvent ) ;
    public final void rule__Machine__EventsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4690:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:4691:2: ( ruleXEvent )
            {
            // InternalXMachine.g:4691:2: ( ruleXEvent )
            // InternalXMachine.g:4692:3: ruleXEvent
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
    // InternalXMachine.g:4701:1: rule__Machine__EventsAssignment_7_2 : ( ruleXEvent ) ;
    public final void rule__Machine__EventsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4705:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:4706:2: ( ruleXEvent )
            {
            // InternalXMachine.g:4706:2: ( ruleXEvent )
            // InternalXMachine.g:4707:3: ruleXEvent
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
    // InternalXMachine.g:4716:1: rule__Machine__ExtensionsAssignment_8 : ( ruleXGroup ) ;
    public final void rule__Machine__ExtensionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4720:1: ( ( ruleXGroup ) )
            // InternalXMachine.g:4721:2: ( ruleXGroup )
            {
            // InternalXMachine.g:4721:2: ( ruleXGroup )
            // InternalXMachine.g:4722:3: ruleXGroup
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
    // InternalXMachine.g:4731:1: rule__MIncludes__AbstractMachineAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MIncludes__AbstractMachineAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4735:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:4736:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:4736:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:4737:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 
            }
            // InternalXMachine.g:4738:3: ( ruleQualifiedName )
            // InternalXMachine.g:4739:4: ruleQualifiedName
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
    // InternalXMachine.g:4750:1: rule__MIncludes__ConcreteMachineAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MIncludes__ConcreteMachineAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4754:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4755:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4755:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4756:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 
            }
            // InternalXMachine.g:4757:3: ( RULE_ID )
            // InternalXMachine.g:4758:4: RULE_ID
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
    // InternalXMachine.g:4769:1: rule__MIncludes__PrefixesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4773:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4774:2: ( RULE_ID )
            {
            // InternalXMachine.g:4774:2: ( RULE_ID )
            // InternalXMachine.g:4775:3: RULE_ID
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
    // InternalXMachine.g:4784:1: rule__MIncludes__PrefixesAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4788:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4789:2: ( RULE_ID )
            {
            // InternalXMachine.g:4789:2: ( RULE_ID )
            // InternalXMachine.g:4790:3: RULE_ID
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
    // InternalXMachine.g:4799:1: rule__XVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4803:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4804:2: ( RULE_ID )
            {
            // InternalXMachine.g:4804:2: ( RULE_ID )
            // InternalXMachine.g:4805:3: RULE_ID
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
    // InternalXMachine.g:4814:1: rule__XInvariant__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XInvariant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4818:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4819:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4819:2: ( RULE_XLABEL )
            // InternalXMachine.g:4820:3: RULE_XLABEL
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
    // InternalXMachine.g:4829:1: rule__XInvariant__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XInvariant__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4833:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:4834:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:4834:2: ( ruleXPredicate )
            // InternalXMachine.g:4835:3: ruleXPredicate
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
    // InternalXMachine.g:4844:1: rule__XInvariant__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XInvariant__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4848:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:4849:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:4849:2: ( ( 'theorem' ) )
            // InternalXMachine.g:4850:3: ( 'theorem' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            }
            // InternalXMachine.g:4851:3: ( 'theorem' )
            // InternalXMachine.g:4852:4: 'theorem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4863:1: rule__XVariant__ExpressionAssignment_1 : ( ruleXPredicate ) ;
    public final void rule__XVariant__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4867:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:4868:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:4868:2: ( ruleXPredicate )
            // InternalXMachine.g:4869:3: ruleXPredicate
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
    // InternalXMachine.g:4878:1: rule__XGroup__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4882:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4883:2: ( RULE_ID )
            {
            // InternalXMachine.g:4883:2: ( RULE_ID )
            // InternalXMachine.g:4884:3: RULE_ID
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
    // InternalXMachine.g:4893:1: rule__XGroup__FormalParametersAssignment_3_1 : ( ruleXFormalParameter ) ;
    public final void rule__XGroup__FormalParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4897:1: ( ( ruleXFormalParameter ) )
            // InternalXMachine.g:4898:2: ( ruleXFormalParameter )
            {
            // InternalXMachine.g:4898:2: ( ruleXFormalParameter )
            // InternalXMachine.g:4899:3: ruleXFormalParameter
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
    // InternalXMachine.g:4908:1: rule__XGroup__FormalParametersAssignment_3_2_1 : ( ruleXFormalParameter ) ;
    public final void rule__XGroup__FormalParametersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4912:1: ( ( ruleXFormalParameter ) )
            // InternalXMachine.g:4913:2: ( ruleXFormalParameter )
            {
            // InternalXMachine.g:4913:2: ( ruleXFormalParameter )
            // InternalXMachine.g:4914:3: ruleXFormalParameter
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
    // InternalXMachine.g:4923:1: rule__XGroup__EventsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__XGroup__EventsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4927:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4928:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4928:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4929:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventsEventCrossReference_4_1_0()); 
            }
            // InternalXMachine.g:4930:3: ( RULE_ID )
            // InternalXMachine.g:4931:4: RULE_ID
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
    // InternalXMachine.g:4942:1: rule__XGroup__EventsAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__XGroup__EventsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4946:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4947:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4947:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4948:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventsEventCrossReference_4_2_0()); 
            }
            // InternalXMachine.g:4949:3: ( RULE_ID )
            // InternalXMachine.g:4950:4: RULE_ID
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
    // InternalXMachine.g:4961:1: rule__XFormalParameter__DirectionAssignment_1 : ( ruleXDirection ) ;
    public final void rule__XFormalParameter__DirectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4965:1: ( ( ruleXDirection ) )
            // InternalXMachine.g:4966:2: ( ruleXDirection )
            {
            // InternalXMachine.g:4966:2: ( ruleXDirection )
            // InternalXMachine.g:4967:3: ruleXDirection
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
    // InternalXMachine.g:4976:1: rule__XFormalParameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XFormalParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4980:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4981:2: ( RULE_ID )
            {
            // InternalXMachine.g:4981:2: ( RULE_ID )
            // InternalXMachine.g:4982:3: RULE_ID
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
    // InternalXMachine.g:4991:1: rule__XEvent__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XEvent__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4995:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4996:2: ( RULE_ID )
            {
            // InternalXMachine.g:4996:2: ( RULE_ID )
            // InternalXMachine.g:4997:3: RULE_ID
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
    // InternalXMachine.g:5006:1: rule__XEvent__ExtendedAssignment_3_0 : ( ( 'extended' ) ) ;
    public final void rule__XEvent__ExtendedAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5010:1: ( ( ( 'extended' ) ) )
            // InternalXMachine.g:5011:2: ( ( 'extended' ) )
            {
            // InternalXMachine.g:5011:2: ( ( 'extended' ) )
            // InternalXMachine.g:5012:3: ( 'extended' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0_0()); 
            }
            // InternalXMachine.g:5013:3: ( 'extended' )
            // InternalXMachine.g:5014:4: 'extended'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:5025:1: rule__XEvent__ConvergenceAssignment_3_1 : ( ruleXConvergence ) ;
    public final void rule__XEvent__ConvergenceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5029:1: ( ( ruleXConvergence ) )
            // InternalXMachine.g:5030:2: ( ruleXConvergence )
            {
            // InternalXMachine.g:5030:2: ( ruleXConvergence )
            // InternalXMachine.g:5031:3: ruleXConvergence
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
    // InternalXMachine.g:5040:1: rule__XEvent__ExtensionsAssignment_4 : ( ruleXGroupOrEvent ) ;
    public final void rule__XEvent__ExtensionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5044:1: ( ( ruleXGroupOrEvent ) )
            // InternalXMachine.g:5045:2: ( ruleXGroupOrEvent )
            {
            // InternalXMachine.g:5045:2: ( ruleXGroupOrEvent )
            // InternalXMachine.g:5046:3: ruleXGroupOrEvent
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
    // InternalXMachine.g:5055:1: rule__XEvent__RefinesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5059:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5060:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5060:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5061:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_1_0()); 
            }
            // InternalXMachine.g:5062:3: ( RULE_ID )
            // InternalXMachine.g:5063:4: RULE_ID
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
    // InternalXMachine.g:5074:1: rule__XEvent__WitnessesAssignment_6_0_0_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_6_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5078:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:5079:2: ( ruleXWitness )
            {
            // InternalXMachine.g:5079:2: ( ruleXWitness )
            // InternalXMachine.g:5080:3: ruleXWitness
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
    // InternalXMachine.g:5089:1: rule__XEvent__ActionsAssignment_6_0_2 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_6_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5093:1: ( ( ruleXAction ) )
            // InternalXMachine.g:5094:2: ( ruleXAction )
            {
            // InternalXMachine.g:5094:2: ( ruleXAction )
            // InternalXMachine.g:5095:3: ruleXAction
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
    // InternalXMachine.g:5104:1: rule__XEvent__GuardsAssignment_6_1_1 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5108:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:5109:2: ( ruleXGuard )
            {
            // InternalXMachine.g:5109:2: ( ruleXGuard )
            // InternalXMachine.g:5110:3: ruleXGuard
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
    // InternalXMachine.g:5119:1: rule__XEvent__WitnessesAssignment_6_1_2_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_6_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5123:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:5124:2: ( ruleXWitness )
            {
            // InternalXMachine.g:5124:2: ( ruleXWitness )
            // InternalXMachine.g:5125:3: ruleXWitness
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
    // InternalXMachine.g:5134:1: rule__XEvent__ActionsAssignment_6_1_3_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_6_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5138:1: ( ( ruleXAction ) )
            // InternalXMachine.g:5139:2: ( ruleXAction )
            {
            // InternalXMachine.g:5139:2: ( ruleXAction )
            // InternalXMachine.g:5140:3: ruleXAction
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
    // InternalXMachine.g:5149:1: rule__XEvent__ParametersAssignment_6_2_1 : ( ruleXParameter ) ;
    public final void rule__XEvent__ParametersAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5153:1: ( ( ruleXParameter ) )
            // InternalXMachine.g:5154:2: ( ruleXParameter )
            {
            // InternalXMachine.g:5154:2: ( ruleXParameter )
            // InternalXMachine.g:5155:3: ruleXParameter
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
    // InternalXMachine.g:5164:1: rule__XEvent__GuardsAssignment_6_2_3 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_6_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5168:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:5169:2: ( ruleXGuard )
            {
            // InternalXMachine.g:5169:2: ( ruleXGuard )
            // InternalXMachine.g:5170:3: ruleXGuard
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
    // InternalXMachine.g:5179:1: rule__XEvent__WitnessesAssignment_6_2_4_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_6_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5183:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:5184:2: ( ruleXWitness )
            {
            // InternalXMachine.g:5184:2: ( ruleXWitness )
            // InternalXMachine.g:5185:3: ruleXWitness
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
    // InternalXMachine.g:5194:1: rule__XEvent__ActionsAssignment_6_2_5_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_6_2_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5198:1: ( ( ruleXAction ) )
            // InternalXMachine.g:5199:2: ( ruleXAction )
            {
            // InternalXMachine.g:5199:2: ( ruleXAction )
            // InternalXMachine.g:5200:3: ruleXAction
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
    // InternalXMachine.g:5209:1: rule__EventSync__PrefixAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__EventSync__PrefixAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5213:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5214:2: ( RULE_ID )
            {
            // InternalXMachine.g:5214:2: ( RULE_ID )
            // InternalXMachine.g:5215:3: RULE_ID
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
    // InternalXMachine.g:5224:1: rule__EventSync__SynchronisedEventAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__EventSync__SynchronisedEventAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5228:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5229:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5229:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5230:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0()); 
            }
            // InternalXMachine.g:5231:3: ( RULE_ID )
            // InternalXMachine.g:5232:4: RULE_ID
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
    // InternalXMachine.g:5243:1: rule__GroupSync__PrefixAssignment_1_2_0 : ( RULE_ID ) ;
    public final void rule__GroupSync__PrefixAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5247:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5248:2: ( RULE_ID )
            {
            // InternalXMachine.g:5248:2: ( RULE_ID )
            // InternalXMachine.g:5249:3: RULE_ID
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
    // InternalXMachine.g:5258:1: rule__GroupSync__SynchronisedCasesAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__GroupSync__SynchronisedCasesAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5262:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5263:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5263:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5264:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesCrossReference_1_3_0()); 
            }
            // InternalXMachine.g:5265:3: ( RULE_ID )
            // InternalXMachine.g:5266:4: RULE_ID
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
    // InternalXMachine.g:5277:1: rule__GroupSync__ActualParametersAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__GroupSync__ActualParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5281:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5282:2: ( RULE_ID )
            {
            // InternalXMachine.g:5282:2: ( RULE_ID )
            // InternalXMachine.g:5283:3: RULE_ID
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
    // InternalXMachine.g:5292:1: rule__GroupSync__ActualParametersAssignment_2_2_1 : ( RULE_ID ) ;
    public final void rule__GroupSync__ActualParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5296:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5297:2: ( RULE_ID )
            {
            // InternalXMachine.g:5297:2: ( RULE_ID )
            // InternalXMachine.g:5298:3: RULE_ID
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
    // InternalXMachine.g:5307:1: rule__XParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5311:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5312:2: ( RULE_ID )
            {
            // InternalXMachine.g:5312:2: ( RULE_ID )
            // InternalXMachine.g:5313:3: RULE_ID
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
    // InternalXMachine.g:5322:1: rule__XGuard__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XGuard__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5326:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5327:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5327:2: ( RULE_XLABEL )
            // InternalXMachine.g:5328:3: RULE_XLABEL
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
    // InternalXMachine.g:5337:1: rule__XGuard__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XGuard__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5341:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:5342:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:5342:2: ( ruleXPredicate )
            // InternalXMachine.g:5343:3: ruleXPredicate
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
    // InternalXMachine.g:5352:1: rule__XGuard__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XGuard__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5356:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:5357:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:5357:2: ( ( 'theorem' ) )
            // InternalXMachine.g:5358:3: ( 'theorem' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 
            }
            // InternalXMachine.g:5359:3: ( 'theorem' )
            // InternalXMachine.g:5360:4: 'theorem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:5371:1: rule__XWitness__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XWitness__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5375:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5376:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5376:2: ( RULE_XLABEL )
            // InternalXMachine.g:5377:3: RULE_XLABEL
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
    // InternalXMachine.g:5386:1: rule__XWitness__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XWitness__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5390:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:5391:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:5391:2: ( ruleXPredicate )
            // InternalXMachine.g:5392:3: ruleXPredicate
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
    // InternalXMachine.g:5401:1: rule__XAction__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5405:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5406:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5406:2: ( RULE_XLABEL )
            // InternalXMachine.g:5407:3: RULE_XLABEL
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
    // InternalXMachine.g:5416:1: rule__XAction__ActionAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XAction__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5420:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:5421:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:5421:2: ( ruleXPredicate )
            // InternalXMachine.g:5422:3: ruleXPredicate
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
        // InternalXMachine.g:4440:8: ( rule__Machine__ExtensionsAssignment_3_2 )
        // InternalXMachine.g:4440:9: rule__Machine__ExtensionsAssignment_3_2
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
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000240040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000010000001C000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000015A000C0000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002180002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000010000001C002L});

}
