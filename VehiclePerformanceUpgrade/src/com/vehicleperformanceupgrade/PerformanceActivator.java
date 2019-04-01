package com.vehicleperformanceupgrade;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class PerformanceActivator implements BundleActivator {

ServiceRegistration performanceUpgradeServiceRegistration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Start Body Upgrade Service");
		PerformanceHandlerInter performance = new PerformanceHandlerImpl();
	

		performanceUpgradeServiceRegistration = context.registerService(PerformanceHandlerInter.class.getName(),performance , null);
		
	}

	public void stop(BundleContext context) throws Exception {
		
		performanceUpgradeServiceRegistration.unregister();
		System.out.println("Stoped Body Upgrade Service");
	}


}
