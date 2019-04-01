# OSGI-framework

Scenario
For this assignment we have implemented a Car customize service in Eclipse Equinox using OSGI framework where there are two modules which are the producer and consumer. The producer is the one who produces services such allowing consumers to select the various upgrades such exterior, interior, performance and body for a specific vehicle and on the other hand the consumer consumes those services such as selecting whatever is needed (upgrades with upgrade type) and check price with all the selected upgrades. Each module is in control of some classes some of which are fully encapsulated and others that can be accessed for external use. Some exposed services that the producer have are listing available upgrades, listing prices of upgrades and confirming selected upgrades to be used by the consumer. The consumer module can select upgrades, view available upgrades, view prices of upgrades and compare the prices and select the best choice. In this scenario there are 4 producers and 1 consumer where each of them are interpreted as a package. The producers are CustomizeHandler, VehicleBodyUpgrade, VehicleExteriorCustomize, VehicleInteriorCustomize and VehiclePerformanceUpgrade and the consumer is VehicleCustomizer. 


Manifest Implementation
The manifest.mf file contains the manifest headers and their values. The Export-Package header declares the packages that are visible outside the bundle and if not declared, it is only visible outside the bundle. The Import-Package header contains the external dependencies of the bundle that the OSGI Framework uses to resolve the bundle. Specific versions or version ranges for each package can be declared.
Imported Services – VehicleCustomizer(Subscriber)
•	CustomizeHandler (Producer)
•	VehicleBodyUpgrade (Producer)
•	VehicleExteriorUpgrade (Producer)
•	VehicleInteriorUpgrade(Producer)
•	VehiclePerformanceUpgrade (Producer)
Exported Services
•	CustomizeHandler (Producer) – com.customizehandler
•	VehicleBodyUpgrade (Producer) – com.vehiclebodyupgrade
•	VehicleExteriorUpgrade (Producer) – com.vehicleexterioruprade
•	VehicleInteriorUpgrade(Producer) – com.vehicleinteriorupgrade
•	VehiclePerformanceUpgrade (Producer) – com.vehicleperformanceupgrade

Commands
Commands to install and run
•	Create separate run configurations for each bundle (4 producers and one consumer) by selecting Run as -> Run Configurations
•	start the service publishers run by right clicking the manifest file and selecting Run As => OSGi Framework
•	once all are started in the console type ‘lb’. This displays the list of bundles that are currently available.

•	using the find tool (Ctrl +F) in the console find the 4 publishers and subscriber by searching for their bundle name and obtain their corresponding bundle id
•	Type ‘start <bundle id>’ to start a required bundle or ‘stop <bundle id>’ to stop a required bundle. 



