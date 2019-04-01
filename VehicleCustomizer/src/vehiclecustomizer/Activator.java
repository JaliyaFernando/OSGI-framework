package vehiclecustomizer;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.customizehandler.CustomizeFactory;
import com.vehiclebodyupgrade.BodyKitHandleInterface;
import com.vehiclebodyupgrade.BodyKitHandleInterfaceImpl;
import com.vehicleexteriorupgrade.ExteriorHandlerInterface;
import com.vehicleinteriorupgrade.InteriorHandlerInter;
import com.vehicleperformanceupgrade.PerformanceHandlerInter;

public class Activator implements BundleActivator {
	String re ="n";
	String upgradeSelection;
	int upgradeType;
	double totalCost = 00.00 ;
	ServiceReference serviceReference;
	ServiceReference custormizeServiceReference;
	
	String BodyDetails;
	String InteriorDetails;
	String ExteriorDetails;
	String PerformanceDetails;
	
	int countBody = 0;
	int countInterior = 0;
	int countExterior = 0;
	int countPerformance = 0;

	public void start(BundleContext context) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("              Welcome to LAMBOGINI Modifires");
		serviceReference = context.getServiceReference(CustomizeFactory.class.getName());
		CustomizeFactory servicePublish = (CustomizeFactory) context.getService(serviceReference);
		String carType = servicePublish.selectCar();
		
		System.out.println(carType);
		
		 System.out.println("\n\nDo you need to upgrade your "+carType+" Body?(Yes : y , No : n) :");
		  upgradeSelection = input.next();
		  
		  if(upgradeSelection.equalsIgnoreCase("y")) { 
			
			  custormizeServiceReference =context.getServiceReference(BodyKitHandleInterface.class.getName()); 
			  BodyKitHandleInterface bodyService = (BodyKitHandleInterface)context.getService(custormizeServiceReference);
			  String result = "y";
	
				  do {
				  bodyService.displyBodyKitDetails();
				  System.out.println("Enter Upgrade Type : "); 
				  upgradeType = input.nextInt();
				  
				  if(upgradeType == 1) {
					  totalCost = totalCost+bodyService.displayUpgradeBodyKit(carType);
					  countBody++;
					  if(countBody < 3) {
					  System.out.print("Do you want to Upgrade Body More?(Yes : y , No : n) :");
					  result = input.next();
					  if(result.equalsIgnoreCase("n")) {
						  break;
					  }
					  }
				  }else if(upgradeType == 2) {
					  countBody++;
					  totalCost = totalCost+bodyService.displayWingUpgrade(carType);
					  if(countBody < 3) {
					  System.out.print("Do you want to Upgrade Body More?(Yes : y , No : n) :");
					  result = input.next();
					  if(result.equalsIgnoreCase("n")) {
						  break;
					  }
					  }
				  }else if(upgradeType == 3) {
					  countBody++;
					  totalCost = totalCost+bodyService.displayExhaustUpgrade(carType);
					  if(countBody < 3) {
					  System.out.print("Do you want to Upgrade Body More?(Yes : y , No : n) :");
					  result = input.next();
					  if(result.equalsIgnoreCase("n")) {
						  break;
					  }
					  }
				  }
				  if(countBody >= 3) {
					  System.out.println("\nYou fully upgraded your "+carType+" body");
					  break;
				  }
			  } while(result.equalsIgnoreCase("y"));
				  BodyDetails= bodyService.getDetails().replaceAll("\t", "");
				  System.out.println("\nYour total cost is : "+totalCost);
				  System.out.println("Details of Interior Upgrades");
				  System.out.println("---------------------------------------------------------------------------------------------------");
				  System.out.println(bodyService.getDetails().replaceAll("\t", "")+"\n");
				  System.out.println("---------------------------------------------------------------------------------------------------");
		  
		  }
		  
		  
		  System.out.print("\n\nDo you need to upgrade your "+carType+" Exterior?(Yes : y , No : n) : ");
		  upgradeSelection = input.next();

		  if(upgradeSelection.equalsIgnoreCase("y")) {
			  custormizeServiceReference =context.getServiceReference(ExteriorHandlerInterface.class.getName()); 
			  ExteriorHandlerInterface exteriorService = (ExteriorHandlerInterface)context.getService(custormizeServiceReference);
			  exteriorService.ExteriorHandlerInterfaceImpl(carType);

			  
			  String result = "y";
				
			  do {
			  exteriorService.selectExterior();
			  System.out.print("Select your Exterior Type :");
			  int exteriorType = input.nextInt();
			  
			  if(exteriorType == 1) {
				
				  String color = exteriorService.getColor();
				  String display = exteriorService.getColorDetails(color);
				  System.out.println(display);
				  
				  System.out.print("Do you want upgrade ?(Yes : y , No : n) :"); 
				  result= input.next(); 
				
				
				  if(result.equalsIgnoreCase("y")) { 
					  countExterior++;
					  exteriorService.setAllDetails(display);
					  totalCost = totalCost + exteriorService.getPaintColorCost(color);
					  exteriorService.updatePaintCount();
			  	  }else {
			  		  System.out.println("Not added");
			  	  }
				  if(countInterior < 4) {
				  System.out.print("Do you want to Upgrade Exterior More?(Yes : y , No : n) :");
				  result = input.next();
				  if(result.equalsIgnoreCase("n")) {
					  break;
				  }
				  }
				 
				  
			  }else if(exteriorType == 2) {

				  String rimType = exteriorService.getRim();
				  String display = exteriorService.getRimDetails(rimType);
				  System.out.println(display);
				  System.out.print("Do you want upgrade ?(Yes : y , No : n) :"); 
				  result= input.next(); 
				
				
				  if(result.equalsIgnoreCase("y")) { 
					  countExterior++;
					  exteriorService.setAllDetails(display);
					  totalCost = totalCost + exteriorService.getRimCost(rimType); 					  
					  exteriorService.updateRimCount();
			  	  }else {
			  		  System.out.println("Not added");
			  	  }
				  if(countInterior < 4) {
				  System.out.print("Do you want to Upgrade Exterior More?(Yes : y , No : n) :");
				  result = input.next();
				  if(result.equalsIgnoreCase("n")) {
					  break;
				  }
				  }
				  
			  }else if(exteriorType == 3) {
				  String brakeAndCaliperType = exteriorService.getBrakeAndCaliper();
				  String display = exteriorService.getBrakeAndCaliperDetails(brakeAndCaliperType);
				  System.out.println(display);
				  System.out.print("Do you want upgrade ?(Yes : y , No : n) :"); 
				  result= input.next(); 
				
				
				  if(result.equalsIgnoreCase("y")) { 
					  countExterior++;
					  exteriorService.setAllDetails(display);
					  totalCost = totalCost + exteriorService.getBrakeAndCaliperCost(brakeAndCaliperType); 
					  exteriorService.updateBrakeCount();
			  	  }else {
			  		  System.out.println("Not added");
			  	  }
				  if(countInterior < 4) {
				  System.out.print("Do you want to Upgrade Exterior More?(Yes : y , No : n) :");
				  result = input.next();
				  if(result.equalsIgnoreCase("n")) {
					  break;
				  }
				  }
			  }else if(exteriorType == 4) {
				  String exhaustTailpipesType = exteriorService.getTailpipes();
				  String display = exteriorService.getTailpipesDetails(carType,exhaustTailpipesType);
				  System.out.println(display);
				  System.out.print("Do you want upgrade ?(Yes : y , No : n) :"); 
				  result= input.next(); 
				
				
				  if(result.equalsIgnoreCase("y")) { 
					  countExterior++;
					  exteriorService.setAllDetails(display);
					  totalCost = totalCost + exteriorService.getTailpipesCost(carType,exhaustTailpipesType);
					  exteriorService.updateExhaustCount();
			  	  }else {
			  		  System.out.println("Not added");
			  	  }
				  if(countInterior < 4) {
				  System.out.print("Do you want to Upgrade Exterior More?(Yes : y , No : n) :");
				  result = input.next();
				  if(result.equalsIgnoreCase("n")) {
					  break;
				  }
				  }
			  }
			  if(countInterior >= 4) {
				  System.out.println("You fully upgraded Exterior of your "+carType);
				  break;
			  }
			  } while(result.equalsIgnoreCase("y"));
			  
			  System.out.println("Your total cost is : "+totalCost);
			  ExteriorDetails = exteriorService.getAllDetails();
			  System.out.println("\nYour total cost is : "+totalCost);
			  System.out.println("Details of Interior Upgrades");
			  System.out.println("---------------------------------------------------------------------------------------------------");
			  System.out.println( exteriorService.getAllDetails());
			  System.out.println("---------------------------------------------------------------------------------------------------");
		  }
		  
		  System.out.print("\n\nDo you need to upgrade your "+carType+" Interior?(Yes : y , No : n) :"); 
		  upgradeSelection = input.next();
		  
		  if(upgradeSelection.equalsIgnoreCase("y")) { 
				
			  custormizeServiceReference =context.getServiceReference(InteriorHandlerInter.class.getName()); 
			  InteriorHandlerInter interiorService = (InteriorHandlerInter)context.getService(custormizeServiceReference);
			  String result = "y";
	
				  do {
					  interiorService.displyInteriorUpgradeDetails();
				  System.out.println("Enter Upgrade Type : "); 
				  upgradeType = input.nextInt();
				  
				  if(upgradeType == 1) {
					  totalCost = totalCost+interiorService.displyMainColorUpgrades(carType);
					  countInterior++;
					  if(countInterior < 6) {
					  System.out.print("Do you want to Upgrade Body More?(Yes : y , No : n) :");
					  result = input.next();
					  if(result.equalsIgnoreCase("n")) {
						  break;
					  }
					  }
				  }else if(upgradeType == 2) {
					  countInterior++;
					  totalCost = totalCost+interiorService.displySecondaryColorUpgrades(carType);
					  if(countInterior < 6) {
					  System.out.print("Do you want to Upgrade Body More?(Yes : y , No : n) :");
					  result = input.next();
					  if(result.equalsIgnoreCase("n")) {
						  break;
					  }
					  }
				  }else if(upgradeType == 3) {
					  countInterior++;
					  totalCost = totalCost+interiorService.displySpecialTrimUpgrades(carType);
					  if(countInterior < 6) {
					  System.out.print("Do you want to Upgrade Body More?(Yes : y , No : n) :");
					  result = input.next();
					  if(result.equalsIgnoreCase("n")) {
						  break;
					  }
					  }
				  }else if(upgradeType == 4) {
					  countInterior++;
					  totalCost = totalCost+interiorService.displyFloormatsUpgrades(carType);
					  if(countInterior < 6) {
					  System.out.print("Do you want to Upgrade Body More?(Yes : y , No : n) :");
					  result = input.next();
					  if(result.equalsIgnoreCase("n")) {
						  break;
					  }
					  }
				  }else if(upgradeType == 5) {
					  countInterior++;
					  totalCost = totalCost+interiorService.displySteeringWheelUpgrades(carType);
					  if(countInterior < 6) {
					  System.out.print("Do you want to Upgrade Body More?(Yes : y , No : n) :");
					  result = input.next();
					  if(result.equalsIgnoreCase("n")) {
						  break;
					  }
					  }
				  }else if(upgradeType == 6) {
					  countInterior++;
					  totalCost = totalCost+interiorService.displySeatsUpgrades(carType);
					  if(countInterior < 6) {
					  System.out.print("Do you want to Upgrade Body More?(Yes : y , No : n) :");
					  result = input.next();
					  if(result.equalsIgnoreCase("n")) {
						  break;
					  }
					  }
				  }
				  if(countInterior >= 6) {
					  System.out.println("You fully upgraded Interior of your "+carType);
					  break;
				  }
			  } while(result.equalsIgnoreCase("y"));
				  InteriorDetails = interiorService.getDetails().replaceAll("\t", "");
				  System.out.println("\nYour total cost is : "+totalCost);
				  System.out.println("Details of Interior Upgrades");
				  System.out.println("---------------------------------------------------------------------------------------------------");
				  System.out.println(interiorService.getDetails().replaceAll("\t", "")+"\n");
				  System.out.println("---------------------------------------------------------------------------------------------------");
		  }
		  
		  
		  System.out.print("\n\nDo you need to upgrade your "+carType+" Performance?(Yes : y , No : n) :"); 
		  upgradeSelection = input.next();
		 
		  if(upgradeSelection.equalsIgnoreCase("y")) { 
				
			  custormizeServiceReference =context.getServiceReference(PerformanceHandlerInter.class.getName()); 
			  PerformanceHandlerInter performanceService = (PerformanceHandlerInter)context.getService(custormizeServiceReference);
			  String result = "y";
	
				  do {
					  performanceService.displyPerformanceUpgradeDetails();
				  System.out.println("Enter Upgrade Type : "); 
				  upgradeType = input.nextInt();
				  
				  if(upgradeType == 1) {
					  totalCost = totalCost+performanceService.displyBrakeUpgrades(carType);
					  countPerformance++;
					  if(countPerformance < 5) {
					  System.out.print("Do you want to Upgrade Body More?(Yes : y , No : n) :");
					  result = input.next();
					  if(result.equalsIgnoreCase("n")) {
						  break;
					  }
					  }
				  }else if(upgradeType == 2) {
					  countPerformance++;
					  totalCost = totalCost+performanceService.displyExhaustUpgrades(carType);
					  if(countPerformance < 5) {
					  System.out.print("Do you want to Upgrade Body More?(Yes : y , No : n) :");
					  result = input.next();
					  if(result.equalsIgnoreCase("n")) {
						  break;
					  }
					  }
				  }else if(upgradeType == 3) {
					  countPerformance++;
					  totalCost = totalCost+performanceService.displySuspensionUpgrades(carType);
					  if(countPerformance < 5) {
					  System.out.print("Do you want to Upgrade Body More?(Yes : y , No : n) :");
					  result = input.next();
					  if(result.equalsIgnoreCase("n")) {
						  break;
					  }
					  }
				  }else if(upgradeType == 4) {
					  countPerformance++;
					  totalCost = totalCost+performanceService.displyIntakeUpgrades(carType);
					  if(countPerformance < 5) {
					  System.out.print("Do you want to Upgrade Body More?(Yes : y , No : n) :");
					  result = input.next();
					  if(result.equalsIgnoreCase("n")) {
						  break;
					  }
					  }
				  }else if(upgradeType == 5) {
					  countPerformance++;
					  totalCost = totalCost+performanceService.displyFuelInjectorsUpgrades(carType);
					  if(countPerformance < 5) {
					  System.out.print("Do you want to Upgrade Body More?(Yes : y , No : n) :");
					  result = input.next();
					  if(result.equalsIgnoreCase("n")) {
						  break;
					  }
					  }
				  }
				  if(countPerformance >= 5) {
					  System.out.println("You fully upgraded Performance of your "+carType);
					  break;
				  }
			  } while(result.equalsIgnoreCase("y"));
				  PerformanceDetails=performanceService.getDetails().replaceAll("\t", "");
				  System.out.println("\nYour total cost is : "+totalCost);
				  System.out.println("Details of Interior Upgrades");
				  System.out.println("---------------------------------------------------------------------------------------------------");
				  System.out.println(performanceService.getDetails().replaceAll("\t", "")+"\n");
				  System.out.println("---------------------------------------------------------------------------------------------------");
		  }
		  
		  
		  System.out.println("\n\n---------------------------------------------------------------------------------------------------------");
		  System.out.println("                                      ***** Lambo Customizer *****");
		  System.out.println("                                        Details of the Upgrades");
		  System.out.println("     -----------------------------------------------------------------------------------------------");
		  System.out.println("                                        ****Body Upgrades****");
		  if(BodyDetails== null) {
			  System.out.println("                                   You have not upgrade the Body ");
		  }
		  else {
			  System.out.println(BodyDetails);
		  }
		  System.out.println("     -----------------------------------------------------------------------------------------------");
		  System.out.println("                                      ****Interior Upgrades ****");
		  if(InteriorDetails == null) {
			  System.out.println("                                   You have not upgrade the Interior ");
		  }
		  else {
			  System.out.println(InteriorDetails);
		  }
		  System.out.println("     -----------------------------------------------------------------------------------------------");
		  System.out.println("                                      ****Exterior Upgrades****");
		  if(ExteriorDetails == null) {
			  System.out.println("                                   You have not upgrade the Exterior ");
		  }
		  else {
			  System.out.println(ExteriorDetails);
		  }
		  System.out.println("     -----------------------------------------------------------------------------------------------");
		  System.out.println("                                     ****Performance Upgrades****");
		  if(PerformanceDetails == null) {
			  System.out.println("                                   You have not upgrade the Performance ");
		  }
		  else {
			  System.out.println(PerformanceDetails);
		  }
		  System.out.println("     -----------------------------------------------------------------------------------------------");
		  System.out.println("                                      Final Cost : " +totalCost);
		  System.out.println("---------------------------------------------------------------------------------------------------------");
		  System.out.println("                                            Thank you!");
		  
		  System.out.print("\n\nPlease confirm the details of the upgrades (Yes: y, No: n):");
		  re = input.next(); 
		  if(re.equalsIgnoreCase("y") ) {
			  System.out.println("Thanks for using our services");
		  }else {
			  System.out.println("Thanks for using our services");
		  }
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Good bye !!!");
		context.ungetService(serviceReference);
	}

}
