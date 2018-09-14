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

@SuppressWarnings("all")
public class InternalXMachineParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_XLABEL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'in'", "'out'", "'ordinary'", "'convergent'", "'anticipated'", "'machine'", "'end'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variant'", "'events'", "'includes'", "'to'", "'as'", "'.'", "'group'", "'begin'", "'('", "')'", "','", "'event'", "'with'", "'when'", "'then'", "'any'", "'where'", "'synchronises'", "'synchronisesGroup'", "'theorem'", "'extended'"
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
             before(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleMachine();

            state._fsp--;

             after(grammarAccess.getMachineRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getMachineAccess().getGroup()); 
            // InternalXMachine.g:69:3: ( rule__Machine__Group__0 )
            // InternalXMachine.g:69:4: rule__Machine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getGroup()); 

            }


            }

        }
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
             before(grammarAccess.getMIncludesRule()); 
            pushFollow(FOLLOW_1);
            ruleMIncludes();

            state._fsp--;

             after(grammarAccess.getMIncludesRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getMIncludesAccess().getGroup()); 
            // InternalXMachine.g:94:3: ( rule__MIncludes__Group__0 )
            // InternalXMachine.g:94:4: rule__MIncludes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMIncludesAccess().getGroup()); 

            }


            }

        }
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
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalXMachine.g:119:3: ( rule__QualifiedName__Group__0 )
            // InternalXMachine.g:119:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
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
             before(grammarAccess.getXVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleXVariable();

            state._fsp--;

             after(grammarAccess.getXVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getXVariableAccess().getGroup()); 
            // InternalXMachine.g:144:3: ( rule__XVariable__Group__0 )
            // InternalXMachine.g:144:4: rule__XVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXVariableAccess().getGroup()); 

            }


            }

        }
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
             before(grammarAccess.getXInvariantRule()); 
            pushFollow(FOLLOW_1);
            ruleXInvariant();

            state._fsp--;

             after(grammarAccess.getXInvariantRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getXInvariantAccess().getGroup()); 
            // InternalXMachine.g:169:3: ( rule__XInvariant__Group__0 )
            // InternalXMachine.g:169:4: rule__XInvariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantAccess().getGroup()); 

            }


            }

        }
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
             before(grammarAccess.getXVariantRule()); 
            pushFollow(FOLLOW_1);
            ruleXVariant();

            state._fsp--;

             after(grammarAccess.getXVariantRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getXVariantAccess().getGroup()); 
            // InternalXMachine.g:194:3: ( rule__XVariant__Group__0 )
            // InternalXMachine.g:194:4: rule__XVariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXVariantAccess().getGroup()); 

            }


            }

        }
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
             before(grammarAccess.getXGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleXGroup();

            state._fsp--;

             after(grammarAccess.getXGroupRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getXGroupAccess().getGroup()); 
            // InternalXMachine.g:219:3: ( rule__XGroup__Group__0 )
            // InternalXMachine.g:219:4: rule__XGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXGroupAccess().getGroup()); 

            }


            }

        }
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
             before(grammarAccess.getXFormalParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleXFormalParameter();

            state._fsp--;

             after(grammarAccess.getXFormalParameterRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getXFormalParameterAccess().getGroup()); 
            // InternalXMachine.g:244:3: ( rule__XFormalParameter__Group__0 )
            // InternalXMachine.g:244:4: rule__XFormalParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XFormalParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXFormalParameterAccess().getGroup()); 

            }


            }

        }
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
             before(grammarAccess.getXEventRule()); 
            pushFollow(FOLLOW_1);
            ruleXEvent();

            state._fsp--;

             after(grammarAccess.getXEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getXEventAccess().getGroup()); 
            // InternalXMachine.g:269:3: ( rule__XEvent__Group__0 )
            // InternalXMachine.g:269:4: rule__XEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getGroup()); 

            }


            }

        }
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
             before(grammarAccess.getEventSyncRule()); 
            pushFollow(FOLLOW_1);
            ruleEventSync();

            state._fsp--;

             after(grammarAccess.getEventSyncRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getEventSyncAccess().getGroup()); 
            // InternalXMachine.g:294:3: ( rule__EventSync__Group__0 )
            // InternalXMachine.g:294:4: rule__EventSync__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventSyncAccess().getGroup()); 

            }


            }

        }
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
             before(grammarAccess.getGroupSyncRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupSync();

            state._fsp--;

             after(grammarAccess.getGroupSyncRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getGroupSyncAccess().getGroup()); 
            // InternalXMachine.g:319:3: ( rule__GroupSync__Group__0 )
            // InternalXMachine.g:319:4: rule__GroupSync__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupSyncAccess().getGroup()); 

            }


            }

        }
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
             before(grammarAccess.getXGroupOrEventRule()); 
            pushFollow(FOLLOW_1);
            ruleXGroupOrEvent();

            state._fsp--;

             after(grammarAccess.getXGroupOrEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getXGroupOrEventAccess().getAlternatives()); 
            // InternalXMachine.g:344:3: ( rule__XGroupOrEvent__Alternatives )
            // InternalXMachine.g:344:4: rule__XGroupOrEvent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XGroupOrEvent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXGroupOrEventAccess().getAlternatives()); 

            }


            }

        }
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
             before(grammarAccess.getXParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleXParameter();

            state._fsp--;

             after(grammarAccess.getXParameterRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getXParameterAccess().getGroup()); 
            // InternalXMachine.g:369:3: ( rule__XParameter__Group__0 )
            // InternalXMachine.g:369:4: rule__XParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXParameterAccess().getGroup()); 

            }


            }

        }
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
             before(grammarAccess.getXGuardRule()); 
            pushFollow(FOLLOW_1);
            ruleXGuard();

            state._fsp--;

             after(grammarAccess.getXGuardRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getXGuardAccess().getGroup()); 
            // InternalXMachine.g:394:3: ( rule__XGuard__Group__0 )
            // InternalXMachine.g:394:4: rule__XGuard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXGuardAccess().getGroup()); 

            }


            }

        }
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
             before(grammarAccess.getXWitnessRule()); 
            pushFollow(FOLLOW_1);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXWitnessRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getXWitnessAccess().getGroup()); 
            // InternalXMachine.g:419:3: ( rule__XWitness__Group__0 )
            // InternalXMachine.g:419:4: rule__XWitness__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessAccess().getGroup()); 

            }


            }

        }
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
             before(grammarAccess.getXActionRule()); 
            pushFollow(FOLLOW_1);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getXActionAccess().getGroup()); 
            // InternalXMachine.g:444:3: ( rule__XAction__Group__0 )
            // InternalXMachine.g:444:4: rule__XAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXActionAccess().getGroup()); 

            }


            }

        }
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
             before(grammarAccess.getXPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getXPredicateAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXPredicateAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
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
             before(grammarAccess.getXDirectionAccess().getAlternatives()); 
            // InternalXMachine.g:485:3: ( rule__XDirection__Alternatives )
            // InternalXMachine.g:485:4: rule__XDirection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XDirection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXDirectionAccess().getAlternatives()); 

            }


            }

        }
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
             before(grammarAccess.getXConvergenceAccess().getAlternatives()); 
            // InternalXMachine.g:501:3: ( rule__XConvergence__Alternatives )
            // InternalXMachine.g:501:4: rule__XConvergence__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XConvergence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXConvergenceAccess().getAlternatives()); 

            }


            }

        }
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
            case 30:
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
                     before(grammarAccess.getXEventAccess().getGroup_6_0()); 
                    // InternalXMachine.g:516:3: ( rule__XEvent__Group_6_0__0 )
                    // InternalXMachine.g:516:4: rule__XEvent__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:520:2: ( ( rule__XEvent__Group_6_1__0 ) )
                    {
                    // InternalXMachine.g:520:2: ( ( rule__XEvent__Group_6_1__0 ) )
                    // InternalXMachine.g:521:3: ( rule__XEvent__Group_6_1__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_6_1()); 
                    // InternalXMachine.g:522:3: ( rule__XEvent__Group_6_1__0 )
                    // InternalXMachine.g:522:4: rule__XEvent__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getGroup_6_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:526:2: ( ( rule__XEvent__Group_6_2__0 ) )
                    {
                    // InternalXMachine.g:526:2: ( ( rule__XEvent__Group_6_2__0 ) )
                    // InternalXMachine.g:527:3: ( rule__XEvent__Group_6_2__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_6_2()); 
                    // InternalXMachine.g:528:3: ( rule__XEvent__Group_6_2__0 )
                    // InternalXMachine.g:528:4: rule__XEvent__Group_6_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getGroup_6_2()); 

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

            if ( (LA2_0==41) ) {
                alt2=1;
            }
            else if ( (LA2_0==40) ) {
                alt2=2;
            }
            else {
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
                     before(grammarAccess.getXGroupOrEventAccess().getGroupSyncParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGroupSync();

                    state._fsp--;

                     after(grammarAccess.getXGroupOrEventAccess().getGroupSyncParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:547:2: ( ruleEventSync )
                    {
                    // InternalXMachine.g:547:2: ( ruleEventSync )
                    // InternalXMachine.g:548:3: ruleEventSync
                    {
                     before(grammarAccess.getXGroupOrEventAccess().getEventSyncParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEventSync();

                    state._fsp--;

                     after(grammarAccess.getXGroupOrEventAccess().getEventSyncParserRuleCall_1()); 

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
                     before(grammarAccess.getXDirectionAccess().getInEnumLiteralDeclaration_0()); 
                    // InternalXMachine.g:564:3: ( 'in' )
                    // InternalXMachine.g:564:4: 'in'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getXDirectionAccess().getInEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:568:2: ( ( 'out' ) )
                    {
                    // InternalXMachine.g:568:2: ( ( 'out' ) )
                    // InternalXMachine.g:569:3: ( 'out' )
                    {
                     before(grammarAccess.getXDirectionAccess().getOutEnumLiteralDeclaration_1()); 
                    // InternalXMachine.g:570:3: ( 'out' )
                    // InternalXMachine.g:570:4: 'out'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getXDirectionAccess().getOutEnumLiteralDeclaration_1()); 

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
                     before(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    // InternalXMachine.g:585:3: ( 'ordinary' )
                    // InternalXMachine.g:585:4: 'ordinary'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:589:2: ( ( 'convergent' ) )
                    {
                    // InternalXMachine.g:589:2: ( ( 'convergent' ) )
                    // InternalXMachine.g:590:3: ( 'convergent' )
                    {
                     before(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    // InternalXMachine.g:591:3: ( 'convergent' )
                    // InternalXMachine.g:591:4: 'convergent'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:595:2: ( ( 'anticipated' ) )
                    {
                    // InternalXMachine.g:595:2: ( ( 'anticipated' ) )
                    // InternalXMachine.g:596:3: ( 'anticipated' )
                    {
                     before(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    // InternalXMachine.g:597:3: ( 'anticipated' )
                    // InternalXMachine.g:597:4: 'anticipated'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 

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

            pushFollow(FOLLOW_2);
            rule__Machine__Group__1();

            state._fsp--;


            }

        }
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
             before(grammarAccess.getMachineAccess().getMachineAction_0()); 
            // InternalXMachine.g:624:2: ()
            // InternalXMachine.g:624:3: 
            {
            }

             after(grammarAccess.getMachineAccess().getMachineAction_0()); 

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

            pushFollow(FOLLOW_2);
            rule__Machine__Group__2();

            state._fsp--;


            }

        }
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
             before(grammarAccess.getMachineAccess().getMachineKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getMachineKeyword_1()); 

            }


            }

        }
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

            pushFollow(FOLLOW_2);
            rule__Machine__Group__3();

            state._fsp--;


            }

        }
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
             before(grammarAccess.getMachineAccess().getNameAssignment_2()); 
            // InternalXMachine.g:678:2: ( rule__Machine__NameAssignment_2 )
            // InternalXMachine.g:678:3: rule__Machine__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Machine__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getNameAssignment_2()); 

            }


            }

        }
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
            pushFollow(FOLLOW_5);
            rule__Machine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__4();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:698:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__Group_3__0 )? ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:702:1: ( ( ( rule__Machine__Group_3__0 )? ) )
            // InternalXMachine.g:703:1: ( ( rule__Machine__Group_3__0 )? )
            {
            // InternalXMachine.g:703:1: ( ( rule__Machine__Group_3__0 )? )
            // InternalXMachine.g:704:2: ( rule__Machine__Group_3__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_3()); 
            // InternalXMachine.g:705:2: ( rule__Machine__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXMachine.g:705:3: rule__Machine__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_3()); 

            }


            }

        }
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
            pushFollow(FOLLOW_5);
            rule__Machine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__5();

            state._fsp--;


            }

        }
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
             before(grammarAccess.getMachineAccess().getGroup_4()); 
            // InternalXMachine.g:732:2: ( rule__Machine__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:732:3: rule__Machine__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_4()); 

            }


            }

        }
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
            pushFollow(FOLLOW_5);
            rule__Machine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__6();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:752:1: rule__Machine__Group__5__Impl : ( ( rule__Machine__ExtensionsAssignment_5 )* ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:756:1: ( ( ( rule__Machine__ExtensionsAssignment_5 )* ) )
            // InternalXMachine.g:757:1: ( ( rule__Machine__ExtensionsAssignment_5 )* )
            {
            // InternalXMachine.g:757:1: ( ( rule__Machine__ExtensionsAssignment_5 )* )
            // InternalXMachine.g:758:2: ( rule__Machine__ExtensionsAssignment_5 )*
            {
             before(grammarAccess.getMachineAccess().getExtensionsAssignment_5()); 
            // InternalXMachine.g:759:2: ( rule__Machine__ExtensionsAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXMachine.g:759:3: rule__Machine__ExtensionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Machine__ExtensionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getExtensionsAssignment_5()); 

            }


            }

        }
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
            pushFollow(FOLLOW_5);
            rule__Machine__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__7();

            state._fsp--;


            }

        }
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
             before(grammarAccess.getMachineAccess().getGroup_6()); 
            // InternalXMachine.g:786:2: ( rule__Machine__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:786:3: rule__Machine__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_6()); 

            }


            }

        }
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
            pushFollow(FOLLOW_5);
            rule__Machine__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__8();

            state._fsp--;


            }

        }
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
             before(grammarAccess.getMachineAccess().getGroup_7()); 
            // InternalXMachine.g:813:2: ( rule__Machine__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXMachine.g:813:3: rule__Machine__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_7()); 

            }


            }

        }
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
            pushFollow(FOLLOW_5);
            rule__Machine__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__9();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:833:1: rule__Machine__Group__8__Impl : ( ( rule__Machine__Group_8__0 )? ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:837:1: ( ( ( rule__Machine__Group_8__0 )? ) )
            // InternalXMachine.g:838:1: ( ( rule__Machine__Group_8__0 )? )
            {
            // InternalXMachine.g:838:1: ( ( rule__Machine__Group_8__0 )? )
            // InternalXMachine.g:839:2: ( rule__Machine__Group_8__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_8()); 
            // InternalXMachine.g:840:2: ( rule__Machine__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXMachine.g:840:3: rule__Machine__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_8()); 

            }


            }

        }
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
    // InternalXMachine.g:848:1: rule__Machine__Group__9 : rule__Machine__Group__9__Impl rule__Machine__Group__10 ;
    public final void rule__Machine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:852:1: ( rule__Machine__Group__9__Impl rule__Machine__Group__10 )
            // InternalXMachine.g:853:2: rule__Machine__Group__9__Impl rule__Machine__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__10();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:860:1: rule__Machine__Group__9__Impl : ( ( rule__Machine__Group_9__0 )? ) ;
    public final void rule__Machine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:864:1: ( ( ( rule__Machine__Group_9__0 )? ) )
            // InternalXMachine.g:865:1: ( ( rule__Machine__Group_9__0 )? )
            {
            // InternalXMachine.g:865:1: ( ( rule__Machine__Group_9__0 )? )
            // InternalXMachine.g:866:2: ( rule__Machine__Group_9__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_9()); 
            // InternalXMachine.g:867:2: ( rule__Machine__Group_9__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:867:3: rule__Machine__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__Machine__Group__10"
    // InternalXMachine.g:875:1: rule__Machine__Group__10 : rule__Machine__Group__10__Impl rule__Machine__Group__11 ;
    public final void rule__Machine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:879:1: ( rule__Machine__Group__10__Impl rule__Machine__Group__11 )
            // InternalXMachine.g:880:2: rule__Machine__Group__10__Impl rule__Machine__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__10"


    // $ANTLR start "rule__Machine__Group__10__Impl"
    // InternalXMachine.g:887:1: rule__Machine__Group__10__Impl : ( ( rule__Machine__ExtensionsAssignment_10 )* ) ;
    public final void rule__Machine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:891:1: ( ( ( rule__Machine__ExtensionsAssignment_10 )* ) )
            // InternalXMachine.g:892:1: ( ( rule__Machine__ExtensionsAssignment_10 )* )
            {
            // InternalXMachine.g:892:1: ( ( rule__Machine__ExtensionsAssignment_10 )* )
            // InternalXMachine.g:893:2: ( rule__Machine__ExtensionsAssignment_10 )*
            {
             before(grammarAccess.getMachineAccess().getExtensionsAssignment_10()); 
            // InternalXMachine.g:894:2: ( rule__Machine__ExtensionsAssignment_10 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXMachine.g:894:3: rule__Machine__ExtensionsAssignment_10
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Machine__ExtensionsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getExtensionsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__10__Impl"


    // $ANTLR start "rule__Machine__Group__11"
    // InternalXMachine.g:902:1: rule__Machine__Group__11 : rule__Machine__Group__11__Impl ;
    public final void rule__Machine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:906:1: ( rule__Machine__Group__11__Impl )
            // InternalXMachine.g:907:2: rule__Machine__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__11"


    // $ANTLR start "rule__Machine__Group__11__Impl"
    // InternalXMachine.g:913:1: rule__Machine__Group__11__Impl : ( 'end' ) ;
    public final void rule__Machine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:917:1: ( ( 'end' ) )
            // InternalXMachine.g:918:1: ( 'end' )
            {
            // InternalXMachine.g:918:1: ( 'end' )
            // InternalXMachine.g:919:2: 'end'
            {
             before(grammarAccess.getMachineAccess().getEndKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getEndKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__11__Impl"


    // $ANTLR start "rule__Machine__Group_3__0"
    // InternalXMachine.g:929:1: rule__Machine__Group_3__0 : rule__Machine__Group_3__0__Impl rule__Machine__Group_3__1 ;
    public final void rule__Machine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:933:1: ( rule__Machine__Group_3__0__Impl rule__Machine__Group_3__1 )
            // InternalXMachine.g:934:2: rule__Machine__Group_3__0__Impl rule__Machine__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_3__0"


    // $ANTLR start "rule__Machine__Group_3__0__Impl"
    // InternalXMachine.g:941:1: rule__Machine__Group_3__0__Impl : ( 'refines' ) ;
    public final void rule__Machine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:945:1: ( ( 'refines' ) )
            // InternalXMachine.g:946:1: ( 'refines' )
            {
            // InternalXMachine.g:946:1: ( 'refines' )
            // InternalXMachine.g:947:2: 'refines'
            {
             before(grammarAccess.getMachineAccess().getRefinesKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getRefinesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_3__0__Impl"


    // $ANTLR start "rule__Machine__Group_3__1"
    // InternalXMachine.g:956:1: rule__Machine__Group_3__1 : rule__Machine__Group_3__1__Impl ;
    public final void rule__Machine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:960:1: ( rule__Machine__Group_3__1__Impl )
            // InternalXMachine.g:961:2: rule__Machine__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_3__1"


    // $ANTLR start "rule__Machine__Group_3__1__Impl"
    // InternalXMachine.g:967:1: rule__Machine__Group_3__1__Impl : ( ( rule__Machine__RefinesAssignment_3_1 ) ) ;
    public final void rule__Machine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:971:1: ( ( ( rule__Machine__RefinesAssignment_3_1 ) ) )
            // InternalXMachine.g:972:1: ( ( rule__Machine__RefinesAssignment_3_1 ) )
            {
            // InternalXMachine.g:972:1: ( ( rule__Machine__RefinesAssignment_3_1 ) )
            // InternalXMachine.g:973:2: ( rule__Machine__RefinesAssignment_3_1 )
            {
             before(grammarAccess.getMachineAccess().getRefinesAssignment_3_1()); 
            // InternalXMachine.g:974:2: ( rule__Machine__RefinesAssignment_3_1 )
            // InternalXMachine.g:974:3: rule__Machine__RefinesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__RefinesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getRefinesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_3__1__Impl"


    // $ANTLR start "rule__Machine__Group_4__0"
    // InternalXMachine.g:983:1: rule__Machine__Group_4__0 : rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1 ;
    public final void rule__Machine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:987:1: ( rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1 )
            // InternalXMachine.g:988:2: rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_4__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:995:1: rule__Machine__Group_4__0__Impl : ( 'sees' ) ;
    public final void rule__Machine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:999:1: ( ( 'sees' ) )
            // InternalXMachine.g:1000:1: ( 'sees' )
            {
            // InternalXMachine.g:1000:1: ( 'sees' )
            // InternalXMachine.g:1001:2: 'sees'
            {
             before(grammarAccess.getMachineAccess().getSeesKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getSeesKeyword_4_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1010:1: rule__Machine__Group_4__1 : rule__Machine__Group_4__1__Impl ;
    public final void rule__Machine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1014:1: ( rule__Machine__Group_4__1__Impl )
            // InternalXMachine.g:1015:2: rule__Machine__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1021:1: rule__Machine__Group_4__1__Impl : ( ( ( rule__Machine__SeesAssignment_4_1 ) ) ( ( rule__Machine__SeesAssignment_4_1 )* ) ) ;
    public final void rule__Machine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1025:1: ( ( ( ( rule__Machine__SeesAssignment_4_1 ) ) ( ( rule__Machine__SeesAssignment_4_1 )* ) ) )
            // InternalXMachine.g:1026:1: ( ( ( rule__Machine__SeesAssignment_4_1 ) ) ( ( rule__Machine__SeesAssignment_4_1 )* ) )
            {
            // InternalXMachine.g:1026:1: ( ( ( rule__Machine__SeesAssignment_4_1 ) ) ( ( rule__Machine__SeesAssignment_4_1 )* ) )
            // InternalXMachine.g:1027:2: ( ( rule__Machine__SeesAssignment_4_1 ) ) ( ( rule__Machine__SeesAssignment_4_1 )* )
            {
            // InternalXMachine.g:1027:2: ( ( rule__Machine__SeesAssignment_4_1 ) )
            // InternalXMachine.g:1028:3: ( rule__Machine__SeesAssignment_4_1 )
            {
             before(grammarAccess.getMachineAccess().getSeesAssignment_4_1()); 
            // InternalXMachine.g:1029:3: ( rule__Machine__SeesAssignment_4_1 )
            // InternalXMachine.g:1029:4: rule__Machine__SeesAssignment_4_1
            {
            pushFollow(FOLLOW_8);
            rule__Machine__SeesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getSeesAssignment_4_1()); 

            }

            // InternalXMachine.g:1032:2: ( ( rule__Machine__SeesAssignment_4_1 )* )
            // InternalXMachine.g:1033:3: ( rule__Machine__SeesAssignment_4_1 )*
            {
             before(grammarAccess.getMachineAccess().getSeesAssignment_4_1()); 
            // InternalXMachine.g:1034:3: ( rule__Machine__SeesAssignment_4_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXMachine.g:1034:4: rule__Machine__SeesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__SeesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getSeesAssignment_4_1()); 

            }


            }


            }

        }
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


    // $ANTLR start "rule__Machine__Group_6__0"
    // InternalXMachine.g:1044:1: rule__Machine__Group_6__0 : rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 ;
    public final void rule__Machine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1048:1: ( rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 )
            // InternalXMachine.g:1049:2: rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_6__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1056:1: rule__Machine__Group_6__0__Impl : ( 'variables' ) ;
    public final void rule__Machine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1060:1: ( ( 'variables' ) )
            // InternalXMachine.g:1061:1: ( 'variables' )
            {
            // InternalXMachine.g:1061:1: ( 'variables' )
            // InternalXMachine.g:1062:2: 'variables'
            {
             before(grammarAccess.getMachineAccess().getVariablesKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getVariablesKeyword_6_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1071:1: rule__Machine__Group_6__1 : rule__Machine__Group_6__1__Impl ;
    public final void rule__Machine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1075:1: ( rule__Machine__Group_6__1__Impl )
            // InternalXMachine.g:1076:2: rule__Machine__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1082:1: rule__Machine__Group_6__1__Impl : ( ( ( rule__Machine__VariablesAssignment_6_1 ) ) ( ( rule__Machine__VariablesAssignment_6_1 )* ) ) ;
    public final void rule__Machine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1086:1: ( ( ( ( rule__Machine__VariablesAssignment_6_1 ) ) ( ( rule__Machine__VariablesAssignment_6_1 )* ) ) )
            // InternalXMachine.g:1087:1: ( ( ( rule__Machine__VariablesAssignment_6_1 ) ) ( ( rule__Machine__VariablesAssignment_6_1 )* ) )
            {
            // InternalXMachine.g:1087:1: ( ( ( rule__Machine__VariablesAssignment_6_1 ) ) ( ( rule__Machine__VariablesAssignment_6_1 )* ) )
            // InternalXMachine.g:1088:2: ( ( rule__Machine__VariablesAssignment_6_1 ) ) ( ( rule__Machine__VariablesAssignment_6_1 )* )
            {
            // InternalXMachine.g:1088:2: ( ( rule__Machine__VariablesAssignment_6_1 ) )
            // InternalXMachine.g:1089:3: ( rule__Machine__VariablesAssignment_6_1 )
            {
             before(grammarAccess.getMachineAccess().getVariablesAssignment_6_1()); 
            // InternalXMachine.g:1090:3: ( rule__Machine__VariablesAssignment_6_1 )
            // InternalXMachine.g:1090:4: rule__Machine__VariablesAssignment_6_1
            {
            pushFollow(FOLLOW_8);
            rule__Machine__VariablesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getVariablesAssignment_6_1()); 

            }

            // InternalXMachine.g:1093:2: ( ( rule__Machine__VariablesAssignment_6_1 )* )
            // InternalXMachine.g:1094:3: ( rule__Machine__VariablesAssignment_6_1 )*
            {
             before(grammarAccess.getMachineAccess().getVariablesAssignment_6_1()); 
            // InternalXMachine.g:1095:3: ( rule__Machine__VariablesAssignment_6_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXMachine.g:1095:4: rule__Machine__VariablesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__VariablesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getVariablesAssignment_6_1()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:1105:1: rule__Machine__Group_7__0 : rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 ;
    public final void rule__Machine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1109:1: ( rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 )
            // InternalXMachine.g:1110:2: rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Machine__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_7__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1117:1: rule__Machine__Group_7__0__Impl : ( 'invariants' ) ;
    public final void rule__Machine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1121:1: ( ( 'invariants' ) )
            // InternalXMachine.g:1122:1: ( 'invariants' )
            {
            // InternalXMachine.g:1122:1: ( 'invariants' )
            // InternalXMachine.g:1123:2: 'invariants'
            {
             before(grammarAccess.getMachineAccess().getInvariantsKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getInvariantsKeyword_7_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1132:1: rule__Machine__Group_7__1 : rule__Machine__Group_7__1__Impl ;
    public final void rule__Machine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1136:1: ( rule__Machine__Group_7__1__Impl )
            // InternalXMachine.g:1137:2: rule__Machine__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_7__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1143:1: rule__Machine__Group_7__1__Impl : ( ( ( rule__Machine__InvariantsAssignment_7_1 ) ) ( ( rule__Machine__InvariantsAssignment_7_1 )* ) ) ;
    public final void rule__Machine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1147:1: ( ( ( ( rule__Machine__InvariantsAssignment_7_1 ) ) ( ( rule__Machine__InvariantsAssignment_7_1 )* ) ) )
            // InternalXMachine.g:1148:1: ( ( ( rule__Machine__InvariantsAssignment_7_1 ) ) ( ( rule__Machine__InvariantsAssignment_7_1 )* ) )
            {
            // InternalXMachine.g:1148:1: ( ( ( rule__Machine__InvariantsAssignment_7_1 ) ) ( ( rule__Machine__InvariantsAssignment_7_1 )* ) )
            // InternalXMachine.g:1149:2: ( ( rule__Machine__InvariantsAssignment_7_1 ) ) ( ( rule__Machine__InvariantsAssignment_7_1 )* )
            {
            // InternalXMachine.g:1149:2: ( ( rule__Machine__InvariantsAssignment_7_1 ) )
            // InternalXMachine.g:1150:3: ( rule__Machine__InvariantsAssignment_7_1 )
            {
             before(grammarAccess.getMachineAccess().getInvariantsAssignment_7_1()); 
            // InternalXMachine.g:1151:3: ( rule__Machine__InvariantsAssignment_7_1 )
            // InternalXMachine.g:1151:4: rule__Machine__InvariantsAssignment_7_1
            {
            pushFollow(FOLLOW_10);
            rule__Machine__InvariantsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getInvariantsAssignment_7_1()); 

            }

            // InternalXMachine.g:1154:2: ( ( rule__Machine__InvariantsAssignment_7_1 )* )
            // InternalXMachine.g:1155:3: ( rule__Machine__InvariantsAssignment_7_1 )*
            {
             before(grammarAccess.getMachineAccess().getInvariantsAssignment_7_1()); 
            // InternalXMachine.g:1156:3: ( rule__Machine__InvariantsAssignment_7_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_XLABEL) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalXMachine.g:1156:4: rule__Machine__InvariantsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Machine__InvariantsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getInvariantsAssignment_7_1()); 

            }


            }


            }

        }
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


    // $ANTLR start "rule__Machine__Group_8__0"
    // InternalXMachine.g:1166:1: rule__Machine__Group_8__0 : rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 ;
    public final void rule__Machine__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1170:1: ( rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 )
            // InternalXMachine.g:1171:2: rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__Machine__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_8__0"


    // $ANTLR start "rule__Machine__Group_8__0__Impl"
    // InternalXMachine.g:1178:1: rule__Machine__Group_8__0__Impl : ( 'variant' ) ;
    public final void rule__Machine__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1182:1: ( ( 'variant' ) )
            // InternalXMachine.g:1183:1: ( 'variant' )
            {
            // InternalXMachine.g:1183:1: ( 'variant' )
            // InternalXMachine.g:1184:2: 'variant'
            {
             before(grammarAccess.getMachineAccess().getVariantKeyword_8_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getVariantKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_8__0__Impl"


    // $ANTLR start "rule__Machine__Group_8__1"
    // InternalXMachine.g:1193:1: rule__Machine__Group_8__1 : rule__Machine__Group_8__1__Impl ;
    public final void rule__Machine__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1197:1: ( rule__Machine__Group_8__1__Impl )
            // InternalXMachine.g:1198:2: rule__Machine__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_8__1"


    // $ANTLR start "rule__Machine__Group_8__1__Impl"
    // InternalXMachine.g:1204:1: rule__Machine__Group_8__1__Impl : ( ( rule__Machine__VariantAssignment_8_1 ) ) ;
    public final void rule__Machine__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1208:1: ( ( ( rule__Machine__VariantAssignment_8_1 ) ) )
            // InternalXMachine.g:1209:1: ( ( rule__Machine__VariantAssignment_8_1 ) )
            {
            // InternalXMachine.g:1209:1: ( ( rule__Machine__VariantAssignment_8_1 ) )
            // InternalXMachine.g:1210:2: ( rule__Machine__VariantAssignment_8_1 )
            {
             before(grammarAccess.getMachineAccess().getVariantAssignment_8_1()); 
            // InternalXMachine.g:1211:2: ( rule__Machine__VariantAssignment_8_1 )
            // InternalXMachine.g:1211:3: rule__Machine__VariantAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__VariantAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getVariantAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_8__1__Impl"


    // $ANTLR start "rule__Machine__Group_9__0"
    // InternalXMachine.g:1220:1: rule__Machine__Group_9__0 : rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 ;
    public final void rule__Machine__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1224:1: ( rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 )
            // InternalXMachine.g:1225:2: rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1
            {
            pushFollow(FOLLOW_12);
            rule__Machine__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__0"


    // $ANTLR start "rule__Machine__Group_9__0__Impl"
    // InternalXMachine.g:1232:1: rule__Machine__Group_9__0__Impl : ( 'events' ) ;
    public final void rule__Machine__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1236:1: ( ( 'events' ) )
            // InternalXMachine.g:1237:1: ( 'events' )
            {
            // InternalXMachine.g:1237:1: ( 'events' )
            // InternalXMachine.g:1238:2: 'events'
            {
             before(grammarAccess.getMachineAccess().getEventsKeyword_9_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getEventsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__0__Impl"


    // $ANTLR start "rule__Machine__Group_9__1"
    // InternalXMachine.g:1247:1: rule__Machine__Group_9__1 : rule__Machine__Group_9__1__Impl rule__Machine__Group_9__2 ;
    public final void rule__Machine__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1251:1: ( rule__Machine__Group_9__1__Impl rule__Machine__Group_9__2 )
            // InternalXMachine.g:1252:2: rule__Machine__Group_9__1__Impl rule__Machine__Group_9__2
            {
            pushFollow(FOLLOW_12);
            rule__Machine__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__1"


    // $ANTLR start "rule__Machine__Group_9__1__Impl"
    // InternalXMachine.g:1259:1: rule__Machine__Group_9__1__Impl : ( ( rule__Machine__EventsAssignment_9_1 ) ) ;
    public final void rule__Machine__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1263:1: ( ( ( rule__Machine__EventsAssignment_9_1 ) ) )
            // InternalXMachine.g:1264:1: ( ( rule__Machine__EventsAssignment_9_1 ) )
            {
            // InternalXMachine.g:1264:1: ( ( rule__Machine__EventsAssignment_9_1 ) )
            // InternalXMachine.g:1265:2: ( rule__Machine__EventsAssignment_9_1 )
            {
             before(grammarAccess.getMachineAccess().getEventsAssignment_9_1()); 
            // InternalXMachine.g:1266:2: ( rule__Machine__EventsAssignment_9_1 )
            // InternalXMachine.g:1266:3: rule__Machine__EventsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__EventsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getEventsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__1__Impl"


    // $ANTLR start "rule__Machine__Group_9__2"
    // InternalXMachine.g:1274:1: rule__Machine__Group_9__2 : rule__Machine__Group_9__2__Impl ;
    public final void rule__Machine__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1278:1: ( rule__Machine__Group_9__2__Impl )
            // InternalXMachine.g:1279:2: rule__Machine__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__2"


    // $ANTLR start "rule__Machine__Group_9__2__Impl"
    // InternalXMachine.g:1285:1: rule__Machine__Group_9__2__Impl : ( ( rule__Machine__EventsAssignment_9_2 )* ) ;
    public final void rule__Machine__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1289:1: ( ( ( rule__Machine__EventsAssignment_9_2 )* ) )
            // InternalXMachine.g:1290:1: ( ( rule__Machine__EventsAssignment_9_2 )* )
            {
            // InternalXMachine.g:1290:1: ( ( rule__Machine__EventsAssignment_9_2 )* )
            // InternalXMachine.g:1291:2: ( rule__Machine__EventsAssignment_9_2 )*
            {
             before(grammarAccess.getMachineAccess().getEventsAssignment_9_2()); 
            // InternalXMachine.g:1292:2: ( rule__Machine__EventsAssignment_9_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalXMachine.g:1292:3: rule__Machine__EventsAssignment_9_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Machine__EventsAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getEventsAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__2__Impl"


    // $ANTLR start "rule__MIncludes__Group__0"
    // InternalXMachine.g:1301:1: rule__MIncludes__Group__0 : rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 ;
    public final void rule__MIncludes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1305:1: ( rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 )
            // InternalXMachine.g:1306:2: rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__MIncludes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1313:1: rule__MIncludes__Group__0__Impl : ( () ) ;
    public final void rule__MIncludes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1317:1: ( ( () ) )
            // InternalXMachine.g:1318:1: ( () )
            {
            // InternalXMachine.g:1318:1: ( () )
            // InternalXMachine.g:1319:2: ()
            {
             before(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 
            // InternalXMachine.g:1320:2: ()
            // InternalXMachine.g:1320:3: 
            {
            }

             after(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 

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
    // InternalXMachine.g:1328:1: rule__MIncludes__Group__1 : rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 ;
    public final void rule__MIncludes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1332:1: ( rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 )
            // InternalXMachine.g:1333:2: rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__MIncludes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1340:1: rule__MIncludes__Group__1__Impl : ( ( rule__MIncludes__Group_1__0 ) ) ;
    public final void rule__MIncludes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1344:1: ( ( ( rule__MIncludes__Group_1__0 ) ) )
            // InternalXMachine.g:1345:1: ( ( rule__MIncludes__Group_1__0 ) )
            {
            // InternalXMachine.g:1345:1: ( ( rule__MIncludes__Group_1__0 ) )
            // InternalXMachine.g:1346:2: ( rule__MIncludes__Group_1__0 )
            {
             before(grammarAccess.getMIncludesAccess().getGroup_1()); 
            // InternalXMachine.g:1347:2: ( rule__MIncludes__Group_1__0 )
            // InternalXMachine.g:1347:3: rule__MIncludes__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMIncludesAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1355:1: rule__MIncludes__Group__2 : rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 ;
    public final void rule__MIncludes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1359:1: ( rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 )
            // InternalXMachine.g:1360:2: rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__MIncludes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__3();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1367:1: rule__MIncludes__Group__2__Impl : ( ( rule__MIncludes__Group_2__0 )? ) ;
    public final void rule__MIncludes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1371:1: ( ( ( rule__MIncludes__Group_2__0 )? ) )
            // InternalXMachine.g:1372:1: ( ( rule__MIncludes__Group_2__0 )? )
            {
            // InternalXMachine.g:1372:1: ( ( rule__MIncludes__Group_2__0 )? )
            // InternalXMachine.g:1373:2: ( rule__MIncludes__Group_2__0 )?
            {
             before(grammarAccess.getMIncludesAccess().getGroup_2()); 
            // InternalXMachine.g:1374:2: ( rule__MIncludes__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:1374:3: rule__MIncludes__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MIncludes__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMIncludesAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalXMachine.g:1382:1: rule__MIncludes__Group__3 : rule__MIncludes__Group__3__Impl ;
    public final void rule__MIncludes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1386:1: ( rule__MIncludes__Group__3__Impl )
            // InternalXMachine.g:1387:2: rule__MIncludes__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1393:1: rule__MIncludes__Group__3__Impl : ( ( rule__MIncludes__Group_3__0 )? ) ;
    public final void rule__MIncludes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1397:1: ( ( ( rule__MIncludes__Group_3__0 )? ) )
            // InternalXMachine.g:1398:1: ( ( rule__MIncludes__Group_3__0 )? )
            {
            // InternalXMachine.g:1398:1: ( ( rule__MIncludes__Group_3__0 )? )
            // InternalXMachine.g:1399:2: ( rule__MIncludes__Group_3__0 )?
            {
             before(grammarAccess.getMIncludesAccess().getGroup_3()); 
            // InternalXMachine.g:1400:2: ( rule__MIncludes__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXMachine.g:1400:3: rule__MIncludes__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MIncludes__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMIncludesAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalXMachine.g:1409:1: rule__MIncludes__Group_1__0 : rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 ;
    public final void rule__MIncludes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1413:1: ( rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 )
            // InternalXMachine.g:1414:2: rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__MIncludes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1421:1: rule__MIncludes__Group_1__0__Impl : ( 'includes' ) ;
    public final void rule__MIncludes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1425:1: ( ( 'includes' ) )
            // InternalXMachine.g:1426:1: ( 'includes' )
            {
            // InternalXMachine.g:1426:1: ( 'includes' )
            // InternalXMachine.g:1427:2: 'includes'
            {
             before(grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1436:1: rule__MIncludes__Group_1__1 : rule__MIncludes__Group_1__1__Impl ;
    public final void rule__MIncludes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1440:1: ( rule__MIncludes__Group_1__1__Impl )
            // InternalXMachine.g:1441:2: rule__MIncludes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1447:1: rule__MIncludes__Group_1__1__Impl : ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) ;
    public final void rule__MIncludes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1451:1: ( ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) )
            // InternalXMachine.g:1452:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            {
            // InternalXMachine.g:1452:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            // InternalXMachine.g:1453:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            {
             before(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 
            // InternalXMachine.g:1454:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            // InternalXMachine.g:1454:3: rule__MIncludes__AbstractMachineAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__AbstractMachineAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1463:1: rule__MIncludes__Group_2__0 : rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 ;
    public final void rule__MIncludes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1467:1: ( rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 )
            // InternalXMachine.g:1468:2: rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__MIncludes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1475:1: rule__MIncludes__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__MIncludes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1479:1: ( ( 'to' ) )
            // InternalXMachine.g:1480:1: ( 'to' )
            {
            // InternalXMachine.g:1480:1: ( 'to' )
            // InternalXMachine.g:1481:2: 'to'
            {
             before(grammarAccess.getMIncludesAccess().getToKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getToKeyword_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1490:1: rule__MIncludes__Group_2__1 : rule__MIncludes__Group_2__1__Impl ;
    public final void rule__MIncludes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1494:1: ( rule__MIncludes__Group_2__1__Impl )
            // InternalXMachine.g:1495:2: rule__MIncludes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1501:1: rule__MIncludes__Group_2__1__Impl : ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) ;
    public final void rule__MIncludes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1505:1: ( ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) )
            // InternalXMachine.g:1506:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            {
            // InternalXMachine.g:1506:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            // InternalXMachine.g:1507:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            {
             before(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 
            // InternalXMachine.g:1508:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            // InternalXMachine.g:1508:3: rule__MIncludes__ConcreteMachineAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__ConcreteMachineAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1517:1: rule__MIncludes__Group_3__0 : rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 ;
    public final void rule__MIncludes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1521:1: ( rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 )
            // InternalXMachine.g:1522:2: rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__MIncludes__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_3__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1529:1: rule__MIncludes__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__MIncludes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1533:1: ( ( 'as' ) )
            // InternalXMachine.g:1534:1: ( 'as' )
            {
            // InternalXMachine.g:1534:1: ( 'as' )
            // InternalXMachine.g:1535:2: 'as'
            {
             before(grammarAccess.getMIncludesAccess().getAsKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getAsKeyword_3_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1544:1: rule__MIncludes__Group_3__1 : rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 ;
    public final void rule__MIncludes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1548:1: ( rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 )
            // InternalXMachine.g:1549:2: rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2
            {
            pushFollow(FOLLOW_4);
            rule__MIncludes__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1556:1: rule__MIncludes__Group_3__1__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) ;
    public final void rule__MIncludes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1560:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) )
            // InternalXMachine.g:1561:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            {
            // InternalXMachine.g:1561:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            // InternalXMachine.g:1562:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            {
             before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 
            // InternalXMachine.g:1563:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            // InternalXMachine.g:1563:3: rule__MIncludes__PrefixesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__PrefixesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1571:1: rule__MIncludes__Group_3__2 : rule__MIncludes__Group_3__2__Impl ;
    public final void rule__MIncludes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1575:1: ( rule__MIncludes__Group_3__2__Impl )
            // InternalXMachine.g:1576:2: rule__MIncludes__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_3__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1582:1: rule__MIncludes__Group_3__2__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) ;
    public final void rule__MIncludes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1586:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) )
            // InternalXMachine.g:1587:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            {
            // InternalXMachine.g:1587:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            // InternalXMachine.g:1588:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            {
             before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 
            // InternalXMachine.g:1589:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalXMachine.g:1589:3: rule__MIncludes__PrefixesAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MIncludes__PrefixesAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 

            }


            }

        }
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
    // InternalXMachine.g:1598:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1602:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXMachine.g:1603:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1610:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1614:1: ( ( RULE_ID ) )
            // InternalXMachine.g:1615:1: ( RULE_ID )
            {
            // InternalXMachine.g:1615:1: ( RULE_ID )
            // InternalXMachine.g:1616:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1625:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1629:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXMachine.g:1630:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1636:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )? ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1640:1: ( ( ( rule__QualifiedName__Group_1__0 )? ) )
            // InternalXMachine.g:1641:1: ( ( rule__QualifiedName__Group_1__0 )? )
            {
            // InternalXMachine.g:1641:1: ( ( rule__QualifiedName__Group_1__0 )? )
            // InternalXMachine.g:1642:2: ( rule__QualifiedName__Group_1__0 )?
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalXMachine.g:1643:2: ( rule__QualifiedName__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXMachine.g:1643:3: rule__QualifiedName__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedName__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1652:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1656:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXMachine.g:1657:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1664:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1668:1: ( ( '.' ) )
            // InternalXMachine.g:1669:1: ( '.' )
            {
            // InternalXMachine.g:1669:1: ( '.' )
            // InternalXMachine.g:1670:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1679:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1683:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXMachine.g:1684:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1690:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1694:1: ( ( RULE_ID ) )
            // InternalXMachine.g:1695:1: ( RULE_ID )
            {
            // InternalXMachine.g:1695:1: ( RULE_ID )
            // InternalXMachine.g:1696:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1706:1: rule__XVariable__Group__0 : rule__XVariable__Group__0__Impl rule__XVariable__Group__1 ;
    public final void rule__XVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1710:1: ( rule__XVariable__Group__0__Impl rule__XVariable__Group__1 )
            // InternalXMachine.g:1711:2: rule__XVariable__Group__0__Impl rule__XVariable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__XVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariable__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1718:1: rule__XVariable__Group__0__Impl : ( () ) ;
    public final void rule__XVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1722:1: ( ( () ) )
            // InternalXMachine.g:1723:1: ( () )
            {
            // InternalXMachine.g:1723:1: ( () )
            // InternalXMachine.g:1724:2: ()
            {
             before(grammarAccess.getXVariableAccess().getVariableAction_0()); 
            // InternalXMachine.g:1725:2: ()
            // InternalXMachine.g:1725:3: 
            {
            }

             after(grammarAccess.getXVariableAccess().getVariableAction_0()); 

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
    // InternalXMachine.g:1733:1: rule__XVariable__Group__1 : rule__XVariable__Group__1__Impl ;
    public final void rule__XVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1737:1: ( rule__XVariable__Group__1__Impl )
            // InternalXMachine.g:1738:2: rule__XVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1744:1: rule__XVariable__Group__1__Impl : ( ( rule__XVariable__NameAssignment_1 ) ) ;
    public final void rule__XVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1748:1: ( ( ( rule__XVariable__NameAssignment_1 ) ) )
            // InternalXMachine.g:1749:1: ( ( rule__XVariable__NameAssignment_1 ) )
            {
            // InternalXMachine.g:1749:1: ( ( rule__XVariable__NameAssignment_1 ) )
            // InternalXMachine.g:1750:2: ( rule__XVariable__NameAssignment_1 )
            {
             before(grammarAccess.getXVariableAccess().getNameAssignment_1()); 
            // InternalXMachine.g:1751:2: ( rule__XVariable__NameAssignment_1 )
            // InternalXMachine.g:1751:3: rule__XVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXVariableAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1760:1: rule__XInvariant__Group__0 : rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 ;
    public final void rule__XInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1764:1: ( rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 )
            // InternalXMachine.g:1765:2: rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XInvariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1772:1: rule__XInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1776:1: ( ( () ) )
            // InternalXMachine.g:1777:1: ( () )
            {
            // InternalXMachine.g:1777:1: ( () )
            // InternalXMachine.g:1778:2: ()
            {
             before(grammarAccess.getXInvariantAccess().getInvariantAction_0()); 
            // InternalXMachine.g:1779:2: ()
            // InternalXMachine.g:1779:3: 
            {
            }

             after(grammarAccess.getXInvariantAccess().getInvariantAction_0()); 

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
    // InternalXMachine.g:1787:1: rule__XInvariant__Group__1 : rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 ;
    public final void rule__XInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1791:1: ( rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 )
            // InternalXMachine.g:1792:2: rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XInvariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1799:1: rule__XInvariant__Group__1__Impl : ( ( rule__XInvariant__NameAssignment_1 ) ) ;
    public final void rule__XInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1803:1: ( ( ( rule__XInvariant__NameAssignment_1 ) ) )
            // InternalXMachine.g:1804:1: ( ( rule__XInvariant__NameAssignment_1 ) )
            {
            // InternalXMachine.g:1804:1: ( ( rule__XInvariant__NameAssignment_1 ) )
            // InternalXMachine.g:1805:2: ( rule__XInvariant__NameAssignment_1 )
            {
             before(grammarAccess.getXInvariantAccess().getNameAssignment_1()); 
            // InternalXMachine.g:1806:2: ( rule__XInvariant__NameAssignment_1 )
            // InternalXMachine.g:1806:3: rule__XInvariant__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1814:1: rule__XInvariant__Group__2 : rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 ;
    public final void rule__XInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1818:1: ( rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 )
            // InternalXMachine.g:1819:2: rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__XInvariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__3();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1826:1: rule__XInvariant__Group__2__Impl : ( ( rule__XInvariant__PredicateAssignment_2 ) ) ;
    public final void rule__XInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1830:1: ( ( ( rule__XInvariant__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:1831:1: ( ( rule__XInvariant__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:1831:1: ( ( rule__XInvariant__PredicateAssignment_2 ) )
            // InternalXMachine.g:1832:2: ( rule__XInvariant__PredicateAssignment_2 )
            {
             before(grammarAccess.getXInvariantAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:1833:2: ( rule__XInvariant__PredicateAssignment_2 )
            // InternalXMachine.g:1833:3: rule__XInvariant__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantAccess().getPredicateAssignment_2()); 

            }


            }

        }
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
    // InternalXMachine.g:1841:1: rule__XInvariant__Group__3 : rule__XInvariant__Group__3__Impl ;
    public final void rule__XInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1845:1: ( rule__XInvariant__Group__3__Impl )
            // InternalXMachine.g:1846:2: rule__XInvariant__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1852:1: rule__XInvariant__Group__3__Impl : ( ( rule__XInvariant__TheoremAssignment_3 )? ) ;
    public final void rule__XInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1856:1: ( ( ( rule__XInvariant__TheoremAssignment_3 )? ) )
            // InternalXMachine.g:1857:1: ( ( rule__XInvariant__TheoremAssignment_3 )? )
            {
            // InternalXMachine.g:1857:1: ( ( rule__XInvariant__TheoremAssignment_3 )? )
            // InternalXMachine.g:1858:2: ( rule__XInvariant__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXInvariantAccess().getTheoremAssignment_3()); 
            // InternalXMachine.g:1859:2: ( rule__XInvariant__TheoremAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXMachine.g:1859:3: rule__XInvariant__TheoremAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XInvariant__TheoremAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXInvariantAccess().getTheoremAssignment_3()); 

            }


            }

        }
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
    // InternalXMachine.g:1868:1: rule__XVariant__Group__0 : rule__XVariant__Group__0__Impl rule__XVariant__Group__1 ;
    public final void rule__XVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1872:1: ( rule__XVariant__Group__0__Impl rule__XVariant__Group__1 )
            // InternalXMachine.g:1873:2: rule__XVariant__Group__0__Impl rule__XVariant__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__XVariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariant__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1880:1: rule__XVariant__Group__0__Impl : ( () ) ;
    public final void rule__XVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1884:1: ( ( () ) )
            // InternalXMachine.g:1885:1: ( () )
            {
            // InternalXMachine.g:1885:1: ( () )
            // InternalXMachine.g:1886:2: ()
            {
             before(grammarAccess.getXVariantAccess().getVariantAction_0()); 
            // InternalXMachine.g:1887:2: ()
            // InternalXMachine.g:1887:3: 
            {
            }

             after(grammarAccess.getXVariantAccess().getVariantAction_0()); 

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
    // InternalXMachine.g:1895:1: rule__XVariant__Group__1 : rule__XVariant__Group__1__Impl ;
    public final void rule__XVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1899:1: ( rule__XVariant__Group__1__Impl )
            // InternalXMachine.g:1900:2: rule__XVariant__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1906:1: rule__XVariant__Group__1__Impl : ( ( rule__XVariant__ExpressionAssignment_1 ) ) ;
    public final void rule__XVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1910:1: ( ( ( rule__XVariant__ExpressionAssignment_1 ) ) )
            // InternalXMachine.g:1911:1: ( ( rule__XVariant__ExpressionAssignment_1 ) )
            {
            // InternalXMachine.g:1911:1: ( ( rule__XVariant__ExpressionAssignment_1 ) )
            // InternalXMachine.g:1912:2: ( rule__XVariant__ExpressionAssignment_1 )
            {
             before(grammarAccess.getXVariantAccess().getExpressionAssignment_1()); 
            // InternalXMachine.g:1913:2: ( rule__XVariant__ExpressionAssignment_1 )
            // InternalXMachine.g:1913:3: rule__XVariant__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXVariantAccess().getExpressionAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1922:1: rule__XGroup__Group__0 : rule__XGroup__Group__0__Impl rule__XGroup__Group__1 ;
    public final void rule__XGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1926:1: ( rule__XGroup__Group__0__Impl rule__XGroup__Group__1 )
            // InternalXMachine.g:1927:2: rule__XGroup__Group__0__Impl rule__XGroup__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__XGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGroup__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1934:1: rule__XGroup__Group__0__Impl : ( () ) ;
    public final void rule__XGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1938:1: ( ( () ) )
            // InternalXMachine.g:1939:1: ( () )
            {
            // InternalXMachine.g:1939:1: ( () )
            // InternalXMachine.g:1940:2: ()
            {
             before(grammarAccess.getXGroupAccess().getEventCasesAction_0()); 
            // InternalXMachine.g:1941:2: ()
            // InternalXMachine.g:1941:3: 
            {
            }

             after(grammarAccess.getXGroupAccess().getEventCasesAction_0()); 

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
    // InternalXMachine.g:1949:1: rule__XGroup__Group__1 : rule__XGroup__Group__1__Impl rule__XGroup__Group__2 ;
    public final void rule__XGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1953:1: ( rule__XGroup__Group__1__Impl rule__XGroup__Group__2 )
            // InternalXMachine.g:1954:2: rule__XGroup__Group__1__Impl rule__XGroup__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__XGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGroup__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1961:1: rule__XGroup__Group__1__Impl : ( 'group' ) ;
    public final void rule__XGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1965:1: ( ( 'group' ) )
            // InternalXMachine.g:1966:1: ( 'group' )
            {
            // InternalXMachine.g:1966:1: ( 'group' )
            // InternalXMachine.g:1967:2: 'group'
            {
             before(grammarAccess.getXGroupAccess().getGroupKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getXGroupAccess().getGroupKeyword_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1976:1: rule__XGroup__Group__2 : rule__XGroup__Group__2__Impl rule__XGroup__Group__3 ;
    public final void rule__XGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1980:1: ( rule__XGroup__Group__2__Impl rule__XGroup__Group__3 )
            // InternalXMachine.g:1981:2: rule__XGroup__Group__2__Impl rule__XGroup__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__XGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGroup__Group__3();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1988:1: rule__XGroup__Group__2__Impl : ( ( rule__XGroup__NameAssignment_2 ) ) ;
    public final void rule__XGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1992:1: ( ( ( rule__XGroup__NameAssignment_2 ) ) )
            // InternalXMachine.g:1993:1: ( ( rule__XGroup__NameAssignment_2 ) )
            {
            // InternalXMachine.g:1993:1: ( ( rule__XGroup__NameAssignment_2 ) )
            // InternalXMachine.g:1994:2: ( rule__XGroup__NameAssignment_2 )
            {
             before(grammarAccess.getXGroupAccess().getNameAssignment_2()); 
            // InternalXMachine.g:1995:2: ( rule__XGroup__NameAssignment_2 )
            // InternalXMachine.g:1995:3: rule__XGroup__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXGroupAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalXMachine.g:2003:1: rule__XGroup__Group__3 : rule__XGroup__Group__3__Impl rule__XGroup__Group__4 ;
    public final void rule__XGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2007:1: ( rule__XGroup__Group__3__Impl rule__XGroup__Group__4 )
            // InternalXMachine.g:2008:2: rule__XGroup__Group__3__Impl rule__XGroup__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__XGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGroup__Group__4();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2015:1: rule__XGroup__Group__3__Impl : ( ( rule__XGroup__Group_3__0 )? ) ;
    public final void rule__XGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2019:1: ( ( ( rule__XGroup__Group_3__0 )? ) )
            // InternalXMachine.g:2020:1: ( ( rule__XGroup__Group_3__0 )? )
            {
            // InternalXMachine.g:2020:1: ( ( rule__XGroup__Group_3__0 )? )
            // InternalXMachine.g:2021:2: ( rule__XGroup__Group_3__0 )?
            {
             before(grammarAccess.getXGroupAccess().getGroup_3()); 
            // InternalXMachine.g:2022:2: ( rule__XGroup__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXMachine.g:2022:3: rule__XGroup__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGroup__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXGroupAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalXMachine.g:2030:1: rule__XGroup__Group__4 : rule__XGroup__Group__4__Impl rule__XGroup__Group__5 ;
    public final void rule__XGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2034:1: ( rule__XGroup__Group__4__Impl rule__XGroup__Group__5 )
            // InternalXMachine.g:2035:2: rule__XGroup__Group__4__Impl rule__XGroup__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__XGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGroup__Group__5();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2042:1: rule__XGroup__Group__4__Impl : ( 'begin' ) ;
    public final void rule__XGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2046:1: ( ( 'begin' ) )
            // InternalXMachine.g:2047:1: ( 'begin' )
            {
            // InternalXMachine.g:2047:1: ( 'begin' )
            // InternalXMachine.g:2048:2: 'begin'
            {
             before(grammarAccess.getXGroupAccess().getBeginKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getXGroupAccess().getBeginKeyword_4()); 

            }


            }

        }
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
    // InternalXMachine.g:2057:1: rule__XGroup__Group__5 : rule__XGroup__Group__5__Impl rule__XGroup__Group__6 ;
    public final void rule__XGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2061:1: ( rule__XGroup__Group__5__Impl rule__XGroup__Group__6 )
            // InternalXMachine.g:2062:2: rule__XGroup__Group__5__Impl rule__XGroup__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__XGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGroup__Group__6();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2069:1: rule__XGroup__Group__5__Impl : ( ( rule__XGroup__Group_5__0 )? ) ;
    public final void rule__XGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2073:1: ( ( ( rule__XGroup__Group_5__0 )? ) )
            // InternalXMachine.g:2074:1: ( ( rule__XGroup__Group_5__0 )? )
            {
            // InternalXMachine.g:2074:1: ( ( rule__XGroup__Group_5__0 )? )
            // InternalXMachine.g:2075:2: ( rule__XGroup__Group_5__0 )?
            {
             before(grammarAccess.getXGroupAccess().getGroup_5()); 
            // InternalXMachine.g:2076:2: ( rule__XGroup__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXMachine.g:2076:3: rule__XGroup__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGroup__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXGroupAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__XGroup__Group__6"
    // InternalXMachine.g:2084:1: rule__XGroup__Group__6 : rule__XGroup__Group__6__Impl ;
    public final void rule__XGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2088:1: ( rule__XGroup__Group__6__Impl )
            // InternalXMachine.g:2089:2: rule__XGroup__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group__6"


    // $ANTLR start "rule__XGroup__Group__6__Impl"
    // InternalXMachine.g:2095:1: rule__XGroup__Group__6__Impl : ( 'end' ) ;
    public final void rule__XGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2099:1: ( ( 'end' ) )
            // InternalXMachine.g:2100:1: ( 'end' )
            {
            // InternalXMachine.g:2100:1: ( 'end' )
            // InternalXMachine.g:2101:2: 'end'
            {
             before(grammarAccess.getXGroupAccess().getEndKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getXGroupAccess().getEndKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group__6__Impl"


    // $ANTLR start "rule__XGroup__Group_3__0"
    // InternalXMachine.g:2111:1: rule__XGroup__Group_3__0 : rule__XGroup__Group_3__0__Impl rule__XGroup__Group_3__1 ;
    public final void rule__XGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2115:1: ( rule__XGroup__Group_3__0__Impl rule__XGroup__Group_3__1 )
            // InternalXMachine.g:2116:2: rule__XGroup__Group_3__0__Impl rule__XGroup__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__XGroup__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGroup__Group_3__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2123:1: rule__XGroup__Group_3__0__Impl : ( '(' ) ;
    public final void rule__XGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2127:1: ( ( '(' ) )
            // InternalXMachine.g:2128:1: ( '(' )
            {
            // InternalXMachine.g:2128:1: ( '(' )
            // InternalXMachine.g:2129:2: '('
            {
             before(grammarAccess.getXGroupAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getXGroupAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
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
    // InternalXMachine.g:2138:1: rule__XGroup__Group_3__1 : rule__XGroup__Group_3__1__Impl rule__XGroup__Group_3__2 ;
    public final void rule__XGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2142:1: ( rule__XGroup__Group_3__1__Impl rule__XGroup__Group_3__2 )
            // InternalXMachine.g:2143:2: rule__XGroup__Group_3__1__Impl rule__XGroup__Group_3__2
            {
            pushFollow(FOLLOW_22);
            rule__XGroup__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGroup__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2150:1: rule__XGroup__Group_3__1__Impl : ( ( rule__XGroup__FormalParametersAssignment_3_1 ) ) ;
    public final void rule__XGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2154:1: ( ( ( rule__XGroup__FormalParametersAssignment_3_1 ) ) )
            // InternalXMachine.g:2155:1: ( ( rule__XGroup__FormalParametersAssignment_3_1 ) )
            {
            // InternalXMachine.g:2155:1: ( ( rule__XGroup__FormalParametersAssignment_3_1 ) )
            // InternalXMachine.g:2156:2: ( rule__XGroup__FormalParametersAssignment_3_1 )
            {
             before(grammarAccess.getXGroupAccess().getFormalParametersAssignment_3_1()); 
            // InternalXMachine.g:2157:2: ( rule__XGroup__FormalParametersAssignment_3_1 )
            // InternalXMachine.g:2157:3: rule__XGroup__FormalParametersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__FormalParametersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXGroupAccess().getFormalParametersAssignment_3_1()); 

            }


            }

        }
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
    // InternalXMachine.g:2165:1: rule__XGroup__Group_3__2 : rule__XGroup__Group_3__2__Impl rule__XGroup__Group_3__3 ;
    public final void rule__XGroup__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2169:1: ( rule__XGroup__Group_3__2__Impl rule__XGroup__Group_3__3 )
            // InternalXMachine.g:2170:2: rule__XGroup__Group_3__2__Impl rule__XGroup__Group_3__3
            {
            pushFollow(FOLLOW_22);
            rule__XGroup__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGroup__Group_3__3();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2177:1: rule__XGroup__Group_3__2__Impl : ( ( rule__XGroup__Group_3_2__0 )* ) ;
    public final void rule__XGroup__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2181:1: ( ( ( rule__XGroup__Group_3_2__0 )* ) )
            // InternalXMachine.g:2182:1: ( ( rule__XGroup__Group_3_2__0 )* )
            {
            // InternalXMachine.g:2182:1: ( ( rule__XGroup__Group_3_2__0 )* )
            // InternalXMachine.g:2183:2: ( rule__XGroup__Group_3_2__0 )*
            {
             before(grammarAccess.getXGroupAccess().getGroup_3_2()); 
            // InternalXMachine.g:2184:2: ( rule__XGroup__Group_3_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalXMachine.g:2184:3: rule__XGroup__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__XGroup__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getXGroupAccess().getGroup_3_2()); 

            }


            }

        }
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
    // InternalXMachine.g:2192:1: rule__XGroup__Group_3__3 : rule__XGroup__Group_3__3__Impl ;
    public final void rule__XGroup__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2196:1: ( rule__XGroup__Group_3__3__Impl )
            // InternalXMachine.g:2197:2: rule__XGroup__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__Group_3__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2203:1: rule__XGroup__Group_3__3__Impl : ( ')' ) ;
    public final void rule__XGroup__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2207:1: ( ( ')' ) )
            // InternalXMachine.g:2208:1: ( ')' )
            {
            // InternalXMachine.g:2208:1: ( ')' )
            // InternalXMachine.g:2209:2: ')'
            {
             before(grammarAccess.getXGroupAccess().getRightParenthesisKeyword_3_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getXGroupAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
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
    // InternalXMachine.g:2219:1: rule__XGroup__Group_3_2__0 : rule__XGroup__Group_3_2__0__Impl rule__XGroup__Group_3_2__1 ;
    public final void rule__XGroup__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2223:1: ( rule__XGroup__Group_3_2__0__Impl rule__XGroup__Group_3_2__1 )
            // InternalXMachine.g:2224:2: rule__XGroup__Group_3_2__0__Impl rule__XGroup__Group_3_2__1
            {
            pushFollow(FOLLOW_21);
            rule__XGroup__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGroup__Group_3_2__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2231:1: rule__XGroup__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__XGroup__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2235:1: ( ( ',' ) )
            // InternalXMachine.g:2236:1: ( ',' )
            {
            // InternalXMachine.g:2236:1: ( ',' )
            // InternalXMachine.g:2237:2: ','
            {
             before(grammarAccess.getXGroupAccess().getCommaKeyword_3_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getXGroupAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:2246:1: rule__XGroup__Group_3_2__1 : rule__XGroup__Group_3_2__1__Impl ;
    public final void rule__XGroup__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2250:1: ( rule__XGroup__Group_3_2__1__Impl )
            // InternalXMachine.g:2251:2: rule__XGroup__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2257:1: rule__XGroup__Group_3_2__1__Impl : ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) ) ;
    public final void rule__XGroup__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2261:1: ( ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) ) )
            // InternalXMachine.g:2262:1: ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) )
            {
            // InternalXMachine.g:2262:1: ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) )
            // InternalXMachine.g:2263:2: ( rule__XGroup__FormalParametersAssignment_3_2_1 )
            {
             before(grammarAccess.getXGroupAccess().getFormalParametersAssignment_3_2_1()); 
            // InternalXMachine.g:2264:2: ( rule__XGroup__FormalParametersAssignment_3_2_1 )
            // InternalXMachine.g:2264:3: rule__XGroup__FormalParametersAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__FormalParametersAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXGroupAccess().getFormalParametersAssignment_3_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__XGroup__Group_5__0"
    // InternalXMachine.g:2273:1: rule__XGroup__Group_5__0 : rule__XGroup__Group_5__0__Impl rule__XGroup__Group_5__1 ;
    public final void rule__XGroup__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2277:1: ( rule__XGroup__Group_5__0__Impl rule__XGroup__Group_5__1 )
            // InternalXMachine.g:2278:2: rule__XGroup__Group_5__0__Impl rule__XGroup__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__XGroup__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGroup__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_5__0"


    // $ANTLR start "rule__XGroup__Group_5__0__Impl"
    // InternalXMachine.g:2285:1: rule__XGroup__Group_5__0__Impl : ( ( rule__XGroup__EventsAssignment_5_0 ) ) ;
    public final void rule__XGroup__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2289:1: ( ( ( rule__XGroup__EventsAssignment_5_0 ) ) )
            // InternalXMachine.g:2290:1: ( ( rule__XGroup__EventsAssignment_5_0 ) )
            {
            // InternalXMachine.g:2290:1: ( ( rule__XGroup__EventsAssignment_5_0 ) )
            // InternalXMachine.g:2291:2: ( rule__XGroup__EventsAssignment_5_0 )
            {
             before(grammarAccess.getXGroupAccess().getEventsAssignment_5_0()); 
            // InternalXMachine.g:2292:2: ( rule__XGroup__EventsAssignment_5_0 )
            // InternalXMachine.g:2292:3: rule__XGroup__EventsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__EventsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getXGroupAccess().getEventsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_5__0__Impl"


    // $ANTLR start "rule__XGroup__Group_5__1"
    // InternalXMachine.g:2300:1: rule__XGroup__Group_5__1 : rule__XGroup__Group_5__1__Impl ;
    public final void rule__XGroup__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2304:1: ( rule__XGroup__Group_5__1__Impl )
            // InternalXMachine.g:2305:2: rule__XGroup__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_5__1"


    // $ANTLR start "rule__XGroup__Group_5__1__Impl"
    // InternalXMachine.g:2311:1: rule__XGroup__Group_5__1__Impl : ( ( rule__XGroup__Group_5_1__0 )* ) ;
    public final void rule__XGroup__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2315:1: ( ( ( rule__XGroup__Group_5_1__0 )* ) )
            // InternalXMachine.g:2316:1: ( ( rule__XGroup__Group_5_1__0 )* )
            {
            // InternalXMachine.g:2316:1: ( ( rule__XGroup__Group_5_1__0 )* )
            // InternalXMachine.g:2317:2: ( rule__XGroup__Group_5_1__0 )*
            {
             before(grammarAccess.getXGroupAccess().getGroup_5_1()); 
            // InternalXMachine.g:2318:2: ( rule__XGroup__Group_5_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalXMachine.g:2318:3: rule__XGroup__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__XGroup__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getXGroupAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_5__1__Impl"


    // $ANTLR start "rule__XGroup__Group_5_1__0"
    // InternalXMachine.g:2327:1: rule__XGroup__Group_5_1__0 : rule__XGroup__Group_5_1__0__Impl rule__XGroup__Group_5_1__1 ;
    public final void rule__XGroup__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2331:1: ( rule__XGroup__Group_5_1__0__Impl rule__XGroup__Group_5_1__1 )
            // InternalXMachine.g:2332:2: rule__XGroup__Group_5_1__0__Impl rule__XGroup__Group_5_1__1
            {
            pushFollow(FOLLOW_4);
            rule__XGroup__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGroup__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_5_1__0"


    // $ANTLR start "rule__XGroup__Group_5_1__0__Impl"
    // InternalXMachine.g:2339:1: rule__XGroup__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__XGroup__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2343:1: ( ( ',' ) )
            // InternalXMachine.g:2344:1: ( ',' )
            {
            // InternalXMachine.g:2344:1: ( ',' )
            // InternalXMachine.g:2345:2: ','
            {
             before(grammarAccess.getXGroupAccess().getCommaKeyword_5_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getXGroupAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_5_1__0__Impl"


    // $ANTLR start "rule__XGroup__Group_5_1__1"
    // InternalXMachine.g:2354:1: rule__XGroup__Group_5_1__1 : rule__XGroup__Group_5_1__1__Impl ;
    public final void rule__XGroup__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2358:1: ( rule__XGroup__Group_5_1__1__Impl )
            // InternalXMachine.g:2359:2: rule__XGroup__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_5_1__1"


    // $ANTLR start "rule__XGroup__Group_5_1__1__Impl"
    // InternalXMachine.g:2365:1: rule__XGroup__Group_5_1__1__Impl : ( ( rule__XGroup__EventsAssignment_5_1_1 ) ) ;
    public final void rule__XGroup__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2369:1: ( ( ( rule__XGroup__EventsAssignment_5_1_1 ) ) )
            // InternalXMachine.g:2370:1: ( ( rule__XGroup__EventsAssignment_5_1_1 ) )
            {
            // InternalXMachine.g:2370:1: ( ( rule__XGroup__EventsAssignment_5_1_1 ) )
            // InternalXMachine.g:2371:2: ( rule__XGroup__EventsAssignment_5_1_1 )
            {
             before(grammarAccess.getXGroupAccess().getEventsAssignment_5_1_1()); 
            // InternalXMachine.g:2372:2: ( rule__XGroup__EventsAssignment_5_1_1 )
            // InternalXMachine.g:2372:3: rule__XGroup__EventsAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__EventsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getXGroupAccess().getEventsAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__Group_5_1__1__Impl"


    // $ANTLR start "rule__XFormalParameter__Group__0"
    // InternalXMachine.g:2381:1: rule__XFormalParameter__Group__0 : rule__XFormalParameter__Group__0__Impl rule__XFormalParameter__Group__1 ;
    public final void rule__XFormalParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2385:1: ( rule__XFormalParameter__Group__0__Impl rule__XFormalParameter__Group__1 )
            // InternalXMachine.g:2386:2: rule__XFormalParameter__Group__0__Impl rule__XFormalParameter__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__XFormalParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XFormalParameter__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2393:1: rule__XFormalParameter__Group__0__Impl : ( () ) ;
    public final void rule__XFormalParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2397:1: ( ( () ) )
            // InternalXMachine.g:2398:1: ( () )
            {
            // InternalXMachine.g:2398:1: ( () )
            // InternalXMachine.g:2399:2: ()
            {
             before(grammarAccess.getXFormalParameterAccess().getFormalParameterAction_0()); 
            // InternalXMachine.g:2400:2: ()
            // InternalXMachine.g:2400:3: 
            {
            }

             after(grammarAccess.getXFormalParameterAccess().getFormalParameterAction_0()); 

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
    // InternalXMachine.g:2408:1: rule__XFormalParameter__Group__1 : rule__XFormalParameter__Group__1__Impl rule__XFormalParameter__Group__2 ;
    public final void rule__XFormalParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2412:1: ( rule__XFormalParameter__Group__1__Impl rule__XFormalParameter__Group__2 )
            // InternalXMachine.g:2413:2: rule__XFormalParameter__Group__1__Impl rule__XFormalParameter__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__XFormalParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XFormalParameter__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2420:1: rule__XFormalParameter__Group__1__Impl : ( ( rule__XFormalParameter__DirectionAssignment_1 ) ) ;
    public final void rule__XFormalParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2424:1: ( ( ( rule__XFormalParameter__DirectionAssignment_1 ) ) )
            // InternalXMachine.g:2425:1: ( ( rule__XFormalParameter__DirectionAssignment_1 ) )
            {
            // InternalXMachine.g:2425:1: ( ( rule__XFormalParameter__DirectionAssignment_1 ) )
            // InternalXMachine.g:2426:2: ( rule__XFormalParameter__DirectionAssignment_1 )
            {
             before(grammarAccess.getXFormalParameterAccess().getDirectionAssignment_1()); 
            // InternalXMachine.g:2427:2: ( rule__XFormalParameter__DirectionAssignment_1 )
            // InternalXMachine.g:2427:3: rule__XFormalParameter__DirectionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XFormalParameter__DirectionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXFormalParameterAccess().getDirectionAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:2435:1: rule__XFormalParameter__Group__2 : rule__XFormalParameter__Group__2__Impl ;
    public final void rule__XFormalParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2439:1: ( rule__XFormalParameter__Group__2__Impl )
            // InternalXMachine.g:2440:2: rule__XFormalParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XFormalParameter__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2446:1: rule__XFormalParameter__Group__2__Impl : ( ( rule__XFormalParameter__NameAssignment_2 ) ) ;
    public final void rule__XFormalParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2450:1: ( ( ( rule__XFormalParameter__NameAssignment_2 ) ) )
            // InternalXMachine.g:2451:1: ( ( rule__XFormalParameter__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2451:1: ( ( rule__XFormalParameter__NameAssignment_2 ) )
            // InternalXMachine.g:2452:2: ( rule__XFormalParameter__NameAssignment_2 )
            {
             before(grammarAccess.getXFormalParameterAccess().getNameAssignment_2()); 
            // InternalXMachine.g:2453:2: ( rule__XFormalParameter__NameAssignment_2 )
            // InternalXMachine.g:2453:3: rule__XFormalParameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XFormalParameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXFormalParameterAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalXMachine.g:2462:1: rule__XEvent__Group__0 : rule__XEvent__Group__0__Impl rule__XEvent__Group__1 ;
    public final void rule__XEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2466:1: ( rule__XEvent__Group__0__Impl rule__XEvent__Group__1 )
            // InternalXMachine.g:2467:2: rule__XEvent__Group__0__Impl rule__XEvent__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__XEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2474:1: rule__XEvent__Group__0__Impl : ( () ) ;
    public final void rule__XEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2478:1: ( ( () ) )
            // InternalXMachine.g:2479:1: ( () )
            {
            // InternalXMachine.g:2479:1: ( () )
            // InternalXMachine.g:2480:2: ()
            {
             before(grammarAccess.getXEventAccess().getEventAction_0()); 
            // InternalXMachine.g:2481:2: ()
            // InternalXMachine.g:2481:3: 
            {
            }

             after(grammarAccess.getXEventAccess().getEventAction_0()); 

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
    // InternalXMachine.g:2489:1: rule__XEvent__Group__1 : rule__XEvent__Group__1__Impl rule__XEvent__Group__2 ;
    public final void rule__XEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2493:1: ( rule__XEvent__Group__1__Impl rule__XEvent__Group__2 )
            // InternalXMachine.g:2494:2: rule__XEvent__Group__1__Impl rule__XEvent__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__XEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2501:1: rule__XEvent__Group__1__Impl : ( 'event' ) ;
    public final void rule__XEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2505:1: ( ( 'event' ) )
            // InternalXMachine.g:2506:1: ( 'event' )
            {
            // InternalXMachine.g:2506:1: ( 'event' )
            // InternalXMachine.g:2507:2: 'event'
            {
             before(grammarAccess.getXEventAccess().getEventKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getEventKeyword_1()); 

            }


            }

        }
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
    // InternalXMachine.g:2516:1: rule__XEvent__Group__2 : rule__XEvent__Group__2__Impl rule__XEvent__Group__3 ;
    public final void rule__XEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2520:1: ( rule__XEvent__Group__2__Impl rule__XEvent__Group__3 )
            // InternalXMachine.g:2521:2: rule__XEvent__Group__2__Impl rule__XEvent__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__XEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__3();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2528:1: rule__XEvent__Group__2__Impl : ( ( rule__XEvent__NameAssignment_2 ) ) ;
    public final void rule__XEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2532:1: ( ( ( rule__XEvent__NameAssignment_2 ) ) )
            // InternalXMachine.g:2533:1: ( ( rule__XEvent__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2533:1: ( ( rule__XEvent__NameAssignment_2 ) )
            // InternalXMachine.g:2534:2: ( rule__XEvent__NameAssignment_2 )
            {
             before(grammarAccess.getXEventAccess().getNameAssignment_2()); 
            // InternalXMachine.g:2535:2: ( rule__XEvent__NameAssignment_2 )
            // InternalXMachine.g:2535:3: rule__XEvent__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalXMachine.g:2543:1: rule__XEvent__Group__3 : rule__XEvent__Group__3__Impl rule__XEvent__Group__4 ;
    public final void rule__XEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2547:1: ( rule__XEvent__Group__3__Impl rule__XEvent__Group__4 )
            // InternalXMachine.g:2548:2: rule__XEvent__Group__3__Impl rule__XEvent__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__XEvent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__4();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2555:1: rule__XEvent__Group__3__Impl : ( ( rule__XEvent__UnorderedGroup_3 ) ) ;
    public final void rule__XEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2559:1: ( ( ( rule__XEvent__UnorderedGroup_3 ) ) )
            // InternalXMachine.g:2560:1: ( ( rule__XEvent__UnorderedGroup_3 ) )
            {
            // InternalXMachine.g:2560:1: ( ( rule__XEvent__UnorderedGroup_3 ) )
            // InternalXMachine.g:2561:2: ( rule__XEvent__UnorderedGroup_3 )
            {
             before(grammarAccess.getXEventAccess().getUnorderedGroup_3()); 
            // InternalXMachine.g:2562:2: ( rule__XEvent__UnorderedGroup_3 )
            // InternalXMachine.g:2562:3: rule__XEvent__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getUnorderedGroup_3()); 

            }


            }

        }
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
    // InternalXMachine.g:2570:1: rule__XEvent__Group__4 : rule__XEvent__Group__4__Impl rule__XEvent__Group__5 ;
    public final void rule__XEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2574:1: ( rule__XEvent__Group__4__Impl rule__XEvent__Group__5 )
            // InternalXMachine.g:2575:2: rule__XEvent__Group__4__Impl rule__XEvent__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__XEvent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__5();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2582:1: rule__XEvent__Group__4__Impl : ( ( rule__XEvent__ExtensionsAssignment_4 )* ) ;
    public final void rule__XEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2586:1: ( ( ( rule__XEvent__ExtensionsAssignment_4 )* ) )
            // InternalXMachine.g:2587:1: ( ( rule__XEvent__ExtensionsAssignment_4 )* )
            {
            // InternalXMachine.g:2587:1: ( ( rule__XEvent__ExtensionsAssignment_4 )* )
            // InternalXMachine.g:2588:2: ( rule__XEvent__ExtensionsAssignment_4 )*
            {
             before(grammarAccess.getXEventAccess().getExtensionsAssignment_4()); 
            // InternalXMachine.g:2589:2: ( rule__XEvent__ExtensionsAssignment_4 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=40 && LA26_0<=41)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalXMachine.g:2589:3: rule__XEvent__ExtensionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__XEvent__ExtensionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getExtensionsAssignment_4()); 

            }


            }

        }
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
    // InternalXMachine.g:2597:1: rule__XEvent__Group__5 : rule__XEvent__Group__5__Impl rule__XEvent__Group__6 ;
    public final void rule__XEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2601:1: ( rule__XEvent__Group__5__Impl rule__XEvent__Group__6 )
            // InternalXMachine.g:2602:2: rule__XEvent__Group__5__Impl rule__XEvent__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__XEvent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__6();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2609:1: rule__XEvent__Group__5__Impl : ( ( rule__XEvent__Group_5__0 )? ) ;
    public final void rule__XEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2613:1: ( ( ( rule__XEvent__Group_5__0 )? ) )
            // InternalXMachine.g:2614:1: ( ( rule__XEvent__Group_5__0 )? )
            {
            // InternalXMachine.g:2614:1: ( ( rule__XEvent__Group_5__0 )? )
            // InternalXMachine.g:2615:2: ( rule__XEvent__Group_5__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5()); 
            // InternalXMachine.g:2616:2: ( rule__XEvent__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXMachine.g:2616:3: rule__XEvent__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalXMachine.g:2624:1: rule__XEvent__Group__6 : rule__XEvent__Group__6__Impl rule__XEvent__Group__7 ;
    public final void rule__XEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2628:1: ( rule__XEvent__Group__6__Impl rule__XEvent__Group__7 )
            // InternalXMachine.g:2629:2: rule__XEvent__Group__6__Impl rule__XEvent__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__XEvent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__7();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2636:1: rule__XEvent__Group__6__Impl : ( ( rule__XEvent__Alternatives_6 )? ) ;
    public final void rule__XEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2640:1: ( ( ( rule__XEvent__Alternatives_6 )? ) )
            // InternalXMachine.g:2641:1: ( ( rule__XEvent__Alternatives_6 )? )
            {
            // InternalXMachine.g:2641:1: ( ( rule__XEvent__Alternatives_6 )? )
            // InternalXMachine.g:2642:2: ( rule__XEvent__Alternatives_6 )?
            {
             before(grammarAccess.getXEventAccess().getAlternatives_6()); 
            // InternalXMachine.g:2643:2: ( rule__XEvent__Alternatives_6 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30||(LA28_0>=35 && LA28_0<=36)||LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXMachine.g:2643:3: rule__XEvent__Alternatives_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Alternatives_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getAlternatives_6()); 

            }


            }

        }
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
    // InternalXMachine.g:2651:1: rule__XEvent__Group__7 : rule__XEvent__Group__7__Impl ;
    public final void rule__XEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2655:1: ( rule__XEvent__Group__7__Impl )
            // InternalXMachine.g:2656:2: rule__XEvent__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2662:1: rule__XEvent__Group__7__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2666:1: ( ( 'end' ) )
            // InternalXMachine.g:2667:1: ( 'end' )
            {
            // InternalXMachine.g:2667:1: ( 'end' )
            // InternalXMachine.g:2668:2: 'end'
            {
             before(grammarAccess.getXEventAccess().getEndKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getEndKeyword_7()); 

            }


            }

        }
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
    // InternalXMachine.g:2678:1: rule__XEvent__Group_5__0 : rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1 ;
    public final void rule__XEvent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2682:1: ( rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1 )
            // InternalXMachine.g:2683:2: rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__XEvent__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2690:1: rule__XEvent__Group_5__0__Impl : ( 'refines' ) ;
    public final void rule__XEvent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2694:1: ( ( 'refines' ) )
            // InternalXMachine.g:2695:1: ( 'refines' )
            {
            // InternalXMachine.g:2695:1: ( 'refines' )
            // InternalXMachine.g:2696:2: 'refines'
            {
             before(grammarAccess.getXEventAccess().getRefinesKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getRefinesKeyword_5_0()); 

            }


            }

        }
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
    // InternalXMachine.g:2705:1: rule__XEvent__Group_5__1 : rule__XEvent__Group_5__1__Impl ;
    public final void rule__XEvent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2709:1: ( rule__XEvent__Group_5__1__Impl )
            // InternalXMachine.g:2710:2: rule__XEvent__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2716:1: rule__XEvent__Group_5__1__Impl : ( ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* ) ) ;
    public final void rule__XEvent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2720:1: ( ( ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* ) ) )
            // InternalXMachine.g:2721:1: ( ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* ) )
            {
            // InternalXMachine.g:2721:1: ( ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* ) )
            // InternalXMachine.g:2722:2: ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* )
            {
            // InternalXMachine.g:2722:2: ( ( rule__XEvent__RefinesAssignment_5_1 ) )
            // InternalXMachine.g:2723:3: ( rule__XEvent__RefinesAssignment_5_1 )
            {
             before(grammarAccess.getXEventAccess().getRefinesAssignment_5_1()); 
            // InternalXMachine.g:2724:3: ( rule__XEvent__RefinesAssignment_5_1 )
            // InternalXMachine.g:2724:4: rule__XEvent__RefinesAssignment_5_1
            {
            pushFollow(FOLLOW_8);
            rule__XEvent__RefinesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getRefinesAssignment_5_1()); 

            }

            // InternalXMachine.g:2727:2: ( ( rule__XEvent__RefinesAssignment_5_1 )* )
            // InternalXMachine.g:2728:3: ( rule__XEvent__RefinesAssignment_5_1 )*
            {
             before(grammarAccess.getXEventAccess().getRefinesAssignment_5_1()); 
            // InternalXMachine.g:2729:3: ( rule__XEvent__RefinesAssignment_5_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalXMachine.g:2729:4: rule__XEvent__RefinesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XEvent__RefinesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getRefinesAssignment_5_1()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:2739:1: rule__XEvent__Group_6_0__0 : rule__XEvent__Group_6_0__0__Impl rule__XEvent__Group_6_0__1 ;
    public final void rule__XEvent__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2743:1: ( rule__XEvent__Group_6_0__0__Impl rule__XEvent__Group_6_0__1 )
            // InternalXMachine.g:2744:2: rule__XEvent__Group_6_0__0__Impl rule__XEvent__Group_6_0__1
            {
            pushFollow(FOLLOW_28);
            rule__XEvent__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_0__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2751:1: rule__XEvent__Group_6_0__0__Impl : ( ( rule__XEvent__Group_6_0_0__0 )? ) ;
    public final void rule__XEvent__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2755:1: ( ( ( rule__XEvent__Group_6_0_0__0 )? ) )
            // InternalXMachine.g:2756:1: ( ( rule__XEvent__Group_6_0_0__0 )? )
            {
            // InternalXMachine.g:2756:1: ( ( rule__XEvent__Group_6_0_0__0 )? )
            // InternalXMachine.g:2757:2: ( rule__XEvent__Group_6_0_0__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_6_0_0()); 
            // InternalXMachine.g:2758:2: ( rule__XEvent__Group_6_0_0__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXMachine.g:2758:3: rule__XEvent__Group_6_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_6_0_0()); 

            }


            }

        }
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
    // InternalXMachine.g:2766:1: rule__XEvent__Group_6_0__1 : rule__XEvent__Group_6_0__1__Impl rule__XEvent__Group_6_0__2 ;
    public final void rule__XEvent__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2770:1: ( rule__XEvent__Group_6_0__1__Impl rule__XEvent__Group_6_0__2 )
            // InternalXMachine.g:2771:2: rule__XEvent__Group_6_0__1__Impl rule__XEvent__Group_6_0__2
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_0__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2778:1: rule__XEvent__Group_6_0__1__Impl : ( 'begin' ) ;
    public final void rule__XEvent__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2782:1: ( ( 'begin' ) )
            // InternalXMachine.g:2783:1: ( 'begin' )
            {
            // InternalXMachine.g:2783:1: ( 'begin' )
            // InternalXMachine.g:2784:2: 'begin'
            {
             before(grammarAccess.getXEventAccess().getBeginKeyword_6_0_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getBeginKeyword_6_0_1()); 

            }


            }

        }
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
    // InternalXMachine.g:2793:1: rule__XEvent__Group_6_0__2 : rule__XEvent__Group_6_0__2__Impl ;
    public final void rule__XEvent__Group_6_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2797:1: ( rule__XEvent__Group_6_0__2__Impl )
            // InternalXMachine.g:2798:2: rule__XEvent__Group_6_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_0__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2804:1: rule__XEvent__Group_6_0__2__Impl : ( ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* ) ) ;
    public final void rule__XEvent__Group_6_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2808:1: ( ( ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* ) ) )
            // InternalXMachine.g:2809:1: ( ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* ) )
            {
            // InternalXMachine.g:2809:1: ( ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* ) )
            // InternalXMachine.g:2810:2: ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* )
            {
            // InternalXMachine.g:2810:2: ( ( rule__XEvent__ActionsAssignment_6_0_2 ) )
            // InternalXMachine.g:2811:3: ( rule__XEvent__ActionsAssignment_6_0_2 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_6_0_2()); 
            // InternalXMachine.g:2812:3: ( rule__XEvent__ActionsAssignment_6_0_2 )
            // InternalXMachine.g:2812:4: rule__XEvent__ActionsAssignment_6_0_2
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_6_0_2();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_6_0_2()); 

            }

            // InternalXMachine.g:2815:2: ( ( rule__XEvent__ActionsAssignment_6_0_2 )* )
            // InternalXMachine.g:2816:3: ( rule__XEvent__ActionsAssignment_6_0_2 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_6_0_2()); 
            // InternalXMachine.g:2817:3: ( rule__XEvent__ActionsAssignment_6_0_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_XLABEL) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalXMachine.g:2817:4: rule__XEvent__ActionsAssignment_6_0_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_6_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getActionsAssignment_6_0_2()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:2827:1: rule__XEvent__Group_6_0_0__0 : rule__XEvent__Group_6_0_0__0__Impl rule__XEvent__Group_6_0_0__1 ;
    public final void rule__XEvent__Group_6_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2831:1: ( rule__XEvent__Group_6_0_0__0__Impl rule__XEvent__Group_6_0_0__1 )
            // InternalXMachine.g:2832:2: rule__XEvent__Group_6_0_0__0__Impl rule__XEvent__Group_6_0_0__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_0_0__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2839:1: rule__XEvent__Group_6_0_0__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_6_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2843:1: ( ( 'with' ) )
            // InternalXMachine.g:2844:1: ( 'with' )
            {
            // InternalXMachine.g:2844:1: ( 'with' )
            // InternalXMachine.g:2845:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_6_0_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWithKeyword_6_0_0_0()); 

            }


            }

        }
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
    // InternalXMachine.g:2854:1: rule__XEvent__Group_6_0_0__1 : rule__XEvent__Group_6_0_0__1__Impl ;
    public final void rule__XEvent__Group_6_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2858:1: ( rule__XEvent__Group_6_0_0__1__Impl )
            // InternalXMachine.g:2859:2: rule__XEvent__Group_6_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_0_0__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2865:1: rule__XEvent__Group_6_0_0__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* ) ) ;
    public final void rule__XEvent__Group_6_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2869:1: ( ( ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* ) ) )
            // InternalXMachine.g:2870:1: ( ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* ) )
            {
            // InternalXMachine.g:2870:1: ( ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* ) )
            // InternalXMachine.g:2871:2: ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* )
            {
            // InternalXMachine.g:2871:2: ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) )
            // InternalXMachine.g:2872:3: ( rule__XEvent__WitnessesAssignment_6_0_0_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_0_0_1()); 
            // InternalXMachine.g:2873:3: ( rule__XEvent__WitnessesAssignment_6_0_0_1 )
            // InternalXMachine.g:2873:4: rule__XEvent__WitnessesAssignment_6_0_0_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_6_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_0_0_1()); 

            }

            // InternalXMachine.g:2876:2: ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* )
            // InternalXMachine.g:2877:3: ( rule__XEvent__WitnessesAssignment_6_0_0_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_0_0_1()); 
            // InternalXMachine.g:2878:3: ( rule__XEvent__WitnessesAssignment_6_0_0_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_XLABEL) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalXMachine.g:2878:4: rule__XEvent__WitnessesAssignment_6_0_0_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_6_0_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_0_0_1()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:2888:1: rule__XEvent__Group_6_1__0 : rule__XEvent__Group_6_1__0__Impl rule__XEvent__Group_6_1__1 ;
    public final void rule__XEvent__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2892:1: ( rule__XEvent__Group_6_1__0__Impl rule__XEvent__Group_6_1__1 )
            // InternalXMachine.g:2893:2: rule__XEvent__Group_6_1__0__Impl rule__XEvent__Group_6_1__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2900:1: rule__XEvent__Group_6_1__0__Impl : ( 'when' ) ;
    public final void rule__XEvent__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2904:1: ( ( 'when' ) )
            // InternalXMachine.g:2905:1: ( 'when' )
            {
            // InternalXMachine.g:2905:1: ( 'when' )
            // InternalXMachine.g:2906:2: 'when'
            {
             before(grammarAccess.getXEventAccess().getWhenKeyword_6_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWhenKeyword_6_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:2915:1: rule__XEvent__Group_6_1__1 : rule__XEvent__Group_6_1__1__Impl rule__XEvent__Group_6_1__2 ;
    public final void rule__XEvent__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2919:1: ( rule__XEvent__Group_6_1__1__Impl rule__XEvent__Group_6_1__2 )
            // InternalXMachine.g:2920:2: rule__XEvent__Group_6_1__1__Impl rule__XEvent__Group_6_1__2
            {
            pushFollow(FOLLOW_29);
            rule__XEvent__Group_6_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2927:1: rule__XEvent__Group_6_1__1__Impl : ( ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* ) ) ;
    public final void rule__XEvent__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2931:1: ( ( ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* ) ) )
            // InternalXMachine.g:2932:1: ( ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* ) )
            {
            // InternalXMachine.g:2932:1: ( ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* ) )
            // InternalXMachine.g:2933:2: ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* )
            {
            // InternalXMachine.g:2933:2: ( ( rule__XEvent__GuardsAssignment_6_1_1 ) )
            // InternalXMachine.g:2934:3: ( rule__XEvent__GuardsAssignment_6_1_1 )
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_6_1_1()); 
            // InternalXMachine.g:2935:3: ( rule__XEvent__GuardsAssignment_6_1_1 )
            // InternalXMachine.g:2935:4: rule__XEvent__GuardsAssignment_6_1_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__GuardsAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getGuardsAssignment_6_1_1()); 

            }

            // InternalXMachine.g:2938:2: ( ( rule__XEvent__GuardsAssignment_6_1_1 )* )
            // InternalXMachine.g:2939:3: ( rule__XEvent__GuardsAssignment_6_1_1 )*
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_6_1_1()); 
            // InternalXMachine.g:2940:3: ( rule__XEvent__GuardsAssignment_6_1_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_XLABEL) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalXMachine.g:2940:4: rule__XEvent__GuardsAssignment_6_1_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__GuardsAssignment_6_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getGuardsAssignment_6_1_1()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:2949:1: rule__XEvent__Group_6_1__2 : rule__XEvent__Group_6_1__2__Impl rule__XEvent__Group_6_1__3 ;
    public final void rule__XEvent__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2953:1: ( rule__XEvent__Group_6_1__2__Impl rule__XEvent__Group_6_1__3 )
            // InternalXMachine.g:2954:2: rule__XEvent__Group_6_1__2__Impl rule__XEvent__Group_6_1__3
            {
            pushFollow(FOLLOW_29);
            rule__XEvent__Group_6_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1__3();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2961:1: rule__XEvent__Group_6_1__2__Impl : ( ( rule__XEvent__Group_6_1_2__0 )? ) ;
    public final void rule__XEvent__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2965:1: ( ( ( rule__XEvent__Group_6_1_2__0 )? ) )
            // InternalXMachine.g:2966:1: ( ( rule__XEvent__Group_6_1_2__0 )? )
            {
            // InternalXMachine.g:2966:1: ( ( rule__XEvent__Group_6_1_2__0 )? )
            // InternalXMachine.g:2967:2: ( rule__XEvent__Group_6_1_2__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_6_1_2()); 
            // InternalXMachine.g:2968:2: ( rule__XEvent__Group_6_1_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXMachine.g:2968:3: rule__XEvent__Group_6_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_6_1_2()); 

            }


            }

        }
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
    // InternalXMachine.g:2976:1: rule__XEvent__Group_6_1__3 : rule__XEvent__Group_6_1__3__Impl ;
    public final void rule__XEvent__Group_6_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2980:1: ( rule__XEvent__Group_6_1__3__Impl )
            // InternalXMachine.g:2981:2: rule__XEvent__Group_6_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2987:1: rule__XEvent__Group_6_1__3__Impl : ( ( rule__XEvent__Group_6_1_3__0 )? ) ;
    public final void rule__XEvent__Group_6_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2991:1: ( ( ( rule__XEvent__Group_6_1_3__0 )? ) )
            // InternalXMachine.g:2992:1: ( ( rule__XEvent__Group_6_1_3__0 )? )
            {
            // InternalXMachine.g:2992:1: ( ( rule__XEvent__Group_6_1_3__0 )? )
            // InternalXMachine.g:2993:2: ( rule__XEvent__Group_6_1_3__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_6_1_3()); 
            // InternalXMachine.g:2994:2: ( rule__XEvent__Group_6_1_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXMachine.g:2994:3: rule__XEvent__Group_6_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_6_1_3()); 

            }


            }

        }
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
    // InternalXMachine.g:3003:1: rule__XEvent__Group_6_1_2__0 : rule__XEvent__Group_6_1_2__0__Impl rule__XEvent__Group_6_1_2__1 ;
    public final void rule__XEvent__Group_6_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3007:1: ( rule__XEvent__Group_6_1_2__0__Impl rule__XEvent__Group_6_1_2__1 )
            // InternalXMachine.g:3008:2: rule__XEvent__Group_6_1_2__0__Impl rule__XEvent__Group_6_1_2__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1_2__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3015:1: rule__XEvent__Group_6_1_2__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_6_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3019:1: ( ( 'with' ) )
            // InternalXMachine.g:3020:1: ( 'with' )
            {
            // InternalXMachine.g:3020:1: ( 'with' )
            // InternalXMachine.g:3021:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_6_1_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWithKeyword_6_1_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:3030:1: rule__XEvent__Group_6_1_2__1 : rule__XEvent__Group_6_1_2__1__Impl ;
    public final void rule__XEvent__Group_6_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3034:1: ( rule__XEvent__Group_6_1_2__1__Impl )
            // InternalXMachine.g:3035:2: rule__XEvent__Group_6_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3041:1: rule__XEvent__Group_6_1_2__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* ) ) ;
    public final void rule__XEvent__Group_6_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3045:1: ( ( ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* ) ) )
            // InternalXMachine.g:3046:1: ( ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* ) )
            {
            // InternalXMachine.g:3046:1: ( ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* ) )
            // InternalXMachine.g:3047:2: ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* )
            {
            // InternalXMachine.g:3047:2: ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) )
            // InternalXMachine.g:3048:3: ( rule__XEvent__WitnessesAssignment_6_1_2_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_1_2_1()); 
            // InternalXMachine.g:3049:3: ( rule__XEvent__WitnessesAssignment_6_1_2_1 )
            // InternalXMachine.g:3049:4: rule__XEvent__WitnessesAssignment_6_1_2_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_6_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_1_2_1()); 

            }

            // InternalXMachine.g:3052:2: ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* )
            // InternalXMachine.g:3053:3: ( rule__XEvent__WitnessesAssignment_6_1_2_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_1_2_1()); 
            // InternalXMachine.g:3054:3: ( rule__XEvent__WitnessesAssignment_6_1_2_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_XLABEL) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalXMachine.g:3054:4: rule__XEvent__WitnessesAssignment_6_1_2_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_6_1_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_1_2_1()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:3064:1: rule__XEvent__Group_6_1_3__0 : rule__XEvent__Group_6_1_3__0__Impl rule__XEvent__Group_6_1_3__1 ;
    public final void rule__XEvent__Group_6_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3068:1: ( rule__XEvent__Group_6_1_3__0__Impl rule__XEvent__Group_6_1_3__1 )
            // InternalXMachine.g:3069:2: rule__XEvent__Group_6_1_3__0__Impl rule__XEvent__Group_6_1_3__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1_3__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3076:1: rule__XEvent__Group_6_1_3__0__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_6_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3080:1: ( ( 'then' ) )
            // InternalXMachine.g:3081:1: ( 'then' )
            {
            // InternalXMachine.g:3081:1: ( 'then' )
            // InternalXMachine.g:3082:2: 'then'
            {
             before(grammarAccess.getXEventAccess().getThenKeyword_6_1_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getThenKeyword_6_1_3_0()); 

            }


            }

        }
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
    // InternalXMachine.g:3091:1: rule__XEvent__Group_6_1_3__1 : rule__XEvent__Group_6_1_3__1__Impl ;
    public final void rule__XEvent__Group_6_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3095:1: ( rule__XEvent__Group_6_1_3__1__Impl )
            // InternalXMachine.g:3096:2: rule__XEvent__Group_6_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3102:1: rule__XEvent__Group_6_1_3__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* ) ) ;
    public final void rule__XEvent__Group_6_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3106:1: ( ( ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* ) ) )
            // InternalXMachine.g:3107:1: ( ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* ) )
            {
            // InternalXMachine.g:3107:1: ( ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* ) )
            // InternalXMachine.g:3108:2: ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* )
            {
            // InternalXMachine.g:3108:2: ( ( rule__XEvent__ActionsAssignment_6_1_3_1 ) )
            // InternalXMachine.g:3109:3: ( rule__XEvent__ActionsAssignment_6_1_3_1 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_6_1_3_1()); 
            // InternalXMachine.g:3110:3: ( rule__XEvent__ActionsAssignment_6_1_3_1 )
            // InternalXMachine.g:3110:4: rule__XEvent__ActionsAssignment_6_1_3_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_6_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_6_1_3_1()); 

            }

            // InternalXMachine.g:3113:2: ( ( rule__XEvent__ActionsAssignment_6_1_3_1 )* )
            // InternalXMachine.g:3114:3: ( rule__XEvent__ActionsAssignment_6_1_3_1 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_6_1_3_1()); 
            // InternalXMachine.g:3115:3: ( rule__XEvent__ActionsAssignment_6_1_3_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_XLABEL) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalXMachine.g:3115:4: rule__XEvent__ActionsAssignment_6_1_3_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_6_1_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getActionsAssignment_6_1_3_1()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:3125:1: rule__XEvent__Group_6_2__0 : rule__XEvent__Group_6_2__0__Impl rule__XEvent__Group_6_2__1 ;
    public final void rule__XEvent__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3129:1: ( rule__XEvent__Group_6_2__0__Impl rule__XEvent__Group_6_2__1 )
            // InternalXMachine.g:3130:2: rule__XEvent__Group_6_2__0__Impl rule__XEvent__Group_6_2__1
            {
            pushFollow(FOLLOW_4);
            rule__XEvent__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3137:1: rule__XEvent__Group_6_2__0__Impl : ( 'any' ) ;
    public final void rule__XEvent__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3141:1: ( ( 'any' ) )
            // InternalXMachine.g:3142:1: ( 'any' )
            {
            // InternalXMachine.g:3142:1: ( 'any' )
            // InternalXMachine.g:3143:2: 'any'
            {
             before(grammarAccess.getXEventAccess().getAnyKeyword_6_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getAnyKeyword_6_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:3152:1: rule__XEvent__Group_6_2__1 : rule__XEvent__Group_6_2__1__Impl rule__XEvent__Group_6_2__2 ;
    public final void rule__XEvent__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3156:1: ( rule__XEvent__Group_6_2__1__Impl rule__XEvent__Group_6_2__2 )
            // InternalXMachine.g:3157:2: rule__XEvent__Group_6_2__1__Impl rule__XEvent__Group_6_2__2
            {
            pushFollow(FOLLOW_30);
            rule__XEvent__Group_6_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3164:1: rule__XEvent__Group_6_2__1__Impl : ( ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* ) ) ;
    public final void rule__XEvent__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3168:1: ( ( ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* ) ) )
            // InternalXMachine.g:3169:1: ( ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* ) )
            {
            // InternalXMachine.g:3169:1: ( ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* ) )
            // InternalXMachine.g:3170:2: ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* )
            {
            // InternalXMachine.g:3170:2: ( ( rule__XEvent__ParametersAssignment_6_2_1 ) )
            // InternalXMachine.g:3171:3: ( rule__XEvent__ParametersAssignment_6_2_1 )
            {
             before(grammarAccess.getXEventAccess().getParametersAssignment_6_2_1()); 
            // InternalXMachine.g:3172:3: ( rule__XEvent__ParametersAssignment_6_2_1 )
            // InternalXMachine.g:3172:4: rule__XEvent__ParametersAssignment_6_2_1
            {
            pushFollow(FOLLOW_8);
            rule__XEvent__ParametersAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getParametersAssignment_6_2_1()); 

            }

            // InternalXMachine.g:3175:2: ( ( rule__XEvent__ParametersAssignment_6_2_1 )* )
            // InternalXMachine.g:3176:3: ( rule__XEvent__ParametersAssignment_6_2_1 )*
            {
             before(grammarAccess.getXEventAccess().getParametersAssignment_6_2_1()); 
            // InternalXMachine.g:3177:3: ( rule__XEvent__ParametersAssignment_6_2_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalXMachine.g:3177:4: rule__XEvent__ParametersAssignment_6_2_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XEvent__ParametersAssignment_6_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getParametersAssignment_6_2_1()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:3186:1: rule__XEvent__Group_6_2__2 : rule__XEvent__Group_6_2__2__Impl rule__XEvent__Group_6_2__3 ;
    public final void rule__XEvent__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3190:1: ( rule__XEvent__Group_6_2__2__Impl rule__XEvent__Group_6_2__3 )
            // InternalXMachine.g:3191:2: rule__XEvent__Group_6_2__2__Impl rule__XEvent__Group_6_2__3
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__3();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3198:1: rule__XEvent__Group_6_2__2__Impl : ( 'where' ) ;
    public final void rule__XEvent__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3202:1: ( ( 'where' ) )
            // InternalXMachine.g:3203:1: ( 'where' )
            {
            // InternalXMachine.g:3203:1: ( 'where' )
            // InternalXMachine.g:3204:2: 'where'
            {
             before(grammarAccess.getXEventAccess().getWhereKeyword_6_2_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWhereKeyword_6_2_2()); 

            }


            }

        }
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
    // InternalXMachine.g:3213:1: rule__XEvent__Group_6_2__3 : rule__XEvent__Group_6_2__3__Impl rule__XEvent__Group_6_2__4 ;
    public final void rule__XEvent__Group_6_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3217:1: ( rule__XEvent__Group_6_2__3__Impl rule__XEvent__Group_6_2__4 )
            // InternalXMachine.g:3218:2: rule__XEvent__Group_6_2__3__Impl rule__XEvent__Group_6_2__4
            {
            pushFollow(FOLLOW_29);
            rule__XEvent__Group_6_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__4();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3225:1: rule__XEvent__Group_6_2__3__Impl : ( ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* ) ) ;
    public final void rule__XEvent__Group_6_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3229:1: ( ( ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* ) ) )
            // InternalXMachine.g:3230:1: ( ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* ) )
            {
            // InternalXMachine.g:3230:1: ( ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* ) )
            // InternalXMachine.g:3231:2: ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* )
            {
            // InternalXMachine.g:3231:2: ( ( rule__XEvent__GuardsAssignment_6_2_3 ) )
            // InternalXMachine.g:3232:3: ( rule__XEvent__GuardsAssignment_6_2_3 )
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_6_2_3()); 
            // InternalXMachine.g:3233:3: ( rule__XEvent__GuardsAssignment_6_2_3 )
            // InternalXMachine.g:3233:4: rule__XEvent__GuardsAssignment_6_2_3
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__GuardsAssignment_6_2_3();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getGuardsAssignment_6_2_3()); 

            }

            // InternalXMachine.g:3236:2: ( ( rule__XEvent__GuardsAssignment_6_2_3 )* )
            // InternalXMachine.g:3237:3: ( rule__XEvent__GuardsAssignment_6_2_3 )*
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_6_2_3()); 
            // InternalXMachine.g:3238:3: ( rule__XEvent__GuardsAssignment_6_2_3 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_XLABEL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalXMachine.g:3238:4: rule__XEvent__GuardsAssignment_6_2_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__GuardsAssignment_6_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getGuardsAssignment_6_2_3()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:3247:1: rule__XEvent__Group_6_2__4 : rule__XEvent__Group_6_2__4__Impl rule__XEvent__Group_6_2__5 ;
    public final void rule__XEvent__Group_6_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3251:1: ( rule__XEvent__Group_6_2__4__Impl rule__XEvent__Group_6_2__5 )
            // InternalXMachine.g:3252:2: rule__XEvent__Group_6_2__4__Impl rule__XEvent__Group_6_2__5
            {
            pushFollow(FOLLOW_29);
            rule__XEvent__Group_6_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__5();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3259:1: rule__XEvent__Group_6_2__4__Impl : ( ( rule__XEvent__Group_6_2_4__0 )? ) ;
    public final void rule__XEvent__Group_6_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3263:1: ( ( ( rule__XEvent__Group_6_2_4__0 )? ) )
            // InternalXMachine.g:3264:1: ( ( rule__XEvent__Group_6_2_4__0 )? )
            {
            // InternalXMachine.g:3264:1: ( ( rule__XEvent__Group_6_2_4__0 )? )
            // InternalXMachine.g:3265:2: ( rule__XEvent__Group_6_2_4__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_6_2_4()); 
            // InternalXMachine.g:3266:2: ( rule__XEvent__Group_6_2_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXMachine.g:3266:3: rule__XEvent__Group_6_2_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_2_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_6_2_4()); 

            }


            }

        }
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
    // InternalXMachine.g:3274:1: rule__XEvent__Group_6_2__5 : rule__XEvent__Group_6_2__5__Impl ;
    public final void rule__XEvent__Group_6_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3278:1: ( rule__XEvent__Group_6_2__5__Impl )
            // InternalXMachine.g:3279:2: rule__XEvent__Group_6_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3285:1: rule__XEvent__Group_6_2__5__Impl : ( ( rule__XEvent__Group_6_2_5__0 )? ) ;
    public final void rule__XEvent__Group_6_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3289:1: ( ( ( rule__XEvent__Group_6_2_5__0 )? ) )
            // InternalXMachine.g:3290:1: ( ( rule__XEvent__Group_6_2_5__0 )? )
            {
            // InternalXMachine.g:3290:1: ( ( rule__XEvent__Group_6_2_5__0 )? )
            // InternalXMachine.g:3291:2: ( rule__XEvent__Group_6_2_5__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_6_2_5()); 
            // InternalXMachine.g:3292:2: ( rule__XEvent__Group_6_2_5__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXMachine.g:3292:3: rule__XEvent__Group_6_2_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_2_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_6_2_5()); 

            }


            }

        }
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
    // InternalXMachine.g:3301:1: rule__XEvent__Group_6_2_4__0 : rule__XEvent__Group_6_2_4__0__Impl rule__XEvent__Group_6_2_4__1 ;
    public final void rule__XEvent__Group_6_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3305:1: ( rule__XEvent__Group_6_2_4__0__Impl rule__XEvent__Group_6_2_4__1 )
            // InternalXMachine.g:3306:2: rule__XEvent__Group_6_2_4__0__Impl rule__XEvent__Group_6_2_4__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2_4__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3313:1: rule__XEvent__Group_6_2_4__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_6_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3317:1: ( ( 'with' ) )
            // InternalXMachine.g:3318:1: ( 'with' )
            {
            // InternalXMachine.g:3318:1: ( 'with' )
            // InternalXMachine.g:3319:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_6_2_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWithKeyword_6_2_4_0()); 

            }


            }

        }
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
    // InternalXMachine.g:3328:1: rule__XEvent__Group_6_2_4__1 : rule__XEvent__Group_6_2_4__1__Impl ;
    public final void rule__XEvent__Group_6_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3332:1: ( rule__XEvent__Group_6_2_4__1__Impl )
            // InternalXMachine.g:3333:2: rule__XEvent__Group_6_2_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2_4__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3339:1: rule__XEvent__Group_6_2_4__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* ) ) ;
    public final void rule__XEvent__Group_6_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3343:1: ( ( ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* ) ) )
            // InternalXMachine.g:3344:1: ( ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* ) )
            {
            // InternalXMachine.g:3344:1: ( ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* ) )
            // InternalXMachine.g:3345:2: ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* )
            {
            // InternalXMachine.g:3345:2: ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) )
            // InternalXMachine.g:3346:3: ( rule__XEvent__WitnessesAssignment_6_2_4_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_2_4_1()); 
            // InternalXMachine.g:3347:3: ( rule__XEvent__WitnessesAssignment_6_2_4_1 )
            // InternalXMachine.g:3347:4: rule__XEvent__WitnessesAssignment_6_2_4_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_6_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_2_4_1()); 

            }

            // InternalXMachine.g:3350:2: ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* )
            // InternalXMachine.g:3351:3: ( rule__XEvent__WitnessesAssignment_6_2_4_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_2_4_1()); 
            // InternalXMachine.g:3352:3: ( rule__XEvent__WitnessesAssignment_6_2_4_1 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_XLABEL) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalXMachine.g:3352:4: rule__XEvent__WitnessesAssignment_6_2_4_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_6_2_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_2_4_1()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:3362:1: rule__XEvent__Group_6_2_5__0 : rule__XEvent__Group_6_2_5__0__Impl rule__XEvent__Group_6_2_5__1 ;
    public final void rule__XEvent__Group_6_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3366:1: ( rule__XEvent__Group_6_2_5__0__Impl rule__XEvent__Group_6_2_5__1 )
            // InternalXMachine.g:3367:2: rule__XEvent__Group_6_2_5__0__Impl rule__XEvent__Group_6_2_5__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_2_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2_5__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3374:1: rule__XEvent__Group_6_2_5__0__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_6_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3378:1: ( ( 'then' ) )
            // InternalXMachine.g:3379:1: ( 'then' )
            {
            // InternalXMachine.g:3379:1: ( 'then' )
            // InternalXMachine.g:3380:2: 'then'
            {
             before(grammarAccess.getXEventAccess().getThenKeyword_6_2_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getThenKeyword_6_2_5_0()); 

            }


            }

        }
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
    // InternalXMachine.g:3389:1: rule__XEvent__Group_6_2_5__1 : rule__XEvent__Group_6_2_5__1__Impl ;
    public final void rule__XEvent__Group_6_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3393:1: ( rule__XEvent__Group_6_2_5__1__Impl )
            // InternalXMachine.g:3394:2: rule__XEvent__Group_6_2_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2_5__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3400:1: rule__XEvent__Group_6_2_5__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* ) ) ;
    public final void rule__XEvent__Group_6_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3404:1: ( ( ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* ) ) )
            // InternalXMachine.g:3405:1: ( ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* ) )
            {
            // InternalXMachine.g:3405:1: ( ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* ) )
            // InternalXMachine.g:3406:2: ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* )
            {
            // InternalXMachine.g:3406:2: ( ( rule__XEvent__ActionsAssignment_6_2_5_1 ) )
            // InternalXMachine.g:3407:3: ( rule__XEvent__ActionsAssignment_6_2_5_1 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_6_2_5_1()); 
            // InternalXMachine.g:3408:3: ( rule__XEvent__ActionsAssignment_6_2_5_1 )
            // InternalXMachine.g:3408:4: rule__XEvent__ActionsAssignment_6_2_5_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_6_2_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_6_2_5_1()); 

            }

            // InternalXMachine.g:3411:2: ( ( rule__XEvent__ActionsAssignment_6_2_5_1 )* )
            // InternalXMachine.g:3412:3: ( rule__XEvent__ActionsAssignment_6_2_5_1 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_6_2_5_1()); 
            // InternalXMachine.g:3413:3: ( rule__XEvent__ActionsAssignment_6_2_5_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_XLABEL) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalXMachine.g:3413:4: rule__XEvent__ActionsAssignment_6_2_5_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_6_2_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getActionsAssignment_6_2_5_1()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:3423:1: rule__EventSync__Group__0 : rule__EventSync__Group__0__Impl rule__EventSync__Group__1 ;
    public final void rule__EventSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3427:1: ( rule__EventSync__Group__0__Impl rule__EventSync__Group__1 )
            // InternalXMachine.g:3428:2: rule__EventSync__Group__0__Impl rule__EventSync__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__EventSync__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSync__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3435:1: rule__EventSync__Group__0__Impl : ( () ) ;
    public final void rule__EventSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3439:1: ( ( () ) )
            // InternalXMachine.g:3440:1: ( () )
            {
            // InternalXMachine.g:3440:1: ( () )
            // InternalXMachine.g:3441:2: ()
            {
             before(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 
            // InternalXMachine.g:3442:2: ()
            // InternalXMachine.g:3442:3: 
            {
            }

             after(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 

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
    // InternalXMachine.g:3450:1: rule__EventSync__Group__1 : rule__EventSync__Group__1__Impl ;
    public final void rule__EventSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3454:1: ( rule__EventSync__Group__1__Impl )
            // InternalXMachine.g:3455:2: rule__EventSync__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3461:1: rule__EventSync__Group__1__Impl : ( ( rule__EventSync__Group_1__0 ) ) ;
    public final void rule__EventSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3465:1: ( ( ( rule__EventSync__Group_1__0 ) ) )
            // InternalXMachine.g:3466:1: ( ( rule__EventSync__Group_1__0 ) )
            {
            // InternalXMachine.g:3466:1: ( ( rule__EventSync__Group_1__0 ) )
            // InternalXMachine.g:3467:2: ( rule__EventSync__Group_1__0 )
            {
             before(grammarAccess.getEventSyncAccess().getGroup_1()); 
            // InternalXMachine.g:3468:2: ( rule__EventSync__Group_1__0 )
            // InternalXMachine.g:3468:3: rule__EventSync__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEventSyncAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3477:1: rule__EventSync__Group_1__0 : rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 ;
    public final void rule__EventSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3481:1: ( rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 )
            // InternalXMachine.g:3482:2: rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__EventSync__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3489:1: rule__EventSync__Group_1__0__Impl : ( 'synchronises' ) ;
    public final void rule__EventSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3493:1: ( ( 'synchronises' ) )
            // InternalXMachine.g:3494:1: ( 'synchronises' )
            {
            // InternalXMachine.g:3494:1: ( 'synchronises' )
            // InternalXMachine.g:3495:2: 'synchronises'
            {
             before(grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:3504:1: rule__EventSync__Group_1__1 : rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 ;
    public final void rule__EventSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3508:1: ( rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 )
            // InternalXMachine.g:3509:2: rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__EventSync__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3516:1: rule__EventSync__Group_1__1__Impl : ( ( rule__EventSync__Group_1_1__0 )? ) ;
    public final void rule__EventSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3520:1: ( ( ( rule__EventSync__Group_1_1__0 )? ) )
            // InternalXMachine.g:3521:1: ( ( rule__EventSync__Group_1_1__0 )? )
            {
            // InternalXMachine.g:3521:1: ( ( rule__EventSync__Group_1_1__0 )? )
            // InternalXMachine.g:3522:2: ( rule__EventSync__Group_1_1__0 )?
            {
             before(grammarAccess.getEventSyncAccess().getGroup_1_1()); 
            // InternalXMachine.g:3523:2: ( rule__EventSync__Group_1_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==28) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalXMachine.g:3523:3: rule__EventSync__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventSync__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventSyncAccess().getGroup_1_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3531:1: rule__EventSync__Group_1__2 : rule__EventSync__Group_1__2__Impl ;
    public final void rule__EventSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3535:1: ( rule__EventSync__Group_1__2__Impl )
            // InternalXMachine.g:3536:2: rule__EventSync__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3542:1: rule__EventSync__Group_1__2__Impl : ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) ;
    public final void rule__EventSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3546:1: ( ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) )
            // InternalXMachine.g:3547:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            {
            // InternalXMachine.g:3547:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            // InternalXMachine.g:3548:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            {
             before(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2()); 
            // InternalXMachine.g:3549:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            // InternalXMachine.g:3549:3: rule__EventSync__SynchronisedEventAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__SynchronisedEventAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2()); 

            }


            }

        }
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
    // InternalXMachine.g:3558:1: rule__EventSync__Group_1_1__0 : rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 ;
    public final void rule__EventSync__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3562:1: ( rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 )
            // InternalXMachine.g:3563:2: rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1
            {
            pushFollow(FOLLOW_16);
            rule__EventSync__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1_1__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3570:1: rule__EventSync__Group_1_1__0__Impl : ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) ;
    public final void rule__EventSync__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3574:1: ( ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) )
            // InternalXMachine.g:3575:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            {
            // InternalXMachine.g:3575:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            // InternalXMachine.g:3576:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            {
             before(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0()); 
            // InternalXMachine.g:3577:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            // InternalXMachine.g:3577:3: rule__EventSync__PrefixAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__PrefixAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:3585:1: rule__EventSync__Group_1_1__1 : rule__EventSync__Group_1_1__1__Impl ;
    public final void rule__EventSync__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3589:1: ( rule__EventSync__Group_1_1__1__Impl )
            // InternalXMachine.g:3590:2: rule__EventSync__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3596:1: rule__EventSync__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__EventSync__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3600:1: ( ( '.' ) )
            // InternalXMachine.g:3601:1: ( '.' )
            {
            // InternalXMachine.g:3601:1: ( '.' )
            // InternalXMachine.g:3602:2: '.'
            {
             before(grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3612:1: rule__GroupSync__Group__0 : rule__GroupSync__Group__0__Impl rule__GroupSync__Group__1 ;
    public final void rule__GroupSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3616:1: ( rule__GroupSync__Group__0__Impl rule__GroupSync__Group__1 )
            // InternalXMachine.g:3617:2: rule__GroupSync__Group__0__Impl rule__GroupSync__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__GroupSync__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupSync__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3624:1: rule__GroupSync__Group__0__Impl : ( () ) ;
    public final void rule__GroupSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3628:1: ( ( () ) )
            // InternalXMachine.g:3629:1: ( () )
            {
            // InternalXMachine.g:3629:1: ( () )
            // InternalXMachine.g:3630:2: ()
            {
             before(grammarAccess.getGroupSyncAccess().getEventSynchronisationAction_0()); 
            // InternalXMachine.g:3631:2: ()
            // InternalXMachine.g:3631:3: 
            {
            }

             after(grammarAccess.getGroupSyncAccess().getEventSynchronisationAction_0()); 

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
    // InternalXMachine.g:3639:1: rule__GroupSync__Group__1 : rule__GroupSync__Group__1__Impl rule__GroupSync__Group__2 ;
    public final void rule__GroupSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3643:1: ( rule__GroupSync__Group__1__Impl rule__GroupSync__Group__2 )
            // InternalXMachine.g:3644:2: rule__GroupSync__Group__1__Impl rule__GroupSync__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__GroupSync__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupSync__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3651:1: rule__GroupSync__Group__1__Impl : ( ( rule__GroupSync__Group_1__0 ) ) ;
    public final void rule__GroupSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3655:1: ( ( ( rule__GroupSync__Group_1__0 ) ) )
            // InternalXMachine.g:3656:1: ( ( rule__GroupSync__Group_1__0 ) )
            {
            // InternalXMachine.g:3656:1: ( ( rule__GroupSync__Group_1__0 ) )
            // InternalXMachine.g:3657:2: ( rule__GroupSync__Group_1__0 )
            {
             before(grammarAccess.getGroupSyncAccess().getGroup_1()); 
            // InternalXMachine.g:3658:2: ( rule__GroupSync__Group_1__0 )
            // InternalXMachine.g:3658:3: rule__GroupSync__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupSyncAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3666:1: rule__GroupSync__Group__2 : rule__GroupSync__Group__2__Impl ;
    public final void rule__GroupSync__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3670:1: ( rule__GroupSync__Group__2__Impl )
            // InternalXMachine.g:3671:2: rule__GroupSync__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3677:1: rule__GroupSync__Group__2__Impl : ( ( rule__GroupSync__Group_2__0 )? ) ;
    public final void rule__GroupSync__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3681:1: ( ( ( rule__GroupSync__Group_2__0 )? ) )
            // InternalXMachine.g:3682:1: ( ( rule__GroupSync__Group_2__0 )? )
            {
            // InternalXMachine.g:3682:1: ( ( rule__GroupSync__Group_2__0 )? )
            // InternalXMachine.g:3683:2: ( rule__GroupSync__Group_2__0 )?
            {
             before(grammarAccess.getGroupSyncAccess().getGroup_2()); 
            // InternalXMachine.g:3684:2: ( rule__GroupSync__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==31) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:3684:3: rule__GroupSync__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroupSync__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupSyncAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalXMachine.g:3693:1: rule__GroupSync__Group_1__0 : rule__GroupSync__Group_1__0__Impl rule__GroupSync__Group_1__1 ;
    public final void rule__GroupSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3697:1: ( rule__GroupSync__Group_1__0__Impl rule__GroupSync__Group_1__1 )
            // InternalXMachine.g:3698:2: rule__GroupSync__Group_1__0__Impl rule__GroupSync__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__GroupSync__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3705:1: rule__GroupSync__Group_1__0__Impl : ( 'synchronisesGroup' ) ;
    public final void rule__GroupSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3709:1: ( ( 'synchronisesGroup' ) )
            // InternalXMachine.g:3710:1: ( 'synchronisesGroup' )
            {
            // InternalXMachine.g:3710:1: ( 'synchronisesGroup' )
            // InternalXMachine.g:3711:2: 'synchronisesGroup'
            {
             before(grammarAccess.getGroupSyncAccess().getSynchronisesGroupKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getGroupSyncAccess().getSynchronisesGroupKeyword_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:3720:1: rule__GroupSync__Group_1__1 : rule__GroupSync__Group_1__1__Impl rule__GroupSync__Group_1__2 ;
    public final void rule__GroupSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3724:1: ( rule__GroupSync__Group_1__1__Impl rule__GroupSync__Group_1__2 )
            // InternalXMachine.g:3725:2: rule__GroupSync__Group_1__1__Impl rule__GroupSync__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__GroupSync__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3732:1: rule__GroupSync__Group_1__1__Impl : ( ( rule__GroupSync__Group_1_1__0 )? ) ;
    public final void rule__GroupSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3736:1: ( ( ( rule__GroupSync__Group_1_1__0 )? ) )
            // InternalXMachine.g:3737:1: ( ( rule__GroupSync__Group_1_1__0 )? )
            {
            // InternalXMachine.g:3737:1: ( ( rule__GroupSync__Group_1_1__0 )? )
            // InternalXMachine.g:3738:2: ( rule__GroupSync__Group_1_1__0 )?
            {
             before(grammarAccess.getGroupSyncAccess().getGroup_1_1()); 
            // InternalXMachine.g:3739:2: ( rule__GroupSync__Group_1_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==28) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:3739:3: rule__GroupSync__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroupSync__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupSyncAccess().getGroup_1_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3747:1: rule__GroupSync__Group_1__2 : rule__GroupSync__Group_1__2__Impl ;
    public final void rule__GroupSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3751:1: ( rule__GroupSync__Group_1__2__Impl )
            // InternalXMachine.g:3752:2: rule__GroupSync__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3758:1: rule__GroupSync__Group_1__2__Impl : ( ( rule__GroupSync__SynchronisedCasesAssignment_1_2 ) ) ;
    public final void rule__GroupSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3762:1: ( ( ( rule__GroupSync__SynchronisedCasesAssignment_1_2 ) ) )
            // InternalXMachine.g:3763:1: ( ( rule__GroupSync__SynchronisedCasesAssignment_1_2 ) )
            {
            // InternalXMachine.g:3763:1: ( ( rule__GroupSync__SynchronisedCasesAssignment_1_2 ) )
            // InternalXMachine.g:3764:2: ( rule__GroupSync__SynchronisedCasesAssignment_1_2 )
            {
             before(grammarAccess.getGroupSyncAccess().getSynchronisedCasesAssignment_1_2()); 
            // InternalXMachine.g:3765:2: ( rule__GroupSync__SynchronisedCasesAssignment_1_2 )
            // InternalXMachine.g:3765:3: rule__GroupSync__SynchronisedCasesAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__SynchronisedCasesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupSyncAccess().getSynchronisedCasesAssignment_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__GroupSync__Group_1_1__0"
    // InternalXMachine.g:3774:1: rule__GroupSync__Group_1_1__0 : rule__GroupSync__Group_1_1__0__Impl rule__GroupSync__Group_1_1__1 ;
    public final void rule__GroupSync__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3778:1: ( rule__GroupSync__Group_1_1__0__Impl rule__GroupSync__Group_1_1__1 )
            // InternalXMachine.g:3779:2: rule__GroupSync__Group_1_1__0__Impl rule__GroupSync__Group_1_1__1
            {
            pushFollow(FOLLOW_16);
            rule__GroupSync__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_1_1__0"


    // $ANTLR start "rule__GroupSync__Group_1_1__0__Impl"
    // InternalXMachine.g:3786:1: rule__GroupSync__Group_1_1__0__Impl : ( ( rule__GroupSync__PrefixAssignment_1_1_0 ) ) ;
    public final void rule__GroupSync__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3790:1: ( ( ( rule__GroupSync__PrefixAssignment_1_1_0 ) ) )
            // InternalXMachine.g:3791:1: ( ( rule__GroupSync__PrefixAssignment_1_1_0 ) )
            {
            // InternalXMachine.g:3791:1: ( ( rule__GroupSync__PrefixAssignment_1_1_0 ) )
            // InternalXMachine.g:3792:2: ( rule__GroupSync__PrefixAssignment_1_1_0 )
            {
             before(grammarAccess.getGroupSyncAccess().getPrefixAssignment_1_1_0()); 
            // InternalXMachine.g:3793:2: ( rule__GroupSync__PrefixAssignment_1_1_0 )
            // InternalXMachine.g:3793:3: rule__GroupSync__PrefixAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__PrefixAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupSyncAccess().getPrefixAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_1_1__0__Impl"


    // $ANTLR start "rule__GroupSync__Group_1_1__1"
    // InternalXMachine.g:3801:1: rule__GroupSync__Group_1_1__1 : rule__GroupSync__Group_1_1__1__Impl ;
    public final void rule__GroupSync__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3805:1: ( rule__GroupSync__Group_1_1__1__Impl )
            // InternalXMachine.g:3806:2: rule__GroupSync__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_1_1__1"


    // $ANTLR start "rule__GroupSync__Group_1_1__1__Impl"
    // InternalXMachine.g:3812:1: rule__GroupSync__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__GroupSync__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3816:1: ( ( '.' ) )
            // InternalXMachine.g:3817:1: ( '.' )
            {
            // InternalXMachine.g:3817:1: ( '.' )
            // InternalXMachine.g:3818:2: '.'
            {
             before(grammarAccess.getGroupSyncAccess().getFullStopKeyword_1_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGroupSyncAccess().getFullStopKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__Group_1_1__1__Impl"


    // $ANTLR start "rule__GroupSync__Group_2__0"
    // InternalXMachine.g:3828:1: rule__GroupSync__Group_2__0 : rule__GroupSync__Group_2__0__Impl rule__GroupSync__Group_2__1 ;
    public final void rule__GroupSync__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3832:1: ( rule__GroupSync__Group_2__0__Impl rule__GroupSync__Group_2__1 )
            // InternalXMachine.g:3833:2: rule__GroupSync__Group_2__0__Impl rule__GroupSync__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__GroupSync__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3840:1: rule__GroupSync__Group_2__0__Impl : ( '(' ) ;
    public final void rule__GroupSync__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3844:1: ( ( '(' ) )
            // InternalXMachine.g:3845:1: ( '(' )
            {
            // InternalXMachine.g:3845:1: ( '(' )
            // InternalXMachine.g:3846:2: '('
            {
             before(grammarAccess.getGroupSyncAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGroupSyncAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:3855:1: rule__GroupSync__Group_2__1 : rule__GroupSync__Group_2__1__Impl rule__GroupSync__Group_2__2 ;
    public final void rule__GroupSync__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3859:1: ( rule__GroupSync__Group_2__1__Impl rule__GroupSync__Group_2__2 )
            // InternalXMachine.g:3860:2: rule__GroupSync__Group_2__1__Impl rule__GroupSync__Group_2__2
            {
            pushFollow(FOLLOW_22);
            rule__GroupSync__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_2__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3867:1: rule__GroupSync__Group_2__1__Impl : ( ( rule__GroupSync__ActualParametersAssignment_2_1 ) ) ;
    public final void rule__GroupSync__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3871:1: ( ( ( rule__GroupSync__ActualParametersAssignment_2_1 ) ) )
            // InternalXMachine.g:3872:1: ( ( rule__GroupSync__ActualParametersAssignment_2_1 ) )
            {
            // InternalXMachine.g:3872:1: ( ( rule__GroupSync__ActualParametersAssignment_2_1 ) )
            // InternalXMachine.g:3873:2: ( rule__GroupSync__ActualParametersAssignment_2_1 )
            {
             before(grammarAccess.getGroupSyncAccess().getActualParametersAssignment_2_1()); 
            // InternalXMachine.g:3874:2: ( rule__GroupSync__ActualParametersAssignment_2_1 )
            // InternalXMachine.g:3874:3: rule__GroupSync__ActualParametersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__ActualParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupSyncAccess().getActualParametersAssignment_2_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3882:1: rule__GroupSync__Group_2__2 : rule__GroupSync__Group_2__2__Impl rule__GroupSync__Group_2__3 ;
    public final void rule__GroupSync__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3886:1: ( rule__GroupSync__Group_2__2__Impl rule__GroupSync__Group_2__3 )
            // InternalXMachine.g:3887:2: rule__GroupSync__Group_2__2__Impl rule__GroupSync__Group_2__3
            {
            pushFollow(FOLLOW_22);
            rule__GroupSync__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_2__3();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3894:1: rule__GroupSync__Group_2__2__Impl : ( ( rule__GroupSync__Group_2_2__0 )* ) ;
    public final void rule__GroupSync__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3898:1: ( ( ( rule__GroupSync__Group_2_2__0 )* ) )
            // InternalXMachine.g:3899:1: ( ( rule__GroupSync__Group_2_2__0 )* )
            {
            // InternalXMachine.g:3899:1: ( ( rule__GroupSync__Group_2_2__0 )* )
            // InternalXMachine.g:3900:2: ( rule__GroupSync__Group_2_2__0 )*
            {
             before(grammarAccess.getGroupSyncAccess().getGroup_2_2()); 
            // InternalXMachine.g:3901:2: ( rule__GroupSync__Group_2_2__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==33) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalXMachine.g:3901:3: rule__GroupSync__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__GroupSync__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getGroupSyncAccess().getGroup_2_2()); 

            }


            }

        }
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
    // InternalXMachine.g:3909:1: rule__GroupSync__Group_2__3 : rule__GroupSync__Group_2__3__Impl ;
    public final void rule__GroupSync__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3913:1: ( rule__GroupSync__Group_2__3__Impl )
            // InternalXMachine.g:3914:2: rule__GroupSync__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_2__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3920:1: rule__GroupSync__Group_2__3__Impl : ( ')' ) ;
    public final void rule__GroupSync__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3924:1: ( ( ')' ) )
            // InternalXMachine.g:3925:1: ( ')' )
            {
            // InternalXMachine.g:3925:1: ( ')' )
            // InternalXMachine.g:3926:2: ')'
            {
             before(grammarAccess.getGroupSyncAccess().getRightParenthesisKeyword_2_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGroupSyncAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
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
    // InternalXMachine.g:3936:1: rule__GroupSync__Group_2_2__0 : rule__GroupSync__Group_2_2__0__Impl rule__GroupSync__Group_2_2__1 ;
    public final void rule__GroupSync__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3940:1: ( rule__GroupSync__Group_2_2__0__Impl rule__GroupSync__Group_2_2__1 )
            // InternalXMachine.g:3941:2: rule__GroupSync__Group_2_2__0__Impl rule__GroupSync__Group_2_2__1
            {
            pushFollow(FOLLOW_4);
            rule__GroupSync__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_2_2__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3948:1: rule__GroupSync__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__GroupSync__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3952:1: ( ( ',' ) )
            // InternalXMachine.g:3953:1: ( ',' )
            {
            // InternalXMachine.g:3953:1: ( ',' )
            // InternalXMachine.g:3954:2: ','
            {
             before(grammarAccess.getGroupSyncAccess().getCommaKeyword_2_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGroupSyncAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:3963:1: rule__GroupSync__Group_2_2__1 : rule__GroupSync__Group_2_2__1__Impl ;
    public final void rule__GroupSync__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3967:1: ( rule__GroupSync__Group_2_2__1__Impl )
            // InternalXMachine.g:3968:2: rule__GroupSync__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3974:1: rule__GroupSync__Group_2_2__1__Impl : ( ( rule__GroupSync__ActualParametersAssignment_2_2_1 ) ) ;
    public final void rule__GroupSync__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3978:1: ( ( ( rule__GroupSync__ActualParametersAssignment_2_2_1 ) ) )
            // InternalXMachine.g:3979:1: ( ( rule__GroupSync__ActualParametersAssignment_2_2_1 ) )
            {
            // InternalXMachine.g:3979:1: ( ( rule__GroupSync__ActualParametersAssignment_2_2_1 ) )
            // InternalXMachine.g:3980:2: ( rule__GroupSync__ActualParametersAssignment_2_2_1 )
            {
             before(grammarAccess.getGroupSyncAccess().getActualParametersAssignment_2_2_1()); 
            // InternalXMachine.g:3981:2: ( rule__GroupSync__ActualParametersAssignment_2_2_1 )
            // InternalXMachine.g:3981:3: rule__GroupSync__ActualParametersAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__ActualParametersAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupSyncAccess().getActualParametersAssignment_2_2_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3990:1: rule__XParameter__Group__0 : rule__XParameter__Group__0__Impl rule__XParameter__Group__1 ;
    public final void rule__XParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3994:1: ( rule__XParameter__Group__0__Impl rule__XParameter__Group__1 )
            // InternalXMachine.g:3995:2: rule__XParameter__Group__0__Impl rule__XParameter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__XParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XParameter__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:4002:1: rule__XParameter__Group__0__Impl : ( () ) ;
    public final void rule__XParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4006:1: ( ( () ) )
            // InternalXMachine.g:4007:1: ( () )
            {
            // InternalXMachine.g:4007:1: ( () )
            // InternalXMachine.g:4008:2: ()
            {
             before(grammarAccess.getXParameterAccess().getParameterAction_0()); 
            // InternalXMachine.g:4009:2: ()
            // InternalXMachine.g:4009:3: 
            {
            }

             after(grammarAccess.getXParameterAccess().getParameterAction_0()); 

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
    // InternalXMachine.g:4017:1: rule__XParameter__Group__1 : rule__XParameter__Group__1__Impl ;
    public final void rule__XParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4021:1: ( rule__XParameter__Group__1__Impl )
            // InternalXMachine.g:4022:2: rule__XParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:4028:1: rule__XParameter__Group__1__Impl : ( ( rule__XParameter__NameAssignment_1 ) ) ;
    public final void rule__XParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4032:1: ( ( ( rule__XParameter__NameAssignment_1 ) ) )
            // InternalXMachine.g:4033:1: ( ( rule__XParameter__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4033:1: ( ( rule__XParameter__NameAssignment_1 ) )
            // InternalXMachine.g:4034:2: ( rule__XParameter__NameAssignment_1 )
            {
             before(grammarAccess.getXParameterAccess().getNameAssignment_1()); 
            // InternalXMachine.g:4035:2: ( rule__XParameter__NameAssignment_1 )
            // InternalXMachine.g:4035:3: rule__XParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXParameterAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:4044:1: rule__XGuard__Group__0 : rule__XGuard__Group__0__Impl rule__XGuard__Group__1 ;
    public final void rule__XGuard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4048:1: ( rule__XGuard__Group__0__Impl rule__XGuard__Group__1 )
            // InternalXMachine.g:4049:2: rule__XGuard__Group__0__Impl rule__XGuard__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XGuard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuard__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:4056:1: rule__XGuard__Group__0__Impl : ( () ) ;
    public final void rule__XGuard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4060:1: ( ( () ) )
            // InternalXMachine.g:4061:1: ( () )
            {
            // InternalXMachine.g:4061:1: ( () )
            // InternalXMachine.g:4062:2: ()
            {
             before(grammarAccess.getXGuardAccess().getGuardAction_0()); 
            // InternalXMachine.g:4063:2: ()
            // InternalXMachine.g:4063:3: 
            {
            }

             after(grammarAccess.getXGuardAccess().getGuardAction_0()); 

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
    // InternalXMachine.g:4071:1: rule__XGuard__Group__1 : rule__XGuard__Group__1__Impl rule__XGuard__Group__2 ;
    public final void rule__XGuard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4075:1: ( rule__XGuard__Group__1__Impl rule__XGuard__Group__2 )
            // InternalXMachine.g:4076:2: rule__XGuard__Group__1__Impl rule__XGuard__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XGuard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuard__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:4083:1: rule__XGuard__Group__1__Impl : ( ( rule__XGuard__NameAssignment_1 ) ) ;
    public final void rule__XGuard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4087:1: ( ( ( rule__XGuard__NameAssignment_1 ) ) )
            // InternalXMachine.g:4088:1: ( ( rule__XGuard__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4088:1: ( ( rule__XGuard__NameAssignment_1 ) )
            // InternalXMachine.g:4089:2: ( rule__XGuard__NameAssignment_1 )
            {
             before(grammarAccess.getXGuardAccess().getNameAssignment_1()); 
            // InternalXMachine.g:4090:2: ( rule__XGuard__NameAssignment_1 )
            // InternalXMachine.g:4090:3: rule__XGuard__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXGuardAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:4098:1: rule__XGuard__Group__2 : rule__XGuard__Group__2__Impl rule__XGuard__Group__3 ;
    public final void rule__XGuard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4102:1: ( rule__XGuard__Group__2__Impl rule__XGuard__Group__3 )
            // InternalXMachine.g:4103:2: rule__XGuard__Group__2__Impl rule__XGuard__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__XGuard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuard__Group__3();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:4110:1: rule__XGuard__Group__2__Impl : ( ( rule__XGuard__PredicateAssignment_2 ) ) ;
    public final void rule__XGuard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4114:1: ( ( ( rule__XGuard__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:4115:1: ( ( rule__XGuard__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:4115:1: ( ( rule__XGuard__PredicateAssignment_2 ) )
            // InternalXMachine.g:4116:2: ( rule__XGuard__PredicateAssignment_2 )
            {
             before(grammarAccess.getXGuardAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:4117:2: ( rule__XGuard__PredicateAssignment_2 )
            // InternalXMachine.g:4117:3: rule__XGuard__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXGuardAccess().getPredicateAssignment_2()); 

            }


            }

        }
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
    // InternalXMachine.g:4125:1: rule__XGuard__Group__3 : rule__XGuard__Group__3__Impl ;
    public final void rule__XGuard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4129:1: ( rule__XGuard__Group__3__Impl )
            // InternalXMachine.g:4130:2: rule__XGuard__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:4136:1: rule__XGuard__Group__3__Impl : ( ( rule__XGuard__TheoremAssignment_3 )? ) ;
    public final void rule__XGuard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4140:1: ( ( ( rule__XGuard__TheoremAssignment_3 )? ) )
            // InternalXMachine.g:4141:1: ( ( rule__XGuard__TheoremAssignment_3 )? )
            {
            // InternalXMachine.g:4141:1: ( ( rule__XGuard__TheoremAssignment_3 )? )
            // InternalXMachine.g:4142:2: ( rule__XGuard__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXGuardAccess().getTheoremAssignment_3()); 
            // InternalXMachine.g:4143:2: ( rule__XGuard__TheoremAssignment_3 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==42) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXMachine.g:4143:3: rule__XGuard__TheoremAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGuard__TheoremAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXGuardAccess().getTheoremAssignment_3()); 

            }


            }

        }
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
    // InternalXMachine.g:4152:1: rule__XWitness__Group__0 : rule__XWitness__Group__0__Impl rule__XWitness__Group__1 ;
    public final void rule__XWitness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4156:1: ( rule__XWitness__Group__0__Impl rule__XWitness__Group__1 )
            // InternalXMachine.g:4157:2: rule__XWitness__Group__0__Impl rule__XWitness__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XWitness__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XWitness__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:4164:1: rule__XWitness__Group__0__Impl : ( () ) ;
    public final void rule__XWitness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4168:1: ( ( () ) )
            // InternalXMachine.g:4169:1: ( () )
            {
            // InternalXMachine.g:4169:1: ( () )
            // InternalXMachine.g:4170:2: ()
            {
             before(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 
            // InternalXMachine.g:4171:2: ()
            // InternalXMachine.g:4171:3: 
            {
            }

             after(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 

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
    // InternalXMachine.g:4179:1: rule__XWitness__Group__1 : rule__XWitness__Group__1__Impl rule__XWitness__Group__2 ;
    public final void rule__XWitness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4183:1: ( rule__XWitness__Group__1__Impl rule__XWitness__Group__2 )
            // InternalXMachine.g:4184:2: rule__XWitness__Group__1__Impl rule__XWitness__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XWitness__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XWitness__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:4191:1: rule__XWitness__Group__1__Impl : ( ( rule__XWitness__NameAssignment_1 ) ) ;
    public final void rule__XWitness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4195:1: ( ( ( rule__XWitness__NameAssignment_1 ) ) )
            // InternalXMachine.g:4196:1: ( ( rule__XWitness__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4196:1: ( ( rule__XWitness__NameAssignment_1 ) )
            // InternalXMachine.g:4197:2: ( rule__XWitness__NameAssignment_1 )
            {
             before(grammarAccess.getXWitnessAccess().getNameAssignment_1()); 
            // InternalXMachine.g:4198:2: ( rule__XWitness__NameAssignment_1 )
            // InternalXMachine.g:4198:3: rule__XWitness__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:4206:1: rule__XWitness__Group__2 : rule__XWitness__Group__2__Impl ;
    public final void rule__XWitness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4210:1: ( rule__XWitness__Group__2__Impl )
            // InternalXMachine.g:4211:2: rule__XWitness__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:4217:1: rule__XWitness__Group__2__Impl : ( ( rule__XWitness__PredicateAssignment_2 ) ) ;
    public final void rule__XWitness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4221:1: ( ( ( rule__XWitness__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:4222:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:4222:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            // InternalXMachine.g:4223:2: ( rule__XWitness__PredicateAssignment_2 )
            {
             before(grammarAccess.getXWitnessAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:4224:2: ( rule__XWitness__PredicateAssignment_2 )
            // InternalXMachine.g:4224:3: rule__XWitness__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessAccess().getPredicateAssignment_2()); 

            }


            }

        }
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
    // InternalXMachine.g:4233:1: rule__XAction__Group__0 : rule__XAction__Group__0__Impl rule__XAction__Group__1 ;
    public final void rule__XAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4237:1: ( rule__XAction__Group__0__Impl rule__XAction__Group__1 )
            // InternalXMachine.g:4238:2: rule__XAction__Group__0__Impl rule__XAction__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAction__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:4245:1: rule__XAction__Group__0__Impl : ( () ) ;
    public final void rule__XAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4249:1: ( ( () ) )
            // InternalXMachine.g:4250:1: ( () )
            {
            // InternalXMachine.g:4250:1: ( () )
            // InternalXMachine.g:4251:2: ()
            {
             before(grammarAccess.getXActionAccess().getActionAction_0()); 
            // InternalXMachine.g:4252:2: ()
            // InternalXMachine.g:4252:3: 
            {
            }

             after(grammarAccess.getXActionAccess().getActionAction_0()); 

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
    // InternalXMachine.g:4260:1: rule__XAction__Group__1 : rule__XAction__Group__1__Impl rule__XAction__Group__2 ;
    public final void rule__XAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4264:1: ( rule__XAction__Group__1__Impl rule__XAction__Group__2 )
            // InternalXMachine.g:4265:2: rule__XAction__Group__1__Impl rule__XAction__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAction__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:4272:1: rule__XAction__Group__1__Impl : ( ( rule__XAction__NameAssignment_1 ) ) ;
    public final void rule__XAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4276:1: ( ( ( rule__XAction__NameAssignment_1 ) ) )
            // InternalXMachine.g:4277:1: ( ( rule__XAction__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4277:1: ( ( rule__XAction__NameAssignment_1 ) )
            // InternalXMachine.g:4278:2: ( rule__XAction__NameAssignment_1 )
            {
             before(grammarAccess.getXActionAccess().getNameAssignment_1()); 
            // InternalXMachine.g:4279:2: ( rule__XAction__NameAssignment_1 )
            // InternalXMachine.g:4279:3: rule__XAction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XAction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXActionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:4287:1: rule__XAction__Group__2 : rule__XAction__Group__2__Impl ;
    public final void rule__XAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4291:1: ( rule__XAction__Group__2__Impl )
            // InternalXMachine.g:4292:2: rule__XAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XAction__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:4298:1: rule__XAction__Group__2__Impl : ( ( rule__XAction__ActionAssignment_2 ) ) ;
    public final void rule__XAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4302:1: ( ( ( rule__XAction__ActionAssignment_2 ) ) )
            // InternalXMachine.g:4303:1: ( ( rule__XAction__ActionAssignment_2 ) )
            {
            // InternalXMachine.g:4303:1: ( ( rule__XAction__ActionAssignment_2 ) )
            // InternalXMachine.g:4304:2: ( rule__XAction__ActionAssignment_2 )
            {
             before(grammarAccess.getXActionAccess().getActionAssignment_2()); 
            // InternalXMachine.g:4305:2: ( rule__XAction__ActionAssignment_2 )
            // InternalXMachine.g:4305:3: rule__XAction__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XAction__ActionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXActionAccess().getActionAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__XEvent__UnorderedGroup_3"
    // InternalXMachine.g:4314:1: rule__XEvent__UnorderedGroup_3 : ( rule__XEvent__UnorderedGroup_3__0 )? ;
    public final void rule__XEvent__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getXEventAccess().getUnorderedGroup_3());
        	
        try {
            // InternalXMachine.g:4319:1: ( ( rule__XEvent__UnorderedGroup_3__0 )? )
            // InternalXMachine.g:4320:2: ( rule__XEvent__UnorderedGroup_3__0 )?
            {
            // InternalXMachine.g:4320:2: ( rule__XEvent__UnorderedGroup_3__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( LA49_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                alt49=1;
            }
            else if ( LA49_0 >= 14 && LA49_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalXMachine.g:4320:2: rule__XEvent__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__UnorderedGroup_3__0();

                    state._fsp--;


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
    // InternalXMachine.g:4328:1: rule__XEvent__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) ) ) ;
    public final void rule__XEvent__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXMachine.g:4333:1: ( ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) ) ) )
            // InternalXMachine.g:4334:3: ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) ) )
            {
            // InternalXMachine.g:4334:3: ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( LA50_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 >= 14 && LA50_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalXMachine.g:4335:3: ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) )
                    {
                    // InternalXMachine.g:4335:3: ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) )
                    // InternalXMachine.g:4336:4: {...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__XEvent__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalXMachine.g:4336:102: ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) )
                    // InternalXMachine.g:4337:5: ( ( rule__XEvent__ExtendedAssignment_3_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalXMachine.g:4343:5: ( ( rule__XEvent__ExtendedAssignment_3_0 ) )
                    // InternalXMachine.g:4344:6: ( rule__XEvent__ExtendedAssignment_3_0 )
                    {
                     before(grammarAccess.getXEventAccess().getExtendedAssignment_3_0()); 
                    // InternalXMachine.g:4345:6: ( rule__XEvent__ExtendedAssignment_3_0 )
                    // InternalXMachine.g:4345:7: rule__XEvent__ExtendedAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__ExtendedAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getExtendedAssignment_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:4350:3: ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) )
                    {
                    // InternalXMachine.g:4350:3: ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) )
                    // InternalXMachine.g:4351:4: {...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__XEvent__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalXMachine.g:4351:102: ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) )
                    // InternalXMachine.g:4352:5: ( ( rule__XEvent__ConvergenceAssignment_3_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalXMachine.g:4358:5: ( ( rule__XEvent__ConvergenceAssignment_3_1 ) )
                    // InternalXMachine.g:4359:6: ( rule__XEvent__ConvergenceAssignment_3_1 )
                    {
                     before(grammarAccess.getXEventAccess().getConvergenceAssignment_3_1()); 
                    // InternalXMachine.g:4360:6: ( rule__XEvent__ConvergenceAssignment_3_1 )
                    // InternalXMachine.g:4360:7: rule__XEvent__ConvergenceAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__ConvergenceAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getConvergenceAssignment_3_1()); 

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
    // InternalXMachine.g:4373:1: rule__XEvent__UnorderedGroup_3__0 : rule__XEvent__UnorderedGroup_3__Impl ( rule__XEvent__UnorderedGroup_3__1 )? ;
    public final void rule__XEvent__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4377:1: ( rule__XEvent__UnorderedGroup_3__Impl ( rule__XEvent__UnorderedGroup_3__1 )? )
            // InternalXMachine.g:4378:2: rule__XEvent__UnorderedGroup_3__Impl ( rule__XEvent__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_34);
            rule__XEvent__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalXMachine.g:4379:2: ( rule__XEvent__UnorderedGroup_3__1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 >= 14 && LA51_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalXMachine.g:4379:2: rule__XEvent__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__UnorderedGroup_3__1();

                    state._fsp--;


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
    // InternalXMachine.g:4385:1: rule__XEvent__UnorderedGroup_3__1 : rule__XEvent__UnorderedGroup_3__Impl ;
    public final void rule__XEvent__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4389:1: ( rule__XEvent__UnorderedGroup_3__Impl )
            // InternalXMachine.g:4390:2: rule__XEvent__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:4397:1: rule__Machine__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4401:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4402:2: ( RULE_ID )
            {
            // InternalXMachine.g:4402:2: ( RULE_ID )
            // InternalXMachine.g:4403:3: RULE_ID
            {
             before(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Machine__RefinesAssignment_3_1"
    // InternalXMachine.g:4412:1: rule__Machine__RefinesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__RefinesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4416:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4417:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4417:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4418:3: ( RULE_ID )
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_3_1_0()); 
            // InternalXMachine.g:4419:3: ( RULE_ID )
            // InternalXMachine.g:4420:4: RULE_ID
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getRefinesMachineIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__RefinesAssignment_3_1"


    // $ANTLR start "rule__Machine__SeesAssignment_4_1"
    // InternalXMachine.g:4431:1: rule__Machine__SeesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__SeesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4435:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4436:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4436:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4437:3: ( RULE_ID )
            {
             before(grammarAccess.getMachineAccess().getSeesContextCrossReference_4_1_0()); 
            // InternalXMachine.g:4438:3: ( RULE_ID )
            // InternalXMachine.g:4439:4: RULE_ID
            {
             before(grammarAccess.getMachineAccess().getSeesContextIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getSeesContextIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getMachineAccess().getSeesContextCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__SeesAssignment_4_1"


    // $ANTLR start "rule__Machine__ExtensionsAssignment_5"
    // InternalXMachine.g:4450:1: rule__Machine__ExtensionsAssignment_5 : ( ruleMIncludes ) ;
    public final void rule__Machine__ExtensionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4454:1: ( ( ruleMIncludes ) )
            // InternalXMachine.g:4455:2: ( ruleMIncludes )
            {
            // InternalXMachine.g:4455:2: ( ruleMIncludes )
            // InternalXMachine.g:4456:3: ruleMIncludes
            {
             before(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMIncludes();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__ExtensionsAssignment_5"


    // $ANTLR start "rule__Machine__VariablesAssignment_6_1"
    // InternalXMachine.g:4465:1: rule__Machine__VariablesAssignment_6_1 : ( ruleXVariable ) ;
    public final void rule__Machine__VariablesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4469:1: ( ( ruleXVariable ) )
            // InternalXMachine.g:4470:2: ( ruleXVariable )
            {
            // InternalXMachine.g:4470:2: ( ruleXVariable )
            // InternalXMachine.g:4471:3: ruleXVariable
            {
             before(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXVariable();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariablesAssignment_6_1"


    // $ANTLR start "rule__Machine__InvariantsAssignment_7_1"
    // InternalXMachine.g:4480:1: rule__Machine__InvariantsAssignment_7_1 : ( ruleXInvariant ) ;
    public final void rule__Machine__InvariantsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4484:1: ( ( ruleXInvariant ) )
            // InternalXMachine.g:4485:2: ( ruleXInvariant )
            {
            // InternalXMachine.g:4485:2: ( ruleXInvariant )
            // InternalXMachine.g:4486:3: ruleXInvariant
            {
             before(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXInvariant();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__InvariantsAssignment_7_1"


    // $ANTLR start "rule__Machine__VariantAssignment_8_1"
    // InternalXMachine.g:4495:1: rule__Machine__VariantAssignment_8_1 : ( ruleXVariant ) ;
    public final void rule__Machine__VariantAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4499:1: ( ( ruleXVariant ) )
            // InternalXMachine.g:4500:2: ( ruleXVariant )
            {
            // InternalXMachine.g:4500:2: ( ruleXVariant )
            // InternalXMachine.g:4501:3: ruleXVariant
            {
             before(grammarAccess.getMachineAccess().getVariantXVariantParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXVariant();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getVariantXVariantParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariantAssignment_8_1"


    // $ANTLR start "rule__Machine__EventsAssignment_9_1"
    // InternalXMachine.g:4510:1: rule__Machine__EventsAssignment_9_1 : ( ruleXEvent ) ;
    public final void rule__Machine__EventsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4514:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:4515:2: ( ruleXEvent )
            {
            // InternalXMachine.g:4515:2: ( ruleXEvent )
            // InternalXMachine.g:4516:3: ruleXEvent
            {
             before(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXEvent();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__EventsAssignment_9_1"


    // $ANTLR start "rule__Machine__EventsAssignment_9_2"
    // InternalXMachine.g:4525:1: rule__Machine__EventsAssignment_9_2 : ( ruleXEvent ) ;
    public final void rule__Machine__EventsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4529:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:4530:2: ( ruleXEvent )
            {
            // InternalXMachine.g:4530:2: ( ruleXEvent )
            // InternalXMachine.g:4531:3: ruleXEvent
            {
             before(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXEvent();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__EventsAssignment_9_2"


    // $ANTLR start "rule__Machine__ExtensionsAssignment_10"
    // InternalXMachine.g:4540:1: rule__Machine__ExtensionsAssignment_10 : ( ruleXGroup ) ;
    public final void rule__Machine__ExtensionsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4544:1: ( ( ruleXGroup ) )
            // InternalXMachine.g:4545:2: ( ruleXGroup )
            {
            // InternalXMachine.g:4545:2: ( ruleXGroup )
            // InternalXMachine.g:4546:3: ruleXGroup
            {
             before(grammarAccess.getMachineAccess().getExtensionsXGroupParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleXGroup();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getExtensionsXGroupParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__ExtensionsAssignment_10"


    // $ANTLR start "rule__MIncludes__AbstractMachineAssignment_1_1"
    // InternalXMachine.g:4555:1: rule__MIncludes__AbstractMachineAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MIncludes__AbstractMachineAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4559:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:4560:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:4560:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:4561:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 
            // InternalXMachine.g:4562:3: ( ruleQualifiedName )
            // InternalXMachine.g:4563:4: ruleQualifiedName
            {
             before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineQualifiedNameParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMIncludesAccess().getAbstractMachineMachineQualifiedNameParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4574:1: rule__MIncludes__ConcreteMachineAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MIncludes__ConcreteMachineAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4578:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4579:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4579:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4580:3: ( RULE_ID )
            {
             before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 
            // InternalXMachine.g:4581:3: ( RULE_ID )
            // InternalXMachine.g:4582:4: RULE_ID
            {
             before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getConcreteMachineMachineIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4593:1: rule__MIncludes__PrefixesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4597:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4598:2: ( RULE_ID )
            {
            // InternalXMachine.g:4598:2: ( RULE_ID )
            // InternalXMachine.g:4599:3: RULE_ID
            {
             before(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4608:1: rule__MIncludes__PrefixesAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4612:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4613:2: ( RULE_ID )
            {
            // InternalXMachine.g:4613:2: ( RULE_ID )
            // InternalXMachine.g:4614:3: RULE_ID
            {
             before(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4623:1: rule__XVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4627:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4628:2: ( RULE_ID )
            {
            // InternalXMachine.g:4628:2: ( RULE_ID )
            // InternalXMachine.g:4629:3: RULE_ID
            {
             before(grammarAccess.getXVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4638:1: rule__XInvariant__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XInvariant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4642:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4643:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4643:2: ( RULE_XLABEL )
            // InternalXMachine.g:4644:3: RULE_XLABEL
            {
             before(grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4653:1: rule__XInvariant__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XInvariant__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4657:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:4658:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:4658:2: ( ruleXPredicate )
            // InternalXMachine.g:4659:3: ruleXPredicate
            {
             before(grammarAccess.getXInvariantAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXInvariantAccess().getPredicateXPredicateParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4668:1: rule__XInvariant__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XInvariant__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4672:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:4673:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:4673:2: ( ( 'theorem' ) )
            // InternalXMachine.g:4674:3: ( 'theorem' )
            {
             before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXMachine.g:4675:3: ( 'theorem' )
            // InternalXMachine.g:4676:4: 'theorem'
            {
             before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 

            }

             after(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4687:1: rule__XVariant__ExpressionAssignment_1 : ( ruleXPredicate ) ;
    public final void rule__XVariant__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4691:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:4692:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:4692:2: ( ruleXPredicate )
            // InternalXMachine.g:4693:3: ruleXPredicate
            {
             before(grammarAccess.getXVariantAccess().getExpressionXPredicateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXVariantAccess().getExpressionXPredicateParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4702:1: rule__XGroup__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4706:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4707:2: ( RULE_ID )
            {
            // InternalXMachine.g:4707:2: ( RULE_ID )
            // InternalXMachine.g:4708:3: RULE_ID
            {
             before(grammarAccess.getXGroupAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXGroupAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4717:1: rule__XGroup__FormalParametersAssignment_3_1 : ( ruleXFormalParameter ) ;
    public final void rule__XGroup__FormalParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4721:1: ( ( ruleXFormalParameter ) )
            // InternalXMachine.g:4722:2: ( ruleXFormalParameter )
            {
            // InternalXMachine.g:4722:2: ( ruleXFormalParameter )
            // InternalXMachine.g:4723:3: ruleXFormalParameter
            {
             before(grammarAccess.getXGroupAccess().getFormalParametersXFormalParameterParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXFormalParameter();

            state._fsp--;

             after(grammarAccess.getXGroupAccess().getFormalParametersXFormalParameterParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4732:1: rule__XGroup__FormalParametersAssignment_3_2_1 : ( ruleXFormalParameter ) ;
    public final void rule__XGroup__FormalParametersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4736:1: ( ( ruleXFormalParameter ) )
            // InternalXMachine.g:4737:2: ( ruleXFormalParameter )
            {
            // InternalXMachine.g:4737:2: ( ruleXFormalParameter )
            // InternalXMachine.g:4738:3: ruleXFormalParameter
            {
             before(grammarAccess.getXGroupAccess().getFormalParametersXFormalParameterParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXFormalParameter();

            state._fsp--;

             after(grammarAccess.getXGroupAccess().getFormalParametersXFormalParameterParserRuleCall_3_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__XGroup__EventsAssignment_5_0"
    // InternalXMachine.g:4747:1: rule__XGroup__EventsAssignment_5_0 : ( ( RULE_ID ) ) ;
    public final void rule__XGroup__EventsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4751:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4752:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4752:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4753:3: ( RULE_ID )
            {
             before(grammarAccess.getXGroupAccess().getEventsEventCrossReference_5_0_0()); 
            // InternalXMachine.g:4754:3: ( RULE_ID )
            // InternalXMachine.g:4755:4: RULE_ID
            {
             before(grammarAccess.getXGroupAccess().getEventsEventIDTerminalRuleCall_5_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXGroupAccess().getEventsEventIDTerminalRuleCall_5_0_0_1()); 

            }

             after(grammarAccess.getXGroupAccess().getEventsEventCrossReference_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__EventsAssignment_5_0"


    // $ANTLR start "rule__XGroup__EventsAssignment_5_1_1"
    // InternalXMachine.g:4766:1: rule__XGroup__EventsAssignment_5_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__XGroup__EventsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4770:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4771:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4771:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4772:3: ( RULE_ID )
            {
             before(grammarAccess.getXGroupAccess().getEventsEventCrossReference_5_1_1_0()); 
            // InternalXMachine.g:4773:3: ( RULE_ID )
            // InternalXMachine.g:4774:4: RULE_ID
            {
             before(grammarAccess.getXGroupAccess().getEventsEventIDTerminalRuleCall_5_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXGroupAccess().getEventsEventIDTerminalRuleCall_5_1_1_0_1()); 

            }

             after(grammarAccess.getXGroupAccess().getEventsEventCrossReference_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroup__EventsAssignment_5_1_1"


    // $ANTLR start "rule__XFormalParameter__DirectionAssignment_1"
    // InternalXMachine.g:4785:1: rule__XFormalParameter__DirectionAssignment_1 : ( ruleXDirection ) ;
    public final void rule__XFormalParameter__DirectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4789:1: ( ( ruleXDirection ) )
            // InternalXMachine.g:4790:2: ( ruleXDirection )
            {
            // InternalXMachine.g:4790:2: ( ruleXDirection )
            // InternalXMachine.g:4791:3: ruleXDirection
            {
             before(grammarAccess.getXFormalParameterAccess().getDirectionXDirectionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXDirection();

            state._fsp--;

             after(grammarAccess.getXFormalParameterAccess().getDirectionXDirectionEnumRuleCall_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4800:1: rule__XFormalParameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XFormalParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4804:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4805:2: ( RULE_ID )
            {
            // InternalXMachine.g:4805:2: ( RULE_ID )
            // InternalXMachine.g:4806:3: RULE_ID
            {
             before(grammarAccess.getXFormalParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXFormalParameterAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4815:1: rule__XEvent__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XEvent__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4819:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4820:2: ( RULE_ID )
            {
            // InternalXMachine.g:4820:2: ( RULE_ID )
            // InternalXMachine.g:4821:3: RULE_ID
            {
             before(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4830:1: rule__XEvent__ExtendedAssignment_3_0 : ( ( 'extended' ) ) ;
    public final void rule__XEvent__ExtendedAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4834:1: ( ( ( 'extended' ) ) )
            // InternalXMachine.g:4835:2: ( ( 'extended' ) )
            {
            // InternalXMachine.g:4835:2: ( ( 'extended' ) )
            // InternalXMachine.g:4836:3: ( 'extended' )
            {
             before(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0_0()); 
            // InternalXMachine.g:4837:3: ( 'extended' )
            // InternalXMachine.g:4838:4: 'extended'
            {
             before(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0_0()); 

            }

             after(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4849:1: rule__XEvent__ConvergenceAssignment_3_1 : ( ruleXConvergence ) ;
    public final void rule__XEvent__ConvergenceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4853:1: ( ( ruleXConvergence ) )
            // InternalXMachine.g:4854:2: ( ruleXConvergence )
            {
            // InternalXMachine.g:4854:2: ( ruleXConvergence )
            // InternalXMachine.g:4855:3: ruleXConvergence
            {
             before(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXConvergence();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4864:1: rule__XEvent__ExtensionsAssignment_4 : ( ruleXGroupOrEvent ) ;
    public final void rule__XEvent__ExtensionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4868:1: ( ( ruleXGroupOrEvent ) )
            // InternalXMachine.g:4869:2: ( ruleXGroupOrEvent )
            {
            // InternalXMachine.g:4869:2: ( ruleXGroupOrEvent )
            // InternalXMachine.g:4870:3: ruleXGroupOrEvent
            {
             before(grammarAccess.getXEventAccess().getExtensionsXGroupOrEventParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleXGroupOrEvent();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getExtensionsXGroupOrEventParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4879:1: rule__XEvent__RefinesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4883:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4884:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4884:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4885:3: ( RULE_ID )
            {
             before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_1_0()); 
            // InternalXMachine.g:4886:3: ( RULE_ID )
            // InternalXMachine.g:4887:4: RULE_ID
            {
             before(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4898:1: rule__XEvent__WitnessesAssignment_6_0_0_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_6_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4902:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:4903:2: ( ruleXWitness )
            {
            // InternalXMachine.g:4903:2: ( ruleXWitness )
            // InternalXMachine.g:4904:3: ruleXWitness
            {
             before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_0_0_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4913:1: rule__XEvent__ActionsAssignment_6_0_2 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_6_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4917:1: ( ( ruleXAction ) )
            // InternalXMachine.g:4918:2: ( ruleXAction )
            {
            // InternalXMachine.g:4918:2: ( ruleXAction )
            // InternalXMachine.g:4919:3: ruleXAction
            {
             before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_0_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4928:1: rule__XEvent__GuardsAssignment_6_1_1 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4932:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:4933:2: ( ruleXGuard )
            {
            // InternalXMachine.g:4933:2: ( ruleXGuard )
            // InternalXMachine.g:4934:3: ruleXGuard
            {
             before(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXGuard();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_6_1_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4943:1: rule__XEvent__WitnessesAssignment_6_1_2_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_6_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4947:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:4948:2: ( ruleXWitness )
            {
            // InternalXMachine.g:4948:2: ( ruleXWitness )
            // InternalXMachine.g:4949:3: ruleXWitness
            {
             before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_1_2_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4958:1: rule__XEvent__ActionsAssignment_6_1_3_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_6_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4962:1: ( ( ruleXAction ) )
            // InternalXMachine.g:4963:2: ( ruleXAction )
            {
            // InternalXMachine.g:4963:2: ( ruleXAction )
            // InternalXMachine.g:4964:3: ruleXAction
            {
             before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_1_3_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4973:1: rule__XEvent__ParametersAssignment_6_2_1 : ( ruleXParameter ) ;
    public final void rule__XEvent__ParametersAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4977:1: ( ( ruleXParameter ) )
            // InternalXMachine.g:4978:2: ( ruleXParameter )
            {
            // InternalXMachine.g:4978:2: ( ruleXParameter )
            // InternalXMachine.g:4979:3: ruleXParameter
            {
             before(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXParameter();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_6_2_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4988:1: rule__XEvent__GuardsAssignment_6_2_3 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_6_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4992:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:4993:2: ( ruleXGuard )
            {
            // InternalXMachine.g:4993:2: ( ruleXGuard )
            // InternalXMachine.g:4994:3: ruleXGuard
            {
             before(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_6_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleXGuard();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_6_2_3_0()); 

            }


            }

        }
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
    // InternalXMachine.g:5003:1: rule__XEvent__WitnessesAssignment_6_2_4_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_6_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5007:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:5008:2: ( ruleXWitness )
            {
            // InternalXMachine.g:5008:2: ( ruleXWitness )
            // InternalXMachine.g:5009:3: ruleXWitness
            {
             before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_2_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_2_4_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:5018:1: rule__XEvent__ActionsAssignment_6_2_5_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_6_2_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5022:1: ( ( ruleXAction ) )
            // InternalXMachine.g:5023:2: ( ruleXAction )
            {
            // InternalXMachine.g:5023:2: ( ruleXAction )
            // InternalXMachine.g:5024:3: ruleXAction
            {
             before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_2_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_2_5_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:5033:1: rule__EventSync__PrefixAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__EventSync__PrefixAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5037:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5038:2: ( RULE_ID )
            {
            // InternalXMachine.g:5038:2: ( RULE_ID )
            // InternalXMachine.g:5039:3: RULE_ID
            {
             before(grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0()); 

            }


            }

        }
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
    // InternalXMachine.g:5048:1: rule__EventSync__SynchronisedEventAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__EventSync__SynchronisedEventAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5052:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5053:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5053:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5054:3: ( RULE_ID )
            {
             before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0()); 
            // InternalXMachine.g:5055:3: ( RULE_ID )
            // InternalXMachine.g:5056:4: RULE_ID
            {
             before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventSyncAccess().getSynchronisedEventEventIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__GroupSync__PrefixAssignment_1_1_0"
    // InternalXMachine.g:5067:1: rule__GroupSync__PrefixAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__GroupSync__PrefixAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5071:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5072:2: ( RULE_ID )
            {
            // InternalXMachine.g:5072:2: ( RULE_ID )
            // InternalXMachine.g:5073:3: RULE_ID
            {
             before(grammarAccess.getGroupSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__PrefixAssignment_1_1_0"


    // $ANTLR start "rule__GroupSync__SynchronisedCasesAssignment_1_2"
    // InternalXMachine.g:5082:1: rule__GroupSync__SynchronisedCasesAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__GroupSync__SynchronisedCasesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5086:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5087:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5087:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5088:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesCrossReference_1_2_0()); 
            // InternalXMachine.g:5089:3: ( RULE_ID )
            // InternalXMachine.g:5090:4: RULE_ID
            {
             before(grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupSync__SynchronisedCasesAssignment_1_2"


    // $ANTLR start "rule__GroupSync__ActualParametersAssignment_2_1"
    // InternalXMachine.g:5101:1: rule__GroupSync__ActualParametersAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__GroupSync__ActualParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5105:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5106:2: ( RULE_ID )
            {
            // InternalXMachine.g:5106:2: ( RULE_ID )
            // InternalXMachine.g:5107:3: RULE_ID
            {
             before(grammarAccess.getGroupSyncAccess().getActualParametersIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupSyncAccess().getActualParametersIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:5116:1: rule__GroupSync__ActualParametersAssignment_2_2_1 : ( RULE_ID ) ;
    public final void rule__GroupSync__ActualParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5120:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5121:2: ( RULE_ID )
            {
            // InternalXMachine.g:5121:2: ( RULE_ID )
            // InternalXMachine.g:5122:3: RULE_ID
            {
             before(grammarAccess.getGroupSyncAccess().getActualParametersIDTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupSyncAccess().getActualParametersIDTerminalRuleCall_2_2_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:5131:1: rule__XParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5135:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5136:2: ( RULE_ID )
            {
            // InternalXMachine.g:5136:2: ( RULE_ID )
            // InternalXMachine.g:5137:3: RULE_ID
            {
             before(grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:5146:1: rule__XGuard__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XGuard__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5150:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5151:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5151:2: ( RULE_XLABEL )
            // InternalXMachine.g:5152:3: RULE_XLABEL
            {
             before(grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:5161:1: rule__XGuard__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XGuard__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5165:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:5166:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:5166:2: ( ruleXPredicate )
            // InternalXMachine.g:5167:3: ruleXPredicate
            {
             before(grammarAccess.getXGuardAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXGuardAccess().getPredicateXPredicateParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:5176:1: rule__XGuard__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XGuard__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5180:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:5181:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:5181:2: ( ( 'theorem' ) )
            // InternalXMachine.g:5182:3: ( 'theorem' )
            {
             before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXMachine.g:5183:3: ( 'theorem' )
            // InternalXMachine.g:5184:4: 'theorem'
            {
             before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 

            }

             after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 

            }


            }

        }
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
    // InternalXMachine.g:5195:1: rule__XWitness__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XWitness__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5199:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5200:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5200:2: ( RULE_XLABEL )
            // InternalXMachine.g:5201:3: RULE_XLABEL
            {
             before(grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:5210:1: rule__XWitness__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XWitness__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5214:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:5215:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:5215:2: ( ruleXPredicate )
            // InternalXMachine.g:5216:3: ruleXPredicate
            {
             before(grammarAccess.getXWitnessAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXWitnessAccess().getPredicateXPredicateParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:5225:1: rule__XAction__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5229:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5230:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5230:2: ( RULE_XLABEL )
            // InternalXMachine.g:5231:3: RULE_XLABEL
            {
             before(grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:5240:1: rule__XAction__ActionAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XAction__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5244:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:5245:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:5245:2: ( ruleXPredicate )
            // InternalXMachine.g:5246:3: ruleXPredicate
            {
             before(grammarAccess.getXActionAccess().getActionXPredicateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXActionAccess().getActionXPredicateParserRuleCall_2_0()); 

            }


            }

        }
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000023FC0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000008000001C000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000358400C0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000008000001C002L});

}
