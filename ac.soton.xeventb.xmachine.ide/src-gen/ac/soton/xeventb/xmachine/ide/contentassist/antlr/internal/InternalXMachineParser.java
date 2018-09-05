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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_XLABEL", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'in'", "'out'", "'ordinary'", "'convergent'", "'anticipated'", "'machine'", "'end'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variant'", "'events'", "'includes'", "'to'", "'as'", "'.'", "'Group'", "'begin'", "'('", "')'", "','", "'with'", "'when'", "'then'", "'any'", "'where'", "'synchronises'", "'synchronisesGroup'", "'theorem'", "'extended'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=6;
    public static final int T__19=19;
    public static final int RULE_XLABEL=8;
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
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=5;
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


    // $ANTLR start "entryRuleXFormalArgument"
    // InternalXMachine.g:253:1: entryRuleXFormalArgument : ruleXFormalArgument EOF ;
    public final void entryRuleXFormalArgument() throws RecognitionException {
        try {
            // InternalXMachine.g:254:1: ( ruleXFormalArgument EOF )
            // InternalXMachine.g:255:1: ruleXFormalArgument EOF
            {
             before(grammarAccess.getXFormalArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleXFormalArgument();

            state._fsp--;

             after(grammarAccess.getXFormalArgumentRule()); 
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
    // $ANTLR end "entryRuleXFormalArgument"


    // $ANTLR start "ruleXFormalArgument"
    // InternalXMachine.g:262:1: ruleXFormalArgument : ( ( rule__XFormalArgument__Group__0 ) ) ;
    public final void ruleXFormalArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:266:2: ( ( ( rule__XFormalArgument__Group__0 ) ) )
            // InternalXMachine.g:267:2: ( ( rule__XFormalArgument__Group__0 ) )
            {
            // InternalXMachine.g:267:2: ( ( rule__XFormalArgument__Group__0 ) )
            // InternalXMachine.g:268:3: ( rule__XFormalArgument__Group__0 )
            {
             before(grammarAccess.getXFormalArgumentAccess().getGroup()); 
            // InternalXMachine.g:269:3: ( rule__XFormalArgument__Group__0 )
            // InternalXMachine.g:269:4: rule__XFormalArgument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XFormalArgument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXFormalArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXFormalArgument"


    // $ANTLR start "entryRuleXEvent"
    // InternalXMachine.g:278:1: entryRuleXEvent : ruleXEvent EOF ;
    public final void entryRuleXEvent() throws RecognitionException {
        try {
            // InternalXMachine.g:279:1: ( ruleXEvent EOF )
            // InternalXMachine.g:280:1: ruleXEvent EOF
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
    // InternalXMachine.g:287:1: ruleXEvent : ( ( rule__XEvent__Group__0 ) ) ;
    public final void ruleXEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:291:2: ( ( ( rule__XEvent__Group__0 ) ) )
            // InternalXMachine.g:292:2: ( ( rule__XEvent__Group__0 ) )
            {
            // InternalXMachine.g:292:2: ( ( rule__XEvent__Group__0 ) )
            // InternalXMachine.g:293:3: ( rule__XEvent__Group__0 )
            {
             before(grammarAccess.getXEventAccess().getGroup()); 
            // InternalXMachine.g:294:3: ( rule__XEvent__Group__0 )
            // InternalXMachine.g:294:4: rule__XEvent__Group__0
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
    // InternalXMachine.g:303:1: entryRuleEventSync : ruleEventSync EOF ;
    public final void entryRuleEventSync() throws RecognitionException {
        try {
            // InternalXMachine.g:304:1: ( ruleEventSync EOF )
            // InternalXMachine.g:305:1: ruleEventSync EOF
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
    // InternalXMachine.g:312:1: ruleEventSync : ( ( rule__EventSync__Group__0 ) ) ;
    public final void ruleEventSync() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:316:2: ( ( ( rule__EventSync__Group__0 ) ) )
            // InternalXMachine.g:317:2: ( ( rule__EventSync__Group__0 ) )
            {
            // InternalXMachine.g:317:2: ( ( rule__EventSync__Group__0 ) )
            // InternalXMachine.g:318:3: ( rule__EventSync__Group__0 )
            {
             before(grammarAccess.getEventSyncAccess().getGroup()); 
            // InternalXMachine.g:319:3: ( rule__EventSync__Group__0 )
            // InternalXMachine.g:319:4: rule__EventSync__Group__0
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
    // InternalXMachine.g:328:1: entryRuleGroupSync : ruleGroupSync EOF ;
    public final void entryRuleGroupSync() throws RecognitionException {
        try {
            // InternalXMachine.g:329:1: ( ruleGroupSync EOF )
            // InternalXMachine.g:330:1: ruleGroupSync EOF
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
             before(grammarAccess.getGroupSyncAccess().getGroup()); 
            // InternalXMachine.g:344:3: ( rule__GroupSync__Group__0 )
            // InternalXMachine.g:344:4: rule__GroupSync__Group__0
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


    // $ANTLR start "entryRulegroupOrEvent"
    // InternalXMachine.g:353:1: entryRulegroupOrEvent : rulegroupOrEvent EOF ;
    public final void entryRulegroupOrEvent() throws RecognitionException {
        try {
            // InternalXMachine.g:354:1: ( rulegroupOrEvent EOF )
            // InternalXMachine.g:355:1: rulegroupOrEvent EOF
            {
             before(grammarAccess.getGroupOrEventRule()); 
            pushFollow(FOLLOW_1);
            rulegroupOrEvent();

            state._fsp--;

             after(grammarAccess.getGroupOrEventRule()); 
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
    // $ANTLR end "entryRulegroupOrEvent"


    // $ANTLR start "rulegroupOrEvent"
    // InternalXMachine.g:362:1: rulegroupOrEvent : ( ( rule__GroupOrEvent__Alternatives ) ) ;
    public final void rulegroupOrEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:366:2: ( ( ( rule__GroupOrEvent__Alternatives ) ) )
            // InternalXMachine.g:367:2: ( ( rule__GroupOrEvent__Alternatives ) )
            {
            // InternalXMachine.g:367:2: ( ( rule__GroupOrEvent__Alternatives ) )
            // InternalXMachine.g:368:3: ( rule__GroupOrEvent__Alternatives )
            {
             before(grammarAccess.getGroupOrEventAccess().getAlternatives()); 
            // InternalXMachine.g:369:3: ( rule__GroupOrEvent__Alternatives )
            // InternalXMachine.g:369:4: rule__GroupOrEvent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GroupOrEvent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGroupOrEventAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulegroupOrEvent"


    // $ANTLR start "entryRuleXParameter"
    // InternalXMachine.g:378:1: entryRuleXParameter : ruleXParameter EOF ;
    public final void entryRuleXParameter() throws RecognitionException {
        try {
            // InternalXMachine.g:379:1: ( ruleXParameter EOF )
            // InternalXMachine.g:380:1: ruleXParameter EOF
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
             before(grammarAccess.getXParameterAccess().getGroup()); 
            // InternalXMachine.g:394:3: ( rule__XParameter__Group__0 )
            // InternalXMachine.g:394:4: rule__XParameter__Group__0
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
    // InternalXMachine.g:403:1: entryRuleXGuard : ruleXGuard EOF ;
    public final void entryRuleXGuard() throws RecognitionException {
        try {
            // InternalXMachine.g:404:1: ( ruleXGuard EOF )
            // InternalXMachine.g:405:1: ruleXGuard EOF
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
             before(grammarAccess.getXGuardAccess().getGroup()); 
            // InternalXMachine.g:419:3: ( rule__XGuard__Group__0 )
            // InternalXMachine.g:419:4: rule__XGuard__Group__0
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
    // InternalXMachine.g:428:1: entryRuleXWitness : ruleXWitness EOF ;
    public final void entryRuleXWitness() throws RecognitionException {
        try {
            // InternalXMachine.g:429:1: ( ruleXWitness EOF )
            // InternalXMachine.g:430:1: ruleXWitness EOF
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
             before(grammarAccess.getXWitnessAccess().getGroup()); 
            // InternalXMachine.g:444:3: ( rule__XWitness__Group__0 )
            // InternalXMachine.g:444:4: rule__XWitness__Group__0
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
    // InternalXMachine.g:453:1: entryRuleXAction : ruleXAction EOF ;
    public final void entryRuleXAction() throws RecognitionException {
        try {
            // InternalXMachine.g:454:1: ( ruleXAction EOF )
            // InternalXMachine.g:455:1: ruleXAction EOF
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
             before(grammarAccess.getXActionAccess().getGroup()); 
            // InternalXMachine.g:469:3: ( rule__XAction__Group__0 )
            // InternalXMachine.g:469:4: rule__XAction__Group__0
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
    // InternalXMachine.g:478:1: entryRuleXPredicate : ruleXPredicate EOF ;
    public final void entryRuleXPredicate() throws RecognitionException {
        try {
            // InternalXMachine.g:479:1: ( ruleXPredicate EOF )
            // InternalXMachine.g:480:1: ruleXPredicate EOF
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
             before(grammarAccess.getXDirectionAccess().getAlternatives()); 
            // InternalXMachine.g:510:3: ( rule__XDirection__Alternatives )
            // InternalXMachine.g:510:4: rule__XDirection__Alternatives
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
             before(grammarAccess.getXConvergenceAccess().getAlternatives()); 
            // InternalXMachine.g:526:3: ( rule__XConvergence__Alternatives )
            // InternalXMachine.g:526:4: rule__XConvergence__Alternatives
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


    // $ANTLR start "rule__Machine__CommentAlternatives_1_0"
    // InternalXMachine.g:534:1: rule__Machine__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Machine__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:538:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ML_COMMENT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_SL_COMMENT) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalXMachine.g:539:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXMachine.g:539:2: ( RULE_ML_COMMENT )
                    // InternalXMachine.g:540:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getMachineAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getMachineAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:545:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:545:2: ( RULE_SL_COMMENT )
                    // InternalXMachine.g:546:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getMachineAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getMachineAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Machine__CommentAlternatives_1_0"


    // $ANTLR start "rule__XEvent__Alternatives_5"
    // InternalXMachine.g:555:1: rule__XEvent__Alternatives_5 : ( ( ( rule__XEvent__Group_5_0__0 ) ) | ( ( rule__XEvent__Group_5_1__0 ) ) | ( ( rule__XEvent__Group_5_2__0 ) ) );
    public final void rule__XEvent__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:559:1: ( ( ( rule__XEvent__Group_5_0__0 ) ) | ( ( rule__XEvent__Group_5_1__0 ) ) | ( ( rule__XEvent__Group_5_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 30:
            case 34:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalXMachine.g:560:2: ( ( rule__XEvent__Group_5_0__0 ) )
                    {
                    // InternalXMachine.g:560:2: ( ( rule__XEvent__Group_5_0__0 ) )
                    // InternalXMachine.g:561:3: ( rule__XEvent__Group_5_0__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_5_0()); 
                    // InternalXMachine.g:562:3: ( rule__XEvent__Group_5_0__0 )
                    // InternalXMachine.g:562:4: rule__XEvent__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:566:2: ( ( rule__XEvent__Group_5_1__0 ) )
                    {
                    // InternalXMachine.g:566:2: ( ( rule__XEvent__Group_5_1__0 ) )
                    // InternalXMachine.g:567:3: ( rule__XEvent__Group_5_1__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_5_1()); 
                    // InternalXMachine.g:568:3: ( rule__XEvent__Group_5_1__0 )
                    // InternalXMachine.g:568:4: rule__XEvent__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getGroup_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:572:2: ( ( rule__XEvent__Group_5_2__0 ) )
                    {
                    // InternalXMachine.g:572:2: ( ( rule__XEvent__Group_5_2__0 ) )
                    // InternalXMachine.g:573:3: ( rule__XEvent__Group_5_2__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_5_2()); 
                    // InternalXMachine.g:574:3: ( rule__XEvent__Group_5_2__0 )
                    // InternalXMachine.g:574:4: rule__XEvent__Group_5_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__XEvent__Alternatives_5"


    // $ANTLR start "rule__GroupOrEvent__Alternatives"
    // InternalXMachine.g:582:1: rule__GroupOrEvent__Alternatives : ( ( ruleGroupSync ) | ( ruleEventSync ) );
    public final void rule__GroupOrEvent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:586:1: ( ( ruleGroupSync ) | ( ruleEventSync ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==40) ) {
                alt3=1;
            }
            else if ( (LA3_0==39) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXMachine.g:587:2: ( ruleGroupSync )
                    {
                    // InternalXMachine.g:587:2: ( ruleGroupSync )
                    // InternalXMachine.g:588:3: ruleGroupSync
                    {
                     before(grammarAccess.getGroupOrEventAccess().getGroupSyncParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGroupSync();

                    state._fsp--;

                     after(grammarAccess.getGroupOrEventAccess().getGroupSyncParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:593:2: ( ruleEventSync )
                    {
                    // InternalXMachine.g:593:2: ( ruleEventSync )
                    // InternalXMachine.g:594:3: ruleEventSync
                    {
                     before(grammarAccess.getGroupOrEventAccess().getEventSyncParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEventSync();

                    state._fsp--;

                     after(grammarAccess.getGroupOrEventAccess().getEventSyncParserRuleCall_1()); 

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
    // $ANTLR end "rule__GroupOrEvent__Alternatives"


    // $ANTLR start "rule__XDirection__Alternatives"
    // InternalXMachine.g:603:1: rule__XDirection__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );
    public final void rule__XDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:607:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalXMachine.g:608:2: ( ( 'in' ) )
                    {
                    // InternalXMachine.g:608:2: ( ( 'in' ) )
                    // InternalXMachine.g:609:3: ( 'in' )
                    {
                     before(grammarAccess.getXDirectionAccess().getInEnumLiteralDeclaration_0()); 
                    // InternalXMachine.g:610:3: ( 'in' )
                    // InternalXMachine.g:610:4: 'in'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getXDirectionAccess().getInEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:614:2: ( ( 'out' ) )
                    {
                    // InternalXMachine.g:614:2: ( ( 'out' ) )
                    // InternalXMachine.g:615:3: ( 'out' )
                    {
                     before(grammarAccess.getXDirectionAccess().getOutEnumLiteralDeclaration_1()); 
                    // InternalXMachine.g:616:3: ( 'out' )
                    // InternalXMachine.g:616:4: 'out'
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
    // InternalXMachine.g:624:1: rule__XConvergence__Alternatives : ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) );
    public final void rule__XConvergence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:628:1: ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalXMachine.g:629:2: ( ( 'ordinary' ) )
                    {
                    // InternalXMachine.g:629:2: ( ( 'ordinary' ) )
                    // InternalXMachine.g:630:3: ( 'ordinary' )
                    {
                     before(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    // InternalXMachine.g:631:3: ( 'ordinary' )
                    // InternalXMachine.g:631:4: 'ordinary'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:635:2: ( ( 'convergent' ) )
                    {
                    // InternalXMachine.g:635:2: ( ( 'convergent' ) )
                    // InternalXMachine.g:636:3: ( 'convergent' )
                    {
                     before(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    // InternalXMachine.g:637:3: ( 'convergent' )
                    // InternalXMachine.g:637:4: 'convergent'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:641:2: ( ( 'anticipated' ) )
                    {
                    // InternalXMachine.g:641:2: ( ( 'anticipated' ) )
                    // InternalXMachine.g:642:3: ( 'anticipated' )
                    {
                     before(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    // InternalXMachine.g:643:3: ( 'anticipated' )
                    // InternalXMachine.g:643:4: 'anticipated'
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
    // InternalXMachine.g:651:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:655:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalXMachine.g:656:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
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
    // InternalXMachine.g:663:1: rule__Machine__Group__0__Impl : ( () ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:667:1: ( ( () ) )
            // InternalXMachine.g:668:1: ( () )
            {
            // InternalXMachine.g:668:1: ( () )
            // InternalXMachine.g:669:2: ()
            {
             before(grammarAccess.getMachineAccess().getMachineAction_0()); 
            // InternalXMachine.g:670:2: ()
            // InternalXMachine.g:670:3: 
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
    // InternalXMachine.g:678:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:682:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalXMachine.g:683:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalXMachine.g:690:1: rule__Machine__Group__1__Impl : ( ( rule__Machine__CommentAssignment_1 )? ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:694:1: ( ( ( rule__Machine__CommentAssignment_1 )? ) )
            // InternalXMachine.g:695:1: ( ( rule__Machine__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:695:1: ( ( rule__Machine__CommentAssignment_1 )? )
            // InternalXMachine.g:696:2: ( rule__Machine__CommentAssignment_1 )?
            {
             before(grammarAccess.getMachineAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:697:2: ( rule__Machine__CommentAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ML_COMMENT && LA6_0<=RULE_SL_COMMENT)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:697:3: rule__Machine__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getCommentAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:705:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:709:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalXMachine.g:710:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalXMachine.g:717:1: rule__Machine__Group__2__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:721:1: ( ( 'machine' ) )
            // InternalXMachine.g:722:1: ( 'machine' )
            {
            // InternalXMachine.g:722:1: ( 'machine' )
            // InternalXMachine.g:723:2: 'machine'
            {
             before(grammarAccess.getMachineAccess().getMachineKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getMachineKeyword_2()); 

            }


            }

        }
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
    // InternalXMachine.g:732:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:736:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // InternalXMachine.g:737:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
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
    // InternalXMachine.g:744:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__NameAssignment_3 ) ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:748:1: ( ( ( rule__Machine__NameAssignment_3 ) ) )
            // InternalXMachine.g:749:1: ( ( rule__Machine__NameAssignment_3 ) )
            {
            // InternalXMachine.g:749:1: ( ( rule__Machine__NameAssignment_3 ) )
            // InternalXMachine.g:750:2: ( rule__Machine__NameAssignment_3 )
            {
             before(grammarAccess.getMachineAccess().getNameAssignment_3()); 
            // InternalXMachine.g:751:2: ( rule__Machine__NameAssignment_3 )
            // InternalXMachine.g:751:3: rule__Machine__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Machine__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalXMachine.g:759:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:763:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // InternalXMachine.g:764:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
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
    // InternalXMachine.g:771:1: rule__Machine__Group__4__Impl : ( ( rule__Machine__ExtensionsAssignment_4 )* ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:775:1: ( ( ( rule__Machine__ExtensionsAssignment_4 )* ) )
            // InternalXMachine.g:776:1: ( ( rule__Machine__ExtensionsAssignment_4 )* )
            {
            // InternalXMachine.g:776:1: ( ( rule__Machine__ExtensionsAssignment_4 )* )
            // InternalXMachine.g:777:2: ( rule__Machine__ExtensionsAssignment_4 )*
            {
             before(grammarAccess.getMachineAccess().getExtensionsAssignment_4()); 
            // InternalXMachine.g:778:2: ( rule__Machine__ExtensionsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXMachine.g:778:3: rule__Machine__ExtensionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Machine__ExtensionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getExtensionsAssignment_4()); 

            }


            }

        }
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
    // InternalXMachine.g:786:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:790:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // InternalXMachine.g:791:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
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
    // InternalXMachine.g:798:1: rule__Machine__Group__5__Impl : ( ( rule__Machine__Group_5__0 )? ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:802:1: ( ( ( rule__Machine__Group_5__0 )? ) )
            // InternalXMachine.g:803:1: ( ( rule__Machine__Group_5__0 )? )
            {
            // InternalXMachine.g:803:1: ( ( rule__Machine__Group_5__0 )? )
            // InternalXMachine.g:804:2: ( rule__Machine__Group_5__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_5()); 
            // InternalXMachine.g:805:2: ( rule__Machine__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:805:3: rule__Machine__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalXMachine.g:813:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl rule__Machine__Group__7 ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:817:1: ( rule__Machine__Group__6__Impl rule__Machine__Group__7 )
            // InternalXMachine.g:818:2: rule__Machine__Group__6__Impl rule__Machine__Group__7
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
    // InternalXMachine.g:825:1: rule__Machine__Group__6__Impl : ( ( rule__Machine__Group_6__0 )? ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:829:1: ( ( ( rule__Machine__Group_6__0 )? ) )
            // InternalXMachine.g:830:1: ( ( rule__Machine__Group_6__0 )? )
            {
            // InternalXMachine.g:830:1: ( ( rule__Machine__Group_6__0 )? )
            // InternalXMachine.g:831:2: ( rule__Machine__Group_6__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_6()); 
            // InternalXMachine.g:832:2: ( rule__Machine__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXMachine.g:832:3: rule__Machine__Group_6__0
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
    // InternalXMachine.g:840:1: rule__Machine__Group__7 : rule__Machine__Group__7__Impl rule__Machine__Group__8 ;
    public final void rule__Machine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:844:1: ( rule__Machine__Group__7__Impl rule__Machine__Group__8 )
            // InternalXMachine.g:845:2: rule__Machine__Group__7__Impl rule__Machine__Group__8
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
    // InternalXMachine.g:852:1: rule__Machine__Group__7__Impl : ( ( rule__Machine__Group_7__0 )? ) ;
    public final void rule__Machine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:856:1: ( ( ( rule__Machine__Group_7__0 )? ) )
            // InternalXMachine.g:857:1: ( ( rule__Machine__Group_7__0 )? )
            {
            // InternalXMachine.g:857:1: ( ( rule__Machine__Group_7__0 )? )
            // InternalXMachine.g:858:2: ( rule__Machine__Group_7__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_7()); 
            // InternalXMachine.g:859:2: ( rule__Machine__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXMachine.g:859:3: rule__Machine__Group_7__0
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
    // InternalXMachine.g:867:1: rule__Machine__Group__8 : rule__Machine__Group__8__Impl rule__Machine__Group__9 ;
    public final void rule__Machine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:871:1: ( rule__Machine__Group__8__Impl rule__Machine__Group__9 )
            // InternalXMachine.g:872:2: rule__Machine__Group__8__Impl rule__Machine__Group__9
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
    // InternalXMachine.g:879:1: rule__Machine__Group__8__Impl : ( ( rule__Machine__Group_8__0 )? ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:883:1: ( ( ( rule__Machine__Group_8__0 )? ) )
            // InternalXMachine.g:884:1: ( ( rule__Machine__Group_8__0 )? )
            {
            // InternalXMachine.g:884:1: ( ( rule__Machine__Group_8__0 )? )
            // InternalXMachine.g:885:2: ( rule__Machine__Group_8__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_8()); 
            // InternalXMachine.g:886:2: ( rule__Machine__Group_8__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:886:3: rule__Machine__Group_8__0
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
    // InternalXMachine.g:894:1: rule__Machine__Group__9 : rule__Machine__Group__9__Impl rule__Machine__Group__10 ;
    public final void rule__Machine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:898:1: ( rule__Machine__Group__9__Impl rule__Machine__Group__10 )
            // InternalXMachine.g:899:2: rule__Machine__Group__9__Impl rule__Machine__Group__10
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
    // InternalXMachine.g:906:1: rule__Machine__Group__9__Impl : ( ( rule__Machine__Group_9__0 )? ) ;
    public final void rule__Machine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:910:1: ( ( ( rule__Machine__Group_9__0 )? ) )
            // InternalXMachine.g:911:1: ( ( rule__Machine__Group_9__0 )? )
            {
            // InternalXMachine.g:911:1: ( ( rule__Machine__Group_9__0 )? )
            // InternalXMachine.g:912:2: ( rule__Machine__Group_9__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_9()); 
            // InternalXMachine.g:913:2: ( rule__Machine__Group_9__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXMachine.g:913:3: rule__Machine__Group_9__0
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
    // InternalXMachine.g:921:1: rule__Machine__Group__10 : rule__Machine__Group__10__Impl rule__Machine__Group__11 ;
    public final void rule__Machine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:925:1: ( rule__Machine__Group__10__Impl rule__Machine__Group__11 )
            // InternalXMachine.g:926:2: rule__Machine__Group__10__Impl rule__Machine__Group__11
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
    // InternalXMachine.g:933:1: rule__Machine__Group__10__Impl : ( ( rule__Machine__Group_10__0 )? ) ;
    public final void rule__Machine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:937:1: ( ( ( rule__Machine__Group_10__0 )? ) )
            // InternalXMachine.g:938:1: ( ( rule__Machine__Group_10__0 )? )
            {
            // InternalXMachine.g:938:1: ( ( rule__Machine__Group_10__0 )? )
            // InternalXMachine.g:939:2: ( rule__Machine__Group_10__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_10()); 
            // InternalXMachine.g:940:2: ( rule__Machine__Group_10__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:940:3: rule__Machine__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_10()); 

            }


            }

        }
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
    // InternalXMachine.g:948:1: rule__Machine__Group__11 : rule__Machine__Group__11__Impl rule__Machine__Group__12 ;
    public final void rule__Machine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:952:1: ( rule__Machine__Group__11__Impl rule__Machine__Group__12 )
            // InternalXMachine.g:953:2: rule__Machine__Group__11__Impl rule__Machine__Group__12
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__12();

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
    // InternalXMachine.g:960:1: rule__Machine__Group__11__Impl : ( ( rule__Machine__ExtensionsAssignment_11 )* ) ;
    public final void rule__Machine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:964:1: ( ( ( rule__Machine__ExtensionsAssignment_11 )* ) )
            // InternalXMachine.g:965:1: ( ( rule__Machine__ExtensionsAssignment_11 )* )
            {
            // InternalXMachine.g:965:1: ( ( rule__Machine__ExtensionsAssignment_11 )* )
            // InternalXMachine.g:966:2: ( rule__Machine__ExtensionsAssignment_11 )*
            {
             before(grammarAccess.getMachineAccess().getExtensionsAssignment_11()); 
            // InternalXMachine.g:967:2: ( rule__Machine__ExtensionsAssignment_11 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXMachine.g:967:3: rule__Machine__ExtensionsAssignment_11
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Machine__ExtensionsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getExtensionsAssignment_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__Machine__Group__12"
    // InternalXMachine.g:975:1: rule__Machine__Group__12 : rule__Machine__Group__12__Impl ;
    public final void rule__Machine__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:979:1: ( rule__Machine__Group__12__Impl )
            // InternalXMachine.g:980:2: rule__Machine__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__12__Impl();

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
    // $ANTLR end "rule__Machine__Group__12"


    // $ANTLR start "rule__Machine__Group__12__Impl"
    // InternalXMachine.g:986:1: rule__Machine__Group__12__Impl : ( 'end' ) ;
    public final void rule__Machine__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:990:1: ( ( 'end' ) )
            // InternalXMachine.g:991:1: ( 'end' )
            {
            // InternalXMachine.g:991:1: ( 'end' )
            // InternalXMachine.g:992:2: 'end'
            {
             before(grammarAccess.getMachineAccess().getEndKeyword_12()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getEndKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__12__Impl"


    // $ANTLR start "rule__Machine__Group_5__0"
    // InternalXMachine.g:1002:1: rule__Machine__Group_5__0 : rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 ;
    public final void rule__Machine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1006:1: ( rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 )
            // InternalXMachine.g:1007:2: rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_5__1();

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
    // $ANTLR end "rule__Machine__Group_5__0"


    // $ANTLR start "rule__Machine__Group_5__0__Impl"
    // InternalXMachine.g:1014:1: rule__Machine__Group_5__0__Impl : ( 'refines' ) ;
    public final void rule__Machine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1018:1: ( ( 'refines' ) )
            // InternalXMachine.g:1019:1: ( 'refines' )
            {
            // InternalXMachine.g:1019:1: ( 'refines' )
            // InternalXMachine.g:1020:2: 'refines'
            {
             before(grammarAccess.getMachineAccess().getRefinesKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getRefinesKeyword_5_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1029:1: rule__Machine__Group_5__1 : rule__Machine__Group_5__1__Impl ;
    public final void rule__Machine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1033:1: ( rule__Machine__Group_5__1__Impl )
            // InternalXMachine.g:1034:2: rule__Machine__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_5__1__Impl();

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
    // $ANTLR end "rule__Machine__Group_5__1"


    // $ANTLR start "rule__Machine__Group_5__1__Impl"
    // InternalXMachine.g:1040:1: rule__Machine__Group_5__1__Impl : ( ( rule__Machine__RefinesAssignment_5_1 ) ) ;
    public final void rule__Machine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1044:1: ( ( ( rule__Machine__RefinesAssignment_5_1 ) ) )
            // InternalXMachine.g:1045:1: ( ( rule__Machine__RefinesAssignment_5_1 ) )
            {
            // InternalXMachine.g:1045:1: ( ( rule__Machine__RefinesAssignment_5_1 ) )
            // InternalXMachine.g:1046:2: ( rule__Machine__RefinesAssignment_5_1 )
            {
             before(grammarAccess.getMachineAccess().getRefinesAssignment_5_1()); 
            // InternalXMachine.g:1047:2: ( rule__Machine__RefinesAssignment_5_1 )
            // InternalXMachine.g:1047:3: rule__Machine__RefinesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__RefinesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getRefinesAssignment_5_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1056:1: rule__Machine__Group_6__0 : rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 ;
    public final void rule__Machine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1060:1: ( rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 )
            // InternalXMachine.g:1061:2: rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1
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
    // InternalXMachine.g:1068:1: rule__Machine__Group_6__0__Impl : ( 'sees' ) ;
    public final void rule__Machine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1072:1: ( ( 'sees' ) )
            // InternalXMachine.g:1073:1: ( 'sees' )
            {
            // InternalXMachine.g:1073:1: ( 'sees' )
            // InternalXMachine.g:1074:2: 'sees'
            {
             before(grammarAccess.getMachineAccess().getSeesKeyword_6_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getSeesKeyword_6_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1083:1: rule__Machine__Group_6__1 : rule__Machine__Group_6__1__Impl ;
    public final void rule__Machine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1087:1: ( rule__Machine__Group_6__1__Impl )
            // InternalXMachine.g:1088:2: rule__Machine__Group_6__1__Impl
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
    // InternalXMachine.g:1094:1: rule__Machine__Group_6__1__Impl : ( ( ( rule__Machine__SeesAssignment_6_1 ) ) ( ( rule__Machine__SeesAssignment_6_1 )* ) ) ;
    public final void rule__Machine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1098:1: ( ( ( ( rule__Machine__SeesAssignment_6_1 ) ) ( ( rule__Machine__SeesAssignment_6_1 )* ) ) )
            // InternalXMachine.g:1099:1: ( ( ( rule__Machine__SeesAssignment_6_1 ) ) ( ( rule__Machine__SeesAssignment_6_1 )* ) )
            {
            // InternalXMachine.g:1099:1: ( ( ( rule__Machine__SeesAssignment_6_1 ) ) ( ( rule__Machine__SeesAssignment_6_1 )* ) )
            // InternalXMachine.g:1100:2: ( ( rule__Machine__SeesAssignment_6_1 ) ) ( ( rule__Machine__SeesAssignment_6_1 )* )
            {
            // InternalXMachine.g:1100:2: ( ( rule__Machine__SeesAssignment_6_1 ) )
            // InternalXMachine.g:1101:3: ( rule__Machine__SeesAssignment_6_1 )
            {
             before(grammarAccess.getMachineAccess().getSeesAssignment_6_1()); 
            // InternalXMachine.g:1102:3: ( rule__Machine__SeesAssignment_6_1 )
            // InternalXMachine.g:1102:4: rule__Machine__SeesAssignment_6_1
            {
            pushFollow(FOLLOW_8);
            rule__Machine__SeesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getSeesAssignment_6_1()); 

            }

            // InternalXMachine.g:1105:2: ( ( rule__Machine__SeesAssignment_6_1 )* )
            // InternalXMachine.g:1106:3: ( rule__Machine__SeesAssignment_6_1 )*
            {
             before(grammarAccess.getMachineAccess().getSeesAssignment_6_1()); 
            // InternalXMachine.g:1107:3: ( rule__Machine__SeesAssignment_6_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalXMachine.g:1107:4: rule__Machine__SeesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__SeesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getSeesAssignment_6_1()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:1117:1: rule__Machine__Group_7__0 : rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 ;
    public final void rule__Machine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1121:1: ( rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 )
            // InternalXMachine.g:1122:2: rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXMachine.g:1129:1: rule__Machine__Group_7__0__Impl : ( 'variables' ) ;
    public final void rule__Machine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1133:1: ( ( 'variables' ) )
            // InternalXMachine.g:1134:1: ( 'variables' )
            {
            // InternalXMachine.g:1134:1: ( 'variables' )
            // InternalXMachine.g:1135:2: 'variables'
            {
             before(grammarAccess.getMachineAccess().getVariablesKeyword_7_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getVariablesKeyword_7_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1144:1: rule__Machine__Group_7__1 : rule__Machine__Group_7__1__Impl ;
    public final void rule__Machine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1148:1: ( rule__Machine__Group_7__1__Impl )
            // InternalXMachine.g:1149:2: rule__Machine__Group_7__1__Impl
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
    // InternalXMachine.g:1155:1: rule__Machine__Group_7__1__Impl : ( ( ( rule__Machine__VariablesAssignment_7_1 ) ) ( ( rule__Machine__VariablesAssignment_7_1 )* ) ) ;
    public final void rule__Machine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1159:1: ( ( ( ( rule__Machine__VariablesAssignment_7_1 ) ) ( ( rule__Machine__VariablesAssignment_7_1 )* ) ) )
            // InternalXMachine.g:1160:1: ( ( ( rule__Machine__VariablesAssignment_7_1 ) ) ( ( rule__Machine__VariablesAssignment_7_1 )* ) )
            {
            // InternalXMachine.g:1160:1: ( ( ( rule__Machine__VariablesAssignment_7_1 ) ) ( ( rule__Machine__VariablesAssignment_7_1 )* ) )
            // InternalXMachine.g:1161:2: ( ( rule__Machine__VariablesAssignment_7_1 ) ) ( ( rule__Machine__VariablesAssignment_7_1 )* )
            {
            // InternalXMachine.g:1161:2: ( ( rule__Machine__VariablesAssignment_7_1 ) )
            // InternalXMachine.g:1162:3: ( rule__Machine__VariablesAssignment_7_1 )
            {
             before(grammarAccess.getMachineAccess().getVariablesAssignment_7_1()); 
            // InternalXMachine.g:1163:3: ( rule__Machine__VariablesAssignment_7_1 )
            // InternalXMachine.g:1163:4: rule__Machine__VariablesAssignment_7_1
            {
            pushFollow(FOLLOW_8);
            rule__Machine__VariablesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getVariablesAssignment_7_1()); 

            }

            // InternalXMachine.g:1166:2: ( ( rule__Machine__VariablesAssignment_7_1 )* )
            // InternalXMachine.g:1167:3: ( rule__Machine__VariablesAssignment_7_1 )*
            {
             before(grammarAccess.getMachineAccess().getVariablesAssignment_7_1()); 
            // InternalXMachine.g:1168:3: ( rule__Machine__VariablesAssignment_7_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalXMachine.g:1168:4: rule__Machine__VariablesAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__VariablesAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getVariablesAssignment_7_1()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:1178:1: rule__Machine__Group_8__0 : rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 ;
    public final void rule__Machine__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1182:1: ( rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 )
            // InternalXMachine.g:1183:2: rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalXMachine.g:1190:1: rule__Machine__Group_8__0__Impl : ( 'invariants' ) ;
    public final void rule__Machine__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1194:1: ( ( 'invariants' ) )
            // InternalXMachine.g:1195:1: ( 'invariants' )
            {
            // InternalXMachine.g:1195:1: ( 'invariants' )
            // InternalXMachine.g:1196:2: 'invariants'
            {
             before(grammarAccess.getMachineAccess().getInvariantsKeyword_8_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getInvariantsKeyword_8_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1205:1: rule__Machine__Group_8__1 : rule__Machine__Group_8__1__Impl ;
    public final void rule__Machine__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1209:1: ( rule__Machine__Group_8__1__Impl )
            // InternalXMachine.g:1210:2: rule__Machine__Group_8__1__Impl
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
    // InternalXMachine.g:1216:1: rule__Machine__Group_8__1__Impl : ( ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* ) ) ;
    public final void rule__Machine__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1220:1: ( ( ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* ) ) )
            // InternalXMachine.g:1221:1: ( ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* ) )
            {
            // InternalXMachine.g:1221:1: ( ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* ) )
            // InternalXMachine.g:1222:2: ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* )
            {
            // InternalXMachine.g:1222:2: ( ( rule__Machine__InvariantsAssignment_8_1 ) )
            // InternalXMachine.g:1223:3: ( rule__Machine__InvariantsAssignment_8_1 )
            {
             before(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1()); 
            // InternalXMachine.g:1224:3: ( rule__Machine__InvariantsAssignment_8_1 )
            // InternalXMachine.g:1224:4: rule__Machine__InvariantsAssignment_8_1
            {
            pushFollow(FOLLOW_10);
            rule__Machine__InvariantsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1()); 

            }

            // InternalXMachine.g:1227:2: ( ( rule__Machine__InvariantsAssignment_8_1 )* )
            // InternalXMachine.g:1228:3: ( rule__Machine__InvariantsAssignment_8_1 )*
            {
             before(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1()); 
            // InternalXMachine.g:1229:3: ( rule__Machine__InvariantsAssignment_8_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_XLABEL) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalXMachine.g:1229:4: rule__Machine__InvariantsAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Machine__InvariantsAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:1239:1: rule__Machine__Group_9__0 : rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 ;
    public final void rule__Machine__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1243:1: ( rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 )
            // InternalXMachine.g:1244:2: rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalXMachine.g:1251:1: rule__Machine__Group_9__0__Impl : ( 'variant' ) ;
    public final void rule__Machine__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1255:1: ( ( 'variant' ) )
            // InternalXMachine.g:1256:1: ( 'variant' )
            {
            // InternalXMachine.g:1256:1: ( 'variant' )
            // InternalXMachine.g:1257:2: 'variant'
            {
             before(grammarAccess.getMachineAccess().getVariantKeyword_9_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getVariantKeyword_9_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1266:1: rule__Machine__Group_9__1 : rule__Machine__Group_9__1__Impl ;
    public final void rule__Machine__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1270:1: ( rule__Machine__Group_9__1__Impl )
            // InternalXMachine.g:1271:2: rule__Machine__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_9__1__Impl();

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
    // InternalXMachine.g:1277:1: rule__Machine__Group_9__1__Impl : ( ( rule__Machine__VariantAssignment_9_1 ) ) ;
    public final void rule__Machine__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1281:1: ( ( ( rule__Machine__VariantAssignment_9_1 ) ) )
            // InternalXMachine.g:1282:1: ( ( rule__Machine__VariantAssignment_9_1 ) )
            {
            // InternalXMachine.g:1282:1: ( ( rule__Machine__VariantAssignment_9_1 ) )
            // InternalXMachine.g:1283:2: ( rule__Machine__VariantAssignment_9_1 )
            {
             before(grammarAccess.getMachineAccess().getVariantAssignment_9_1()); 
            // InternalXMachine.g:1284:2: ( rule__Machine__VariantAssignment_9_1 )
            // InternalXMachine.g:1284:3: rule__Machine__VariantAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__VariantAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getVariantAssignment_9_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Machine__Group_10__0"
    // InternalXMachine.g:1293:1: rule__Machine__Group_10__0 : rule__Machine__Group_10__0__Impl rule__Machine__Group_10__1 ;
    public final void rule__Machine__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1297:1: ( rule__Machine__Group_10__0__Impl rule__Machine__Group_10__1 )
            // InternalXMachine.g:1298:2: rule__Machine__Group_10__0__Impl rule__Machine__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_10__1();

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
    // $ANTLR end "rule__Machine__Group_10__0"


    // $ANTLR start "rule__Machine__Group_10__0__Impl"
    // InternalXMachine.g:1305:1: rule__Machine__Group_10__0__Impl : ( 'events' ) ;
    public final void rule__Machine__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1309:1: ( ( 'events' ) )
            // InternalXMachine.g:1310:1: ( 'events' )
            {
            // InternalXMachine.g:1310:1: ( 'events' )
            // InternalXMachine.g:1311:2: 'events'
            {
             before(grammarAccess.getMachineAccess().getEventsKeyword_10_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getEventsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_10__0__Impl"


    // $ANTLR start "rule__Machine__Group_10__1"
    // InternalXMachine.g:1320:1: rule__Machine__Group_10__1 : rule__Machine__Group_10__1__Impl rule__Machine__Group_10__2 ;
    public final void rule__Machine__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1324:1: ( rule__Machine__Group_10__1__Impl rule__Machine__Group_10__2 )
            // InternalXMachine.g:1325:2: rule__Machine__Group_10__1__Impl rule__Machine__Group_10__2
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_10__2();

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
    // $ANTLR end "rule__Machine__Group_10__1"


    // $ANTLR start "rule__Machine__Group_10__1__Impl"
    // InternalXMachine.g:1332:1: rule__Machine__Group_10__1__Impl : ( ( rule__Machine__EventsAssignment_10_1 ) ) ;
    public final void rule__Machine__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1336:1: ( ( ( rule__Machine__EventsAssignment_10_1 ) ) )
            // InternalXMachine.g:1337:1: ( ( rule__Machine__EventsAssignment_10_1 ) )
            {
            // InternalXMachine.g:1337:1: ( ( rule__Machine__EventsAssignment_10_1 ) )
            // InternalXMachine.g:1338:2: ( rule__Machine__EventsAssignment_10_1 )
            {
             before(grammarAccess.getMachineAccess().getEventsAssignment_10_1()); 
            // InternalXMachine.g:1339:2: ( rule__Machine__EventsAssignment_10_1 )
            // InternalXMachine.g:1339:3: rule__Machine__EventsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__EventsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getEventsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_10__1__Impl"


    // $ANTLR start "rule__Machine__Group_10__2"
    // InternalXMachine.g:1347:1: rule__Machine__Group_10__2 : rule__Machine__Group_10__2__Impl ;
    public final void rule__Machine__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1351:1: ( rule__Machine__Group_10__2__Impl )
            // InternalXMachine.g:1352:2: rule__Machine__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_10__2__Impl();

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
    // $ANTLR end "rule__Machine__Group_10__2"


    // $ANTLR start "rule__Machine__Group_10__2__Impl"
    // InternalXMachine.g:1358:1: rule__Machine__Group_10__2__Impl : ( ( rule__Machine__EventsAssignment_10_2 )* ) ;
    public final void rule__Machine__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1362:1: ( ( ( rule__Machine__EventsAssignment_10_2 )* ) )
            // InternalXMachine.g:1363:1: ( ( rule__Machine__EventsAssignment_10_2 )* )
            {
            // InternalXMachine.g:1363:1: ( ( rule__Machine__EventsAssignment_10_2 )* )
            // InternalXMachine.g:1364:2: ( rule__Machine__EventsAssignment_10_2 )*
            {
             before(grammarAccess.getMachineAccess().getEventsAssignment_10_2()); 
            // InternalXMachine.g:1365:2: ( rule__Machine__EventsAssignment_10_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXMachine.g:1365:3: rule__Machine__EventsAssignment_10_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__EventsAssignment_10_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getEventsAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_10__2__Impl"


    // $ANTLR start "rule__MIncludes__Group__0"
    // InternalXMachine.g:1374:1: rule__MIncludes__Group__0 : rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 ;
    public final void rule__MIncludes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1378:1: ( rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 )
            // InternalXMachine.g:1379:2: rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalXMachine.g:1386:1: rule__MIncludes__Group__0__Impl : ( () ) ;
    public final void rule__MIncludes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1390:1: ( ( () ) )
            // InternalXMachine.g:1391:1: ( () )
            {
            // InternalXMachine.g:1391:1: ( () )
            // InternalXMachine.g:1392:2: ()
            {
             before(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 
            // InternalXMachine.g:1393:2: ()
            // InternalXMachine.g:1393:3: 
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
    // InternalXMachine.g:1401:1: rule__MIncludes__Group__1 : rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 ;
    public final void rule__MIncludes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1405:1: ( rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 )
            // InternalXMachine.g:1406:2: rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalXMachine.g:1413:1: rule__MIncludes__Group__1__Impl : ( ( rule__MIncludes__Group_1__0 ) ) ;
    public final void rule__MIncludes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1417:1: ( ( ( rule__MIncludes__Group_1__0 ) ) )
            // InternalXMachine.g:1418:1: ( ( rule__MIncludes__Group_1__0 ) )
            {
            // InternalXMachine.g:1418:1: ( ( rule__MIncludes__Group_1__0 ) )
            // InternalXMachine.g:1419:2: ( rule__MIncludes__Group_1__0 )
            {
             before(grammarAccess.getMIncludesAccess().getGroup_1()); 
            // InternalXMachine.g:1420:2: ( rule__MIncludes__Group_1__0 )
            // InternalXMachine.g:1420:3: rule__MIncludes__Group_1__0
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
    // InternalXMachine.g:1428:1: rule__MIncludes__Group__2 : rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 ;
    public final void rule__MIncludes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1432:1: ( rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 )
            // InternalXMachine.g:1433:2: rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalXMachine.g:1440:1: rule__MIncludes__Group__2__Impl : ( ( rule__MIncludes__Group_2__0 )? ) ;
    public final void rule__MIncludes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1444:1: ( ( ( rule__MIncludes__Group_2__0 )? ) )
            // InternalXMachine.g:1445:1: ( ( rule__MIncludes__Group_2__0 )? )
            {
            // InternalXMachine.g:1445:1: ( ( rule__MIncludes__Group_2__0 )? )
            // InternalXMachine.g:1446:2: ( rule__MIncludes__Group_2__0 )?
            {
             before(grammarAccess.getMIncludesAccess().getGroup_2()); 
            // InternalXMachine.g:1447:2: ( rule__MIncludes__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXMachine.g:1447:3: rule__MIncludes__Group_2__0
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
    // InternalXMachine.g:1455:1: rule__MIncludes__Group__3 : rule__MIncludes__Group__3__Impl ;
    public final void rule__MIncludes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1459:1: ( rule__MIncludes__Group__3__Impl )
            // InternalXMachine.g:1460:2: rule__MIncludes__Group__3__Impl
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
    // InternalXMachine.g:1466:1: rule__MIncludes__Group__3__Impl : ( ( rule__MIncludes__Group_3__0 )? ) ;
    public final void rule__MIncludes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1470:1: ( ( ( rule__MIncludes__Group_3__0 )? ) )
            // InternalXMachine.g:1471:1: ( ( rule__MIncludes__Group_3__0 )? )
            {
            // InternalXMachine.g:1471:1: ( ( rule__MIncludes__Group_3__0 )? )
            // InternalXMachine.g:1472:2: ( rule__MIncludes__Group_3__0 )?
            {
             before(grammarAccess.getMIncludesAccess().getGroup_3()); 
            // InternalXMachine.g:1473:2: ( rule__MIncludes__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXMachine.g:1473:3: rule__MIncludes__Group_3__0
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
    // InternalXMachine.g:1482:1: rule__MIncludes__Group_1__0 : rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 ;
    public final void rule__MIncludes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1486:1: ( rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 )
            // InternalXMachine.g:1487:2: rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1
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
    // InternalXMachine.g:1494:1: rule__MIncludes__Group_1__0__Impl : ( 'includes' ) ;
    public final void rule__MIncludes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1498:1: ( ( 'includes' ) )
            // InternalXMachine.g:1499:1: ( 'includes' )
            {
            // InternalXMachine.g:1499:1: ( 'includes' )
            // InternalXMachine.g:1500:2: 'includes'
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
    // InternalXMachine.g:1509:1: rule__MIncludes__Group_1__1 : rule__MIncludes__Group_1__1__Impl ;
    public final void rule__MIncludes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1513:1: ( rule__MIncludes__Group_1__1__Impl )
            // InternalXMachine.g:1514:2: rule__MIncludes__Group_1__1__Impl
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
    // InternalXMachine.g:1520:1: rule__MIncludes__Group_1__1__Impl : ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) ;
    public final void rule__MIncludes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1524:1: ( ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) )
            // InternalXMachine.g:1525:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            {
            // InternalXMachine.g:1525:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            // InternalXMachine.g:1526:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            {
             before(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 
            // InternalXMachine.g:1527:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            // InternalXMachine.g:1527:3: rule__MIncludes__AbstractMachineAssignment_1_1
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
    // InternalXMachine.g:1536:1: rule__MIncludes__Group_2__0 : rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 ;
    public final void rule__MIncludes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1540:1: ( rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 )
            // InternalXMachine.g:1541:2: rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1
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
    // InternalXMachine.g:1548:1: rule__MIncludes__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__MIncludes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1552:1: ( ( 'to' ) )
            // InternalXMachine.g:1553:1: ( 'to' )
            {
            // InternalXMachine.g:1553:1: ( 'to' )
            // InternalXMachine.g:1554:2: 'to'
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
    // InternalXMachine.g:1563:1: rule__MIncludes__Group_2__1 : rule__MIncludes__Group_2__1__Impl ;
    public final void rule__MIncludes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1567:1: ( rule__MIncludes__Group_2__1__Impl )
            // InternalXMachine.g:1568:2: rule__MIncludes__Group_2__1__Impl
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
    // InternalXMachine.g:1574:1: rule__MIncludes__Group_2__1__Impl : ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) ;
    public final void rule__MIncludes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1578:1: ( ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) )
            // InternalXMachine.g:1579:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            {
            // InternalXMachine.g:1579:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            // InternalXMachine.g:1580:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            {
             before(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 
            // InternalXMachine.g:1581:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            // InternalXMachine.g:1581:3: rule__MIncludes__ConcreteMachineAssignment_2_1
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
    // InternalXMachine.g:1590:1: rule__MIncludes__Group_3__0 : rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 ;
    public final void rule__MIncludes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1594:1: ( rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 )
            // InternalXMachine.g:1595:2: rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1
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
    // InternalXMachine.g:1602:1: rule__MIncludes__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__MIncludes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1606:1: ( ( 'as' ) )
            // InternalXMachine.g:1607:1: ( 'as' )
            {
            // InternalXMachine.g:1607:1: ( 'as' )
            // InternalXMachine.g:1608:2: 'as'
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
    // InternalXMachine.g:1617:1: rule__MIncludes__Group_3__1 : rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 ;
    public final void rule__MIncludes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1621:1: ( rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 )
            // InternalXMachine.g:1622:2: rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2
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
    // InternalXMachine.g:1629:1: rule__MIncludes__Group_3__1__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) ;
    public final void rule__MIncludes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1633:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) )
            // InternalXMachine.g:1634:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            {
            // InternalXMachine.g:1634:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            // InternalXMachine.g:1635:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            {
             before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 
            // InternalXMachine.g:1636:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            // InternalXMachine.g:1636:3: rule__MIncludes__PrefixesAssignment_3_1
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
    // InternalXMachine.g:1644:1: rule__MIncludes__Group_3__2 : rule__MIncludes__Group_3__2__Impl ;
    public final void rule__MIncludes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1648:1: ( rule__MIncludes__Group_3__2__Impl )
            // InternalXMachine.g:1649:2: rule__MIncludes__Group_3__2__Impl
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
    // InternalXMachine.g:1655:1: rule__MIncludes__Group_3__2__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) ;
    public final void rule__MIncludes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1659:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) )
            // InternalXMachine.g:1660:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            {
            // InternalXMachine.g:1660:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            // InternalXMachine.g:1661:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            {
             before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 
            // InternalXMachine.g:1662:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXMachine.g:1662:3: rule__MIncludes__PrefixesAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MIncludes__PrefixesAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalXMachine.g:1671:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1675:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXMachine.g:1676:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalXMachine.g:1683:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1687:1: ( ( RULE_ID ) )
            // InternalXMachine.g:1688:1: ( RULE_ID )
            {
            // InternalXMachine.g:1688:1: ( RULE_ID )
            // InternalXMachine.g:1689:2: RULE_ID
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
    // InternalXMachine.g:1698:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1702:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXMachine.g:1703:2: rule__QualifiedName__Group__1__Impl
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
    // InternalXMachine.g:1709:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )? ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1713:1: ( ( ( rule__QualifiedName__Group_1__0 )? ) )
            // InternalXMachine.g:1714:1: ( ( rule__QualifiedName__Group_1__0 )? )
            {
            // InternalXMachine.g:1714:1: ( ( rule__QualifiedName__Group_1__0 )? )
            // InternalXMachine.g:1715:2: ( rule__QualifiedName__Group_1__0 )?
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalXMachine.g:1716:2: ( rule__QualifiedName__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXMachine.g:1716:3: rule__QualifiedName__Group_1__0
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
    // InternalXMachine.g:1725:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1729:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXMachine.g:1730:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalXMachine.g:1737:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1741:1: ( ( '.' ) )
            // InternalXMachine.g:1742:1: ( '.' )
            {
            // InternalXMachine.g:1742:1: ( '.' )
            // InternalXMachine.g:1743:2: '.'
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
    // InternalXMachine.g:1752:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1756:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXMachine.g:1757:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalXMachine.g:1763:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1767:1: ( ( RULE_ID ) )
            // InternalXMachine.g:1768:1: ( RULE_ID )
            {
            // InternalXMachine.g:1768:1: ( RULE_ID )
            // InternalXMachine.g:1769:2: RULE_ID
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
    // InternalXMachine.g:1779:1: rule__XVariable__Group__0 : rule__XVariable__Group__0__Impl rule__XVariable__Group__1 ;
    public final void rule__XVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1783:1: ( rule__XVariable__Group__0__Impl rule__XVariable__Group__1 )
            // InternalXMachine.g:1784:2: rule__XVariable__Group__0__Impl rule__XVariable__Group__1
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
    // InternalXMachine.g:1791:1: rule__XVariable__Group__0__Impl : ( () ) ;
    public final void rule__XVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1795:1: ( ( () ) )
            // InternalXMachine.g:1796:1: ( () )
            {
            // InternalXMachine.g:1796:1: ( () )
            // InternalXMachine.g:1797:2: ()
            {
             before(grammarAccess.getXVariableAccess().getVariableAction_0()); 
            // InternalXMachine.g:1798:2: ()
            // InternalXMachine.g:1798:3: 
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
    // InternalXMachine.g:1806:1: rule__XVariable__Group__1 : rule__XVariable__Group__1__Impl ;
    public final void rule__XVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1810:1: ( rule__XVariable__Group__1__Impl )
            // InternalXMachine.g:1811:2: rule__XVariable__Group__1__Impl
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
    // InternalXMachine.g:1817:1: rule__XVariable__Group__1__Impl : ( ( rule__XVariable__NameAssignment_1 ) ) ;
    public final void rule__XVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1821:1: ( ( ( rule__XVariable__NameAssignment_1 ) ) )
            // InternalXMachine.g:1822:1: ( ( rule__XVariable__NameAssignment_1 ) )
            {
            // InternalXMachine.g:1822:1: ( ( rule__XVariable__NameAssignment_1 ) )
            // InternalXMachine.g:1823:2: ( rule__XVariable__NameAssignment_1 )
            {
             before(grammarAccess.getXVariableAccess().getNameAssignment_1()); 
            // InternalXMachine.g:1824:2: ( rule__XVariable__NameAssignment_1 )
            // InternalXMachine.g:1824:3: rule__XVariable__NameAssignment_1
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
    // InternalXMachine.g:1833:1: rule__XInvariant__Group__0 : rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 ;
    public final void rule__XInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1837:1: ( rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 )
            // InternalXMachine.g:1838:2: rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1
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
    // InternalXMachine.g:1845:1: rule__XInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1849:1: ( ( () ) )
            // InternalXMachine.g:1850:1: ( () )
            {
            // InternalXMachine.g:1850:1: ( () )
            // InternalXMachine.g:1851:2: ()
            {
             before(grammarAccess.getXInvariantAccess().getInvariantAction_0()); 
            // InternalXMachine.g:1852:2: ()
            // InternalXMachine.g:1852:3: 
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
    // InternalXMachine.g:1860:1: rule__XInvariant__Group__1 : rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 ;
    public final void rule__XInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1864:1: ( rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 )
            // InternalXMachine.g:1865:2: rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2
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
    // InternalXMachine.g:1872:1: rule__XInvariant__Group__1__Impl : ( ( rule__XInvariant__NameAssignment_1 ) ) ;
    public final void rule__XInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1876:1: ( ( ( rule__XInvariant__NameAssignment_1 ) ) )
            // InternalXMachine.g:1877:1: ( ( rule__XInvariant__NameAssignment_1 ) )
            {
            // InternalXMachine.g:1877:1: ( ( rule__XInvariant__NameAssignment_1 ) )
            // InternalXMachine.g:1878:2: ( rule__XInvariant__NameAssignment_1 )
            {
             before(grammarAccess.getXInvariantAccess().getNameAssignment_1()); 
            // InternalXMachine.g:1879:2: ( rule__XInvariant__NameAssignment_1 )
            // InternalXMachine.g:1879:3: rule__XInvariant__NameAssignment_1
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
    // InternalXMachine.g:1887:1: rule__XInvariant__Group__2 : rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 ;
    public final void rule__XInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1891:1: ( rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 )
            // InternalXMachine.g:1892:2: rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalXMachine.g:1899:1: rule__XInvariant__Group__2__Impl : ( ( rule__XInvariant__PredicateAssignment_2 ) ) ;
    public final void rule__XInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1903:1: ( ( ( rule__XInvariant__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:1904:1: ( ( rule__XInvariant__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:1904:1: ( ( rule__XInvariant__PredicateAssignment_2 ) )
            // InternalXMachine.g:1905:2: ( rule__XInvariant__PredicateAssignment_2 )
            {
             before(grammarAccess.getXInvariantAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:1906:2: ( rule__XInvariant__PredicateAssignment_2 )
            // InternalXMachine.g:1906:3: rule__XInvariant__PredicateAssignment_2
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
    // InternalXMachine.g:1914:1: rule__XInvariant__Group__3 : rule__XInvariant__Group__3__Impl ;
    public final void rule__XInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1918:1: ( rule__XInvariant__Group__3__Impl )
            // InternalXMachine.g:1919:2: rule__XInvariant__Group__3__Impl
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
    // InternalXMachine.g:1925:1: rule__XInvariant__Group__3__Impl : ( ( rule__XInvariant__TheoremAssignment_3 )? ) ;
    public final void rule__XInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1929:1: ( ( ( rule__XInvariant__TheoremAssignment_3 )? ) )
            // InternalXMachine.g:1930:1: ( ( rule__XInvariant__TheoremAssignment_3 )? )
            {
            // InternalXMachine.g:1930:1: ( ( rule__XInvariant__TheoremAssignment_3 )? )
            // InternalXMachine.g:1931:2: ( rule__XInvariant__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXInvariantAccess().getTheoremAssignment_3()); 
            // InternalXMachine.g:1932:2: ( rule__XInvariant__TheoremAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXMachine.g:1932:3: rule__XInvariant__TheoremAssignment_3
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
    // InternalXMachine.g:1941:1: rule__XVariant__Group__0 : rule__XVariant__Group__0__Impl rule__XVariant__Group__1 ;
    public final void rule__XVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1945:1: ( rule__XVariant__Group__0__Impl rule__XVariant__Group__1 )
            // InternalXMachine.g:1946:2: rule__XVariant__Group__0__Impl rule__XVariant__Group__1
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
    // InternalXMachine.g:1953:1: rule__XVariant__Group__0__Impl : ( () ) ;
    public final void rule__XVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1957:1: ( ( () ) )
            // InternalXMachine.g:1958:1: ( () )
            {
            // InternalXMachine.g:1958:1: ( () )
            // InternalXMachine.g:1959:2: ()
            {
             before(grammarAccess.getXVariantAccess().getVariantAction_0()); 
            // InternalXMachine.g:1960:2: ()
            // InternalXMachine.g:1960:3: 
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
    // InternalXMachine.g:1968:1: rule__XVariant__Group__1 : rule__XVariant__Group__1__Impl ;
    public final void rule__XVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1972:1: ( rule__XVariant__Group__1__Impl )
            // InternalXMachine.g:1973:2: rule__XVariant__Group__1__Impl
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
    // InternalXMachine.g:1979:1: rule__XVariant__Group__1__Impl : ( ( rule__XVariant__ExpressionAssignment_1 ) ) ;
    public final void rule__XVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1983:1: ( ( ( rule__XVariant__ExpressionAssignment_1 ) ) )
            // InternalXMachine.g:1984:1: ( ( rule__XVariant__ExpressionAssignment_1 ) )
            {
            // InternalXMachine.g:1984:1: ( ( rule__XVariant__ExpressionAssignment_1 ) )
            // InternalXMachine.g:1985:2: ( rule__XVariant__ExpressionAssignment_1 )
            {
             before(grammarAccess.getXVariantAccess().getExpressionAssignment_1()); 
            // InternalXMachine.g:1986:2: ( rule__XVariant__ExpressionAssignment_1 )
            // InternalXMachine.g:1986:3: rule__XVariant__ExpressionAssignment_1
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
    // InternalXMachine.g:1995:1: rule__XGroup__Group__0 : rule__XGroup__Group__0__Impl rule__XGroup__Group__1 ;
    public final void rule__XGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1999:1: ( rule__XGroup__Group__0__Impl rule__XGroup__Group__1 )
            // InternalXMachine.g:2000:2: rule__XGroup__Group__0__Impl rule__XGroup__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalXMachine.g:2007:1: rule__XGroup__Group__0__Impl : ( () ) ;
    public final void rule__XGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2011:1: ( ( () ) )
            // InternalXMachine.g:2012:1: ( () )
            {
            // InternalXMachine.g:2012:1: ( () )
            // InternalXMachine.g:2013:2: ()
            {
             before(grammarAccess.getXGroupAccess().getEventCasesAction_0()); 
            // InternalXMachine.g:2014:2: ()
            // InternalXMachine.g:2014:3: 
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
    // InternalXMachine.g:2022:1: rule__XGroup__Group__1 : rule__XGroup__Group__1__Impl rule__XGroup__Group__2 ;
    public final void rule__XGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2026:1: ( rule__XGroup__Group__1__Impl rule__XGroup__Group__2 )
            // InternalXMachine.g:2027:2: rule__XGroup__Group__1__Impl rule__XGroup__Group__2
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
    // InternalXMachine.g:2034:1: rule__XGroup__Group__1__Impl : ( 'Group' ) ;
    public final void rule__XGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2038:1: ( ( 'Group' ) )
            // InternalXMachine.g:2039:1: ( 'Group' )
            {
            // InternalXMachine.g:2039:1: ( 'Group' )
            // InternalXMachine.g:2040:2: 'Group'
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
    // InternalXMachine.g:2049:1: rule__XGroup__Group__2 : rule__XGroup__Group__2__Impl rule__XGroup__Group__3 ;
    public final void rule__XGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2053:1: ( rule__XGroup__Group__2__Impl rule__XGroup__Group__3 )
            // InternalXMachine.g:2054:2: rule__XGroup__Group__2__Impl rule__XGroup__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalXMachine.g:2061:1: rule__XGroup__Group__2__Impl : ( ( rule__XGroup__NameAssignment_2 ) ) ;
    public final void rule__XGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2065:1: ( ( ( rule__XGroup__NameAssignment_2 ) ) )
            // InternalXMachine.g:2066:1: ( ( rule__XGroup__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2066:1: ( ( rule__XGroup__NameAssignment_2 ) )
            // InternalXMachine.g:2067:2: ( rule__XGroup__NameAssignment_2 )
            {
             before(grammarAccess.getXGroupAccess().getNameAssignment_2()); 
            // InternalXMachine.g:2068:2: ( rule__XGroup__NameAssignment_2 )
            // InternalXMachine.g:2068:3: rule__XGroup__NameAssignment_2
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
    // InternalXMachine.g:2076:1: rule__XGroup__Group__3 : rule__XGroup__Group__3__Impl rule__XGroup__Group__4 ;
    public final void rule__XGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2080:1: ( rule__XGroup__Group__3__Impl rule__XGroup__Group__4 )
            // InternalXMachine.g:2081:2: rule__XGroup__Group__3__Impl rule__XGroup__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalXMachine.g:2088:1: rule__XGroup__Group__3__Impl : ( ( rule__XGroup__Group_3__0 )? ) ;
    public final void rule__XGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2092:1: ( ( ( rule__XGroup__Group_3__0 )? ) )
            // InternalXMachine.g:2093:1: ( ( rule__XGroup__Group_3__0 )? )
            {
            // InternalXMachine.g:2093:1: ( ( rule__XGroup__Group_3__0 )? )
            // InternalXMachine.g:2094:2: ( rule__XGroup__Group_3__0 )?
            {
             before(grammarAccess.getXGroupAccess().getGroup_3()); 
            // InternalXMachine.g:2095:2: ( rule__XGroup__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXMachine.g:2095:3: rule__XGroup__Group_3__0
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
    // InternalXMachine.g:2103:1: rule__XGroup__Group__4 : rule__XGroup__Group__4__Impl rule__XGroup__Group__5 ;
    public final void rule__XGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2107:1: ( rule__XGroup__Group__4__Impl rule__XGroup__Group__5 )
            // InternalXMachine.g:2108:2: rule__XGroup__Group__4__Impl rule__XGroup__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalXMachine.g:2115:1: rule__XGroup__Group__4__Impl : ( 'begin' ) ;
    public final void rule__XGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2119:1: ( ( 'begin' ) )
            // InternalXMachine.g:2120:1: ( 'begin' )
            {
            // InternalXMachine.g:2120:1: ( 'begin' )
            // InternalXMachine.g:2121:2: 'begin'
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
    // InternalXMachine.g:2130:1: rule__XGroup__Group__5 : rule__XGroup__Group__5__Impl rule__XGroup__Group__6 ;
    public final void rule__XGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2134:1: ( rule__XGroup__Group__5__Impl rule__XGroup__Group__6 )
            // InternalXMachine.g:2135:2: rule__XGroup__Group__5__Impl rule__XGroup__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalXMachine.g:2142:1: rule__XGroup__Group__5__Impl : ( ( rule__XGroup__Group_5__0 )? ) ;
    public final void rule__XGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2146:1: ( ( ( rule__XGroup__Group_5__0 )? ) )
            // InternalXMachine.g:2147:1: ( ( rule__XGroup__Group_5__0 )? )
            {
            // InternalXMachine.g:2147:1: ( ( rule__XGroup__Group_5__0 )? )
            // InternalXMachine.g:2148:2: ( rule__XGroup__Group_5__0 )?
            {
             before(grammarAccess.getXGroupAccess().getGroup_5()); 
            // InternalXMachine.g:2149:2: ( rule__XGroup__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXMachine.g:2149:3: rule__XGroup__Group_5__0
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
    // InternalXMachine.g:2157:1: rule__XGroup__Group__6 : rule__XGroup__Group__6__Impl ;
    public final void rule__XGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2161:1: ( rule__XGroup__Group__6__Impl )
            // InternalXMachine.g:2162:2: rule__XGroup__Group__6__Impl
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
    // InternalXMachine.g:2168:1: rule__XGroup__Group__6__Impl : ( 'end' ) ;
    public final void rule__XGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2172:1: ( ( 'end' ) )
            // InternalXMachine.g:2173:1: ( 'end' )
            {
            // InternalXMachine.g:2173:1: ( 'end' )
            // InternalXMachine.g:2174:2: 'end'
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
    // InternalXMachine.g:2184:1: rule__XGroup__Group_3__0 : rule__XGroup__Group_3__0__Impl rule__XGroup__Group_3__1 ;
    public final void rule__XGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2188:1: ( rule__XGroup__Group_3__0__Impl rule__XGroup__Group_3__1 )
            // InternalXMachine.g:2189:2: rule__XGroup__Group_3__0__Impl rule__XGroup__Group_3__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:2196:1: rule__XGroup__Group_3__0__Impl : ( '(' ) ;
    public final void rule__XGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2200:1: ( ( '(' ) )
            // InternalXMachine.g:2201:1: ( '(' )
            {
            // InternalXMachine.g:2201:1: ( '(' )
            // InternalXMachine.g:2202:2: '('
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
    // InternalXMachine.g:2211:1: rule__XGroup__Group_3__1 : rule__XGroup__Group_3__1__Impl rule__XGroup__Group_3__2 ;
    public final void rule__XGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2215:1: ( rule__XGroup__Group_3__1__Impl rule__XGroup__Group_3__2 )
            // InternalXMachine.g:2216:2: rule__XGroup__Group_3__1__Impl rule__XGroup__Group_3__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:2223:1: rule__XGroup__Group_3__1__Impl : ( ( rule__XGroup__FormalParametersAssignment_3_1 ) ) ;
    public final void rule__XGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2227:1: ( ( ( rule__XGroup__FormalParametersAssignment_3_1 ) ) )
            // InternalXMachine.g:2228:1: ( ( rule__XGroup__FormalParametersAssignment_3_1 ) )
            {
            // InternalXMachine.g:2228:1: ( ( rule__XGroup__FormalParametersAssignment_3_1 ) )
            // InternalXMachine.g:2229:2: ( rule__XGroup__FormalParametersAssignment_3_1 )
            {
             before(grammarAccess.getXGroupAccess().getFormalParametersAssignment_3_1()); 
            // InternalXMachine.g:2230:2: ( rule__XGroup__FormalParametersAssignment_3_1 )
            // InternalXMachine.g:2230:3: rule__XGroup__FormalParametersAssignment_3_1
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
    // InternalXMachine.g:2238:1: rule__XGroup__Group_3__2 : rule__XGroup__Group_3__2__Impl rule__XGroup__Group_3__3 ;
    public final void rule__XGroup__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2242:1: ( rule__XGroup__Group_3__2__Impl rule__XGroup__Group_3__3 )
            // InternalXMachine.g:2243:2: rule__XGroup__Group_3__2__Impl rule__XGroup__Group_3__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:2250:1: rule__XGroup__Group_3__2__Impl : ( ( rule__XGroup__Group_3_2__0 )* ) ;
    public final void rule__XGroup__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2254:1: ( ( ( rule__XGroup__Group_3_2__0 )* ) )
            // InternalXMachine.g:2255:1: ( ( rule__XGroup__Group_3_2__0 )* )
            {
            // InternalXMachine.g:2255:1: ( ( rule__XGroup__Group_3_2__0 )* )
            // InternalXMachine.g:2256:2: ( rule__XGroup__Group_3_2__0 )*
            {
             before(grammarAccess.getXGroupAccess().getGroup_3_2()); 
            // InternalXMachine.g:2257:2: ( rule__XGroup__Group_3_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==33) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalXMachine.g:2257:3: rule__XGroup__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__XGroup__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalXMachine.g:2265:1: rule__XGroup__Group_3__3 : rule__XGroup__Group_3__3__Impl ;
    public final void rule__XGroup__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2269:1: ( rule__XGroup__Group_3__3__Impl )
            // InternalXMachine.g:2270:2: rule__XGroup__Group_3__3__Impl
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
    // InternalXMachine.g:2276:1: rule__XGroup__Group_3__3__Impl : ( ')' ) ;
    public final void rule__XGroup__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2280:1: ( ( ')' ) )
            // InternalXMachine.g:2281:1: ( ')' )
            {
            // InternalXMachine.g:2281:1: ( ')' )
            // InternalXMachine.g:2282:2: ')'
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
    // InternalXMachine.g:2292:1: rule__XGroup__Group_3_2__0 : rule__XGroup__Group_3_2__0__Impl rule__XGroup__Group_3_2__1 ;
    public final void rule__XGroup__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2296:1: ( rule__XGroup__Group_3_2__0__Impl rule__XGroup__Group_3_2__1 )
            // InternalXMachine.g:2297:2: rule__XGroup__Group_3_2__0__Impl rule__XGroup__Group_3_2__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:2304:1: rule__XGroup__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__XGroup__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2308:1: ( ( ',' ) )
            // InternalXMachine.g:2309:1: ( ',' )
            {
            // InternalXMachine.g:2309:1: ( ',' )
            // InternalXMachine.g:2310:2: ','
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
    // InternalXMachine.g:2319:1: rule__XGroup__Group_3_2__1 : rule__XGroup__Group_3_2__1__Impl ;
    public final void rule__XGroup__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2323:1: ( rule__XGroup__Group_3_2__1__Impl )
            // InternalXMachine.g:2324:2: rule__XGroup__Group_3_2__1__Impl
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
    // InternalXMachine.g:2330:1: rule__XGroup__Group_3_2__1__Impl : ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) ) ;
    public final void rule__XGroup__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2334:1: ( ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) ) )
            // InternalXMachine.g:2335:1: ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) )
            {
            // InternalXMachine.g:2335:1: ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) )
            // InternalXMachine.g:2336:2: ( rule__XGroup__FormalParametersAssignment_3_2_1 )
            {
             before(grammarAccess.getXGroupAccess().getFormalParametersAssignment_3_2_1()); 
            // InternalXMachine.g:2337:2: ( rule__XGroup__FormalParametersAssignment_3_2_1 )
            // InternalXMachine.g:2337:3: rule__XGroup__FormalParametersAssignment_3_2_1
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
    // InternalXMachine.g:2346:1: rule__XGroup__Group_5__0 : rule__XGroup__Group_5__0__Impl rule__XGroup__Group_5__1 ;
    public final void rule__XGroup__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2350:1: ( rule__XGroup__Group_5__0__Impl rule__XGroup__Group_5__1 )
            // InternalXMachine.g:2351:2: rule__XGroup__Group_5__0__Impl rule__XGroup__Group_5__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:2358:1: rule__XGroup__Group_5__0__Impl : ( ( rule__XGroup__EventsAssignment_5_0 ) ) ;
    public final void rule__XGroup__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2362:1: ( ( ( rule__XGroup__EventsAssignment_5_0 ) ) )
            // InternalXMachine.g:2363:1: ( ( rule__XGroup__EventsAssignment_5_0 ) )
            {
            // InternalXMachine.g:2363:1: ( ( rule__XGroup__EventsAssignment_5_0 ) )
            // InternalXMachine.g:2364:2: ( rule__XGroup__EventsAssignment_5_0 )
            {
             before(grammarAccess.getXGroupAccess().getEventsAssignment_5_0()); 
            // InternalXMachine.g:2365:2: ( rule__XGroup__EventsAssignment_5_0 )
            // InternalXMachine.g:2365:3: rule__XGroup__EventsAssignment_5_0
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
    // InternalXMachine.g:2373:1: rule__XGroup__Group_5__1 : rule__XGroup__Group_5__1__Impl ;
    public final void rule__XGroup__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2377:1: ( rule__XGroup__Group_5__1__Impl )
            // InternalXMachine.g:2378:2: rule__XGroup__Group_5__1__Impl
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
    // InternalXMachine.g:2384:1: rule__XGroup__Group_5__1__Impl : ( ( rule__XGroup__Group_5_1__0 )* ) ;
    public final void rule__XGroup__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2388:1: ( ( ( rule__XGroup__Group_5_1__0 )* ) )
            // InternalXMachine.g:2389:1: ( ( rule__XGroup__Group_5_1__0 )* )
            {
            // InternalXMachine.g:2389:1: ( ( rule__XGroup__Group_5_1__0 )* )
            // InternalXMachine.g:2390:2: ( rule__XGroup__Group_5_1__0 )*
            {
             before(grammarAccess.getXGroupAccess().getGroup_5_1()); 
            // InternalXMachine.g:2391:2: ( rule__XGroup__Group_5_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==33) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalXMachine.g:2391:3: rule__XGroup__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__XGroup__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalXMachine.g:2400:1: rule__XGroup__Group_5_1__0 : rule__XGroup__Group_5_1__0__Impl rule__XGroup__Group_5_1__1 ;
    public final void rule__XGroup__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2404:1: ( rule__XGroup__Group_5_1__0__Impl rule__XGroup__Group_5_1__1 )
            // InternalXMachine.g:2405:2: rule__XGroup__Group_5_1__0__Impl rule__XGroup__Group_5_1__1
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
    // InternalXMachine.g:2412:1: rule__XGroup__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__XGroup__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2416:1: ( ( ',' ) )
            // InternalXMachine.g:2417:1: ( ',' )
            {
            // InternalXMachine.g:2417:1: ( ',' )
            // InternalXMachine.g:2418:2: ','
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
    // InternalXMachine.g:2427:1: rule__XGroup__Group_5_1__1 : rule__XGroup__Group_5_1__1__Impl ;
    public final void rule__XGroup__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2431:1: ( rule__XGroup__Group_5_1__1__Impl )
            // InternalXMachine.g:2432:2: rule__XGroup__Group_5_1__1__Impl
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
    // InternalXMachine.g:2438:1: rule__XGroup__Group_5_1__1__Impl : ( ( rule__XGroup__EventsAssignment_5_1_1 ) ) ;
    public final void rule__XGroup__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2442:1: ( ( ( rule__XGroup__EventsAssignment_5_1_1 ) ) )
            // InternalXMachine.g:2443:1: ( ( rule__XGroup__EventsAssignment_5_1_1 ) )
            {
            // InternalXMachine.g:2443:1: ( ( rule__XGroup__EventsAssignment_5_1_1 ) )
            // InternalXMachine.g:2444:2: ( rule__XGroup__EventsAssignment_5_1_1 )
            {
             before(grammarAccess.getXGroupAccess().getEventsAssignment_5_1_1()); 
            // InternalXMachine.g:2445:2: ( rule__XGroup__EventsAssignment_5_1_1 )
            // InternalXMachine.g:2445:3: rule__XGroup__EventsAssignment_5_1_1
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
    // InternalXMachine.g:2454:1: rule__XFormalParameter__Group__0 : rule__XFormalParameter__Group__0__Impl rule__XFormalParameter__Group__1 ;
    public final void rule__XFormalParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2458:1: ( rule__XFormalParameter__Group__0__Impl rule__XFormalParameter__Group__1 )
            // InternalXMachine.g:2459:2: rule__XFormalParameter__Group__0__Impl rule__XFormalParameter__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:2466:1: rule__XFormalParameter__Group__0__Impl : ( () ) ;
    public final void rule__XFormalParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2470:1: ( ( () ) )
            // InternalXMachine.g:2471:1: ( () )
            {
            // InternalXMachine.g:2471:1: ( () )
            // InternalXMachine.g:2472:2: ()
            {
             before(grammarAccess.getXFormalParameterAccess().getFormalParameterAction_0()); 
            // InternalXMachine.g:2473:2: ()
            // InternalXMachine.g:2473:3: 
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
    // InternalXMachine.g:2481:1: rule__XFormalParameter__Group__1 : rule__XFormalParameter__Group__1__Impl rule__XFormalParameter__Group__2 ;
    public final void rule__XFormalParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2485:1: ( rule__XFormalParameter__Group__1__Impl rule__XFormalParameter__Group__2 )
            // InternalXMachine.g:2486:2: rule__XFormalParameter__Group__1__Impl rule__XFormalParameter__Group__2
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
    // InternalXMachine.g:2493:1: rule__XFormalParameter__Group__1__Impl : ( ( rule__XFormalParameter__DirectionAssignment_1 ) ) ;
    public final void rule__XFormalParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2497:1: ( ( ( rule__XFormalParameter__DirectionAssignment_1 ) ) )
            // InternalXMachine.g:2498:1: ( ( rule__XFormalParameter__DirectionAssignment_1 ) )
            {
            // InternalXMachine.g:2498:1: ( ( rule__XFormalParameter__DirectionAssignment_1 ) )
            // InternalXMachine.g:2499:2: ( rule__XFormalParameter__DirectionAssignment_1 )
            {
             before(grammarAccess.getXFormalParameterAccess().getDirectionAssignment_1()); 
            // InternalXMachine.g:2500:2: ( rule__XFormalParameter__DirectionAssignment_1 )
            // InternalXMachine.g:2500:3: rule__XFormalParameter__DirectionAssignment_1
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
    // InternalXMachine.g:2508:1: rule__XFormalParameter__Group__2 : rule__XFormalParameter__Group__2__Impl ;
    public final void rule__XFormalParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2512:1: ( rule__XFormalParameter__Group__2__Impl )
            // InternalXMachine.g:2513:2: rule__XFormalParameter__Group__2__Impl
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
    // InternalXMachine.g:2519:1: rule__XFormalParameter__Group__2__Impl : ( ( rule__XFormalParameter__NameAssignment_2 ) ) ;
    public final void rule__XFormalParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2523:1: ( ( ( rule__XFormalParameter__NameAssignment_2 ) ) )
            // InternalXMachine.g:2524:1: ( ( rule__XFormalParameter__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2524:1: ( ( rule__XFormalParameter__NameAssignment_2 ) )
            // InternalXMachine.g:2525:2: ( rule__XFormalParameter__NameAssignment_2 )
            {
             before(grammarAccess.getXFormalParameterAccess().getNameAssignment_2()); 
            // InternalXMachine.g:2526:2: ( rule__XFormalParameter__NameAssignment_2 )
            // InternalXMachine.g:2526:3: rule__XFormalParameter__NameAssignment_2
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


    // $ANTLR start "rule__XFormalArgument__Group__0"
    // InternalXMachine.g:2535:1: rule__XFormalArgument__Group__0 : rule__XFormalArgument__Group__0__Impl rule__XFormalArgument__Group__1 ;
    public final void rule__XFormalArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2539:1: ( rule__XFormalArgument__Group__0__Impl rule__XFormalArgument__Group__1 )
            // InternalXMachine.g:2540:2: rule__XFormalArgument__Group__0__Impl rule__XFormalArgument__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__XFormalArgument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XFormalArgument__Group__1();

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
    // $ANTLR end "rule__XFormalArgument__Group__0"


    // $ANTLR start "rule__XFormalArgument__Group__0__Impl"
    // InternalXMachine.g:2547:1: rule__XFormalArgument__Group__0__Impl : ( () ) ;
    public final void rule__XFormalArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2551:1: ( ( () ) )
            // InternalXMachine.g:2552:1: ( () )
            {
            // InternalXMachine.g:2552:1: ( () )
            // InternalXMachine.g:2553:2: ()
            {
             before(grammarAccess.getXFormalArgumentAccess().getFormalParameterAction_0()); 
            // InternalXMachine.g:2554:2: ()
            // InternalXMachine.g:2554:3: 
            {
            }

             after(grammarAccess.getXFormalArgumentAccess().getFormalParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFormalArgument__Group__0__Impl"


    // $ANTLR start "rule__XFormalArgument__Group__1"
    // InternalXMachine.g:2562:1: rule__XFormalArgument__Group__1 : rule__XFormalArgument__Group__1__Impl ;
    public final void rule__XFormalArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2566:1: ( rule__XFormalArgument__Group__1__Impl )
            // InternalXMachine.g:2567:2: rule__XFormalArgument__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XFormalArgument__Group__1__Impl();

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
    // $ANTLR end "rule__XFormalArgument__Group__1"


    // $ANTLR start "rule__XFormalArgument__Group__1__Impl"
    // InternalXMachine.g:2573:1: rule__XFormalArgument__Group__1__Impl : ( ( rule__XFormalArgument__NameAssignment_1 ) ) ;
    public final void rule__XFormalArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2577:1: ( ( ( rule__XFormalArgument__NameAssignment_1 ) ) )
            // InternalXMachine.g:2578:1: ( ( rule__XFormalArgument__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2578:1: ( ( rule__XFormalArgument__NameAssignment_1 ) )
            // InternalXMachine.g:2579:2: ( rule__XFormalArgument__NameAssignment_1 )
            {
             before(grammarAccess.getXFormalArgumentAccess().getNameAssignment_1()); 
            // InternalXMachine.g:2580:2: ( rule__XFormalArgument__NameAssignment_1 )
            // InternalXMachine.g:2580:3: rule__XFormalArgument__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XFormalArgument__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXFormalArgumentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFormalArgument__Group__1__Impl"


    // $ANTLR start "rule__XEvent__Group__0"
    // InternalXMachine.g:2589:1: rule__XEvent__Group__0 : rule__XEvent__Group__0__Impl rule__XEvent__Group__1 ;
    public final void rule__XEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2593:1: ( rule__XEvent__Group__0__Impl rule__XEvent__Group__1 )
            // InternalXMachine.g:2594:2: rule__XEvent__Group__0__Impl rule__XEvent__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXMachine.g:2601:1: rule__XEvent__Group__0__Impl : ( () ) ;
    public final void rule__XEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2605:1: ( ( () ) )
            // InternalXMachine.g:2606:1: ( () )
            {
            // InternalXMachine.g:2606:1: ( () )
            // InternalXMachine.g:2607:2: ()
            {
             before(grammarAccess.getXEventAccess().getEventAction_0()); 
            // InternalXMachine.g:2608:2: ()
            // InternalXMachine.g:2608:3: 
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
    // InternalXMachine.g:2616:1: rule__XEvent__Group__1 : rule__XEvent__Group__1__Impl rule__XEvent__Group__2 ;
    public final void rule__XEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2620:1: ( rule__XEvent__Group__1__Impl rule__XEvent__Group__2 )
            // InternalXMachine.g:2621:2: rule__XEvent__Group__1__Impl rule__XEvent__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalXMachine.g:2628:1: rule__XEvent__Group__1__Impl : ( ( rule__XEvent__NameAssignment_1 ) ) ;
    public final void rule__XEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2632:1: ( ( ( rule__XEvent__NameAssignment_1 ) ) )
            // InternalXMachine.g:2633:1: ( ( rule__XEvent__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2633:1: ( ( rule__XEvent__NameAssignment_1 ) )
            // InternalXMachine.g:2634:2: ( rule__XEvent__NameAssignment_1 )
            {
             before(grammarAccess.getXEventAccess().getNameAssignment_1()); 
            // InternalXMachine.g:2635:2: ( rule__XEvent__NameAssignment_1 )
            // InternalXMachine.g:2635:3: rule__XEvent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:2643:1: rule__XEvent__Group__2 : rule__XEvent__Group__2__Impl rule__XEvent__Group__3 ;
    public final void rule__XEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2647:1: ( rule__XEvent__Group__2__Impl rule__XEvent__Group__3 )
            // InternalXMachine.g:2648:2: rule__XEvent__Group__2__Impl rule__XEvent__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalXMachine.g:2655:1: rule__XEvent__Group__2__Impl : ( ( rule__XEvent__UnorderedGroup_2 ) ) ;
    public final void rule__XEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2659:1: ( ( ( rule__XEvent__UnorderedGroup_2 ) ) )
            // InternalXMachine.g:2660:1: ( ( rule__XEvent__UnorderedGroup_2 ) )
            {
            // InternalXMachine.g:2660:1: ( ( rule__XEvent__UnorderedGroup_2 ) )
            // InternalXMachine.g:2661:2: ( rule__XEvent__UnorderedGroup_2 )
            {
             before(grammarAccess.getXEventAccess().getUnorderedGroup_2()); 
            // InternalXMachine.g:2662:2: ( rule__XEvent__UnorderedGroup_2 )
            // InternalXMachine.g:2662:3: rule__XEvent__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getUnorderedGroup_2()); 

            }


            }

        }
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
    // InternalXMachine.g:2670:1: rule__XEvent__Group__3 : rule__XEvent__Group__3__Impl rule__XEvent__Group__4 ;
    public final void rule__XEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2674:1: ( rule__XEvent__Group__3__Impl rule__XEvent__Group__4 )
            // InternalXMachine.g:2675:2: rule__XEvent__Group__3__Impl rule__XEvent__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalXMachine.g:2682:1: rule__XEvent__Group__3__Impl : ( ( rule__XEvent__ExtensionsAssignment_3 )* ) ;
    public final void rule__XEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2686:1: ( ( ( rule__XEvent__ExtensionsAssignment_3 )* ) )
            // InternalXMachine.g:2687:1: ( ( rule__XEvent__ExtensionsAssignment_3 )* )
            {
            // InternalXMachine.g:2687:1: ( ( rule__XEvent__ExtensionsAssignment_3 )* )
            // InternalXMachine.g:2688:2: ( rule__XEvent__ExtensionsAssignment_3 )*
            {
             before(grammarAccess.getXEventAccess().getExtensionsAssignment_3()); 
            // InternalXMachine.g:2689:2: ( rule__XEvent__ExtensionsAssignment_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=39 && LA28_0<=40)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalXMachine.g:2689:3: rule__XEvent__ExtensionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__XEvent__ExtensionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getExtensionsAssignment_3()); 

            }


            }

        }
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
    // InternalXMachine.g:2697:1: rule__XEvent__Group__4 : rule__XEvent__Group__4__Impl rule__XEvent__Group__5 ;
    public final void rule__XEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2701:1: ( rule__XEvent__Group__4__Impl rule__XEvent__Group__5 )
            // InternalXMachine.g:2702:2: rule__XEvent__Group__4__Impl rule__XEvent__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalXMachine.g:2709:1: rule__XEvent__Group__4__Impl : ( ( rule__XEvent__Group_4__0 )? ) ;
    public final void rule__XEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2713:1: ( ( ( rule__XEvent__Group_4__0 )? ) )
            // InternalXMachine.g:2714:1: ( ( rule__XEvent__Group_4__0 )? )
            {
            // InternalXMachine.g:2714:1: ( ( rule__XEvent__Group_4__0 )? )
            // InternalXMachine.g:2715:2: ( rule__XEvent__Group_4__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_4()); 
            // InternalXMachine.g:2716:2: ( rule__XEvent__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXMachine.g:2716:3: rule__XEvent__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalXMachine.g:2724:1: rule__XEvent__Group__5 : rule__XEvent__Group__5__Impl rule__XEvent__Group__6 ;
    public final void rule__XEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2728:1: ( rule__XEvent__Group__5__Impl rule__XEvent__Group__6 )
            // InternalXMachine.g:2729:2: rule__XEvent__Group__5__Impl rule__XEvent__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalXMachine.g:2736:1: rule__XEvent__Group__5__Impl : ( ( rule__XEvent__Alternatives_5 )? ) ;
    public final void rule__XEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2740:1: ( ( ( rule__XEvent__Alternatives_5 )? ) )
            // InternalXMachine.g:2741:1: ( ( rule__XEvent__Alternatives_5 )? )
            {
            // InternalXMachine.g:2741:1: ( ( rule__XEvent__Alternatives_5 )? )
            // InternalXMachine.g:2742:2: ( rule__XEvent__Alternatives_5 )?
            {
             before(grammarAccess.getXEventAccess().getAlternatives_5()); 
            // InternalXMachine.g:2743:2: ( rule__XEvent__Alternatives_5 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30||(LA30_0>=34 && LA30_0<=35)||LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXMachine.g:2743:3: rule__XEvent__Alternatives_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Alternatives_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getAlternatives_5()); 

            }


            }

        }
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
    // InternalXMachine.g:2751:1: rule__XEvent__Group__6 : rule__XEvent__Group__6__Impl ;
    public final void rule__XEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2755:1: ( rule__XEvent__Group__6__Impl )
            // InternalXMachine.g:2756:2: rule__XEvent__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__6__Impl();

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
    // InternalXMachine.g:2762:1: rule__XEvent__Group__6__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2766:1: ( ( 'end' ) )
            // InternalXMachine.g:2767:1: ( 'end' )
            {
            // InternalXMachine.g:2767:1: ( 'end' )
            // InternalXMachine.g:2768:2: 'end'
            {
             before(grammarAccess.getXEventAccess().getEndKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getEndKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__XEvent__Group_4__0"
    // InternalXMachine.g:2778:1: rule__XEvent__Group_4__0 : rule__XEvent__Group_4__0__Impl rule__XEvent__Group_4__1 ;
    public final void rule__XEvent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2782:1: ( rule__XEvent__Group_4__0__Impl rule__XEvent__Group_4__1 )
            // InternalXMachine.g:2783:2: rule__XEvent__Group_4__0__Impl rule__XEvent__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__XEvent__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_4__1();

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
    // $ANTLR end "rule__XEvent__Group_4__0"


    // $ANTLR start "rule__XEvent__Group_4__0__Impl"
    // InternalXMachine.g:2790:1: rule__XEvent__Group_4__0__Impl : ( 'refines' ) ;
    public final void rule__XEvent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2794:1: ( ( 'refines' ) )
            // InternalXMachine.g:2795:1: ( 'refines' )
            {
            // InternalXMachine.g:2795:1: ( 'refines' )
            // InternalXMachine.g:2796:2: 'refines'
            {
             before(grammarAccess.getXEventAccess().getRefinesKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getRefinesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4__0__Impl"


    // $ANTLR start "rule__XEvent__Group_4__1"
    // InternalXMachine.g:2805:1: rule__XEvent__Group_4__1 : rule__XEvent__Group_4__1__Impl ;
    public final void rule__XEvent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2809:1: ( rule__XEvent__Group_4__1__Impl )
            // InternalXMachine.g:2810:2: rule__XEvent__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_4__1__Impl();

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
    // $ANTLR end "rule__XEvent__Group_4__1"


    // $ANTLR start "rule__XEvent__Group_4__1__Impl"
    // InternalXMachine.g:2816:1: rule__XEvent__Group_4__1__Impl : ( ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* ) ) ;
    public final void rule__XEvent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2820:1: ( ( ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* ) ) )
            // InternalXMachine.g:2821:1: ( ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* ) )
            {
            // InternalXMachine.g:2821:1: ( ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* ) )
            // InternalXMachine.g:2822:2: ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* )
            {
            // InternalXMachine.g:2822:2: ( ( rule__XEvent__RefinesAssignment_4_1 ) )
            // InternalXMachine.g:2823:3: ( rule__XEvent__RefinesAssignment_4_1 )
            {
             before(grammarAccess.getXEventAccess().getRefinesAssignment_4_1()); 
            // InternalXMachine.g:2824:3: ( rule__XEvent__RefinesAssignment_4_1 )
            // InternalXMachine.g:2824:4: rule__XEvent__RefinesAssignment_4_1
            {
            pushFollow(FOLLOW_8);
            rule__XEvent__RefinesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getRefinesAssignment_4_1()); 

            }

            // InternalXMachine.g:2827:2: ( ( rule__XEvent__RefinesAssignment_4_1 )* )
            // InternalXMachine.g:2828:3: ( rule__XEvent__RefinesAssignment_4_1 )*
            {
             before(grammarAccess.getXEventAccess().getRefinesAssignment_4_1()); 
            // InternalXMachine.g:2829:3: ( rule__XEvent__RefinesAssignment_4_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalXMachine.g:2829:4: rule__XEvent__RefinesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XEvent__RefinesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getRefinesAssignment_4_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_0__0"
    // InternalXMachine.g:2839:1: rule__XEvent__Group_5_0__0 : rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1 ;
    public final void rule__XEvent__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2843:1: ( rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1 )
            // InternalXMachine.g:2844:2: rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1
            {
            pushFollow(FOLLOW_26);
            rule__XEvent__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0__1();

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
    // $ANTLR end "rule__XEvent__Group_5_0__0"


    // $ANTLR start "rule__XEvent__Group_5_0__0__Impl"
    // InternalXMachine.g:2851:1: rule__XEvent__Group_5_0__0__Impl : ( ( rule__XEvent__Group_5_0_0__0 )? ) ;
    public final void rule__XEvent__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2855:1: ( ( ( rule__XEvent__Group_5_0_0__0 )? ) )
            // InternalXMachine.g:2856:1: ( ( rule__XEvent__Group_5_0_0__0 )? )
            {
            // InternalXMachine.g:2856:1: ( ( rule__XEvent__Group_5_0_0__0 )? )
            // InternalXMachine.g:2857:2: ( rule__XEvent__Group_5_0_0__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_0_0()); 
            // InternalXMachine.g:2858:2: ( rule__XEvent__Group_5_0_0__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXMachine.g:2858:3: rule__XEvent__Group_5_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_0__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_0__1"
    // InternalXMachine.g:2866:1: rule__XEvent__Group_5_0__1 : rule__XEvent__Group_5_0__1__Impl rule__XEvent__Group_5_0__2 ;
    public final void rule__XEvent__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2870:1: ( rule__XEvent__Group_5_0__1__Impl rule__XEvent__Group_5_0__2 )
            // InternalXMachine.g:2871:2: rule__XEvent__Group_5_0__1__Impl rule__XEvent__Group_5_0__2
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0__2();

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
    // $ANTLR end "rule__XEvent__Group_5_0__1"


    // $ANTLR start "rule__XEvent__Group_5_0__1__Impl"
    // InternalXMachine.g:2878:1: rule__XEvent__Group_5_0__1__Impl : ( 'begin' ) ;
    public final void rule__XEvent__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2882:1: ( ( 'begin' ) )
            // InternalXMachine.g:2883:1: ( 'begin' )
            {
            // InternalXMachine.g:2883:1: ( 'begin' )
            // InternalXMachine.g:2884:2: 'begin'
            {
             before(grammarAccess.getXEventAccess().getBeginKeyword_5_0_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getBeginKeyword_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_0__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_0__2"
    // InternalXMachine.g:2893:1: rule__XEvent__Group_5_0__2 : rule__XEvent__Group_5_0__2__Impl ;
    public final void rule__XEvent__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2897:1: ( rule__XEvent__Group_5_0__2__Impl )
            // InternalXMachine.g:2898:2: rule__XEvent__Group_5_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0__2__Impl();

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
    // $ANTLR end "rule__XEvent__Group_5_0__2"


    // $ANTLR start "rule__XEvent__Group_5_0__2__Impl"
    // InternalXMachine.g:2904:1: rule__XEvent__Group_5_0__2__Impl : ( ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* ) ) ;
    public final void rule__XEvent__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2908:1: ( ( ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* ) ) )
            // InternalXMachine.g:2909:1: ( ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* ) )
            {
            // InternalXMachine.g:2909:1: ( ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* ) )
            // InternalXMachine.g:2910:2: ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* )
            {
            // InternalXMachine.g:2910:2: ( ( rule__XEvent__ActionsAssignment_5_0_2 ) )
            // InternalXMachine.g:2911:3: ( rule__XEvent__ActionsAssignment_5_0_2 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_0_2()); 
            // InternalXMachine.g:2912:3: ( rule__XEvent__ActionsAssignment_5_0_2 )
            // InternalXMachine.g:2912:4: rule__XEvent__ActionsAssignment_5_0_2
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_5_0_2();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_0_2()); 

            }

            // InternalXMachine.g:2915:2: ( ( rule__XEvent__ActionsAssignment_5_0_2 )* )
            // InternalXMachine.g:2916:3: ( rule__XEvent__ActionsAssignment_5_0_2 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_0_2()); 
            // InternalXMachine.g:2917:3: ( rule__XEvent__ActionsAssignment_5_0_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_XLABEL) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalXMachine.g:2917:4: rule__XEvent__ActionsAssignment_5_0_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_5_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_0_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_0__2__Impl"


    // $ANTLR start "rule__XEvent__Group_5_0_0__0"
    // InternalXMachine.g:2927:1: rule__XEvent__Group_5_0_0__0 : rule__XEvent__Group_5_0_0__0__Impl rule__XEvent__Group_5_0_0__1 ;
    public final void rule__XEvent__Group_5_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2931:1: ( rule__XEvent__Group_5_0_0__0__Impl rule__XEvent__Group_5_0_0__1 )
            // InternalXMachine.g:2932:2: rule__XEvent__Group_5_0_0__0__Impl rule__XEvent__Group_5_0_0__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0_0__1();

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
    // $ANTLR end "rule__XEvent__Group_5_0_0__0"


    // $ANTLR start "rule__XEvent__Group_5_0_0__0__Impl"
    // InternalXMachine.g:2939:1: rule__XEvent__Group_5_0_0__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_5_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2943:1: ( ( 'with' ) )
            // InternalXMachine.g:2944:1: ( 'with' )
            {
            // InternalXMachine.g:2944:1: ( 'with' )
            // InternalXMachine.g:2945:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_5_0_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWithKeyword_5_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_0_0__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_0_0__1"
    // InternalXMachine.g:2954:1: rule__XEvent__Group_5_0_0__1 : rule__XEvent__Group_5_0_0__1__Impl ;
    public final void rule__XEvent__Group_5_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2958:1: ( rule__XEvent__Group_5_0_0__1__Impl )
            // InternalXMachine.g:2959:2: rule__XEvent__Group_5_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0_0__1__Impl();

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
    // $ANTLR end "rule__XEvent__Group_5_0_0__1"


    // $ANTLR start "rule__XEvent__Group_5_0_0__1__Impl"
    // InternalXMachine.g:2965:1: rule__XEvent__Group_5_0_0__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* ) ) ;
    public final void rule__XEvent__Group_5_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2969:1: ( ( ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* ) ) )
            // InternalXMachine.g:2970:1: ( ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* ) )
            {
            // InternalXMachine.g:2970:1: ( ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* ) )
            // InternalXMachine.g:2971:2: ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* )
            {
            // InternalXMachine.g:2971:2: ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) )
            // InternalXMachine.g:2972:3: ( rule__XEvent__WitnessesAssignment_5_0_0_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_0_0_1()); 
            // InternalXMachine.g:2973:3: ( rule__XEvent__WitnessesAssignment_5_0_0_1 )
            // InternalXMachine.g:2973:4: rule__XEvent__WitnessesAssignment_5_0_0_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_5_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_0_0_1()); 

            }

            // InternalXMachine.g:2976:2: ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* )
            // InternalXMachine.g:2977:3: ( rule__XEvent__WitnessesAssignment_5_0_0_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_0_0_1()); 
            // InternalXMachine.g:2978:3: ( rule__XEvent__WitnessesAssignment_5_0_0_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_XLABEL) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalXMachine.g:2978:4: rule__XEvent__WitnessesAssignment_5_0_0_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_5_0_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_0_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_0_0__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1__0"
    // InternalXMachine.g:2988:1: rule__XEvent__Group_5_1__0 : rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1 ;
    public final void rule__XEvent__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2992:1: ( rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1 )
            // InternalXMachine.g:2993:2: rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1__1();

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
    // $ANTLR end "rule__XEvent__Group_5_1__0"


    // $ANTLR start "rule__XEvent__Group_5_1__0__Impl"
    // InternalXMachine.g:3000:1: rule__XEvent__Group_5_1__0__Impl : ( 'when' ) ;
    public final void rule__XEvent__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3004:1: ( ( 'when' ) )
            // InternalXMachine.g:3005:1: ( 'when' )
            {
            // InternalXMachine.g:3005:1: ( 'when' )
            // InternalXMachine.g:3006:2: 'when'
            {
             before(grammarAccess.getXEventAccess().getWhenKeyword_5_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWhenKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1__1"
    // InternalXMachine.g:3015:1: rule__XEvent__Group_5_1__1 : rule__XEvent__Group_5_1__1__Impl rule__XEvent__Group_5_1__2 ;
    public final void rule__XEvent__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3019:1: ( rule__XEvent__Group_5_1__1__Impl rule__XEvent__Group_5_1__2 )
            // InternalXMachine.g:3020:2: rule__XEvent__Group_5_1__1__Impl rule__XEvent__Group_5_1__2
            {
            pushFollow(FOLLOW_27);
            rule__XEvent__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1__2();

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
    // $ANTLR end "rule__XEvent__Group_5_1__1"


    // $ANTLR start "rule__XEvent__Group_5_1__1__Impl"
    // InternalXMachine.g:3027:1: rule__XEvent__Group_5_1__1__Impl : ( ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* ) ) ;
    public final void rule__XEvent__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3031:1: ( ( ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* ) ) )
            // InternalXMachine.g:3032:1: ( ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* ) )
            {
            // InternalXMachine.g:3032:1: ( ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* ) )
            // InternalXMachine.g:3033:2: ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* )
            {
            // InternalXMachine.g:3033:2: ( ( rule__XEvent__GuardsAssignment_5_1_1 ) )
            // InternalXMachine.g:3034:3: ( rule__XEvent__GuardsAssignment_5_1_1 )
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_5_1_1()); 
            // InternalXMachine.g:3035:3: ( rule__XEvent__GuardsAssignment_5_1_1 )
            // InternalXMachine.g:3035:4: rule__XEvent__GuardsAssignment_5_1_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__GuardsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getGuardsAssignment_5_1_1()); 

            }

            // InternalXMachine.g:3038:2: ( ( rule__XEvent__GuardsAssignment_5_1_1 )* )
            // InternalXMachine.g:3039:3: ( rule__XEvent__GuardsAssignment_5_1_1 )*
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_5_1_1()); 
            // InternalXMachine.g:3040:3: ( rule__XEvent__GuardsAssignment_5_1_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_XLABEL) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalXMachine.g:3040:4: rule__XEvent__GuardsAssignment_5_1_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__GuardsAssignment_5_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getGuardsAssignment_5_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1__2"
    // InternalXMachine.g:3049:1: rule__XEvent__Group_5_1__2 : rule__XEvent__Group_5_1__2__Impl rule__XEvent__Group_5_1__3 ;
    public final void rule__XEvent__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3053:1: ( rule__XEvent__Group_5_1__2__Impl rule__XEvent__Group_5_1__3 )
            // InternalXMachine.g:3054:2: rule__XEvent__Group_5_1__2__Impl rule__XEvent__Group_5_1__3
            {
            pushFollow(FOLLOW_27);
            rule__XEvent__Group_5_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1__3();

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
    // $ANTLR end "rule__XEvent__Group_5_1__2"


    // $ANTLR start "rule__XEvent__Group_5_1__2__Impl"
    // InternalXMachine.g:3061:1: rule__XEvent__Group_5_1__2__Impl : ( ( rule__XEvent__Group_5_1_2__0 )? ) ;
    public final void rule__XEvent__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3065:1: ( ( ( rule__XEvent__Group_5_1_2__0 )? ) )
            // InternalXMachine.g:3066:1: ( ( rule__XEvent__Group_5_1_2__0 )? )
            {
            // InternalXMachine.g:3066:1: ( ( rule__XEvent__Group_5_1_2__0 )? )
            // InternalXMachine.g:3067:2: ( rule__XEvent__Group_5_1_2__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_1_2()); 
            // InternalXMachine.g:3068:2: ( rule__XEvent__Group_5_1_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==34) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXMachine.g:3068:3: rule__XEvent__Group_5_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1__2__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1__3"
    // InternalXMachine.g:3076:1: rule__XEvent__Group_5_1__3 : rule__XEvent__Group_5_1__3__Impl ;
    public final void rule__XEvent__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3080:1: ( rule__XEvent__Group_5_1__3__Impl )
            // InternalXMachine.g:3081:2: rule__XEvent__Group_5_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1__3__Impl();

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
    // $ANTLR end "rule__XEvent__Group_5_1__3"


    // $ANTLR start "rule__XEvent__Group_5_1__3__Impl"
    // InternalXMachine.g:3087:1: rule__XEvent__Group_5_1__3__Impl : ( ( rule__XEvent__Group_5_1_3__0 )? ) ;
    public final void rule__XEvent__Group_5_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3091:1: ( ( ( rule__XEvent__Group_5_1_3__0 )? ) )
            // InternalXMachine.g:3092:1: ( ( rule__XEvent__Group_5_1_3__0 )? )
            {
            // InternalXMachine.g:3092:1: ( ( rule__XEvent__Group_5_1_3__0 )? )
            // InternalXMachine.g:3093:2: ( rule__XEvent__Group_5_1_3__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_1_3()); 
            // InternalXMachine.g:3094:2: ( rule__XEvent__Group_5_1_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXMachine.g:3094:3: rule__XEvent__Group_5_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1__3__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1_2__0"
    // InternalXMachine.g:3103:1: rule__XEvent__Group_5_1_2__0 : rule__XEvent__Group_5_1_2__0__Impl rule__XEvent__Group_5_1_2__1 ;
    public final void rule__XEvent__Group_5_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3107:1: ( rule__XEvent__Group_5_1_2__0__Impl rule__XEvent__Group_5_1_2__1 )
            // InternalXMachine.g:3108:2: rule__XEvent__Group_5_1_2__0__Impl rule__XEvent__Group_5_1_2__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1_2__1();

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
    // $ANTLR end "rule__XEvent__Group_5_1_2__0"


    // $ANTLR start "rule__XEvent__Group_5_1_2__0__Impl"
    // InternalXMachine.g:3115:1: rule__XEvent__Group_5_1_2__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_5_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3119:1: ( ( 'with' ) )
            // InternalXMachine.g:3120:1: ( 'with' )
            {
            // InternalXMachine.g:3120:1: ( 'with' )
            // InternalXMachine.g:3121:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_5_1_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWithKeyword_5_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1_2__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1_2__1"
    // InternalXMachine.g:3130:1: rule__XEvent__Group_5_1_2__1 : rule__XEvent__Group_5_1_2__1__Impl ;
    public final void rule__XEvent__Group_5_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3134:1: ( rule__XEvent__Group_5_1_2__1__Impl )
            // InternalXMachine.g:3135:2: rule__XEvent__Group_5_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1_2__1__Impl();

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
    // $ANTLR end "rule__XEvent__Group_5_1_2__1"


    // $ANTLR start "rule__XEvent__Group_5_1_2__1__Impl"
    // InternalXMachine.g:3141:1: rule__XEvent__Group_5_1_2__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* ) ) ;
    public final void rule__XEvent__Group_5_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3145:1: ( ( ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* ) ) )
            // InternalXMachine.g:3146:1: ( ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* ) )
            {
            // InternalXMachine.g:3146:1: ( ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* ) )
            // InternalXMachine.g:3147:2: ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* )
            {
            // InternalXMachine.g:3147:2: ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) )
            // InternalXMachine.g:3148:3: ( rule__XEvent__WitnessesAssignment_5_1_2_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_1_2_1()); 
            // InternalXMachine.g:3149:3: ( rule__XEvent__WitnessesAssignment_5_1_2_1 )
            // InternalXMachine.g:3149:4: rule__XEvent__WitnessesAssignment_5_1_2_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_5_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_1_2_1()); 

            }

            // InternalXMachine.g:3152:2: ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* )
            // InternalXMachine.g:3153:3: ( rule__XEvent__WitnessesAssignment_5_1_2_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_1_2_1()); 
            // InternalXMachine.g:3154:3: ( rule__XEvent__WitnessesAssignment_5_1_2_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_XLABEL) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalXMachine.g:3154:4: rule__XEvent__WitnessesAssignment_5_1_2_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_5_1_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_1_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1_2__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1_3__0"
    // InternalXMachine.g:3164:1: rule__XEvent__Group_5_1_3__0 : rule__XEvent__Group_5_1_3__0__Impl rule__XEvent__Group_5_1_3__1 ;
    public final void rule__XEvent__Group_5_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3168:1: ( rule__XEvent__Group_5_1_3__0__Impl rule__XEvent__Group_5_1_3__1 )
            // InternalXMachine.g:3169:2: rule__XEvent__Group_5_1_3__0__Impl rule__XEvent__Group_5_1_3__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1_3__1();

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
    // $ANTLR end "rule__XEvent__Group_5_1_3__0"


    // $ANTLR start "rule__XEvent__Group_5_1_3__0__Impl"
    // InternalXMachine.g:3176:1: rule__XEvent__Group_5_1_3__0__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_5_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3180:1: ( ( 'then' ) )
            // InternalXMachine.g:3181:1: ( 'then' )
            {
            // InternalXMachine.g:3181:1: ( 'then' )
            // InternalXMachine.g:3182:2: 'then'
            {
             before(grammarAccess.getXEventAccess().getThenKeyword_5_1_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getThenKeyword_5_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1_3__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1_3__1"
    // InternalXMachine.g:3191:1: rule__XEvent__Group_5_1_3__1 : rule__XEvent__Group_5_1_3__1__Impl ;
    public final void rule__XEvent__Group_5_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3195:1: ( rule__XEvent__Group_5_1_3__1__Impl )
            // InternalXMachine.g:3196:2: rule__XEvent__Group_5_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1_3__1__Impl();

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
    // $ANTLR end "rule__XEvent__Group_5_1_3__1"


    // $ANTLR start "rule__XEvent__Group_5_1_3__1__Impl"
    // InternalXMachine.g:3202:1: rule__XEvent__Group_5_1_3__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* ) ) ;
    public final void rule__XEvent__Group_5_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3206:1: ( ( ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* ) ) )
            // InternalXMachine.g:3207:1: ( ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* ) )
            {
            // InternalXMachine.g:3207:1: ( ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* ) )
            // InternalXMachine.g:3208:2: ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* )
            {
            // InternalXMachine.g:3208:2: ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) )
            // InternalXMachine.g:3209:3: ( rule__XEvent__ActionsAssignment_5_1_3_1 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_1_3_1()); 
            // InternalXMachine.g:3210:3: ( rule__XEvent__ActionsAssignment_5_1_3_1 )
            // InternalXMachine.g:3210:4: rule__XEvent__ActionsAssignment_5_1_3_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_5_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_1_3_1()); 

            }

            // InternalXMachine.g:3213:2: ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* )
            // InternalXMachine.g:3214:3: ( rule__XEvent__ActionsAssignment_5_1_3_1 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_1_3_1()); 
            // InternalXMachine.g:3215:3: ( rule__XEvent__ActionsAssignment_5_1_3_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_XLABEL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalXMachine.g:3215:4: rule__XEvent__ActionsAssignment_5_1_3_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_5_1_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_1_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1_3__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__0"
    // InternalXMachine.g:3225:1: rule__XEvent__Group_5_2__0 : rule__XEvent__Group_5_2__0__Impl rule__XEvent__Group_5_2__1 ;
    public final void rule__XEvent__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3229:1: ( rule__XEvent__Group_5_2__0__Impl rule__XEvent__Group_5_2__1 )
            // InternalXMachine.g:3230:2: rule__XEvent__Group_5_2__0__Impl rule__XEvent__Group_5_2__1
            {
            pushFollow(FOLLOW_4);
            rule__XEvent__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__1();

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
    // $ANTLR end "rule__XEvent__Group_5_2__0"


    // $ANTLR start "rule__XEvent__Group_5_2__0__Impl"
    // InternalXMachine.g:3237:1: rule__XEvent__Group_5_2__0__Impl : ( 'any' ) ;
    public final void rule__XEvent__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3241:1: ( ( 'any' ) )
            // InternalXMachine.g:3242:1: ( 'any' )
            {
            // InternalXMachine.g:3242:1: ( 'any' )
            // InternalXMachine.g:3243:2: 'any'
            {
             before(grammarAccess.getXEventAccess().getAnyKeyword_5_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getAnyKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__1"
    // InternalXMachine.g:3252:1: rule__XEvent__Group_5_2__1 : rule__XEvent__Group_5_2__1__Impl rule__XEvent__Group_5_2__2 ;
    public final void rule__XEvent__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3256:1: ( rule__XEvent__Group_5_2__1__Impl rule__XEvent__Group_5_2__2 )
            // InternalXMachine.g:3257:2: rule__XEvent__Group_5_2__1__Impl rule__XEvent__Group_5_2__2
            {
            pushFollow(FOLLOW_28);
            rule__XEvent__Group_5_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__2();

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
    // $ANTLR end "rule__XEvent__Group_5_2__1"


    // $ANTLR start "rule__XEvent__Group_5_2__1__Impl"
    // InternalXMachine.g:3264:1: rule__XEvent__Group_5_2__1__Impl : ( ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* ) ) ;
    public final void rule__XEvent__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3268:1: ( ( ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* ) ) )
            // InternalXMachine.g:3269:1: ( ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* ) )
            {
            // InternalXMachine.g:3269:1: ( ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* ) )
            // InternalXMachine.g:3270:2: ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* )
            {
            // InternalXMachine.g:3270:2: ( ( rule__XEvent__ParametersAssignment_5_2_1 ) )
            // InternalXMachine.g:3271:3: ( rule__XEvent__ParametersAssignment_5_2_1 )
            {
             before(grammarAccess.getXEventAccess().getParametersAssignment_5_2_1()); 
            // InternalXMachine.g:3272:3: ( rule__XEvent__ParametersAssignment_5_2_1 )
            // InternalXMachine.g:3272:4: rule__XEvent__ParametersAssignment_5_2_1
            {
            pushFollow(FOLLOW_8);
            rule__XEvent__ParametersAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getParametersAssignment_5_2_1()); 

            }

            // InternalXMachine.g:3275:2: ( ( rule__XEvent__ParametersAssignment_5_2_1 )* )
            // InternalXMachine.g:3276:3: ( rule__XEvent__ParametersAssignment_5_2_1 )*
            {
             before(grammarAccess.getXEventAccess().getParametersAssignment_5_2_1()); 
            // InternalXMachine.g:3277:3: ( rule__XEvent__ParametersAssignment_5_2_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalXMachine.g:3277:4: rule__XEvent__ParametersAssignment_5_2_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XEvent__ParametersAssignment_5_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getParametersAssignment_5_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__2"
    // InternalXMachine.g:3286:1: rule__XEvent__Group_5_2__2 : rule__XEvent__Group_5_2__2__Impl rule__XEvent__Group_5_2__3 ;
    public final void rule__XEvent__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3290:1: ( rule__XEvent__Group_5_2__2__Impl rule__XEvent__Group_5_2__3 )
            // InternalXMachine.g:3291:2: rule__XEvent__Group_5_2__2__Impl rule__XEvent__Group_5_2__3
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__3();

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
    // $ANTLR end "rule__XEvent__Group_5_2__2"


    // $ANTLR start "rule__XEvent__Group_5_2__2__Impl"
    // InternalXMachine.g:3298:1: rule__XEvent__Group_5_2__2__Impl : ( 'where' ) ;
    public final void rule__XEvent__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3302:1: ( ( 'where' ) )
            // InternalXMachine.g:3303:1: ( 'where' )
            {
            // InternalXMachine.g:3303:1: ( 'where' )
            // InternalXMachine.g:3304:2: 'where'
            {
             before(grammarAccess.getXEventAccess().getWhereKeyword_5_2_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWhereKeyword_5_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__2__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__3"
    // InternalXMachine.g:3313:1: rule__XEvent__Group_5_2__3 : rule__XEvent__Group_5_2__3__Impl rule__XEvent__Group_5_2__4 ;
    public final void rule__XEvent__Group_5_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3317:1: ( rule__XEvent__Group_5_2__3__Impl rule__XEvent__Group_5_2__4 )
            // InternalXMachine.g:3318:2: rule__XEvent__Group_5_2__3__Impl rule__XEvent__Group_5_2__4
            {
            pushFollow(FOLLOW_27);
            rule__XEvent__Group_5_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__4();

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
    // $ANTLR end "rule__XEvent__Group_5_2__3"


    // $ANTLR start "rule__XEvent__Group_5_2__3__Impl"
    // InternalXMachine.g:3325:1: rule__XEvent__Group_5_2__3__Impl : ( ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* ) ) ;
    public final void rule__XEvent__Group_5_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3329:1: ( ( ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* ) ) )
            // InternalXMachine.g:3330:1: ( ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* ) )
            {
            // InternalXMachine.g:3330:1: ( ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* ) )
            // InternalXMachine.g:3331:2: ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* )
            {
            // InternalXMachine.g:3331:2: ( ( rule__XEvent__GuardsAssignment_5_2_3 ) )
            // InternalXMachine.g:3332:3: ( rule__XEvent__GuardsAssignment_5_2_3 )
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_5_2_3()); 
            // InternalXMachine.g:3333:3: ( rule__XEvent__GuardsAssignment_5_2_3 )
            // InternalXMachine.g:3333:4: rule__XEvent__GuardsAssignment_5_2_3
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__GuardsAssignment_5_2_3();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getGuardsAssignment_5_2_3()); 

            }

            // InternalXMachine.g:3336:2: ( ( rule__XEvent__GuardsAssignment_5_2_3 )* )
            // InternalXMachine.g:3337:3: ( rule__XEvent__GuardsAssignment_5_2_3 )*
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_5_2_3()); 
            // InternalXMachine.g:3338:3: ( rule__XEvent__GuardsAssignment_5_2_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_XLABEL) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalXMachine.g:3338:4: rule__XEvent__GuardsAssignment_5_2_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__GuardsAssignment_5_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getGuardsAssignment_5_2_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__3__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__4"
    // InternalXMachine.g:3347:1: rule__XEvent__Group_5_2__4 : rule__XEvent__Group_5_2__4__Impl rule__XEvent__Group_5_2__5 ;
    public final void rule__XEvent__Group_5_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3351:1: ( rule__XEvent__Group_5_2__4__Impl rule__XEvent__Group_5_2__5 )
            // InternalXMachine.g:3352:2: rule__XEvent__Group_5_2__4__Impl rule__XEvent__Group_5_2__5
            {
            pushFollow(FOLLOW_27);
            rule__XEvent__Group_5_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__5();

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
    // $ANTLR end "rule__XEvent__Group_5_2__4"


    // $ANTLR start "rule__XEvent__Group_5_2__4__Impl"
    // InternalXMachine.g:3359:1: rule__XEvent__Group_5_2__4__Impl : ( ( rule__XEvent__Group_5_2_4__0 )? ) ;
    public final void rule__XEvent__Group_5_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3363:1: ( ( ( rule__XEvent__Group_5_2_4__0 )? ) )
            // InternalXMachine.g:3364:1: ( ( rule__XEvent__Group_5_2_4__0 )? )
            {
            // InternalXMachine.g:3364:1: ( ( rule__XEvent__Group_5_2_4__0 )? )
            // InternalXMachine.g:3365:2: ( rule__XEvent__Group_5_2_4__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_2_4()); 
            // InternalXMachine.g:3366:2: ( rule__XEvent__Group_5_2_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==34) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXMachine.g:3366:3: rule__XEvent__Group_5_2_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_2_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__4__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__5"
    // InternalXMachine.g:3374:1: rule__XEvent__Group_5_2__5 : rule__XEvent__Group_5_2__5__Impl ;
    public final void rule__XEvent__Group_5_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3378:1: ( rule__XEvent__Group_5_2__5__Impl )
            // InternalXMachine.g:3379:2: rule__XEvent__Group_5_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__5__Impl();

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
    // $ANTLR end "rule__XEvent__Group_5_2__5"


    // $ANTLR start "rule__XEvent__Group_5_2__5__Impl"
    // InternalXMachine.g:3385:1: rule__XEvent__Group_5_2__5__Impl : ( ( rule__XEvent__Group_5_2_5__0 )? ) ;
    public final void rule__XEvent__Group_5_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3389:1: ( ( ( rule__XEvent__Group_5_2_5__0 )? ) )
            // InternalXMachine.g:3390:1: ( ( rule__XEvent__Group_5_2_5__0 )? )
            {
            // InternalXMachine.g:3390:1: ( ( rule__XEvent__Group_5_2_5__0 )? )
            // InternalXMachine.g:3391:2: ( rule__XEvent__Group_5_2_5__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_2_5()); 
            // InternalXMachine.g:3392:2: ( rule__XEvent__Group_5_2_5__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==36) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalXMachine.g:3392:3: rule__XEvent__Group_5_2_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_2_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__5__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2_4__0"
    // InternalXMachine.g:3401:1: rule__XEvent__Group_5_2_4__0 : rule__XEvent__Group_5_2_4__0__Impl rule__XEvent__Group_5_2_4__1 ;
    public final void rule__XEvent__Group_5_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3405:1: ( rule__XEvent__Group_5_2_4__0__Impl rule__XEvent__Group_5_2_4__1 )
            // InternalXMachine.g:3406:2: rule__XEvent__Group_5_2_4__0__Impl rule__XEvent__Group_5_2_4__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2_4__1();

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
    // $ANTLR end "rule__XEvent__Group_5_2_4__0"


    // $ANTLR start "rule__XEvent__Group_5_2_4__0__Impl"
    // InternalXMachine.g:3413:1: rule__XEvent__Group_5_2_4__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_5_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3417:1: ( ( 'with' ) )
            // InternalXMachine.g:3418:1: ( 'with' )
            {
            // InternalXMachine.g:3418:1: ( 'with' )
            // InternalXMachine.g:3419:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_5_2_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWithKeyword_5_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2_4__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2_4__1"
    // InternalXMachine.g:3428:1: rule__XEvent__Group_5_2_4__1 : rule__XEvent__Group_5_2_4__1__Impl ;
    public final void rule__XEvent__Group_5_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3432:1: ( rule__XEvent__Group_5_2_4__1__Impl )
            // InternalXMachine.g:3433:2: rule__XEvent__Group_5_2_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2_4__1__Impl();

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
    // $ANTLR end "rule__XEvent__Group_5_2_4__1"


    // $ANTLR start "rule__XEvent__Group_5_2_4__1__Impl"
    // InternalXMachine.g:3439:1: rule__XEvent__Group_5_2_4__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* ) ) ;
    public final void rule__XEvent__Group_5_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3443:1: ( ( ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* ) ) )
            // InternalXMachine.g:3444:1: ( ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* ) )
            {
            // InternalXMachine.g:3444:1: ( ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* ) )
            // InternalXMachine.g:3445:2: ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* )
            {
            // InternalXMachine.g:3445:2: ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) )
            // InternalXMachine.g:3446:3: ( rule__XEvent__WitnessesAssignment_5_2_4_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_2_4_1()); 
            // InternalXMachine.g:3447:3: ( rule__XEvent__WitnessesAssignment_5_2_4_1 )
            // InternalXMachine.g:3447:4: rule__XEvent__WitnessesAssignment_5_2_4_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_5_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_2_4_1()); 

            }

            // InternalXMachine.g:3450:2: ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* )
            // InternalXMachine.g:3451:3: ( rule__XEvent__WitnessesAssignment_5_2_4_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_2_4_1()); 
            // InternalXMachine.g:3452:3: ( rule__XEvent__WitnessesAssignment_5_2_4_1 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_XLABEL) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalXMachine.g:3452:4: rule__XEvent__WitnessesAssignment_5_2_4_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_5_2_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_2_4_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2_4__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2_5__0"
    // InternalXMachine.g:3462:1: rule__XEvent__Group_5_2_5__0 : rule__XEvent__Group_5_2_5__0__Impl rule__XEvent__Group_5_2_5__1 ;
    public final void rule__XEvent__Group_5_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3466:1: ( rule__XEvent__Group_5_2_5__0__Impl rule__XEvent__Group_5_2_5__1 )
            // InternalXMachine.g:3467:2: rule__XEvent__Group_5_2_5__0__Impl rule__XEvent__Group_5_2_5__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_2_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2_5__1();

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
    // $ANTLR end "rule__XEvent__Group_5_2_5__0"


    // $ANTLR start "rule__XEvent__Group_5_2_5__0__Impl"
    // InternalXMachine.g:3474:1: rule__XEvent__Group_5_2_5__0__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_5_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3478:1: ( ( 'then' ) )
            // InternalXMachine.g:3479:1: ( 'then' )
            {
            // InternalXMachine.g:3479:1: ( 'then' )
            // InternalXMachine.g:3480:2: 'then'
            {
             before(grammarAccess.getXEventAccess().getThenKeyword_5_2_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getThenKeyword_5_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2_5__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2_5__1"
    // InternalXMachine.g:3489:1: rule__XEvent__Group_5_2_5__1 : rule__XEvent__Group_5_2_5__1__Impl ;
    public final void rule__XEvent__Group_5_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3493:1: ( rule__XEvent__Group_5_2_5__1__Impl )
            // InternalXMachine.g:3494:2: rule__XEvent__Group_5_2_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2_5__1__Impl();

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
    // $ANTLR end "rule__XEvent__Group_5_2_5__1"


    // $ANTLR start "rule__XEvent__Group_5_2_5__1__Impl"
    // InternalXMachine.g:3500:1: rule__XEvent__Group_5_2_5__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* ) ) ;
    public final void rule__XEvent__Group_5_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3504:1: ( ( ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* ) ) )
            // InternalXMachine.g:3505:1: ( ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* ) )
            {
            // InternalXMachine.g:3505:1: ( ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* ) )
            // InternalXMachine.g:3506:2: ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* )
            {
            // InternalXMachine.g:3506:2: ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) )
            // InternalXMachine.g:3507:3: ( rule__XEvent__ActionsAssignment_5_2_5_1 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_2_5_1()); 
            // InternalXMachine.g:3508:3: ( rule__XEvent__ActionsAssignment_5_2_5_1 )
            // InternalXMachine.g:3508:4: rule__XEvent__ActionsAssignment_5_2_5_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_5_2_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_2_5_1()); 

            }

            // InternalXMachine.g:3511:2: ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* )
            // InternalXMachine.g:3512:3: ( rule__XEvent__ActionsAssignment_5_2_5_1 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_2_5_1()); 
            // InternalXMachine.g:3513:3: ( rule__XEvent__ActionsAssignment_5_2_5_1 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_XLABEL) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalXMachine.g:3513:4: rule__XEvent__ActionsAssignment_5_2_5_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_5_2_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_2_5_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2_5__1__Impl"


    // $ANTLR start "rule__EventSync__Group__0"
    // InternalXMachine.g:3523:1: rule__EventSync__Group__0 : rule__EventSync__Group__0__Impl rule__EventSync__Group__1 ;
    public final void rule__EventSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3527:1: ( rule__EventSync__Group__0__Impl rule__EventSync__Group__1 )
            // InternalXMachine.g:3528:2: rule__EventSync__Group__0__Impl rule__EventSync__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalXMachine.g:3535:1: rule__EventSync__Group__0__Impl : ( () ) ;
    public final void rule__EventSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3539:1: ( ( () ) )
            // InternalXMachine.g:3540:1: ( () )
            {
            // InternalXMachine.g:3540:1: ( () )
            // InternalXMachine.g:3541:2: ()
            {
             before(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 
            // InternalXMachine.g:3542:2: ()
            // InternalXMachine.g:3542:3: 
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
    // InternalXMachine.g:3550:1: rule__EventSync__Group__1 : rule__EventSync__Group__1__Impl ;
    public final void rule__EventSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3554:1: ( rule__EventSync__Group__1__Impl )
            // InternalXMachine.g:3555:2: rule__EventSync__Group__1__Impl
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
    // InternalXMachine.g:3561:1: rule__EventSync__Group__1__Impl : ( ( rule__EventSync__Group_1__0 ) ) ;
    public final void rule__EventSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3565:1: ( ( ( rule__EventSync__Group_1__0 ) ) )
            // InternalXMachine.g:3566:1: ( ( rule__EventSync__Group_1__0 ) )
            {
            // InternalXMachine.g:3566:1: ( ( rule__EventSync__Group_1__0 ) )
            // InternalXMachine.g:3567:2: ( rule__EventSync__Group_1__0 )
            {
             before(grammarAccess.getEventSyncAccess().getGroup_1()); 
            // InternalXMachine.g:3568:2: ( rule__EventSync__Group_1__0 )
            // InternalXMachine.g:3568:3: rule__EventSync__Group_1__0
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
    // InternalXMachine.g:3577:1: rule__EventSync__Group_1__0 : rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 ;
    public final void rule__EventSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3581:1: ( rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 )
            // InternalXMachine.g:3582:2: rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1
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
    // InternalXMachine.g:3589:1: rule__EventSync__Group_1__0__Impl : ( 'synchronises' ) ;
    public final void rule__EventSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3593:1: ( ( 'synchronises' ) )
            // InternalXMachine.g:3594:1: ( 'synchronises' )
            {
            // InternalXMachine.g:3594:1: ( 'synchronises' )
            // InternalXMachine.g:3595:2: 'synchronises'
            {
             before(grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalXMachine.g:3604:1: rule__EventSync__Group_1__1 : rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 ;
    public final void rule__EventSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3608:1: ( rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 )
            // InternalXMachine.g:3609:2: rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2
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
    // InternalXMachine.g:3616:1: rule__EventSync__Group_1__1__Impl : ( ( rule__EventSync__Group_1_1__0 )? ) ;
    public final void rule__EventSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3620:1: ( ( ( rule__EventSync__Group_1_1__0 )? ) )
            // InternalXMachine.g:3621:1: ( ( rule__EventSync__Group_1_1__0 )? )
            {
            // InternalXMachine.g:3621:1: ( ( rule__EventSync__Group_1_1__0 )? )
            // InternalXMachine.g:3622:2: ( rule__EventSync__Group_1_1__0 )?
            {
             before(grammarAccess.getEventSyncAccess().getGroup_1_1()); 
            // InternalXMachine.g:3623:2: ( rule__EventSync__Group_1_1__0 )?
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
                    // InternalXMachine.g:3623:3: rule__EventSync__Group_1_1__0
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
    // InternalXMachine.g:3631:1: rule__EventSync__Group_1__2 : rule__EventSync__Group_1__2__Impl ;
    public final void rule__EventSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3635:1: ( rule__EventSync__Group_1__2__Impl )
            // InternalXMachine.g:3636:2: rule__EventSync__Group_1__2__Impl
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
    // InternalXMachine.g:3642:1: rule__EventSync__Group_1__2__Impl : ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) ;
    public final void rule__EventSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3646:1: ( ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) )
            // InternalXMachine.g:3647:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            {
            // InternalXMachine.g:3647:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            // InternalXMachine.g:3648:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            {
             before(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2()); 
            // InternalXMachine.g:3649:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            // InternalXMachine.g:3649:3: rule__EventSync__SynchronisedEventAssignment_1_2
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
    // InternalXMachine.g:3658:1: rule__EventSync__Group_1_1__0 : rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 ;
    public final void rule__EventSync__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3662:1: ( rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 )
            // InternalXMachine.g:3663:2: rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalXMachine.g:3670:1: rule__EventSync__Group_1_1__0__Impl : ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) ;
    public final void rule__EventSync__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3674:1: ( ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) )
            // InternalXMachine.g:3675:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            {
            // InternalXMachine.g:3675:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            // InternalXMachine.g:3676:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            {
             before(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0()); 
            // InternalXMachine.g:3677:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            // InternalXMachine.g:3677:3: rule__EventSync__PrefixAssignment_1_1_0
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
    // InternalXMachine.g:3685:1: rule__EventSync__Group_1_1__1 : rule__EventSync__Group_1_1__1__Impl ;
    public final void rule__EventSync__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3689:1: ( rule__EventSync__Group_1_1__1__Impl )
            // InternalXMachine.g:3690:2: rule__EventSync__Group_1_1__1__Impl
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
    // InternalXMachine.g:3696:1: rule__EventSync__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__EventSync__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3700:1: ( ( '.' ) )
            // InternalXMachine.g:3701:1: ( '.' )
            {
            // InternalXMachine.g:3701:1: ( '.' )
            // InternalXMachine.g:3702:2: '.'
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
    // InternalXMachine.g:3712:1: rule__GroupSync__Group__0 : rule__GroupSync__Group__0__Impl rule__GroupSync__Group__1 ;
    public final void rule__GroupSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3716:1: ( rule__GroupSync__Group__0__Impl rule__GroupSync__Group__1 )
            // InternalXMachine.g:3717:2: rule__GroupSync__Group__0__Impl rule__GroupSync__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalXMachine.g:3724:1: rule__GroupSync__Group__0__Impl : ( () ) ;
    public final void rule__GroupSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3728:1: ( ( () ) )
            // InternalXMachine.g:3729:1: ( () )
            {
            // InternalXMachine.g:3729:1: ( () )
            // InternalXMachine.g:3730:2: ()
            {
             before(grammarAccess.getGroupSyncAccess().getEventSynchronisationAction_0()); 
            // InternalXMachine.g:3731:2: ()
            // InternalXMachine.g:3731:3: 
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
    // InternalXMachine.g:3739:1: rule__GroupSync__Group__1 : rule__GroupSync__Group__1__Impl ;
    public final void rule__GroupSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3743:1: ( rule__GroupSync__Group__1__Impl )
            // InternalXMachine.g:3744:2: rule__GroupSync__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group__1__Impl();

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
    // InternalXMachine.g:3750:1: rule__GroupSync__Group__1__Impl : ( ( rule__GroupSync__Group_1__0 ) ) ;
    public final void rule__GroupSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3754:1: ( ( ( rule__GroupSync__Group_1__0 ) ) )
            // InternalXMachine.g:3755:1: ( ( rule__GroupSync__Group_1__0 ) )
            {
            // InternalXMachine.g:3755:1: ( ( rule__GroupSync__Group_1__0 ) )
            // InternalXMachine.g:3756:2: ( rule__GroupSync__Group_1__0 )
            {
             before(grammarAccess.getGroupSyncAccess().getGroup_1()); 
            // InternalXMachine.g:3757:2: ( rule__GroupSync__Group_1__0 )
            // InternalXMachine.g:3757:3: rule__GroupSync__Group_1__0
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


    // $ANTLR start "rule__GroupSync__Group_1__0"
    // InternalXMachine.g:3766:1: rule__GroupSync__Group_1__0 : rule__GroupSync__Group_1__0__Impl rule__GroupSync__Group_1__1 ;
    public final void rule__GroupSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3770:1: ( rule__GroupSync__Group_1__0__Impl rule__GroupSync__Group_1__1 )
            // InternalXMachine.g:3771:2: rule__GroupSync__Group_1__0__Impl rule__GroupSync__Group_1__1
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
    // InternalXMachine.g:3778:1: rule__GroupSync__Group_1__0__Impl : ( 'synchronisesGroup' ) ;
    public final void rule__GroupSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3782:1: ( ( 'synchronisesGroup' ) )
            // InternalXMachine.g:3783:1: ( 'synchronisesGroup' )
            {
            // InternalXMachine.g:3783:1: ( 'synchronisesGroup' )
            // InternalXMachine.g:3784:2: 'synchronisesGroup'
            {
             before(grammarAccess.getGroupSyncAccess().getSynchronisesGroupKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalXMachine.g:3793:1: rule__GroupSync__Group_1__1 : rule__GroupSync__Group_1__1__Impl rule__GroupSync__Group_1__2 ;
    public final void rule__GroupSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3797:1: ( rule__GroupSync__Group_1__1__Impl rule__GroupSync__Group_1__2 )
            // InternalXMachine.g:3798:2: rule__GroupSync__Group_1__1__Impl rule__GroupSync__Group_1__2
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
    // InternalXMachine.g:3805:1: rule__GroupSync__Group_1__1__Impl : ( ( rule__GroupSync__Group_1_1__0 )? ) ;
    public final void rule__GroupSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3809:1: ( ( ( rule__GroupSync__Group_1_1__0 )? ) )
            // InternalXMachine.g:3810:1: ( ( rule__GroupSync__Group_1_1__0 )? )
            {
            // InternalXMachine.g:3810:1: ( ( rule__GroupSync__Group_1_1__0 )? )
            // InternalXMachine.g:3811:2: ( rule__GroupSync__Group_1_1__0 )?
            {
             before(grammarAccess.getGroupSyncAccess().getGroup_1_1()); 
            // InternalXMachine.g:3812:2: ( rule__GroupSync__Group_1_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==28) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // InternalXMachine.g:3812:3: rule__GroupSync__Group_1_1__0
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
    // InternalXMachine.g:3820:1: rule__GroupSync__Group_1__2 : rule__GroupSync__Group_1__2__Impl ;
    public final void rule__GroupSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3824:1: ( rule__GroupSync__Group_1__2__Impl )
            // InternalXMachine.g:3825:2: rule__GroupSync__Group_1__2__Impl
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
    // InternalXMachine.g:3831:1: rule__GroupSync__Group_1__2__Impl : ( ( rule__GroupSync__SynchronisedCasesAssignment_1_2 ) ) ;
    public final void rule__GroupSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3835:1: ( ( ( rule__GroupSync__SynchronisedCasesAssignment_1_2 ) ) )
            // InternalXMachine.g:3836:1: ( ( rule__GroupSync__SynchronisedCasesAssignment_1_2 ) )
            {
            // InternalXMachine.g:3836:1: ( ( rule__GroupSync__SynchronisedCasesAssignment_1_2 ) )
            // InternalXMachine.g:3837:2: ( rule__GroupSync__SynchronisedCasesAssignment_1_2 )
            {
             before(grammarAccess.getGroupSyncAccess().getSynchronisedCasesAssignment_1_2()); 
            // InternalXMachine.g:3838:2: ( rule__GroupSync__SynchronisedCasesAssignment_1_2 )
            // InternalXMachine.g:3838:3: rule__GroupSync__SynchronisedCasesAssignment_1_2
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
    // InternalXMachine.g:3847:1: rule__GroupSync__Group_1_1__0 : rule__GroupSync__Group_1_1__0__Impl rule__GroupSync__Group_1_1__1 ;
    public final void rule__GroupSync__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3851:1: ( rule__GroupSync__Group_1_1__0__Impl rule__GroupSync__Group_1_1__1 )
            // InternalXMachine.g:3852:2: rule__GroupSync__Group_1_1__0__Impl rule__GroupSync__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalXMachine.g:3859:1: rule__GroupSync__Group_1_1__0__Impl : ( ( rule__GroupSync__PrefixAssignment_1_1_0 ) ) ;
    public final void rule__GroupSync__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3863:1: ( ( ( rule__GroupSync__PrefixAssignment_1_1_0 ) ) )
            // InternalXMachine.g:3864:1: ( ( rule__GroupSync__PrefixAssignment_1_1_0 ) )
            {
            // InternalXMachine.g:3864:1: ( ( rule__GroupSync__PrefixAssignment_1_1_0 ) )
            // InternalXMachine.g:3865:2: ( rule__GroupSync__PrefixAssignment_1_1_0 )
            {
             before(grammarAccess.getGroupSyncAccess().getPrefixAssignment_1_1_0()); 
            // InternalXMachine.g:3866:2: ( rule__GroupSync__PrefixAssignment_1_1_0 )
            // InternalXMachine.g:3866:3: rule__GroupSync__PrefixAssignment_1_1_0
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
    // InternalXMachine.g:3874:1: rule__GroupSync__Group_1_1__1 : rule__GroupSync__Group_1_1__1__Impl ;
    public final void rule__GroupSync__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3878:1: ( rule__GroupSync__Group_1_1__1__Impl )
            // InternalXMachine.g:3879:2: rule__GroupSync__Group_1_1__1__Impl
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
    // InternalXMachine.g:3885:1: rule__GroupSync__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__GroupSync__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3889:1: ( ( '.' ) )
            // InternalXMachine.g:3890:1: ( '.' )
            {
            // InternalXMachine.g:3890:1: ( '.' )
            // InternalXMachine.g:3891:2: '.'
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


    // $ANTLR start "rule__XParameter__Group__0"
    // InternalXMachine.g:3901:1: rule__XParameter__Group__0 : rule__XParameter__Group__0__Impl rule__XParameter__Group__1 ;
    public final void rule__XParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3905:1: ( rule__XParameter__Group__0__Impl rule__XParameter__Group__1 )
            // InternalXMachine.g:3906:2: rule__XParameter__Group__0__Impl rule__XParameter__Group__1
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
    // InternalXMachine.g:3913:1: rule__XParameter__Group__0__Impl : ( () ) ;
    public final void rule__XParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3917:1: ( ( () ) )
            // InternalXMachine.g:3918:1: ( () )
            {
            // InternalXMachine.g:3918:1: ( () )
            // InternalXMachine.g:3919:2: ()
            {
             before(grammarAccess.getXParameterAccess().getParameterAction_0()); 
            // InternalXMachine.g:3920:2: ()
            // InternalXMachine.g:3920:3: 
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
    // InternalXMachine.g:3928:1: rule__XParameter__Group__1 : rule__XParameter__Group__1__Impl ;
    public final void rule__XParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3932:1: ( rule__XParameter__Group__1__Impl )
            // InternalXMachine.g:3933:2: rule__XParameter__Group__1__Impl
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
    // InternalXMachine.g:3939:1: rule__XParameter__Group__1__Impl : ( ( rule__XParameter__NameAssignment_1 ) ) ;
    public final void rule__XParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3943:1: ( ( ( rule__XParameter__NameAssignment_1 ) ) )
            // InternalXMachine.g:3944:1: ( ( rule__XParameter__NameAssignment_1 ) )
            {
            // InternalXMachine.g:3944:1: ( ( rule__XParameter__NameAssignment_1 ) )
            // InternalXMachine.g:3945:2: ( rule__XParameter__NameAssignment_1 )
            {
             before(grammarAccess.getXParameterAccess().getNameAssignment_1()); 
            // InternalXMachine.g:3946:2: ( rule__XParameter__NameAssignment_1 )
            // InternalXMachine.g:3946:3: rule__XParameter__NameAssignment_1
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
    // InternalXMachine.g:3955:1: rule__XGuard__Group__0 : rule__XGuard__Group__0__Impl rule__XGuard__Group__1 ;
    public final void rule__XGuard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3959:1: ( rule__XGuard__Group__0__Impl rule__XGuard__Group__1 )
            // InternalXMachine.g:3960:2: rule__XGuard__Group__0__Impl rule__XGuard__Group__1
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
    // InternalXMachine.g:3967:1: rule__XGuard__Group__0__Impl : ( () ) ;
    public final void rule__XGuard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3971:1: ( ( () ) )
            // InternalXMachine.g:3972:1: ( () )
            {
            // InternalXMachine.g:3972:1: ( () )
            // InternalXMachine.g:3973:2: ()
            {
             before(grammarAccess.getXGuardAccess().getGuardAction_0()); 
            // InternalXMachine.g:3974:2: ()
            // InternalXMachine.g:3974:3: 
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
    // InternalXMachine.g:3982:1: rule__XGuard__Group__1 : rule__XGuard__Group__1__Impl rule__XGuard__Group__2 ;
    public final void rule__XGuard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3986:1: ( rule__XGuard__Group__1__Impl rule__XGuard__Group__2 )
            // InternalXMachine.g:3987:2: rule__XGuard__Group__1__Impl rule__XGuard__Group__2
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
    // InternalXMachine.g:3994:1: rule__XGuard__Group__1__Impl : ( ( rule__XGuard__NameAssignment_1 ) ) ;
    public final void rule__XGuard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3998:1: ( ( ( rule__XGuard__NameAssignment_1 ) ) )
            // InternalXMachine.g:3999:1: ( ( rule__XGuard__NameAssignment_1 ) )
            {
            // InternalXMachine.g:3999:1: ( ( rule__XGuard__NameAssignment_1 ) )
            // InternalXMachine.g:4000:2: ( rule__XGuard__NameAssignment_1 )
            {
             before(grammarAccess.getXGuardAccess().getNameAssignment_1()); 
            // InternalXMachine.g:4001:2: ( rule__XGuard__NameAssignment_1 )
            // InternalXMachine.g:4001:3: rule__XGuard__NameAssignment_1
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
    // InternalXMachine.g:4009:1: rule__XGuard__Group__2 : rule__XGuard__Group__2__Impl rule__XGuard__Group__3 ;
    public final void rule__XGuard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4013:1: ( rule__XGuard__Group__2__Impl rule__XGuard__Group__3 )
            // InternalXMachine.g:4014:2: rule__XGuard__Group__2__Impl rule__XGuard__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalXMachine.g:4021:1: rule__XGuard__Group__2__Impl : ( ( rule__XGuard__PredicateAssignment_2 ) ) ;
    public final void rule__XGuard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4025:1: ( ( ( rule__XGuard__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:4026:1: ( ( rule__XGuard__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:4026:1: ( ( rule__XGuard__PredicateAssignment_2 ) )
            // InternalXMachine.g:4027:2: ( rule__XGuard__PredicateAssignment_2 )
            {
             before(grammarAccess.getXGuardAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:4028:2: ( rule__XGuard__PredicateAssignment_2 )
            // InternalXMachine.g:4028:3: rule__XGuard__PredicateAssignment_2
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
    // InternalXMachine.g:4036:1: rule__XGuard__Group__3 : rule__XGuard__Group__3__Impl ;
    public final void rule__XGuard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4040:1: ( rule__XGuard__Group__3__Impl )
            // InternalXMachine.g:4041:2: rule__XGuard__Group__3__Impl
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
    // InternalXMachine.g:4047:1: rule__XGuard__Group__3__Impl : ( ( rule__XGuard__TheoremAssignment_3 )? ) ;
    public final void rule__XGuard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4051:1: ( ( ( rule__XGuard__TheoremAssignment_3 )? ) )
            // InternalXMachine.g:4052:1: ( ( rule__XGuard__TheoremAssignment_3 )? )
            {
            // InternalXMachine.g:4052:1: ( ( rule__XGuard__TheoremAssignment_3 )? )
            // InternalXMachine.g:4053:2: ( rule__XGuard__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXGuardAccess().getTheoremAssignment_3()); 
            // InternalXMachine.g:4054:2: ( rule__XGuard__TheoremAssignment_3 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==41) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXMachine.g:4054:3: rule__XGuard__TheoremAssignment_3
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
    // InternalXMachine.g:4063:1: rule__XWitness__Group__0 : rule__XWitness__Group__0__Impl rule__XWitness__Group__1 ;
    public final void rule__XWitness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4067:1: ( rule__XWitness__Group__0__Impl rule__XWitness__Group__1 )
            // InternalXMachine.g:4068:2: rule__XWitness__Group__0__Impl rule__XWitness__Group__1
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
    // InternalXMachine.g:4075:1: rule__XWitness__Group__0__Impl : ( () ) ;
    public final void rule__XWitness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4079:1: ( ( () ) )
            // InternalXMachine.g:4080:1: ( () )
            {
            // InternalXMachine.g:4080:1: ( () )
            // InternalXMachine.g:4081:2: ()
            {
             before(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 
            // InternalXMachine.g:4082:2: ()
            // InternalXMachine.g:4082:3: 
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
    // InternalXMachine.g:4090:1: rule__XWitness__Group__1 : rule__XWitness__Group__1__Impl rule__XWitness__Group__2 ;
    public final void rule__XWitness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4094:1: ( rule__XWitness__Group__1__Impl rule__XWitness__Group__2 )
            // InternalXMachine.g:4095:2: rule__XWitness__Group__1__Impl rule__XWitness__Group__2
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
    // InternalXMachine.g:4102:1: rule__XWitness__Group__1__Impl : ( ( rule__XWitness__NameAssignment_1 ) ) ;
    public final void rule__XWitness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4106:1: ( ( ( rule__XWitness__NameAssignment_1 ) ) )
            // InternalXMachine.g:4107:1: ( ( rule__XWitness__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4107:1: ( ( rule__XWitness__NameAssignment_1 ) )
            // InternalXMachine.g:4108:2: ( rule__XWitness__NameAssignment_1 )
            {
             before(grammarAccess.getXWitnessAccess().getNameAssignment_1()); 
            // InternalXMachine.g:4109:2: ( rule__XWitness__NameAssignment_1 )
            // InternalXMachine.g:4109:3: rule__XWitness__NameAssignment_1
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
    // InternalXMachine.g:4117:1: rule__XWitness__Group__2 : rule__XWitness__Group__2__Impl ;
    public final void rule__XWitness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4121:1: ( rule__XWitness__Group__2__Impl )
            // InternalXMachine.g:4122:2: rule__XWitness__Group__2__Impl
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
    // InternalXMachine.g:4128:1: rule__XWitness__Group__2__Impl : ( ( rule__XWitness__PredicateAssignment_2 ) ) ;
    public final void rule__XWitness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4132:1: ( ( ( rule__XWitness__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:4133:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:4133:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            // InternalXMachine.g:4134:2: ( rule__XWitness__PredicateAssignment_2 )
            {
             before(grammarAccess.getXWitnessAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:4135:2: ( rule__XWitness__PredicateAssignment_2 )
            // InternalXMachine.g:4135:3: rule__XWitness__PredicateAssignment_2
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
    // InternalXMachine.g:4144:1: rule__XAction__Group__0 : rule__XAction__Group__0__Impl rule__XAction__Group__1 ;
    public final void rule__XAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4148:1: ( rule__XAction__Group__0__Impl rule__XAction__Group__1 )
            // InternalXMachine.g:4149:2: rule__XAction__Group__0__Impl rule__XAction__Group__1
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
    // InternalXMachine.g:4156:1: rule__XAction__Group__0__Impl : ( () ) ;
    public final void rule__XAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4160:1: ( ( () ) )
            // InternalXMachine.g:4161:1: ( () )
            {
            // InternalXMachine.g:4161:1: ( () )
            // InternalXMachine.g:4162:2: ()
            {
             before(grammarAccess.getXActionAccess().getActionAction_0()); 
            // InternalXMachine.g:4163:2: ()
            // InternalXMachine.g:4163:3: 
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
    // InternalXMachine.g:4171:1: rule__XAction__Group__1 : rule__XAction__Group__1__Impl rule__XAction__Group__2 ;
    public final void rule__XAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4175:1: ( rule__XAction__Group__1__Impl rule__XAction__Group__2 )
            // InternalXMachine.g:4176:2: rule__XAction__Group__1__Impl rule__XAction__Group__2
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
    // InternalXMachine.g:4183:1: rule__XAction__Group__1__Impl : ( ( rule__XAction__NameAssignment_1 ) ) ;
    public final void rule__XAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4187:1: ( ( ( rule__XAction__NameAssignment_1 ) ) )
            // InternalXMachine.g:4188:1: ( ( rule__XAction__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4188:1: ( ( rule__XAction__NameAssignment_1 ) )
            // InternalXMachine.g:4189:2: ( rule__XAction__NameAssignment_1 )
            {
             before(grammarAccess.getXActionAccess().getNameAssignment_1()); 
            // InternalXMachine.g:4190:2: ( rule__XAction__NameAssignment_1 )
            // InternalXMachine.g:4190:3: rule__XAction__NameAssignment_1
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
    // InternalXMachine.g:4198:1: rule__XAction__Group__2 : rule__XAction__Group__2__Impl ;
    public final void rule__XAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4202:1: ( rule__XAction__Group__2__Impl )
            // InternalXMachine.g:4203:2: rule__XAction__Group__2__Impl
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
    // InternalXMachine.g:4209:1: rule__XAction__Group__2__Impl : ( ( rule__XAction__ActionAssignment_2 ) ) ;
    public final void rule__XAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4213:1: ( ( ( rule__XAction__ActionAssignment_2 ) ) )
            // InternalXMachine.g:4214:1: ( ( rule__XAction__ActionAssignment_2 ) )
            {
            // InternalXMachine.g:4214:1: ( ( rule__XAction__ActionAssignment_2 ) )
            // InternalXMachine.g:4215:2: ( rule__XAction__ActionAssignment_2 )
            {
             before(grammarAccess.getXActionAccess().getActionAssignment_2()); 
            // InternalXMachine.g:4216:2: ( rule__XAction__ActionAssignment_2 )
            // InternalXMachine.g:4216:3: rule__XAction__ActionAssignment_2
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


    // $ANTLR start "rule__XEvent__UnorderedGroup_2"
    // InternalXMachine.g:4225:1: rule__XEvent__UnorderedGroup_2 : ( rule__XEvent__UnorderedGroup_2__0 )? ;
    public final void rule__XEvent__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getXEventAccess().getUnorderedGroup_2());
        	
        try {
            // InternalXMachine.g:4230:1: ( ( rule__XEvent__UnorderedGroup_2__0 )? )
            // InternalXMachine.g:4231:2: ( rule__XEvent__UnorderedGroup_2__0 )?
            {
            // InternalXMachine.g:4231:2: ( rule__XEvent__UnorderedGroup_2__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( LA49_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0) ) {
                alt49=1;
            }
            else if ( LA49_0 >= 14 && LA49_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalXMachine.g:4231:2: rule__XEvent__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__UnorderedGroup_2__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getXEventAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__UnorderedGroup_2"


    // $ANTLR start "rule__XEvent__UnorderedGroup_2__Impl"
    // InternalXMachine.g:4239:1: rule__XEvent__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) ) ) ;
    public final void rule__XEvent__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXMachine.g:4244:1: ( ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) ) ) )
            // InternalXMachine.g:4245:3: ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) ) )
            {
            // InternalXMachine.g:4245:3: ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( LA50_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 >= 14 && LA50_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalXMachine.g:4246:3: ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) )
                    {
                    // InternalXMachine.g:4246:3: ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) )
                    // InternalXMachine.g:4247:4: {...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__XEvent__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalXMachine.g:4247:102: ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) )
                    // InternalXMachine.g:4248:5: ( ( rule__XEvent__ExtendedAssignment_2_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalXMachine.g:4254:5: ( ( rule__XEvent__ExtendedAssignment_2_0 ) )
                    // InternalXMachine.g:4255:6: ( rule__XEvent__ExtendedAssignment_2_0 )
                    {
                     before(grammarAccess.getXEventAccess().getExtendedAssignment_2_0()); 
                    // InternalXMachine.g:4256:6: ( rule__XEvent__ExtendedAssignment_2_0 )
                    // InternalXMachine.g:4256:7: rule__XEvent__ExtendedAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__ExtendedAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getExtendedAssignment_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:4261:3: ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) )
                    {
                    // InternalXMachine.g:4261:3: ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) )
                    // InternalXMachine.g:4262:4: {...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__XEvent__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalXMachine.g:4262:102: ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) )
                    // InternalXMachine.g:4263:5: ( ( rule__XEvent__ConvergenceAssignment_2_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalXMachine.g:4269:5: ( ( rule__XEvent__ConvergenceAssignment_2_1 ) )
                    // InternalXMachine.g:4270:6: ( rule__XEvent__ConvergenceAssignment_2_1 )
                    {
                     before(grammarAccess.getXEventAccess().getConvergenceAssignment_2_1()); 
                    // InternalXMachine.g:4271:6: ( rule__XEvent__ConvergenceAssignment_2_1 )
                    // InternalXMachine.g:4271:7: rule__XEvent__ConvergenceAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__ConvergenceAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getConvergenceAssignment_2_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getXEventAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__XEvent__UnorderedGroup_2__0"
    // InternalXMachine.g:4284:1: rule__XEvent__UnorderedGroup_2__0 : rule__XEvent__UnorderedGroup_2__Impl ( rule__XEvent__UnorderedGroup_2__1 )? ;
    public final void rule__XEvent__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4288:1: ( rule__XEvent__UnorderedGroup_2__Impl ( rule__XEvent__UnorderedGroup_2__1 )? )
            // InternalXMachine.g:4289:2: rule__XEvent__UnorderedGroup_2__Impl ( rule__XEvent__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_31);
            rule__XEvent__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalXMachine.g:4290:2: ( rule__XEvent__UnorderedGroup_2__1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 >= 14 && LA51_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalXMachine.g:4290:2: rule__XEvent__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__UnorderedGroup_2__1();

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
    // $ANTLR end "rule__XEvent__UnorderedGroup_2__0"


    // $ANTLR start "rule__XEvent__UnorderedGroup_2__1"
    // InternalXMachine.g:4296:1: rule__XEvent__UnorderedGroup_2__1 : rule__XEvent__UnorderedGroup_2__Impl ;
    public final void rule__XEvent__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4300:1: ( rule__XEvent__UnorderedGroup_2__Impl )
            // InternalXMachine.g:4301:2: rule__XEvent__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__UnorderedGroup_2__Impl();

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
    // $ANTLR end "rule__XEvent__UnorderedGroup_2__1"


    // $ANTLR start "rule__Machine__CommentAssignment_1"
    // InternalXMachine.g:4308:1: rule__Machine__CommentAssignment_1 : ( ( rule__Machine__CommentAlternatives_1_0 ) ) ;
    public final void rule__Machine__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4312:1: ( ( ( rule__Machine__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:4313:2: ( ( rule__Machine__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:4313:2: ( ( rule__Machine__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:4314:3: ( rule__Machine__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getMachineAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:4315:3: ( rule__Machine__CommentAlternatives_1_0 )
            // InternalXMachine.g:4315:4: rule__Machine__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__CommentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getCommentAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__CommentAssignment_1"


    // $ANTLR start "rule__Machine__NameAssignment_3"
    // InternalXMachine.g:4323:1: rule__Machine__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4327:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4328:2: ( RULE_ID )
            {
            // InternalXMachine.g:4328:2: ( RULE_ID )
            // InternalXMachine.g:4329:3: RULE_ID
            {
             before(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__NameAssignment_3"


    // $ANTLR start "rule__Machine__ExtensionsAssignment_4"
    // InternalXMachine.g:4338:1: rule__Machine__ExtensionsAssignment_4 : ( ruleMIncludes ) ;
    public final void rule__Machine__ExtensionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4342:1: ( ( ruleMIncludes ) )
            // InternalXMachine.g:4343:2: ( ruleMIncludes )
            {
            // InternalXMachine.g:4343:2: ( ruleMIncludes )
            // InternalXMachine.g:4344:3: ruleMIncludes
            {
             before(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMIncludes();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__ExtensionsAssignment_4"


    // $ANTLR start "rule__Machine__RefinesAssignment_5_1"
    // InternalXMachine.g:4353:1: rule__Machine__RefinesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__RefinesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4357:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4358:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4358:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4359:3: ( RULE_ID )
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_5_1_0()); 
            // InternalXMachine.g:4360:3: ( RULE_ID )
            // InternalXMachine.g:4361:4: RULE_ID
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getRefinesMachineIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__RefinesAssignment_5_1"


    // $ANTLR start "rule__Machine__SeesAssignment_6_1"
    // InternalXMachine.g:4372:1: rule__Machine__SeesAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__SeesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4376:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4377:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4377:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4378:3: ( RULE_ID )
            {
             before(grammarAccess.getMachineAccess().getSeesContextCrossReference_6_1_0()); 
            // InternalXMachine.g:4379:3: ( RULE_ID )
            // InternalXMachine.g:4380:4: RULE_ID
            {
             before(grammarAccess.getMachineAccess().getSeesContextIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getSeesContextIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getMachineAccess().getSeesContextCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__SeesAssignment_6_1"


    // $ANTLR start "rule__Machine__VariablesAssignment_7_1"
    // InternalXMachine.g:4391:1: rule__Machine__VariablesAssignment_7_1 : ( ruleXVariable ) ;
    public final void rule__Machine__VariablesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4395:1: ( ( ruleXVariable ) )
            // InternalXMachine.g:4396:2: ( ruleXVariable )
            {
            // InternalXMachine.g:4396:2: ( ruleXVariable )
            // InternalXMachine.g:4397:3: ruleXVariable
            {
             before(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXVariable();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariablesAssignment_7_1"


    // $ANTLR start "rule__Machine__InvariantsAssignment_8_1"
    // InternalXMachine.g:4406:1: rule__Machine__InvariantsAssignment_8_1 : ( ruleXInvariant ) ;
    public final void rule__Machine__InvariantsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4410:1: ( ( ruleXInvariant ) )
            // InternalXMachine.g:4411:2: ( ruleXInvariant )
            {
            // InternalXMachine.g:4411:2: ( ruleXInvariant )
            // InternalXMachine.g:4412:3: ruleXInvariant
            {
             before(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXInvariant();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__InvariantsAssignment_8_1"


    // $ANTLR start "rule__Machine__VariantAssignment_9_1"
    // InternalXMachine.g:4421:1: rule__Machine__VariantAssignment_9_1 : ( ruleXVariant ) ;
    public final void rule__Machine__VariantAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4425:1: ( ( ruleXVariant ) )
            // InternalXMachine.g:4426:2: ( ruleXVariant )
            {
            // InternalXMachine.g:4426:2: ( ruleXVariant )
            // InternalXMachine.g:4427:3: ruleXVariant
            {
             before(grammarAccess.getMachineAccess().getVariantXVariantParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXVariant();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getVariantXVariantParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariantAssignment_9_1"


    // $ANTLR start "rule__Machine__EventsAssignment_10_1"
    // InternalXMachine.g:4436:1: rule__Machine__EventsAssignment_10_1 : ( ruleXEvent ) ;
    public final void rule__Machine__EventsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4440:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:4441:2: ( ruleXEvent )
            {
            // InternalXMachine.g:4441:2: ( ruleXEvent )
            // InternalXMachine.g:4442:3: ruleXEvent
            {
             before(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXEvent();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__EventsAssignment_10_1"


    // $ANTLR start "rule__Machine__EventsAssignment_10_2"
    // InternalXMachine.g:4451:1: rule__Machine__EventsAssignment_10_2 : ( ruleXEvent ) ;
    public final void rule__Machine__EventsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4455:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:4456:2: ( ruleXEvent )
            {
            // InternalXMachine.g:4456:2: ( ruleXEvent )
            // InternalXMachine.g:4457:3: ruleXEvent
            {
             before(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXEvent();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__EventsAssignment_10_2"


    // $ANTLR start "rule__Machine__ExtensionsAssignment_11"
    // InternalXMachine.g:4466:1: rule__Machine__ExtensionsAssignment_11 : ( ruleXGroup ) ;
    public final void rule__Machine__ExtensionsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4470:1: ( ( ruleXGroup ) )
            // InternalXMachine.g:4471:2: ( ruleXGroup )
            {
            // InternalXMachine.g:4471:2: ( ruleXGroup )
            // InternalXMachine.g:4472:3: ruleXGroup
            {
             before(grammarAccess.getMachineAccess().getExtensionsXGroupParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleXGroup();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getExtensionsXGroupParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__ExtensionsAssignment_11"


    // $ANTLR start "rule__MIncludes__AbstractMachineAssignment_1_1"
    // InternalXMachine.g:4481:1: rule__MIncludes__AbstractMachineAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MIncludes__AbstractMachineAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4485:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:4486:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:4486:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:4487:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 
            // InternalXMachine.g:4488:3: ( ruleQualifiedName )
            // InternalXMachine.g:4489:4: ruleQualifiedName
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
    // InternalXMachine.g:4500:1: rule__MIncludes__ConcreteMachineAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MIncludes__ConcreteMachineAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4504:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4505:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4505:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4506:3: ( RULE_ID )
            {
             before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 
            // InternalXMachine.g:4507:3: ( RULE_ID )
            // InternalXMachine.g:4508:4: RULE_ID
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
    // InternalXMachine.g:4519:1: rule__MIncludes__PrefixesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4523:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4524:2: ( RULE_ID )
            {
            // InternalXMachine.g:4524:2: ( RULE_ID )
            // InternalXMachine.g:4525:3: RULE_ID
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
    // InternalXMachine.g:4534:1: rule__MIncludes__PrefixesAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4538:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4539:2: ( RULE_ID )
            {
            // InternalXMachine.g:4539:2: ( RULE_ID )
            // InternalXMachine.g:4540:3: RULE_ID
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
    // InternalXMachine.g:4549:1: rule__XVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4553:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4554:2: ( RULE_ID )
            {
            // InternalXMachine.g:4554:2: ( RULE_ID )
            // InternalXMachine.g:4555:3: RULE_ID
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
    // InternalXMachine.g:4564:1: rule__XInvariant__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XInvariant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4568:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4569:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4569:2: ( RULE_XLABEL )
            // InternalXMachine.g:4570:3: RULE_XLABEL
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
    // InternalXMachine.g:4579:1: rule__XInvariant__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XInvariant__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4583:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:4584:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:4584:2: ( ruleXPredicate )
            // InternalXMachine.g:4585:3: ruleXPredicate
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
    // InternalXMachine.g:4594:1: rule__XInvariant__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XInvariant__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4598:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:4599:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:4599:2: ( ( 'theorem' ) )
            // InternalXMachine.g:4600:3: ( 'theorem' )
            {
             before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXMachine.g:4601:3: ( 'theorem' )
            // InternalXMachine.g:4602:4: 'theorem'
            {
             before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalXMachine.g:4613:1: rule__XVariant__ExpressionAssignment_1 : ( ruleXPredicate ) ;
    public final void rule__XVariant__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4617:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:4618:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:4618:2: ( ruleXPredicate )
            // InternalXMachine.g:4619:3: ruleXPredicate
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
    // InternalXMachine.g:4628:1: rule__XGroup__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4632:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4633:2: ( RULE_ID )
            {
            // InternalXMachine.g:4633:2: ( RULE_ID )
            // InternalXMachine.g:4634:3: RULE_ID
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
    // InternalXMachine.g:4643:1: rule__XGroup__FormalParametersAssignment_3_1 : ( ruleXFormalParameter ) ;
    public final void rule__XGroup__FormalParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4647:1: ( ( ruleXFormalParameter ) )
            // InternalXMachine.g:4648:2: ( ruleXFormalParameter )
            {
            // InternalXMachine.g:4648:2: ( ruleXFormalParameter )
            // InternalXMachine.g:4649:3: ruleXFormalParameter
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
    // InternalXMachine.g:4658:1: rule__XGroup__FormalParametersAssignment_3_2_1 : ( ruleXFormalParameter ) ;
    public final void rule__XGroup__FormalParametersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4662:1: ( ( ruleXFormalParameter ) )
            // InternalXMachine.g:4663:2: ( ruleXFormalParameter )
            {
            // InternalXMachine.g:4663:2: ( ruleXFormalParameter )
            // InternalXMachine.g:4664:3: ruleXFormalParameter
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
    // InternalXMachine.g:4673:1: rule__XGroup__EventsAssignment_5_0 : ( ( RULE_ID ) ) ;
    public final void rule__XGroup__EventsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4677:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4678:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4678:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4679:3: ( RULE_ID )
            {
             before(grammarAccess.getXGroupAccess().getEventsEventCrossReference_5_0_0()); 
            // InternalXMachine.g:4680:3: ( RULE_ID )
            // InternalXMachine.g:4681:4: RULE_ID
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
    // InternalXMachine.g:4692:1: rule__XGroup__EventsAssignment_5_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__XGroup__EventsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4696:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4697:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4697:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4698:3: ( RULE_ID )
            {
             before(grammarAccess.getXGroupAccess().getEventsEventCrossReference_5_1_1_0()); 
            // InternalXMachine.g:4699:3: ( RULE_ID )
            // InternalXMachine.g:4700:4: RULE_ID
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
    // InternalXMachine.g:4711:1: rule__XFormalParameter__DirectionAssignment_1 : ( ruleXDirection ) ;
    public final void rule__XFormalParameter__DirectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4715:1: ( ( ruleXDirection ) )
            // InternalXMachine.g:4716:2: ( ruleXDirection )
            {
            // InternalXMachine.g:4716:2: ( ruleXDirection )
            // InternalXMachine.g:4717:3: ruleXDirection
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
    // InternalXMachine.g:4726:1: rule__XFormalParameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XFormalParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4730:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4731:2: ( RULE_ID )
            {
            // InternalXMachine.g:4731:2: ( RULE_ID )
            // InternalXMachine.g:4732:3: RULE_ID
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


    // $ANTLR start "rule__XFormalArgument__NameAssignment_1"
    // InternalXMachine.g:4741:1: rule__XFormalArgument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XFormalArgument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4745:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4746:2: ( RULE_ID )
            {
            // InternalXMachine.g:4746:2: ( RULE_ID )
            // InternalXMachine.g:4747:3: RULE_ID
            {
             before(grammarAccess.getXFormalArgumentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXFormalArgumentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFormalArgument__NameAssignment_1"


    // $ANTLR start "rule__XEvent__NameAssignment_1"
    // InternalXMachine.g:4756:1: rule__XEvent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XEvent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4760:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4761:2: ( RULE_ID )
            {
            // InternalXMachine.g:4761:2: ( RULE_ID )
            // InternalXMachine.g:4762:3: RULE_ID
            {
             before(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__NameAssignment_1"


    // $ANTLR start "rule__XEvent__ExtendedAssignment_2_0"
    // InternalXMachine.g:4771:1: rule__XEvent__ExtendedAssignment_2_0 : ( ( 'extended' ) ) ;
    public final void rule__XEvent__ExtendedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4775:1: ( ( ( 'extended' ) ) )
            // InternalXMachine.g:4776:2: ( ( 'extended' ) )
            {
            // InternalXMachine.g:4776:2: ( ( 'extended' ) )
            // InternalXMachine.g:4777:3: ( 'extended' )
            {
             before(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_2_0_0()); 
            // InternalXMachine.g:4778:3: ( 'extended' )
            // InternalXMachine.g:4779:4: 'extended'
            {
             before(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_2_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_2_0_0()); 

            }

             after(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ExtendedAssignment_2_0"


    // $ANTLR start "rule__XEvent__ConvergenceAssignment_2_1"
    // InternalXMachine.g:4790:1: rule__XEvent__ConvergenceAssignment_2_1 : ( ruleXConvergence ) ;
    public final void rule__XEvent__ConvergenceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4794:1: ( ( ruleXConvergence ) )
            // InternalXMachine.g:4795:2: ( ruleXConvergence )
            {
            // InternalXMachine.g:4795:2: ( ruleXConvergence )
            // InternalXMachine.g:4796:3: ruleXConvergence
            {
             before(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXConvergence();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ConvergenceAssignment_2_1"


    // $ANTLR start "rule__XEvent__ExtensionsAssignment_3"
    // InternalXMachine.g:4805:1: rule__XEvent__ExtensionsAssignment_3 : ( rulegroupOrEvent ) ;
    public final void rule__XEvent__ExtensionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4809:1: ( ( rulegroupOrEvent ) )
            // InternalXMachine.g:4810:2: ( rulegroupOrEvent )
            {
            // InternalXMachine.g:4810:2: ( rulegroupOrEvent )
            // InternalXMachine.g:4811:3: rulegroupOrEvent
            {
             before(grammarAccess.getXEventAccess().getExtensionsGroupOrEventParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulegroupOrEvent();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getExtensionsGroupOrEventParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ExtensionsAssignment_3"


    // $ANTLR start "rule__XEvent__RefinesAssignment_4_1"
    // InternalXMachine.g:4820:1: rule__XEvent__RefinesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4824:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4825:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4825:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4826:3: ( RULE_ID )
            {
             before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_1_0()); 
            // InternalXMachine.g:4827:3: ( RULE_ID )
            // InternalXMachine.g:4828:4: RULE_ID
            {
             before(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__RefinesAssignment_4_1"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_5_0_0_1"
    // InternalXMachine.g:4839:1: rule__XEvent__WitnessesAssignment_5_0_0_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_5_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4843:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:4844:2: ( ruleXWitness )
            {
            // InternalXMachine.g:4844:2: ( ruleXWitness )
            // InternalXMachine.g:4845:3: ruleXWitness
            {
             before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__WitnessesAssignment_5_0_0_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_5_0_2"
    // InternalXMachine.g:4854:1: rule__XEvent__ActionsAssignment_5_0_2 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_5_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4858:1: ( ( ruleXAction ) )
            // InternalXMachine.g:4859:2: ( ruleXAction )
            {
            // InternalXMachine.g:4859:2: ( ruleXAction )
            // InternalXMachine.g:4860:3: ruleXAction
            {
             before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ActionsAssignment_5_0_2"


    // $ANTLR start "rule__XEvent__GuardsAssignment_5_1_1"
    // InternalXMachine.g:4869:1: rule__XEvent__GuardsAssignment_5_1_1 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4873:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:4874:2: ( ruleXGuard )
            {
            // InternalXMachine.g:4874:2: ( ruleXGuard )
            // InternalXMachine.g:4875:3: ruleXGuard
            {
             before(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXGuard();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__GuardsAssignment_5_1_1"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_5_1_2_1"
    // InternalXMachine.g:4884:1: rule__XEvent__WitnessesAssignment_5_1_2_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_5_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4888:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:4889:2: ( ruleXWitness )
            {
            // InternalXMachine.g:4889:2: ( ruleXWitness )
            // InternalXMachine.g:4890:3: ruleXWitness
            {
             before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__WitnessesAssignment_5_1_2_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_5_1_3_1"
    // InternalXMachine.g:4899:1: rule__XEvent__ActionsAssignment_5_1_3_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_5_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4903:1: ( ( ruleXAction ) )
            // InternalXMachine.g:4904:2: ( ruleXAction )
            {
            // InternalXMachine.g:4904:2: ( ruleXAction )
            // InternalXMachine.g:4905:3: ruleXAction
            {
             before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ActionsAssignment_5_1_3_1"


    // $ANTLR start "rule__XEvent__ParametersAssignment_5_2_1"
    // InternalXMachine.g:4914:1: rule__XEvent__ParametersAssignment_5_2_1 : ( ruleXParameter ) ;
    public final void rule__XEvent__ParametersAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4918:1: ( ( ruleXParameter ) )
            // InternalXMachine.g:4919:2: ( ruleXParameter )
            {
            // InternalXMachine.g:4919:2: ( ruleXParameter )
            // InternalXMachine.g:4920:3: ruleXParameter
            {
             before(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXParameter();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ParametersAssignment_5_2_1"


    // $ANTLR start "rule__XEvent__GuardsAssignment_5_2_3"
    // InternalXMachine.g:4929:1: rule__XEvent__GuardsAssignment_5_2_3 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_5_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4933:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:4934:2: ( ruleXGuard )
            {
            // InternalXMachine.g:4934:2: ( ruleXGuard )
            // InternalXMachine.g:4935:3: ruleXGuard
            {
             before(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_5_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleXGuard();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_5_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__GuardsAssignment_5_2_3"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_5_2_4_1"
    // InternalXMachine.g:4944:1: rule__XEvent__WitnessesAssignment_5_2_4_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_5_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4948:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:4949:2: ( ruleXWitness )
            {
            // InternalXMachine.g:4949:2: ( ruleXWitness )
            // InternalXMachine.g:4950:3: ruleXWitness
            {
             before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_2_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_2_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__WitnessesAssignment_5_2_4_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_5_2_5_1"
    // InternalXMachine.g:4959:1: rule__XEvent__ActionsAssignment_5_2_5_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_5_2_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4963:1: ( ( ruleXAction ) )
            // InternalXMachine.g:4964:2: ( ruleXAction )
            {
            // InternalXMachine.g:4964:2: ( ruleXAction )
            // InternalXMachine.g:4965:3: ruleXAction
            {
             before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_2_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_2_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ActionsAssignment_5_2_5_1"


    // $ANTLR start "rule__EventSync__PrefixAssignment_1_1_0"
    // InternalXMachine.g:4974:1: rule__EventSync__PrefixAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__EventSync__PrefixAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4978:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4979:2: ( RULE_ID )
            {
            // InternalXMachine.g:4979:2: ( RULE_ID )
            // InternalXMachine.g:4980:3: RULE_ID
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
    // InternalXMachine.g:4989:1: rule__EventSync__SynchronisedEventAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__EventSync__SynchronisedEventAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4993:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4994:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4994:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4995:3: ( RULE_ID )
            {
             before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0()); 
            // InternalXMachine.g:4996:3: ( RULE_ID )
            // InternalXMachine.g:4997:4: RULE_ID
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
    // InternalXMachine.g:5008:1: rule__GroupSync__PrefixAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__GroupSync__PrefixAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5012:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5013:2: ( RULE_ID )
            {
            // InternalXMachine.g:5013:2: ( RULE_ID )
            // InternalXMachine.g:5014:3: RULE_ID
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
    // InternalXMachine.g:5023:1: rule__GroupSync__SynchronisedCasesAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__GroupSync__SynchronisedCasesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5027:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5028:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5028:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5029:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesCrossReference_1_2_0()); 
            // InternalXMachine.g:5030:3: ( RULE_ID )
            // InternalXMachine.g:5031:4: RULE_ID
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


    // $ANTLR start "rule__XParameter__NameAssignment_1"
    // InternalXMachine.g:5042:1: rule__XParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5046:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5047:2: ( RULE_ID )
            {
            // InternalXMachine.g:5047:2: ( RULE_ID )
            // InternalXMachine.g:5048:3: RULE_ID
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
    // InternalXMachine.g:5057:1: rule__XGuard__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XGuard__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5061:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5062:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5062:2: ( RULE_XLABEL )
            // InternalXMachine.g:5063:3: RULE_XLABEL
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
    // InternalXMachine.g:5072:1: rule__XGuard__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XGuard__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5076:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:5077:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:5077:2: ( ruleXPredicate )
            // InternalXMachine.g:5078:3: ruleXPredicate
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
    // InternalXMachine.g:5087:1: rule__XGuard__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XGuard__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5091:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:5092:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:5092:2: ( ( 'theorem' ) )
            // InternalXMachine.g:5093:3: ( 'theorem' )
            {
             before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXMachine.g:5094:3: ( 'theorem' )
            // InternalXMachine.g:5095:4: 'theorem'
            {
             before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalXMachine.g:5106:1: rule__XWitness__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XWitness__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5110:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5111:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5111:2: ( RULE_XLABEL )
            // InternalXMachine.g:5112:3: RULE_XLABEL
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
    // InternalXMachine.g:5121:1: rule__XWitness__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XWitness__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5125:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:5126:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:5126:2: ( ruleXPredicate )
            // InternalXMachine.g:5127:3: ruleXPredicate
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
    // InternalXMachine.g:5136:1: rule__XAction__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5140:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5141:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5141:2: ( RULE_XLABEL )
            // InternalXMachine.g:5142:3: RULE_XLABEL
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
    // InternalXMachine.g:5151:1: rule__XAction__ActionAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XAction__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5155:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:5156:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:5156:2: ( ruleXPredicate )
            // InternalXMachine.g:5157:3: ruleXPredicate
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000023FC0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000004000001C000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000001AC400C0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000004000001C002L});

}
