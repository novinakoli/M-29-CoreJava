//driver class
package org.stjohn.finalkeyword;

public class FinalExecuter {

	public static void main(String[] args) {
		FinalVariable f = new FinalVariable();
		f.display();
		
		FinalMethodChildClass f1 = new FinalMethodChildClass();
		f1.show(275);
		
		FinalClass f2 = new FinalClass();
		f2.show();
	}

}
