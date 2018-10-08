/**
 * generated by Xtext 2.14.0
 */
package ac.soton.xeventb.camillex.generator;

import ac.soton.emf.translator.TranslatorFactory;
import com.google.common.base.Objects;
import java.util.concurrent.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.persistence.EMFRodinDB;
import org.eventb.emf.persistence.SaveResourcesCommand;
import org.rodinp.core.RodinCore;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class EventBComponentGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      final EObject content = resource.getContents().get(0);
      String uriString = resource.getURI().toString();
      uriString = uriString.substring(0, uriString.lastIndexOf("buf"));
      if ((content instanceof Context)) {
        EMFRodinDB emfRodinDB = new EMFRodinDB();
        uriString = (uriString + "buc");
        URI uri = URI.createURI(uriString);
        emfRodinDB.saveResource(uri, ((EventBElement)content));
      } else {
        if ((content instanceof Machine)) {
          boolean _isEmpty = ((Machine)content).getExtensions().isEmpty();
          if (_isEmpty) {
            EMFRodinDB emfRodinDB_1 = new EMFRodinDB();
            uriString = (uriString + "bum");
            URI uri_1 = URI.createURI(uriString);
            emfRodinDB_1.saveResource(uri_1, ((EventBElement)content));
          } else {
            String commandId = "ac.soton.eventb.emf.inclusion.commands.include";
            TranslatorFactory _factory = TranslatorFactory.getFactory();
            TranslatorFactory factory = ((TranslatorFactory) _factory);
            if (((factory != null) && factory.canTranslate(commandId, ((Machine)content).eClass()))) {
              TransactionalEditingDomain editingDomain = null;
              if (((((Machine)content).eResource() != null) && (((Machine)content).eResource().getResourceSet() != null))) {
                editingDomain = TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(
                  ((Machine)content).eResource().getResourceSet());
              }
              if ((editingDomain == null)) {
                editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
              }
              NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
              final IProgressMonitor monitor = ((IProgressMonitor) _nullProgressMonitor);
              factory.translate(editingDomain, content, commandId, monitor);
              final SaveResourcesCommand saveCommand = new SaveResourcesCommand(editingDomain);
              final IWorkspaceRunnable wsRunnable = new IWorkspaceRunnable() {
                @Override
                public void run(final IProgressMonitor monitor) {
                  try {
                    try {
                      saveCommand.execute(monitor, null);
                    } catch (final Throwable _t) {
                      if (_t instanceof ExecutionException) {
                        final ExecutionException e = (ExecutionException)_t;
                        final Status status = new Status(IStatus.ERROR, "ac.soton.xeventb.xmachine", "Nothing", e);
                        throw new CoreException(status);
                      } else {
                        throw Exceptions.sneakyThrow(_t);
                      }
                    }
                  } catch (Throwable _e) {
                    throw Exceptions.sneakyThrow(_e);
                  }
                }
              };
              boolean _canExecute = saveCommand.canExecute();
              if (_canExecute) {
                final Resource[] emptyResource = {};
                RodinCore.run(wsRunnable, 
                  this.getSchedulingRule(editingDomain.getResourceSet().getResources().<Resource>toArray(emptyResource)), monitor);
              }
              monitor.done();
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private ISchedulingRule getSchedulingRule(final Resource[] resources) {
    int _length = resources.length;
    boolean _equals = (_length == 0);
    if (_equals) {
      return null;
    } else {
      int _length_1 = resources.length;
      boolean _equals_1 = (_length_1 == 1);
      if (_equals_1) {
        return WorkspaceSynchronizer.getFile(resources[0]);
      } else {
        final IProject project = this.getProject(resources[0]);
        for (final Resource resource : resources) {
          IProject _project = this.getProject(resource);
          boolean _notEquals = (!Objects.equal(project, _project));
          if (_notEquals) {
            return ResourcesPlugin.getWorkspace().getRoot();
          }
        }
        return project;
      }
    }
  }
  
  private IProject getProject(final Resource resource) {
    final IFile file = WorkspaceSynchronizer.getFile(resource);
    IProject _elvis = null;
    IProject _project = null;
    if (file!=null) {
      _project=file.getProject();
    }
    if (_project != null) {
      _elvis = _project;
    } else {
      _elvis = null;
    }
    return _elvis;
  }
}
