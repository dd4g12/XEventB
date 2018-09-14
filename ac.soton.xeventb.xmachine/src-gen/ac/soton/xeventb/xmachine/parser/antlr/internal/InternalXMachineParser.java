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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_XLABEL", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variant'", "'events'", "'end'", "'includes'", "'to'", "'as'", "'.'", "'theorem'", "'group'", "'('", "','", "')'", "'begin'", "'event'", "'extended'", "'with'", "'when'", "'then'", "'any'", "'where'", "'synchronises'", "'synchronisesGroup'", "'in'", "'out'", "'ordinary'", "'convergent'", "'anticipated'"
    };
    public static final int T__19=19;
    public static final int RULE_XLABEL=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
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
    // InternalXMachine.g:72:1: ruleMachine returns [EObject current=null] : ( () otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'refines' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'sees' ( (otherlv_6= RULE_ID ) )+ )? ( (lv_extensions_7_0= ruleMIncludes ) )* (otherlv_8= 'variables' ( (lv_variables_9_0= ruleXVariable ) )+ )? (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleXInvariant ) )+ )? (otherlv_12= 'variant' ( (lv_variant_13_0= ruleXVariant ) ) )? (otherlv_14= 'events' ( (lv_events_15_0= ruleXEvent ) ) ( (lv_events_16_0= ruleXEvent ) )* )? ( (lv_extensions_17_0= ruleXGroup ) )* otherlv_18= 'end' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_18=null;
        EObject lv_extensions_7_0 = null;

        EObject lv_variables_9_0 = null;

        EObject lv_invariants_11_0 = null;

        EObject lv_variant_13_0 = null;

        EObject lv_events_15_0 = null;

        EObject lv_events_16_0 = null;

        EObject lv_extensions_17_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:78:2: ( ( () otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'refines' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'sees' ( (otherlv_6= RULE_ID ) )+ )? ( (lv_extensions_7_0= ruleMIncludes ) )* (otherlv_8= 'variables' ( (lv_variables_9_0= ruleXVariable ) )+ )? (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleXInvariant ) )+ )? (otherlv_12= 'variant' ( (lv_variant_13_0= ruleXVariant ) ) )? (otherlv_14= 'events' ( (lv_events_15_0= ruleXEvent ) ) ( (lv_events_16_0= ruleXEvent ) )* )? ( (lv_extensions_17_0= ruleXGroup ) )* otherlv_18= 'end' ) )
            // InternalXMachine.g:79:2: ( () otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'refines' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'sees' ( (otherlv_6= RULE_ID ) )+ )? ( (lv_extensions_7_0= ruleMIncludes ) )* (otherlv_8= 'variables' ( (lv_variables_9_0= ruleXVariable ) )+ )? (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleXInvariant ) )+ )? (otherlv_12= 'variant' ( (lv_variant_13_0= ruleXVariant ) ) )? (otherlv_14= 'events' ( (lv_events_15_0= ruleXEvent ) ) ( (lv_events_16_0= ruleXEvent ) )* )? ( (lv_extensions_17_0= ruleXGroup ) )* otherlv_18= 'end' )
            {
            // InternalXMachine.g:79:2: ( () otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'refines' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'sees' ( (otherlv_6= RULE_ID ) )+ )? ( (lv_extensions_7_0= ruleMIncludes ) )* (otherlv_8= 'variables' ( (lv_variables_9_0= ruleXVariable ) )+ )? (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleXInvariant ) )+ )? (otherlv_12= 'variant' ( (lv_variant_13_0= ruleXVariant ) ) )? (otherlv_14= 'events' ( (lv_events_15_0= ruleXEvent ) ) ( (lv_events_16_0= ruleXEvent ) )* )? ( (lv_extensions_17_0= ruleXGroup ) )* otherlv_18= 'end' )
            // InternalXMachine.g:80:3: () otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'refines' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'sees' ( (otherlv_6= RULE_ID ) )+ )? ( (lv_extensions_7_0= ruleMIncludes ) )* (otherlv_8= 'variables' ( (lv_variables_9_0= ruleXVariable ) )+ )? (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleXInvariant ) )+ )? (otherlv_12= 'variant' ( (lv_variant_13_0= ruleXVariant ) ) )? (otherlv_14= 'events' ( (lv_events_15_0= ruleXEvent ) ) ( (lv_events_16_0= ruleXEvent ) )* )? ( (lv_extensions_17_0= ruleXGroup ) )* otherlv_18= 'end'
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

            // InternalXMachine.g:109:3: (otherlv_3= 'refines' ( (otherlv_4= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXMachine.g:110:4: otherlv_3= 'refines' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMachineAccess().getRefinesKeyword_3_0());
                    			
                    // InternalXMachine.g:114:4: ( (otherlv_4= RULE_ID ) )
                    // InternalXMachine.g:115:5: (otherlv_4= RULE_ID )
                    {
                    // InternalXMachine.g:115:5: (otherlv_4= RULE_ID )
                    // InternalXMachine.g:116:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMachineRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_4, grammarAccess.getMachineAccess().getRefinesMachineCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:128:3: (otherlv_5= 'sees' ( (otherlv_6= RULE_ID ) )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXMachine.g:129:4: otherlv_5= 'sees' ( (otherlv_6= RULE_ID ) )+
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getSeesKeyword_4_0());
                    			
                    // InternalXMachine.g:133:4: ( (otherlv_6= RULE_ID ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalXMachine.g:134:5: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:134:5: (otherlv_6= RULE_ID )
                    	    // InternalXMachine.g:135:6: otherlv_6= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getMachineRule());
                    	    						}
                    	    					
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_6); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getMachineAccess().getSeesContextCrossReference_4_1_0());
                    	    					

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


                    }
                    break;

            }

            // InternalXMachine.g:147:3: ( (lv_extensions_7_0= ruleMIncludes ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXMachine.g:148:4: (lv_extensions_7_0= ruleMIncludes )
            	    {
            	    // InternalXMachine.g:148:4: (lv_extensions_7_0= ruleMIncludes )
            	    // InternalXMachine.g:149:5: lv_extensions_7_0= ruleMIncludes
            	    {

            	    					newCompositeNode(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_extensions_7_0=ruleMIncludes();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_7_0,
            	    						"ac.soton.xeventb.xmachine.XMachine.MIncludes");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalXMachine.g:166:3: (otherlv_8= 'variables' ( (lv_variables_9_0= ruleXVariable ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:167:4: otherlv_8= 'variables' ( (lv_variables_9_0= ruleXVariable ) )+
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getMachineAccess().getVariablesKeyword_6_0());
                    			
                    // InternalXMachine.g:171:4: ( (lv_variables_9_0= ruleXVariable ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalXMachine.g:172:5: (lv_variables_9_0= ruleXVariable )
                    	    {
                    	    // InternalXMachine.g:172:5: (lv_variables_9_0= ruleXVariable )
                    	    // InternalXMachine.g:173:6: lv_variables_9_0= ruleXVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_variables_9_0=ruleXVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_9_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XVariable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:191:3: (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleXInvariant ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:192:4: otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleXInvariant ) )+
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getMachineAccess().getInvariantsKeyword_7_0());
                    			
                    // InternalXMachine.g:196:4: ( (lv_invariants_11_0= ruleXInvariant ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_XLABEL) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalXMachine.g:197:5: (lv_invariants_11_0= ruleXInvariant )
                    	    {
                    	    // InternalXMachine.g:197:5: (lv_invariants_11_0= ruleXInvariant )
                    	    // InternalXMachine.g:198:6: lv_invariants_11_0= ruleXInvariant
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_invariants_11_0=ruleXInvariant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"invariants",
                    	    							lv_invariants_11_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XInvariant");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:216:3: (otherlv_12= 'variant' ( (lv_variant_13_0= ruleXVariant ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXMachine.g:217:4: otherlv_12= 'variant' ( (lv_variant_13_0= ruleXVariant ) )
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getMachineAccess().getVariantKeyword_8_0());
                    			
                    // InternalXMachine.g:221:4: ( (lv_variant_13_0= ruleXVariant ) )
                    // InternalXMachine.g:222:5: (lv_variant_13_0= ruleXVariant )
                    {
                    // InternalXMachine.g:222:5: (lv_variant_13_0= ruleXVariant )
                    // InternalXMachine.g:223:6: lv_variant_13_0= ruleXVariant
                    {

                    						newCompositeNode(grammarAccess.getMachineAccess().getVariantXVariantParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_variant_13_0=ruleXVariant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    						}
                    						set(
                    							current,
                    							"variant",
                    							lv_variant_13_0,
                    							"ac.soton.xeventb.xmachine.XMachine.XVariant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:241:3: (otherlv_14= 'events' ( (lv_events_15_0= ruleXEvent ) ) ( (lv_events_16_0= ruleXEvent ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:242:4: otherlv_14= 'events' ( (lv_events_15_0= ruleXEvent ) ) ( (lv_events_16_0= ruleXEvent ) )*
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getMachineAccess().getEventsKeyword_9_0());
                    			
                    // InternalXMachine.g:246:4: ( (lv_events_15_0= ruleXEvent ) )
                    // InternalXMachine.g:247:5: (lv_events_15_0= ruleXEvent )
                    {
                    // InternalXMachine.g:247:5: (lv_events_15_0= ruleXEvent )
                    // InternalXMachine.g:248:6: lv_events_15_0= ruleXEvent
                    {

                    						newCompositeNode(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_events_15_0=ruleXEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    						}
                    						add(
                    							current,
                    							"events",
                    							lv_events_15_0,
                    							"ac.soton.xeventb.xmachine.XMachine.XEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXMachine.g:265:4: ( (lv_events_16_0= ruleXEvent ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==30) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalXMachine.g:266:5: (lv_events_16_0= ruleXEvent )
                    	    {
                    	    // InternalXMachine.g:266:5: (lv_events_16_0= ruleXEvent )
                    	    // InternalXMachine.g:267:6: lv_events_16_0= ruleXEvent
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_9_2_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
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
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:285:3: ( (lv_extensions_17_0= ruleXGroup ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXMachine.g:286:4: (lv_extensions_17_0= ruleXGroup )
            	    {
            	    // InternalXMachine.g:286:4: (lv_extensions_17_0= ruleXGroup )
            	    // InternalXMachine.g:287:5: lv_extensions_17_0= ruleXGroup
            	    {

            	    					newCompositeNode(grammarAccess.getMachineAccess().getExtensionsXGroupParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_extensions_17_0=ruleXGroup();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_17_0,
            	    						"ac.soton.xeventb.xmachine.XMachine.XGroup");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_18=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getMachineAccess().getEndKeyword_11());
            		

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
    // InternalXMachine.g:312:1: entryRuleMIncludes returns [EObject current=null] : iv_ruleMIncludes= ruleMIncludes EOF ;
    public final EObject entryRuleMIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMIncludes = null;


        try {
            // InternalXMachine.g:312:50: (iv_ruleMIncludes= ruleMIncludes EOF )
            // InternalXMachine.g:313:2: iv_ruleMIncludes= ruleMIncludes EOF
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
    // InternalXMachine.g:319:1: ruleMIncludes returns [EObject current=null] : ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) ;
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
            // InternalXMachine.g:325:2: ( ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) )
            // InternalXMachine.g:326:2: ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            {
            // InternalXMachine.g:326:2: ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            // InternalXMachine.g:327:3: () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            {
            // InternalXMachine.g:327:3: ()
            // InternalXMachine.g:328:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMIncludesAccess().getMachineInclusionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:334:3: (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:335:4: otherlv_1= 'includes' ( ( ruleQualifiedName ) )
            {
            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            				newLeafNode(otherlv_1, grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0());
            			
            // InternalXMachine.g:339:4: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:340:5: ( ruleQualifiedName )
            {
            // InternalXMachine.g:340:5: ( ruleQualifiedName )
            // InternalXMachine.g:341:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getMIncludesRule());
            						}
            					

            						newCompositeNode(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0());
            					
            pushFollow(FOLLOW_16);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalXMachine.g:356:3: (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:357:4: otherlv_3= 'to' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMIncludesAccess().getToKeyword_2_0());
                    			
                    // InternalXMachine.g:361:4: ( (otherlv_4= RULE_ID ) )
                    // InternalXMachine.g:362:5: (otherlv_4= RULE_ID )
                    {
                    // InternalXMachine.g:362:5: (otherlv_4= RULE_ID )
                    // InternalXMachine.g:363:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMIncludesRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_4, grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:375:3: (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXMachine.g:376:4: otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )*
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMIncludesAccess().getAsKeyword_3_0());
                    			
                    // InternalXMachine.g:380:4: ( (lv_prefixes_6_0= RULE_ID ) )
                    // InternalXMachine.g:381:5: (lv_prefixes_6_0= RULE_ID )
                    {
                    // InternalXMachine.g:381:5: (lv_prefixes_6_0= RULE_ID )
                    // InternalXMachine.g:382:6: lv_prefixes_6_0= RULE_ID
                    {
                    lv_prefixes_6_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

                    // InternalXMachine.g:398:4: ( (lv_prefixes_7_0= RULE_ID ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalXMachine.g:399:5: (lv_prefixes_7_0= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:399:5: (lv_prefixes_7_0= RULE_ID )
                    	    // InternalXMachine.g:400:6: lv_prefixes_7_0= RULE_ID
                    	    {
                    	    lv_prefixes_7_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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
    // InternalXMachine.g:421:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXMachine.g:421:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXMachine.g:422:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalXMachine.g:428:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:434:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalXMachine.g:435:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalXMachine.g:435:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // InternalXMachine.g:436:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXMachine.g:443:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXMachine.g:444:4: kw= '.' this_ID_2= RULE_ID
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
    // InternalXMachine.g:461:1: entryRuleXVariable returns [EObject current=null] : iv_ruleXVariable= ruleXVariable EOF ;
    public final EObject entryRuleXVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariable = null;


        try {
            // InternalXMachine.g:461:50: (iv_ruleXVariable= ruleXVariable EOF )
            // InternalXMachine.g:462:2: iv_ruleXVariable= ruleXVariable EOF
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
    // InternalXMachine.g:468:1: ruleXVariable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:474:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:475:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:475:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:476:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:476:3: ()
            // InternalXMachine.g:477:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:483:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:484:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:484:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:485:5: lv_name_1_0= RULE_ID
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
    // InternalXMachine.g:505:1: entryRuleXInvariant returns [EObject current=null] : iv_ruleXInvariant= ruleXInvariant EOF ;
    public final EObject entryRuleXInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariant = null;


        try {
            // InternalXMachine.g:505:51: (iv_ruleXInvariant= ruleXInvariant EOF )
            // InternalXMachine.g:506:2: iv_ruleXInvariant= ruleXInvariant EOF
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
    // InternalXMachine.g:512:1: ruleXInvariant returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleXInvariant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_theorem_3_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:518:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalXMachine.g:519:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:519:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalXMachine.g:520:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalXMachine.g:520:3: ()
            // InternalXMachine.g:521:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXInvariantAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:527:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:528:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:528:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:529:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXInvariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:545:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalXMachine.g:546:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:546:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalXMachine.g:547:5: lv_predicate_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXInvariantAccess().getPredicateXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_predicate_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXInvariantRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMachine.g:564:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:565:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:565:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:566:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_theorem_3_0, grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXInvariantRule());
                    					}
                    					setWithLastConsumed(current, "theorem", true, "theorem");
                    				

                    }


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
    // $ANTLR end "ruleXInvariant"


    // $ANTLR start "entryRuleXVariant"
    // InternalXMachine.g:582:1: entryRuleXVariant returns [EObject current=null] : iv_ruleXVariant= ruleXVariant EOF ;
    public final EObject entryRuleXVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariant = null;


        try {
            // InternalXMachine.g:582:49: (iv_ruleXVariant= ruleXVariant EOF )
            // InternalXMachine.g:583:2: iv_ruleXVariant= ruleXVariant EOF
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
    // InternalXMachine.g:589:1: ruleXVariant returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleXPredicate ) ) ) ;
    public final EObject ruleXVariant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:595:2: ( ( () ( (lv_expression_1_0= ruleXPredicate ) ) ) )
            // InternalXMachine.g:596:2: ( () ( (lv_expression_1_0= ruleXPredicate ) ) )
            {
            // InternalXMachine.g:596:2: ( () ( (lv_expression_1_0= ruleXPredicate ) ) )
            // InternalXMachine.g:597:3: () ( (lv_expression_1_0= ruleXPredicate ) )
            {
            // InternalXMachine.g:597:3: ()
            // InternalXMachine.g:598:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariantAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:604:3: ( (lv_expression_1_0= ruleXPredicate ) )
            // InternalXMachine.g:605:4: (lv_expression_1_0= ruleXPredicate )
            {
            // InternalXMachine.g:605:4: (lv_expression_1_0= ruleXPredicate )
            // InternalXMachine.g:606:5: lv_expression_1_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXVariantAccess().getExpressionXPredicateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXVariantRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
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
    // InternalXMachine.g:627:1: entryRuleXGroup returns [EObject current=null] : iv_ruleXGroup= ruleXGroup EOF ;
    public final EObject entryRuleXGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGroup = null;


        try {
            // InternalXMachine.g:627:47: (iv_ruleXGroup= ruleXGroup EOF )
            // InternalXMachine.g:628:2: iv_ruleXGroup= ruleXGroup EOF
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
    // InternalXMachine.g:634:1: ruleXGroup returns [EObject current=null] : ( () otherlv_1= 'group' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )? otherlv_8= 'begin' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= 'end' ) ;
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
        Token otherlv_12=null;
        EObject lv_formalParameters_4_0 = null;

        EObject lv_formalParameters_6_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:640:2: ( ( () otherlv_1= 'group' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )? otherlv_8= 'begin' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= 'end' ) )
            // InternalXMachine.g:641:2: ( () otherlv_1= 'group' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )? otherlv_8= 'begin' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= 'end' )
            {
            // InternalXMachine.g:641:2: ( () otherlv_1= 'group' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )? otherlv_8= 'begin' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= 'end' )
            // InternalXMachine.g:642:3: () otherlv_1= 'group' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )? otherlv_8= 'begin' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= 'end'
            {
            // InternalXMachine.g:642:3: ()
            // InternalXMachine.g:643:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGroupAccess().getEventCasesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getXGroupAccess().getGroupKeyword_1());
            		
            // InternalXMachine.g:653:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:654:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:654:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:655:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            // InternalXMachine.g:671:3: (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXMachine.g:672:4: otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getXGroupAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalXMachine.g:676:4: ( (lv_formalParameters_4_0= ruleXFormalParameter ) )
                    // InternalXMachine.g:677:5: (lv_formalParameters_4_0= ruleXFormalParameter )
                    {
                    // InternalXMachine.g:677:5: (lv_formalParameters_4_0= ruleXFormalParameter )
                    // InternalXMachine.g:678:6: lv_formalParameters_4_0= ruleXFormalParameter
                    {

                    						newCompositeNode(grammarAccess.getXGroupAccess().getFormalParametersXFormalParameterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    // InternalXMachine.g:695:4: (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==27) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalXMachine.g:696:5: otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_22); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getXGroupAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalXMachine.g:700:5: ( (lv_formalParameters_6_0= ruleXFormalParameter ) )
                    	    // InternalXMachine.g:701:6: (lv_formalParameters_6_0= ruleXFormalParameter )
                    	    {
                    	    // InternalXMachine.g:701:6: (lv_formalParameters_6_0= ruleXFormalParameter )
                    	    // InternalXMachine.g:702:7: lv_formalParameters_6_0= ruleXFormalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getXGroupAccess().getFormalParametersXFormalParameterParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
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

                    otherlv_7=(Token)match(input,28,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getXGroupAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,29,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getXGroupAccess().getBeginKeyword_4());
            		
            // InternalXMachine.g:729:3: ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXMachine.g:730:4: ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    {
                    // InternalXMachine.g:730:4: ( (otherlv_9= RULE_ID ) )
                    // InternalXMachine.g:731:5: (otherlv_9= RULE_ID )
                    {
                    // InternalXMachine.g:731:5: (otherlv_9= RULE_ID )
                    // InternalXMachine.g:732:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXGroupRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_9, grammarAccess.getXGroupAccess().getEventsEventCrossReference_5_0_0());
                    					

                    }


                    }

                    // InternalXMachine.g:743:4: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==27) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalXMachine.g:744:5: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,27,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getXGroupAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalXMachine.g:748:5: ( (otherlv_11= RULE_ID ) )
                    	    // InternalXMachine.g:749:6: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:749:6: (otherlv_11= RULE_ID )
                    	    // InternalXMachine.g:750:7: otherlv_11= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getXGroupRule());
                    	    							}
                    	    						
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_26); 

                    	    							newLeafNode(otherlv_11, grammarAccess.getXGroupAccess().getEventsEventCrossReference_5_1_1_0());
                    	    						

                    	    }


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

            otherlv_12=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getXGroupAccess().getEndKeyword_6());
            		

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
    // InternalXMachine.g:771:1: entryRuleXFormalParameter returns [EObject current=null] : iv_ruleXFormalParameter= ruleXFormalParameter EOF ;
    public final EObject entryRuleXFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFormalParameter = null;


        try {
            // InternalXMachine.g:771:57: (iv_ruleXFormalParameter= ruleXFormalParameter EOF )
            // InternalXMachine.g:772:2: iv_ruleXFormalParameter= ruleXFormalParameter EOF
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
    // InternalXMachine.g:778:1: ruleXFormalParameter returns [EObject current=null] : ( () ( (lv_direction_1_0= ruleXDirection ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXFormalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Enumerator lv_direction_1_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:784:2: ( ( () ( (lv_direction_1_0= ruleXDirection ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:785:2: ( () ( (lv_direction_1_0= ruleXDirection ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:785:2: ( () ( (lv_direction_1_0= ruleXDirection ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:786:3: () ( (lv_direction_1_0= ruleXDirection ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:786:3: ()
            // InternalXMachine.g:787:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXFormalParameterAccess().getFormalParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:793:3: ( (lv_direction_1_0= ruleXDirection ) )
            // InternalXMachine.g:794:4: (lv_direction_1_0= ruleXDirection )
            {
            // InternalXMachine.g:794:4: (lv_direction_1_0= ruleXDirection )
            // InternalXMachine.g:795:5: lv_direction_1_0= ruleXDirection
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

            // InternalXMachine.g:812:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:813:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:813:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:814:5: lv_name_2_0= RULE_ID
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
    // InternalXMachine.g:834:1: entryRuleXEvent returns [EObject current=null] : iv_ruleXEvent= ruleXEvent EOF ;
    public final EObject entryRuleXEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEvent = null;


        try {
            // InternalXMachine.g:834:47: (iv_ruleXEvent= ruleXEvent EOF )
            // InternalXMachine.g:835:2: iv_ruleXEvent= ruleXEvent EOF
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
    // InternalXMachine.g:841:1: ruleXEvent returns [EObject current=null] : ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_6_0= ruleXGroupOrEvent ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' ) ;
    public final EObject ruleXEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_extended_4_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Enumerator lv_convergence_5_0 = null;

        EObject lv_extensions_6_0 = null;

        EObject lv_witnesses_10_0 = null;

        EObject lv_actions_12_0 = null;

        EObject lv_guards_14_0 = null;

        EObject lv_witnesses_16_0 = null;

        EObject lv_actions_18_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_guards_22_0 = null;

        EObject lv_witnesses_24_0 = null;

        EObject lv_actions_26_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:847:2: ( ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_6_0= ruleXGroupOrEvent ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' ) )
            // InternalXMachine.g:848:2: ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_6_0= ruleXGroupOrEvent ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' )
            {
            // InternalXMachine.g:848:2: ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_6_0= ruleXGroupOrEvent ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' )
            // InternalXMachine.g:849:3: () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_6_0= ruleXGroupOrEvent ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end'
            {
            // InternalXMachine.g:849:3: ()
            // InternalXMachine.g:850:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getXEventAccess().getEventKeyword_1());
            		
            // InternalXMachine.g:860:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:861:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:861:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:862:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:878:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) )
            // InternalXMachine.g:879:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) )
            {
            // InternalXMachine.g:879:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) )
            // InternalXMachine.g:880:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getXEventAccess().getUnorderedGroup_3());
            				
            // InternalXMachine.g:883:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* )
            // InternalXMachine.g:884:6: ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )*
            {
            // InternalXMachine.g:884:6: ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( LA22_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 >= 41 && LA22_0 <= 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXMachine.g:885:4: ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) )
            	    {
            	    // InternalXMachine.g:885:4: ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) )
            	    // InternalXMachine.g:886:5: {...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleXEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalXMachine.g:886:103: ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) )
            	    // InternalXMachine.g:887:6: ({...}? => ( (lv_extended_4_0= 'extended' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalXMachine.g:890:9: ({...}? => ( (lv_extended_4_0= 'extended' ) ) )
            	    // InternalXMachine.g:890:10: {...}? => ( (lv_extended_4_0= 'extended' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEvent", "true");
            	    }
            	    // InternalXMachine.g:890:19: ( (lv_extended_4_0= 'extended' ) )
            	    // InternalXMachine.g:890:20: (lv_extended_4_0= 'extended' )
            	    {
            	    // InternalXMachine.g:890:20: (lv_extended_4_0= 'extended' )
            	    // InternalXMachine.g:891:10: lv_extended_4_0= 'extended'
            	    {
            	    lv_extended_4_0=(Token)match(input,31,FOLLOW_27); 

            	    										newLeafNode(lv_extended_4_0, grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getXEventRule());
            	    										}
            	    										setWithLastConsumed(current, "extended", true, "extended");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getXEventAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXMachine.g:908:4: ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) )
            	    {
            	    // InternalXMachine.g:908:4: ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) )
            	    // InternalXMachine.g:909:5: {...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleXEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalXMachine.g:909:103: ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) )
            	    // InternalXMachine.g:910:6: ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalXMachine.g:913:9: ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) )
            	    // InternalXMachine.g:913:10: {...}? => ( (lv_convergence_5_0= ruleXConvergence ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEvent", "true");
            	    }
            	    // InternalXMachine.g:913:19: ( (lv_convergence_5_0= ruleXConvergence ) )
            	    // InternalXMachine.g:913:20: (lv_convergence_5_0= ruleXConvergence )
            	    {
            	    // InternalXMachine.g:913:20: (lv_convergence_5_0= ruleXConvergence )
            	    // InternalXMachine.g:914:10: lv_convergence_5_0= ruleXConvergence
            	    {

            	    										newCompositeNode(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_27);
            	    lv_convergence_5_0=ruleXConvergence();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getXEventRule());
            	    										}
            	    										set(
            	    											current,
            	    											"convergence",
            	    											lv_convergence_5_0,
            	    											"ac.soton.xeventb.xmachine.XMachine.XConvergence");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getXEventAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getXEventAccess().getUnorderedGroup_3());
            				

            }

            // InternalXMachine.g:943:3: ( (lv_extensions_6_0= ruleXGroupOrEvent ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=37 && LA23_0<=38)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalXMachine.g:944:4: (lv_extensions_6_0= ruleXGroupOrEvent )
            	    {
            	    // InternalXMachine.g:944:4: (lv_extensions_6_0= ruleXGroupOrEvent )
            	    // InternalXMachine.g:945:5: lv_extensions_6_0= ruleXGroupOrEvent
            	    {

            	    					newCompositeNode(grammarAccess.getXEventAccess().getExtensionsXGroupOrEventParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_extensions_6_0=ruleXGroupOrEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXEventRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_6_0,
            	    						"ac.soton.xeventb.xmachine.XMachine.XGroupOrEvent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalXMachine.g:962:3: (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXMachine.g:963:4: otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getXEventAccess().getRefinesKeyword_5_0());
                    			
                    // InternalXMachine.g:967:4: ( (otherlv_8= RULE_ID ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalXMachine.g:968:5: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:968:5: (otherlv_8= RULE_ID )
                    	    // InternalXMachine.g:969:6: otherlv_8= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getXEventRule());
                    	    						}
                    	    					
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_29); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:981:3: ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )?
            int alt40=4;
            switch ( input.LA(1) ) {
                case 29:
                case 32:
                    {
                    alt40=1;
                    }
                    break;
                case 33:
                    {
                    alt40=2;
                    }
                    break;
                case 35:
                    {
                    alt40=3;
                    }
                    break;
            }

            switch (alt40) {
                case 1 :
                    // InternalXMachine.g:982:4: ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ )
                    {
                    // InternalXMachine.g:982:4: ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ )
                    // InternalXMachine.g:983:5: (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+
                    {
                    // InternalXMachine.g:983:5: (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==32) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalXMachine.g:984:6: otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+
                            {
                            otherlv_9=(Token)match(input,32,FOLLOW_9); 

                            						newLeafNode(otherlv_9, grammarAccess.getXEventAccess().getWithKeyword_6_0_0_0());
                            					
                            // InternalXMachine.g:988:6: ( (lv_witnesses_10_0= ruleXWitness ) )+
                            int cnt26=0;
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==RULE_XLABEL) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalXMachine.g:989:7: (lv_witnesses_10_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:989:7: (lv_witnesses_10_0= ruleXWitness )
                            	    // InternalXMachine.g:990:8: lv_witnesses_10_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_0_0_1_0());
                            	    							
                            	    pushFollow(FOLLOW_30);
                            	    lv_witnesses_10_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_10_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XWitness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt26 >= 1 ) break loop26;
                                        EarlyExitException eee =
                                            new EarlyExitException(26, input);
                                        throw eee;
                                }
                                cnt26++;
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,29,FOLLOW_9); 

                    					newLeafNode(otherlv_11, grammarAccess.getXEventAccess().getBeginKeyword_6_0_1());
                    				
                    // InternalXMachine.g:1012:5: ( (lv_actions_12_0= ruleXAction ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_XLABEL) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalXMachine.g:1013:6: (lv_actions_12_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:1013:6: (lv_actions_12_0= ruleXAction )
                    	    // InternalXMachine.g:1014:7: lv_actions_12_0= ruleXAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_0_2_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_actions_12_0=ruleXAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_12_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XAction");
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


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1033:4: (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:1033:4: (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:1034:5: otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )?
                    {
                    otherlv_13=(Token)match(input,33,FOLLOW_9); 

                    					newLeafNode(otherlv_13, grammarAccess.getXEventAccess().getWhenKeyword_6_1_0());
                    				
                    // InternalXMachine.g:1038:5: ( (lv_guards_14_0= ruleXGuard ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_XLABEL) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalXMachine.g:1039:6: (lv_guards_14_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1039:6: (lv_guards_14_0= ruleXGuard )
                    	    // InternalXMachine.g:1040:7: lv_guards_14_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_guards_14_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_14_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XGuard");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);

                    // InternalXMachine.g:1057:5: (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==32) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalXMachine.g:1058:6: otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+
                            {
                            otherlv_15=(Token)match(input,32,FOLLOW_9); 

                            						newLeafNode(otherlv_15, grammarAccess.getXEventAccess().getWithKeyword_6_1_2_0());
                            					
                            // InternalXMachine.g:1062:6: ( (lv_witnesses_16_0= ruleXWitness ) )+
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
                            	    // InternalXMachine.g:1063:7: (lv_witnesses_16_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1063:7: (lv_witnesses_16_0= ruleXWitness )
                            	    // InternalXMachine.g:1064:8: lv_witnesses_16_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_1_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_33);
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

                    // InternalXMachine.g:1082:5: (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==34) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalXMachine.g:1083:6: otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+
                            {
                            otherlv_17=(Token)match(input,34,FOLLOW_9); 

                            						newLeafNode(otherlv_17, grammarAccess.getXEventAccess().getThenKeyword_6_1_3_0());
                            					
                            // InternalXMachine.g:1087:6: ( (lv_actions_18_0= ruleXAction ) )+
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
                            	    // InternalXMachine.g:1088:7: (lv_actions_18_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:1088:7: (lv_actions_18_0= ruleXAction )
                            	    // InternalXMachine.g:1089:8: lv_actions_18_0= ruleXAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_1_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_31);
                            	    lv_actions_18_0=ruleXAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_18_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XAction");
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


                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1109:4: (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:1109:4: (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:1110:5: otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )?
                    {
                    otherlv_19=(Token)match(input,35,FOLLOW_3); 

                    					newLeafNode(otherlv_19, grammarAccess.getXEventAccess().getAnyKeyword_6_2_0());
                    				
                    // InternalXMachine.g:1114:5: ( (lv_parameters_20_0= ruleXParameter ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_ID) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalXMachine.g:1115:6: (lv_parameters_20_0= ruleXParameter )
                    	    {
                    	    // InternalXMachine.g:1115:6: (lv_parameters_20_0= ruleXParameter )
                    	    // InternalXMachine.g:1116:7: lv_parameters_20_0= ruleXParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    lv_parameters_20_0=ruleXParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_20_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    otherlv_21=(Token)match(input,36,FOLLOW_9); 

                    					newLeafNode(otherlv_21, grammarAccess.getXEventAccess().getWhereKeyword_6_2_2());
                    				
                    // InternalXMachine.g:1137:5: ( (lv_guards_22_0= ruleXGuard ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_XLABEL) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalXMachine.g:1138:6: (lv_guards_22_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1138:6: (lv_guards_22_0= ruleXGuard )
                    	    // InternalXMachine.g:1139:7: lv_guards_22_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_6_2_3_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_guards_22_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_22_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XGuard");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);

                    // InternalXMachine.g:1156:5: (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==32) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalXMachine.g:1157:6: otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+
                            {
                            otherlv_23=(Token)match(input,32,FOLLOW_9); 

                            						newLeafNode(otherlv_23, grammarAccess.getXEventAccess().getWithKeyword_6_2_4_0());
                            					
                            // InternalXMachine.g:1161:6: ( (lv_witnesses_24_0= ruleXWitness ) )+
                            int cnt36=0;
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==RULE_XLABEL) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // InternalXMachine.g:1162:7: (lv_witnesses_24_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1162:7: (lv_witnesses_24_0= ruleXWitness )
                            	    // InternalXMachine.g:1163:8: lv_witnesses_24_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_2_4_1_0());
                            	    							
                            	    pushFollow(FOLLOW_33);
                            	    lv_witnesses_24_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_24_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XWitness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


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


                            }
                            break;

                    }

                    // InternalXMachine.g:1181:5: (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==34) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalXMachine.g:1182:6: otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+
                            {
                            otherlv_25=(Token)match(input,34,FOLLOW_9); 

                            						newLeafNode(otherlv_25, grammarAccess.getXEventAccess().getThenKeyword_6_2_5_0());
                            					
                            // InternalXMachine.g:1186:6: ( (lv_actions_26_0= ruleXAction ) )+
                            int cnt38=0;
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==RULE_XLABEL) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // InternalXMachine.g:1187:7: (lv_actions_26_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:1187:7: (lv_actions_26_0= ruleXAction )
                            	    // InternalXMachine.g:1188:8: lv_actions_26_0= ruleXAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_2_5_1_0());
                            	    							
                            	    pushFollow(FOLLOW_31);
                            	    lv_actions_26_0=ruleXAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_26_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XAction");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt38 >= 1 ) break loop38;
                                        EarlyExitException eee =
                                            new EarlyExitException(38, input);
                                        throw eee;
                                }
                                cnt38++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_27=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getXEventAccess().getEndKeyword_7());
            		

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
    // InternalXMachine.g:1216:1: entryRuleEventSync returns [EObject current=null] : iv_ruleEventSync= ruleEventSync EOF ;
    public final EObject entryRuleEventSync() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSync = null;


        try {
            // InternalXMachine.g:1216:50: (iv_ruleEventSync= ruleEventSync EOF )
            // InternalXMachine.g:1217:2: iv_ruleEventSync= ruleEventSync EOF
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
    // InternalXMachine.g:1223:1: ruleEventSync returns [EObject current=null] : ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleEventSync() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefix_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXMachine.g:1229:2: ( ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalXMachine.g:1230:2: ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalXMachine.g:1230:2: ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            // InternalXMachine.g:1231:3: () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalXMachine.g:1231:3: ()
            // InternalXMachine.g:1232:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1238:3: (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            // InternalXMachine.g:1239:4: otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            				newLeafNode(otherlv_1, grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0());
            			
            // InternalXMachine.g:1243:4: ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==23) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalXMachine.g:1244:5: ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.'
                    {
                    // InternalXMachine.g:1244:5: ( (lv_prefix_2_0= RULE_ID ) )
                    // InternalXMachine.g:1245:6: (lv_prefix_2_0= RULE_ID )
                    {
                    // InternalXMachine.g:1245:6: (lv_prefix_2_0= RULE_ID )
                    // InternalXMachine.g:1246:7: lv_prefix_2_0= RULE_ID
                    {
                    lv_prefix_2_0=(Token)match(input,RULE_ID,FOLLOW_35); 

                    							newLeafNode(lv_prefix_2_0, grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEventSyncRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"prefix",
                    								lv_prefix_2_0,
                    								"ac.soton.xeventb.xmachine.XMachine.ID");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1());
                    				

                    }
                    break;

            }

            // InternalXMachine.g:1267:4: ( (otherlv_4= RULE_ID ) )
            // InternalXMachine.g:1268:5: (otherlv_4= RULE_ID )
            {
            // InternalXMachine.g:1268:5: (otherlv_4= RULE_ID )
            // InternalXMachine.g:1269:6: otherlv_4= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEventSyncRule());
            						}
            					
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            						newLeafNode(otherlv_4, grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0());
            					

            }


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
    // $ANTLR end "ruleEventSync"


    // $ANTLR start "entryRuleGroupSync"
    // InternalXMachine.g:1285:1: entryRuleGroupSync returns [EObject current=null] : iv_ruleGroupSync= ruleGroupSync EOF ;
    public final EObject entryRuleGroupSync() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupSync = null;


        try {
            // InternalXMachine.g:1285:50: (iv_ruleGroupSync= ruleGroupSync EOF )
            // InternalXMachine.g:1286:2: iv_ruleGroupSync= ruleGroupSync EOF
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
    // InternalXMachine.g:1292:1: ruleGroupSync returns [EObject current=null] : ( () (otherlv_1= 'synchronisesGroup' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= '(' ( (lv_actualParameters_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_actualParameters_8_0= RULE_ID ) ) )* otherlv_9= ')' )? ) ;
    public final EObject ruleGroupSync() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefix_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_actualParameters_6_0=null;
        Token otherlv_7=null;
        Token lv_actualParameters_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalXMachine.g:1298:2: ( ( () (otherlv_1= 'synchronisesGroup' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= '(' ( (lv_actualParameters_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_actualParameters_8_0= RULE_ID ) ) )* otherlv_9= ')' )? ) )
            // InternalXMachine.g:1299:2: ( () (otherlv_1= 'synchronisesGroup' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= '(' ( (lv_actualParameters_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_actualParameters_8_0= RULE_ID ) ) )* otherlv_9= ')' )? )
            {
            // InternalXMachine.g:1299:2: ( () (otherlv_1= 'synchronisesGroup' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= '(' ( (lv_actualParameters_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_actualParameters_8_0= RULE_ID ) ) )* otherlv_9= ')' )? )
            // InternalXMachine.g:1300:3: () (otherlv_1= 'synchronisesGroup' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= '(' ( (lv_actualParameters_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_actualParameters_8_0= RULE_ID ) ) )* otherlv_9= ')' )?
            {
            // InternalXMachine.g:1300:3: ()
            // InternalXMachine.g:1301:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupSyncAccess().getEventSynchronisationAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1307:3: (otherlv_1= 'synchronisesGroup' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            // InternalXMachine.g:1308:4: otherlv_1= 'synchronisesGroup' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            				newLeafNode(otherlv_1, grammarAccess.getGroupSyncAccess().getSynchronisesGroupKeyword_1_0());
            			
            // InternalXMachine.g:1312:4: ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==23) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalXMachine.g:1313:5: ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.'
                    {
                    // InternalXMachine.g:1313:5: ( (lv_prefix_2_0= RULE_ID ) )
                    // InternalXMachine.g:1314:6: (lv_prefix_2_0= RULE_ID )
                    {
                    // InternalXMachine.g:1314:6: (lv_prefix_2_0= RULE_ID )
                    // InternalXMachine.g:1315:7: lv_prefix_2_0= RULE_ID
                    {
                    lv_prefix_2_0=(Token)match(input,RULE_ID,FOLLOW_35); 

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

            // InternalXMachine.g:1336:4: ( (otherlv_4= RULE_ID ) )
            // InternalXMachine.g:1337:5: (otherlv_4= RULE_ID )
            {
            // InternalXMachine.g:1337:5: (otherlv_4= RULE_ID )
            // InternalXMachine.g:1338:6: otherlv_4= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGroupSyncRule());
            						}
            					
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_36); 

            						newLeafNode(otherlv_4, grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesCrossReference_1_2_0());
            					

            }


            }


            }

            // InternalXMachine.g:1350:3: (otherlv_5= '(' ( (lv_actualParameters_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_actualParameters_8_0= RULE_ID ) ) )* otherlv_9= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==26) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalXMachine.g:1351:4: otherlv_5= '(' ( (lv_actualParameters_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_actualParameters_8_0= RULE_ID ) ) )* otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getGroupSyncAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalXMachine.g:1355:4: ( (lv_actualParameters_6_0= RULE_ID ) )
                    // InternalXMachine.g:1356:5: (lv_actualParameters_6_0= RULE_ID )
                    {
                    // InternalXMachine.g:1356:5: (lv_actualParameters_6_0= RULE_ID )
                    // InternalXMachine.g:1357:6: lv_actualParameters_6_0= RULE_ID
                    {
                    lv_actualParameters_6_0=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(lv_actualParameters_6_0, grammarAccess.getGroupSyncAccess().getActualParametersIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroupSyncRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"actualParameters",
                    							lv_actualParameters_6_0,
                    							"ac.soton.xeventb.xmachine.XMachine.ID");
                    					

                    }


                    }

                    // InternalXMachine.g:1373:4: (otherlv_7= ',' ( (lv_actualParameters_8_0= RULE_ID ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==27) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalXMachine.g:1374:5: otherlv_7= ',' ( (lv_actualParameters_8_0= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getGroupSyncAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalXMachine.g:1378:5: ( (lv_actualParameters_8_0= RULE_ID ) )
                    	    // InternalXMachine.g:1379:6: (lv_actualParameters_8_0= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:1379:6: (lv_actualParameters_8_0= RULE_ID )
                    	    // InternalXMachine.g:1380:7: lv_actualParameters_8_0= RULE_ID
                    	    {
                    	    lv_actualParameters_8_0=(Token)match(input,RULE_ID,FOLLOW_23); 

                    	    							newLeafNode(lv_actualParameters_8_0, grammarAccess.getGroupSyncAccess().getActualParametersIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getGroupSyncRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"actualParameters",
                    	    								lv_actualParameters_8_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
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
    // InternalXMachine.g:1406:1: entryRuleXGroupOrEvent returns [EObject current=null] : iv_ruleXGroupOrEvent= ruleXGroupOrEvent EOF ;
    public final EObject entryRuleXGroupOrEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGroupOrEvent = null;


        try {
            // InternalXMachine.g:1406:54: (iv_ruleXGroupOrEvent= ruleXGroupOrEvent EOF )
            // InternalXMachine.g:1407:2: iv_ruleXGroupOrEvent= ruleXGroupOrEvent EOF
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
    // InternalXMachine.g:1413:1: ruleXGroupOrEvent returns [EObject current=null] : (this_GroupSync_0= ruleGroupSync | this_EventSync_1= ruleEventSync ) ;
    public final EObject ruleXGroupOrEvent() throws RecognitionException {
        EObject current = null;

        EObject this_GroupSync_0 = null;

        EObject this_EventSync_1 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1419:2: ( (this_GroupSync_0= ruleGroupSync | this_EventSync_1= ruleEventSync ) )
            // InternalXMachine.g:1420:2: (this_GroupSync_0= ruleGroupSync | this_EventSync_1= ruleEventSync )
            {
            // InternalXMachine.g:1420:2: (this_GroupSync_0= ruleGroupSync | this_EventSync_1= ruleEventSync )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                alt45=1;
            }
            else if ( (LA45_0==37) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:1421:3: this_GroupSync_0= ruleGroupSync
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
                    // InternalXMachine.g:1430:3: this_EventSync_1= ruleEventSync
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
    // InternalXMachine.g:1442:1: entryRuleXParameter returns [EObject current=null] : iv_ruleXParameter= ruleXParameter EOF ;
    public final EObject entryRuleXParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameter = null;


        try {
            // InternalXMachine.g:1442:51: (iv_ruleXParameter= ruleXParameter EOF )
            // InternalXMachine.g:1443:2: iv_ruleXParameter= ruleXParameter EOF
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
    // InternalXMachine.g:1449:1: ruleXParameter returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1455:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:1456:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:1456:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:1457:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:1457:3: ()
            // InternalXMachine.g:1458:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1464:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:1465:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:1465:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:1466:5: lv_name_1_0= RULE_ID
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
    // InternalXMachine.g:1486:1: entryRuleXGuard returns [EObject current=null] : iv_ruleXGuard= ruleXGuard EOF ;
    public final EObject entryRuleXGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuard = null;


        try {
            // InternalXMachine.g:1486:47: (iv_ruleXGuard= ruleXGuard EOF )
            // InternalXMachine.g:1487:2: iv_ruleXGuard= ruleXGuard EOF
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
    // InternalXMachine.g:1493:1: ruleXGuard returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleXGuard() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_theorem_3_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1499:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalXMachine.g:1500:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:1500:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalXMachine.g:1501:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalXMachine.g:1501:3: ()
            // InternalXMachine.g:1502:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGuardAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1508:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:1509:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1509:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:1510:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGuardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:1526:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalXMachine.g:1527:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:1527:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalXMachine.g:1528:5: lv_predicate_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXGuardAccess().getPredicateXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_predicate_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXGuardRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMachine.g:1545:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:1546:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:1546:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:1547:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_theorem_3_0, grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXGuardRule());
                    					}
                    					setWithLastConsumed(current, "theorem", true, "theorem");
                    				

                    }


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
    // $ANTLR end "ruleXGuard"


    // $ANTLR start "entryRuleXWitness"
    // InternalXMachine.g:1563:1: entryRuleXWitness returns [EObject current=null] : iv_ruleXWitness= ruleXWitness EOF ;
    public final EObject entryRuleXWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitness = null;


        try {
            // InternalXMachine.g:1563:49: (iv_ruleXWitness= ruleXWitness EOF )
            // InternalXMachine.g:1564:2: iv_ruleXWitness= ruleXWitness EOF
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
    // InternalXMachine.g:1570:1: ruleXWitness returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ) ;
    public final EObject ruleXWitness() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1576:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ) )
            // InternalXMachine.g:1577:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) )
            {
            // InternalXMachine.g:1577:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) )
            // InternalXMachine.g:1578:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) )
            {
            // InternalXMachine.g:1578:3: ()
            // InternalXMachine.g:1579:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXWitnessAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1585:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:1586:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1586:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:1587:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_11); 

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

            // InternalXMachine.g:1603:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalXMachine.g:1604:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:1604:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalXMachine.g:1605:5: lv_predicate_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXWitnessAccess().getPredicateXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXWitnessRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
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
    // InternalXMachine.g:1626:1: entryRuleXAction returns [EObject current=null] : iv_ruleXAction= ruleXAction EOF ;
    public final EObject entryRuleXAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAction = null;


        try {
            // InternalXMachine.g:1626:48: (iv_ruleXAction= ruleXAction EOF )
            // InternalXMachine.g:1627:2: iv_ruleXAction= ruleXAction EOF
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
    // InternalXMachine.g:1633:1: ruleXAction returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) ) ;
    public final EObject ruleXAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_action_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1639:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) ) )
            // InternalXMachine.g:1640:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) )
            {
            // InternalXMachine.g:1640:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) )
            // InternalXMachine.g:1641:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) )
            {
            // InternalXMachine.g:1641:3: ()
            // InternalXMachine.g:1642:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1648:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:1649:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1649:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:1650:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_11); 

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

            // InternalXMachine.g:1666:3: ( (lv_action_2_0= ruleXPredicate ) )
            // InternalXMachine.g:1667:4: (lv_action_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:1667:4: (lv_action_2_0= ruleXPredicate )
            // InternalXMachine.g:1668:5: lv_action_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXActionAccess().getActionXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXActionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
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


    // $ANTLR start "entryRuleXPredicate"
    // InternalXMachine.g:1689:1: entryRuleXPredicate returns [String current=null] : iv_ruleXPredicate= ruleXPredicate EOF ;
    public final String entryRuleXPredicate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXPredicate = null;


        try {
            // InternalXMachine.g:1689:50: (iv_ruleXPredicate= ruleXPredicate EOF )
            // InternalXMachine.g:1690:2: iv_ruleXPredicate= ruleXPredicate EOF
            {
             newCompositeNode(grammarAccess.getXPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXPredicate=ruleXPredicate();

            state._fsp--;

             current =iv_ruleXPredicate.getText(); 
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
    // $ANTLR end "entryRuleXPredicate"


    // $ANTLR start "ruleXPredicate"
    // InternalXMachine.g:1696:1: ruleXPredicate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleXPredicate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1702:2: (this_STRING_0= RULE_STRING )
            // InternalXMachine.g:1703:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getXPredicateAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleXPredicate"


    // $ANTLR start "ruleXDirection"
    // InternalXMachine.g:1713:1: ruleXDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleXDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXMachine.g:1719:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // InternalXMachine.g:1720:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // InternalXMachine.g:1720:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==39) ) {
                alt47=1;
            }
            else if ( (LA47_0==40) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalXMachine.g:1721:3: (enumLiteral_0= 'in' )
                    {
                    // InternalXMachine.g:1721:3: (enumLiteral_0= 'in' )
                    // InternalXMachine.g:1722:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getXDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getXDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1729:3: (enumLiteral_1= 'out' )
                    {
                    // InternalXMachine.g:1729:3: (enumLiteral_1= 'out' )
                    // InternalXMachine.g:1730:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

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
    // InternalXMachine.g:1740:1: ruleXConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleXConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:1746:2: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // InternalXMachine.g:1747:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // InternalXMachine.g:1747:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt48=1;
                }
                break;
            case 42:
                {
                alt48=2;
                }
                break;
            case 43:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalXMachine.g:1748:3: (enumLiteral_0= 'ordinary' )
                    {
                    // InternalXMachine.g:1748:3: (enumLiteral_0= 'ordinary' )
                    // InternalXMachine.g:1749:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1756:3: (enumLiteral_1= 'convergent' )
                    {
                    // InternalXMachine.g:1756:3: (enumLiteral_1= 'convergent' )
                    // InternalXMachine.g:1757:4: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1764:3: (enumLiteral_2= 'anticipated' )
                    {
                    // InternalXMachine.g:1764:3: (enumLiteral_2= 'anticipated' )
                    // InternalXMachine.g:1765:4: enumLiteral_2= 'anticipated'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000021FC000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000021F8010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000021F8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000020F0010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000020E0020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000020C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000042080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000E6BA0082000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000006B20082000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000B20080010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000500080020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400080020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000004000002L});

}
