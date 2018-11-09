package ch07_DI.toy;

import ch07_DI.battery.Battery;
import ch07_DI.battery.NormalBattery;

public class ElectronicCarToy {
	
	private Battery battery;
	
	public ElectronicCarToy() {
		battery = new NormalBattery();
	}
	
}