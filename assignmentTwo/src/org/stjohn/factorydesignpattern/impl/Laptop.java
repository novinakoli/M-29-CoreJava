package org.stjohn.factorydesignpattern.impl;
/**
 * One of implementation of Computer(Super Type)
 * 
 */
import org.stjohn.factorydesignpattern.Computer;

public class Laptop implements Computer {
	public String ram;
	public String hdd;
	public String cpu;
	
	public boolean isGraphicsEnabled;
	public boolean isBluetoothEnabled;
	
	//constructor
	public Laptop(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	@Override
	public String ram() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String hdd() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String cpu() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

	@Override
	public boolean isGraphicsEnabled() {
		// TODO Auto-generated method stub
		return this.isGraphicsEnabled;
	}

	@Override
	public boolean isBluetoothEnabled() {
		// TODO Auto-generated method stub
		return this.isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnabled=" + isGraphicsEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
	
	

}
