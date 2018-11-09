package ch07_DI.toy;

import ch07_DI.battery.Battery;

public class ElectronicRobotToy {
	
	private Battery battery;
	
	public ElectronicRobotToy() {
		
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	
}