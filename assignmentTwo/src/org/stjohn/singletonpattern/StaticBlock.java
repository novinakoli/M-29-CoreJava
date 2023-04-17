//program on demonstrate to singleton pattern using static block initialization
package org.stjohn.singletonpattern;

public class StaticBlock {
	//create private constructor
		private static StaticBlock INSTANCE = new StaticBlock();
		
		//create private static variable of the same class
		StaticBlock() {
			
		}
		//in static block it will give the exception handling to handle errors
		static {
			try {
				if(INSTANCE == null) {
					INSTANCE = new StaticBlock();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		//create public static method that returns instance of the class
		public static StaticBlock getInstance() {
			return INSTANCE;
		}
}
