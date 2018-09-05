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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_XLABEL", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variant'", "'events'", "'end'", "'includes'", "'to'", "'as'", "'.'", "'theorem'", "'Group'", "'('", "','", "')'", "'begin'", "'extended'", "'with'", "'when'", "'then'", "'any'", "'where'", "'synchronises'", "'synchronisesGroup'", "'in'", "'out'", "'ordinary'", "'convergent'", "'anticipated'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__19=19;
    public static final int RULE_XLABEL=7;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=4;
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
    // InternalXMachine.g:72:1: ruleMachine returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( (lv_extensions_4_0= ruleMIncludes ) )* (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? ( (lv_extensions_18_0= ruleXGroup ) )* otherlv_19= 'end' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_1=null;
        Token lv_comment_1_2=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        EObject lv_extensions_4_0 = null;

        EObject lv_variables_10_0 = null;

        EObject lv_invariants_12_0 = null;

        EObject lv_variant_14_0 = null;

        EObject lv_events_16_0 = null;

        EObject lv_events_17_0 = null;

        EObject lv_extensions_18_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:78:2: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( (lv_extensions_4_0= ruleMIncludes ) )* (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? ( (lv_extensions_18_0= ruleXGroup ) )* otherlv_19= 'end' ) )
            // InternalXMachine.g:79:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( (lv_extensions_4_0= ruleMIncludes ) )* (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? ( (lv_extensions_18_0= ruleXGroup ) )* otherlv_19= 'end' )
            {
            // InternalXMachine.g:79:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( (lv_extensions_4_0= ruleMIncludes ) )* (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? ( (lv_extensions_18_0= ruleXGroup ) )* otherlv_19= 'end' )
            // InternalXMachine.g:80:3: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( (lv_extensions_4_0= ruleMIncludes ) )* (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? ( (lv_extensions_18_0= ruleXGroup ) )* otherlv_19= 'end'
            {
            // InternalXMachine.g:80:3: ()
            // InternalXMachine.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMachineAccess().getMachineAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:87:3: ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ML_COMMENT && LA2_0<=RULE_SL_COMMENT)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXMachine.g:88:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    {
                    // InternalXMachine.g:88:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    // InternalXMachine.g:89:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:89:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
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
                            // InternalXMachine.g:90:6: lv_comment_1_1= RULE_ML_COMMENT
                            {
                            lv_comment_1_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_1_1, grammarAccess.getMachineAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getMachineRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_1_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:105:6: lv_comment_1_2= RULE_SL_COMMENT
                            {
                            lv_comment_1_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_1_2, grammarAccess.getMachineAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getMachineRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_1_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getMachineKeyword_2());
            		
            // InternalXMachine.g:126:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXMachine.g:127:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXMachine.g:127:4: (lv_name_3_0= RULE_ID )
            // InternalXMachine.g:128:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_3_0, grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:144:3: ( (lv_extensions_4_0= ruleMIncludes ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXMachine.g:145:4: (lv_extensions_4_0= ruleMIncludes )
            	    {
            	    // InternalXMachine.g:145:4: (lv_extensions_4_0= ruleMIncludes )
            	    // InternalXMachine.g:146:5: lv_extensions_4_0= ruleMIncludes
            	    {

            	    					newCompositeNode(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_extensions_4_0=ruleMIncludes();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_4_0,
            	    						"ac.soton.xeventb.xmachine.XMachine.MIncludes");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalXMachine.g:163:3: (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXMachine.g:164:4: otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getRefinesKeyword_5_0());
                    			
                    // InternalXMachine.g:168:4: ( (otherlv_6= RULE_ID ) )
                    // InternalXMachine.g:169:5: (otherlv_6= RULE_ID )
                    {
                    // InternalXMachine.g:169:5: (otherlv_6= RULE_ID )
                    // InternalXMachine.g:170:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMachineRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_6, grammarAccess.getMachineAccess().getRefinesMachineCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:182:3: (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:183:4: otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getMachineAccess().getSeesKeyword_6_0());
                    			
                    // InternalXMachine.g:187:4: ( (otherlv_8= RULE_ID ) )+
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
                    	    // InternalXMachine.g:188:5: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:188:5: (otherlv_8= RULE_ID )
                    	    // InternalXMachine.g:189:6: otherlv_8= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getMachineRule());
                    	    						}
                    	    					
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getMachineAccess().getSeesContextCrossReference_6_1_0());
                    	    					

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

            // InternalXMachine.g:201:3: (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:202:4: otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getMachineAccess().getVariablesKeyword_7_0());
                    			
                    // InternalXMachine.g:206:4: ( (lv_variables_10_0= ruleXVariable ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalXMachine.g:207:5: (lv_variables_10_0= ruleXVariable )
                    	    {
                    	    // InternalXMachine.g:207:5: (lv_variables_10_0= ruleXVariable )
                    	    // InternalXMachine.g:208:6: lv_variables_10_0= ruleXVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
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

            // InternalXMachine.g:226:3: (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXMachine.g:227:4: otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getMachineAccess().getInvariantsKeyword_8_0());
                    			
                    // InternalXMachine.g:231:4: ( (lv_invariants_12_0= ruleXInvariant ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_XLABEL) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalXMachine.g:232:5: (lv_invariants_12_0= ruleXInvariant )
                    	    {
                    	    // InternalXMachine.g:232:5: (lv_invariants_12_0= ruleXInvariant )
                    	    // InternalXMachine.g:233:6: lv_invariants_12_0= ruleXInvariant
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
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
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:251:3: (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:252:4: otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) )
                    {
                    otherlv_13=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getMachineAccess().getVariantKeyword_9_0());
                    			
                    // InternalXMachine.g:256:4: ( (lv_variant_14_0= ruleXVariant ) )
                    // InternalXMachine.g:257:5: (lv_variant_14_0= ruleXVariant )
                    {
                    // InternalXMachine.g:257:5: (lv_variant_14_0= ruleXVariant )
                    // InternalXMachine.g:258:6: lv_variant_14_0= ruleXVariant
                    {

                    						newCompositeNode(grammarAccess.getMachineAccess().getVariantXVariantParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_variant_14_0=ruleXVariant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    						}
                    						set(
                    							current,
                    							"variant",
                    							lv_variant_14_0,
                    							"ac.soton.xeventb.xmachine.XMachine.XVariant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:276:3: (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:277:4: otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )*
                    {
                    otherlv_15=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getMachineAccess().getEventsKeyword_10_0());
                    			
                    // InternalXMachine.g:281:4: ( (lv_events_16_0= ruleXEvent ) )
                    // InternalXMachine.g:282:5: (lv_events_16_0= ruleXEvent )
                    {
                    // InternalXMachine.g:282:5: (lv_events_16_0= ruleXEvent )
                    // InternalXMachine.g:283:6: lv_events_16_0= ruleXEvent
                    {

                    						newCompositeNode(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalXMachine.g:300:4: ( (lv_events_17_0= ruleXEvent ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalXMachine.g:301:5: (lv_events_17_0= ruleXEvent )
                    	    {
                    	    // InternalXMachine.g:301:5: (lv_events_17_0= ruleXEvent )
                    	    // InternalXMachine.g:302:6: lv_events_17_0= ruleXEvent
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:320:3: ( (lv_extensions_18_0= ruleXGroup ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXMachine.g:321:4: (lv_extensions_18_0= ruleXGroup )
            	    {
            	    // InternalXMachine.g:321:4: (lv_extensions_18_0= ruleXGroup )
            	    // InternalXMachine.g:322:5: lv_extensions_18_0= ruleXGroup
            	    {

            	    					newCompositeNode(grammarAccess.getMachineAccess().getExtensionsXGroupParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    break loop14;
                }
            } while (true);

            otherlv_19=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getMachineAccess().getEndKeyword_12());
            		

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
    // InternalXMachine.g:347:1: entryRuleMIncludes returns [EObject current=null] : iv_ruleMIncludes= ruleMIncludes EOF ;
    public final EObject entryRuleMIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMIncludes = null;


        try {
            // InternalXMachine.g:347:50: (iv_ruleMIncludes= ruleMIncludes EOF )
            // InternalXMachine.g:348:2: iv_ruleMIncludes= ruleMIncludes EOF
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
    // InternalXMachine.g:354:1: ruleMIncludes returns [EObject current=null] : ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) ;
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
            // InternalXMachine.g:360:2: ( ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) )
            // InternalXMachine.g:361:2: ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            {
            // InternalXMachine.g:361:2: ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            // InternalXMachine.g:362:3: () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            {
            // InternalXMachine.g:362:3: ()
            // InternalXMachine.g:363:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMIncludesAccess().getMachineInclusionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:369:3: (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:370:4: otherlv_1= 'includes' ( ( ruleQualifiedName ) )
            {
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0());
            			
            // InternalXMachine.g:374:4: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:375:5: ( ruleQualifiedName )
            {
            // InternalXMachine.g:375:5: ( ruleQualifiedName )
            // InternalXMachine.g:376:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getMIncludesRule());
            						}
            					

            						newCompositeNode(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0());
            					
            pushFollow(FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalXMachine.g:391:3: (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXMachine.g:392:4: otherlv_3= 'to' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getMIncludesAccess().getToKeyword_2_0());
                    			
                    // InternalXMachine.g:396:4: ( (otherlv_4= RULE_ID ) )
                    // InternalXMachine.g:397:5: (otherlv_4= RULE_ID )
                    {
                    // InternalXMachine.g:397:5: (otherlv_4= RULE_ID )
                    // InternalXMachine.g:398:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMIncludesRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_4, grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:410:3: (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:411:4: otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )*
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getMIncludesAccess().getAsKeyword_3_0());
                    			
                    // InternalXMachine.g:415:4: ( (lv_prefixes_6_0= RULE_ID ) )
                    // InternalXMachine.g:416:5: (lv_prefixes_6_0= RULE_ID )
                    {
                    // InternalXMachine.g:416:5: (lv_prefixes_6_0= RULE_ID )
                    // InternalXMachine.g:417:6: lv_prefixes_6_0= RULE_ID
                    {
                    lv_prefixes_6_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

                    // InternalXMachine.g:433:4: ( (lv_prefixes_7_0= RULE_ID ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalXMachine.g:434:5: (lv_prefixes_7_0= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:434:5: (lv_prefixes_7_0= RULE_ID )
                    	    // InternalXMachine.g:435:6: lv_prefixes_7_0= RULE_ID
                    	    {
                    	    lv_prefixes_7_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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
                    	    break loop16;
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
    // InternalXMachine.g:456:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXMachine.g:456:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXMachine.g:457:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalXMachine.g:463:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:469:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalXMachine.g:470:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalXMachine.g:470:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // InternalXMachine.g:471:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXMachine.g:478:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXMachine.g:479:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,23,FOLLOW_4); 

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
    // InternalXMachine.g:496:1: entryRuleXVariable returns [EObject current=null] : iv_ruleXVariable= ruleXVariable EOF ;
    public final EObject entryRuleXVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariable = null;


        try {
            // InternalXMachine.g:496:50: (iv_ruleXVariable= ruleXVariable EOF )
            // InternalXMachine.g:497:2: iv_ruleXVariable= ruleXVariable EOF
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
    // InternalXMachine.g:503:1: ruleXVariable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:509:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:510:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:510:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:511:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:511:3: ()
            // InternalXMachine.g:512:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:518:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:519:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:519:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:520:5: lv_name_1_0= RULE_ID
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
    // InternalXMachine.g:540:1: entryRuleXInvariant returns [EObject current=null] : iv_ruleXInvariant= ruleXInvariant EOF ;
    public final EObject entryRuleXInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariant = null;


        try {
            // InternalXMachine.g:540:51: (iv_ruleXInvariant= ruleXInvariant EOF )
            // InternalXMachine.g:541:2: iv_ruleXInvariant= ruleXInvariant EOF
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
    // InternalXMachine.g:547:1: ruleXInvariant returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleXInvariant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_theorem_3_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:553:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalXMachine.g:554:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:554:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalXMachine.g:555:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalXMachine.g:555:3: ()
            // InternalXMachine.g:556:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXInvariantAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:562:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:563:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:563:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:564:5: lv_name_1_0= RULE_XLABEL
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

            // InternalXMachine.g:580:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalXMachine.g:581:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:581:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalXMachine.g:582:5: lv_predicate_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXInvariantAccess().getPredicateXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalXMachine.g:599:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXMachine.g:600:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:600:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:601:5: lv_theorem_3_0= 'theorem'
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
    // InternalXMachine.g:617:1: entryRuleXVariant returns [EObject current=null] : iv_ruleXVariant= ruleXVariant EOF ;
    public final EObject entryRuleXVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariant = null;


        try {
            // InternalXMachine.g:617:49: (iv_ruleXVariant= ruleXVariant EOF )
            // InternalXMachine.g:618:2: iv_ruleXVariant= ruleXVariant EOF
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
    // InternalXMachine.g:624:1: ruleXVariant returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleXPredicate ) ) ) ;
    public final EObject ruleXVariant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:630:2: ( ( () ( (lv_expression_1_0= ruleXPredicate ) ) ) )
            // InternalXMachine.g:631:2: ( () ( (lv_expression_1_0= ruleXPredicate ) ) )
            {
            // InternalXMachine.g:631:2: ( () ( (lv_expression_1_0= ruleXPredicate ) ) )
            // InternalXMachine.g:632:3: () ( (lv_expression_1_0= ruleXPredicate ) )
            {
            // InternalXMachine.g:632:3: ()
            // InternalXMachine.g:633:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariantAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:639:3: ( (lv_expression_1_0= ruleXPredicate ) )
            // InternalXMachine.g:640:4: (lv_expression_1_0= ruleXPredicate )
            {
            // InternalXMachine.g:640:4: (lv_expression_1_0= ruleXPredicate )
            // InternalXMachine.g:641:5: lv_expression_1_0= ruleXPredicate
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
    // InternalXMachine.g:662:1: entryRuleXGroup returns [EObject current=null] : iv_ruleXGroup= ruleXGroup EOF ;
    public final EObject entryRuleXGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGroup = null;


        try {
            // InternalXMachine.g:662:47: (iv_ruleXGroup= ruleXGroup EOF )
            // InternalXMachine.g:663:2: iv_ruleXGroup= ruleXGroup EOF
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
    // InternalXMachine.g:669:1: ruleXGroup returns [EObject current=null] : ( () otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )? otherlv_8= 'begin' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= 'end' ) ;
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
            // InternalXMachine.g:675:2: ( ( () otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )? otherlv_8= 'begin' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= 'end' ) )
            // InternalXMachine.g:676:2: ( () otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )? otherlv_8= 'begin' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= 'end' )
            {
            // InternalXMachine.g:676:2: ( () otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )? otherlv_8= 'begin' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= 'end' )
            // InternalXMachine.g:677:3: () otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )? otherlv_8= 'begin' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= 'end'
            {
            // InternalXMachine.g:677:3: ()
            // InternalXMachine.g:678:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGroupAccess().getEventCasesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getXGroupAccess().getGroupKeyword_1());
            		
            // InternalXMachine.g:688:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:689:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:689:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:690:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalXMachine.g:706:3: (otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXMachine.g:707:4: otherlv_3= '(' ( (lv_formalParameters_4_0= ruleXFormalParameter ) ) (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getXGroupAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalXMachine.g:711:4: ( (lv_formalParameters_4_0= ruleXFormalParameter ) )
                    // InternalXMachine.g:712:5: (lv_formalParameters_4_0= ruleXFormalParameter )
                    {
                    // InternalXMachine.g:712:5: (lv_formalParameters_4_0= ruleXFormalParameter )
                    // InternalXMachine.g:713:6: lv_formalParameters_4_0= ruleXFormalParameter
                    {

                    						newCompositeNode(grammarAccess.getXGroupAccess().getFormalParametersXFormalParameterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    // InternalXMachine.g:730:4: (otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==27) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalXMachine.g:731:5: otherlv_5= ',' ( (lv_formalParameters_6_0= ruleXFormalParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_21); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getXGroupAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalXMachine.g:735:5: ( (lv_formalParameters_6_0= ruleXFormalParameter ) )
                    	    // InternalXMachine.g:736:6: (lv_formalParameters_6_0= ruleXFormalParameter )
                    	    {
                    	    // InternalXMachine.g:736:6: (lv_formalParameters_6_0= ruleXFormalParameter )
                    	    // InternalXMachine.g:737:7: lv_formalParameters_6_0= ruleXFormalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getXGroupAccess().getFormalParametersXFormalParameterParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,28,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getXGroupAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getXGroupAccess().getBeginKeyword_4());
            		
            // InternalXMachine.g:764:3: ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXMachine.g:765:4: ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    {
                    // InternalXMachine.g:765:4: ( (otherlv_9= RULE_ID ) )
                    // InternalXMachine.g:766:5: (otherlv_9= RULE_ID )
                    {
                    // InternalXMachine.g:766:5: (otherlv_9= RULE_ID )
                    // InternalXMachine.g:767:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXGroupRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(otherlv_9, grammarAccess.getXGroupAccess().getEventsEventCrossReference_5_0_0());
                    					

                    }


                    }

                    // InternalXMachine.g:778:4: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==27) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalXMachine.g:779:5: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,27,FOLLOW_4); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getXGroupAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalXMachine.g:783:5: ( (otherlv_11= RULE_ID ) )
                    	    // InternalXMachine.g:784:6: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:784:6: (otherlv_11= RULE_ID )
                    	    // InternalXMachine.g:785:7: otherlv_11= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getXGroupRule());
                    	    							}
                    	    						
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(otherlv_11, grammarAccess.getXGroupAccess().getEventsEventCrossReference_5_1_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
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
    // InternalXMachine.g:806:1: entryRuleXFormalParameter returns [EObject current=null] : iv_ruleXFormalParameter= ruleXFormalParameter EOF ;
    public final EObject entryRuleXFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFormalParameter = null;


        try {
            // InternalXMachine.g:806:57: (iv_ruleXFormalParameter= ruleXFormalParameter EOF )
            // InternalXMachine.g:807:2: iv_ruleXFormalParameter= ruleXFormalParameter EOF
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
    // InternalXMachine.g:813:1: ruleXFormalParameter returns [EObject current=null] : ( () ( (lv_direction_1_0= ruleXDirection ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXFormalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Enumerator lv_direction_1_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:819:2: ( ( () ( (lv_direction_1_0= ruleXDirection ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:820:2: ( () ( (lv_direction_1_0= ruleXDirection ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:820:2: ( () ( (lv_direction_1_0= ruleXDirection ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:821:3: () ( (lv_direction_1_0= ruleXDirection ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:821:3: ()
            // InternalXMachine.g:822:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXFormalParameterAccess().getFormalParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:828:3: ( (lv_direction_1_0= ruleXDirection ) )
            // InternalXMachine.g:829:4: (lv_direction_1_0= ruleXDirection )
            {
            // InternalXMachine.g:829:4: (lv_direction_1_0= ruleXDirection )
            // InternalXMachine.g:830:5: lv_direction_1_0= ruleXDirection
            {

            					newCompositeNode(grammarAccess.getXFormalParameterAccess().getDirectionXDirectionEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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

            // InternalXMachine.g:847:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:848:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:848:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:849:5: lv_name_2_0= RULE_ID
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


    // $ANTLR start "entryRuleXFormalArgument"
    // InternalXMachine.g:869:1: entryRuleXFormalArgument returns [EObject current=null] : iv_ruleXFormalArgument= ruleXFormalArgument EOF ;
    public final EObject entryRuleXFormalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFormalArgument = null;


        try {
            // InternalXMachine.g:869:56: (iv_ruleXFormalArgument= ruleXFormalArgument EOF )
            // InternalXMachine.g:870:2: iv_ruleXFormalArgument= ruleXFormalArgument EOF
            {
             newCompositeNode(grammarAccess.getXFormalArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXFormalArgument=ruleXFormalArgument();

            state._fsp--;

             current =iv_ruleXFormalArgument; 
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
    // $ANTLR end "entryRuleXFormalArgument"


    // $ANTLR start "ruleXFormalArgument"
    // InternalXMachine.g:876:1: ruleXFormalArgument returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXFormalArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:882:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:883:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:883:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:884:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:884:3: ()
            // InternalXMachine.g:885:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXFormalArgumentAccess().getFormalParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:891:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:892:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:892:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:893:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXFormalArgumentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXFormalArgumentRule());
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
    // $ANTLR end "ruleXFormalArgument"


    // $ANTLR start "entryRuleXEvent"
    // InternalXMachine.g:913:1: entryRuleXEvent returns [EObject current=null] : iv_ruleXEvent= ruleXEvent EOF ;
    public final EObject entryRuleXEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEvent = null;


        try {
            // InternalXMachine.g:913:47: (iv_ruleXEvent= ruleXEvent EOF )
            // InternalXMachine.g:914:2: iv_ruleXEvent= ruleXEvent EOF
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
    // InternalXMachine.g:920:1: ruleXEvent returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= rulegroupOrEvent ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )? otherlv_26= 'end' ) ;
    public final EObject ruleXEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_extended_3_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Enumerator lv_convergence_4_0 = null;

        EObject lv_extensions_5_0 = null;

        EObject lv_witnesses_9_0 = null;

        EObject lv_actions_11_0 = null;

        EObject lv_guards_13_0 = null;

        EObject lv_witnesses_15_0 = null;

        EObject lv_actions_17_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_guards_21_0 = null;

        EObject lv_witnesses_23_0 = null;

        EObject lv_actions_25_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:926:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= rulegroupOrEvent ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )? otherlv_26= 'end' ) )
            // InternalXMachine.g:927:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= rulegroupOrEvent ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )? otherlv_26= 'end' )
            {
            // InternalXMachine.g:927:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= rulegroupOrEvent ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )? otherlv_26= 'end' )
            // InternalXMachine.g:928:3: () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= rulegroupOrEvent ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )? otherlv_26= 'end'
            {
            // InternalXMachine.g:928:3: ()
            // InternalXMachine.g:929:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXEventAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:935:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:936:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:936:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:937:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:953:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) )
            // InternalXMachine.g:954:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) )
            {
            // InternalXMachine.g:954:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) )
            // InternalXMachine.g:955:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getXEventAccess().getUnorderedGroup_2());
            				
            // InternalXMachine.g:958:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* )
            // InternalXMachine.g:959:6: ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )*
            {
            // InternalXMachine.g:959:6: ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( LA24_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 >= 40 && LA24_0 <= 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalXMachine.g:960:4: ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) )
            	    {
            	    // InternalXMachine.g:960:4: ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) )
            	    // InternalXMachine.g:961:5: {...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleXEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalXMachine.g:961:103: ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) )
            	    // InternalXMachine.g:962:6: ({...}? => ( (lv_extended_3_0= 'extended' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalXMachine.g:965:9: ({...}? => ( (lv_extended_3_0= 'extended' ) ) )
            	    // InternalXMachine.g:965:10: {...}? => ( (lv_extended_3_0= 'extended' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEvent", "true");
            	    }
            	    // InternalXMachine.g:965:19: ( (lv_extended_3_0= 'extended' ) )
            	    // InternalXMachine.g:965:20: (lv_extended_3_0= 'extended' )
            	    {
            	    // InternalXMachine.g:965:20: (lv_extended_3_0= 'extended' )
            	    // InternalXMachine.g:966:10: lv_extended_3_0= 'extended'
            	    {
            	    lv_extended_3_0=(Token)match(input,30,FOLLOW_26); 

            	    										newLeafNode(lv_extended_3_0, grammarAccess.getXEventAccess().getExtendedExtendedKeyword_2_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getXEventRule());
            	    										}
            	    										setWithLastConsumed(current, "extended", true, "extended");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getXEventAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXMachine.g:983:4: ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) )
            	    {
            	    // InternalXMachine.g:983:4: ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) )
            	    // InternalXMachine.g:984:5: {...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleXEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalXMachine.g:984:103: ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) )
            	    // InternalXMachine.g:985:6: ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalXMachine.g:988:9: ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) )
            	    // InternalXMachine.g:988:10: {...}? => ( (lv_convergence_4_0= ruleXConvergence ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEvent", "true");
            	    }
            	    // InternalXMachine.g:988:19: ( (lv_convergence_4_0= ruleXConvergence ) )
            	    // InternalXMachine.g:988:20: (lv_convergence_4_0= ruleXConvergence )
            	    {
            	    // InternalXMachine.g:988:20: (lv_convergence_4_0= ruleXConvergence )
            	    // InternalXMachine.g:989:10: lv_convergence_4_0= ruleXConvergence
            	    {

            	    										newCompositeNode(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_26);
            	    lv_convergence_4_0=ruleXConvergence();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getXEventRule());
            	    										}
            	    										set(
            	    											current,
            	    											"convergence",
            	    											lv_convergence_4_0,
            	    											"ac.soton.xeventb.xmachine.XMachine.XConvergence");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getXEventAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getXEventAccess().getUnorderedGroup_2());
            				

            }

            // InternalXMachine.g:1018:3: ( (lv_extensions_5_0= rulegroupOrEvent ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=36 && LA25_0<=37)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalXMachine.g:1019:4: (lv_extensions_5_0= rulegroupOrEvent )
            	    {
            	    // InternalXMachine.g:1019:4: (lv_extensions_5_0= rulegroupOrEvent )
            	    // InternalXMachine.g:1020:5: lv_extensions_5_0= rulegroupOrEvent
            	    {

            	    					newCompositeNode(grammarAccess.getXEventAccess().getExtensionsGroupOrEventParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_extensions_5_0=rulegroupOrEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXEventRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_5_0,
            	    						"ac.soton.xeventb.xmachine.XMachine.groupOrEvent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalXMachine.g:1037:3: (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXMachine.g:1038:4: otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getXEventAccess().getRefinesKeyword_4_0());
                    			
                    // InternalXMachine.g:1042:4: ( (otherlv_7= RULE_ID ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_ID) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalXMachine.g:1043:5: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:1043:5: (otherlv_7= RULE_ID )
                    	    // InternalXMachine.g:1044:6: otherlv_7= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getXEventRule());
                    	    						}
                    	    					
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_28); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_1_0());
                    	    					

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

            // InternalXMachine.g:1056:3: ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )?
            int alt42=4;
            switch ( input.LA(1) ) {
                case 29:
                case 31:
                    {
                    alt42=1;
                    }
                    break;
                case 32:
                    {
                    alt42=2;
                    }
                    break;
                case 34:
                    {
                    alt42=3;
                    }
                    break;
            }

            switch (alt42) {
                case 1 :
                    // InternalXMachine.g:1057:4: ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ )
                    {
                    // InternalXMachine.g:1057:4: ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ )
                    // InternalXMachine.g:1058:5: (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+
                    {
                    // InternalXMachine.g:1058:5: (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==31) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalXMachine.g:1059:6: otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+
                            {
                            otherlv_8=(Token)match(input,31,FOLLOW_9); 

                            						newLeafNode(otherlv_8, grammarAccess.getXEventAccess().getWithKeyword_5_0_0_0());
                            					
                            // InternalXMachine.g:1063:6: ( (lv_witnesses_9_0= ruleXWitness ) )+
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
                            	    // InternalXMachine.g:1064:7: (lv_witnesses_9_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1064:7: (lv_witnesses_9_0= ruleXWitness )
                            	    // InternalXMachine.g:1065:8: lv_witnesses_9_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_0_0_1_0());
                            	    							
                            	    pushFollow(FOLLOW_29);
                            	    lv_witnesses_9_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_9_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XWitness");
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

                    otherlv_10=(Token)match(input,29,FOLLOW_9); 

                    					newLeafNode(otherlv_10, grammarAccess.getXEventAccess().getBeginKeyword_5_0_1());
                    				
                    // InternalXMachine.g:1087:5: ( (lv_actions_11_0= ruleXAction ) )+
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
                    	    // InternalXMachine.g:1088:6: (lv_actions_11_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:1088:6: (lv_actions_11_0= ruleXAction )
                    	    // InternalXMachine.g:1089:7: lv_actions_11_0= ruleXAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_0_2_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_actions_11_0=ruleXAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_11_0,
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


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1108:4: (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:1108:4: (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:1109:5: otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )?
                    {
                    otherlv_12=(Token)match(input,32,FOLLOW_9); 

                    					newLeafNode(otherlv_12, grammarAccess.getXEventAccess().getWhenKeyword_5_1_0());
                    				
                    // InternalXMachine.g:1113:5: ( (lv_guards_13_0= ruleXGuard ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_XLABEL) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalXMachine.g:1114:6: (lv_guards_13_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1114:6: (lv_guards_13_0= ruleXGuard )
                    	    // InternalXMachine.g:1115:7: lv_guards_13_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_guards_13_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_13_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XGuard");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    // InternalXMachine.g:1132:5: (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==31) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalXMachine.g:1133:6: otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+
                            {
                            otherlv_14=(Token)match(input,31,FOLLOW_9); 

                            						newLeafNode(otherlv_14, grammarAccess.getXEventAccess().getWithKeyword_5_1_2_0());
                            					
                            // InternalXMachine.g:1137:6: ( (lv_witnesses_15_0= ruleXWitness ) )+
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
                            	    // InternalXMachine.g:1138:7: (lv_witnesses_15_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1138:7: (lv_witnesses_15_0= ruleXWitness )
                            	    // InternalXMachine.g:1139:8: lv_witnesses_15_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_1_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_32);
                            	    lv_witnesses_15_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_15_0,
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

                    // InternalXMachine.g:1157:5: (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==33) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalXMachine.g:1158:6: otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+
                            {
                            otherlv_16=(Token)match(input,33,FOLLOW_9); 

                            						newLeafNode(otherlv_16, grammarAccess.getXEventAccess().getThenKeyword_5_1_3_0());
                            					
                            // InternalXMachine.g:1162:6: ( (lv_actions_17_0= ruleXAction ) )+
                            int cnt34=0;
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==RULE_XLABEL) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // InternalXMachine.g:1163:7: (lv_actions_17_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:1163:7: (lv_actions_17_0= ruleXAction )
                            	    // InternalXMachine.g:1164:8: lv_actions_17_0= ruleXAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_1_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_30);
                            	    lv_actions_17_0=ruleXAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_17_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XAction");
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


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1184:4: (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:1184:4: (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:1185:5: otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )?
                    {
                    otherlv_18=(Token)match(input,34,FOLLOW_4); 

                    					newLeafNode(otherlv_18, grammarAccess.getXEventAccess().getAnyKeyword_5_2_0());
                    				
                    // InternalXMachine.g:1189:5: ( (lv_parameters_19_0= ruleXParameter ) )+
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
                    	    // InternalXMachine.g:1190:6: (lv_parameters_19_0= ruleXParameter )
                    	    {
                    	    // InternalXMachine.g:1190:6: (lv_parameters_19_0= ruleXParameter )
                    	    // InternalXMachine.g:1191:7: lv_parameters_19_0= ruleXParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    lv_parameters_19_0=ruleXParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_19_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XParameter");
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

                    otherlv_20=(Token)match(input,35,FOLLOW_9); 

                    					newLeafNode(otherlv_20, grammarAccess.getXEventAccess().getWhereKeyword_5_2_2());
                    				
                    // InternalXMachine.g:1212:5: ( (lv_guards_21_0= ruleXGuard ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_XLABEL) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalXMachine.g:1213:6: (lv_guards_21_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1213:6: (lv_guards_21_0= ruleXGuard )
                    	    // InternalXMachine.g:1214:7: lv_guards_21_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_5_2_3_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_guards_21_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_21_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XGuard");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);

                    // InternalXMachine.g:1231:5: (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==31) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalXMachine.g:1232:6: otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+
                            {
                            otherlv_22=(Token)match(input,31,FOLLOW_9); 

                            						newLeafNode(otherlv_22, grammarAccess.getXEventAccess().getWithKeyword_5_2_4_0());
                            					
                            // InternalXMachine.g:1236:6: ( (lv_witnesses_23_0= ruleXWitness ) )+
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
                            	    // InternalXMachine.g:1237:7: (lv_witnesses_23_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1237:7: (lv_witnesses_23_0= ruleXWitness )
                            	    // InternalXMachine.g:1238:8: lv_witnesses_23_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_2_4_1_0());
                            	    							
                            	    pushFollow(FOLLOW_32);
                            	    lv_witnesses_23_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_23_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XWitness");
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

                    // InternalXMachine.g:1256:5: (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==33) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalXMachine.g:1257:6: otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+
                            {
                            otherlv_24=(Token)match(input,33,FOLLOW_9); 

                            						newLeafNode(otherlv_24, grammarAccess.getXEventAccess().getThenKeyword_5_2_5_0());
                            					
                            // InternalXMachine.g:1261:6: ( (lv_actions_25_0= ruleXAction ) )+
                            int cnt40=0;
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==RULE_XLABEL) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // InternalXMachine.g:1262:7: (lv_actions_25_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:1262:7: (lv_actions_25_0= ruleXAction )
                            	    // InternalXMachine.g:1263:8: lv_actions_25_0= ruleXAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_2_5_1_0());
                            	    							
                            	    pushFollow(FOLLOW_30);
                            	    lv_actions_25_0=ruleXAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_25_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XAction");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt40 >= 1 ) break loop40;
                                        EarlyExitException eee =
                                            new EarlyExitException(40, input);
                                        throw eee;
                                }
                                cnt40++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getXEventAccess().getEndKeyword_6());
            		

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
    // InternalXMachine.g:1291:1: entryRuleEventSync returns [EObject current=null] : iv_ruleEventSync= ruleEventSync EOF ;
    public final EObject entryRuleEventSync() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSync = null;


        try {
            // InternalXMachine.g:1291:50: (iv_ruleEventSync= ruleEventSync EOF )
            // InternalXMachine.g:1292:2: iv_ruleEventSync= ruleEventSync EOF
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
    // InternalXMachine.g:1298:1: ruleEventSync returns [EObject current=null] : ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleEventSync() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefix_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXMachine.g:1304:2: ( ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalXMachine.g:1305:2: ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalXMachine.g:1305:2: ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            // InternalXMachine.g:1306:3: () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalXMachine.g:1306:3: ()
            // InternalXMachine.g:1307:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1313:3: (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            // InternalXMachine.g:1314:4: otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0());
            			
            // InternalXMachine.g:1318:4: ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==23) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalXMachine.g:1319:5: ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.'
                    {
                    // InternalXMachine.g:1319:5: ( (lv_prefix_2_0= RULE_ID ) )
                    // InternalXMachine.g:1320:6: (lv_prefix_2_0= RULE_ID )
                    {
                    // InternalXMachine.g:1320:6: (lv_prefix_2_0= RULE_ID )
                    // InternalXMachine.g:1321:7: lv_prefix_2_0= RULE_ID
                    {
                    lv_prefix_2_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    					newLeafNode(otherlv_3, grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1());
                    				

                    }
                    break;

            }

            // InternalXMachine.g:1342:4: ( (otherlv_4= RULE_ID ) )
            // InternalXMachine.g:1343:5: (otherlv_4= RULE_ID )
            {
            // InternalXMachine.g:1343:5: (otherlv_4= RULE_ID )
            // InternalXMachine.g:1344:6: otherlv_4= RULE_ID
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
    // InternalXMachine.g:1360:1: entryRuleGroupSync returns [EObject current=null] : iv_ruleGroupSync= ruleGroupSync EOF ;
    public final EObject entryRuleGroupSync() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupSync = null;


        try {
            // InternalXMachine.g:1360:50: (iv_ruleGroupSync= ruleGroupSync EOF )
            // InternalXMachine.g:1361:2: iv_ruleGroupSync= ruleGroupSync EOF
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
    // InternalXMachine.g:1367:1: ruleGroupSync returns [EObject current=null] : ( () (otherlv_1= 'synchronisesGroup' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleGroupSync() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefix_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXMachine.g:1373:2: ( ( () (otherlv_1= 'synchronisesGroup' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalXMachine.g:1374:2: ( () (otherlv_1= 'synchronisesGroup' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalXMachine.g:1374:2: ( () (otherlv_1= 'synchronisesGroup' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            // InternalXMachine.g:1375:3: () (otherlv_1= 'synchronisesGroup' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalXMachine.g:1375:3: ()
            // InternalXMachine.g:1376:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupSyncAccess().getEventSynchronisationAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1382:3: (otherlv_1= 'synchronisesGroup' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            // InternalXMachine.g:1383:4: otherlv_1= 'synchronisesGroup' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,37,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getGroupSyncAccess().getSynchronisesGroupKeyword_1_0());
            			
            // InternalXMachine.g:1387:4: ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==23) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalXMachine.g:1388:5: ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.'
                    {
                    // InternalXMachine.g:1388:5: ( (lv_prefix_2_0= RULE_ID ) )
                    // InternalXMachine.g:1389:6: (lv_prefix_2_0= RULE_ID )
                    {
                    // InternalXMachine.g:1389:6: (lv_prefix_2_0= RULE_ID )
                    // InternalXMachine.g:1390:7: lv_prefix_2_0= RULE_ID
                    {
                    lv_prefix_2_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    					newLeafNode(otherlv_3, grammarAccess.getGroupSyncAccess().getFullStopKeyword_1_1_1());
                    				

                    }
                    break;

            }

            // InternalXMachine.g:1411:4: ( (otherlv_4= RULE_ID ) )
            // InternalXMachine.g:1412:5: (otherlv_4= RULE_ID )
            {
            // InternalXMachine.g:1412:5: (otherlv_4= RULE_ID )
            // InternalXMachine.g:1413:6: otherlv_4= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGroupSyncRule());
            						}
            					
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            						newLeafNode(otherlv_4, grammarAccess.getGroupSyncAccess().getSynchronisedCasesEventCasesCrossReference_1_2_0());
            					

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
    // $ANTLR end "ruleGroupSync"


    // $ANTLR start "entryRulegroupOrEvent"
    // InternalXMachine.g:1429:1: entryRulegroupOrEvent returns [EObject current=null] : iv_rulegroupOrEvent= rulegroupOrEvent EOF ;
    public final EObject entryRulegroupOrEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegroupOrEvent = null;


        try {
            // InternalXMachine.g:1429:53: (iv_rulegroupOrEvent= rulegroupOrEvent EOF )
            // InternalXMachine.g:1430:2: iv_rulegroupOrEvent= rulegroupOrEvent EOF
            {
             newCompositeNode(grammarAccess.getGroupOrEventRule()); 
            pushFollow(FOLLOW_1);
            iv_rulegroupOrEvent=rulegroupOrEvent();

            state._fsp--;

             current =iv_rulegroupOrEvent; 
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
    // $ANTLR end "entryRulegroupOrEvent"


    // $ANTLR start "rulegroupOrEvent"
    // InternalXMachine.g:1436:1: rulegroupOrEvent returns [EObject current=null] : (this_GroupSync_0= ruleGroupSync | this_EventSync_1= ruleEventSync ) ;
    public final EObject rulegroupOrEvent() throws RecognitionException {
        EObject current = null;

        EObject this_GroupSync_0 = null;

        EObject this_EventSync_1 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1442:2: ( (this_GroupSync_0= ruleGroupSync | this_EventSync_1= ruleEventSync ) )
            // InternalXMachine.g:1443:2: (this_GroupSync_0= ruleGroupSync | this_EventSync_1= ruleEventSync )
            {
            // InternalXMachine.g:1443:2: (this_GroupSync_0= ruleGroupSync | this_EventSync_1= ruleEventSync )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==37) ) {
                alt45=1;
            }
            else if ( (LA45_0==36) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:1444:3: this_GroupSync_0= ruleGroupSync
                    {

                    			newCompositeNode(grammarAccess.getGroupOrEventAccess().getGroupSyncParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GroupSync_0=ruleGroupSync();

                    state._fsp--;


                    			current = this_GroupSync_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1453:3: this_EventSync_1= ruleEventSync
                    {

                    			newCompositeNode(grammarAccess.getGroupOrEventAccess().getEventSyncParserRuleCall_1());
                    		
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
    // $ANTLR end "rulegroupOrEvent"


    // $ANTLR start "entryRuleXParameter"
    // InternalXMachine.g:1465:1: entryRuleXParameter returns [EObject current=null] : iv_ruleXParameter= ruleXParameter EOF ;
    public final EObject entryRuleXParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameter = null;


        try {
            // InternalXMachine.g:1465:51: (iv_ruleXParameter= ruleXParameter EOF )
            // InternalXMachine.g:1466:2: iv_ruleXParameter= ruleXParameter EOF
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
    // InternalXMachine.g:1472:1: ruleXParameter returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1478:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:1479:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:1479:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:1480:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:1480:3: ()
            // InternalXMachine.g:1481:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1487:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:1488:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:1488:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:1489:5: lv_name_1_0= RULE_ID
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
    // InternalXMachine.g:1509:1: entryRuleXGuard returns [EObject current=null] : iv_ruleXGuard= ruleXGuard EOF ;
    public final EObject entryRuleXGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuard = null;


        try {
            // InternalXMachine.g:1509:47: (iv_ruleXGuard= ruleXGuard EOF )
            // InternalXMachine.g:1510:2: iv_ruleXGuard= ruleXGuard EOF
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
    // InternalXMachine.g:1516:1: ruleXGuard returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleXGuard() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_theorem_3_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1522:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalXMachine.g:1523:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:1523:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalXMachine.g:1524:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalXMachine.g:1524:3: ()
            // InternalXMachine.g:1525:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGuardAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1531:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:1532:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1532:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:1533:5: lv_name_1_0= RULE_XLABEL
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

            // InternalXMachine.g:1549:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalXMachine.g:1550:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:1550:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalXMachine.g:1551:5: lv_predicate_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXGuardAccess().getPredicateXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalXMachine.g:1568:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:1569:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:1569:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:1570:5: lv_theorem_3_0= 'theorem'
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
    // InternalXMachine.g:1586:1: entryRuleXWitness returns [EObject current=null] : iv_ruleXWitness= ruleXWitness EOF ;
    public final EObject entryRuleXWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitness = null;


        try {
            // InternalXMachine.g:1586:49: (iv_ruleXWitness= ruleXWitness EOF )
            // InternalXMachine.g:1587:2: iv_ruleXWitness= ruleXWitness EOF
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
    // InternalXMachine.g:1593:1: ruleXWitness returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ) ;
    public final EObject ruleXWitness() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1599:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ) )
            // InternalXMachine.g:1600:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) )
            {
            // InternalXMachine.g:1600:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) )
            // InternalXMachine.g:1601:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) )
            {
            // InternalXMachine.g:1601:3: ()
            // InternalXMachine.g:1602:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXWitnessAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1608:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:1609:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1609:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:1610:5: lv_name_1_0= RULE_XLABEL
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

            // InternalXMachine.g:1626:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalXMachine.g:1627:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:1627:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalXMachine.g:1628:5: lv_predicate_2_0= ruleXPredicate
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
    // InternalXMachine.g:1649:1: entryRuleXAction returns [EObject current=null] : iv_ruleXAction= ruleXAction EOF ;
    public final EObject entryRuleXAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAction = null;


        try {
            // InternalXMachine.g:1649:48: (iv_ruleXAction= ruleXAction EOF )
            // InternalXMachine.g:1650:2: iv_ruleXAction= ruleXAction EOF
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
    // InternalXMachine.g:1656:1: ruleXAction returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) ) ;
    public final EObject ruleXAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_action_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1662:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) ) )
            // InternalXMachine.g:1663:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) )
            {
            // InternalXMachine.g:1663:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) )
            // InternalXMachine.g:1664:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) )
            {
            // InternalXMachine.g:1664:3: ()
            // InternalXMachine.g:1665:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1671:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:1672:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1672:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:1673:5: lv_name_1_0= RULE_XLABEL
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

            // InternalXMachine.g:1689:3: ( (lv_action_2_0= ruleXPredicate ) )
            // InternalXMachine.g:1690:4: (lv_action_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:1690:4: (lv_action_2_0= ruleXPredicate )
            // InternalXMachine.g:1691:5: lv_action_2_0= ruleXPredicate
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
    // InternalXMachine.g:1712:1: entryRuleXPredicate returns [String current=null] : iv_ruleXPredicate= ruleXPredicate EOF ;
    public final String entryRuleXPredicate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXPredicate = null;


        try {
            // InternalXMachine.g:1712:50: (iv_ruleXPredicate= ruleXPredicate EOF )
            // InternalXMachine.g:1713:2: iv_ruleXPredicate= ruleXPredicate EOF
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
    // InternalXMachine.g:1719:1: ruleXPredicate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleXPredicate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1725:2: (this_STRING_0= RULE_STRING )
            // InternalXMachine.g:1726:2: this_STRING_0= RULE_STRING
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
    // InternalXMachine.g:1736:1: ruleXDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleXDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXMachine.g:1742:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // InternalXMachine.g:1743:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // InternalXMachine.g:1743:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==38) ) {
                alt47=1;
            }
            else if ( (LA47_0==39) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalXMachine.g:1744:3: (enumLiteral_0= 'in' )
                    {
                    // InternalXMachine.g:1744:3: (enumLiteral_0= 'in' )
                    // InternalXMachine.g:1745:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getXDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getXDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1752:3: (enumLiteral_1= 'out' )
                    {
                    // InternalXMachine.g:1752:3: (enumLiteral_1= 'out' )
                    // InternalXMachine.g:1753:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

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
    // InternalXMachine.g:1763:1: ruleXConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleXConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:1769:2: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // InternalXMachine.g:1770:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // InternalXMachine.g:1770:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt48=1;
                }
                break;
            case 41:
                {
                alt48=2;
                }
                break;
            case 42:
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
                    // InternalXMachine.g:1771:3: (enumLiteral_0= 'ordinary' )
                    {
                    // InternalXMachine.g:1771:3: (enumLiteral_0= 'ordinary' )
                    // InternalXMachine.g:1772:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1779:3: (enumLiteral_1= 'convergent' )
                    {
                    // InternalXMachine.g:1779:3: (enumLiteral_1= 'convergent' )
                    // InternalXMachine.g:1780:4: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1787:3: (enumLiteral_2= 'anticipated' )
                    {
                    // InternalXMachine.g:1787:3: (enumLiteral_2= 'anticipated' )
                    // InternalXMachine.g:1788:4: enumLiteral_2= 'anticipated'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000021FE000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000020FC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000020F8040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000020F0040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000020E0080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000020C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002080040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000735E0082000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000035A0082000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000005A0080040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000280080080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200080080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000800000L});

}
