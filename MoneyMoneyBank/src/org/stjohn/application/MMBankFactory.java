package org.stjohn.application;

import org.stjohn.framework.BankFactory;
import org.stjohn.framework.CurrentAcc;
import org.stjohn.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, Float accBal, boolean isSalaried) {
			MMSavingAcc s = new MMSavingAcc(accNo,  accNm,  accBal, isSalaried);
			return s;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, Float accBal, float creditLimit) {
		MMCurrentAcc c = new MMCurrentAcc(accNo,  accNm,  accBal, creditLimit);
		return c;

	}

}
