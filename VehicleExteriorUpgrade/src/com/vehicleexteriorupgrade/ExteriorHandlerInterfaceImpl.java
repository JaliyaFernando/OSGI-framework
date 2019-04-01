package com.vehicleexteriorupgrade;

import java.util.Scanner;

public class ExteriorHandlerInterfaceImpl implements ExteriorHandlerInterface{
	Scanner input = new Scanner(System.in); 
	PaintFactory pf = new PaintFactory();
	RimFactory rf = new RimFactory(); 
	BrakeAndCaliperFactory bkf =new BrakeAndCaliperFactory();
	ExhaustPipes ep =new ExhaustPipes();
	Paint p;
	Rim r;
	BrakeAndCaliper bk;
	String allExteriorDetails ="";
	
	int paint_count = 0;
	int rim_count = 0;
	int brake_count = 0;
	int exhaust_count = 0;


	public void ExteriorHandlerInterfaceImpl(String carType) {
		
		this.p = pf.getPaint(carType);
		this.r = rf.getRim(carType);
		this.bk =bkf.getBrakeAndCaliper(carType);
	}

	public void selectExterior() {

		System.out.println("     ***** Select Your Exterior *****     ");
		System.out.println("------------------------------------------");
		System.out.print("         Type 1 - Paint");
		if(paint_count == 1) {System.out.print("\tYou already upgrade");}
		
		System.out.print("\n         Type 2 - RIMS Model and Colors");
		if(rim_count == 1) {System.out.print("\tYou already upgrade");}

		System.out.print("\n         Type 3 - Brake and Calipers Color");
		if(brake_count == 1) {System.out.print("\tYou already upgrade");}

		System.out.print("\n         Type 4 - Exhaust Tailpipes");
		if(exhaust_count == 1) {System.out.print("\tYou already upgrade");}

		System.out.println("\n------------------------------------------");
		
	}
	
	public void updatePaintCount() {
		paint_count++;
	}	
	public void updateRimCount() {
		rim_count++;
	}
	public void updateBrakeCount() {
		brake_count++;
	}	
	public void updateExhaustCount() {
		exhaust_count++;
	}
	
	public String getColor() {
		return p.getPaintDetails();
	}
	
	public String getColorDetails(String color) {
		return p.getSelectedPaintDetails(p, color);
	}
	
	public double getPaintColorCost(String paintColor) {
		return p.getPaintPrice(paintColor);
	}
	
	
	//******************************************************
	
	public String getRim() {
		return r.getRimDetails();
	}
	public String getRimDetails(String rimType) {
		return r.getSelectedRimDetails(r, rimType);
	}
	
	public double getRimCost(String rimType) {
		return r.getRimtPrice(rimType);
	}
	//******************************************************
	
	public String getBrakeAndCaliper() {
		return bk.getBrakeAndCaliperDetails();
	}
	public String getBrakeAndCaliperDetails(String type) {
		return bk.getSelectedBrakeAndCaliperDetails(bk, type);
	}
	
	public double getBrakeAndCaliperCost(String type) {
		return bk.getBrakeAndCalipertPrice(type);
	}
	
	//******************************************************
	
	public String getTailpipes() {
		return ep.getExhaustPipes();
	}
	public String getTailpipesDetails(String carType,String type) {
		return ep.getSelectedTailpipesDetails(carType,type);
	}
	
	public double getTailpipesCost(String carType,String type) {
		return ep.getBrakeAndCalipertPrice(carType,type);
	}
	
	
	
	public void setAllDetails(String details) {
		allExteriorDetails = allExteriorDetails+"\n"+details; 

	}
	public String getAllDetails() {
		return allExteriorDetails; 

	}
}
