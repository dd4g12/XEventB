/*******************************************************************************
 * Copyright (c) 2017 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.xeventb.xmachine.validation

import org.eclipse.xtext.validation.Check
import org.eventb.emf.core.machine.Machine
import org.eventb.emf.core.machine.MachinePackage
import ac.soton.eventb.emf.inclusion.EventSynchronisation;
import ac.soton.eventb.emf.inclusion.MachineInclusion;
import org.eventb.emf.core.machine.Event
import ac.soton.eventb.emf.core.^extension.coreextension.FormalParameter
import ac.soton.eventb.emf.core.^extension.coreextension.EventCases
import org.eventb.emf.core.machine.Parameter
import java.util.ArrayList

/**
 * <p>
 * XMachine validator, provides custom validation rules for the xtext machine file.
 * </p>
 *
 * @author dana
 * @version 
 * @see
 * @since 
 */
class XMachineValidator extends AbstractXMachineValidator {

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

    // Check the name of the .bumx file is the same as the machine name
	@Check
	def checkMachineName(Machine mch){
		val res = mch.eResource
		val fileName = res.URI.lastSegment.toString
		val mchName= fileName.substring(0, fileName.indexOf('.'))
		if (mchName != mch.name)
			error('Machine name should be the same as the file name', null) //MachinePackage.Literals.MACHINE.eContainingFeature
	}
	
	//check the prefix of the event must be one of the prefixes of the included machine
	// that contains the synchronised event
	@Check
	def checkEventPrefix(EventSynchronisation evt){
	
		if(!evt.prefix.empty){
			val prefix = evt.prefix
			val mchContainer = evt.eContainer.eContainer as Machine
			
			for(ext: mchContainer.extensions){
				if(ext instanceof MachineInclusion ){
					val mchInc = ext as MachineInclusion
					if(mchInc.abstractMachine.events.contains(evt.synchronisedEvent)|| mchInc.abstractMachine.extensions.contains(evt.synchronisedCases)){//used abstract machine as scoping
						if(mchInc.prefixes.contains(prefix)){
							return
						}
							
					}
					
				}
				
			}
          error('Event prefix must be one of the included machine prefixes',null)
		}
		
		 
		 
	}
	
    // Add Prefixing warning if more than one machine is inlcuded
	// the  reason is to avoid event synchronisation problems if machines have the same event name e.g. INITIALISATION
	@Check
	def checkMachinePrefix(Machine mch){
	    val mchExtensions = mch.extensions.filter(MachineInclusion)
	    
		if(mchExtensions.size > 1) {
			for(inc: mchExtensions){
				if (inc.prefixes.empty)
					warning('Prefixing is not defined for ' + inc.abstractMachine.name + '. Possible synchronisation ambiguity. ', null)
			}
		}
		
		
	}
	//check the prefix of the event must be one of the prefixes of the included machine
	// that contains the synchronised event
	@Check
	def checkEventPrefixEmpty(EventSynchronisation evt){
	
		if(evt.prefix.empty){
			val mchContainer = evt.eContainer.eContainer as Machine
			val mchIncExtensions = mchContainer.extensions.filter(MachineInclusion)
			for(ext : mchIncExtensions){
				if(ext.abstractMachine.events.contains(evt.synchronisedEvent)){
					if(ext.prefixes.empty)
						return
					else
						warning('Prefixing should be applied to the synchronised event.', null)
				}
			}
		}
		 
	}
	
	
	//check the group formal parameters must be parameters in all the events group
	@Check
	def checkGroupParameter(EventCases evtGroup){	   
		if(!evtGroup.formalParameters.empty){
			if(evtGroup.events.empty)
				error('Cannot define group parameters without events in the group',null)
			 else{		 		
			 	for(par:evtGroup.formalParameters){
			 		for(evt:evtGroup.events){
			 		
                    var parNames = evt.parameters.iterator.toIterable.filter[it.name == par.name]
                    if(parNames.empty){
                    	error('Event ' + evt.name + ' does not contain parameter ' + par.name, null);
                    	return;
                    }
                    	
			 		
			 		}

			 	}
			 }
		}
	}
	
	
//    //check the group actual parameters are the same length as the group formal parameters
//	@Check
//	def checkGroupActualParameters(EventSynchronisation evt){	   
//    	//if(evt.synchronisedCases.)
//    	if(!evt.actualParameters.empty){
//    		if(evt.actualParameters.length != evt.synchronisedCases.formalParameters.length)
//    			error('Actual Parameters are not the same length as Formal Parameters ', null);
//    	}
//	}

}
