//program to demonstrate on label for loop
package org.stjohn.looping;

public class LabelledForLoop {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//label
		outer:
			for(int i=1; i<=5; i++) {
				System.out.println();
				inner:
					for(int j=1; j<=5; j++) {
						System.out.print(j+" ");
						if(j==4) {
							break;
						}
					}
			}
	}

}
