package org.stjohn.encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		HDFCBank h = new HDFCBank();
		//to set a value
		h.setCardNo(123456789L);
		h.setCardType("Debit Card");
		h.setCVVNo(444);
		h.setPinNo(1234);
		//getters is used to return a value
		System.out.println(h.getCardNo());
		System.out.println(h.getCardType());
		System.out.println(h.getCVVNo());
		System.out.println(h.getPinNo());
		
		
		
	}

}
