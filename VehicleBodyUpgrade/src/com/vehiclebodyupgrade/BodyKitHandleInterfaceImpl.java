package com.vehiclebodyupgrade;

import java.util.Scanner;

public class BodyKitHandleInterfaceImpl implements BodyKitHandleInterface{
	BodyKit  wb = new WideBodyKit(); 
	BodyKit  rb= new RacingBodyKit();
	Body wing = new Wing();
	Body exhaust = new Exhaust();
	
	String Details="";
	
	int bodyKit_count = 0;
	int wing_count = 0;
	int exaust_count = 0;
	public void displyBodyKitDetails() {
		System.out.println("     ***** Select Your Body Kit and Accessories *****     ");
		System.out.println("------------------------------------------");
		
		System.out.print("         Upgrade Type 1 - Upgrade body kit");
		if(bodyKit_count == 1) {System.out.print("       You already upgrade");}
		System.out.print("\n         Upgrade Type 2 - Carbon rear wing");
		if(wing_count == 1) {System.out.print("       You already upgrade");}
		System.out.print("\n         Upgrade Type 3 - Titanium Exaust pipes");
		if(exaust_count == 1) {System.out.print("  You already upgrade");}
		System.out.println("\n------------------------------------------");
	} 
	
	public double displayUpgradeBodyKit(String type) {
		Scanner input = new Scanner(System.in); 
		System.out.println("     ***** Select Your Body Kit *****     ");
		System.out.println("------------------------------------------");
		System.out.println(wb.displayDetails(type));
		System.out.println(rb.displayDetails(type));
		System.out.println("------------------------------------------");
		System.out.print("Enter Upgrade Type : ");
		int a = input.nextInt();
		
		System.out.println("Are you sure, you want to upgrade ?(Yes : y , No : n)");
		String select = input.next();
		if(select.equalsIgnoreCase("y")) {
			bodyKit_count++;
			if(a == 1) {
				Details = Details+"\n"+wb.displayDetails(type);
				return wb.getPrice(type);
			}else if(a == 2){
				Details = Details+"\n"+rb.displayDetails(type);
				return rb.getPrice(type);
			}else {
				return 00.00;
			}
		}else if (select.equalsIgnoreCase("n")) {
			return 00.00;
		}
		
		return 00.00;
		
		
	}
	
	public double displayWingUpgrade(String type) {
		Scanner input = new Scanner(System.in); 
		System.out.println("     ***** Select Your Wing type *****     ");
		System.out.println("------------------------------------------");
		System.out.println(wing.displayDetails(type));
		System.out.println("------------------------------------------");
		System.out.print("Enter Upgrade Type : ");
		int a = input.nextInt();
		
		System.out.println("Are you sure, you want to upgrade ?(Yes : y , No : n)");
		String select = input.next();
		if(select.equalsIgnoreCase("y")) {
			wing_count++;
			if(a == 1) {
				Details = Details+"\n"+wing.displayDetails(type);
				return wing.getPrice(type);
			}else {
				return 00.00;
			}
		}else if (select.equalsIgnoreCase("n")) {
			return 00.00;
		}
		
		return 00.00;
	}
	public double displayExhaustUpgrade(String type) {
		Scanner input = new Scanner(System.in); 
		System.out.println("     ***** Select Your Wing type *****     ");
		System.out.println("------------------------------------------");
		System.out.println(exhaust.displayDetails(type));
		System.out.println("------------------------------------------");
		System.out.print("Enter Upgrade Type : ");
		int a = input.nextInt();
		
		System.out.println("Are you sure, you want to upgrade ?(Yes : y , No : n)");
		String select = input.next();
		if(select.equalsIgnoreCase("y")) {
			exaust_count++;
			if(a == 1) {
				Details = Details+"\n"+exhaust.displayDetails(type);
				return exhaust.getPrice(type);
			}else {
				return 00.00;
			}
		}else if (select.equalsIgnoreCase("n")) {
			return 00.00;
		}
		
		return 00.00;
	}
	
	public void clearVariables() {
		bodyKit_count = 0;
		wing_count = 0;
		exaust_count = 0;
		Details="";
	}
	public String getDetails() {
		return Details;
	}
	
	
}
