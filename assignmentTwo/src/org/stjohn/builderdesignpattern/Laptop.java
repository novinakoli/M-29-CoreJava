package org.stjohn.builderdesignpattern;

public class Laptop {
	
	public String ram;
	public String hdd;
	public String cpu;
	
	public boolean isGraphicsEnabled;
	public boolean isBluetoothEnabled;
	
	public String getRam() {
		return ram;
	}
	public String getHdd() {
		return hdd;
	}
	public String getCpu() {
		return cpu;
	}
	public boolean isGraphicsEnabled() {
		return isGraphicsEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	/*Make private constructor of Laptop(outer class)
	 * so that direct object creation can be prevented
	 * and Object can be created only by calling
	 *LaptopBuilder:build()
	 *Initialize all instance variables of 
	 *Laptop(outer class) from LaptopBuilder
	 */
	private Laptop(LaptopBuilder builder) {
		this.ram = builder.ram;
		this.hdd = builder.hdd;
		this.cpu = builder.cpu;
		
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGraphicsEnabled = builder.isGraphicsEnabled;
		
	}
	/**
	 * Internal class LaptopBuilder, which has
	 * public constructor to initializes required/Mandatory fields
	 * and we have setter methods for all Optional fields
	 * which returns LaptopBuilder itself.
	 * 
	 */
	public static class LaptopBuilder{
		//Required Fields
		public String ram;
		public String hdd;
		public String cpu;
		
		//Optional Fields
		public boolean isGraphicsEnabled;
		public boolean isBluetoothEnabled;
		
		public LaptopBuilder(String ram, String hdd, String cpu) {
			super();
			this.ram = ram;
			this.hdd = hdd;
			this.cpu = cpu;
		}
		
		public LaptopBuilder setGraphicsEnabled(boolean isGraphicsEnabled) {
			this.isGraphicsEnabled = isGraphicsEnabled;
			return this;
		}
		public LaptopBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		/*Only one way to create Laptop Object
		 * by calling LaptopBuilder:build()
		*/
		public Laptop build() {
			return new Laptop(this);		
		}
		
	}
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnabled=" + isGraphicsEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
	
	
}
