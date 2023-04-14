//program to demonstrate on encapsulation
package org.stjohn.encapsulation;

public class HDFCBank {

	private Long cardNo;
	private String cardType;
	private int CVVNo;
	private int pinNo;
	public Long getCardNo() {
		return cardNo;
	}
	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public int getCVVNo() {
		return CVVNo;
	}
	public void setCVVNo(int cVVNo) {
		CVVNo = cVVNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	
	public void display() {
		System.out.println();
	}
	@Override
	public String toString() {
		return "HDFCBank [cardNo=" + cardNo + ", cardType=" + cardType + ", CVVNo=" + CVVNo + ", pinNo=" + pinNo + "]";
	}
	
	
}
