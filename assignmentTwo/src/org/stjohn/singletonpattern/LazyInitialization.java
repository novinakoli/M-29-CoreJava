//program on demonstrate to singleton pattern using lazy initialization
package org.stjohn.singletonpattern;

public class LazyInitialization {
	//create private constructor
		private static LazyInitialization INSTANCE = new LazyInitialization();
		
		//create private static variable of the same class
		private LazyInitialization() {
			
		}
		//create public static method that returns instance of the class
		public static LazyInitialization getInstance() {
			
				if(INSTANCE == null) {
					INSTANCE = new LazyInitialization();
				}
			return INSTANCE;
		}
}
