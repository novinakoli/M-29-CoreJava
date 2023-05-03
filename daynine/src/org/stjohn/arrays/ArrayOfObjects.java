package org.stjohn.arrays;

public class ArrayOfObjects {

	public static void main(String[] args) {
		Customer[] arr = new Customer[2]; //array of objects
		
		arr[0] = new Customer(123, "Novina");
		arr[1] = new Customer(456, "Vaishnavi");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getId()+" "+arr[i].getName());
		}
		

	}

}
