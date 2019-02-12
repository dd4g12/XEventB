package ac.soton.xeventb.xmachine.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXMachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_XLABEL", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variants'", "'events'", "'end'", "'includes'", "'to'", "'as'", "'.'", "'theorem'", "'group'", "'('", "','", "')'", "'begin'", "'event'", "'extends'", "'any'", "'where'", "'then'", "'with'", "'synchronises'", "'['", "']'", "'BOOL'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21151'", "'\\u2115'", "'\\u21191'", "'\\u2119'", "'\\u2124'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "'\\u00B7'", "'='", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "':'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'\\u00D7'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'%'", "'\\u22C2'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'in'", "'out'", "'ordinary'", "'convergent'", "'anticipated'"
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
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=7;
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
    public static final int RULE_XLABEL=5;
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
    public static final int RULE_STRING=6;
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

        public InternalXMachineParser(TokenStream input, XMachineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Machine";
       	}

       	@Override
       	protected XMachineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMachine"
    // InternalXMachine.g:65:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalXMachine.g:65:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalXMachine.g:66:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalXMachine.g:72:1: ruleMachine returns [EObject current=null] : ( () otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+ ) ) )* ) ) ) (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variants' ( (lv_variants_14_0= ruleXVariant ) )+ )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? ( (lv_extensions_18_0= ruleXGroup ) )* otherlv_19= 'end' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        EObject lv_extensions_8_0 = null;

        EObject lv_variables_10_0 = null;

        EObject lv_invariants_12_0 = null;

        EObject lv_variants_14_0 = null;

        EObject lv_events_16_0 = null;

        EObject lv_events_17_0 = null;

        EObject lv_extensions_18_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:78:2: ( ( () otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+ ) ) )* ) ) ) (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variants' ( (lv_variants_14_0= ruleXVariant ) )+ )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? ( (lv_extensions_18_0= ruleXGroup ) )* otherlv_19= 'end' ) )
            // InternalXMachine.g:79:2: ( () otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+ ) ) )* ) ) ) (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variants' ( (lv_variants_14_0= ruleXVariant ) )+ )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? ( (lv_extensions_18_0= ruleXGroup ) )* otherlv_19= 'end' )
            {
            // InternalXMachine.g:79:2: ( () otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+ ) ) )* ) ) ) (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variants' ( (lv_variants_14_0= ruleXVariant ) )+ )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? ( (lv_extensions_18_0= ruleXGroup ) )* otherlv_19= 'end' )
            // InternalXMachine.g:80:3: () otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+ ) ) )* ) ) ) (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variants' ( (lv_variants_14_0= ruleXVariant ) )+ )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? ( (lv_extensions_18_0= ruleXGroup ) )* otherlv_19= 'end'
            {
            // InternalXMachine.g:80:3: ()
            // InternalXMachine.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMachineAccess().getMachineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMachineAccess().getMachineKeyword_1());
            		
            // InternalXMachine.g:91:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:92:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:92:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:93:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:109:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+ ) ) )* ) ) )
            // InternalXMachine.g:110:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+ ) ) )* ) )
            {
            // InternalXMachine.g:110:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+ ) ) )* ) )
            // InternalXMachine.g:111:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+ ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMachineAccess().getUnorderedGroup_3());
            				
            // InternalXMachine.g:114:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+ ) ) )* )
            // InternalXMachine.g:115:6: ( ({...}? => ( ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+ ) ) )*
            {
            // InternalXMachine.g:115:6: ( ({...}? => ( ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+ ) ) )*
            loop3:
            do {
                int alt3=4;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
                    alt3=3;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXMachine.g:116:4: ({...}? => ( ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalXMachine.g:116:4: ({...}? => ( ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) ) ) )
            	    // InternalXMachine.g:117:5: {...}? => ( ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalXMachine.g:117:104: ( ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) ) )
            	    // InternalXMachine.g:118:6: ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalXMachine.g:121:9: ({...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) ) )
            	    // InternalXMachine.g:121:10: {...}? => (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMachine", "true");
            	    }
            	    // InternalXMachine.g:121:19: (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )
            	    // InternalXMachine.g:121:20: otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMachineAccess().getRefinesKeyword_3_0_0());
            	    								
            	    // InternalXMachine.g:125:9: ( (otherlv_5= RULE_ID ) )
            	    // InternalXMachine.g:126:10: (otherlv_5= RULE_ID )
            	    {
            	    // InternalXMachine.g:126:10: (otherlv_5= RULE_ID )
            	    // InternalXMachine.g:127:11: otherlv_5= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMachineRule());
            	    											}
            	    										
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    											newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getRefinesMachineCrossReference_3_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMachineAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXMachine.g:144:4: ({...}? => ( ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) ) ) )
            	    {
            	    // InternalXMachine.g:144:4: ({...}? => ( ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) ) ) )
            	    // InternalXMachine.g:145:5: {...}? => ( ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalXMachine.g:145:104: ( ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) ) )
            	    // InternalXMachine.g:146:6: ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalXMachine.g:149:9: ({...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ ) )
            	    // InternalXMachine.g:149:10: {...}? => (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMachine", "true");
            	    }
            	    // InternalXMachine.g:149:19: (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )
            	    // InternalXMachine.g:149:20: otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMachineAccess().getSeesKeyword_3_1_0());
            	    								
            	    // InternalXMachine.g:153:9: ( (otherlv_7= RULE_ID ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==RULE_ID) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalXMachine.g:154:10: (otherlv_7= RULE_ID )
            	    	    {
            	    	    // InternalXMachine.g:154:10: (otherlv_7= RULE_ID )
            	    	    // InternalXMachine.g:155:11: otherlv_7= RULE_ID
            	    	    {

            	    	    											if (current==null) {
            	    	    												current = createModelElement(grammarAccess.getMachineRule());
            	    	    											}
            	    	    										
            	    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    	    											newLeafNode(otherlv_7, grammarAccess.getMachineAccess().getSeesContextCrossReference_3_1_1_0());
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMachineAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXMachine.g:172:4: ({...}? => ( ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+ ) )
            	    {
            	    // InternalXMachine.g:172:4: ({...}? => ( ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+ ) )
            	    // InternalXMachine.g:173:5: {...}? => ( ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalXMachine.g:173:104: ( ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+ )
            	    // InternalXMachine.g:174:6: ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalXMachine.g:177:9: ({...}? => ( (lv_extensions_8_0= ruleMIncludes ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==20) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalXMachine.g:177:10: {...}? => ( (lv_extensions_8_0= ruleMIncludes ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleMachine", "true");
            	    	    }
            	    	    // InternalXMachine.g:177:19: ( (lv_extensions_8_0= ruleMIncludes ) )
            	    	    // InternalXMachine.g:177:20: (lv_extensions_8_0= ruleMIncludes )
            	    	    {
            	    	    // InternalXMachine.g:177:20: (lv_extensions_8_0= ruleMIncludes )
            	    	    // InternalXMachine.g:178:10: lv_extensions_8_0= ruleMIncludes
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_3_2_0());
            	    	    									
            	    	    pushFollow(FOLLOW_4);
            	    	    lv_extensions_8_0=ruleMIncludes();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getMachineRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"extensions",
            	    	    											lv_extensions_8_0,
            	    	    											"ac.soton.xeventb.xmachine.XMachine.MIncludes");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMachineAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMachineAccess().getUnorderedGroup_3());
            				

            }

            // InternalXMachine.g:207:3: (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXMachine.g:208:4: otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getMachineAccess().getVariablesKeyword_4_0());
                    			
                    // InternalXMachine.g:212:4: ( (lv_variables_10_0= ruleXVariable ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalXMachine.g:213:5: (lv_variables_10_0= ruleXVariable )
                    	    {
                    	    // InternalXMachine.g:213:5: (lv_variables_10_0= ruleXVariable )
                    	    // InternalXMachine.g:214:6: lv_variables_10_0= ruleXVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_variables_10_0=ruleXVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_10_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XVariable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:232:3: (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXMachine.g:233:4: otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getMachineAccess().getInvariantsKeyword_5_0());
                    			
                    // InternalXMachine.g:237:4: ( (lv_invariants_12_0= ruleXInvariant ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_XLABEL||LA6_0==24) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalXMachine.g:238:5: (lv_invariants_12_0= ruleXInvariant )
                    	    {
                    	    // InternalXMachine.g:238:5: (lv_invariants_12_0= ruleXInvariant )
                    	    // InternalXMachine.g:239:6: lv_invariants_12_0= ruleXInvariant
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_invariants_12_0=ruleXInvariant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"invariants",
                    	    							lv_invariants_12_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XInvariant");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:257:3: (otherlv_13= 'variants' ( (lv_variants_14_0= ruleXVariant ) )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXMachine.g:258:4: otherlv_13= 'variants' ( (lv_variants_14_0= ruleXVariant ) )+
                    {
                    otherlv_13=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getMachineAccess().getVariantsKeyword_6_0());
                    			
                    // InternalXMachine.g:262:4: ( (lv_variants_14_0= ruleXVariant ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_XLABEL) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalXMachine.g:263:5: (lv_variants_14_0= ruleXVariant )
                    	    {
                    	    // InternalXMachine.g:263:5: (lv_variants_14_0= ruleXVariant )
                    	    // InternalXMachine.g:264:6: lv_variants_14_0= ruleXVariant
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getVariantsXVariantParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_variants_14_0=ruleXVariant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variants",
                    	    							lv_variants_14_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XVariant");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:282:3: (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:283:4: otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )*
                    {
                    otherlv_15=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getMachineAccess().getEventsKeyword_7_0());
                    			
                    // InternalXMachine.g:287:4: ( (lv_events_16_0= ruleXEvent ) )
                    // InternalXMachine.g:288:5: (lv_events_16_0= ruleXEvent )
                    {
                    // InternalXMachine.g:288:5: (lv_events_16_0= ruleXEvent )
                    // InternalXMachine.g:289:6: lv_events_16_0= ruleXEvent
                    {

                    						newCompositeNode(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_events_16_0=ruleXEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    						}
                    						add(
                    							current,
                    							"events",
                    							lv_events_16_0,
                    							"ac.soton.xeventb.xmachine.XMachine.XEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXMachine.g:306:4: ( (lv_events_17_0= ruleXEvent ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==30||(LA10_0>=135 && LA10_0<=137)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalXMachine.g:307:5: (lv_events_17_0= ruleXEvent )
                    	    {
                    	    // InternalXMachine.g:307:5: (lv_events_17_0= ruleXEvent )
                    	    // InternalXMachine.g:308:6: lv_events_17_0= ruleXEvent
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_events_17_0=ruleXEvent();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"events",
                    	    							lv_events_17_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XEvent");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:326:3: ( (lv_extensions_18_0= ruleXGroup ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXMachine.g:327:4: (lv_extensions_18_0= ruleXGroup )
            	    {
            	    // InternalXMachine.g:327:4: (lv_extensions_18_0= ruleXGroup )
            	    // InternalXMachine.g:328:5: lv_extensions_18_0= ruleXGroup
            	    {

            	    					newCompositeNode(grammarAccess.getMachineAccess().getExtensionsXGroupParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_extensions_18_0=ruleXGroup();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_18_0,
            	    						"ac.soton.xeventb.xmachine.XMachine.XGroup");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_19=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getMachineAccess().getEndKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleMIncludes"
    // InternalXMachine.g:353:1: entryRuleMIncludes returns [EObject current=null] : iv_ruleMIncludes= ruleMIncludes EOF ;
    public final EObject entryRuleMIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMIncludes = null;


        try {
            // InternalXMachine.g:353:50: (iv_ruleMIncludes= ruleMIncludes EOF )
            // InternalXMachine.g:354:2: iv_ruleMIncludes= ruleMIncludes EOF
            {
             newCompositeNode(grammarAccess.getMIncludesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMIncludes=ruleMIncludes();

            state._fsp--;

             current =iv_ruleMIncludes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMIncludes"


    // $ANTLR start "ruleMIncludes"
    // InternalXMachine.g:360:1: ruleMIncludes returns [EObject current=null] : ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) ;
    public final EObject ruleMIncludes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_prefixes_6_0=null;
        Token lv_prefixes_7_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:366:2: ( ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) )
            // InternalXMachine.g:367:2: ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            {
            // InternalXMachine.g:367:2: ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            // InternalXMachine.g:368:3: () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            {
            // InternalXMachine.g:368:3: ()
            // InternalXMachine.g:369:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMIncludesAccess().getMachineInclusionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:375:3: (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:376:4: otherlv_1= 'includes' ( ( ruleQualifiedName ) )
            {
            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            				newLeafNode(otherlv_1, grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0());
            			
            // InternalXMachine.g:380:4: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:381:5: ( ruleQualifiedName )
            {
            // InternalXMachine.g:381:5: ( ruleQualifiedName )
            // InternalXMachine.g:382:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getMIncludesRule());
            						}
            					

            						newCompositeNode(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0());
            					
            pushFollow(FOLLOW_14);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalXMachine.g:397:3: (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:398:4: otherlv_3= 'to' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMIncludesAccess().getToKeyword_2_0());
                    			
                    // InternalXMachine.g:402:4: ( (otherlv_4= RULE_ID ) )
                    // InternalXMachine.g:403:5: (otherlv_4= RULE_ID )
                    {
                    // InternalXMachine.g:403:5: (otherlv_4= RULE_ID )
                    // InternalXMachine.g:404:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMIncludesRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_4, grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:416:3: (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXMachine.g:417:4: otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )*
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMIncludesAccess().getAsKeyword_3_0());
                    			
                    // InternalXMachine.g:421:4: ( (lv_prefixes_6_0= RULE_ID ) )
                    // InternalXMachine.g:422:5: (lv_prefixes_6_0= RULE_ID )
                    {
                    // InternalXMachine.g:422:5: (lv_prefixes_6_0= RULE_ID )
                    // InternalXMachine.g:423:6: lv_prefixes_6_0= RULE_ID
                    {
                    lv_prefixes_6_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_prefixes_6_0, grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMIncludesRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"prefixes",
                    							lv_prefixes_6_0,
                    							"ac.soton.xeventb.xmachine.XMachine.ID");
                    					

                    }


                    }

                    // InternalXMachine.g:439:4: ( (lv_prefixes_7_0= RULE_ID ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalXMachine.g:440:5: (lv_prefixes_7_0= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:440:5: (lv_prefixes_7_0= RULE_ID )
                    	    // InternalXMachine.g:441:6: lv_prefixes_7_0= RULE_ID
                    	    {
                    	    lv_prefixes_7_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    	    						newLeafNode(lv_prefixes_7_0, grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_2_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getMIncludesRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"prefixes",
                    	    							lv_prefixes_7_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.ID");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMIncludes"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalXMachine.g:462:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXMachine.g:462:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXMachine.g:463:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalXMachine.g:469:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:475:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalXMachine.g:476:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalXMachine.g:476:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // InternalXMachine.g:477:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXMachine.g:484:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXMachine.g:485:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,23,FOLLOW_3); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
                    			
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleXVariable"
    // InternalXMachine.g:502:1: entryRuleXVariable returns [EObject current=null] : iv_ruleXVariable= ruleXVariable EOF ;
    public final EObject entryRuleXVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariable = null;


        try {
            // InternalXMachine.g:502:50: (iv_ruleXVariable= ruleXVariable EOF )
            // InternalXMachine.g:503:2: iv_ruleXVariable= ruleXVariable EOF
            {
             newCompositeNode(grammarAccess.getXVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXVariable=ruleXVariable();

            state._fsp--;

             current =iv_ruleXVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariable"


    // $ANTLR start "ruleXVariable"
    // InternalXMachine.g:509:1: ruleXVariable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:515:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:516:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:516:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:517:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:517:3: ()
            // InternalXMachine.g:518:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:524:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:525:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:525:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:526:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariable"


    // $ANTLR start "entryRuleXInvariant"
    // InternalXMachine.g:546:1: entryRuleXInvariant returns [EObject current=null] : iv_ruleXInvariant= ruleXInvariant EOF ;
    public final EObject entryRuleXInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariant = null;


        try {
            // InternalXMachine.g:546:51: (iv_ruleXInvariant= ruleXInvariant EOF )
            // InternalXMachine.g:547:2: iv_ruleXInvariant= ruleXInvariant EOF
            {
             newCompositeNode(grammarAccess.getXInvariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXInvariant=ruleXInvariant();

            state._fsp--;

             current =iv_ruleXInvariant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXInvariant"


    // $ANTLR start "ruleXInvariant"
    // InternalXMachine.g:553:1: ruleXInvariant returns [EObject current=null] : ( () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleXInvariant() throws RecognitionException {
        EObject current = null;

        Token lv_theorem_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:559:2: ( ( () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:560:2: ( () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:560:2: ( () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            // InternalXMachine.g:561:3: () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) )
            {
            // InternalXMachine.g:561:3: ()
            // InternalXMachine.g:562:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXInvariantAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:568:3: ( (lv_theorem_1_0= 'theorem' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:569:4: (lv_theorem_1_0= 'theorem' )
                    {
                    // InternalXMachine.g:569:4: (lv_theorem_1_0= 'theorem' )
                    // InternalXMachine.g:570:5: lv_theorem_1_0= 'theorem'
                    {
                    lv_theorem_1_0=(Token)match(input,24,FOLLOW_9); 

                    					newLeafNode(lv_theorem_1_0, grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXInvariantRule());
                    					}
                    					setWithLastConsumed(current, "theorem", true, "theorem");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:582:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:583:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:583:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:584:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_18); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXInvariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:600:3: ( (lv_predicate_3_0= ruleXFormula ) )
            // InternalXMachine.g:601:4: (lv_predicate_3_0= ruleXFormula )
            {
            // InternalXMachine.g:601:4: (lv_predicate_3_0= ruleXFormula )
            // InternalXMachine.g:602:5: lv_predicate_3_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXInvariantAccess().getPredicateXFormulaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_3_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXInvariantRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_3_0,
            						"ac.soton.xeventb.xmachine.XMachine.XFormula");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXInvariant"


    // $ANTLR start "entryRuleXVariant"
    // InternalXMachine.g:623:1: entryRuleXVariant returns [EObject current=null] : iv_ruleXVariant= ruleXVariant EOF ;
    public final EObject entryRuleXVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariant = null;


        try {
            // InternalXMachine.g:623:49: (iv_ruleXVariant= ruleXVariant EOF )
            // InternalXMachine.g:624:2: iv_ruleXVariant= ruleXVariant EOF
            {
             newCompositeNode(grammarAccess.getXVariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXVariant=ruleXVariant();

            state._fsp--;

             current =iv_ruleXVariant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariant"


    // $ANTLR start "ruleXVariant"
    // InternalXMachine.g:630:1: ruleXVariant returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_expression_2_0= ruleXFormula ) ) ) ;
    public final EObject ruleXVariant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:636:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_expression_2_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:637:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_expression_2_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:637:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_expression_2_0= ruleXFormula ) ) )
            // InternalXMachine.g:638:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_expression_2_0= ruleXFormula ) )
            {
            // InternalXMachine.g:638:3: ()
            // InternalXMachine.g:639:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariantAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:645:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:646:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:646:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:647:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXVariantAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:663:3: ( (lv_expression_2_0= ruleXFormula ) )
            // InternalXMachine.g:664:4: (lv_expression_2_0= ruleXFormula )
            {
            // InternalXMachine.g:664:4: (lv_expression_2_0= ruleXFormula )
            // InternalXMachine.g:665:5: lv_expression_2_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXVariantAccess().getExpressionXFormulaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXVariantRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XFormula");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariant"


    // $ANTLR start "entryRuleXGroup"
    // InternalXMachine.g:686:1: entryRuleXGroup returns [EObject current=null] : iv_ruleXGroup= ruleXGroup EOF ;
    public final EObject entryRuleXGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGroup = null;


        try {
            // InternalXMachine.g:686:47: (iv_ruleXGroup= ruleXGroup EOF )
            // InternalXMachine.g:687:2: iv_ruleXGroup= ruleXGroup EOF
            {
             newCompositeNode(grammarAccess.getXGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXGroup=ruleXGroup();

            state._fsp--;

             current =iv_ruleXGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXGroup"


    // $ANTLR start "ruleXGroup"
    // InternalXMachine.g:693:1: ruleXGroup returns [EObject current=null] : ( () otherlv_1= 'group' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )? (otherlv_8= 'begin' ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) )* )? otherlv_11= 'end' ) ;
    public final EObject ruleXGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_formalParameters_4_0 = null;

        EObject lv_formalParameters_6_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:699:2: ( ( () otherlv_1= 'group' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )? (otherlv_8= 'begin' ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) )* )? otherlv_11= 'end' ) )
            // InternalXMachine.g:700:2: ( () otherlv_1= 'group' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )? (otherlv_8= 'begin' ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) )* )? otherlv_11= 'end' )
            {
            // InternalXMachine.g:700:2: ( () otherlv_1= 'group' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )? (otherlv_8= 'begin' ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) )* )? otherlv_11= 'end' )
            // InternalXMachine.g:701:3: () otherlv_1= 'group' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )? (otherlv_8= 'begin' ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) )* )? otherlv_11= 'end'
            {
            // InternalXMachine.g:701:3: ()
            // InternalXMachine.g:702:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGroupAccess().getEventCasesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getXGroupAccess().getGroupKeyword_1());
            		
            // InternalXMachine.g:712:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:713:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:713:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:714:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXGroupAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:730:3: (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXMachine.g:731:4: otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getXGroupAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalXMachine.g:735:4: ( (lv_formalParameters_4_0= ruleXFormalParameter ) )
                    // InternalXMachine.g:736:5: (lv_formalParameters_4_0= ruleXFormalParameter )
                    {
                    // InternalXMachine.g:736:5: (lv_formalParameters_4_0= ruleXFormalParameter )
                    // InternalXMachine.g:737:6: lv_formalParameters_4_0= ruleXFormalParameter
                    {

                    						newCompositeNode(grammarAccess.getXGroupAccess().getFormalParametersXFormalParameterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_formalParameters_4_0=ruleXFormalParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXGroupRule());
                    						}
                    						add(
                    							current,
                    							"formalParameters",
                    							lv_formalParameters_4_0,
                    							"ac.soton.xeventb.xmachine.XMachine.XFormalParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXMachine.g:754:4: (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==27) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalXMachine.g:755:5: otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_20); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getXGroupAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalXMachine.g:759:5: ( (lv_formalParameters_6_0= ruleXFormalParameter ) )
                    	    // InternalXMachine.g:760:6: (lv_formalParameters_6_0= ruleXFormalParameter )
                    	    {
                    	    // InternalXMachine.g:760:6: (lv_formalParameters_6_0= ruleXFormalParameter )
                    	    // InternalXMachine.g:761:7: lv_formalParameters_6_0= ruleXFormalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getXGroupAccess().getFormalParametersXFormalParameterParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_formalParameters_6_0=ruleXFormalParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"formalParameters",
                    	    								lv_formalParameters_6_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XFormalParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getXGroupAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalXMachine.g:784:3: (otherlv_8= 'begin' ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXMachine.g:785:4: otherlv_8= 'begin' ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) )*
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getXGroupAccess().getBeginKeyword_4_0());
                    			
                    // InternalXMachine.g:789:4: ( (otherlv_9= RULE_ID ) )
                    // InternalXMachine.g:790:5: (otherlv_9= RULE_ID )
                    {
                    // InternalXMachine.g:790:5: (otherlv_9= RULE_ID )
                    // InternalXMachine.g:791:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXGroupRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_9, grammarAccess.getXGroupAccess().getEventsEventCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalXMachine.g:802:4: ( (otherlv_10= RULE_ID ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalXMachine.g:803:5: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:803:5: (otherlv_10= RULE_ID )
                    	    // InternalXMachine.g:804:6: otherlv_10= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getXGroupRule());
                    	    						}
                    	    					
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_23); 

                    	    						newLeafNode(otherlv_10, grammarAccess.getXGroupAccess().getEventsEventCrossReference_4_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getXGroupAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXGroup"


    // $ANTLR start "entryRuleXFormalParameter"
    // InternalXMachine.g:824:1: entryRuleXFormalParameter returns [EObject current=null] : iv_ruleXFormalParameter= ruleXFormalParameter EOF ;
    public final EObject entryRuleXFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFormalParameter = null;


        try {
            // InternalXMachine.g:824:57: (iv_ruleXFormalParameter= ruleXFormalParameter EOF )
            // InternalXMachine.g:825:2: iv_ruleXFormalParameter= ruleXFormalParameter EOF
            {
             newCompositeNode(grammarAccess.getXFormalParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXFormalParameter=ruleXFormalParameter();

            state._fsp--;

             current =iv_ruleXFormalParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFormalParameter"


    // $ANTLR start "ruleXFormalParameter"
    // InternalXMachine.g:831:1: ruleXFormalParameter returns [EObject current=null] : ( () ( (lv_direction_1_0= ruleXDirection ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXFormalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Enumerator lv_direction_1_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:837:2: ( ( () ( (lv_direction_1_0= ruleXDirection ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:838:2: ( () ( (lv_direction_1_0= ruleXDirection ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:838:2: ( () ( (lv_direction_1_0= ruleXDirection ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:839:3: () ( (lv_direction_1_0= ruleXDirection ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:839:3: ()
            // InternalXMachine.g:840:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXFormalParameterAccess().getFormalParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:846:3: ( (lv_direction_1_0= ruleXDirection ) )
            // InternalXMachine.g:847:4: (lv_direction_1_0= ruleXDirection )
            {
            // InternalXMachine.g:847:4: (lv_direction_1_0= ruleXDirection )
            // InternalXMachine.g:848:5: lv_direction_1_0= ruleXDirection
            {

            					newCompositeNode(grammarAccess.getXFormalParameterAccess().getDirectionXDirectionEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_direction_1_0=ruleXDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXFormalParameterRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XDirection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMachine.g:865:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:866:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:866:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:867:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXFormalParameterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXFormalParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFormalParameter"


    // $ANTLR start "entryRuleXEvent"
    // InternalXMachine.g:887:1: entryRuleXEvent returns [EObject current=null] : iv_ruleXEvent= ruleXEvent EOF ;
    public final EObject entryRuleXEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEvent = null;


        try {
            // InternalXMachine.g:887:47: (iv_ruleXEvent= ruleXEvent EOF )
            // InternalXMachine.g:888:2: iv_ruleXEvent= ruleXEvent EOF
            {
             newCompositeNode(grammarAccess.getXEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXEvent=ruleXEvent();

            state._fsp--;

             current =iv_ruleXEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEvent"


    // $ANTLR start "ruleXEvent"
    // InternalXMachine.g:894:1: ruleXEvent returns [EObject current=null] : ( () ( (lv_convergence_1_0= ruleXConvergence ) )? otherlv_2= 'event' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+ ) | ( ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) ) ) )? (otherlv_8= 'any' ( (lv_parameters_9_0= ruleXParameter ) )+ )? ( (lv_extensions_10_0= ruleXGroupOrEvent ) )* (otherlv_11= 'where' ( (lv_guards_12_0= ruleXGuard ) )+ )? (otherlv_13= 'then' ( (lv_actions_14_0= ruleXAction ) )+ )? (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? otherlv_17= 'end' ) ;
    public final EObject ruleXEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_extended_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Enumerator lv_convergence_1_0 = null;

        EObject lv_parameters_9_0 = null;

        EObject lv_extensions_10_0 = null;

        EObject lv_guards_12_0 = null;

        EObject lv_actions_14_0 = null;

        EObject lv_witnesses_16_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:900:2: ( ( () ( (lv_convergence_1_0= ruleXConvergence ) )? otherlv_2= 'event' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+ ) | ( ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) ) ) )? (otherlv_8= 'any' ( (lv_parameters_9_0= ruleXParameter ) )+ )? ( (lv_extensions_10_0= ruleXGroupOrEvent ) )* (otherlv_11= 'where' ( (lv_guards_12_0= ruleXGuard ) )+ )? (otherlv_13= 'then' ( (lv_actions_14_0= ruleXAction ) )+ )? (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? otherlv_17= 'end' ) )
            // InternalXMachine.g:901:2: ( () ( (lv_convergence_1_0= ruleXConvergence ) )? otherlv_2= 'event' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+ ) | ( ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) ) ) )? (otherlv_8= 'any' ( (lv_parameters_9_0= ruleXParameter ) )+ )? ( (lv_extensions_10_0= ruleXGroupOrEvent ) )* (otherlv_11= 'where' ( (lv_guards_12_0= ruleXGuard ) )+ )? (otherlv_13= 'then' ( (lv_actions_14_0= ruleXAction ) )+ )? (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? otherlv_17= 'end' )
            {
            // InternalXMachine.g:901:2: ( () ( (lv_convergence_1_0= ruleXConvergence ) )? otherlv_2= 'event' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+ ) | ( ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) ) ) )? (otherlv_8= 'any' ( (lv_parameters_9_0= ruleXParameter ) )+ )? ( (lv_extensions_10_0= ruleXGroupOrEvent ) )* (otherlv_11= 'where' ( (lv_guards_12_0= ruleXGuard ) )+ )? (otherlv_13= 'then' ( (lv_actions_14_0= ruleXAction ) )+ )? (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? otherlv_17= 'end' )
            // InternalXMachine.g:902:3: () ( (lv_convergence_1_0= ruleXConvergence ) )? otherlv_2= 'event' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+ ) | ( ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) ) ) )? (otherlv_8= 'any' ( (lv_parameters_9_0= ruleXParameter ) )+ )? ( (lv_extensions_10_0= ruleXGroupOrEvent ) )* (otherlv_11= 'where' ( (lv_guards_12_0= ruleXGuard ) )+ )? (otherlv_13= 'then' ( (lv_actions_14_0= ruleXAction ) )+ )? (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? otherlv_17= 'end'
            {
            // InternalXMachine.g:902:3: ()
            // InternalXMachine.g:903:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXEventAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:909:3: ( (lv_convergence_1_0= ruleXConvergence ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=135 && LA22_0<=137)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXMachine.g:910:4: (lv_convergence_1_0= ruleXConvergence )
                    {
                    // InternalXMachine.g:910:4: (lv_convergence_1_0= ruleXConvergence )
                    // InternalXMachine.g:911:5: lv_convergence_1_0= ruleXConvergence
                    {

                    					newCompositeNode(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_convergence_1_0=ruleXConvergence();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getXEventRule());
                    					}
                    					set(
                    						current,
                    						"convergence",
                    						lv_convergence_1_0,
                    						"ac.soton.xeventb.xmachine.XMachine.XConvergence");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getXEventAccess().getEventKeyword_2());
            		
            // InternalXMachine.g:932:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXMachine.g:933:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXMachine.g:933:4: (lv_name_3_0= RULE_ID )
            // InternalXMachine.g:934:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_3_0, grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:950:3: ( (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+ ) | ( ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) ) ) )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            else if ( (LA24_0==31) ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // InternalXMachine.g:951:4: (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+ )
                    {
                    // InternalXMachine.g:951:4: (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+ )
                    // InternalXMachine.g:952:5: otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getXEventAccess().getRefinesKeyword_4_0_0());
                    				
                    // InternalXMachine.g:956:5: ( (otherlv_5= RULE_ID ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ID) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalXMachine.g:957:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:957:6: (otherlv_5= RULE_ID )
                    	    // InternalXMachine.g:958:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getXEventRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_26); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_0_1_0());
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:971:4: ( ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalXMachine.g:971:4: ( ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) ) )
                    // InternalXMachine.g:972:5: ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalXMachine.g:972:5: ( (lv_extended_6_0= 'extends' ) )
                    // InternalXMachine.g:973:6: (lv_extended_6_0= 'extends' )
                    {
                    // InternalXMachine.g:973:6: (lv_extended_6_0= 'extends' )
                    // InternalXMachine.g:974:7: lv_extended_6_0= 'extends'
                    {
                    lv_extended_6_0=(Token)match(input,31,FOLLOW_3); 

                    							newLeafNode(lv_extended_6_0, grammarAccess.getXEventAccess().getExtendedExtendsKeyword_4_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getXEventRule());
                    							}
                    							setWithLastConsumed(current, "extended", true, "extends");
                    						

                    }


                    }

                    // InternalXMachine.g:986:5: ( (otherlv_7= RULE_ID ) )
                    // InternalXMachine.g:987:6: (otherlv_7= RULE_ID )
                    {
                    // InternalXMachine.g:987:6: (otherlv_7= RULE_ID )
                    // InternalXMachine.g:988:7: otherlv_7= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getXEventRule());
                    							}
                    						
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_27); 

                    							newLeafNode(otherlv_7, grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:1001:3: (otherlv_8= 'any' ( (lv_parameters_9_0= ruleXParameter ) )+ )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXMachine.g:1002:4: otherlv_8= 'any' ( (lv_parameters_9_0= ruleXParameter ) )+
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getXEventAccess().getAnyKeyword_5_0());
                    			
                    // InternalXMachine.g:1006:4: ( (lv_parameters_9_0= ruleXParameter ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalXMachine.g:1007:5: (lv_parameters_9_0= ruleXParameter )
                    	    {
                    	    // InternalXMachine.g:1007:5: (lv_parameters_9_0= ruleXParameter )
                    	    // InternalXMachine.g:1008:6: lv_parameters_9_0= ruleXParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_parameters_9_0=ruleXParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_9_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XParameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:1026:3: ( (lv_extensions_10_0= ruleXGroupOrEvent ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==36) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalXMachine.g:1027:4: (lv_extensions_10_0= ruleXGroupOrEvent )
            	    {
            	    // InternalXMachine.g:1027:4: (lv_extensions_10_0= ruleXGroupOrEvent )
            	    // InternalXMachine.g:1028:5: lv_extensions_10_0= ruleXGroupOrEvent
            	    {

            	    					newCompositeNode(grammarAccess.getXEventAccess().getExtensionsXGroupOrEventParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_extensions_10_0=ruleXGroupOrEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXEventRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_10_0,
            	    						"ac.soton.xeventb.xmachine.XMachine.XGroupOrEvent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalXMachine.g:1045:3: (otherlv_11= 'where' ( (lv_guards_12_0= ruleXGuard ) )+ )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXMachine.g:1046:4: otherlv_11= 'where' ( (lv_guards_12_0= ruleXGuard ) )+
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getXEventAccess().getWhereKeyword_7_0());
                    			
                    // InternalXMachine.g:1050:4: ( (lv_guards_12_0= ruleXGuard ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_XLABEL||LA28_0==24) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalXMachine.g:1051:5: (lv_guards_12_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1051:5: (lv_guards_12_0= ruleXGuard )
                    	    // InternalXMachine.g:1052:6: lv_guards_12_0= ruleXGuard
                    	    {

                    	    						newCompositeNode(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
                    	    lv_guards_12_0=ruleXGuard();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"guards",
                    	    							lv_guards_12_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XGuard");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:1070:3: (otherlv_13= 'then' ( (lv_actions_14_0= ruleXAction ) )+ )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXMachine.g:1071:4: otherlv_13= 'then' ( (lv_actions_14_0= ruleXAction ) )+
                    {
                    otherlv_13=(Token)match(input,34,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getXEventAccess().getThenKeyword_8_0());
                    			
                    // InternalXMachine.g:1075:4: ( (lv_actions_14_0= ruleXAction ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_XLABEL) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalXMachine.g:1076:5: (lv_actions_14_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:1076:5: (lv_actions_14_0= ruleXAction )
                    	    // InternalXMachine.g:1077:6: lv_actions_14_0= ruleXAction
                    	    {

                    	    						newCompositeNode(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_31);
                    	    lv_actions_14_0=ruleXAction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"actions",
                    	    							lv_actions_14_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XAction");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:1095:3: (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXMachine.g:1096:4: otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+
                    {
                    otherlv_15=(Token)match(input,35,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getXEventAccess().getWithKeyword_9_0());
                    			
                    // InternalXMachine.g:1100:4: ( (lv_witnesses_16_0= ruleXWitness ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_XLABEL) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalXMachine.g:1101:5: (lv_witnesses_16_0= ruleXWitness )
                    	    {
                    	    // InternalXMachine.g:1101:5: (lv_witnesses_16_0= ruleXWitness )
                    	    // InternalXMachine.g:1102:6: lv_witnesses_16_0= ruleXWitness
                    	    {

                    	    						newCompositeNode(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_9_1_0());
                    	    					
                    	    pushFollow(FOLLOW_32);
                    	    lv_witnesses_16_0=ruleXWitness();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"witnesses",
                    	    							lv_witnesses_16_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XWitness");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getXEventAccess().getEndKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEvent"


    // $ANTLR start "entryRuleEventSync"
    // InternalXMachine.g:1128:1: entryRuleEventSync returns [EObject current=null] : iv_ruleEventSync= ruleEventSync EOF ;
    public final EObject entryRuleEventSync() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSync = null;


        try {
            // InternalXMachine.g:1128:50: (iv_ruleEventSync= ruleEventSync EOF )
            // InternalXMachine.g:1129:2: iv_ruleEventSync= ruleEventSync EOF
            {
             newCompositeNode(grammarAccess.getEventSyncRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventSync=ruleEventSync();

            state._fsp--;

             current =iv_ruleEventSync; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventSync"


    // $ANTLR start "ruleEventSync"
    // InternalXMachine.g:1135:1: ruleEventSync returns [EObject current=null] : ( () (otherlv_1= 'synchronises' otherlv_2= 'event' ( ( (lv_prefix_3_0= RULE_ID ) ) otherlv_4= '.' )? ( (otherlv_5= RULE_ID ) ) ) ( ruleXSyncParameters )? ) ;
    public final EObject ruleEventSync() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_prefix_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalXMachine.g:1141:2: ( ( () (otherlv_1= 'synchronises' otherlv_2= 'event' ( ( (lv_prefix_3_0= RULE_ID ) ) otherlv_4= '.' )? ( (otherlv_5= RULE_ID ) ) ) ( ruleXSyncParameters )? ) )
            // InternalXMachine.g:1142:2: ( () (otherlv_1= 'synchronises' otherlv_2= 'event' ( ( (lv_prefix_3_0= RULE_ID ) ) otherlv_4= '.' )? ( (otherlv_5= RULE_ID ) ) ) ( ruleXSyncParameters )? )
            {
            // InternalXMachine.g:1142:2: ( () (otherlv_1= 'synchronises' otherlv_2= 'event' ( ( (lv_prefix_3_0= RULE_ID ) ) otherlv_4= '.' )? ( (otherlv_5= RULE_ID ) ) ) ( ruleXSyncParameters )? )
            // InternalXMachine.g:1143:3: () (otherlv_1= 'synchronises' otherlv_2= 'event' ( ( (lv_prefix_3_0= RULE_ID ) ) otherlv_4= '.' )? ( (otherlv_5= RULE_ID ) ) ) ( ruleXSyncParameters )?
            {
            // InternalXMachine.g:1143:3: ()
            // InternalXMachine.g:1144:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1150:3: (otherlv_1= 'synchronises' otherlv_2= 'event' ( ( (lv_prefix_3_0= RULE_ID ) ) otherlv_4= '.' )? ( (otherlv_5= RULE_ID ) ) )
            // InternalXMachine.g:1151:4: otherlv_1= 'synchronises' otherlv_2= 'event' ( ( (lv_prefix_3_0= RULE_ID ) ) otherlv_4= '.' )? ( (otherlv_5= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,36,FOLLOW_24); 

            				newLeafNode(otherlv_1, grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0());
            			
            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getEventSyncAccess().getEventKeyword_1_1());
            			
            // InternalXMachine.g:1159:4: ( ( (lv_prefix_3_0= RULE_ID ) ) otherlv_4= '.' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==23) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalXMachine.g:1160:5: ( (lv_prefix_3_0= RULE_ID ) ) otherlv_4= '.'
                    {
                    // InternalXMachine.g:1160:5: ( (lv_prefix_3_0= RULE_ID ) )
                    // InternalXMachine.g:1161:6: (lv_prefix_3_0= RULE_ID )
                    {
                    // InternalXMachine.g:1161:6: (lv_prefix_3_0= RULE_ID )
                    // InternalXMachine.g:1162:7: lv_prefix_3_0= RULE_ID
                    {
                    lv_prefix_3_0=(Token)match(input,RULE_ID,FOLLOW_33); 

                    							newLeafNode(lv_prefix_3_0, grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_1_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEventSyncRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"prefix",
                    								lv_prefix_3_0,
                    								"ac.soton.xeventb.xmachine.XMachine.ID");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getEventSyncAccess().getFullStopKeyword_1_2_1());
                    				

                    }
                    break;

            }

            // InternalXMachine.g:1183:4: ( (otherlv_5= RULE_ID ) )
            // InternalXMachine.g:1184:5: (otherlv_5= RULE_ID )
            {
            // InternalXMachine.g:1184:5: (otherlv_5= RULE_ID )
            // InternalXMachine.g:1185:6: otherlv_5= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEventSyncRule());
            						}
            					
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_34); 

            						newLeafNode(otherlv_5, grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_3_0());
            					

            }


            }


            }

            // InternalXMachine.g:1197:3: ( ruleXSyncParameters )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXMachine.g:1198:4: ruleXSyncParameters
                    {

                    				newCompositeNode(grammarAccess.getEventSyncAccess().getXSyncParametersParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_2);
                    ruleXSyncParameters();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventSync"


    // $ANTLR start "entryRuleXSyncParameters"
    // InternalXMachine.g:1210:1: entryRuleXSyncParameters returns [String current=null] : iv_ruleXSyncParameters= ruleXSyncParameters EOF ;
    public final String entryRuleXSyncParameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXSyncParameters = null;


        try {
            // InternalXMachine.g:1210:55: (iv_ruleXSyncParameters= ruleXSyncParameters EOF )
            // InternalXMachine.g:1211:2: iv_ruleXSyncParameters= ruleXSyncParameters EOF
            {
             newCompositeNode(grammarAccess.getXSyncParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXSyncParameters=ruleXSyncParameters();

            state._fsp--;

             current =iv_ruleXSyncParameters.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSyncParameters"


    // $ANTLR start "ruleXSyncParameters"
    // InternalXMachine.g:1217:1: ruleXSyncParameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' (this_ID_1= RULE_ID )+ kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleXSyncParameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalXMachine.g:1223:2: ( (kw= '[' (this_ID_1= RULE_ID )+ kw= ']' ) )
            // InternalXMachine.g:1224:2: (kw= '[' (this_ID_1= RULE_ID )+ kw= ']' )
            {
            // InternalXMachine.g:1224:2: (kw= '[' (this_ID_1= RULE_ID )+ kw= ']' )
            // InternalXMachine.g:1225:3: kw= '[' (this_ID_1= RULE_ID )+ kw= ']'
            {
            kw=(Token)match(input,37,FOLLOW_3); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getXSyncParametersAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalXMachine.g:1230:3: (this_ID_1= RULE_ID )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalXMachine.g:1231:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    				current.merge(this_ID_1);
            	    			

            	    				newLeafNode(this_ID_1, grammarAccess.getXSyncParametersAccess().getIDTerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            kw=(Token)match(input,38,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getXSyncParametersAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSyncParameters"


    // $ANTLR start "entryRuleGroupSync"
    // InternalXMachine.g:1248:1: entryRuleGroupSync returns [EObject current=null] : iv_ruleGroupSync= ruleGroupSync EOF ;
    public final EObject entryRuleGroupSync() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupSync = null;


        try {
            // InternalXMachine.g:1248:50: (iv_ruleGroupSync= ruleGroupSync EOF )
            // InternalXMachine.g:1249:2: iv_ruleGroupSync= ruleGroupSync EOF
            {
             newCompositeNode(grammarAccess.getGroupSyncRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupSync=ruleGroupSync();

            state._fsp--;

             current =iv_ruleGroupSync; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupSync"


    // $ANTLR start "ruleGroupSync"
    // InternalXMachine.g:1255:1: ruleGroupSync returns [EObject current=null] : ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= '(' ( (lv_actualParameters_6_0= ruleXPar ) ) (otherlv_7= ',' ( (lv_actualParameters_8_0= ruleXPar ) ) )* otherlv_9= ')' )? ) ;
    public final EObject ruleGroupSync() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefix_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_actualParameters_6_0 = null;

        AntlrDatatypeRuleToken lv_actualParameters_8_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1261:2: ( ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= '(' ( (lv_actualParameters_6_0= ruleXPar ) ) (otherlv_7= ',' ( (lv_actualParameters_8_0= ruleXPar ) ) )* otherlv_9= ')' )? ) )
            // InternalXMachine.g:1262:2: ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= '(' ( (lv_actualParameters_6_0= ruleXPar ) ) (otherlv_7= ',' ( (lv_actualParameters_8_0= ruleXPar ) ) )* otherlv_9= ')' )? )
            {
            // InternalXMachine.g:1262:2: ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= '(' ( (lv_actualParameters_6_0= ruleXPar ) ) (otherlv_7= ',' ( (lv_actualParameters_8_0= ruleXPar ) ) )* otherlv_9= ')' )? )
            // InternalXMachine.g:1263:3: () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= '(' ( (lv_actualParameters_6_0= ruleXPar ) ) (otherlv_7= ',' ( (lv_actualParameters_8_0= ruleXPar ) ) )* otherlv_9= ')' )?
            {
            // InternalXMachine.g:1263:3: ()
            // InternalXMachine.g:1264:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupSyncAccess().getEventSynchronisationAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1270:3: (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            // InternalXMachine.g:1271:4: otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            				newLeafNode(otherlv_1, grammarAccess.getGroupSyncAccess().getSynchronisesKeyword_1_0());
            			
            // InternalXMachine.g:1275:4: ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==23) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalXMachine.g:1276:5: ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.'
                    {
                    // InternalXMachine.g:1276:5: ( (lv_prefix_2_0= RULE_ID ) )
                    // InternalXMachine.g:1277:6: (lv_prefix_2_0= RULE_ID )
                    {
                    // InternalXMachine.g:1277:6: (lv_prefix_2_0= RULE_ID )
                    // InternalXMachine.g:1278:7: lv_prefix_2_0= RULE_ID
                    {
                    lv_prefix_2_0=(Token)match(input,RULE_ID,FOLLOW_33); 

                    							newLeafNode(lv_prefix_2_0, grammarAccess.getGroupSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGroupSyncRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"prefix",
                    								lv_prefix_2_0,
                    								"ac.soton.xeventb.xmachine.XMachine.ID");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getGroupSyncAccess().getFullStopKeyword_1_1_1());
                    				

                    }
                    break;

            }

            // InternalXMachine.g:1299:4: ( (otherlv_4= RULE_ID ) )
            // InternalXMachine.g:1300:5: (otherlv_4= RULE_ID )
            {
            // InternalXMachine.g:1300:5: (otherlv_4= RULE_ID )
            // InternalXMachine.g:1301:6: otherlv_4= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGroupSyncRule());
            						}
            					
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_36); 

            						newLeafNode(otherlv_4, grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesCrossReference_1_2_0());
            					

            }


            }


            }

            // InternalXMachine.g:1313:3: (otherlv_5= '(' ( (lv_actualParameters_6_0= ruleXPar ) ) (otherlv_7= ',' ( (lv_actualParameters_8_0= ruleXPar ) ) )* otherlv_9= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==26) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXMachine.g:1314:4: otherlv_5= '(' ( (lv_actualParameters_6_0= ruleXPar ) ) (otherlv_7= ',' ( (lv_actualParameters_8_0= ruleXPar ) ) )* otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_37); 

                    				newLeafNode(otherlv_5, grammarAccess.getGroupSyncAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalXMachine.g:1318:4: ( (lv_actualParameters_6_0= ruleXPar ) )
                    // InternalXMachine.g:1319:5: (lv_actualParameters_6_0= ruleXPar )
                    {
                    // InternalXMachine.g:1319:5: (lv_actualParameters_6_0= ruleXPar )
                    // InternalXMachine.g:1320:6: lv_actualParameters_6_0= ruleXPar
                    {

                    						newCompositeNode(grammarAccess.getGroupSyncAccess().getActualParametersXParParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_actualParameters_6_0=ruleXPar();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroupSyncRule());
                    						}
                    						add(
                    							current,
                    							"actualParameters",
                    							lv_actualParameters_6_0,
                    							"ac.soton.xeventb.xmachine.XMachine.XPar");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXMachine.g:1337:4: (otherlv_7= ',' ( (lv_actualParameters_8_0= ruleXPar ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==27) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalXMachine.g:1338:5: otherlv_7= ',' ( (lv_actualParameters_8_0= ruleXPar ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_37); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getGroupSyncAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalXMachine.g:1342:5: ( (lv_actualParameters_8_0= ruleXPar ) )
                    	    // InternalXMachine.g:1343:6: (lv_actualParameters_8_0= ruleXPar )
                    	    {
                    	    // InternalXMachine.g:1343:6: (lv_actualParameters_8_0= ruleXPar )
                    	    // InternalXMachine.g:1344:7: lv_actualParameters_8_0= ruleXPar
                    	    {

                    	    							newCompositeNode(grammarAccess.getGroupSyncAccess().getActualParametersXParParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_actualParameters_8_0=ruleXPar();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGroupSyncRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actualParameters",
                    	    								lv_actualParameters_8_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XPar");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getGroupSyncAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupSync"


    // $ANTLR start "entryRuleXGroupOrEvent"
    // InternalXMachine.g:1371:1: entryRuleXGroupOrEvent returns [EObject current=null] : iv_ruleXGroupOrEvent= ruleXGroupOrEvent EOF ;
    public final EObject entryRuleXGroupOrEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGroupOrEvent = null;


        try {
            // InternalXMachine.g:1371:54: (iv_ruleXGroupOrEvent= ruleXGroupOrEvent EOF )
            // InternalXMachine.g:1372:2: iv_ruleXGroupOrEvent= ruleXGroupOrEvent EOF
            {
             newCompositeNode(grammarAccess.getXGroupOrEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXGroupOrEvent=ruleXGroupOrEvent();

            state._fsp--;

             current =iv_ruleXGroupOrEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXGroupOrEvent"


    // $ANTLR start "ruleXGroupOrEvent"
    // InternalXMachine.g:1378:1: ruleXGroupOrEvent returns [EObject current=null] : (this_GroupSync_0= ruleGroupSync | this_EventSync_1= ruleEventSync ) ;
    public final EObject ruleXGroupOrEvent() throws RecognitionException {
        EObject current = null;

        EObject this_GroupSync_0 = null;

        EObject this_EventSync_1 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1384:2: ( (this_GroupSync_0= ruleGroupSync | this_EventSync_1= ruleEventSync ) )
            // InternalXMachine.g:1385:2: (this_GroupSync_0= ruleGroupSync | this_EventSync_1= ruleEventSync )
            {
            // InternalXMachine.g:1385:2: (this_GroupSync_0= ruleGroupSync | this_EventSync_1= ruleEventSync )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==RULE_ID) ) {
                    alt40=1;
                }
                else if ( (LA40_1==30) ) {
                    alt40=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalXMachine.g:1386:3: this_GroupSync_0= ruleGroupSync
                    {

                    			newCompositeNode(grammarAccess.getXGroupOrEventAccess().getGroupSyncParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GroupSync_0=ruleGroupSync();

                    state._fsp--;


                    			current = this_GroupSync_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1395:3: this_EventSync_1= ruleEventSync
                    {

                    			newCompositeNode(grammarAccess.getXGroupOrEventAccess().getEventSyncParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EventSync_1=ruleEventSync();

                    state._fsp--;


                    			current = this_EventSync_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXGroupOrEvent"


    // $ANTLR start "entryRuleXParameter"
    // InternalXMachine.g:1407:1: entryRuleXParameter returns [EObject current=null] : iv_ruleXParameter= ruleXParameter EOF ;
    public final EObject entryRuleXParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameter = null;


        try {
            // InternalXMachine.g:1407:51: (iv_ruleXParameter= ruleXParameter EOF )
            // InternalXMachine.g:1408:2: iv_ruleXParameter= ruleXParameter EOF
            {
             newCompositeNode(grammarAccess.getXParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXParameter=ruleXParameter();

            state._fsp--;

             current =iv_ruleXParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParameter"


    // $ANTLR start "ruleXParameter"
    // InternalXMachine.g:1414:1: ruleXParameter returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1420:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:1421:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:1421:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:1422:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:1422:3: ()
            // InternalXMachine.g:1423:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1429:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:1430:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:1430:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:1431:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParameter"


    // $ANTLR start "entryRuleXGuard"
    // InternalXMachine.g:1451:1: entryRuleXGuard returns [EObject current=null] : iv_ruleXGuard= ruleXGuard EOF ;
    public final EObject entryRuleXGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuard = null;


        try {
            // InternalXMachine.g:1451:47: (iv_ruleXGuard= ruleXGuard EOF )
            // InternalXMachine.g:1452:2: iv_ruleXGuard= ruleXGuard EOF
            {
             newCompositeNode(grammarAccess.getXGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXGuard=ruleXGuard();

            state._fsp--;

             current =iv_ruleXGuard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXGuard"


    // $ANTLR start "ruleXGuard"
    // InternalXMachine.g:1458:1: ruleXGuard returns [EObject current=null] : ( () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleXGuard() throws RecognitionException {
        EObject current = null;

        Token lv_theorem_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1464:2: ( ( () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1465:2: ( () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1465:2: ( () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            // InternalXMachine.g:1466:3: () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1466:3: ()
            // InternalXMachine.g:1467:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGuardAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1473:3: ( (lv_theorem_1_0= 'theorem' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==24) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXMachine.g:1474:4: (lv_theorem_1_0= 'theorem' )
                    {
                    // InternalXMachine.g:1474:4: (lv_theorem_1_0= 'theorem' )
                    // InternalXMachine.g:1475:5: lv_theorem_1_0= 'theorem'
                    {
                    lv_theorem_1_0=(Token)match(input,24,FOLLOW_9); 

                    					newLeafNode(lv_theorem_1_0, grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXGuardRule());
                    					}
                    					setWithLastConsumed(current, "theorem", true, "theorem");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:1487:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:1488:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1488:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:1489:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_18); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGuardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:1505:3: ( (lv_predicate_3_0= ruleXFormula ) )
            // InternalXMachine.g:1506:4: (lv_predicate_3_0= ruleXFormula )
            {
            // InternalXMachine.g:1506:4: (lv_predicate_3_0= ruleXFormula )
            // InternalXMachine.g:1507:5: lv_predicate_3_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXGuardAccess().getPredicateXFormulaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_3_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXGuardRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_3_0,
            						"ac.soton.xeventb.xmachine.XMachine.XFormula");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXGuard"


    // $ANTLR start "entryRuleXWitness"
    // InternalXMachine.g:1528:1: entryRuleXWitness returns [EObject current=null] : iv_ruleXWitness= ruleXWitness EOF ;
    public final EObject entryRuleXWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitness = null;


        try {
            // InternalXMachine.g:1528:49: (iv_ruleXWitness= ruleXWitness EOF )
            // InternalXMachine.g:1529:2: iv_ruleXWitness= ruleXWitness EOF
            {
             newCompositeNode(grammarAccess.getXWitnessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXWitness=ruleXWitness();

            state._fsp--;

             current =iv_ruleXWitness; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWitness"


    // $ANTLR start "ruleXWitness"
    // InternalXMachine.g:1535:1: ruleXWitness returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXFormula ) ) ) ;
    public final EObject ruleXWitness() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1541:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1542:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1542:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXFormula ) ) )
            // InternalXMachine.g:1543:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1543:3: ()
            // InternalXMachine.g:1544:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXWitnessAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1550:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:1551:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1551:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:1552:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXWitnessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:1568:3: ( (lv_predicate_2_0= ruleXFormula ) )
            // InternalXMachine.g:1569:4: (lv_predicate_2_0= ruleXFormula )
            {
            // InternalXMachine.g:1569:4: (lv_predicate_2_0= ruleXFormula )
            // InternalXMachine.g:1570:5: lv_predicate_2_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXWitnessAccess().getPredicateXFormulaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_2_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXWitnessRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XFormula");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWitness"


    // $ANTLR start "entryRuleXAction"
    // InternalXMachine.g:1591:1: entryRuleXAction returns [EObject current=null] : iv_ruleXAction= ruleXAction EOF ;
    public final EObject entryRuleXAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAction = null;


        try {
            // InternalXMachine.g:1591:48: (iv_ruleXAction= ruleXAction EOF )
            // InternalXMachine.g:1592:2: iv_ruleXAction= ruleXAction EOF
            {
             newCompositeNode(grammarAccess.getXActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXAction=ruleXAction();

            state._fsp--;

             current =iv_ruleXAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAction"


    // $ANTLR start "ruleXAction"
    // InternalXMachine.g:1598:1: ruleXAction returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXFormula ) ) ) ;
    public final EObject ruleXAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_action_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1604:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1605:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1605:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXFormula ) ) )
            // InternalXMachine.g:1606:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1606:3: ()
            // InternalXMachine.g:1607:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1613:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:1614:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1614:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:1615:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:1631:3: ( (lv_action_2_0= ruleXFormula ) )
            // InternalXMachine.g:1632:4: (lv_action_2_0= ruleXFormula )
            {
            // InternalXMachine.g:1632:4: (lv_action_2_0= ruleXFormula )
            // InternalXMachine.g:1633:5: lv_action_2_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXActionAccess().getActionXFormulaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_2_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXActionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XFormula");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAction"


    // $ANTLR start "entryRuleXPar"
    // InternalXMachine.g:1654:1: entryRuleXPar returns [String current=null] : iv_ruleXPar= ruleXPar EOF ;
    public final String entryRuleXPar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXPar = null;


        try {
            // InternalXMachine.g:1654:44: (iv_ruleXPar= ruleXPar EOF )
            // InternalXMachine.g:1655:2: iv_ruleXPar= ruleXPar EOF
            {
             newCompositeNode(grammarAccess.getXParRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXPar=ruleXPar();

            state._fsp--;

             current =iv_ruleXPar.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPar"


    // $ANTLR start "ruleXPar"
    // InternalXMachine.g:1661:1: ruleXPar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleXPar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1667:2: (this_STRING_0= RULE_STRING )
            // InternalXMachine.g:1668:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getXParAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPar"


    // $ANTLR start "entryRuleXFormula"
    // InternalXMachine.g:1678:1: entryRuleXFormula returns [String current=null] : iv_ruleXFormula= ruleXFormula EOF ;
    public final String entryRuleXFormula() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXFormula = null;


        try {
            // InternalXMachine.g:1678:48: (iv_ruleXFormula= ruleXFormula EOF )
            // InternalXMachine.g:1679:2: iv_ruleXFormula= ruleXFormula EOF
            {
             newCompositeNode(grammarAccess.getXFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXFormula=ruleXFormula();

            state._fsp--;

             current =iv_ruleXFormula.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFormula"


    // $ANTLR start "ruleXFormula"
    // InternalXMachine.g:1685:1: ruleXFormula returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT )+ ;
    public final AntlrDatatypeRuleToken ruleXFormula() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_3=null;
        Token this_INT_4=null;
        AntlrDatatypeRuleToken this_EVENTB_IDENTIFIER_KEYWORD_0 = null;

        AntlrDatatypeRuleToken this_EVENTB_PREDICATE_SYMBOLS_1 = null;

        AntlrDatatypeRuleToken this_EVENTB_EXPRESSION_SYMBOLS_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1691:2: ( (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT )+ )
            // InternalXMachine.g:1692:2: (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT )+
            {
            // InternalXMachine.g:1692:2: (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT )+
            int cnt42=0;
            loop42:
            do {
                int alt42=6;
                switch ( input.LA(1) ) {
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
                    {
                    alt42=1;
                    }
                    break;
                case 23:
                case 26:
                case 27:
                case 28:
                case 62:
                case 63:
                case 64:
                case 65:
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
                    {
                    alt42=2;
                    }
                    break;
                case 37:
                case 38:
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
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                case 128:
                case 129:
                case 130:
                case 131:
                case 132:
                    {
                    alt42=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt42=4;
                    }
                    break;
                case RULE_INT:
                    {
                    alt42=5;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // InternalXMachine.g:1693:3: this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_38);
            	    this_EVENTB_IDENTIFIER_KEYWORD_0=ruleEVENTB_IDENTIFIER_KEYWORD();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_IDENTIFIER_KEYWORD_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalXMachine.g:1704:3: this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1());
            	    		
            	    pushFollow(FOLLOW_38);
            	    this_EVENTB_PREDICATE_SYMBOLS_1=ruleEVENTB_PREDICATE_SYMBOLS();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_PREDICATE_SYMBOLS_1);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalXMachine.g:1715:3: this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2());
            	    		
            	    pushFollow(FOLLOW_38);
            	    this_EVENTB_EXPRESSION_SYMBOLS_2=ruleEVENTB_EXPRESSION_SYMBOLS();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_EXPRESSION_SYMBOLS_2);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalXMachine.g:1726:3: this_ID_3= RULE_ID
            	    {
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    			current.merge(this_ID_3);
            	    		

            	    			newLeafNode(this_ID_3, grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalXMachine.g:1734:3: this_INT_4= RULE_INT
            	    {
            	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_38); 

            	    			current.merge(this_INT_4);
            	    		

            	    			newLeafNode(this_INT_4, grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFormula"


    // $ANTLR start "entryRuleEVENTB_IDENTIFIER_KEYWORD"
    // InternalXMachine.g:1745:1: entryRuleEVENTB_IDENTIFIER_KEYWORD returns [String current=null] : iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final String entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_IDENTIFIER_KEYWORD = null;


        try {
            // InternalXMachine.g:1745:65: (iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalXMachine.g:1746:2: iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF
            {
             newCompositeNode(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEVENTB_IDENTIFIER_KEYWORD=ruleEVENTB_IDENTIFIER_KEYWORD();

            state._fsp--;

             current =iv_ruleEVENTB_IDENTIFIER_KEYWORD.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEVENTB_IDENTIFIER_KEYWORD"


    // $ANTLR start "ruleEVENTB_IDENTIFIER_KEYWORD"
    // InternalXMachine.g:1752:1: ruleEVENTB_IDENTIFIER_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXMachine.g:1758:2: ( (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' ) )
            // InternalXMachine.g:1759:2: (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' )
            {
            // InternalXMachine.g:1759:2: (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' )
            int alt43=23;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt43=1;
                }
                break;
            case 40:
                {
                alt43=2;
                }
                break;
            case 41:
                {
                alt43=3;
                }
                break;
            case 42:
                {
                alt43=4;
                }
                break;
            case 43:
                {
                alt43=5;
                }
                break;
            case 44:
                {
                alt43=6;
                }
                break;
            case 45:
                {
                alt43=7;
                }
                break;
            case 46:
                {
                alt43=8;
                }
                break;
            case 47:
                {
                alt43=9;
                }
                break;
            case 48:
                {
                alt43=10;
                }
                break;
            case 49:
                {
                alt43=11;
                }
                break;
            case 50:
                {
                alt43=12;
                }
                break;
            case 51:
                {
                alt43=13;
                }
                break;
            case 52:
                {
                alt43=14;
                }
                break;
            case 53:
                {
                alt43=15;
                }
                break;
            case 54:
                {
                alt43=16;
                }
                break;
            case 55:
                {
                alt43=17;
                }
                break;
            case 56:
                {
                alt43=18;
                }
                break;
            case 57:
                {
                alt43=19;
                }
                break;
            case 58:
                {
                alt43=20;
                }
                break;
            case 59:
                {
                alt43=21;
                }
                break;
            case 60:
                {
                alt43=22;
                }
                break;
            case 61:
                {
                alt43=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalXMachine.g:1760:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1766:3: kw= 'FALSE'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1772:3: kw= 'TRUE'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1778:3: kw= 'bool'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1784:3: kw= 'card'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1790:3: kw= 'dom'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1796:3: kw= 'finite'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1802:3: kw= 'id'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXMachine.g:1808:3: kw= 'inter'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXMachine.g:1814:3: kw= 'max'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXMachine.g:1820:3: kw= 'min'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXMachine.g:1826:3: kw= 'mod'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXMachine.g:1832:3: kw= 'pred'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXMachine.g:1838:3: kw= 'prj1'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXMachine.g:1844:3: kw= 'prj2'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXMachine.g:1850:3: kw= 'ran'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXMachine.g:1856:3: kw= 'succ'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXMachine.g:1862:3: kw= 'union'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1868:3: kw= '\\u21151'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1874:3: kw= '\\u2115'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1880:3: kw= '\\u21191'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1886:3: kw= '\\u2119'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1892:3: kw= '\\u2124'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_22());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEVENTB_IDENTIFIER_KEYWORD"


    // $ANTLR start "entryRuleEVENTB_PREDICATE_SYMBOLS"
    // InternalXMachine.g:1901:1: entryRuleEVENTB_PREDICATE_SYMBOLS returns [String current=null] : iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final String entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_PREDICATE_SYMBOLS = null;


        try {
            // InternalXMachine.g:1901:64: (iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalXMachine.g:1902:2: iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF
            {
             newCompositeNode(grammarAccess.getEVENTB_PREDICATE_SYMBOLSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEVENTB_PREDICATE_SYMBOLS=ruleEVENTB_PREDICATE_SYMBOLS();

            state._fsp--;

             current =iv_ruleEVENTB_PREDICATE_SYMBOLS.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEVENTB_PREDICATE_SYMBOLS"


    // $ANTLR start "ruleEVENTB_PREDICATE_SYMBOLS"
    // InternalXMachine.g:1908:1: ruleEVENTB_PREDICATE_SYMBOLS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXMachine.g:1914:2: ( (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' ) )
            // InternalXMachine.g:1915:2: (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' )
            {
            // InternalXMachine.g:1915:2: (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' )
            int alt44=31;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt44=1;
                }
                break;
            case 28:
                {
                alt44=2;
                }
                break;
            case 62:
                {
                alt44=3;
                }
                break;
            case 63:
                {
                alt44=4;
                }
                break;
            case 64:
                {
                alt44=5;
                }
                break;
            case 65:
                {
                alt44=6;
                }
                break;
            case 66:
                {
                alt44=7;
                }
                break;
            case 67:
                {
                alt44=8;
                }
                break;
            case 68:
                {
                alt44=9;
                }
                break;
            case 69:
                {
                alt44=10;
                }
                break;
            case 70:
                {
                alt44=11;
                }
                break;
            case 71:
                {
                alt44=12;
                }
                break;
            case 72:
                {
                alt44=13;
                }
                break;
            case 73:
                {
                alt44=14;
                }
                break;
            case 27:
                {
                alt44=15;
                }
                break;
            case 74:
                {
                alt44=16;
                }
                break;
            case 23:
                {
                alt44=17;
                }
                break;
            case 75:
                {
                alt44=18;
                }
                break;
            case 76:
                {
                alt44=19;
                }
                break;
            case 77:
                {
                alt44=20;
                }
                break;
            case 78:
                {
                alt44=21;
                }
                break;
            case 79:
                {
                alt44=22;
                }
                break;
            case 80:
                {
                alt44=23;
                }
                break;
            case 81:
                {
                alt44=24;
                }
                break;
            case 82:
                {
                alt44=25;
                }
                break;
            case 83:
                {
                alt44=26;
                }
                break;
            case 84:
                {
                alt44=27;
                }
                break;
            case 85:
                {
                alt44=28;
                }
                break;
            case 86:
                {
                alt44=29;
                }
                break;
            case 87:
                {
                alt44=30;
                }
                break;
            case 88:
                {
                alt44=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalXMachine.g:1916:3: kw= '('
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1922:3: kw= ')'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1928:3: kw= '\\u21D4'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1934:3: kw= '\\u21D2'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1940:3: kw= '\\u2227'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1946:3: kw= '&'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1952:3: kw= '\\u2228'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1958:3: kw= '\\u00AC'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXMachine.g:1964:3: kw= '\\u22A4'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXMachine.g:1970:3: kw= '\\u22A5'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXMachine.g:1976:3: kw= '\\u2200'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXMachine.g:1982:3: kw= '!'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXMachine.g:1988:3: kw= '\\u2203'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXMachine.g:1994:3: kw= '#'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXMachine.g:2000:3: kw= ','
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXMachine.g:2006:3: kw= '\\u00B7'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXMachine.g:2012:3: kw= '.'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXMachine.g:2018:3: kw= '='
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXMachine.g:2024:3: kw= '\\u2260'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXMachine.g:2030:3: kw= '\\u2264'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXMachine.g:2036:3: kw= '<'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXMachine.g:2042:3: kw= '\\u2265'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXMachine.g:2048:3: kw= '>'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalXMachine.g:2054:3: kw= '\\u2208'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalXMachine.g:2060:3: kw= ':'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalXMachine.g:2066:3: kw= '\\u2209'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalXMachine.g:2072:3: kw= '\\u2282'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalXMachine.g:2078:3: kw= '\\u2284'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalXMachine.g:2084:3: kw= '\\u2286'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalXMachine.g:2090:3: kw= '\\u2288'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalXMachine.g:2096:3: kw= 'partition'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_30());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEVENTB_PREDICATE_SYMBOLS"


    // $ANTLR start "entryRuleEVENTB_EXPRESSION_SYMBOLS"
    // InternalXMachine.g:2105:1: entryRuleEVENTB_EXPRESSION_SYMBOLS returns [String current=null] : iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final String entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_EXPRESSION_SYMBOLS = null;


        try {
            // InternalXMachine.g:2105:65: (iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalXMachine.g:2106:2: iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF
            {
             newCompositeNode(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEVENTB_EXPRESSION_SYMBOLS=ruleEVENTB_EXPRESSION_SYMBOLS();

            state._fsp--;

             current =iv_ruleEVENTB_EXPRESSION_SYMBOLS.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEVENTB_EXPRESSION_SYMBOLS"


    // $ANTLR start "ruleEVENTB_EXPRESSION_SYMBOLS"
    // InternalXMachine.g:2112:1: ruleEVENTB_EXPRESSION_SYMBOLS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXMachine.g:2118:2: ( (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' ) )
            // InternalXMachine.g:2119:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' )
            {
            // InternalXMachine.g:2119:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' )
            int alt45=45;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt45=1;
                }
                break;
            case 90:
                {
                alt45=2;
                }
                break;
            case 91:
                {
                alt45=3;
                }
                break;
            case 92:
                {
                alt45=4;
                }
                break;
            case 93:
                {
                alt45=5;
                }
                break;
            case 94:
                {
                alt45=6;
                }
                break;
            case 95:
                {
                alt45=7;
                }
                break;
            case 96:
                {
                alt45=8;
                }
                break;
            case 97:
                {
                alt45=9;
                }
                break;
            case 98:
                {
                alt45=10;
                }
                break;
            case 99:
                {
                alt45=11;
                }
                break;
            case 100:
                {
                alt45=12;
                }
                break;
            case 101:
                {
                alt45=13;
                }
                break;
            case 102:
                {
                alt45=14;
                }
                break;
            case 103:
                {
                alt45=15;
                }
                break;
            case 104:
                {
                alt45=16;
                }
                break;
            case 105:
                {
                alt45=17;
                }
                break;
            case 106:
                {
                alt45=18;
                }
                break;
            case 107:
                {
                alt45=19;
                }
                break;
            case 37:
                {
                alt45=20;
                }
                break;
            case 38:
                {
                alt45=21;
                }
                break;
            case 108:
                {
                alt45=22;
                }
                break;
            case 109:
                {
                alt45=23;
                }
                break;
            case 110:
                {
                alt45=24;
                }
                break;
            case 111:
                {
                alt45=25;
                }
                break;
            case 112:
                {
                alt45=26;
                }
                break;
            case 113:
                {
                alt45=27;
                }
                break;
            case 114:
                {
                alt45=28;
                }
                break;
            case 115:
                {
                alt45=29;
                }
                break;
            case 116:
                {
                alt45=30;
                }
                break;
            case 117:
                {
                alt45=31;
                }
                break;
            case 118:
                {
                alt45=32;
                }
                break;
            case 119:
                {
                alt45=33;
                }
                break;
            case 121:
                {
                alt45=34;
                }
                break;
            case 122:
                {
                alt45=35;
                }
                break;
            case 123:
                {
                alt45=36;
                }
                break;
            case 124:
                {
                alt45=37;
                }
                break;
            case 125:
                {
                alt45=38;
                }
                break;
            case 126:
                {
                alt45=39;
                }
                break;
            case 127:
                {
                alt45=40;
                }
                break;
            case 128:
                {
                alt45=41;
                }
                break;
            case 129:
                {
                alt45=42;
                }
                break;
            case 130:
                {
                alt45=43;
                }
                break;
            case 131:
                {
                alt45=44;
                }
                break;
            case 132:
                {
                alt45=45;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:2120:3: kw= '\\u2194'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2126:3: kw= '\\uE100'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2132:3: kw= '\\uE101'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXMachine.g:2138:3: kw= '\\uE102'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXMachine.g:2144:3: kw= '\\u21F8'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXMachine.g:2150:3: kw= '\\u2192'
                    {
                    kw=(Token)match(input,94,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXMachine.g:2156:3: kw= '\\u2914'
                    {
                    kw=(Token)match(input,95,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXMachine.g:2162:3: kw= '\\u21A3'
                    {
                    kw=(Token)match(input,96,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXMachine.g:2168:3: kw= '\\u2900'
                    {
                    kw=(Token)match(input,97,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXMachine.g:2174:3: kw= '\\u21A0'
                    {
                    kw=(Token)match(input,98,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXMachine.g:2180:3: kw= '\\u2916'
                    {
                    kw=(Token)match(input,99,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXMachine.g:2186:3: kw= '{'
                    {
                    kw=(Token)match(input,100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXMachine.g:2192:3: kw= '}'
                    {
                    kw=(Token)match(input,101,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXMachine.g:2198:3: kw= '\\u21A6'
                    {
                    kw=(Token)match(input,102,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXMachine.g:2204:3: kw= '\\u2205'
                    {
                    kw=(Token)match(input,103,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXMachine.g:2210:3: kw= '\\u2229'
                    {
                    kw=(Token)match(input,104,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXMachine.g:2216:3: kw= '\\u222A'
                    {
                    kw=(Token)match(input,105,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXMachine.g:2222:3: kw= '\\u2216'
                    {
                    kw=(Token)match(input,106,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXMachine.g:2228:3: kw= '\\u00D7'
                    {
                    kw=(Token)match(input,107,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXMachine.g:2234:3: kw= '['
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXMachine.g:2240:3: kw= ']'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXMachine.g:2246:3: kw= '\\uE103'
                    {
                    kw=(Token)match(input,108,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXMachine.g:2252:3: kw= '\\u2218'
                    {
                    kw=(Token)match(input,109,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalXMachine.g:2258:3: kw= ';'
                    {
                    kw=(Token)match(input,110,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalXMachine.g:2264:3: kw= '\\u2297'
                    {
                    kw=(Token)match(input,111,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalXMachine.g:2270:3: kw= '\\u2225'
                    {
                    kw=(Token)match(input,112,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalXMachine.g:2276:3: kw= '\\u223C'
                    {
                    kw=(Token)match(input,113,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalXMachine.g:2282:3: kw= '\\u25C1'
                    {
                    kw=(Token)match(input,114,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalXMachine.g:2288:3: kw= '\\u2A64'
                    {
                    kw=(Token)match(input,115,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalXMachine.g:2294:3: kw= '\\u25B7'
                    {
                    kw=(Token)match(input,116,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalXMachine.g:2300:3: kw= '\\u2A65'
                    {
                    kw=(Token)match(input,117,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalXMachine.g:2306:3: kw= '\\u03BB'
                    {
                    kw=(Token)match(input,118,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalXMachine.g:2312:3: (kw= '%' kw= '\\u22C2' )
                    {
                    // InternalXMachine.g:2312:3: (kw= '%' kw= '\\u22C2' )
                    // InternalXMachine.g:2313:4: kw= '%' kw= '\\u22C2'
                    {
                    kw=(Token)match(input,119,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0());
                    			
                    kw=(Token)match(input,120,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1());
                    			

                    }


                    }
                    break;
                case 34 :
                    // InternalXMachine.g:2325:3: kw= '\\u22C3'
                    {
                    kw=(Token)match(input,121,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalXMachine.g:2331:3: kw= '\\u2223'
                    {
                    kw=(Token)match(input,122,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalXMachine.g:2337:3: kw= '\\u2025'
                    {
                    kw=(Token)match(input,123,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalXMachine.g:2343:3: kw= '+'
                    {
                    kw=(Token)match(input,124,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalXMachine.g:2349:3: kw= '\\u2212'
                    {
                    kw=(Token)match(input,125,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalXMachine.g:2355:3: kw= '-'
                    {
                    kw=(Token)match(input,126,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalXMachine.g:2361:3: kw= '\\u2217'
                    {
                    kw=(Token)match(input,127,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalXMachine.g:2367:3: kw= '*'
                    {
                    kw=(Token)match(input,128,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalXMachine.g:2373:3: kw= '\\u00F7'
                    {
                    kw=(Token)match(input,129,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalXMachine.g:2379:3: kw= '/'
                    {
                    kw=(Token)match(input,130,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalXMachine.g:2385:3: kw= '^'
                    {
                    kw=(Token)match(input,131,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalXMachine.g:2391:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,132,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_44());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEVENTB_EXPRESSION_SYMBOLS"


    // $ANTLR start "ruleXDirection"
    // InternalXMachine.g:2400:1: ruleXDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleXDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXMachine.g:2406:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // InternalXMachine.g:2407:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // InternalXMachine.g:2407:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==133) ) {
                alt46=1;
            }
            else if ( (LA46_0==134) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:2408:3: (enumLiteral_0= 'in' )
                    {
                    // InternalXMachine.g:2408:3: (enumLiteral_0= 'in' )
                    // InternalXMachine.g:2409:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,133,FOLLOW_2); 

                    				current = grammarAccess.getXDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getXDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2416:3: (enumLiteral_1= 'out' )
                    {
                    // InternalXMachine.g:2416:3: (enumLiteral_1= 'out' )
                    // InternalXMachine.g:2417:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,134,FOLLOW_2); 

                    				current = grammarAccess.getXDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getXDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDirection"


    // $ANTLR start "ruleXConvergence"
    // InternalXMachine.g:2427:1: ruleXConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleXConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:2433:2: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // InternalXMachine.g:2434:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // InternalXMachine.g:2434:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 135:
                {
                alt47=1;
                }
                break;
            case 136:
                {
                alt47=2;
                }
                break;
            case 137:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalXMachine.g:2435:3: (enumLiteral_0= 'ordinary' )
                    {
                    // InternalXMachine.g:2435:3: (enumLiteral_0= 'ordinary' )
                    // InternalXMachine.g:2436:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,135,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2443:3: (enumLiteral_1= 'convergent' )
                    {
                    // InternalXMachine.g:2443:3: (enumLiteral_1= 'convergent' )
                    // InternalXMachine.g:2444:4: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,136,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2451:3: (enumLiteral_2= 'anticipated' )
                    {
                    // InternalXMachine.g:2451:3: (enumLiteral_2= 'anticipated' )
                    // InternalXMachine.g:2452:4: enumLiteral_2= 'anticipated'
                    {
                    enumLiteral_2=(Token)match(input,137,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConvergence"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000021FE000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000021FE010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000020F0010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000030E0020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000020C0020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000042080000L,0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xFFFFFFE01C800090L,0xFEFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000024080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001F80082000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001F00080010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001F00080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001E00080010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001E00080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000C01080020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800080020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xFFFFFFE01C800092L,0xFEFFFFFFFFFFFFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});

}
