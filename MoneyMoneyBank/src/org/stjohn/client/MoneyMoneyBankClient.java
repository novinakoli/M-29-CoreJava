package org.stjohn.client;
//driver class
/*
 * program to demonstrate on MoneyBank application
 */
import org.stjohn.application.MMBankFactory;
import org.stjohn.application.MMCurrentAcc;
import org.stjohn.application.MMSavingAcc;
import org.stjohn.framework.BankFactory;
import org.stjohn.framework.CurrentAcc;
import org.stjohn.framework.SavingAcc;

public class MoneyMoneyBankClient {

	public static void main(String[] args) {
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(7089, "Novina Koli", 9000, true);
		CurrentAcc c = new MMCurrentAcc(8309, "Trupti Koli", 15000, 900);
		
		System.out.println(s);
		System.out.println(c);
		
		System.out.println();
		
		System.out.println("Saving Account");
		
		s.withdraw(200);
		
		
		System.out.println("\nCurrent Account");
		c.withdraw(400);
		

	}

}
