/*
 * generated by Xtext 2.10.0
 */
package ac.soton.eventb.xtext.machine.ui.tests;

import ac.soton.eventb.xtext.machine.ui.internal.MachineActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class XMachineUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MachineActivator.getInstance().getInjector("ac.soton.eventb.xtext.machine.XMachine");
	}

}
