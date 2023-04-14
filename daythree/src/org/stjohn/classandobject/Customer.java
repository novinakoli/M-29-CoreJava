//progrm to demonstrate on class and objects
package org.stjohn.classandobject;

public class Customer {
	//private data members
	private int customerID;
	private String customerName;
	private String city;
	
	//setters and getters
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//default constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized constructor
	public Customer(int customerID, String customerName, String city) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.city = city;
	}
	//tostring method
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", city=" + city + "]";
	}
	
	
	
	
	
}
