/**
 * Copyright (c) 2018 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.xcontext.formatting2;

import ac.soton.xeventb.xcontext.services.XContextGrammarAccess;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * <p>
 * XContextFormatter contains custom formatting details
 * </p>
 * 
 * @author dd4g12
 */
@SuppressWarnings("all")
public class XContextFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private XContextGrammarAccess _xContextGrammarAccess;
  
  protected void _format(final /* Context */Object context, @Extension final IFormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\nCarrierSet cannot be resolved to a type."
      + "\nConstant cannot be resolved to a type."
      + "\nAxiom cannot be resolved to a type."
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nregionFor cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nregionFor cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nregionFor cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nregionFor cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nallRegionsFor cannot be resolved"
      + "\nruleCallTo cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ngetSets cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nallRegionsFor cannot be resolved"
      + "\nruleCallTo cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ngetConstants cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nallRegionsFor cannot be resolved"
      + "\nruleCallTo cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ngetAxioms cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nallRegionsFor cannot be resolved"
      + "\nruleCallTo cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nsets cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nsets cannot be resolved"
      + "\nhead cannot be resolved"
      + "\nsets cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nregionForEObject cannot be resolved"
      + "\npreviousHiddenRegion cannot be resolved"
      + "\nregionForEObject cannot be resolved"
      + "\nnextHiddenRegion cannot be resolved"
      + "\naxioms cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\naxioms cannot be resolved"
      + "\nhead cannot be resolved"
      + "\naxioms cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nregionForEObject cannot be resolved"
      + "\npreviousHiddenRegion cannot be resolved"
      + "\nregionForEObject cannot be resolved"
      + "\nnextHiddenRegion cannot be resolved"
      + "\nconstants cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nconstants cannot be resolved"
      + "\nhead cannot be resolved"
      + "\nconstants cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nregionForEObject cannot be resolved"
      + "\npreviousHiddenRegion cannot be resolved"
      + "\nregionForEObject cannot be resolved"
      + "\nnextHiddenRegion cannot be resolved");
  }
  
  public void format(final Object context, final IFormattableDocument document) {
    if (context instanceof XtextResource) {
      _format((XtextResource)context, document);
      return;
    } else if (context instanceof EObject) {
      _format((EObject)context, document);
      return;
    } else if (context == null) {
      _format((Void)null, document);
      return;
    } else if (context != null) {
      _format(context, document);
      return;
    } else if (context != null) {
      _format(context, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(context, document).toString());
    }
  }
}
