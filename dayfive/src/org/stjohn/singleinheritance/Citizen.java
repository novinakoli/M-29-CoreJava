//program to demonstrate on single inheritance
package org.stjohn.singleinheritance;

public class Citizen {
	//private data members
	private String name;
	private String aadharNo;
	private String city;
	private long contactNo;
	//default constructor
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parametrized constructor
	public Citizen(String name, String aadharNo, String city, long contactNo) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.city = city;
		this.contactNo = contactNo;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	//when you print object, it calls toString methods
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", city=" + city + ", contactNo=" + contactNo + "]";
	}
	
}
