/**
 * generated by Xtext 2.10.0
 */
package ac.soton.xeventb.xcontext.ui.contentassist;

import ac.soton.xeventb.common.RodinSymbolsProposalProvider;
import ac.soton.xeventb.xcontext.ui.contentassist.AbstractXContextProposalProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class XContextProposalProvider extends AbstractXContextProposalProvider {
  @Override
  public void complete_ML_COMMENT(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    RodinSymbolsProposalProvider.completeRodinSymbol(this, context, acceptor);
  }
  
  @Override
  public void complete_SL_COMMENT(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    RodinSymbolsProposalProvider.completeRodinSymbol(this, context, acceptor);
  }
  
  @Override
  public void complete_STRING(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.complete_STRING(model, ruleCall, context, acceptor);
    RodinSymbolsProposalProvider.completeRodinSymbol(this, context, acceptor);
  }
}
