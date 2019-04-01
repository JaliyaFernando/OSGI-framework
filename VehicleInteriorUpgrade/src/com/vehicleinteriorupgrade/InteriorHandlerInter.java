package com.vehicleinteriorupgrade;

public interface InteriorHandlerInter {

	void displyInteriorUpgradeDetails();
	
	double displyMainColorUpgrades(String type);
	double displySecondaryColorUpgrades(String type);
	double displySpecialTrimUpgrades(String type);
	double displyFloormatsUpgrades(String type);
	double displySteeringWheelUpgrades(String type);
	double displySeatsUpgrades(String type);
	
	public String getDetails();
}
