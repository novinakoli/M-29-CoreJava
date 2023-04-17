package org.stjohn.builderdesignpattern.impl;
/**
 
 *Client program which uses Builder pattern to create Laptop object
 */
import org.stjohn.builderdesignpattern.Laptop;

public class BuilderClientTest {

	public static void main(String[] args) {
		//Create Laptop with Required Fields
	 Laptop l1 = new Laptop.LaptopBuilder("16GB", "240GB", "2.56GHz").build();
	 System.out.println("Laptop1 config: "+l1);
	 
	//Create Laptop with Required and Optional Fields
	 Laptop l2 = new Laptop.LaptopBuilder("16GB", "256GB", "2.56GHz").setBluetoothEnabled(true).setGraphicsEnabled(false).build();
	 System.out.println("Laptop2 config: "+l2);
	 
	//Create Laptop with Required and Optional Fields
	 Laptop l3 = new Laptop.LaptopBuilder("16GB", "1024GB", "2.56GHz").setBluetoothEnabled(false).build();
	 System.out.println("Laptop2 config: "+l3);
	 
	 
	}
	

}
