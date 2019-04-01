package com.vehicleperformanceupgrade;

public interface PerformanceHandlerInter {
	
	void displyPerformanceUpgradeDetails();
	
	double displyBrakeUpgrades(String type);
	double displyExhaustUpgrades(String type);
	double displySuspensionUpgrades(String type);
	double displyIntakeUpgrades(String type);
	double displyFuelInjectorsUpgrades(String type);
	
	public String getDetails();
}
