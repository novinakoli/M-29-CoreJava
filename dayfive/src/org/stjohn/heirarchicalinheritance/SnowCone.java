//program to demonstrate on hierarchical inheritance
//child class1
package org.stjohn.heirarchicalinheritance;

public class SnowCone extends Android {
	private int versionName;
	private String modelName;
	//getters and setters
	public int getVersionName() {
		return versionName;
	}
	public void setVersionName(int versionName) {
		this.versionName = versionName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	//constructor
	public SnowCone() {
		System.out.println("Child Class1");
	}
	public SnowCone(int versionName, String modelName) {
		super();
		this.versionName = versionName;
		this.modelName = modelName;
	}
	//tostring
	@Override
	public String toString() {
		return "SnowCone [versionName=" + versionName + ", modelName=" + modelName + ", getBrand()=" + getBrand()
				+ ", getOwnerName()=" + getOwnerName() + "]";
	}
	
	
	
	
	
}
