package com.vehicleinteriorupgrade;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class InteriorActivator implements BundleActivator {

	ServiceRegistration interiorUpgradeServiceRegistration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Start Interior Upgrade Service");
		InteriorHandlerInter interior = new InteriorHandlerImpl();
	

		interiorUpgradeServiceRegistration = context.registerService(InteriorHandlerInter.class.getName(),interior , null);
		
	}

	public void stop(BundleContext context) throws Exception {
		
		interiorUpgradeServiceRegistration.unregister();
		System.out.println("Stoped Interior Upgrade Service");
	}

	
}
