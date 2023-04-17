package org.stjohn.factorydesignpattern;
/**
 * This Super type can be implemented by many classes
 * This may be abstract class as well
 */
public interface Computer {
	public abstract String ram();
	public abstract String hdd();
	public abstract String cpu();
	
	public boolean isGraphicsEnabled();
	public boolean isBluetoothEnabled();
	
	
	
}
