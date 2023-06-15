package org.stjohn.framework;

public abstract class BankFactory {
	
	abstract public SavingAcc getNewSavingAcc(int accNo, String accNm, Float accBal, boolean isSalaried);
	abstract public CurrentAcc getNewCurrentAcc(int accNo, String accNm, Float accBal, float creditLimit);
}
