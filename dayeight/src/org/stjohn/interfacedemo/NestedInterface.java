//program to demonstrate on nested interface
package org.stjohn.interfacedemo;

import org.stjohn.interfacedemo.OuterInterface.InnerInterface;

public class NestedInterface implements InnerInterface {
	private String str1;
	private String str2;
	
	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}
	@Override
	public String concatenate() {
		// TODO Auto-generated method stub
		return str1+str2;
	}

	

}
