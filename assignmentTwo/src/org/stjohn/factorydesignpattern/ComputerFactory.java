package org.stjohn.factorydesignpattern;

import org.stjohn.factorydesignpattern.impl.Laptop;
import org.stjohn.factorydesignpattern.impl.PC;
import org.stjohn.factorydesignpattern.impl.Server;

public class ComputerFactory {
/*This Factory class returns Computer instance as per
	 * provided input parameters
 */
	private ComputerFactory() {
		
	}
	
	public static Computer getComputer(ComputerType computerType, String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
	 switch(computerType) {
	 case PC:
		 return new PC(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
	case LAPTOP:
		 return new Laptop(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
	case SERVER:
		 return new Server(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
	default:
		throw new RuntimeException("Invalid computer type");
		
	 }
	 
	}
}
