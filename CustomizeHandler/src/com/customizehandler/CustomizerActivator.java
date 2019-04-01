package com.customizehandler;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class CustomizerActivator implements BundleActivator {

	ServiceRegistration handler;

	public void start(BundleContext context) throws Exception {
		System.out.println("Start Body Upgrade Service");
	//	ServicePublish publisherService =new ServicePublishImpl();
		CustomizeFactory factory = new CustomizeFactoryImpl();
		handler = context.registerService(CustomizeFactory.class.getName(),factory , null);
	
	}

	public void stop(BundleContext context) throws Exception {
		
		handler.unregister();
		System.out.println("Stoped Body Upgrade Service");
	}

}
