package com.vehiclebodyupgrade;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class BodyKitActivator implements BundleActivator {

	ServiceRegistration bodyUpgradeServiceRegistration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Start Body Upgrade Service");
	//	ServicePublish publisherService =new ServicePublishImpl();
		BodyKitHandleInterface bodyType = new BodyKitHandleInterfaceImpl();
	

		bodyUpgradeServiceRegistration = context.registerService(BodyKitHandleInterface.class.getName(),bodyType , null);
		
	}

	public void stop(BundleContext context) throws Exception {
		
		bodyUpgradeServiceRegistration.unregister();
		System.out.println("Stoped Body Upgrade Service");
	}



}
