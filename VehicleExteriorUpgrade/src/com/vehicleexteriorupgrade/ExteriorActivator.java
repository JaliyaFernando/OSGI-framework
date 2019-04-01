package com.vehicleexteriorupgrade;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ExteriorActivator implements BundleActivator {

	ServiceRegistration exteriorServiceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Start Exterior Service");
		ExteriorHandlerInterface exteriorHandler = new ExteriorHandlerInterfaceImpl();
		
		exteriorServiceRegistration = context.registerService(ExteriorHandlerInterface.class.getName(),exteriorHandler, null);
	
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stoped Exterior Service");
		exteriorServiceRegistration.unregister();
	}

}
