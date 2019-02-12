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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_XLABEL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BOOL'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21151'", "'\\u2115'", "'\\u21191'", "'\\u2119'", "'\\u2124'", "'('", "')'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'.'", "'='", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "':'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'\\u00D7'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'in'", "'out'", "'ordinary'", "'convergent'", "'anticipated'", "'machine'", "'end'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variants'", "'events'", "'includes'", "'to'", "'as'", "'group'", "'begin'", "'event'", "'any'", "'where'", "'then'", "'with'", "'synchronises'", "'%'", "'\\u22C2'", "'theorem'", "'extends'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int RULE_XLABEL=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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


    // $ANTLR start "entryRuleXPar"
    // InternalXMachine.g:478:1: entryRuleXPar : ruleXPar EOF ;
    public final void entryRuleXPar() throws RecognitionException {
        try {
            // InternalXMachine.g:479:1: ( ruleXPar EOF )
            // InternalXMachine.g:480:1: ruleXPar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXPar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXParRule()); 
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
    // $ANTLR end "entryRuleXPar"


    // $ANTLR start "ruleXPar"
    // InternalXMachine.g:487:1: ruleXPar : ( RULE_STRING ) ;
    public final void ruleXPar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:491:2: ( ( RULE_STRING ) )
            // InternalXMachine.g:492:2: ( RULE_STRING )
            {
            // InternalXMachine.g:492:2: ( RULE_STRING )
            // InternalXMachine.g:493:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParAccess().getSTRINGTerminalRuleCall()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXParAccess().getSTRINGTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXPar"


    // $ANTLR start "entryRuleXFormula"
    // InternalXMachine.g:503:1: entryRuleXFormula : ruleXFormula EOF ;
    public final void entryRuleXFormula() throws RecognitionException {
        try {
            // InternalXMachine.g:504:1: ( ruleXFormula EOF )
            // InternalXMachine.g:505:1: ruleXFormula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormulaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFormulaRule()); 
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
    // $ANTLR end "entryRuleXFormula"


    // $ANTLR start "ruleXFormula"
    // InternalXMachine.g:512:1: ruleXFormula : ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) ) ;
    public final void ruleXFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:516:2: ( ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) ) )
            // InternalXMachine.g:517:2: ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) )
            {
            // InternalXMachine.g:517:2: ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) )
            // InternalXMachine.g:518:3: ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* )
            {
            // InternalXMachine.g:518:3: ( ( rule__XFormula__Alternatives ) )
            // InternalXMachine.g:519:4: ( rule__XFormula__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            }
            // InternalXMachine.g:520:4: ( rule__XFormula__Alternatives )
            // InternalXMachine.g:520:5: rule__XFormula__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__XFormula__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFormulaAccess().getAlternatives()); 
            }

            }

            // InternalXMachine.g:523:3: ( ( rule__XFormula__Alternatives )* )
            // InternalXMachine.g:524:4: ( rule__XFormula__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            }
            // InternalXMachine.g:525:4: ( rule__XFormula__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||(LA1_0>=12 && LA1_0<=109)||LA1_0==134) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXMachine.g:525:5: rule__XFormula__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__XFormula__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFormulaAccess().getAlternatives()); 
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
    // $ANTLR end "ruleXFormula"


    // $ANTLR start "entryRuleEVENTB_IDENTIFIER_KEYWORD"
    // InternalXMachine.g:535:1: entryRuleEVENTB_IDENTIFIER_KEYWORD : ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final void entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        try {
            // InternalXMachine.g:536:1: ( ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalXMachine.g:537:1: ruleEVENTB_IDENTIFIER_KEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEVENTB_IDENTIFIER_KEYWORD();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDRule()); 
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
    // $ANTLR end "entryRuleEVENTB_IDENTIFIER_KEYWORD"


    // $ANTLR start "ruleEVENTB_IDENTIFIER_KEYWORD"
    // InternalXMachine.g:544:1: ruleEVENTB_IDENTIFIER_KEYWORD : ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) ;
    public final void ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:548:2: ( ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) )
            // InternalXMachine.g:549:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            {
            // InternalXMachine.g:549:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            // InternalXMachine.g:550:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives()); 
            }
            // InternalXMachine.g:551:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            // InternalXMachine.g:551:4: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEVENTB_IDENTIFIER_KEYWORD"


    // $ANTLR start "entryRuleEVENTB_PREDICATE_SYMBOLS"
    // InternalXMachine.g:560:1: entryRuleEVENTB_PREDICATE_SYMBOLS : ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final void entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        try {
            // InternalXMachine.g:561:1: ( ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalXMachine.g:562:1: ruleEVENTB_PREDICATE_SYMBOLS EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEVENTB_PREDICATE_SYMBOLS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSRule()); 
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
    // $ANTLR end "entryRuleEVENTB_PREDICATE_SYMBOLS"


    // $ANTLR start "ruleEVENTB_PREDICATE_SYMBOLS"
    // InternalXMachine.g:569:1: ruleEVENTB_PREDICATE_SYMBOLS : ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:573:2: ( ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) )
            // InternalXMachine.g:574:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            {
            // InternalXMachine.g:574:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            // InternalXMachine.g:575:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives()); 
            }
            // InternalXMachine.g:576:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            // InternalXMachine.g:576:4: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_PREDICATE_SYMBOLS__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEVENTB_PREDICATE_SYMBOLS"


    // $ANTLR start "entryRuleEVENTB_EXPRESSION_SYMBOLS"
    // InternalXMachine.g:585:1: entryRuleEVENTB_EXPRESSION_SYMBOLS : ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final void entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        try {
            // InternalXMachine.g:586:1: ( ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalXMachine.g:587:1: ruleEVENTB_EXPRESSION_SYMBOLS EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEVENTB_EXPRESSION_SYMBOLS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSRule()); 
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
    // $ANTLR end "entryRuleEVENTB_EXPRESSION_SYMBOLS"


    // $ANTLR start "ruleEVENTB_EXPRESSION_SYMBOLS"
    // InternalXMachine.g:594:1: ruleEVENTB_EXPRESSION_SYMBOLS : ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:598:2: ( ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) )
            // InternalXMachine.g:599:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            {
            // InternalXMachine.g:599:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            // InternalXMachine.g:600:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives()); 
            }
            // InternalXMachine.g:601:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            // InternalXMachine.g:601:4: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEVENTB_EXPRESSION_SYMBOLS"


    // $ANTLR start "ruleXDirection"
    // InternalXMachine.g:610:1: ruleXDirection : ( ( rule__XDirection__Alternatives ) ) ;
    public final void ruleXDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:614:1: ( ( ( rule__XDirection__Alternatives ) ) )
            // InternalXMachine.g:615:2: ( ( rule__XDirection__Alternatives ) )
            {
            // InternalXMachine.g:615:2: ( ( rule__XDirection__Alternatives ) )
            // InternalXMachine.g:616:3: ( rule__XDirection__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXDirectionAccess().getAlternatives()); 
            }
            // InternalXMachine.g:617:3: ( rule__XDirection__Alternatives )
            // InternalXMachine.g:617:4: rule__XDirection__Alternatives
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
    // InternalXMachine.g:626:1: ruleXConvergence : ( ( rule__XConvergence__Alternatives ) ) ;
    public final void ruleXConvergence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:630:1: ( ( ( rule__XConvergence__Alternatives ) ) )
            // InternalXMachine.g:631:2: ( ( rule__XConvergence__Alternatives ) )
            {
            // InternalXMachine.g:631:2: ( ( rule__XConvergence__Alternatives ) )
            // InternalXMachine.g:632:3: ( rule__XConvergence__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConvergenceAccess().getAlternatives()); 
            }
            // InternalXMachine.g:633:3: ( rule__XConvergence__Alternatives )
            // InternalXMachine.g:633:4: rule__XConvergence__Alternatives
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


    // $ANTLR start "rule__XEvent__Alternatives_4"
    // InternalXMachine.g:641:1: rule__XEvent__Alternatives_4 : ( ( ( rule__XEvent__Group_4_0__0 ) ) | ( ( rule__XEvent__Group_4_1__0 ) ) );
    public final void rule__XEvent__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:645:1: ( ( ( rule__XEvent__Group_4_0__0 ) ) | ( ( rule__XEvent__Group_4_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==117) ) {
                alt2=1;
            }
            else if ( (LA2_0==137) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXMachine.g:646:2: ( ( rule__XEvent__Group_4_0__0 ) )
                    {
                    // InternalXMachine.g:646:2: ( ( rule__XEvent__Group_4_0__0 ) )
                    // InternalXMachine.g:647:3: ( rule__XEvent__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_4_0()); 
                    }
                    // InternalXMachine.g:648:3: ( rule__XEvent__Group_4_0__0 )
                    // InternalXMachine.g:648:4: rule__XEvent__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getGroup_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:652:2: ( ( rule__XEvent__Group_4_1__0 ) )
                    {
                    // InternalXMachine.g:652:2: ( ( rule__XEvent__Group_4_1__0 ) )
                    // InternalXMachine.g:653:3: ( rule__XEvent__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_4_1()); 
                    }
                    // InternalXMachine.g:654:3: ( rule__XEvent__Group_4_1__0 )
                    // InternalXMachine.g:654:4: rule__XEvent__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getGroup_4_1()); 
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
    // $ANTLR end "rule__XEvent__Alternatives_4"


    // $ANTLR start "rule__XGroupOrEvent__Alternatives"
    // InternalXMachine.g:662:1: rule__XGroupOrEvent__Alternatives : ( ( ruleGroupSync ) | ( ruleEventSync ) );
    public final void rule__XGroupOrEvent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:666:1: ( ( ruleGroupSync ) | ( ruleEventSync ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==133) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else if ( (LA3_1==128) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXMachine.g:667:2: ( ruleGroupSync )
                    {
                    // InternalXMachine.g:667:2: ( ruleGroupSync )
                    // InternalXMachine.g:668:3: ruleGroupSync
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
                    // InternalXMachine.g:673:2: ( ruleEventSync )
                    {
                    // InternalXMachine.g:673:2: ( ruleEventSync )
                    // InternalXMachine.g:674:3: ruleEventSync
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


    // $ANTLR start "rule__XFormula__Alternatives"
    // InternalXMachine.g:683:1: rule__XFormula__Alternatives : ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__XFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:687:1: ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt4=1;
                }
                break;
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt4=2;
                }
                break;
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 134:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                alt4=4;
                }
                break;
            case RULE_INT:
                {
                alt4=5;
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
                    // InternalXMachine.g:688:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXMachine.g:688:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXMachine.g:689:3: ruleEVENTB_IDENTIFIER_KEYWORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEVENTB_IDENTIFIER_KEYWORD();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:694:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    {
                    // InternalXMachine.g:694:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    // InternalXMachine.g:695:3: ruleEVENTB_PREDICATE_SYMBOLS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEVENTB_PREDICATE_SYMBOLS();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:700:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    {
                    // InternalXMachine.g:700:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    // InternalXMachine.g:701:3: ruleEVENTB_EXPRESSION_SYMBOLS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEVENTB_EXPRESSION_SYMBOLS();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:706:2: ( RULE_ID )
                    {
                    // InternalXMachine.g:706:2: ( RULE_ID )
                    // InternalXMachine.g:707:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:712:2: ( RULE_INT )
                    {
                    // InternalXMachine.g:712:2: ( RULE_INT )
                    // InternalXMachine.g:713:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4()); 
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
    // $ANTLR end "rule__XFormula__Alternatives"


    // $ANTLR start "rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives"
    // InternalXMachine.g:722:1: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives : ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) );
    public final void rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:726:1: ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) )
            int alt5=23;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            case 16:
                {
                alt5=5;
                }
                break;
            case 17:
                {
                alt5=6;
                }
                break;
            case 18:
                {
                alt5=7;
                }
                break;
            case 19:
                {
                alt5=8;
                }
                break;
            case 20:
                {
                alt5=9;
                }
                break;
            case 21:
                {
                alt5=10;
                }
                break;
            case 22:
                {
                alt5=11;
                }
                break;
            case 23:
                {
                alt5=12;
                }
                break;
            case 24:
                {
                alt5=13;
                }
                break;
            case 25:
                {
                alt5=14;
                }
                break;
            case 26:
                {
                alt5=15;
                }
                break;
            case 27:
                {
                alt5=16;
                }
                break;
            case 28:
                {
                alt5=17;
                }
                break;
            case 29:
                {
                alt5=18;
                }
                break;
            case 30:
                {
                alt5=19;
                }
                break;
            case 31:
                {
                alt5=20;
                }
                break;
            case 32:
                {
                alt5=21;
                }
                break;
            case 33:
                {
                alt5=22;
                }
                break;
            case 34:
                {
                alt5=23;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalXMachine.g:727:2: ( 'BOOL' )
                    {
                    // InternalXMachine.g:727:2: ( 'BOOL' )
                    // InternalXMachine.g:728:3: 'BOOL'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:733:2: ( 'FALSE' )
                    {
                    // InternalXMachine.g:733:2: ( 'FALSE' )
                    // InternalXMachine.g:734:3: 'FALSE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:739:2: ( 'TRUE' )
                    {
                    // InternalXMachine.g:739:2: ( 'TRUE' )
                    // InternalXMachine.g:740:3: 'TRUE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:745:2: ( 'bool' )
                    {
                    // InternalXMachine.g:745:2: ( 'bool' )
                    // InternalXMachine.g:746:3: 'bool'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:751:2: ( 'card' )
                    {
                    // InternalXMachine.g:751:2: ( 'card' )
                    // InternalXMachine.g:752:3: 'card'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:757:2: ( 'dom' )
                    {
                    // InternalXMachine.g:757:2: ( 'dom' )
                    // InternalXMachine.g:758:3: 'dom'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:763:2: ( 'finite' )
                    {
                    // InternalXMachine.g:763:2: ( 'finite' )
                    // InternalXMachine.g:764:3: 'finite'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:769:2: ( 'id' )
                    {
                    // InternalXMachine.g:769:2: ( 'id' )
                    // InternalXMachine.g:770:3: 'id'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:775:2: ( 'inter' )
                    {
                    // InternalXMachine.g:775:2: ( 'inter' )
                    // InternalXMachine.g:776:3: 'inter'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:781:2: ( 'max' )
                    {
                    // InternalXMachine.g:781:2: ( 'max' )
                    // InternalXMachine.g:782:3: 'max'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:787:2: ( 'min' )
                    {
                    // InternalXMachine.g:787:2: ( 'min' )
                    // InternalXMachine.g:788:3: 'min'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:793:2: ( 'mod' )
                    {
                    // InternalXMachine.g:793:2: ( 'mod' )
                    // InternalXMachine.g:794:3: 'mod'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:799:2: ( 'pred' )
                    {
                    // InternalXMachine.g:799:2: ( 'pred' )
                    // InternalXMachine.g:800:3: 'pred'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:805:2: ( 'prj1' )
                    {
                    // InternalXMachine.g:805:2: ( 'prj1' )
                    // InternalXMachine.g:806:3: 'prj1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:811:2: ( 'prj2' )
                    {
                    // InternalXMachine.g:811:2: ( 'prj2' )
                    // InternalXMachine.g:812:3: 'prj2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:817:2: ( 'ran' )
                    {
                    // InternalXMachine.g:817:2: ( 'ran' )
                    // InternalXMachine.g:818:3: 'ran'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:823:2: ( 'succ' )
                    {
                    // InternalXMachine.g:823:2: ( 'succ' )
                    // InternalXMachine.g:824:3: 'succ'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:829:2: ( 'union' )
                    {
                    // InternalXMachine.g:829:2: ( 'union' )
                    // InternalXMachine.g:830:3: 'union'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:835:2: ( '\\u21151' )
                    {
                    // InternalXMachine.g:835:2: ( '\\u21151' )
                    // InternalXMachine.g:836:3: '\\u21151'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:841:2: ( '\\u2115' )
                    {
                    // InternalXMachine.g:841:2: ( '\\u2115' )
                    // InternalXMachine.g:842:3: '\\u2115'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:847:2: ( '\\u21191' )
                    {
                    // InternalXMachine.g:847:2: ( '\\u21191' )
                    // InternalXMachine.g:848:3: '\\u21191'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:853:2: ( '\\u2119' )
                    {
                    // InternalXMachine.g:853:2: ( '\\u2119' )
                    // InternalXMachine.g:854:3: '\\u2119'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:859:2: ( '\\u2124' )
                    {
                    // InternalXMachine.g:859:2: ( '\\u2124' )
                    // InternalXMachine.g:860:3: '\\u2124'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_22()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_22()); 
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
    // $ANTLR end "rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives"


    // $ANTLR start "rule__EVENTB_PREDICATE_SYMBOLS__Alternatives"
    // InternalXMachine.g:869:1: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives : ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) );
    public final void rule__EVENTB_PREDICATE_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:873:1: ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) )
            int alt6=31;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            case 37:
                {
                alt6=3;
                }
                break;
            case 38:
                {
                alt6=4;
                }
                break;
            case 39:
                {
                alt6=5;
                }
                break;
            case 40:
                {
                alt6=6;
                }
                break;
            case 41:
                {
                alt6=7;
                }
                break;
            case 42:
                {
                alt6=8;
                }
                break;
            case 43:
                {
                alt6=9;
                }
                break;
            case 44:
                {
                alt6=10;
                }
                break;
            case 45:
                {
                alt6=11;
                }
                break;
            case 46:
                {
                alt6=12;
                }
                break;
            case 47:
                {
                alt6=13;
                }
                break;
            case 48:
                {
                alt6=14;
                }
                break;
            case 49:
                {
                alt6=15;
                }
                break;
            case 50:
                {
                alt6=16;
                }
                break;
            case 51:
                {
                alt6=17;
                }
                break;
            case 52:
                {
                alt6=18;
                }
                break;
            case 53:
                {
                alt6=19;
                }
                break;
            case 54:
                {
                alt6=20;
                }
                break;
            case 55:
                {
                alt6=21;
                }
                break;
            case 56:
                {
                alt6=22;
                }
                break;
            case 57:
                {
                alt6=23;
                }
                break;
            case 58:
                {
                alt6=24;
                }
                break;
            case 59:
                {
                alt6=25;
                }
                break;
            case 60:
                {
                alt6=26;
                }
                break;
            case 61:
                {
                alt6=27;
                }
                break;
            case 62:
                {
                alt6=28;
                }
                break;
            case 63:
                {
                alt6=29;
                }
                break;
            case 64:
                {
                alt6=30;
                }
                break;
            case 65:
                {
                alt6=31;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:874:2: ( '(' )
                    {
                    // InternalXMachine.g:874:2: ( '(' )
                    // InternalXMachine.g:875:3: '('
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 
                    }
                    match(input,35,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:880:2: ( ')' )
                    {
                    // InternalXMachine.g:880:2: ( ')' )
                    // InternalXMachine.g:881:3: ')'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:886:2: ( '\\u21D4' )
                    {
                    // InternalXMachine.g:886:2: ( '\\u21D4' )
                    // InternalXMachine.g:887:3: '\\u21D4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 
                    }
                    match(input,37,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:892:2: ( '\\u21D2' )
                    {
                    // InternalXMachine.g:892:2: ( '\\u21D2' )
                    // InternalXMachine.g:893:3: '\\u21D2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 
                    }
                    match(input,38,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:898:2: ( '\\u2227' )
                    {
                    // InternalXMachine.g:898:2: ( '\\u2227' )
                    // InternalXMachine.g:899:3: '\\u2227'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 
                    }
                    match(input,39,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:904:2: ( '&' )
                    {
                    // InternalXMachine.g:904:2: ( '&' )
                    // InternalXMachine.g:905:3: '&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 
                    }
                    match(input,40,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:910:2: ( '\\u2228' )
                    {
                    // InternalXMachine.g:910:2: ( '\\u2228' )
                    // InternalXMachine.g:911:3: '\\u2228'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 
                    }
                    match(input,41,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:916:2: ( '\\u00AC' )
                    {
                    // InternalXMachine.g:916:2: ( '\\u00AC' )
                    // InternalXMachine.g:917:3: '\\u00AC'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 
                    }
                    match(input,42,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:922:2: ( '\\u22A4' )
                    {
                    // InternalXMachine.g:922:2: ( '\\u22A4' )
                    // InternalXMachine.g:923:3: '\\u22A4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 
                    }
                    match(input,43,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:928:2: ( '\\u22A5' )
                    {
                    // InternalXMachine.g:928:2: ( '\\u22A5' )
                    // InternalXMachine.g:929:3: '\\u22A5'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 
                    }
                    match(input,44,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:934:2: ( '\\u2200' )
                    {
                    // InternalXMachine.g:934:2: ( '\\u2200' )
                    // InternalXMachine.g:935:3: '\\u2200'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 
                    }
                    match(input,45,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:940:2: ( '!' )
                    {
                    // InternalXMachine.g:940:2: ( '!' )
                    // InternalXMachine.g:941:3: '!'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 
                    }
                    match(input,46,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:946:2: ( '\\u2203' )
                    {
                    // InternalXMachine.g:946:2: ( '\\u2203' )
                    // InternalXMachine.g:947:3: '\\u2203'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 
                    }
                    match(input,47,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:952:2: ( '#' )
                    {
                    // InternalXMachine.g:952:2: ( '#' )
                    // InternalXMachine.g:953:3: '#'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 
                    }
                    match(input,48,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:958:2: ( ',' )
                    {
                    // InternalXMachine.g:958:2: ( ',' )
                    // InternalXMachine.g:959:3: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 
                    }
                    match(input,49,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:964:2: ( '\\u00B7' )
                    {
                    // InternalXMachine.g:964:2: ( '\\u00B7' )
                    // InternalXMachine.g:965:3: '\\u00B7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 
                    }
                    match(input,50,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:970:2: ( '.' )
                    {
                    // InternalXMachine.g:970:2: ( '.' )
                    // InternalXMachine.g:971:3: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 
                    }
                    match(input,51,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:976:2: ( '=' )
                    {
                    // InternalXMachine.g:976:2: ( '=' )
                    // InternalXMachine.g:977:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 
                    }
                    match(input,52,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:982:2: ( '\\u2260' )
                    {
                    // InternalXMachine.g:982:2: ( '\\u2260' )
                    // InternalXMachine.g:983:3: '\\u2260'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 
                    }
                    match(input,53,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:988:2: ( '\\u2264' )
                    {
                    // InternalXMachine.g:988:2: ( '\\u2264' )
                    // InternalXMachine.g:989:3: '\\u2264'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 
                    }
                    match(input,54,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:994:2: ( '<' )
                    {
                    // InternalXMachine.g:994:2: ( '<' )
                    // InternalXMachine.g:995:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 
                    }
                    match(input,55,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1000:2: ( '\\u2265' )
                    {
                    // InternalXMachine.g:1000:2: ( '\\u2265' )
                    // InternalXMachine.g:1001:3: '\\u2265'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 
                    }
                    match(input,56,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1006:2: ( '>' )
                    {
                    // InternalXMachine.g:1006:2: ( '>' )
                    // InternalXMachine.g:1007:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 
                    }
                    match(input,57,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalXMachine.g:1012:2: ( '\\u2208' )
                    {
                    // InternalXMachine.g:1012:2: ( '\\u2208' )
                    // InternalXMachine.g:1013:3: '\\u2208'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 
                    }
                    match(input,58,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalXMachine.g:1018:2: ( ':' )
                    {
                    // InternalXMachine.g:1018:2: ( ':' )
                    // InternalXMachine.g:1019:3: ':'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 
                    }
                    match(input,59,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalXMachine.g:1024:2: ( '\\u2209' )
                    {
                    // InternalXMachine.g:1024:2: ( '\\u2209' )
                    // InternalXMachine.g:1025:3: '\\u2209'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 
                    }
                    match(input,60,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalXMachine.g:1030:2: ( '\\u2282' )
                    {
                    // InternalXMachine.g:1030:2: ( '\\u2282' )
                    // InternalXMachine.g:1031:3: '\\u2282'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 
                    }
                    match(input,61,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalXMachine.g:1036:2: ( '\\u2284' )
                    {
                    // InternalXMachine.g:1036:2: ( '\\u2284' )
                    // InternalXMachine.g:1037:3: '\\u2284'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 
                    }
                    match(input,62,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // InternalXMachine.g:1042:2: ( '\\u2286' )
                    {
                    // InternalXMachine.g:1042:2: ( '\\u2286' )
                    // InternalXMachine.g:1043:3: '\\u2286'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 
                    }
                    match(input,63,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // InternalXMachine.g:1048:2: ( '\\u2288' )
                    {
                    // InternalXMachine.g:1048:2: ( '\\u2288' )
                    // InternalXMachine.g:1049:3: '\\u2288'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 
                    }
                    match(input,64,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // InternalXMachine.g:1054:2: ( 'partition' )
                    {
                    // InternalXMachine.g:1054:2: ( 'partition' )
                    // InternalXMachine.g:1055:3: 'partition'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_30()); 
                    }
                    match(input,65,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_30()); 
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
    // $ANTLR end "rule__EVENTB_PREDICATE_SYMBOLS__Alternatives"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives"
    // InternalXMachine.g:1064:1: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives : ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) );
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1068:1: ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) )
            int alt7=45;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt7=1;
                }
                break;
            case 67:
                {
                alt7=2;
                }
                break;
            case 68:
                {
                alt7=3;
                }
                break;
            case 69:
                {
                alt7=4;
                }
                break;
            case 70:
                {
                alt7=5;
                }
                break;
            case 71:
                {
                alt7=6;
                }
                break;
            case 72:
                {
                alt7=7;
                }
                break;
            case 73:
                {
                alt7=8;
                }
                break;
            case 74:
                {
                alt7=9;
                }
                break;
            case 75:
                {
                alt7=10;
                }
                break;
            case 76:
                {
                alt7=11;
                }
                break;
            case 77:
                {
                alt7=12;
                }
                break;
            case 78:
                {
                alt7=13;
                }
                break;
            case 79:
                {
                alt7=14;
                }
                break;
            case 80:
                {
                alt7=15;
                }
                break;
            case 81:
                {
                alt7=16;
                }
                break;
            case 82:
                {
                alt7=17;
                }
                break;
            case 83:
                {
                alt7=18;
                }
                break;
            case 84:
                {
                alt7=19;
                }
                break;
            case 85:
                {
                alt7=20;
                }
                break;
            case 86:
                {
                alt7=21;
                }
                break;
            case 87:
                {
                alt7=22;
                }
                break;
            case 88:
                {
                alt7=23;
                }
                break;
            case 89:
                {
                alt7=24;
                }
                break;
            case 90:
                {
                alt7=25;
                }
                break;
            case 91:
                {
                alt7=26;
                }
                break;
            case 92:
                {
                alt7=27;
                }
                break;
            case 93:
                {
                alt7=28;
                }
                break;
            case 94:
                {
                alt7=29;
                }
                break;
            case 95:
                {
                alt7=30;
                }
                break;
            case 96:
                {
                alt7=31;
                }
                break;
            case 97:
                {
                alt7=32;
                }
                break;
            case 134:
                {
                alt7=33;
                }
                break;
            case 98:
                {
                alt7=34;
                }
                break;
            case 99:
                {
                alt7=35;
                }
                break;
            case 100:
                {
                alt7=36;
                }
                break;
            case 101:
                {
                alt7=37;
                }
                break;
            case 102:
                {
                alt7=38;
                }
                break;
            case 103:
                {
                alt7=39;
                }
                break;
            case 104:
                {
                alt7=40;
                }
                break;
            case 105:
                {
                alt7=41;
                }
                break;
            case 106:
                {
                alt7=42;
                }
                break;
            case 107:
                {
                alt7=43;
                }
                break;
            case 108:
                {
                alt7=44;
                }
                break;
            case 109:
                {
                alt7=45;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalXMachine.g:1069:2: ( '\\u2194' )
                    {
                    // InternalXMachine.g:1069:2: ( '\\u2194' )
                    // InternalXMachine.g:1070:3: '\\u2194'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 
                    }
                    match(input,66,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1075:2: ( '\\uE100' )
                    {
                    // InternalXMachine.g:1075:2: ( '\\uE100' )
                    // InternalXMachine.g:1076:3: '\\uE100'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 
                    }
                    match(input,67,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1081:2: ( '\\uE101' )
                    {
                    // InternalXMachine.g:1081:2: ( '\\uE101' )
                    // InternalXMachine.g:1082:3: '\\uE101'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 
                    }
                    match(input,68,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1087:2: ( '\\uE102' )
                    {
                    // InternalXMachine.g:1087:2: ( '\\uE102' )
                    // InternalXMachine.g:1088:3: '\\uE102'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 
                    }
                    match(input,69,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1093:2: ( '\\u21F8' )
                    {
                    // InternalXMachine.g:1093:2: ( '\\u21F8' )
                    // InternalXMachine.g:1094:3: '\\u21F8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    }
                    match(input,70,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1099:2: ( '\\u2192' )
                    {
                    // InternalXMachine.g:1099:2: ( '\\u2192' )
                    // InternalXMachine.g:1100:3: '\\u2192'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 
                    }
                    match(input,71,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1105:2: ( '\\u2914' )
                    {
                    // InternalXMachine.g:1105:2: ( '\\u2914' )
                    // InternalXMachine.g:1106:3: '\\u2914'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    }
                    match(input,72,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1111:2: ( '\\u21A3' )
                    {
                    // InternalXMachine.g:1111:2: ( '\\u21A3' )
                    // InternalXMachine.g:1112:3: '\\u21A3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 
                    }
                    match(input,73,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:1117:2: ( '\\u2900' )
                    {
                    // InternalXMachine.g:1117:2: ( '\\u2900' )
                    // InternalXMachine.g:1118:3: '\\u2900'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    }
                    match(input,74,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:1123:2: ( '\\u21A0' )
                    {
                    // InternalXMachine.g:1123:2: ( '\\u21A0' )
                    // InternalXMachine.g:1124:3: '\\u21A0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    }
                    match(input,75,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:1129:2: ( '\\u2916' )
                    {
                    // InternalXMachine.g:1129:2: ( '\\u2916' )
                    // InternalXMachine.g:1130:3: '\\u2916'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    }
                    match(input,76,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:1135:2: ( '{' )
                    {
                    // InternalXMachine.g:1135:2: ( '{' )
                    // InternalXMachine.g:1136:3: '{'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 
                    }
                    match(input,77,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:1141:2: ( '}' )
                    {
                    // InternalXMachine.g:1141:2: ( '}' )
                    // InternalXMachine.g:1142:3: '}'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 
                    }
                    match(input,78,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:1147:2: ( '\\u21A6' )
                    {
                    // InternalXMachine.g:1147:2: ( '\\u21A6' )
                    // InternalXMachine.g:1148:3: '\\u21A6'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 
                    }
                    match(input,79,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:1153:2: ( '\\u2205' )
                    {
                    // InternalXMachine.g:1153:2: ( '\\u2205' )
                    // InternalXMachine.g:1154:3: '\\u2205'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 
                    }
                    match(input,80,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:1159:2: ( '\\u2229' )
                    {
                    // InternalXMachine.g:1159:2: ( '\\u2229' )
                    // InternalXMachine.g:1160:3: '\\u2229'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 
                    }
                    match(input,81,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:1165:2: ( '\\u222A' )
                    {
                    // InternalXMachine.g:1165:2: ( '\\u222A' )
                    // InternalXMachine.g:1166:3: '\\u222A'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 
                    }
                    match(input,82,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:1171:2: ( '\\u2216' )
                    {
                    // InternalXMachine.g:1171:2: ( '\\u2216' )
                    // InternalXMachine.g:1172:3: '\\u2216'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 
                    }
                    match(input,83,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1177:2: ( '\\u00D7' )
                    {
                    // InternalXMachine.g:1177:2: ( '\\u00D7' )
                    // InternalXMachine.g:1178:3: '\\u00D7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 
                    }
                    match(input,84,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1183:2: ( '[' )
                    {
                    // InternalXMachine.g:1183:2: ( '[' )
                    // InternalXMachine.g:1184:3: '['
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 
                    }
                    match(input,85,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1189:2: ( ']' )
                    {
                    // InternalXMachine.g:1189:2: ( ']' )
                    // InternalXMachine.g:1190:3: ']'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 
                    }
                    match(input,86,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1195:2: ( '\\uE103' )
                    {
                    // InternalXMachine.g:1195:2: ( '\\uE103' )
                    // InternalXMachine.g:1196:3: '\\uE103'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 
                    }
                    match(input,87,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1201:2: ( '\\u2218' )
                    {
                    // InternalXMachine.g:1201:2: ( '\\u2218' )
                    // InternalXMachine.g:1202:3: '\\u2218'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 
                    }
                    match(input,88,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalXMachine.g:1207:2: ( ';' )
                    {
                    // InternalXMachine.g:1207:2: ( ';' )
                    // InternalXMachine.g:1208:3: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 
                    }
                    match(input,89,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalXMachine.g:1213:2: ( '\\u2297' )
                    {
                    // InternalXMachine.g:1213:2: ( '\\u2297' )
                    // InternalXMachine.g:1214:3: '\\u2297'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 
                    }
                    match(input,90,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalXMachine.g:1219:2: ( '\\u2225' )
                    {
                    // InternalXMachine.g:1219:2: ( '\\u2225' )
                    // InternalXMachine.g:1220:3: '\\u2225'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 
                    }
                    match(input,91,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalXMachine.g:1225:2: ( '\\u223C' )
                    {
                    // InternalXMachine.g:1225:2: ( '\\u223C' )
                    // InternalXMachine.g:1226:3: '\\u223C'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 
                    }
                    match(input,92,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalXMachine.g:1231:2: ( '\\u25C1' )
                    {
                    // InternalXMachine.g:1231:2: ( '\\u25C1' )
                    // InternalXMachine.g:1232:3: '\\u25C1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 
                    }
                    match(input,93,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // InternalXMachine.g:1237:2: ( '\\u2A64' )
                    {
                    // InternalXMachine.g:1237:2: ( '\\u2A64' )
                    // InternalXMachine.g:1238:3: '\\u2A64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 
                    }
                    match(input,94,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // InternalXMachine.g:1243:2: ( '\\u25B7' )
                    {
                    // InternalXMachine.g:1243:2: ( '\\u25B7' )
                    // InternalXMachine.g:1244:3: '\\u25B7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 
                    }
                    match(input,95,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // InternalXMachine.g:1249:2: ( '\\u2A65' )
                    {
                    // InternalXMachine.g:1249:2: ( '\\u2A65' )
                    // InternalXMachine.g:1250:3: '\\u2A65'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 
                    }
                    match(input,96,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 
                    }

                    }


                    }
                    break;
                case 32 :
                    // InternalXMachine.g:1255:2: ( '\\u03BB' )
                    {
                    // InternalXMachine.g:1255:2: ( '\\u03BB' )
                    // InternalXMachine.g:1256:3: '\\u03BB'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 
                    }
                    match(input,97,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 
                    }

                    }


                    }
                    break;
                case 33 :
                    // InternalXMachine.g:1261:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    {
                    // InternalXMachine.g:1261:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    // InternalXMachine.g:1262:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32()); 
                    }
                    // InternalXMachine.g:1263:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    // InternalXMachine.g:1263:4: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32()); 
                    }

                    }


                    }
                    break;
                case 34 :
                    // InternalXMachine.g:1267:2: ( '\\u22C3' )
                    {
                    // InternalXMachine.g:1267:2: ( '\\u22C3' )
                    // InternalXMachine.g:1268:3: '\\u22C3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 
                    }
                    match(input,98,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 
                    }

                    }


                    }
                    break;
                case 35 :
                    // InternalXMachine.g:1273:2: ( '\\u2223' )
                    {
                    // InternalXMachine.g:1273:2: ( '\\u2223' )
                    // InternalXMachine.g:1274:3: '\\u2223'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 
                    }
                    match(input,99,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 
                    }

                    }


                    }
                    break;
                case 36 :
                    // InternalXMachine.g:1279:2: ( '\\u2025' )
                    {
                    // InternalXMachine.g:1279:2: ( '\\u2025' )
                    // InternalXMachine.g:1280:3: '\\u2025'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 
                    }
                    match(input,100,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 
                    }

                    }


                    }
                    break;
                case 37 :
                    // InternalXMachine.g:1285:2: ( '+' )
                    {
                    // InternalXMachine.g:1285:2: ( '+' )
                    // InternalXMachine.g:1286:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 
                    }
                    match(input,101,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 
                    }

                    }


                    }
                    break;
                case 38 :
                    // InternalXMachine.g:1291:2: ( '\\u2212' )
                    {
                    // InternalXMachine.g:1291:2: ( '\\u2212' )
                    // InternalXMachine.g:1292:3: '\\u2212'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 
                    }
                    match(input,102,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 
                    }

                    }


                    }
                    break;
                case 39 :
                    // InternalXMachine.g:1297:2: ( '-' )
                    {
                    // InternalXMachine.g:1297:2: ( '-' )
                    // InternalXMachine.g:1298:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 
                    }
                    match(input,103,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 
                    }

                    }


                    }
                    break;
                case 40 :
                    // InternalXMachine.g:1303:2: ( '\\u2217' )
                    {
                    // InternalXMachine.g:1303:2: ( '\\u2217' )
                    // InternalXMachine.g:1304:3: '\\u2217'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 
                    }
                    match(input,104,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 
                    }

                    }


                    }
                    break;
                case 41 :
                    // InternalXMachine.g:1309:2: ( '*' )
                    {
                    // InternalXMachine.g:1309:2: ( '*' )
                    // InternalXMachine.g:1310:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 
                    }
                    match(input,105,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 
                    }

                    }


                    }
                    break;
                case 42 :
                    // InternalXMachine.g:1315:2: ( '\\u00F7' )
                    {
                    // InternalXMachine.g:1315:2: ( '\\u00F7' )
                    // InternalXMachine.g:1316:3: '\\u00F7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 
                    }
                    match(input,106,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 
                    }

                    }


                    }
                    break;
                case 43 :
                    // InternalXMachine.g:1321:2: ( '/' )
                    {
                    // InternalXMachine.g:1321:2: ( '/' )
                    // InternalXMachine.g:1322:3: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 
                    }
                    match(input,107,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 
                    }

                    }


                    }
                    break;
                case 44 :
                    // InternalXMachine.g:1327:2: ( '^' )
                    {
                    // InternalXMachine.g:1327:2: ( '^' )
                    // InternalXMachine.g:1328:3: '^'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 
                    }
                    match(input,108,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 
                    }

                    }


                    }
                    break;
                case 45 :
                    // InternalXMachine.g:1333:2: ( '\\\\' )
                    {
                    // InternalXMachine.g:1333:2: ( '\\\\' )
                    // InternalXMachine.g:1334:3: '\\\\'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_44()); 
                    }
                    match(input,109,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_44()); 
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
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives"


    // $ANTLR start "rule__XDirection__Alternatives"
    // InternalXMachine.g:1343:1: rule__XDirection__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );
    public final void rule__XDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1347:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==110) ) {
                alt8=1;
            }
            else if ( (LA8_0==111) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:1348:2: ( ( 'in' ) )
                    {
                    // InternalXMachine.g:1348:2: ( ( 'in' ) )
                    // InternalXMachine.g:1349:3: ( 'in' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXDirectionAccess().getInEnumLiteralDeclaration_0()); 
                    }
                    // InternalXMachine.g:1350:3: ( 'in' )
                    // InternalXMachine.g:1350:4: 'in'
                    {
                    match(input,110,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXDirectionAccess().getInEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1354:2: ( ( 'out' ) )
                    {
                    // InternalXMachine.g:1354:2: ( ( 'out' ) )
                    // InternalXMachine.g:1355:3: ( 'out' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXDirectionAccess().getOutEnumLiteralDeclaration_1()); 
                    }
                    // InternalXMachine.g:1356:3: ( 'out' )
                    // InternalXMachine.g:1356:4: 'out'
                    {
                    match(input,111,FOLLOW_2); if (state.failed) return ;

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
    // InternalXMachine.g:1364:1: rule__XConvergence__Alternatives : ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) );
    public final void rule__XConvergence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1368:1: ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt9=1;
                }
                break;
            case 113:
                {
                alt9=2;
                }
                break;
            case 114:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalXMachine.g:1369:2: ( ( 'ordinary' ) )
                    {
                    // InternalXMachine.g:1369:2: ( ( 'ordinary' ) )
                    // InternalXMachine.g:1370:3: ( 'ordinary' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    }
                    // InternalXMachine.g:1371:3: ( 'ordinary' )
                    // InternalXMachine.g:1371:4: 'ordinary'
                    {
                    match(input,112,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1375:2: ( ( 'convergent' ) )
                    {
                    // InternalXMachine.g:1375:2: ( ( 'convergent' ) )
                    // InternalXMachine.g:1376:3: ( 'convergent' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    }
                    // InternalXMachine.g:1377:3: ( 'convergent' )
                    // InternalXMachine.g:1377:4: 'convergent'
                    {
                    match(input,113,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1381:2: ( ( 'anticipated' ) )
                    {
                    // InternalXMachine.g:1381:2: ( ( 'anticipated' ) )
                    // InternalXMachine.g:1382:3: ( 'anticipated' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    }
                    // InternalXMachine.g:1383:3: ( 'anticipated' )
                    // InternalXMachine.g:1383:4: 'anticipated'
                    {
                    match(input,114,FOLLOW_2); if (state.failed) return ;

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
    // InternalXMachine.g:1391:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1395:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalXMachine.g:1396:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXMachine.g:1403:1: rule__Machine__Group__0__Impl : ( () ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1407:1: ( ( () ) )
            // InternalXMachine.g:1408:1: ( () )
            {
            // InternalXMachine.g:1408:1: ( () )
            // InternalXMachine.g:1409:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineAction_0()); 
            }
            // InternalXMachine.g:1410:2: ()
            // InternalXMachine.g:1410:3: 
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
    // InternalXMachine.g:1418:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1422:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalXMachine.g:1423:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:1430:1: rule__Machine__Group__1__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1434:1: ( ( 'machine' ) )
            // InternalXMachine.g:1435:1: ( 'machine' )
            {
            // InternalXMachine.g:1435:1: ( 'machine' )
            // InternalXMachine.g:1436:2: 'machine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineKeyword_1()); 
            }
            match(input,115,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1445:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1449:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalXMachine.g:1450:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalXMachine.g:1457:1: rule__Machine__Group__2__Impl : ( ( rule__Machine__NameAssignment_2 ) ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1461:1: ( ( ( rule__Machine__NameAssignment_2 ) ) )
            // InternalXMachine.g:1462:1: ( ( rule__Machine__NameAssignment_2 ) )
            {
            // InternalXMachine.g:1462:1: ( ( rule__Machine__NameAssignment_2 ) )
            // InternalXMachine.g:1463:2: ( rule__Machine__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:1464:2: ( rule__Machine__NameAssignment_2 )
            // InternalXMachine.g:1464:3: rule__Machine__NameAssignment_2
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
    // InternalXMachine.g:1472:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1476:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // InternalXMachine.g:1477:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalXMachine.g:1484:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__UnorderedGroup_3 ) ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1488:1: ( ( ( rule__Machine__UnorderedGroup_3 ) ) )
            // InternalXMachine.g:1489:1: ( ( rule__Machine__UnorderedGroup_3 ) )
            {
            // InternalXMachine.g:1489:1: ( ( rule__Machine__UnorderedGroup_3 ) )
            // InternalXMachine.g:1490:2: ( rule__Machine__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getUnorderedGroup_3()); 
            }
            // InternalXMachine.g:1491:2: ( rule__Machine__UnorderedGroup_3 )
            // InternalXMachine.g:1491:3: rule__Machine__UnorderedGroup_3
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
    // InternalXMachine.g:1499:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1503:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // InternalXMachine.g:1504:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalXMachine.g:1511:1: rule__Machine__Group__4__Impl : ( ( rule__Machine__Group_4__0 )? ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1515:1: ( ( ( rule__Machine__Group_4__0 )? ) )
            // InternalXMachine.g:1516:1: ( ( rule__Machine__Group_4__0 )? )
            {
            // InternalXMachine.g:1516:1: ( ( rule__Machine__Group_4__0 )? )
            // InternalXMachine.g:1517:2: ( rule__Machine__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_4()); 
            }
            // InternalXMachine.g:1518:2: ( rule__Machine__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==119) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXMachine.g:1518:3: rule__Machine__Group_4__0
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
    // InternalXMachine.g:1526:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1530:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // InternalXMachine.g:1531:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalXMachine.g:1538:1: rule__Machine__Group__5__Impl : ( ( rule__Machine__Group_5__0 )? ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1542:1: ( ( ( rule__Machine__Group_5__0 )? ) )
            // InternalXMachine.g:1543:1: ( ( rule__Machine__Group_5__0 )? )
            {
            // InternalXMachine.g:1543:1: ( ( rule__Machine__Group_5__0 )? )
            // InternalXMachine.g:1544:2: ( rule__Machine__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_5()); 
            }
            // InternalXMachine.g:1545:2: ( rule__Machine__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==120) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:1545:3: rule__Machine__Group_5__0
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
    // InternalXMachine.g:1553:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl rule__Machine__Group__7 ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1557:1: ( rule__Machine__Group__6__Impl rule__Machine__Group__7 )
            // InternalXMachine.g:1558:2: rule__Machine__Group__6__Impl rule__Machine__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalXMachine.g:1565:1: rule__Machine__Group__6__Impl : ( ( rule__Machine__Group_6__0 )? ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1569:1: ( ( ( rule__Machine__Group_6__0 )? ) )
            // InternalXMachine.g:1570:1: ( ( rule__Machine__Group_6__0 )? )
            {
            // InternalXMachine.g:1570:1: ( ( rule__Machine__Group_6__0 )? )
            // InternalXMachine.g:1571:2: ( rule__Machine__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_6()); 
            }
            // InternalXMachine.g:1572:2: ( rule__Machine__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==121) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXMachine.g:1572:3: rule__Machine__Group_6__0
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
    // InternalXMachine.g:1580:1: rule__Machine__Group__7 : rule__Machine__Group__7__Impl rule__Machine__Group__8 ;
    public final void rule__Machine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1584:1: ( rule__Machine__Group__7__Impl rule__Machine__Group__8 )
            // InternalXMachine.g:1585:2: rule__Machine__Group__7__Impl rule__Machine__Group__8
            {
            pushFollow(FOLLOW_7);
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
    // InternalXMachine.g:1592:1: rule__Machine__Group__7__Impl : ( ( rule__Machine__Group_7__0 )? ) ;
    public final void rule__Machine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1596:1: ( ( ( rule__Machine__Group_7__0 )? ) )
            // InternalXMachine.g:1597:1: ( ( rule__Machine__Group_7__0 )? )
            {
            // InternalXMachine.g:1597:1: ( ( rule__Machine__Group_7__0 )? )
            // InternalXMachine.g:1598:2: ( rule__Machine__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_7()); 
            }
            // InternalXMachine.g:1599:2: ( rule__Machine__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==122) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:1599:3: rule__Machine__Group_7__0
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
    // InternalXMachine.g:1607:1: rule__Machine__Group__8 : rule__Machine__Group__8__Impl rule__Machine__Group__9 ;
    public final void rule__Machine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1611:1: ( rule__Machine__Group__8__Impl rule__Machine__Group__9 )
            // InternalXMachine.g:1612:2: rule__Machine__Group__8__Impl rule__Machine__Group__9
            {
            pushFollow(FOLLOW_7);
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
    // InternalXMachine.g:1619:1: rule__Machine__Group__8__Impl : ( ( rule__Machine__ExtensionsAssignment_8 )* ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1623:1: ( ( ( rule__Machine__ExtensionsAssignment_8 )* ) )
            // InternalXMachine.g:1624:1: ( ( rule__Machine__ExtensionsAssignment_8 )* )
            {
            // InternalXMachine.g:1624:1: ( ( rule__Machine__ExtensionsAssignment_8 )* )
            // InternalXMachine.g:1625:2: ( rule__Machine__ExtensionsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getExtensionsAssignment_8()); 
            }
            // InternalXMachine.g:1626:2: ( rule__Machine__ExtensionsAssignment_8 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==126) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXMachine.g:1626:3: rule__Machine__ExtensionsAssignment_8
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__ExtensionsAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalXMachine.g:1634:1: rule__Machine__Group__9 : rule__Machine__Group__9__Impl ;
    public final void rule__Machine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1638:1: ( rule__Machine__Group__9__Impl )
            // InternalXMachine.g:1639:2: rule__Machine__Group__9__Impl
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
    // InternalXMachine.g:1645:1: rule__Machine__Group__9__Impl : ( 'end' ) ;
    public final void rule__Machine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1649:1: ( ( 'end' ) )
            // InternalXMachine.g:1650:1: ( 'end' )
            {
            // InternalXMachine.g:1650:1: ( 'end' )
            // InternalXMachine.g:1651:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEndKeyword_9()); 
            }
            match(input,116,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1661:1: rule__Machine__Group_3_0__0 : rule__Machine__Group_3_0__0__Impl rule__Machine__Group_3_0__1 ;
    public final void rule__Machine__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1665:1: ( rule__Machine__Group_3_0__0__Impl rule__Machine__Group_3_0__1 )
            // InternalXMachine.g:1666:2: rule__Machine__Group_3_0__0__Impl rule__Machine__Group_3_0__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:1673:1: rule__Machine__Group_3_0__0__Impl : ( 'refines' ) ;
    public final void rule__Machine__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1677:1: ( ( 'refines' ) )
            // InternalXMachine.g:1678:1: ( 'refines' )
            {
            // InternalXMachine.g:1678:1: ( 'refines' )
            // InternalXMachine.g:1679:2: 'refines'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesKeyword_3_0_0()); 
            }
            match(input,117,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1688:1: rule__Machine__Group_3_0__1 : rule__Machine__Group_3_0__1__Impl ;
    public final void rule__Machine__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1692:1: ( rule__Machine__Group_3_0__1__Impl )
            // InternalXMachine.g:1693:2: rule__Machine__Group_3_0__1__Impl
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
    // InternalXMachine.g:1699:1: rule__Machine__Group_3_0__1__Impl : ( ( rule__Machine__RefinesAssignment_3_0_1 ) ) ;
    public final void rule__Machine__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1703:1: ( ( ( rule__Machine__RefinesAssignment_3_0_1 ) ) )
            // InternalXMachine.g:1704:1: ( ( rule__Machine__RefinesAssignment_3_0_1 ) )
            {
            // InternalXMachine.g:1704:1: ( ( rule__Machine__RefinesAssignment_3_0_1 ) )
            // InternalXMachine.g:1705:2: ( rule__Machine__RefinesAssignment_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesAssignment_3_0_1()); 
            }
            // InternalXMachine.g:1706:2: ( rule__Machine__RefinesAssignment_3_0_1 )
            // InternalXMachine.g:1706:3: rule__Machine__RefinesAssignment_3_0_1
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
    // InternalXMachine.g:1715:1: rule__Machine__Group_3_1__0 : rule__Machine__Group_3_1__0__Impl rule__Machine__Group_3_1__1 ;
    public final void rule__Machine__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1719:1: ( rule__Machine__Group_3_1__0__Impl rule__Machine__Group_3_1__1 )
            // InternalXMachine.g:1720:2: rule__Machine__Group_3_1__0__Impl rule__Machine__Group_3_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:1727:1: rule__Machine__Group_3_1__0__Impl : ( 'sees' ) ;
    public final void rule__Machine__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1731:1: ( ( 'sees' ) )
            // InternalXMachine.g:1732:1: ( 'sees' )
            {
            // InternalXMachine.g:1732:1: ( 'sees' )
            // InternalXMachine.g:1733:2: 'sees'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesKeyword_3_1_0()); 
            }
            match(input,118,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1742:1: rule__Machine__Group_3_1__1 : rule__Machine__Group_3_1__1__Impl ;
    public final void rule__Machine__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1746:1: ( rule__Machine__Group_3_1__1__Impl )
            // InternalXMachine.g:1747:2: rule__Machine__Group_3_1__1__Impl
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
    // InternalXMachine.g:1753:1: rule__Machine__Group_3_1__1__Impl : ( ( ( rule__Machine__SeesAssignment_3_1_1 ) ) ( ( rule__Machine__SeesAssignment_3_1_1 )* ) ) ;
    public final void rule__Machine__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1757:1: ( ( ( ( rule__Machine__SeesAssignment_3_1_1 ) ) ( ( rule__Machine__SeesAssignment_3_1_1 )* ) ) )
            // InternalXMachine.g:1758:1: ( ( ( rule__Machine__SeesAssignment_3_1_1 ) ) ( ( rule__Machine__SeesAssignment_3_1_1 )* ) )
            {
            // InternalXMachine.g:1758:1: ( ( ( rule__Machine__SeesAssignment_3_1_1 ) ) ( ( rule__Machine__SeesAssignment_3_1_1 )* ) )
            // InternalXMachine.g:1759:2: ( ( rule__Machine__SeesAssignment_3_1_1 ) ) ( ( rule__Machine__SeesAssignment_3_1_1 )* )
            {
            // InternalXMachine.g:1759:2: ( ( rule__Machine__SeesAssignment_3_1_1 ) )
            // InternalXMachine.g:1760:3: ( rule__Machine__SeesAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesAssignment_3_1_1()); 
            }
            // InternalXMachine.g:1761:3: ( rule__Machine__SeesAssignment_3_1_1 )
            // InternalXMachine.g:1761:4: rule__Machine__SeesAssignment_3_1_1
            {
            pushFollow(FOLLOW_9);
            rule__Machine__SeesAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getSeesAssignment_3_1_1()); 
            }

            }

            // InternalXMachine.g:1764:2: ( ( rule__Machine__SeesAssignment_3_1_1 )* )
            // InternalXMachine.g:1765:3: ( rule__Machine__SeesAssignment_3_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesAssignment_3_1_1()); 
            }
            // InternalXMachine.g:1766:3: ( rule__Machine__SeesAssignment_3_1_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalXMachine.g:1766:4: rule__Machine__SeesAssignment_3_1_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Machine__SeesAssignment_3_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalXMachine.g:1776:1: rule__Machine__Group_4__0 : rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1 ;
    public final void rule__Machine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1780:1: ( rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1 )
            // InternalXMachine.g:1781:2: rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:1788:1: rule__Machine__Group_4__0__Impl : ( 'variables' ) ;
    public final void rule__Machine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1792:1: ( ( 'variables' ) )
            // InternalXMachine.g:1793:1: ( 'variables' )
            {
            // InternalXMachine.g:1793:1: ( 'variables' )
            // InternalXMachine.g:1794:2: 'variables'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesKeyword_4_0()); 
            }
            match(input,119,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1803:1: rule__Machine__Group_4__1 : rule__Machine__Group_4__1__Impl ;
    public final void rule__Machine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1807:1: ( rule__Machine__Group_4__1__Impl )
            // InternalXMachine.g:1808:2: rule__Machine__Group_4__1__Impl
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
    // InternalXMachine.g:1814:1: rule__Machine__Group_4__1__Impl : ( ( ( rule__Machine__VariablesAssignment_4_1 ) ) ( ( rule__Machine__VariablesAssignment_4_1 )* ) ) ;
    public final void rule__Machine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1818:1: ( ( ( ( rule__Machine__VariablesAssignment_4_1 ) ) ( ( rule__Machine__VariablesAssignment_4_1 )* ) ) )
            // InternalXMachine.g:1819:1: ( ( ( rule__Machine__VariablesAssignment_4_1 ) ) ( ( rule__Machine__VariablesAssignment_4_1 )* ) )
            {
            // InternalXMachine.g:1819:1: ( ( ( rule__Machine__VariablesAssignment_4_1 ) ) ( ( rule__Machine__VariablesAssignment_4_1 )* ) )
            // InternalXMachine.g:1820:2: ( ( rule__Machine__VariablesAssignment_4_1 ) ) ( ( rule__Machine__VariablesAssignment_4_1 )* )
            {
            // InternalXMachine.g:1820:2: ( ( rule__Machine__VariablesAssignment_4_1 ) )
            // InternalXMachine.g:1821:3: ( rule__Machine__VariablesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesAssignment_4_1()); 
            }
            // InternalXMachine.g:1822:3: ( rule__Machine__VariablesAssignment_4_1 )
            // InternalXMachine.g:1822:4: rule__Machine__VariablesAssignment_4_1
            {
            pushFollow(FOLLOW_9);
            rule__Machine__VariablesAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariablesAssignment_4_1()); 
            }

            }

            // InternalXMachine.g:1825:2: ( ( rule__Machine__VariablesAssignment_4_1 )* )
            // InternalXMachine.g:1826:3: ( rule__Machine__VariablesAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesAssignment_4_1()); 
            }
            // InternalXMachine.g:1827:3: ( rule__Machine__VariablesAssignment_4_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalXMachine.g:1827:4: rule__Machine__VariablesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Machine__VariablesAssignment_4_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalXMachine.g:1837:1: rule__Machine__Group_5__0 : rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 ;
    public final void rule__Machine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1841:1: ( rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 )
            // InternalXMachine.g:1842:2: rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalXMachine.g:1849:1: rule__Machine__Group_5__0__Impl : ( 'invariants' ) ;
    public final void rule__Machine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1853:1: ( ( 'invariants' ) )
            // InternalXMachine.g:1854:1: ( 'invariants' )
            {
            // InternalXMachine.g:1854:1: ( 'invariants' )
            // InternalXMachine.g:1855:2: 'invariants'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsKeyword_5_0()); 
            }
            match(input,120,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1864:1: rule__Machine__Group_5__1 : rule__Machine__Group_5__1__Impl ;
    public final void rule__Machine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1868:1: ( rule__Machine__Group_5__1__Impl )
            // InternalXMachine.g:1869:2: rule__Machine__Group_5__1__Impl
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
    // InternalXMachine.g:1875:1: rule__Machine__Group_5__1__Impl : ( ( ( rule__Machine__InvariantsAssignment_5_1 ) ) ( ( rule__Machine__InvariantsAssignment_5_1 )* ) ) ;
    public final void rule__Machine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1879:1: ( ( ( ( rule__Machine__InvariantsAssignment_5_1 ) ) ( ( rule__Machine__InvariantsAssignment_5_1 )* ) ) )
            // InternalXMachine.g:1880:1: ( ( ( rule__Machine__InvariantsAssignment_5_1 ) ) ( ( rule__Machine__InvariantsAssignment_5_1 )* ) )
            {
            // InternalXMachine.g:1880:1: ( ( ( rule__Machine__InvariantsAssignment_5_1 ) ) ( ( rule__Machine__InvariantsAssignment_5_1 )* ) )
            // InternalXMachine.g:1881:2: ( ( rule__Machine__InvariantsAssignment_5_1 ) ) ( ( rule__Machine__InvariantsAssignment_5_1 )* )
            {
            // InternalXMachine.g:1881:2: ( ( rule__Machine__InvariantsAssignment_5_1 ) )
            // InternalXMachine.g:1882:3: ( rule__Machine__InvariantsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsAssignment_5_1()); 
            }
            // InternalXMachine.g:1883:3: ( rule__Machine__InvariantsAssignment_5_1 )
            // InternalXMachine.g:1883:4: rule__Machine__InvariantsAssignment_5_1
            {
            pushFollow(FOLLOW_11);
            rule__Machine__InvariantsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInvariantsAssignment_5_1()); 
            }

            }

            // InternalXMachine.g:1886:2: ( ( rule__Machine__InvariantsAssignment_5_1 )* )
            // InternalXMachine.g:1887:3: ( rule__Machine__InvariantsAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsAssignment_5_1()); 
            }
            // InternalXMachine.g:1888:3: ( rule__Machine__InvariantsAssignment_5_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_XLABEL||LA17_0==136) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalXMachine.g:1888:4: rule__Machine__InvariantsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Machine__InvariantsAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalXMachine.g:1898:1: rule__Machine__Group_6__0 : rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 ;
    public final void rule__Machine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1902:1: ( rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 )
            // InternalXMachine.g:1903:2: rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalXMachine.g:1910:1: rule__Machine__Group_6__0__Impl : ( 'variants' ) ;
    public final void rule__Machine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1914:1: ( ( 'variants' ) )
            // InternalXMachine.g:1915:1: ( 'variants' )
            {
            // InternalXMachine.g:1915:1: ( 'variants' )
            // InternalXMachine.g:1916:2: 'variants'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariantsKeyword_6_0()); 
            }
            match(input,121,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariantsKeyword_6_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:1925:1: rule__Machine__Group_6__1 : rule__Machine__Group_6__1__Impl ;
    public final void rule__Machine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1929:1: ( rule__Machine__Group_6__1__Impl )
            // InternalXMachine.g:1930:2: rule__Machine__Group_6__1__Impl
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
    // InternalXMachine.g:1936:1: rule__Machine__Group_6__1__Impl : ( ( ( rule__Machine__VariantsAssignment_6_1 ) ) ( ( rule__Machine__VariantsAssignment_6_1 )* ) ) ;
    public final void rule__Machine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1940:1: ( ( ( ( rule__Machine__VariantsAssignment_6_1 ) ) ( ( rule__Machine__VariantsAssignment_6_1 )* ) ) )
            // InternalXMachine.g:1941:1: ( ( ( rule__Machine__VariantsAssignment_6_1 ) ) ( ( rule__Machine__VariantsAssignment_6_1 )* ) )
            {
            // InternalXMachine.g:1941:1: ( ( ( rule__Machine__VariantsAssignment_6_1 ) ) ( ( rule__Machine__VariantsAssignment_6_1 )* ) )
            // InternalXMachine.g:1942:2: ( ( rule__Machine__VariantsAssignment_6_1 ) ) ( ( rule__Machine__VariantsAssignment_6_1 )* )
            {
            // InternalXMachine.g:1942:2: ( ( rule__Machine__VariantsAssignment_6_1 ) )
            // InternalXMachine.g:1943:3: ( rule__Machine__VariantsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariantsAssignment_6_1()); 
            }
            // InternalXMachine.g:1944:3: ( rule__Machine__VariantsAssignment_6_1 )
            // InternalXMachine.g:1944:4: rule__Machine__VariantsAssignment_6_1
            {
            pushFollow(FOLLOW_13);
            rule__Machine__VariantsAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariantsAssignment_6_1()); 
            }

            }

            // InternalXMachine.g:1947:2: ( ( rule__Machine__VariantsAssignment_6_1 )* )
            // InternalXMachine.g:1948:3: ( rule__Machine__VariantsAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariantsAssignment_6_1()); 
            }
            // InternalXMachine.g:1949:3: ( rule__Machine__VariantsAssignment_6_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_XLABEL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXMachine.g:1949:4: rule__Machine__VariantsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Machine__VariantsAssignment_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariantsAssignment_6_1()); 
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
    // $ANTLR end "rule__Machine__Group_6__1__Impl"


    // $ANTLR start "rule__Machine__Group_7__0"
    // InternalXMachine.g:1959:1: rule__Machine__Group_7__0 : rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 ;
    public final void rule__Machine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1963:1: ( rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 )
            // InternalXMachine.g:1964:2: rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalXMachine.g:1971:1: rule__Machine__Group_7__0__Impl : ( 'events' ) ;
    public final void rule__Machine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1975:1: ( ( 'events' ) )
            // InternalXMachine.g:1976:1: ( 'events' )
            {
            // InternalXMachine.g:1976:1: ( 'events' )
            // InternalXMachine.g:1977:2: 'events'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsKeyword_7_0()); 
            }
            match(input,122,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1986:1: rule__Machine__Group_7__1 : rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2 ;
    public final void rule__Machine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1990:1: ( rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2 )
            // InternalXMachine.g:1991:2: rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalXMachine.g:1998:1: rule__Machine__Group_7__1__Impl : ( ( rule__Machine__EventsAssignment_7_1 ) ) ;
    public final void rule__Machine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2002:1: ( ( ( rule__Machine__EventsAssignment_7_1 ) ) )
            // InternalXMachine.g:2003:1: ( ( rule__Machine__EventsAssignment_7_1 ) )
            {
            // InternalXMachine.g:2003:1: ( ( rule__Machine__EventsAssignment_7_1 ) )
            // InternalXMachine.g:2004:2: ( rule__Machine__EventsAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsAssignment_7_1()); 
            }
            // InternalXMachine.g:2005:2: ( rule__Machine__EventsAssignment_7_1 )
            // InternalXMachine.g:2005:3: rule__Machine__EventsAssignment_7_1
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
    // InternalXMachine.g:2013:1: rule__Machine__Group_7__2 : rule__Machine__Group_7__2__Impl ;
    public final void rule__Machine__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2017:1: ( rule__Machine__Group_7__2__Impl )
            // InternalXMachine.g:2018:2: rule__Machine__Group_7__2__Impl
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
    // InternalXMachine.g:2024:1: rule__Machine__Group_7__2__Impl : ( ( rule__Machine__EventsAssignment_7_2 )* ) ;
    public final void rule__Machine__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2028:1: ( ( ( rule__Machine__EventsAssignment_7_2 )* ) )
            // InternalXMachine.g:2029:1: ( ( rule__Machine__EventsAssignment_7_2 )* )
            {
            // InternalXMachine.g:2029:1: ( ( rule__Machine__EventsAssignment_7_2 )* )
            // InternalXMachine.g:2030:2: ( rule__Machine__EventsAssignment_7_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsAssignment_7_2()); 
            }
            // InternalXMachine.g:2031:2: ( rule__Machine__EventsAssignment_7_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=112 && LA19_0<=114)||LA19_0==128) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalXMachine.g:2031:3: rule__Machine__EventsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Machine__EventsAssignment_7_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalXMachine.g:2040:1: rule__MIncludes__Group__0 : rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 ;
    public final void rule__MIncludes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2044:1: ( rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 )
            // InternalXMachine.g:2045:2: rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalXMachine.g:2052:1: rule__MIncludes__Group__0__Impl : ( () ) ;
    public final void rule__MIncludes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2056:1: ( ( () ) )
            // InternalXMachine.g:2057:1: ( () )
            {
            // InternalXMachine.g:2057:1: ( () )
            // InternalXMachine.g:2058:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 
            }
            // InternalXMachine.g:2059:2: ()
            // InternalXMachine.g:2059:3: 
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
    // InternalXMachine.g:2067:1: rule__MIncludes__Group__1 : rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 ;
    public final void rule__MIncludes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2071:1: ( rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 )
            // InternalXMachine.g:2072:2: rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalXMachine.g:2079:1: rule__MIncludes__Group__1__Impl : ( ( rule__MIncludes__Group_1__0 ) ) ;
    public final void rule__MIncludes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2083:1: ( ( ( rule__MIncludes__Group_1__0 ) ) )
            // InternalXMachine.g:2084:1: ( ( rule__MIncludes__Group_1__0 ) )
            {
            // InternalXMachine.g:2084:1: ( ( rule__MIncludes__Group_1__0 ) )
            // InternalXMachine.g:2085:2: ( rule__MIncludes__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_1()); 
            }
            // InternalXMachine.g:2086:2: ( rule__MIncludes__Group_1__0 )
            // InternalXMachine.g:2086:3: rule__MIncludes__Group_1__0
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
    // InternalXMachine.g:2094:1: rule__MIncludes__Group__2 : rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 ;
    public final void rule__MIncludes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2098:1: ( rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 )
            // InternalXMachine.g:2099:2: rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalXMachine.g:2106:1: rule__MIncludes__Group__2__Impl : ( ( rule__MIncludes__Group_2__0 )? ) ;
    public final void rule__MIncludes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2110:1: ( ( ( rule__MIncludes__Group_2__0 )? ) )
            // InternalXMachine.g:2111:1: ( ( rule__MIncludes__Group_2__0 )? )
            {
            // InternalXMachine.g:2111:1: ( ( rule__MIncludes__Group_2__0 )? )
            // InternalXMachine.g:2112:2: ( rule__MIncludes__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_2()); 
            }
            // InternalXMachine.g:2113:2: ( rule__MIncludes__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==124) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXMachine.g:2113:3: rule__MIncludes__Group_2__0
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
    // InternalXMachine.g:2121:1: rule__MIncludes__Group__3 : rule__MIncludes__Group__3__Impl ;
    public final void rule__MIncludes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2125:1: ( rule__MIncludes__Group__3__Impl )
            // InternalXMachine.g:2126:2: rule__MIncludes__Group__3__Impl
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
    // InternalXMachine.g:2132:1: rule__MIncludes__Group__3__Impl : ( ( rule__MIncludes__Group_3__0 )? ) ;
    public final void rule__MIncludes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2136:1: ( ( ( rule__MIncludes__Group_3__0 )? ) )
            // InternalXMachine.g:2137:1: ( ( rule__MIncludes__Group_3__0 )? )
            {
            // InternalXMachine.g:2137:1: ( ( rule__MIncludes__Group_3__0 )? )
            // InternalXMachine.g:2138:2: ( rule__MIncludes__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_3()); 
            }
            // InternalXMachine.g:2139:2: ( rule__MIncludes__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==125) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXMachine.g:2139:3: rule__MIncludes__Group_3__0
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
    // InternalXMachine.g:2148:1: rule__MIncludes__Group_1__0 : rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 ;
    public final void rule__MIncludes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2152:1: ( rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 )
            // InternalXMachine.g:2153:2: rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:2160:1: rule__MIncludes__Group_1__0__Impl : ( 'includes' ) ;
    public final void rule__MIncludes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2164:1: ( ( 'includes' ) )
            // InternalXMachine.g:2165:1: ( 'includes' )
            {
            // InternalXMachine.g:2165:1: ( 'includes' )
            // InternalXMachine.g:2166:2: 'includes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0()); 
            }
            match(input,123,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2175:1: rule__MIncludes__Group_1__1 : rule__MIncludes__Group_1__1__Impl ;
    public final void rule__MIncludes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2179:1: ( rule__MIncludes__Group_1__1__Impl )
            // InternalXMachine.g:2180:2: rule__MIncludes__Group_1__1__Impl
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
    // InternalXMachine.g:2186:1: rule__MIncludes__Group_1__1__Impl : ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) ;
    public final void rule__MIncludes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2190:1: ( ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) )
            // InternalXMachine.g:2191:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            {
            // InternalXMachine.g:2191:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            // InternalXMachine.g:2192:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 
            }
            // InternalXMachine.g:2193:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            // InternalXMachine.g:2193:3: rule__MIncludes__AbstractMachineAssignment_1_1
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
    // InternalXMachine.g:2202:1: rule__MIncludes__Group_2__0 : rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 ;
    public final void rule__MIncludes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2206:1: ( rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 )
            // InternalXMachine.g:2207:2: rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:2214:1: rule__MIncludes__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__MIncludes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2218:1: ( ( 'to' ) )
            // InternalXMachine.g:2219:1: ( 'to' )
            {
            // InternalXMachine.g:2219:1: ( 'to' )
            // InternalXMachine.g:2220:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getToKeyword_2_0()); 
            }
            match(input,124,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2229:1: rule__MIncludes__Group_2__1 : rule__MIncludes__Group_2__1__Impl ;
    public final void rule__MIncludes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2233:1: ( rule__MIncludes__Group_2__1__Impl )
            // InternalXMachine.g:2234:2: rule__MIncludes__Group_2__1__Impl
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
    // InternalXMachine.g:2240:1: rule__MIncludes__Group_2__1__Impl : ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) ;
    public final void rule__MIncludes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2244:1: ( ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) )
            // InternalXMachine.g:2245:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            {
            // InternalXMachine.g:2245:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            // InternalXMachine.g:2246:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 
            }
            // InternalXMachine.g:2247:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            // InternalXMachine.g:2247:3: rule__MIncludes__ConcreteMachineAssignment_2_1
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
    // InternalXMachine.g:2256:1: rule__MIncludes__Group_3__0 : rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 ;
    public final void rule__MIncludes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2260:1: ( rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 )
            // InternalXMachine.g:2261:2: rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:2268:1: rule__MIncludes__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__MIncludes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2272:1: ( ( 'as' ) )
            // InternalXMachine.g:2273:1: ( 'as' )
            {
            // InternalXMachine.g:2273:1: ( 'as' )
            // InternalXMachine.g:2274:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAsKeyword_3_0()); 
            }
            match(input,125,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2283:1: rule__MIncludes__Group_3__1 : rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 ;
    public final void rule__MIncludes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2287:1: ( rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 )
            // InternalXMachine.g:2288:2: rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:2295:1: rule__MIncludes__Group_3__1__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) ;
    public final void rule__MIncludes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2299:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) )
            // InternalXMachine.g:2300:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            {
            // InternalXMachine.g:2300:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            // InternalXMachine.g:2301:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 
            }
            // InternalXMachine.g:2302:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            // InternalXMachine.g:2302:3: rule__MIncludes__PrefixesAssignment_3_1
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
    // InternalXMachine.g:2310:1: rule__MIncludes__Group_3__2 : rule__MIncludes__Group_3__2__Impl ;
    public final void rule__MIncludes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2314:1: ( rule__MIncludes__Group_3__2__Impl )
            // InternalXMachine.g:2315:2: rule__MIncludes__Group_3__2__Impl
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
    // InternalXMachine.g:2321:1: rule__MIncludes__Group_3__2__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) ;
    public final void rule__MIncludes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2325:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) )
            // InternalXMachine.g:2326:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            {
            // InternalXMachine.g:2326:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            // InternalXMachine.g:2327:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 
            }
            // InternalXMachine.g:2328:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXMachine.g:2328:3: rule__MIncludes__PrefixesAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__MIncludes__PrefixesAssignment_3_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalXMachine.g:2337:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2341:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXMachine.g:2342:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalXMachine.g:2349:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2353:1: ( ( RULE_ID ) )
            // InternalXMachine.g:2354:1: ( RULE_ID )
            {
            // InternalXMachine.g:2354:1: ( RULE_ID )
            // InternalXMachine.g:2355:2: RULE_ID
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
    // InternalXMachine.g:2364:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2368:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXMachine.g:2369:2: rule__QualifiedName__Group__1__Impl
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
    // InternalXMachine.g:2375:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )? ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2379:1: ( ( ( rule__QualifiedName__Group_1__0 )? ) )
            // InternalXMachine.g:2380:1: ( ( rule__QualifiedName__Group_1__0 )? )
            {
            // InternalXMachine.g:2380:1: ( ( rule__QualifiedName__Group_1__0 )? )
            // InternalXMachine.g:2381:2: ( rule__QualifiedName__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalXMachine.g:2382:2: ( rule__QualifiedName__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==51) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXMachine.g:2382:3: rule__QualifiedName__Group_1__0
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
    // InternalXMachine.g:2391:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2395:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXMachine.g:2396:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:2403:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2407:1: ( ( '.' ) )
            // InternalXMachine.g:2408:1: ( '.' )
            {
            // InternalXMachine.g:2408:1: ( '.' )
            // InternalXMachine.g:2409:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2418:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2422:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXMachine.g:2423:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalXMachine.g:2429:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2433:1: ( ( RULE_ID ) )
            // InternalXMachine.g:2434:1: ( RULE_ID )
            {
            // InternalXMachine.g:2434:1: ( RULE_ID )
            // InternalXMachine.g:2435:2: RULE_ID
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
    // InternalXMachine.g:2445:1: rule__XVariable__Group__0 : rule__XVariable__Group__0__Impl rule__XVariable__Group__1 ;
    public final void rule__XVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2449:1: ( rule__XVariable__Group__0__Impl rule__XVariable__Group__1 )
            // InternalXMachine.g:2450:2: rule__XVariable__Group__0__Impl rule__XVariable__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:2457:1: rule__XVariable__Group__0__Impl : ( () ) ;
    public final void rule__XVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2461:1: ( ( () ) )
            // InternalXMachine.g:2462:1: ( () )
            {
            // InternalXMachine.g:2462:1: ( () )
            // InternalXMachine.g:2463:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariableAccess().getVariableAction_0()); 
            }
            // InternalXMachine.g:2464:2: ()
            // InternalXMachine.g:2464:3: 
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
    // InternalXMachine.g:2472:1: rule__XVariable__Group__1 : rule__XVariable__Group__1__Impl ;
    public final void rule__XVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2476:1: ( rule__XVariable__Group__1__Impl )
            // InternalXMachine.g:2477:2: rule__XVariable__Group__1__Impl
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
    // InternalXMachine.g:2483:1: rule__XVariable__Group__1__Impl : ( ( rule__XVariable__NameAssignment_1 ) ) ;
    public final void rule__XVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2487:1: ( ( ( rule__XVariable__NameAssignment_1 ) ) )
            // InternalXMachine.g:2488:1: ( ( rule__XVariable__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2488:1: ( ( rule__XVariable__NameAssignment_1 ) )
            // InternalXMachine.g:2489:2: ( rule__XVariable__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariableAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:2490:2: ( rule__XVariable__NameAssignment_1 )
            // InternalXMachine.g:2490:3: rule__XVariable__NameAssignment_1
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
    // InternalXMachine.g:2499:1: rule__XInvariant__Group__0 : rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 ;
    public final void rule__XInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2503:1: ( rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 )
            // InternalXMachine.g:2504:2: rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalXMachine.g:2511:1: rule__XInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2515:1: ( ( () ) )
            // InternalXMachine.g:2516:1: ( () )
            {
            // InternalXMachine.g:2516:1: ( () )
            // InternalXMachine.g:2517:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getInvariantAction_0()); 
            }
            // InternalXMachine.g:2518:2: ()
            // InternalXMachine.g:2518:3: 
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
    // InternalXMachine.g:2526:1: rule__XInvariant__Group__1 : rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 ;
    public final void rule__XInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2530:1: ( rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 )
            // InternalXMachine.g:2531:2: rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalXMachine.g:2538:1: rule__XInvariant__Group__1__Impl : ( ( rule__XInvariant__TheoremAssignment_1 )? ) ;
    public final void rule__XInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2542:1: ( ( ( rule__XInvariant__TheoremAssignment_1 )? ) )
            // InternalXMachine.g:2543:1: ( ( rule__XInvariant__TheoremAssignment_1 )? )
            {
            // InternalXMachine.g:2543:1: ( ( rule__XInvariant__TheoremAssignment_1 )? )
            // InternalXMachine.g:2544:2: ( rule__XInvariant__TheoremAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getTheoremAssignment_1()); 
            }
            // InternalXMachine.g:2545:2: ( rule__XInvariant__TheoremAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==136) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXMachine.g:2545:3: rule__XInvariant__TheoremAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XInvariant__TheoremAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getTheoremAssignment_1()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:2553:1: rule__XInvariant__Group__2 : rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 ;
    public final void rule__XInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2557:1: ( rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 )
            // InternalXMachine.g:2558:2: rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalXMachine.g:2565:1: rule__XInvariant__Group__2__Impl : ( ( rule__XInvariant__NameAssignment_2 ) ) ;
    public final void rule__XInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2569:1: ( ( ( rule__XInvariant__NameAssignment_2 ) ) )
            // InternalXMachine.g:2570:1: ( ( rule__XInvariant__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2570:1: ( ( rule__XInvariant__NameAssignment_2 ) )
            // InternalXMachine.g:2571:2: ( rule__XInvariant__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:2572:2: ( rule__XInvariant__NameAssignment_2 )
            // InternalXMachine.g:2572:3: rule__XInvariant__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getNameAssignment_2()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:2580:1: rule__XInvariant__Group__3 : rule__XInvariant__Group__3__Impl ;
    public final void rule__XInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2584:1: ( rule__XInvariant__Group__3__Impl )
            // InternalXMachine.g:2585:2: rule__XInvariant__Group__3__Impl
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
    // InternalXMachine.g:2591:1: rule__XInvariant__Group__3__Impl : ( ( rule__XInvariant__PredicateAssignment_3 ) ) ;
    public final void rule__XInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2595:1: ( ( ( rule__XInvariant__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:2596:1: ( ( rule__XInvariant__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:2596:1: ( ( rule__XInvariant__PredicateAssignment_3 ) )
            // InternalXMachine.g:2597:2: ( rule__XInvariant__PredicateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getPredicateAssignment_3()); 
            }
            // InternalXMachine.g:2598:2: ( rule__XInvariant__PredicateAssignment_3 )
            // InternalXMachine.g:2598:3: rule__XInvariant__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__PredicateAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getPredicateAssignment_3()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:2607:1: rule__XVariant__Group__0 : rule__XVariant__Group__0__Impl rule__XVariant__Group__1 ;
    public final void rule__XVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2611:1: ( rule__XVariant__Group__0__Impl rule__XVariant__Group__1 )
            // InternalXMachine.g:2612:2: rule__XVariant__Group__0__Impl rule__XVariant__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalXMachine.g:2619:1: rule__XVariant__Group__0__Impl : ( () ) ;
    public final void rule__XVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2623:1: ( ( () ) )
            // InternalXMachine.g:2624:1: ( () )
            {
            // InternalXMachine.g:2624:1: ( () )
            // InternalXMachine.g:2625:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getVariantAction_0()); 
            }
            // InternalXMachine.g:2626:2: ()
            // InternalXMachine.g:2626:3: 
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
    // InternalXMachine.g:2634:1: rule__XVariant__Group__1 : rule__XVariant__Group__1__Impl rule__XVariant__Group__2 ;
    public final void rule__XVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2638:1: ( rule__XVariant__Group__1__Impl rule__XVariant__Group__2 )
            // InternalXMachine.g:2639:2: rule__XVariant__Group__1__Impl rule__XVariant__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__XVariant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:2646:1: rule__XVariant__Group__1__Impl : ( ( rule__XVariant__NameAssignment_1 ) ) ;
    public final void rule__XVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2650:1: ( ( ( rule__XVariant__NameAssignment_1 ) ) )
            // InternalXMachine.g:2651:1: ( ( rule__XVariant__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2651:1: ( ( rule__XVariant__NameAssignment_1 ) )
            // InternalXMachine.g:2652:2: ( rule__XVariant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:2653:2: ( rule__XVariant__NameAssignment_1 )
            // InternalXMachine.g:2653:3: rule__XVariant__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__XVariant__Group__2"
    // InternalXMachine.g:2661:1: rule__XVariant__Group__2 : rule__XVariant__Group__2__Impl ;
    public final void rule__XVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2665:1: ( rule__XVariant__Group__2__Impl )
            // InternalXMachine.g:2666:2: rule__XVariant__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__2"


    // $ANTLR start "rule__XVariant__Group__2__Impl"
    // InternalXMachine.g:2672:1: rule__XVariant__Group__2__Impl : ( ( rule__XVariant__ExpressionAssignment_2 ) ) ;
    public final void rule__XVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2676:1: ( ( ( rule__XVariant__ExpressionAssignment_2 ) ) )
            // InternalXMachine.g:2677:1: ( ( rule__XVariant__ExpressionAssignment_2 ) )
            {
            // InternalXMachine.g:2677:1: ( ( rule__XVariant__ExpressionAssignment_2 ) )
            // InternalXMachine.g:2678:2: ( rule__XVariant__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getExpressionAssignment_2()); 
            }
            // InternalXMachine.g:2679:2: ( rule__XVariant__ExpressionAssignment_2 )
            // InternalXMachine.g:2679:3: rule__XVariant__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getExpressionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__2__Impl"


    // $ANTLR start "rule__XGroup__Group__0"
    // InternalXMachine.g:2688:1: rule__XGroup__Group__0 : rule__XGroup__Group__0__Impl rule__XGroup__Group__1 ;
    public final void rule__XGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2692:1: ( rule__XGroup__Group__0__Impl rule__XGroup__Group__1 )
            // InternalXMachine.g:2693:2: rule__XGroup__Group__0__Impl rule__XGroup__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:2700:1: rule__XGroup__Group__0__Impl : ( () ) ;
    public final void rule__XGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2704:1: ( ( () ) )
            // InternalXMachine.g:2705:1: ( () )
            {
            // InternalXMachine.g:2705:1: ( () )
            // InternalXMachine.g:2706:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventCasesAction_0()); 
            }
            // InternalXMachine.g:2707:2: ()
            // InternalXMachine.g:2707:3: 
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
    // InternalXMachine.g:2715:1: rule__XGroup__Group__1 : rule__XGroup__Group__1__Impl rule__XGroup__Group__2 ;
    public final void rule__XGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2719:1: ( rule__XGroup__Group__1__Impl rule__XGroup__Group__2 )
            // InternalXMachine.g:2720:2: rule__XGroup__Group__1__Impl rule__XGroup__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:2727:1: rule__XGroup__Group__1__Impl : ( 'group' ) ;
    public final void rule__XGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2731:1: ( ( 'group' ) )
            // InternalXMachine.g:2732:1: ( 'group' )
            {
            // InternalXMachine.g:2732:1: ( 'group' )
            // InternalXMachine.g:2733:2: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getGroupKeyword_1()); 
            }
            match(input,126,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2742:1: rule__XGroup__Group__2 : rule__XGroup__Group__2__Impl rule__XGroup__Group__3 ;
    public final void rule__XGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2746:1: ( rule__XGroup__Group__2__Impl rule__XGroup__Group__3 )
            // InternalXMachine.g:2747:2: rule__XGroup__Group__2__Impl rule__XGroup__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:2754:1: rule__XGroup__Group__2__Impl : ( ( rule__XGroup__NameAssignment_2 ) ) ;
    public final void rule__XGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2758:1: ( ( ( rule__XGroup__NameAssignment_2 ) ) )
            // InternalXMachine.g:2759:1: ( ( rule__XGroup__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2759:1: ( ( rule__XGroup__NameAssignment_2 ) )
            // InternalXMachine.g:2760:2: ( rule__XGroup__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:2761:2: ( rule__XGroup__NameAssignment_2 )
            // InternalXMachine.g:2761:3: rule__XGroup__NameAssignment_2
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
    // InternalXMachine.g:2769:1: rule__XGroup__Group__3 : rule__XGroup__Group__3__Impl rule__XGroup__Group__4 ;
    public final void rule__XGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2773:1: ( rule__XGroup__Group__3__Impl rule__XGroup__Group__4 )
            // InternalXMachine.g:2774:2: rule__XGroup__Group__3__Impl rule__XGroup__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:2781:1: rule__XGroup__Group__3__Impl : ( ( rule__XGroup__Group_3__0 )? ) ;
    public final void rule__XGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2785:1: ( ( ( rule__XGroup__Group_3__0 )? ) )
            // InternalXMachine.g:2786:1: ( ( rule__XGroup__Group_3__0 )? )
            {
            // InternalXMachine.g:2786:1: ( ( rule__XGroup__Group_3__0 )? )
            // InternalXMachine.g:2787:2: ( rule__XGroup__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getGroup_3()); 
            }
            // InternalXMachine.g:2788:2: ( rule__XGroup__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXMachine.g:2788:3: rule__XGroup__Group_3__0
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
    // InternalXMachine.g:2796:1: rule__XGroup__Group__4 : rule__XGroup__Group__4__Impl rule__XGroup__Group__5 ;
    public final void rule__XGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2800:1: ( rule__XGroup__Group__4__Impl rule__XGroup__Group__5 )
            // InternalXMachine.g:2801:2: rule__XGroup__Group__4__Impl rule__XGroup__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:2808:1: rule__XGroup__Group__4__Impl : ( ( rule__XGroup__Group_4__0 )? ) ;
    public final void rule__XGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2812:1: ( ( ( rule__XGroup__Group_4__0 )? ) )
            // InternalXMachine.g:2813:1: ( ( rule__XGroup__Group_4__0 )? )
            {
            // InternalXMachine.g:2813:1: ( ( rule__XGroup__Group_4__0 )? )
            // InternalXMachine.g:2814:2: ( rule__XGroup__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getGroup_4()); 
            }
            // InternalXMachine.g:2815:2: ( rule__XGroup__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==127) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXMachine.g:2815:3: rule__XGroup__Group_4__0
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
    // InternalXMachine.g:2823:1: rule__XGroup__Group__5 : rule__XGroup__Group__5__Impl ;
    public final void rule__XGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2827:1: ( rule__XGroup__Group__5__Impl )
            // InternalXMachine.g:2828:2: rule__XGroup__Group__5__Impl
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
    // InternalXMachine.g:2834:1: rule__XGroup__Group__5__Impl : ( 'end' ) ;
    public final void rule__XGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2838:1: ( ( 'end' ) )
            // InternalXMachine.g:2839:1: ( 'end' )
            {
            // InternalXMachine.g:2839:1: ( 'end' )
            // InternalXMachine.g:2840:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEndKeyword_5()); 
            }
            match(input,116,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2850:1: rule__XGroup__Group_3__0 : rule__XGroup__Group_3__0__Impl rule__XGroup__Group_3__1 ;
    public final void rule__XGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2854:1: ( rule__XGroup__Group_3__0__Impl rule__XGroup__Group_3__1 )
            // InternalXMachine.g:2855:2: rule__XGroup__Group_3__0__Impl rule__XGroup__Group_3__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalXMachine.g:2862:1: rule__XGroup__Group_3__0__Impl : ( '(' ) ;
    public final void rule__XGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2866:1: ( ( '(' ) )
            // InternalXMachine.g:2867:1: ( '(' )
            {
            // InternalXMachine.g:2867:1: ( '(' )
            // InternalXMachine.g:2868:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2877:1: rule__XGroup__Group_3__1 : rule__XGroup__Group_3__1__Impl rule__XGroup__Group_3__2 ;
    public final void rule__XGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2881:1: ( rule__XGroup__Group_3__1__Impl rule__XGroup__Group_3__2 )
            // InternalXMachine.g:2882:2: rule__XGroup__Group_3__1__Impl rule__XGroup__Group_3__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:2889:1: rule__XGroup__Group_3__1__Impl : ( ( rule__XGroup__FormalParametersAssignment_3_1 ) ) ;
    public final void rule__XGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2893:1: ( ( ( rule__XGroup__FormalParametersAssignment_3_1 ) ) )
            // InternalXMachine.g:2894:1: ( ( rule__XGroup__FormalParametersAssignment_3_1 ) )
            {
            // InternalXMachine.g:2894:1: ( ( rule__XGroup__FormalParametersAssignment_3_1 ) )
            // InternalXMachine.g:2895:2: ( rule__XGroup__FormalParametersAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getFormalParametersAssignment_3_1()); 
            }
            // InternalXMachine.g:2896:2: ( rule__XGroup__FormalParametersAssignment_3_1 )
            // InternalXMachine.g:2896:3: rule__XGroup__FormalParametersAssignment_3_1
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
    // InternalXMachine.g:2904:1: rule__XGroup__Group_3__2 : rule__XGroup__Group_3__2__Impl rule__XGroup__Group_3__3 ;
    public final void rule__XGroup__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2908:1: ( rule__XGroup__Group_3__2__Impl rule__XGroup__Group_3__3 )
            // InternalXMachine.g:2909:2: rule__XGroup__Group_3__2__Impl rule__XGroup__Group_3__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:2916:1: rule__XGroup__Group_3__2__Impl : ( ( rule__XGroup__Group_3_2__0 )* ) ;
    public final void rule__XGroup__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2920:1: ( ( ( rule__XGroup__Group_3_2__0 )* ) )
            // InternalXMachine.g:2921:1: ( ( rule__XGroup__Group_3_2__0 )* )
            {
            // InternalXMachine.g:2921:1: ( ( rule__XGroup__Group_3_2__0 )* )
            // InternalXMachine.g:2922:2: ( rule__XGroup__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getGroup_3_2()); 
            }
            // InternalXMachine.g:2923:2: ( rule__XGroup__Group_3_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==49) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalXMachine.g:2923:3: rule__XGroup__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__XGroup__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalXMachine.g:2931:1: rule__XGroup__Group_3__3 : rule__XGroup__Group_3__3__Impl ;
    public final void rule__XGroup__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2935:1: ( rule__XGroup__Group_3__3__Impl )
            // InternalXMachine.g:2936:2: rule__XGroup__Group_3__3__Impl
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
    // InternalXMachine.g:2942:1: rule__XGroup__Group_3__3__Impl : ( ')' ) ;
    public final void rule__XGroup__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2946:1: ( ( ')' ) )
            // InternalXMachine.g:2947:1: ( ')' )
            {
            // InternalXMachine.g:2947:1: ( ')' )
            // InternalXMachine.g:2948:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2958:1: rule__XGroup__Group_3_2__0 : rule__XGroup__Group_3_2__0__Impl rule__XGroup__Group_3_2__1 ;
    public final void rule__XGroup__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2962:1: ( rule__XGroup__Group_3_2__0__Impl rule__XGroup__Group_3_2__1 )
            // InternalXMachine.g:2963:2: rule__XGroup__Group_3_2__0__Impl rule__XGroup__Group_3_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalXMachine.g:2970:1: rule__XGroup__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__XGroup__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2974:1: ( ( ',' ) )
            // InternalXMachine.g:2975:1: ( ',' )
            {
            // InternalXMachine.g:2975:1: ( ',' )
            // InternalXMachine.g:2976:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2985:1: rule__XGroup__Group_3_2__1 : rule__XGroup__Group_3_2__1__Impl ;
    public final void rule__XGroup__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2989:1: ( rule__XGroup__Group_3_2__1__Impl )
            // InternalXMachine.g:2990:2: rule__XGroup__Group_3_2__1__Impl
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
    // InternalXMachine.g:2996:1: rule__XGroup__Group_3_2__1__Impl : ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) ) ;
    public final void rule__XGroup__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3000:1: ( ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) ) )
            // InternalXMachine.g:3001:1: ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) )
            {
            // InternalXMachine.g:3001:1: ( ( rule__XGroup__FormalParametersAssignment_3_2_1 ) )
            // InternalXMachine.g:3002:2: ( rule__XGroup__FormalParametersAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getFormalParametersAssignment_3_2_1()); 
            }
            // InternalXMachine.g:3003:2: ( rule__XGroup__FormalParametersAssignment_3_2_1 )
            // InternalXMachine.g:3003:3: rule__XGroup__FormalParametersAssignment_3_2_1
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
    // InternalXMachine.g:3012:1: rule__XGroup__Group_4__0 : rule__XGroup__Group_4__0__Impl rule__XGroup__Group_4__1 ;
    public final void rule__XGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3016:1: ( rule__XGroup__Group_4__0__Impl rule__XGroup__Group_4__1 )
            // InternalXMachine.g:3017:2: rule__XGroup__Group_4__0__Impl rule__XGroup__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:3024:1: rule__XGroup__Group_4__0__Impl : ( 'begin' ) ;
    public final void rule__XGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3028:1: ( ( 'begin' ) )
            // InternalXMachine.g:3029:1: ( 'begin' )
            {
            // InternalXMachine.g:3029:1: ( 'begin' )
            // InternalXMachine.g:3030:2: 'begin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getBeginKeyword_4_0()); 
            }
            match(input,127,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3039:1: rule__XGroup__Group_4__1 : rule__XGroup__Group_4__1__Impl rule__XGroup__Group_4__2 ;
    public final void rule__XGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3043:1: ( rule__XGroup__Group_4__1__Impl rule__XGroup__Group_4__2 )
            // InternalXMachine.g:3044:2: rule__XGroup__Group_4__1__Impl rule__XGroup__Group_4__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:3051:1: rule__XGroup__Group_4__1__Impl : ( ( rule__XGroup__EventsAssignment_4_1 ) ) ;
    public final void rule__XGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3055:1: ( ( ( rule__XGroup__EventsAssignment_4_1 ) ) )
            // InternalXMachine.g:3056:1: ( ( rule__XGroup__EventsAssignment_4_1 ) )
            {
            // InternalXMachine.g:3056:1: ( ( rule__XGroup__EventsAssignment_4_1 ) )
            // InternalXMachine.g:3057:2: ( rule__XGroup__EventsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventsAssignment_4_1()); 
            }
            // InternalXMachine.g:3058:2: ( rule__XGroup__EventsAssignment_4_1 )
            // InternalXMachine.g:3058:3: rule__XGroup__EventsAssignment_4_1
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
    // InternalXMachine.g:3066:1: rule__XGroup__Group_4__2 : rule__XGroup__Group_4__2__Impl ;
    public final void rule__XGroup__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3070:1: ( rule__XGroup__Group_4__2__Impl )
            // InternalXMachine.g:3071:2: rule__XGroup__Group_4__2__Impl
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
    // InternalXMachine.g:3077:1: rule__XGroup__Group_4__2__Impl : ( ( rule__XGroup__EventsAssignment_4_2 )* ) ;
    public final void rule__XGroup__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3081:1: ( ( ( rule__XGroup__EventsAssignment_4_2 )* ) )
            // InternalXMachine.g:3082:1: ( ( rule__XGroup__EventsAssignment_4_2 )* )
            {
            // InternalXMachine.g:3082:1: ( ( rule__XGroup__EventsAssignment_4_2 )* )
            // InternalXMachine.g:3083:2: ( rule__XGroup__EventsAssignment_4_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventsAssignment_4_2()); 
            }
            // InternalXMachine.g:3084:2: ( rule__XGroup__EventsAssignment_4_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalXMachine.g:3084:3: rule__XGroup__EventsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XGroup__EventsAssignment_4_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalXMachine.g:3093:1: rule__XFormalParameter__Group__0 : rule__XFormalParameter__Group__0__Impl rule__XFormalParameter__Group__1 ;
    public final void rule__XFormalParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3097:1: ( rule__XFormalParameter__Group__0__Impl rule__XFormalParameter__Group__1 )
            // InternalXMachine.g:3098:2: rule__XFormalParameter__Group__0__Impl rule__XFormalParameter__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalXMachine.g:3105:1: rule__XFormalParameter__Group__0__Impl : ( () ) ;
    public final void rule__XFormalParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3109:1: ( ( () ) )
            // InternalXMachine.g:3110:1: ( () )
            {
            // InternalXMachine.g:3110:1: ( () )
            // InternalXMachine.g:3111:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormalParameterAccess().getFormalParameterAction_0()); 
            }
            // InternalXMachine.g:3112:2: ()
            // InternalXMachine.g:3112:3: 
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
    // InternalXMachine.g:3120:1: rule__XFormalParameter__Group__1 : rule__XFormalParameter__Group__1__Impl rule__XFormalParameter__Group__2 ;
    public final void rule__XFormalParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3124:1: ( rule__XFormalParameter__Group__1__Impl rule__XFormalParameter__Group__2 )
            // InternalXMachine.g:3125:2: rule__XFormalParameter__Group__1__Impl rule__XFormalParameter__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:3132:1: rule__XFormalParameter__Group__1__Impl : ( ( rule__XFormalParameter__DirectionAssignment_1 ) ) ;
    public final void rule__XFormalParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3136:1: ( ( ( rule__XFormalParameter__DirectionAssignment_1 ) ) )
            // InternalXMachine.g:3137:1: ( ( rule__XFormalParameter__DirectionAssignment_1 ) )
            {
            // InternalXMachine.g:3137:1: ( ( rule__XFormalParameter__DirectionAssignment_1 ) )
            // InternalXMachine.g:3138:2: ( rule__XFormalParameter__DirectionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormalParameterAccess().getDirectionAssignment_1()); 
            }
            // InternalXMachine.g:3139:2: ( rule__XFormalParameter__DirectionAssignment_1 )
            // InternalXMachine.g:3139:3: rule__XFormalParameter__DirectionAssignment_1
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
    // InternalXMachine.g:3147:1: rule__XFormalParameter__Group__2 : rule__XFormalParameter__Group__2__Impl ;
    public final void rule__XFormalParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3151:1: ( rule__XFormalParameter__Group__2__Impl )
            // InternalXMachine.g:3152:2: rule__XFormalParameter__Group__2__Impl
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
    // InternalXMachine.g:3158:1: rule__XFormalParameter__Group__2__Impl : ( ( rule__XFormalParameter__NameAssignment_2 ) ) ;
    public final void rule__XFormalParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3162:1: ( ( ( rule__XFormalParameter__NameAssignment_2 ) ) )
            // InternalXMachine.g:3163:1: ( ( rule__XFormalParameter__NameAssignment_2 ) )
            {
            // InternalXMachine.g:3163:1: ( ( rule__XFormalParameter__NameAssignment_2 ) )
            // InternalXMachine.g:3164:2: ( rule__XFormalParameter__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormalParameterAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:3165:2: ( rule__XFormalParameter__NameAssignment_2 )
            // InternalXMachine.g:3165:3: rule__XFormalParameter__NameAssignment_2
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
    // InternalXMachine.g:3174:1: rule__XEvent__Group__0 : rule__XEvent__Group__0__Impl rule__XEvent__Group__1 ;
    public final void rule__XEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3178:1: ( rule__XEvent__Group__0__Impl rule__XEvent__Group__1 )
            // InternalXMachine.g:3179:2: rule__XEvent__Group__0__Impl rule__XEvent__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalXMachine.g:3186:1: rule__XEvent__Group__0__Impl : ( () ) ;
    public final void rule__XEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3190:1: ( ( () ) )
            // InternalXMachine.g:3191:1: ( () )
            {
            // InternalXMachine.g:3191:1: ( () )
            // InternalXMachine.g:3192:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEventAction_0()); 
            }
            // InternalXMachine.g:3193:2: ()
            // InternalXMachine.g:3193:3: 
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
    // InternalXMachine.g:3201:1: rule__XEvent__Group__1 : rule__XEvent__Group__1__Impl rule__XEvent__Group__2 ;
    public final void rule__XEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3205:1: ( rule__XEvent__Group__1__Impl rule__XEvent__Group__2 )
            // InternalXMachine.g:3206:2: rule__XEvent__Group__1__Impl rule__XEvent__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalXMachine.g:3213:1: rule__XEvent__Group__1__Impl : ( ( rule__XEvent__ConvergenceAssignment_1 )? ) ;
    public final void rule__XEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3217:1: ( ( ( rule__XEvent__ConvergenceAssignment_1 )? ) )
            // InternalXMachine.g:3218:1: ( ( rule__XEvent__ConvergenceAssignment_1 )? )
            {
            // InternalXMachine.g:3218:1: ( ( rule__XEvent__ConvergenceAssignment_1 )? )
            // InternalXMachine.g:3219:2: ( rule__XEvent__ConvergenceAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getConvergenceAssignment_1()); 
            }
            // InternalXMachine.g:3220:2: ( rule__XEvent__ConvergenceAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=112 && LA29_0<=114)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXMachine.g:3220:3: rule__XEvent__ConvergenceAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__ConvergenceAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getConvergenceAssignment_1()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3228:1: rule__XEvent__Group__2 : rule__XEvent__Group__2__Impl rule__XEvent__Group__3 ;
    public final void rule__XEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3232:1: ( rule__XEvent__Group__2__Impl rule__XEvent__Group__3 )
            // InternalXMachine.g:3233:2: rule__XEvent__Group__2__Impl rule__XEvent__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:3240:1: rule__XEvent__Group__2__Impl : ( 'event' ) ;
    public final void rule__XEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3244:1: ( ( 'event' ) )
            // InternalXMachine.g:3245:1: ( 'event' )
            {
            // InternalXMachine.g:3245:1: ( 'event' )
            // InternalXMachine.g:3246:2: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEventKeyword_2()); 
            }
            match(input,128,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getEventKeyword_2()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3255:1: rule__XEvent__Group__3 : rule__XEvent__Group__3__Impl rule__XEvent__Group__4 ;
    public final void rule__XEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3259:1: ( rule__XEvent__Group__3__Impl rule__XEvent__Group__4 )
            // InternalXMachine.g:3260:2: rule__XEvent__Group__3__Impl rule__XEvent__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalXMachine.g:3267:1: rule__XEvent__Group__3__Impl : ( ( rule__XEvent__NameAssignment_3 ) ) ;
    public final void rule__XEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3271:1: ( ( ( rule__XEvent__NameAssignment_3 ) ) )
            // InternalXMachine.g:3272:1: ( ( rule__XEvent__NameAssignment_3 ) )
            {
            // InternalXMachine.g:3272:1: ( ( rule__XEvent__NameAssignment_3 ) )
            // InternalXMachine.g:3273:2: ( rule__XEvent__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:3274:2: ( rule__XEvent__NameAssignment_3 )
            // InternalXMachine.g:3274:3: rule__XEvent__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getNameAssignment_3()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3282:1: rule__XEvent__Group__4 : rule__XEvent__Group__4__Impl rule__XEvent__Group__5 ;
    public final void rule__XEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3286:1: ( rule__XEvent__Group__4__Impl rule__XEvent__Group__5 )
            // InternalXMachine.g:3287:2: rule__XEvent__Group__4__Impl rule__XEvent__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalXMachine.g:3294:1: rule__XEvent__Group__4__Impl : ( ( rule__XEvent__Alternatives_4 )? ) ;
    public final void rule__XEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3298:1: ( ( ( rule__XEvent__Alternatives_4 )? ) )
            // InternalXMachine.g:3299:1: ( ( rule__XEvent__Alternatives_4 )? )
            {
            // InternalXMachine.g:3299:1: ( ( rule__XEvent__Alternatives_4 )? )
            // InternalXMachine.g:3300:2: ( rule__XEvent__Alternatives_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_4()); 
            }
            // InternalXMachine.g:3301:2: ( rule__XEvent__Alternatives_4 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==117||LA30_0==137) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXMachine.g:3301:3: rule__XEvent__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Alternatives_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getAlternatives_4()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3309:1: rule__XEvent__Group__5 : rule__XEvent__Group__5__Impl rule__XEvent__Group__6 ;
    public final void rule__XEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3313:1: ( rule__XEvent__Group__5__Impl rule__XEvent__Group__6 )
            // InternalXMachine.g:3314:2: rule__XEvent__Group__5__Impl rule__XEvent__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalXMachine.g:3321:1: rule__XEvent__Group__5__Impl : ( ( rule__XEvent__Group_5__0 )? ) ;
    public final void rule__XEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3325:1: ( ( ( rule__XEvent__Group_5__0 )? ) )
            // InternalXMachine.g:3326:1: ( ( rule__XEvent__Group_5__0 )? )
            {
            // InternalXMachine.g:3326:1: ( ( rule__XEvent__Group_5__0 )? )
            // InternalXMachine.g:3327:2: ( rule__XEvent__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_5()); 
            }
            // InternalXMachine.g:3328:2: ( rule__XEvent__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==129) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXMachine.g:3328:3: rule__XEvent__Group_5__0
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
    // InternalXMachine.g:3336:1: rule__XEvent__Group__6 : rule__XEvent__Group__6__Impl rule__XEvent__Group__7 ;
    public final void rule__XEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3340:1: ( rule__XEvent__Group__6__Impl rule__XEvent__Group__7 )
            // InternalXMachine.g:3341:2: rule__XEvent__Group__6__Impl rule__XEvent__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalXMachine.g:3348:1: rule__XEvent__Group__6__Impl : ( ( rule__XEvent__ExtensionsAssignment_6 )* ) ;
    public final void rule__XEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3352:1: ( ( ( rule__XEvent__ExtensionsAssignment_6 )* ) )
            // InternalXMachine.g:3353:1: ( ( rule__XEvent__ExtensionsAssignment_6 )* )
            {
            // InternalXMachine.g:3353:1: ( ( rule__XEvent__ExtensionsAssignment_6 )* )
            // InternalXMachine.g:3354:2: ( rule__XEvent__ExtensionsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtensionsAssignment_6()); 
            }
            // InternalXMachine.g:3355:2: ( rule__XEvent__ExtensionsAssignment_6 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==133) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalXMachine.g:3355:3: rule__XEvent__ExtensionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__XEvent__ExtensionsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtensionsAssignment_6()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3363:1: rule__XEvent__Group__7 : rule__XEvent__Group__7__Impl rule__XEvent__Group__8 ;
    public final void rule__XEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3367:1: ( rule__XEvent__Group__7__Impl rule__XEvent__Group__8 )
            // InternalXMachine.g:3368:2: rule__XEvent__Group__7__Impl rule__XEvent__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__XEvent__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:3375:1: rule__XEvent__Group__7__Impl : ( ( rule__XEvent__Group_7__0 )? ) ;
    public final void rule__XEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3379:1: ( ( ( rule__XEvent__Group_7__0 )? ) )
            // InternalXMachine.g:3380:1: ( ( rule__XEvent__Group_7__0 )? )
            {
            // InternalXMachine.g:3380:1: ( ( rule__XEvent__Group_7__0 )? )
            // InternalXMachine.g:3381:2: ( rule__XEvent__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_7()); 
            }
            // InternalXMachine.g:3382:2: ( rule__XEvent__Group_7__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==130) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXMachine.g:3382:3: rule__XEvent__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup_7()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__XEvent__Group__8"
    // InternalXMachine.g:3390:1: rule__XEvent__Group__8 : rule__XEvent__Group__8__Impl rule__XEvent__Group__9 ;
    public final void rule__XEvent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3394:1: ( rule__XEvent__Group__8__Impl rule__XEvent__Group__9 )
            // InternalXMachine.g:3395:2: rule__XEvent__Group__8__Impl rule__XEvent__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__XEvent__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__8"


    // $ANTLR start "rule__XEvent__Group__8__Impl"
    // InternalXMachine.g:3402:1: rule__XEvent__Group__8__Impl : ( ( rule__XEvent__Group_8__0 )? ) ;
    public final void rule__XEvent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3406:1: ( ( ( rule__XEvent__Group_8__0 )? ) )
            // InternalXMachine.g:3407:1: ( ( rule__XEvent__Group_8__0 )? )
            {
            // InternalXMachine.g:3407:1: ( ( rule__XEvent__Group_8__0 )? )
            // InternalXMachine.g:3408:2: ( rule__XEvent__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_8()); 
            }
            // InternalXMachine.g:3409:2: ( rule__XEvent__Group_8__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==131) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXMachine.g:3409:3: rule__XEvent__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__8__Impl"


    // $ANTLR start "rule__XEvent__Group__9"
    // InternalXMachine.g:3417:1: rule__XEvent__Group__9 : rule__XEvent__Group__9__Impl rule__XEvent__Group__10 ;
    public final void rule__XEvent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3421:1: ( rule__XEvent__Group__9__Impl rule__XEvent__Group__10 )
            // InternalXMachine.g:3422:2: rule__XEvent__Group__9__Impl rule__XEvent__Group__10
            {
            pushFollow(FOLLOW_24);
            rule__XEvent__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__9"


    // $ANTLR start "rule__XEvent__Group__9__Impl"
    // InternalXMachine.g:3429:1: rule__XEvent__Group__9__Impl : ( ( rule__XEvent__Group_9__0 )? ) ;
    public final void rule__XEvent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3433:1: ( ( ( rule__XEvent__Group_9__0 )? ) )
            // InternalXMachine.g:3434:1: ( ( rule__XEvent__Group_9__0 )? )
            {
            // InternalXMachine.g:3434:1: ( ( rule__XEvent__Group_9__0 )? )
            // InternalXMachine.g:3435:2: ( rule__XEvent__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_9()); 
            }
            // InternalXMachine.g:3436:2: ( rule__XEvent__Group_9__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==132) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXMachine.g:3436:3: rule__XEvent__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__9__Impl"


    // $ANTLR start "rule__XEvent__Group__10"
    // InternalXMachine.g:3444:1: rule__XEvent__Group__10 : rule__XEvent__Group__10__Impl ;
    public final void rule__XEvent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3448:1: ( rule__XEvent__Group__10__Impl )
            // InternalXMachine.g:3449:2: rule__XEvent__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__10"


    // $ANTLR start "rule__XEvent__Group__10__Impl"
    // InternalXMachine.g:3455:1: rule__XEvent__Group__10__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3459:1: ( ( 'end' ) )
            // InternalXMachine.g:3460:1: ( 'end' )
            {
            // InternalXMachine.g:3460:1: ( 'end' )
            // InternalXMachine.g:3461:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEndKeyword_10()); 
            }
            match(input,116,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getEndKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__10__Impl"


    // $ANTLR start "rule__XEvent__Group_4_0__0"
    // InternalXMachine.g:3471:1: rule__XEvent__Group_4_0__0 : rule__XEvent__Group_4_0__0__Impl rule__XEvent__Group_4_0__1 ;
    public final void rule__XEvent__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3475:1: ( rule__XEvent__Group_4_0__0__Impl rule__XEvent__Group_4_0__1 )
            // InternalXMachine.g:3476:2: rule__XEvent__Group_4_0__0__Impl rule__XEvent__Group_4_0__1
            {
            pushFollow(FOLLOW_5);
            rule__XEvent__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4_0__0"


    // $ANTLR start "rule__XEvent__Group_4_0__0__Impl"
    // InternalXMachine.g:3483:1: rule__XEvent__Group_4_0__0__Impl : ( 'refines' ) ;
    public final void rule__XEvent__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3487:1: ( ( 'refines' ) )
            // InternalXMachine.g:3488:1: ( 'refines' )
            {
            // InternalXMachine.g:3488:1: ( 'refines' )
            // InternalXMachine.g:3489:2: 'refines'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesKeyword_4_0_0()); 
            }
            match(input,117,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4_0__0__Impl"


    // $ANTLR start "rule__XEvent__Group_4_0__1"
    // InternalXMachine.g:3498:1: rule__XEvent__Group_4_0__1 : rule__XEvent__Group_4_0__1__Impl ;
    public final void rule__XEvent__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3502:1: ( rule__XEvent__Group_4_0__1__Impl )
            // InternalXMachine.g:3503:2: rule__XEvent__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4_0__1"


    // $ANTLR start "rule__XEvent__Group_4_0__1__Impl"
    // InternalXMachine.g:3509:1: rule__XEvent__Group_4_0__1__Impl : ( ( ( rule__XEvent__RefinesAssignment_4_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_0_1 )* ) ) ;
    public final void rule__XEvent__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3513:1: ( ( ( ( rule__XEvent__RefinesAssignment_4_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_0_1 )* ) ) )
            // InternalXMachine.g:3514:1: ( ( ( rule__XEvent__RefinesAssignment_4_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_0_1 )* ) )
            {
            // InternalXMachine.g:3514:1: ( ( ( rule__XEvent__RefinesAssignment_4_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_0_1 )* ) )
            // InternalXMachine.g:3515:2: ( ( rule__XEvent__RefinesAssignment_4_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_0_1 )* )
            {
            // InternalXMachine.g:3515:2: ( ( rule__XEvent__RefinesAssignment_4_0_1 ) )
            // InternalXMachine.g:3516:3: ( rule__XEvent__RefinesAssignment_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_4_0_1()); 
            }
            // InternalXMachine.g:3517:3: ( rule__XEvent__RefinesAssignment_4_0_1 )
            // InternalXMachine.g:3517:4: rule__XEvent__RefinesAssignment_4_0_1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__RefinesAssignment_4_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesAssignment_4_0_1()); 
            }

            }

            // InternalXMachine.g:3520:2: ( ( rule__XEvent__RefinesAssignment_4_0_1 )* )
            // InternalXMachine.g:3521:3: ( rule__XEvent__RefinesAssignment_4_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_4_0_1()); 
            }
            // InternalXMachine.g:3522:3: ( rule__XEvent__RefinesAssignment_4_0_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalXMachine.g:3522:4: rule__XEvent__RefinesAssignment_4_0_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XEvent__RefinesAssignment_4_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesAssignment_4_0_1()); 
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
    // $ANTLR end "rule__XEvent__Group_4_0__1__Impl"


    // $ANTLR start "rule__XEvent__Group_4_1__0"
    // InternalXMachine.g:3532:1: rule__XEvent__Group_4_1__0 : rule__XEvent__Group_4_1__0__Impl rule__XEvent__Group_4_1__1 ;
    public final void rule__XEvent__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3536:1: ( rule__XEvent__Group_4_1__0__Impl rule__XEvent__Group_4_1__1 )
            // InternalXMachine.g:3537:2: rule__XEvent__Group_4_1__0__Impl rule__XEvent__Group_4_1__1
            {
            pushFollow(FOLLOW_5);
            rule__XEvent__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4_1__0"


    // $ANTLR start "rule__XEvent__Group_4_1__0__Impl"
    // InternalXMachine.g:3544:1: rule__XEvent__Group_4_1__0__Impl : ( ( rule__XEvent__ExtendedAssignment_4_1_0 ) ) ;
    public final void rule__XEvent__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3548:1: ( ( ( rule__XEvent__ExtendedAssignment_4_1_0 ) ) )
            // InternalXMachine.g:3549:1: ( ( rule__XEvent__ExtendedAssignment_4_1_0 ) )
            {
            // InternalXMachine.g:3549:1: ( ( rule__XEvent__ExtendedAssignment_4_1_0 ) )
            // InternalXMachine.g:3550:2: ( rule__XEvent__ExtendedAssignment_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedAssignment_4_1_0()); 
            }
            // InternalXMachine.g:3551:2: ( rule__XEvent__ExtendedAssignment_4_1_0 )
            // InternalXMachine.g:3551:3: rule__XEvent__ExtendedAssignment_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__ExtendedAssignment_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtendedAssignment_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4_1__0__Impl"


    // $ANTLR start "rule__XEvent__Group_4_1__1"
    // InternalXMachine.g:3559:1: rule__XEvent__Group_4_1__1 : rule__XEvent__Group_4_1__1__Impl ;
    public final void rule__XEvent__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3563:1: ( rule__XEvent__Group_4_1__1__Impl )
            // InternalXMachine.g:3564:2: rule__XEvent__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4_1__1"


    // $ANTLR start "rule__XEvent__Group_4_1__1__Impl"
    // InternalXMachine.g:3570:1: rule__XEvent__Group_4_1__1__Impl : ( ( rule__XEvent__RefinesAssignment_4_1_1 ) ) ;
    public final void rule__XEvent__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3574:1: ( ( ( rule__XEvent__RefinesAssignment_4_1_1 ) ) )
            // InternalXMachine.g:3575:1: ( ( rule__XEvent__RefinesAssignment_4_1_1 ) )
            {
            // InternalXMachine.g:3575:1: ( ( rule__XEvent__RefinesAssignment_4_1_1 ) )
            // InternalXMachine.g:3576:2: ( rule__XEvent__RefinesAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_4_1_1()); 
            }
            // InternalXMachine.g:3577:2: ( rule__XEvent__RefinesAssignment_4_1_1 )
            // InternalXMachine.g:3577:3: rule__XEvent__RefinesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__RefinesAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4_1__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5__0"
    // InternalXMachine.g:3586:1: rule__XEvent__Group_5__0 : rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1 ;
    public final void rule__XEvent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3590:1: ( rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1 )
            // InternalXMachine.g:3591:2: rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:3598:1: rule__XEvent__Group_5__0__Impl : ( 'any' ) ;
    public final void rule__XEvent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3602:1: ( ( 'any' ) )
            // InternalXMachine.g:3603:1: ( 'any' )
            {
            // InternalXMachine.g:3603:1: ( 'any' )
            // InternalXMachine.g:3604:2: 'any'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAnyKeyword_5_0()); 
            }
            match(input,129,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getAnyKeyword_5_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3613:1: rule__XEvent__Group_5__1 : rule__XEvent__Group_5__1__Impl ;
    public final void rule__XEvent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3617:1: ( rule__XEvent__Group_5__1__Impl )
            // InternalXMachine.g:3618:2: rule__XEvent__Group_5__1__Impl
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
    // InternalXMachine.g:3624:1: rule__XEvent__Group_5__1__Impl : ( ( ( rule__XEvent__ParametersAssignment_5_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_1 )* ) ) ;
    public final void rule__XEvent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3628:1: ( ( ( ( rule__XEvent__ParametersAssignment_5_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_1 )* ) ) )
            // InternalXMachine.g:3629:1: ( ( ( rule__XEvent__ParametersAssignment_5_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_1 )* ) )
            {
            // InternalXMachine.g:3629:1: ( ( ( rule__XEvent__ParametersAssignment_5_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_1 )* ) )
            // InternalXMachine.g:3630:2: ( ( rule__XEvent__ParametersAssignment_5_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_1 )* )
            {
            // InternalXMachine.g:3630:2: ( ( rule__XEvent__ParametersAssignment_5_1 ) )
            // InternalXMachine.g:3631:3: ( rule__XEvent__ParametersAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getParametersAssignment_5_1()); 
            }
            // InternalXMachine.g:3632:3: ( rule__XEvent__ParametersAssignment_5_1 )
            // InternalXMachine.g:3632:4: rule__XEvent__ParametersAssignment_5_1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__ParametersAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getParametersAssignment_5_1()); 
            }

            }

            // InternalXMachine.g:3635:2: ( ( rule__XEvent__ParametersAssignment_5_1 )* )
            // InternalXMachine.g:3636:3: ( rule__XEvent__ParametersAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getParametersAssignment_5_1()); 
            }
            // InternalXMachine.g:3637:3: ( rule__XEvent__ParametersAssignment_5_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalXMachine.g:3637:4: rule__XEvent__ParametersAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XEvent__ParametersAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getParametersAssignment_5_1()); 
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


    // $ANTLR start "rule__XEvent__Group_7__0"
    // InternalXMachine.g:3647:1: rule__XEvent__Group_7__0 : rule__XEvent__Group_7__0__Impl rule__XEvent__Group_7__1 ;
    public final void rule__XEvent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3651:1: ( rule__XEvent__Group_7__0__Impl rule__XEvent__Group_7__1 )
            // InternalXMachine.g:3652:2: rule__XEvent__Group_7__0__Impl rule__XEvent__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_7__0"


    // $ANTLR start "rule__XEvent__Group_7__0__Impl"
    // InternalXMachine.g:3659:1: rule__XEvent__Group_7__0__Impl : ( 'where' ) ;
    public final void rule__XEvent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3663:1: ( ( 'where' ) )
            // InternalXMachine.g:3664:1: ( 'where' )
            {
            // InternalXMachine.g:3664:1: ( 'where' )
            // InternalXMachine.g:3665:2: 'where'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWhereKeyword_7_0()); 
            }
            match(input,130,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWhereKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_7__0__Impl"


    // $ANTLR start "rule__XEvent__Group_7__1"
    // InternalXMachine.g:3674:1: rule__XEvent__Group_7__1 : rule__XEvent__Group_7__1__Impl ;
    public final void rule__XEvent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3678:1: ( rule__XEvent__Group_7__1__Impl )
            // InternalXMachine.g:3679:2: rule__XEvent__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_7__1"


    // $ANTLR start "rule__XEvent__Group_7__1__Impl"
    // InternalXMachine.g:3685:1: rule__XEvent__Group_7__1__Impl : ( ( ( rule__XEvent__GuardsAssignment_7_1 ) ) ( ( rule__XEvent__GuardsAssignment_7_1 )* ) ) ;
    public final void rule__XEvent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3689:1: ( ( ( ( rule__XEvent__GuardsAssignment_7_1 ) ) ( ( rule__XEvent__GuardsAssignment_7_1 )* ) ) )
            // InternalXMachine.g:3690:1: ( ( ( rule__XEvent__GuardsAssignment_7_1 ) ) ( ( rule__XEvent__GuardsAssignment_7_1 )* ) )
            {
            // InternalXMachine.g:3690:1: ( ( ( rule__XEvent__GuardsAssignment_7_1 ) ) ( ( rule__XEvent__GuardsAssignment_7_1 )* ) )
            // InternalXMachine.g:3691:2: ( ( rule__XEvent__GuardsAssignment_7_1 ) ) ( ( rule__XEvent__GuardsAssignment_7_1 )* )
            {
            // InternalXMachine.g:3691:2: ( ( rule__XEvent__GuardsAssignment_7_1 ) )
            // InternalXMachine.g:3692:3: ( rule__XEvent__GuardsAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsAssignment_7_1()); 
            }
            // InternalXMachine.g:3693:3: ( rule__XEvent__GuardsAssignment_7_1 )
            // InternalXMachine.g:3693:4: rule__XEvent__GuardsAssignment_7_1
            {
            pushFollow(FOLLOW_11);
            rule__XEvent__GuardsAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGuardsAssignment_7_1()); 
            }

            }

            // InternalXMachine.g:3696:2: ( ( rule__XEvent__GuardsAssignment_7_1 )* )
            // InternalXMachine.g:3697:3: ( rule__XEvent__GuardsAssignment_7_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsAssignment_7_1()); 
            }
            // InternalXMachine.g:3698:3: ( rule__XEvent__GuardsAssignment_7_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_XLABEL||LA38_0==136) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalXMachine.g:3698:4: rule__XEvent__GuardsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__XEvent__GuardsAssignment_7_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGuardsAssignment_7_1()); 
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
    // $ANTLR end "rule__XEvent__Group_7__1__Impl"


    // $ANTLR start "rule__XEvent__Group_8__0"
    // InternalXMachine.g:3708:1: rule__XEvent__Group_8__0 : rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1 ;
    public final void rule__XEvent__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3712:1: ( rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1 )
            // InternalXMachine.g:3713:2: rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__XEvent__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_8__0"


    // $ANTLR start "rule__XEvent__Group_8__0__Impl"
    // InternalXMachine.g:3720:1: rule__XEvent__Group_8__0__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3724:1: ( ( 'then' ) )
            // InternalXMachine.g:3725:1: ( 'then' )
            {
            // InternalXMachine.g:3725:1: ( 'then' )
            // InternalXMachine.g:3726:2: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getThenKeyword_8_0()); 
            }
            match(input,131,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getThenKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_8__0__Impl"


    // $ANTLR start "rule__XEvent__Group_8__1"
    // InternalXMachine.g:3735:1: rule__XEvent__Group_8__1 : rule__XEvent__Group_8__1__Impl ;
    public final void rule__XEvent__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3739:1: ( rule__XEvent__Group_8__1__Impl )
            // InternalXMachine.g:3740:2: rule__XEvent__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_8__1"


    // $ANTLR start "rule__XEvent__Group_8__1__Impl"
    // InternalXMachine.g:3746:1: rule__XEvent__Group_8__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_8_1 ) ) ( ( rule__XEvent__ActionsAssignment_8_1 )* ) ) ;
    public final void rule__XEvent__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3750:1: ( ( ( ( rule__XEvent__ActionsAssignment_8_1 ) ) ( ( rule__XEvent__ActionsAssignment_8_1 )* ) ) )
            // InternalXMachine.g:3751:1: ( ( ( rule__XEvent__ActionsAssignment_8_1 ) ) ( ( rule__XEvent__ActionsAssignment_8_1 )* ) )
            {
            // InternalXMachine.g:3751:1: ( ( ( rule__XEvent__ActionsAssignment_8_1 ) ) ( ( rule__XEvent__ActionsAssignment_8_1 )* ) )
            // InternalXMachine.g:3752:2: ( ( rule__XEvent__ActionsAssignment_8_1 ) ) ( ( rule__XEvent__ActionsAssignment_8_1 )* )
            {
            // InternalXMachine.g:3752:2: ( ( rule__XEvent__ActionsAssignment_8_1 ) )
            // InternalXMachine.g:3753:3: ( rule__XEvent__ActionsAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_8_1()); 
            }
            // InternalXMachine.g:3754:3: ( rule__XEvent__ActionsAssignment_8_1 )
            // InternalXMachine.g:3754:4: rule__XEvent__ActionsAssignment_8_1
            {
            pushFollow(FOLLOW_13);
            rule__XEvent__ActionsAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getActionsAssignment_8_1()); 
            }

            }

            // InternalXMachine.g:3757:2: ( ( rule__XEvent__ActionsAssignment_8_1 )* )
            // InternalXMachine.g:3758:3: ( rule__XEvent__ActionsAssignment_8_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_8_1()); 
            }
            // InternalXMachine.g:3759:3: ( rule__XEvent__ActionsAssignment_8_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_XLABEL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalXMachine.g:3759:4: rule__XEvent__ActionsAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__XEvent__ActionsAssignment_8_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getActionsAssignment_8_1()); 
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
    // $ANTLR end "rule__XEvent__Group_8__1__Impl"


    // $ANTLR start "rule__XEvent__Group_9__0"
    // InternalXMachine.g:3769:1: rule__XEvent__Group_9__0 : rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1 ;
    public final void rule__XEvent__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3773:1: ( rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1 )
            // InternalXMachine.g:3774:2: rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1
            {
            pushFollow(FOLLOW_12);
            rule__XEvent__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_9__0"


    // $ANTLR start "rule__XEvent__Group_9__0__Impl"
    // InternalXMachine.g:3781:1: rule__XEvent__Group_9__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3785:1: ( ( 'with' ) )
            // InternalXMachine.g:3786:1: ( 'with' )
            {
            // InternalXMachine.g:3786:1: ( 'with' )
            // InternalXMachine.g:3787:2: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWithKeyword_9_0()); 
            }
            match(input,132,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWithKeyword_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_9__0__Impl"


    // $ANTLR start "rule__XEvent__Group_9__1"
    // InternalXMachine.g:3796:1: rule__XEvent__Group_9__1 : rule__XEvent__Group_9__1__Impl ;
    public final void rule__XEvent__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3800:1: ( rule__XEvent__Group_9__1__Impl )
            // InternalXMachine.g:3801:2: rule__XEvent__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_9__1"


    // $ANTLR start "rule__XEvent__Group_9__1__Impl"
    // InternalXMachine.g:3807:1: rule__XEvent__Group_9__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_9_1 ) ) ( ( rule__XEvent__WitnessesAssignment_9_1 )* ) ) ;
    public final void rule__XEvent__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3811:1: ( ( ( ( rule__XEvent__WitnessesAssignment_9_1 ) ) ( ( rule__XEvent__WitnessesAssignment_9_1 )* ) ) )
            // InternalXMachine.g:3812:1: ( ( ( rule__XEvent__WitnessesAssignment_9_1 ) ) ( ( rule__XEvent__WitnessesAssignment_9_1 )* ) )
            {
            // InternalXMachine.g:3812:1: ( ( ( rule__XEvent__WitnessesAssignment_9_1 ) ) ( ( rule__XEvent__WitnessesAssignment_9_1 )* ) )
            // InternalXMachine.g:3813:2: ( ( rule__XEvent__WitnessesAssignment_9_1 ) ) ( ( rule__XEvent__WitnessesAssignment_9_1 )* )
            {
            // InternalXMachine.g:3813:2: ( ( rule__XEvent__WitnessesAssignment_9_1 ) )
            // InternalXMachine.g:3814:3: ( rule__XEvent__WitnessesAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_9_1()); 
            }
            // InternalXMachine.g:3815:3: ( rule__XEvent__WitnessesAssignment_9_1 )
            // InternalXMachine.g:3815:4: rule__XEvent__WitnessesAssignment_9_1
            {
            pushFollow(FOLLOW_13);
            rule__XEvent__WitnessesAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWitnessesAssignment_9_1()); 
            }

            }

            // InternalXMachine.g:3818:2: ( ( rule__XEvent__WitnessesAssignment_9_1 )* )
            // InternalXMachine.g:3819:3: ( rule__XEvent__WitnessesAssignment_9_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_9_1()); 
            }
            // InternalXMachine.g:3820:3: ( rule__XEvent__WitnessesAssignment_9_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_XLABEL) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalXMachine.g:3820:4: rule__XEvent__WitnessesAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__XEvent__WitnessesAssignment_9_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWitnessesAssignment_9_1()); 
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
    // $ANTLR end "rule__XEvent__Group_9__1__Impl"


    // $ANTLR start "rule__EventSync__Group__0"
    // InternalXMachine.g:3830:1: rule__EventSync__Group__0 : rule__EventSync__Group__0__Impl rule__EventSync__Group__1 ;
    public final void rule__EventSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3834:1: ( rule__EventSync__Group__0__Impl rule__EventSync__Group__1 )
            // InternalXMachine.g:3835:2: rule__EventSync__Group__0__Impl rule__EventSync__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalXMachine.g:3842:1: rule__EventSync__Group__0__Impl : ( () ) ;
    public final void rule__EventSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3846:1: ( ( () ) )
            // InternalXMachine.g:3847:1: ( () )
            {
            // InternalXMachine.g:3847:1: ( () )
            // InternalXMachine.g:3848:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 
            }
            // InternalXMachine.g:3849:2: ()
            // InternalXMachine.g:3849:3: 
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
    // InternalXMachine.g:3857:1: rule__EventSync__Group__1 : rule__EventSync__Group__1__Impl rule__EventSync__Group__2 ;
    public final void rule__EventSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3861:1: ( rule__EventSync__Group__1__Impl rule__EventSync__Group__2 )
            // InternalXMachine.g:3862:2: rule__EventSync__Group__1__Impl rule__EventSync__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalXMachine.g:3869:1: rule__EventSync__Group__1__Impl : ( ( rule__EventSync__Group_1__0 ) ) ;
    public final void rule__EventSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3873:1: ( ( ( rule__EventSync__Group_1__0 ) ) )
            // InternalXMachine.g:3874:1: ( ( rule__EventSync__Group_1__0 ) )
            {
            // InternalXMachine.g:3874:1: ( ( rule__EventSync__Group_1__0 ) )
            // InternalXMachine.g:3875:2: ( rule__EventSync__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup_1()); 
            }
            // InternalXMachine.g:3876:2: ( rule__EventSync__Group_1__0 )
            // InternalXMachine.g:3876:3: rule__EventSync__Group_1__0
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
    // InternalXMachine.g:3884:1: rule__EventSync__Group__2 : rule__EventSync__Group__2__Impl ;
    public final void rule__EventSync__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3888:1: ( rule__EventSync__Group__2__Impl )
            // InternalXMachine.g:3889:2: rule__EventSync__Group__2__Impl
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
    // InternalXMachine.g:3895:1: rule__EventSync__Group__2__Impl : ( ( ruleXSyncParameters )? ) ;
    public final void rule__EventSync__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3899:1: ( ( ( ruleXSyncParameters )? ) )
            // InternalXMachine.g:3900:1: ( ( ruleXSyncParameters )? )
            {
            // InternalXMachine.g:3900:1: ( ( ruleXSyncParameters )? )
            // InternalXMachine.g:3901:2: ( ruleXSyncParameters )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getXSyncParametersParserRuleCall_2()); 
            }
            // InternalXMachine.g:3902:2: ( ruleXSyncParameters )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==85) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXMachine.g:3902:3: ruleXSyncParameters
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
    // InternalXMachine.g:3911:1: rule__EventSync__Group_1__0 : rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 ;
    public final void rule__EventSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3915:1: ( rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 )
            // InternalXMachine.g:3916:2: rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalXMachine.g:3923:1: rule__EventSync__Group_1__0__Impl : ( 'synchronises' ) ;
    public final void rule__EventSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3927:1: ( ( 'synchronises' ) )
            // InternalXMachine.g:3928:1: ( 'synchronises' )
            {
            // InternalXMachine.g:3928:1: ( 'synchronises' )
            // InternalXMachine.g:3929:2: 'synchronises'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0()); 
            }
            match(input,133,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3938:1: rule__EventSync__Group_1__1 : rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 ;
    public final void rule__EventSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3942:1: ( rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 )
            // InternalXMachine.g:3943:2: rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:3950:1: rule__EventSync__Group_1__1__Impl : ( 'event' ) ;
    public final void rule__EventSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3954:1: ( ( 'event' ) )
            // InternalXMachine.g:3955:1: ( 'event' )
            {
            // InternalXMachine.g:3955:1: ( 'event' )
            // InternalXMachine.g:3956:2: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getEventKeyword_1_1()); 
            }
            match(input,128,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getEventKeyword_1_1()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3965:1: rule__EventSync__Group_1__2 : rule__EventSync__Group_1__2__Impl rule__EventSync__Group_1__3 ;
    public final void rule__EventSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3969:1: ( rule__EventSync__Group_1__2__Impl rule__EventSync__Group_1__3 )
            // InternalXMachine.g:3970:2: rule__EventSync__Group_1__2__Impl rule__EventSync__Group_1__3
            {
            pushFollow(FOLLOW_5);
            rule__EventSync__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:3977:1: rule__EventSync__Group_1__2__Impl : ( ( rule__EventSync__Group_1_2__0 )? ) ;
    public final void rule__EventSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3981:1: ( ( ( rule__EventSync__Group_1_2__0 )? ) )
            // InternalXMachine.g:3982:1: ( ( rule__EventSync__Group_1_2__0 )? )
            {
            // InternalXMachine.g:3982:1: ( ( rule__EventSync__Group_1_2__0 )? )
            // InternalXMachine.g:3983:2: ( rule__EventSync__Group_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup_1_2()); 
            }
            // InternalXMachine.g:3984:2: ( rule__EventSync__Group_1_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==51) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalXMachine.g:3984:3: rule__EventSync__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventSync__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getGroup_1_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__EventSync__Group_1__3"
    // InternalXMachine.g:3992:1: rule__EventSync__Group_1__3 : rule__EventSync__Group_1__3__Impl ;
    public final void rule__EventSync__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3996:1: ( rule__EventSync__Group_1__3__Impl )
            // InternalXMachine.g:3997:2: rule__EventSync__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__3"


    // $ANTLR start "rule__EventSync__Group_1__3__Impl"
    // InternalXMachine.g:4003:1: rule__EventSync__Group_1__3__Impl : ( ( rule__EventSync__SynchronisedEventAssignment_1_3 ) ) ;
    public final void rule__EventSync__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4007:1: ( ( ( rule__EventSync__SynchronisedEventAssignment_1_3 ) ) )
            // InternalXMachine.g:4008:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_3 ) )
            {
            // InternalXMachine.g:4008:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_3 ) )
            // InternalXMachine.g:4009:2: ( rule__EventSync__SynchronisedEventAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_3()); 
            }
            // InternalXMachine.g:4010:2: ( rule__EventSync__SynchronisedEventAssignment_1_3 )
            // InternalXMachine.g:4010:3: rule__EventSync__SynchronisedEventAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__SynchronisedEventAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__3__Impl"


    // $ANTLR start "rule__EventSync__Group_1_2__0"
    // InternalXMachine.g:4019:1: rule__EventSync__Group_1_2__0 : rule__EventSync__Group_1_2__0__Impl rule__EventSync__Group_1_2__1 ;
    public final void rule__EventSync__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4023:1: ( rule__EventSync__Group_1_2__0__Impl rule__EventSync__Group_1_2__1 )
            // InternalXMachine.g:4024:2: rule__EventSync__Group_1_2__0__Impl rule__EventSync__Group_1_2__1
            {
            pushFollow(FOLLOW_17);
            rule__EventSync__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1_2__0"


    // $ANTLR start "rule__EventSync__Group_1_2__0__Impl"
    // InternalXMachine.g:4031:1: rule__EventSync__Group_1_2__0__Impl : ( ( rule__EventSync__PrefixAssignment_1_2_0 ) ) ;
    public final void rule__EventSync__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4035:1: ( ( ( rule__EventSync__PrefixAssignment_1_2_0 ) ) )
            // InternalXMachine.g:4036:1: ( ( rule__EventSync__PrefixAssignment_1_2_0 ) )
            {
            // InternalXMachine.g:4036:1: ( ( rule__EventSync__PrefixAssignment_1_2_0 ) )
            // InternalXMachine.g:4037:2: ( rule__EventSync__PrefixAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_2_0()); 
            }
            // InternalXMachine.g:4038:2: ( rule__EventSync__PrefixAssignment_1_2_0 )
            // InternalXMachine.g:4038:3: rule__EventSync__PrefixAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__PrefixAssignment_1_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1_2__0__Impl"


    // $ANTLR start "rule__EventSync__Group_1_2__1"
    // InternalXMachine.g:4046:1: rule__EventSync__Group_1_2__1 : rule__EventSync__Group_1_2__1__Impl ;
    public final void rule__EventSync__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4050:1: ( rule__EventSync__Group_1_2__1__Impl )
            // InternalXMachine.g:4051:2: rule__EventSync__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1_2__1"


    // $ANTLR start "rule__EventSync__Group_1_2__1__Impl"
    // InternalXMachine.g:4057:1: rule__EventSync__Group_1_2__1__Impl : ( '.' ) ;
    public final void rule__EventSync__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4061:1: ( ( '.' ) )
            // InternalXMachine.g:4062:1: ( '.' )
            {
            // InternalXMachine.g:4062:1: ( '.' )
            // InternalXMachine.g:4063:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getFullStopKeyword_1_2_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getFullStopKeyword_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1_2__1__Impl"


    // $ANTLR start "rule__XSyncParameters__Group__0"
    // InternalXMachine.g:4073:1: rule__XSyncParameters__Group__0 : rule__XSyncParameters__Group__0__Impl rule__XSyncParameters__Group__1 ;
    public final void rule__XSyncParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4077:1: ( rule__XSyncParameters__Group__0__Impl rule__XSyncParameters__Group__1 )
            // InternalXMachine.g:4078:2: rule__XSyncParameters__Group__0__Impl rule__XSyncParameters__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:4085:1: rule__XSyncParameters__Group__0__Impl : ( '[' ) ;
    public final void rule__XSyncParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4089:1: ( ( '[' ) )
            // InternalXMachine.g:4090:1: ( '[' )
            {
            // InternalXMachine.g:4090:1: ( '[' )
            // InternalXMachine.g:4091:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXSyncParametersAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,85,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4100:1: rule__XSyncParameters__Group__1 : rule__XSyncParameters__Group__1__Impl rule__XSyncParameters__Group__2 ;
    public final void rule__XSyncParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4104:1: ( rule__XSyncParameters__Group__1__Impl rule__XSyncParameters__Group__2 )
            // InternalXMachine.g:4105:2: rule__XSyncParameters__Group__1__Impl rule__XSyncParameters__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalXMachine.g:4112:1: rule__XSyncParameters__Group__1__Impl : ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) ;
    public final void rule__XSyncParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4116:1: ( ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) )
            // InternalXMachine.g:4117:1: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            {
            // InternalXMachine.g:4117:1: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            // InternalXMachine.g:4118:2: ( ( RULE_ID ) ) ( ( RULE_ID )* )
            {
            // InternalXMachine.g:4118:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4119:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXSyncParametersAccess().getIDTerminalRuleCall_1()); 
            }
            // InternalXMachine.g:4120:3: ( RULE_ID )
            // InternalXMachine.g:4120:4: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_9); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXSyncParametersAccess().getIDTerminalRuleCall_1()); 
            }

            }

            // InternalXMachine.g:4123:2: ( ( RULE_ID )* )
            // InternalXMachine.g:4124:3: ( RULE_ID )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXSyncParametersAccess().getIDTerminalRuleCall_1()); 
            }
            // InternalXMachine.g:4125:3: ( RULE_ID )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalXMachine.g:4125:4: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_9); if (state.failed) return ;

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
    // InternalXMachine.g:4134:1: rule__XSyncParameters__Group__2 : rule__XSyncParameters__Group__2__Impl ;
    public final void rule__XSyncParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4138:1: ( rule__XSyncParameters__Group__2__Impl )
            // InternalXMachine.g:4139:2: rule__XSyncParameters__Group__2__Impl
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
    // InternalXMachine.g:4145:1: rule__XSyncParameters__Group__2__Impl : ( ']' ) ;
    public final void rule__XSyncParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4149:1: ( ( ']' ) )
            // InternalXMachine.g:4150:1: ( ']' )
            {
            // InternalXMachine.g:4150:1: ( ']' )
            // InternalXMachine.g:4151:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXSyncParametersAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,86,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4161:1: rule__GroupSync__Group__0 : rule__GroupSync__Group__0__Impl rule__GroupSync__Group__1 ;
    public final void rule__GroupSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4165:1: ( rule__GroupSync__Group__0__Impl rule__GroupSync__Group__1 )
            // InternalXMachine.g:4166:2: rule__GroupSync__Group__0__Impl rule__GroupSync__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalXMachine.g:4173:1: rule__GroupSync__Group__0__Impl : ( () ) ;
    public final void rule__GroupSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4177:1: ( ( () ) )
            // InternalXMachine.g:4178:1: ( () )
            {
            // InternalXMachine.g:4178:1: ( () )
            // InternalXMachine.g:4179:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getEventSynchronisationAction_0()); 
            }
            // InternalXMachine.g:4180:2: ()
            // InternalXMachine.g:4180:3: 
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
    // InternalXMachine.g:4188:1: rule__GroupSync__Group__1 : rule__GroupSync__Group__1__Impl rule__GroupSync__Group__2 ;
    public final void rule__GroupSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4192:1: ( rule__GroupSync__Group__1__Impl rule__GroupSync__Group__2 )
            // InternalXMachine.g:4193:2: rule__GroupSync__Group__1__Impl rule__GroupSync__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalXMachine.g:4200:1: rule__GroupSync__Group__1__Impl : ( ( rule__GroupSync__Group_1__0 ) ) ;
    public final void rule__GroupSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4204:1: ( ( ( rule__GroupSync__Group_1__0 ) ) )
            // InternalXMachine.g:4205:1: ( ( rule__GroupSync__Group_1__0 ) )
            {
            // InternalXMachine.g:4205:1: ( ( rule__GroupSync__Group_1__0 ) )
            // InternalXMachine.g:4206:2: ( rule__GroupSync__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getGroup_1()); 
            }
            // InternalXMachine.g:4207:2: ( rule__GroupSync__Group_1__0 )
            // InternalXMachine.g:4207:3: rule__GroupSync__Group_1__0
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
    // InternalXMachine.g:4215:1: rule__GroupSync__Group__2 : rule__GroupSync__Group__2__Impl ;
    public final void rule__GroupSync__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4219:1: ( rule__GroupSync__Group__2__Impl )
            // InternalXMachine.g:4220:2: rule__GroupSync__Group__2__Impl
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
    // InternalXMachine.g:4226:1: rule__GroupSync__Group__2__Impl : ( ( rule__GroupSync__Group_2__0 )? ) ;
    public final void rule__GroupSync__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4230:1: ( ( ( rule__GroupSync__Group_2__0 )? ) )
            // InternalXMachine.g:4231:1: ( ( rule__GroupSync__Group_2__0 )? )
            {
            // InternalXMachine.g:4231:1: ( ( rule__GroupSync__Group_2__0 )? )
            // InternalXMachine.g:4232:2: ( rule__GroupSync__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getGroup_2()); 
            }
            // InternalXMachine.g:4233:2: ( rule__GroupSync__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==35) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalXMachine.g:4233:3: rule__GroupSync__Group_2__0
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
    // InternalXMachine.g:4242:1: rule__GroupSync__Group_1__0 : rule__GroupSync__Group_1__0__Impl rule__GroupSync__Group_1__1 ;
    public final void rule__GroupSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4246:1: ( rule__GroupSync__Group_1__0__Impl rule__GroupSync__Group_1__1 )
            // InternalXMachine.g:4247:2: rule__GroupSync__Group_1__0__Impl rule__GroupSync__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:4254:1: rule__GroupSync__Group_1__0__Impl : ( 'synchronises' ) ;
    public final void rule__GroupSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4258:1: ( ( 'synchronises' ) )
            // InternalXMachine.g:4259:1: ( 'synchronises' )
            {
            // InternalXMachine.g:4259:1: ( 'synchronises' )
            // InternalXMachine.g:4260:2: 'synchronises'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getSynchronisesKeyword_1_0()); 
            }
            match(input,133,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4269:1: rule__GroupSync__Group_1__1 : rule__GroupSync__Group_1__1__Impl rule__GroupSync__Group_1__2 ;
    public final void rule__GroupSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4273:1: ( rule__GroupSync__Group_1__1__Impl rule__GroupSync__Group_1__2 )
            // InternalXMachine.g:4274:2: rule__GroupSync__Group_1__1__Impl rule__GroupSync__Group_1__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:4281:1: rule__GroupSync__Group_1__1__Impl : ( ( rule__GroupSync__Group_1_1__0 )? ) ;
    public final void rule__GroupSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4285:1: ( ( ( rule__GroupSync__Group_1_1__0 )? ) )
            // InternalXMachine.g:4286:1: ( ( rule__GroupSync__Group_1_1__0 )? )
            {
            // InternalXMachine.g:4286:1: ( ( rule__GroupSync__Group_1_1__0 )? )
            // InternalXMachine.g:4287:2: ( rule__GroupSync__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getGroup_1_1()); 
            }
            // InternalXMachine.g:4288:2: ( rule__GroupSync__Group_1_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==51) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:4288:3: rule__GroupSync__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroupSync__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getGroup_1_1()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:4296:1: rule__GroupSync__Group_1__2 : rule__GroupSync__Group_1__2__Impl ;
    public final void rule__GroupSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4300:1: ( rule__GroupSync__Group_1__2__Impl )
            // InternalXMachine.g:4301:2: rule__GroupSync__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:4307:1: rule__GroupSync__Group_1__2__Impl : ( ( rule__GroupSync__SynchronisedCasesAssignment_1_2 ) ) ;
    public final void rule__GroupSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4311:1: ( ( ( rule__GroupSync__SynchronisedCasesAssignment_1_2 ) ) )
            // InternalXMachine.g:4312:1: ( ( rule__GroupSync__SynchronisedCasesAssignment_1_2 ) )
            {
            // InternalXMachine.g:4312:1: ( ( rule__GroupSync__SynchronisedCasesAssignment_1_2 ) )
            // InternalXMachine.g:4313:2: ( rule__GroupSync__SynchronisedCasesAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getSynchronisedCasesAssignment_1_2()); 
            }
            // InternalXMachine.g:4314:2: ( rule__GroupSync__SynchronisedCasesAssignment_1_2 )
            // InternalXMachine.g:4314:3: rule__GroupSync__SynchronisedCasesAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__SynchronisedCasesAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getSynchronisedCasesAssignment_1_2()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:4323:1: rule__GroupSync__Group_1_1__0 : rule__GroupSync__Group_1_1__0__Impl rule__GroupSync__Group_1_1__1 ;
    public final void rule__GroupSync__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4327:1: ( rule__GroupSync__Group_1_1__0__Impl rule__GroupSync__Group_1_1__1 )
            // InternalXMachine.g:4328:2: rule__GroupSync__Group_1_1__0__Impl rule__GroupSync__Group_1_1__1
            {
            pushFollow(FOLLOW_17);
            rule__GroupSync__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:4335:1: rule__GroupSync__Group_1_1__0__Impl : ( ( rule__GroupSync__PrefixAssignment_1_1_0 ) ) ;
    public final void rule__GroupSync__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4339:1: ( ( ( rule__GroupSync__PrefixAssignment_1_1_0 ) ) )
            // InternalXMachine.g:4340:1: ( ( rule__GroupSync__PrefixAssignment_1_1_0 ) )
            {
            // InternalXMachine.g:4340:1: ( ( rule__GroupSync__PrefixAssignment_1_1_0 ) )
            // InternalXMachine.g:4341:2: ( rule__GroupSync__PrefixAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getPrefixAssignment_1_1_0()); 
            }
            // InternalXMachine.g:4342:2: ( rule__GroupSync__PrefixAssignment_1_1_0 )
            // InternalXMachine.g:4342:3: rule__GroupSync__PrefixAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__PrefixAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getPrefixAssignment_1_1_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:4350:1: rule__GroupSync__Group_1_1__1 : rule__GroupSync__Group_1_1__1__Impl ;
    public final void rule__GroupSync__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4354:1: ( rule__GroupSync__Group_1_1__1__Impl )
            // InternalXMachine.g:4355:2: rule__GroupSync__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupSync__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:4361:1: rule__GroupSync__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__GroupSync__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4365:1: ( ( '.' ) )
            // InternalXMachine.g:4366:1: ( '.' )
            {
            // InternalXMachine.g:4366:1: ( '.' )
            // InternalXMachine.g:4367:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getFullStopKeyword_1_1_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getFullStopKeyword_1_1_1()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:4377:1: rule__GroupSync__Group_2__0 : rule__GroupSync__Group_2__0__Impl rule__GroupSync__Group_2__1 ;
    public final void rule__GroupSync__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4381:1: ( rule__GroupSync__Group_2__0__Impl rule__GroupSync__Group_2__1 )
            // InternalXMachine.g:4382:2: rule__GroupSync__Group_2__0__Impl rule__GroupSync__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalXMachine.g:4389:1: rule__GroupSync__Group_2__0__Impl : ( '(' ) ;
    public final void rule__GroupSync__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4393:1: ( ( '(' ) )
            // InternalXMachine.g:4394:1: ( '(' )
            {
            // InternalXMachine.g:4394:1: ( '(' )
            // InternalXMachine.g:4395:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4404:1: rule__GroupSync__Group_2__1 : rule__GroupSync__Group_2__1__Impl rule__GroupSync__Group_2__2 ;
    public final void rule__GroupSync__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4408:1: ( rule__GroupSync__Group_2__1__Impl rule__GroupSync__Group_2__2 )
            // InternalXMachine.g:4409:2: rule__GroupSync__Group_2__1__Impl rule__GroupSync__Group_2__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:4416:1: rule__GroupSync__Group_2__1__Impl : ( ( rule__GroupSync__ActualParametersAssignment_2_1 ) ) ;
    public final void rule__GroupSync__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4420:1: ( ( ( rule__GroupSync__ActualParametersAssignment_2_1 ) ) )
            // InternalXMachine.g:4421:1: ( ( rule__GroupSync__ActualParametersAssignment_2_1 ) )
            {
            // InternalXMachine.g:4421:1: ( ( rule__GroupSync__ActualParametersAssignment_2_1 ) )
            // InternalXMachine.g:4422:2: ( rule__GroupSync__ActualParametersAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getActualParametersAssignment_2_1()); 
            }
            // InternalXMachine.g:4423:2: ( rule__GroupSync__ActualParametersAssignment_2_1 )
            // InternalXMachine.g:4423:3: rule__GroupSync__ActualParametersAssignment_2_1
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
    // InternalXMachine.g:4431:1: rule__GroupSync__Group_2__2 : rule__GroupSync__Group_2__2__Impl rule__GroupSync__Group_2__3 ;
    public final void rule__GroupSync__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4435:1: ( rule__GroupSync__Group_2__2__Impl rule__GroupSync__Group_2__3 )
            // InternalXMachine.g:4436:2: rule__GroupSync__Group_2__2__Impl rule__GroupSync__Group_2__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:4443:1: rule__GroupSync__Group_2__2__Impl : ( ( rule__GroupSync__Group_2_2__0 )* ) ;
    public final void rule__GroupSync__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4447:1: ( ( ( rule__GroupSync__Group_2_2__0 )* ) )
            // InternalXMachine.g:4448:1: ( ( rule__GroupSync__Group_2_2__0 )* )
            {
            // InternalXMachine.g:4448:1: ( ( rule__GroupSync__Group_2_2__0 )* )
            // InternalXMachine.g:4449:2: ( rule__GroupSync__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getGroup_2_2()); 
            }
            // InternalXMachine.g:4450:2: ( rule__GroupSync__Group_2_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==49) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalXMachine.g:4450:3: rule__GroupSync__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalXMachine.g:4458:1: rule__GroupSync__Group_2__3 : rule__GroupSync__Group_2__3__Impl ;
    public final void rule__GroupSync__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4462:1: ( rule__GroupSync__Group_2__3__Impl )
            // InternalXMachine.g:4463:2: rule__GroupSync__Group_2__3__Impl
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
    // InternalXMachine.g:4469:1: rule__GroupSync__Group_2__3__Impl : ( ')' ) ;
    public final void rule__GroupSync__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4473:1: ( ( ')' ) )
            // InternalXMachine.g:4474:1: ( ')' )
            {
            // InternalXMachine.g:4474:1: ( ')' )
            // InternalXMachine.g:4475:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4485:1: rule__GroupSync__Group_2_2__0 : rule__GroupSync__Group_2_2__0__Impl rule__GroupSync__Group_2_2__1 ;
    public final void rule__GroupSync__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4489:1: ( rule__GroupSync__Group_2_2__0__Impl rule__GroupSync__Group_2_2__1 )
            // InternalXMachine.g:4490:2: rule__GroupSync__Group_2_2__0__Impl rule__GroupSync__Group_2_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalXMachine.g:4497:1: rule__GroupSync__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__GroupSync__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4501:1: ( ( ',' ) )
            // InternalXMachine.g:4502:1: ( ',' )
            {
            // InternalXMachine.g:4502:1: ( ',' )
            // InternalXMachine.g:4503:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4512:1: rule__GroupSync__Group_2_2__1 : rule__GroupSync__Group_2_2__1__Impl ;
    public final void rule__GroupSync__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4516:1: ( rule__GroupSync__Group_2_2__1__Impl )
            // InternalXMachine.g:4517:2: rule__GroupSync__Group_2_2__1__Impl
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
    // InternalXMachine.g:4523:1: rule__GroupSync__Group_2_2__1__Impl : ( ( rule__GroupSync__ActualParametersAssignment_2_2_1 ) ) ;
    public final void rule__GroupSync__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4527:1: ( ( ( rule__GroupSync__ActualParametersAssignment_2_2_1 ) ) )
            // InternalXMachine.g:4528:1: ( ( rule__GroupSync__ActualParametersAssignment_2_2_1 ) )
            {
            // InternalXMachine.g:4528:1: ( ( rule__GroupSync__ActualParametersAssignment_2_2_1 ) )
            // InternalXMachine.g:4529:2: ( rule__GroupSync__ActualParametersAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getActualParametersAssignment_2_2_1()); 
            }
            // InternalXMachine.g:4530:2: ( rule__GroupSync__ActualParametersAssignment_2_2_1 )
            // InternalXMachine.g:4530:3: rule__GroupSync__ActualParametersAssignment_2_2_1
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
    // InternalXMachine.g:4539:1: rule__XParameter__Group__0 : rule__XParameter__Group__0__Impl rule__XParameter__Group__1 ;
    public final void rule__XParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4543:1: ( rule__XParameter__Group__0__Impl rule__XParameter__Group__1 )
            // InternalXMachine.g:4544:2: rule__XParameter__Group__0__Impl rule__XParameter__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:4551:1: rule__XParameter__Group__0__Impl : ( () ) ;
    public final void rule__XParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4555:1: ( ( () ) )
            // InternalXMachine.g:4556:1: ( () )
            {
            // InternalXMachine.g:4556:1: ( () )
            // InternalXMachine.g:4557:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getParameterAction_0()); 
            }
            // InternalXMachine.g:4558:2: ()
            // InternalXMachine.g:4558:3: 
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
    // InternalXMachine.g:4566:1: rule__XParameter__Group__1 : rule__XParameter__Group__1__Impl ;
    public final void rule__XParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4570:1: ( rule__XParameter__Group__1__Impl )
            // InternalXMachine.g:4571:2: rule__XParameter__Group__1__Impl
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
    // InternalXMachine.g:4577:1: rule__XParameter__Group__1__Impl : ( ( rule__XParameter__NameAssignment_1 ) ) ;
    public final void rule__XParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4581:1: ( ( ( rule__XParameter__NameAssignment_1 ) ) )
            // InternalXMachine.g:4582:1: ( ( rule__XParameter__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4582:1: ( ( rule__XParameter__NameAssignment_1 ) )
            // InternalXMachine.g:4583:2: ( rule__XParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:4584:2: ( rule__XParameter__NameAssignment_1 )
            // InternalXMachine.g:4584:3: rule__XParameter__NameAssignment_1
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
    // InternalXMachine.g:4593:1: rule__XGuard__Group__0 : rule__XGuard__Group__0__Impl rule__XGuard__Group__1 ;
    public final void rule__XGuard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4597:1: ( rule__XGuard__Group__0__Impl rule__XGuard__Group__1 )
            // InternalXMachine.g:4598:2: rule__XGuard__Group__0__Impl rule__XGuard__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalXMachine.g:4605:1: rule__XGuard__Group__0__Impl : ( () ) ;
    public final void rule__XGuard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4609:1: ( ( () ) )
            // InternalXMachine.g:4610:1: ( () )
            {
            // InternalXMachine.g:4610:1: ( () )
            // InternalXMachine.g:4611:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getGuardAction_0()); 
            }
            // InternalXMachine.g:4612:2: ()
            // InternalXMachine.g:4612:3: 
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
    // InternalXMachine.g:4620:1: rule__XGuard__Group__1 : rule__XGuard__Group__1__Impl rule__XGuard__Group__2 ;
    public final void rule__XGuard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4624:1: ( rule__XGuard__Group__1__Impl rule__XGuard__Group__2 )
            // InternalXMachine.g:4625:2: rule__XGuard__Group__1__Impl rule__XGuard__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalXMachine.g:4632:1: rule__XGuard__Group__1__Impl : ( ( rule__XGuard__TheoremAssignment_1 )? ) ;
    public final void rule__XGuard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4636:1: ( ( ( rule__XGuard__TheoremAssignment_1 )? ) )
            // InternalXMachine.g:4637:1: ( ( rule__XGuard__TheoremAssignment_1 )? )
            {
            // InternalXMachine.g:4637:1: ( ( rule__XGuard__TheoremAssignment_1 )? )
            // InternalXMachine.g:4638:2: ( rule__XGuard__TheoremAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremAssignment_1()); 
            }
            // InternalXMachine.g:4639:2: ( rule__XGuard__TheoremAssignment_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==136) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXMachine.g:4639:3: rule__XGuard__TheoremAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGuard__TheoremAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getTheoremAssignment_1()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:4647:1: rule__XGuard__Group__2 : rule__XGuard__Group__2__Impl rule__XGuard__Group__3 ;
    public final void rule__XGuard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4651:1: ( rule__XGuard__Group__2__Impl rule__XGuard__Group__3 )
            // InternalXMachine.g:4652:2: rule__XGuard__Group__2__Impl rule__XGuard__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalXMachine.g:4659:1: rule__XGuard__Group__2__Impl : ( ( rule__XGuard__NameAssignment_2 ) ) ;
    public final void rule__XGuard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4663:1: ( ( ( rule__XGuard__NameAssignment_2 ) ) )
            // InternalXMachine.g:4664:1: ( ( rule__XGuard__NameAssignment_2 ) )
            {
            // InternalXMachine.g:4664:1: ( ( rule__XGuard__NameAssignment_2 ) )
            // InternalXMachine.g:4665:2: ( rule__XGuard__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:4666:2: ( rule__XGuard__NameAssignment_2 )
            // InternalXMachine.g:4666:3: rule__XGuard__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getNameAssignment_2()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:4674:1: rule__XGuard__Group__3 : rule__XGuard__Group__3__Impl ;
    public final void rule__XGuard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4678:1: ( rule__XGuard__Group__3__Impl )
            // InternalXMachine.g:4679:2: rule__XGuard__Group__3__Impl
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
    // InternalXMachine.g:4685:1: rule__XGuard__Group__3__Impl : ( ( rule__XGuard__PredicateAssignment_3 ) ) ;
    public final void rule__XGuard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4689:1: ( ( ( rule__XGuard__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:4690:1: ( ( rule__XGuard__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:4690:1: ( ( rule__XGuard__PredicateAssignment_3 ) )
            // InternalXMachine.g:4691:2: ( rule__XGuard__PredicateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getPredicateAssignment_3()); 
            }
            // InternalXMachine.g:4692:2: ( rule__XGuard__PredicateAssignment_3 )
            // InternalXMachine.g:4692:3: rule__XGuard__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__PredicateAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getPredicateAssignment_3()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:4701:1: rule__XWitness__Group__0 : rule__XWitness__Group__0__Impl rule__XWitness__Group__1 ;
    public final void rule__XWitness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4705:1: ( rule__XWitness__Group__0__Impl rule__XWitness__Group__1 )
            // InternalXMachine.g:4706:2: rule__XWitness__Group__0__Impl rule__XWitness__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalXMachine.g:4713:1: rule__XWitness__Group__0__Impl : ( () ) ;
    public final void rule__XWitness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4717:1: ( ( () ) )
            // InternalXMachine.g:4718:1: ( () )
            {
            // InternalXMachine.g:4718:1: ( () )
            // InternalXMachine.g:4719:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 
            }
            // InternalXMachine.g:4720:2: ()
            // InternalXMachine.g:4720:3: 
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
    // InternalXMachine.g:4728:1: rule__XWitness__Group__1 : rule__XWitness__Group__1__Impl rule__XWitness__Group__2 ;
    public final void rule__XWitness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4732:1: ( rule__XWitness__Group__1__Impl rule__XWitness__Group__2 )
            // InternalXMachine.g:4733:2: rule__XWitness__Group__1__Impl rule__XWitness__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalXMachine.g:4740:1: rule__XWitness__Group__1__Impl : ( ( rule__XWitness__NameAssignment_1 ) ) ;
    public final void rule__XWitness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4744:1: ( ( ( rule__XWitness__NameAssignment_1 ) ) )
            // InternalXMachine.g:4745:1: ( ( rule__XWitness__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4745:1: ( ( rule__XWitness__NameAssignment_1 ) )
            // InternalXMachine.g:4746:2: ( rule__XWitness__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:4747:2: ( rule__XWitness__NameAssignment_1 )
            // InternalXMachine.g:4747:3: rule__XWitness__NameAssignment_1
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
    // InternalXMachine.g:4755:1: rule__XWitness__Group__2 : rule__XWitness__Group__2__Impl ;
    public final void rule__XWitness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4759:1: ( rule__XWitness__Group__2__Impl )
            // InternalXMachine.g:4760:2: rule__XWitness__Group__2__Impl
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
    // InternalXMachine.g:4766:1: rule__XWitness__Group__2__Impl : ( ( rule__XWitness__PredicateAssignment_2 ) ) ;
    public final void rule__XWitness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4770:1: ( ( ( rule__XWitness__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:4771:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:4771:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            // InternalXMachine.g:4772:2: ( rule__XWitness__PredicateAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getPredicateAssignment_2()); 
            }
            // InternalXMachine.g:4773:2: ( rule__XWitness__PredicateAssignment_2 )
            // InternalXMachine.g:4773:3: rule__XWitness__PredicateAssignment_2
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
    // InternalXMachine.g:4782:1: rule__XAction__Group__0 : rule__XAction__Group__0__Impl rule__XAction__Group__1 ;
    public final void rule__XAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4786:1: ( rule__XAction__Group__0__Impl rule__XAction__Group__1 )
            // InternalXMachine.g:4787:2: rule__XAction__Group__0__Impl rule__XAction__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalXMachine.g:4794:1: rule__XAction__Group__0__Impl : ( () ) ;
    public final void rule__XAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4798:1: ( ( () ) )
            // InternalXMachine.g:4799:1: ( () )
            {
            // InternalXMachine.g:4799:1: ( () )
            // InternalXMachine.g:4800:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionAction_0()); 
            }
            // InternalXMachine.g:4801:2: ()
            // InternalXMachine.g:4801:3: 
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
    // InternalXMachine.g:4809:1: rule__XAction__Group__1 : rule__XAction__Group__1__Impl rule__XAction__Group__2 ;
    public final void rule__XAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4813:1: ( rule__XAction__Group__1__Impl rule__XAction__Group__2 )
            // InternalXMachine.g:4814:2: rule__XAction__Group__1__Impl rule__XAction__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalXMachine.g:4821:1: rule__XAction__Group__1__Impl : ( ( rule__XAction__NameAssignment_1 ) ) ;
    public final void rule__XAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4825:1: ( ( ( rule__XAction__NameAssignment_1 ) ) )
            // InternalXMachine.g:4826:1: ( ( rule__XAction__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4826:1: ( ( rule__XAction__NameAssignment_1 ) )
            // InternalXMachine.g:4827:2: ( rule__XAction__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:4828:2: ( rule__XAction__NameAssignment_1 )
            // InternalXMachine.g:4828:3: rule__XAction__NameAssignment_1
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
    // InternalXMachine.g:4836:1: rule__XAction__Group__2 : rule__XAction__Group__2__Impl ;
    public final void rule__XAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4840:1: ( rule__XAction__Group__2__Impl )
            // InternalXMachine.g:4841:2: rule__XAction__Group__2__Impl
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
    // InternalXMachine.g:4847:1: rule__XAction__Group__2__Impl : ( ( rule__XAction__ActionAssignment_2 ) ) ;
    public final void rule__XAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4851:1: ( ( ( rule__XAction__ActionAssignment_2 ) ) )
            // InternalXMachine.g:4852:1: ( ( rule__XAction__ActionAssignment_2 ) )
            {
            // InternalXMachine.g:4852:1: ( ( rule__XAction__ActionAssignment_2 ) )
            // InternalXMachine.g:4853:2: ( rule__XAction__ActionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionAssignment_2()); 
            }
            // InternalXMachine.g:4854:2: ( rule__XAction__ActionAssignment_2 )
            // InternalXMachine.g:4854:3: rule__XAction__ActionAssignment_2
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


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0"
    // InternalXMachine.g:4863:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4867:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 )
            // InternalXMachine.g:4868:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1
            {
            pushFollow(FOLLOW_32);
            rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl"
    // InternalXMachine.g:4875:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl : ( '%' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4879:1: ( ( '%' ) )
            // InternalXMachine.g:4880:1: ( '%' )
            {
            // InternalXMachine.g:4880:1: ( '%' )
            // InternalXMachine.g:4881:2: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0()); 
            }
            match(input,134,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1"
    // InternalXMachine.g:4890:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4894:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl )
            // InternalXMachine.g:4895:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl"
    // InternalXMachine.g:4901:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl : ( '\\u22C2' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4905:1: ( ( '\\u22C2' ) )
            // InternalXMachine.g:4906:1: ( '\\u22C2' )
            {
            // InternalXMachine.g:4906:1: ( '\\u22C2' )
            // InternalXMachine.g:4907:2: '\\u22C2'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1()); 
            }
            match(input,135,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl"


    // $ANTLR start "rule__Machine__UnorderedGroup_3"
    // InternalXMachine.g:4917:1: rule__Machine__UnorderedGroup_3 : ( rule__Machine__UnorderedGroup_3__0 )? ;
    public final void rule__Machine__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMachineAccess().getUnorderedGroup_3());
        	
        try {
            // InternalXMachine.g:4922:1: ( ( rule__Machine__UnorderedGroup_3__0 )? )
            // InternalXMachine.g:4923:2: ( rule__Machine__UnorderedGroup_3__0 )?
            {
            // InternalXMachine.g:4923:2: ( rule__Machine__UnorderedGroup_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( LA48_0 == 117 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 == 118 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
                alt48=1;
            }
            else if ( LA48_0 == 123 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXMachine.g:4923:2: rule__Machine__UnorderedGroup_3__0
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
    // InternalXMachine.g:4931:1: rule__Machine__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) ) ) ;
    public final void rule__Machine__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXMachine.g:4936:1: ( ( ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) ) ) )
            // InternalXMachine.g:4937:3: ( ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) ) )
            {
            // InternalXMachine.g:4937:3: ( ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) ) )
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( LA50_0 == 117 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 == 118 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
                alt50=2;
            }
            else if ( LA50_0 == 123 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
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
                    // InternalXMachine.g:4938:3: ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) )
                    {
                    // InternalXMachine.g:4938:3: ({...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) ) )
                    // InternalXMachine.g:4939:4: {...}? => ( ( ( rule__Machine__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalXMachine.g:4939:103: ( ( ( rule__Machine__Group_3_0__0 ) ) )
                    // InternalXMachine.g:4940:5: ( ( rule__Machine__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalXMachine.g:4946:5: ( ( rule__Machine__Group_3_0__0 ) )
                    // InternalXMachine.g:4947:6: ( rule__Machine__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_3_0()); 
                    }
                    // InternalXMachine.g:4948:6: ( rule__Machine__Group_3_0__0 )
                    // InternalXMachine.g:4948:7: rule__Machine__Group_3_0__0
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
                    // InternalXMachine.g:4953:3: ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) )
                    {
                    // InternalXMachine.g:4953:3: ({...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) ) )
                    // InternalXMachine.g:4954:4: {...}? => ( ( ( rule__Machine__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalXMachine.g:4954:103: ( ( ( rule__Machine__Group_3_1__0 ) ) )
                    // InternalXMachine.g:4955:5: ( ( rule__Machine__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalXMachine.g:4961:5: ( ( rule__Machine__Group_3_1__0 ) )
                    // InternalXMachine.g:4962:6: ( rule__Machine__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_3_1()); 
                    }
                    // InternalXMachine.g:4963:6: ( rule__Machine__Group_3_1__0 )
                    // InternalXMachine.g:4963:7: rule__Machine__Group_3_1__0
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
                    // InternalXMachine.g:4968:3: ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) )
                    {
                    // InternalXMachine.g:4968:3: ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) ) )
                    // InternalXMachine.g:4969:4: {...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalXMachine.g:4969:103: ( ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) ) )
                    // InternalXMachine.g:4970:5: ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // InternalXMachine.g:4976:5: ( ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* ) )
                    // InternalXMachine.g:4977:6: ( ( rule__Machine__ExtensionsAssignment_3_2 ) ) ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* )
                    {
                    // InternalXMachine.g:4977:6: ( ( rule__Machine__ExtensionsAssignment_3_2 ) )
                    // InternalXMachine.g:4978:7: ( rule__Machine__ExtensionsAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getExtensionsAssignment_3_2()); 
                    }
                    // InternalXMachine.g:4979:7: ( rule__Machine__ExtensionsAssignment_3_2 )
                    // InternalXMachine.g:4979:8: rule__Machine__ExtensionsAssignment_3_2
                    {
                    pushFollow(FOLLOW_33);
                    rule__Machine__ExtensionsAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getExtensionsAssignment_3_2()); 
                    }

                    }

                    // InternalXMachine.g:4982:6: ( ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )* )
                    // InternalXMachine.g:4983:7: ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getExtensionsAssignment_3_2()); 
                    }
                    // InternalXMachine.g:4984:7: ( ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2 )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==123) ) {
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
                    	    // InternalXMachine.g:4984:8: ( rule__Machine__ExtensionsAssignment_3_2 )=> rule__Machine__ExtensionsAssignment_3_2
                    	    {
                    	    pushFollow(FOLLOW_33);
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
    // InternalXMachine.g:4998:1: rule__Machine__UnorderedGroup_3__0 : rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__1 )? ;
    public final void rule__Machine__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5002:1: ( rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__1 )? )
            // InternalXMachine.g:5003:2: rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_33);
            rule__Machine__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:5004:2: ( rule__Machine__UnorderedGroup_3__1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 117 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 118 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
                alt51=1;
            }
            else if ( LA51_0 == 123 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalXMachine.g:5004:2: rule__Machine__UnorderedGroup_3__1
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
    // InternalXMachine.g:5010:1: rule__Machine__UnorderedGroup_3__1 : rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__2 )? ;
    public final void rule__Machine__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5014:1: ( rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__2 )? )
            // InternalXMachine.g:5015:2: rule__Machine__UnorderedGroup_3__Impl ( rule__Machine__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_33);
            rule__Machine__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:5016:2: ( rule__Machine__UnorderedGroup_3__2 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 117 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 118 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
                alt52=1;
            }
            else if ( LA52_0 == 123 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalXMachine.g:5016:2: rule__Machine__UnorderedGroup_3__2
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
    // InternalXMachine.g:5022:1: rule__Machine__UnorderedGroup_3__2 : rule__Machine__UnorderedGroup_3__Impl ;
    public final void rule__Machine__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5026:1: ( rule__Machine__UnorderedGroup_3__Impl )
            // InternalXMachine.g:5027:2: rule__Machine__UnorderedGroup_3__Impl
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


    // $ANTLR start "rule__Machine__NameAssignment_2"
    // InternalXMachine.g:5034:1: rule__Machine__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5038:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5039:2: ( RULE_ID )
            {
            // InternalXMachine.g:5039:2: ( RULE_ID )
            // InternalXMachine.g:5040:3: RULE_ID
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
    // InternalXMachine.g:5049:1: rule__Machine__RefinesAssignment_3_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__RefinesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5053:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5054:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5054:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5055:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_3_0_1_0()); 
            }
            // InternalXMachine.g:5056:3: ( RULE_ID )
            // InternalXMachine.g:5057:4: RULE_ID
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
    // InternalXMachine.g:5068:1: rule__Machine__SeesAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__SeesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5072:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5073:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5073:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5074:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesContextCrossReference_3_1_1_0()); 
            }
            // InternalXMachine.g:5075:3: ( RULE_ID )
            // InternalXMachine.g:5076:4: RULE_ID
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
    // InternalXMachine.g:5087:1: rule__Machine__ExtensionsAssignment_3_2 : ( ruleMIncludes ) ;
    public final void rule__Machine__ExtensionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5091:1: ( ( ruleMIncludes ) )
            // InternalXMachine.g:5092:2: ( ruleMIncludes )
            {
            // InternalXMachine.g:5092:2: ( ruleMIncludes )
            // InternalXMachine.g:5093:3: ruleMIncludes
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
    // InternalXMachine.g:5102:1: rule__Machine__VariablesAssignment_4_1 : ( ruleXVariable ) ;
    public final void rule__Machine__VariablesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5106:1: ( ( ruleXVariable ) )
            // InternalXMachine.g:5107:2: ( ruleXVariable )
            {
            // InternalXMachine.g:5107:2: ( ruleXVariable )
            // InternalXMachine.g:5108:3: ruleXVariable
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
    // InternalXMachine.g:5117:1: rule__Machine__InvariantsAssignment_5_1 : ( ruleXInvariant ) ;
    public final void rule__Machine__InvariantsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5121:1: ( ( ruleXInvariant ) )
            // InternalXMachine.g:5122:2: ( ruleXInvariant )
            {
            // InternalXMachine.g:5122:2: ( ruleXInvariant )
            // InternalXMachine.g:5123:3: ruleXInvariant
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


    // $ANTLR start "rule__Machine__VariantsAssignment_6_1"
    // InternalXMachine.g:5132:1: rule__Machine__VariantsAssignment_6_1 : ( ruleXVariant ) ;
    public final void rule__Machine__VariantsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5136:1: ( ( ruleXVariant ) )
            // InternalXMachine.g:5137:2: ( ruleXVariant )
            {
            // InternalXMachine.g:5137:2: ( ruleXVariant )
            // InternalXMachine.g:5138:3: ruleXVariant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariantsXVariantParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXVariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariantsXVariantParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariantsAssignment_6_1"


    // $ANTLR start "rule__Machine__EventsAssignment_7_1"
    // InternalXMachine.g:5147:1: rule__Machine__EventsAssignment_7_1 : ( ruleXEvent ) ;
    public final void rule__Machine__EventsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5151:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:5152:2: ( ruleXEvent )
            {
            // InternalXMachine.g:5152:2: ( ruleXEvent )
            // InternalXMachine.g:5153:3: ruleXEvent
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
    // InternalXMachine.g:5162:1: rule__Machine__EventsAssignment_7_2 : ( ruleXEvent ) ;
    public final void rule__Machine__EventsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5166:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:5167:2: ( ruleXEvent )
            {
            // InternalXMachine.g:5167:2: ( ruleXEvent )
            // InternalXMachine.g:5168:3: ruleXEvent
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
    // InternalXMachine.g:5177:1: rule__Machine__ExtensionsAssignment_8 : ( ruleXGroup ) ;
    public final void rule__Machine__ExtensionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5181:1: ( ( ruleXGroup ) )
            // InternalXMachine.g:5182:2: ( ruleXGroup )
            {
            // InternalXMachine.g:5182:2: ( ruleXGroup )
            // InternalXMachine.g:5183:3: ruleXGroup
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
    // InternalXMachine.g:5192:1: rule__MIncludes__AbstractMachineAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MIncludes__AbstractMachineAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5196:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:5197:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:5197:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:5198:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 
            }
            // InternalXMachine.g:5199:3: ( ruleQualifiedName )
            // InternalXMachine.g:5200:4: ruleQualifiedName
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
    // InternalXMachine.g:5211:1: rule__MIncludes__ConcreteMachineAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MIncludes__ConcreteMachineAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5215:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5216:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5216:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5217:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 
            }
            // InternalXMachine.g:5218:3: ( RULE_ID )
            // InternalXMachine.g:5219:4: RULE_ID
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
    // InternalXMachine.g:5230:1: rule__MIncludes__PrefixesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5234:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5235:2: ( RULE_ID )
            {
            // InternalXMachine.g:5235:2: ( RULE_ID )
            // InternalXMachine.g:5236:3: RULE_ID
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
    // InternalXMachine.g:5245:1: rule__MIncludes__PrefixesAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5249:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5250:2: ( RULE_ID )
            {
            // InternalXMachine.g:5250:2: ( RULE_ID )
            // InternalXMachine.g:5251:3: RULE_ID
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
    // InternalXMachine.g:5260:1: rule__XVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5264:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5265:2: ( RULE_ID )
            {
            // InternalXMachine.g:5265:2: ( RULE_ID )
            // InternalXMachine.g:5266:3: RULE_ID
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


    // $ANTLR start "rule__XInvariant__TheoremAssignment_1"
    // InternalXMachine.g:5275:1: rule__XInvariant__TheoremAssignment_1 : ( ( 'theorem' ) ) ;
    public final void rule__XInvariant__TheoremAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5279:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:5280:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:5280:2: ( ( 'theorem' ) )
            // InternalXMachine.g:5281:3: ( 'theorem' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_1_0()); 
            }
            // InternalXMachine.g:5282:3: ( 'theorem' )
            // InternalXMachine.g:5283:4: 'theorem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_1_0()); 
            }
            match(input,136,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__TheoremAssignment_1"


    // $ANTLR start "rule__XInvariant__NameAssignment_2"
    // InternalXMachine.g:5294:1: rule__XInvariant__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XInvariant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5298:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5299:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5299:2: ( RULE_XLABEL )
            // InternalXMachine.g:5300:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__NameAssignment_2"


    // $ANTLR start "rule__XInvariant__PredicateAssignment_3"
    // InternalXMachine.g:5309:1: rule__XInvariant__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XInvariant__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5313:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:5314:2: ( ruleXFormula )
            {
            // InternalXMachine.g:5314:2: ( ruleXFormula )
            // InternalXMachine.g:5315:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__PredicateAssignment_3"


    // $ANTLR start "rule__XVariant__NameAssignment_1"
    // InternalXMachine.g:5324:1: rule__XVariant__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XVariant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5328:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5329:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5329:2: ( RULE_XLABEL )
            // InternalXMachine.g:5330:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getNameXLABELTerminalRuleCall_1_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getNameXLABELTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__NameAssignment_1"


    // $ANTLR start "rule__XVariant__ExpressionAssignment_2"
    // InternalXMachine.g:5339:1: rule__XVariant__ExpressionAssignment_2 : ( ruleXFormula ) ;
    public final void rule__XVariant__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5343:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:5344:2: ( ruleXFormula )
            {
            // InternalXMachine.g:5344:2: ( ruleXFormula )
            // InternalXMachine.g:5345:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getExpressionXFormulaParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getExpressionXFormulaParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__ExpressionAssignment_2"


    // $ANTLR start "rule__XGroup__NameAssignment_2"
    // InternalXMachine.g:5354:1: rule__XGroup__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5358:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5359:2: ( RULE_ID )
            {
            // InternalXMachine.g:5359:2: ( RULE_ID )
            // InternalXMachine.g:5360:3: RULE_ID
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
    // InternalXMachine.g:5369:1: rule__XGroup__FormalParametersAssignment_3_1 : ( ruleXFormalParameter ) ;
    public final void rule__XGroup__FormalParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5373:1: ( ( ruleXFormalParameter ) )
            // InternalXMachine.g:5374:2: ( ruleXFormalParameter )
            {
            // InternalXMachine.g:5374:2: ( ruleXFormalParameter )
            // InternalXMachine.g:5375:3: ruleXFormalParameter
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
    // InternalXMachine.g:5384:1: rule__XGroup__FormalParametersAssignment_3_2_1 : ( ruleXFormalParameter ) ;
    public final void rule__XGroup__FormalParametersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5388:1: ( ( ruleXFormalParameter ) )
            // InternalXMachine.g:5389:2: ( ruleXFormalParameter )
            {
            // InternalXMachine.g:5389:2: ( ruleXFormalParameter )
            // InternalXMachine.g:5390:3: ruleXFormalParameter
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
    // InternalXMachine.g:5399:1: rule__XGroup__EventsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__XGroup__EventsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5403:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5404:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5404:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5405:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventsEventCrossReference_4_1_0()); 
            }
            // InternalXMachine.g:5406:3: ( RULE_ID )
            // InternalXMachine.g:5407:4: RULE_ID
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
    // InternalXMachine.g:5418:1: rule__XGroup__EventsAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__XGroup__EventsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5422:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5423:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5423:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5424:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupAccess().getEventsEventCrossReference_4_2_0()); 
            }
            // InternalXMachine.g:5425:3: ( RULE_ID )
            // InternalXMachine.g:5426:4: RULE_ID
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
    // InternalXMachine.g:5437:1: rule__XFormalParameter__DirectionAssignment_1 : ( ruleXDirection ) ;
    public final void rule__XFormalParameter__DirectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5441:1: ( ( ruleXDirection ) )
            // InternalXMachine.g:5442:2: ( ruleXDirection )
            {
            // InternalXMachine.g:5442:2: ( ruleXDirection )
            // InternalXMachine.g:5443:3: ruleXDirection
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
    // InternalXMachine.g:5452:1: rule__XFormalParameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XFormalParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5456:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5457:2: ( RULE_ID )
            {
            // InternalXMachine.g:5457:2: ( RULE_ID )
            // InternalXMachine.g:5458:3: RULE_ID
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


    // $ANTLR start "rule__XEvent__ConvergenceAssignment_1"
    // InternalXMachine.g:5467:1: rule__XEvent__ConvergenceAssignment_1 : ( ruleXConvergence ) ;
    public final void rule__XEvent__ConvergenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5471:1: ( ( ruleXConvergence ) )
            // InternalXMachine.g:5472:2: ( ruleXConvergence )
            {
            // InternalXMachine.g:5472:2: ( ruleXConvergence )
            // InternalXMachine.g:5473:3: ruleXConvergence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXConvergence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ConvergenceAssignment_1"


    // $ANTLR start "rule__XEvent__NameAssignment_3"
    // InternalXMachine.g:5482:1: rule__XEvent__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XEvent__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5486:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5487:2: ( RULE_ID )
            {
            // InternalXMachine.g:5487:2: ( RULE_ID )
            // InternalXMachine.g:5488:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__NameAssignment_3"


    // $ANTLR start "rule__XEvent__RefinesAssignment_4_0_1"
    // InternalXMachine.g:5497:1: rule__XEvent__RefinesAssignment_4_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5501:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5502:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5502:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5503:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_0_1_0()); 
            }
            // InternalXMachine.g:5504:3: ( RULE_ID )
            // InternalXMachine.g:5505:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_4_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_4_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__RefinesAssignment_4_0_1"


    // $ANTLR start "rule__XEvent__ExtendedAssignment_4_1_0"
    // InternalXMachine.g:5516:1: rule__XEvent__ExtendedAssignment_4_1_0 : ( ( 'extends' ) ) ;
    public final void rule__XEvent__ExtendedAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5520:1: ( ( ( 'extends' ) ) )
            // InternalXMachine.g:5521:2: ( ( 'extends' ) )
            {
            // InternalXMachine.g:5521:2: ( ( 'extends' ) )
            // InternalXMachine.g:5522:3: ( 'extends' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_4_1_0_0()); 
            }
            // InternalXMachine.g:5523:3: ( 'extends' )
            // InternalXMachine.g:5524:4: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_4_1_0_0()); 
            }
            match(input,137,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_4_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_4_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ExtendedAssignment_4_1_0"


    // $ANTLR start "rule__XEvent__RefinesAssignment_4_1_1"
    // InternalXMachine.g:5535:1: rule__XEvent__RefinesAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5539:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5540:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5540:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5541:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_1_1_0()); 
            }
            // InternalXMachine.g:5542:3: ( RULE_ID )
            // InternalXMachine.g:5543:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_4_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_4_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__RefinesAssignment_4_1_1"


    // $ANTLR start "rule__XEvent__ParametersAssignment_5_1"
    // InternalXMachine.g:5554:1: rule__XEvent__ParametersAssignment_5_1 : ( ruleXParameter ) ;
    public final void rule__XEvent__ParametersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5558:1: ( ( ruleXParameter ) )
            // InternalXMachine.g:5559:2: ( ruleXParameter )
            {
            // InternalXMachine.g:5559:2: ( ruleXParameter )
            // InternalXMachine.g:5560:3: ruleXParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ParametersAssignment_5_1"


    // $ANTLR start "rule__XEvent__ExtensionsAssignment_6"
    // InternalXMachine.g:5569:1: rule__XEvent__ExtensionsAssignment_6 : ( ruleXGroupOrEvent ) ;
    public final void rule__XEvent__ExtensionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5573:1: ( ( ruleXGroupOrEvent ) )
            // InternalXMachine.g:5574:2: ( ruleXGroupOrEvent )
            {
            // InternalXMachine.g:5574:2: ( ruleXGroupOrEvent )
            // InternalXMachine.g:5575:3: ruleXGroupOrEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtensionsXGroupOrEventParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXGroupOrEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtensionsXGroupOrEventParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ExtensionsAssignment_6"


    // $ANTLR start "rule__XEvent__GuardsAssignment_7_1"
    // InternalXMachine.g:5584:1: rule__XEvent__GuardsAssignment_7_1 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5588:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:5589:2: ( ruleXGuard )
            {
            // InternalXMachine.g:5589:2: ( ruleXGuard )
            // InternalXMachine.g:5590:3: ruleXGuard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXGuard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__GuardsAssignment_7_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_8_1"
    // InternalXMachine.g:5599:1: rule__XEvent__ActionsAssignment_8_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5603:1: ( ( ruleXAction ) )
            // InternalXMachine.g:5604:2: ( ruleXAction )
            {
            // InternalXMachine.g:5604:2: ( ruleXAction )
            // InternalXMachine.g:5605:3: ruleXAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_8_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ActionsAssignment_8_1"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_9_1"
    // InternalXMachine.g:5614:1: rule__XEvent__WitnessesAssignment_9_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5618:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:5619:2: ( ruleXWitness )
            {
            // InternalXMachine.g:5619:2: ( ruleXWitness )
            // InternalXMachine.g:5620:3: ruleXWitness
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__WitnessesAssignment_9_1"


    // $ANTLR start "rule__EventSync__PrefixAssignment_1_2_0"
    // InternalXMachine.g:5629:1: rule__EventSync__PrefixAssignment_1_2_0 : ( RULE_ID ) ;
    public final void rule__EventSync__PrefixAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5633:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5634:2: ( RULE_ID )
            {
            // InternalXMachine.g:5634:2: ( RULE_ID )
            // InternalXMachine.g:5635:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_1_2_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_1_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__PrefixAssignment_1_2_0"


    // $ANTLR start "rule__EventSync__SynchronisedEventAssignment_1_3"
    // InternalXMachine.g:5644:1: rule__EventSync__SynchronisedEventAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__EventSync__SynchronisedEventAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5648:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5649:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5649:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5650:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_3_0()); 
            }
            // InternalXMachine.g:5651:3: ( RULE_ID )
            // InternalXMachine.g:5652:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventIDTerminalRuleCall_1_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getSynchronisedEventEventIDTerminalRuleCall_1_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__SynchronisedEventAssignment_1_3"


    // $ANTLR start "rule__GroupSync__PrefixAssignment_1_1_0"
    // InternalXMachine.g:5663:1: rule__GroupSync__PrefixAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__GroupSync__PrefixAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5667:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5668:2: ( RULE_ID )
            {
            // InternalXMachine.g:5668:2: ( RULE_ID )
            // InternalXMachine.g:5669:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:5678:1: rule__GroupSync__SynchronisedCasesAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__GroupSync__SynchronisedCasesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5682:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5683:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5683:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5684:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesCrossReference_1_2_0()); 
            }
            // InternalXMachine.g:5685:3: ( RULE_ID )
            // InternalXMachine.g:5686:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesIDTerminalRuleCall_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesCrossReference_1_2_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:5697:1: rule__GroupSync__ActualParametersAssignment_2_1 : ( ruleXPar ) ;
    public final void rule__GroupSync__ActualParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5701:1: ( ( ruleXPar ) )
            // InternalXMachine.g:5702:2: ( ruleXPar )
            {
            // InternalXMachine.g:5702:2: ( ruleXPar )
            // InternalXMachine.g:5703:3: ruleXPar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getActualParametersXParParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXPar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getActualParametersXParParserRuleCall_2_1_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:5712:1: rule__GroupSync__ActualParametersAssignment_2_2_1 : ( ruleXPar ) ;
    public final void rule__GroupSync__ActualParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5716:1: ( ( ruleXPar ) )
            // InternalXMachine.g:5717:2: ( ruleXPar )
            {
            // InternalXMachine.g:5717:2: ( ruleXPar )
            // InternalXMachine.g:5718:3: ruleXPar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupSyncAccess().getActualParametersXParParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXPar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupSyncAccess().getActualParametersXParParserRuleCall_2_2_1_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:5727:1: rule__XParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5731:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5732:2: ( RULE_ID )
            {
            // InternalXMachine.g:5732:2: ( RULE_ID )
            // InternalXMachine.g:5733:3: RULE_ID
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


    // $ANTLR start "rule__XGuard__TheoremAssignment_1"
    // InternalXMachine.g:5742:1: rule__XGuard__TheoremAssignment_1 : ( ( 'theorem' ) ) ;
    public final void rule__XGuard__TheoremAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5746:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:5747:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:5747:2: ( ( 'theorem' ) )
            // InternalXMachine.g:5748:3: ( 'theorem' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_1_0()); 
            }
            // InternalXMachine.g:5749:3: ( 'theorem' )
            // InternalXMachine.g:5750:4: 'theorem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_1_0()); 
            }
            match(input,136,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__TheoremAssignment_1"


    // $ANTLR start "rule__XGuard__NameAssignment_2"
    // InternalXMachine.g:5761:1: rule__XGuard__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XGuard__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5765:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5766:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5766:2: ( RULE_XLABEL )
            // InternalXMachine.g:5767:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__NameAssignment_2"


    // $ANTLR start "rule__XGuard__PredicateAssignment_3"
    // InternalXMachine.g:5776:1: rule__XGuard__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XGuard__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5780:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:5781:2: ( ruleXFormula )
            {
            // InternalXMachine.g:5781:2: ( ruleXFormula )
            // InternalXMachine.g:5782:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__PredicateAssignment_3"


    // $ANTLR start "rule__XWitness__NameAssignment_1"
    // InternalXMachine.g:5791:1: rule__XWitness__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XWitness__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5795:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5796:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5796:2: ( RULE_XLABEL )
            // InternalXMachine.g:5797:3: RULE_XLABEL
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
    // InternalXMachine.g:5806:1: rule__XWitness__PredicateAssignment_2 : ( ruleXFormula ) ;
    public final void rule__XWitness__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5810:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:5811:2: ( ruleXFormula )
            {
            // InternalXMachine.g:5811:2: ( ruleXFormula )
            // InternalXMachine.g:5812:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getPredicateXFormulaParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getPredicateXFormulaParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:5821:1: rule__XAction__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5825:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5826:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5826:2: ( RULE_XLABEL )
            // InternalXMachine.g:5827:3: RULE_XLABEL
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
    // InternalXMachine.g:5836:1: rule__XAction__ActionAssignment_2 : ( ruleXFormula ) ;
    public final void rule__XAction__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5840:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:5841:2: ( ruleXFormula )
            {
            // InternalXMachine.g:5841:2: ( ruleXFormula )
            // InternalXMachine.g:5842:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionXFormulaParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getActionXFormulaParserRuleCall_2_0()); 
            }

            }


            }

        }
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
        // InternalXMachine.g:4984:8: ( rule__Machine__ExtensionsAssignment_3_2 )
        // InternalXMachine.g:4984:9: rule__Machine__ExtensionsAssignment_3_2
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFFFFFFFFFF062L,0x00003FFFFFFFFFFFL,0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0860000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x4790000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0007000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000002L,0x0007000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x3000000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xFFFFFFFFFFFFF060L,0x00003FFFFFFFFFFFL,0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L,0x8010000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0030000000000000L,0x000000000000023EL});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000002L,0x0860000000000000L});

}
