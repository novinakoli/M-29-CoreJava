//program to demonstrate on static variable
package ord.stjohn.statickeyword;

public class StaticKeywordExecuter {

	public static void main(String[] args) {
		/*
		 * without creating the object we will get the value for
		 * static variable
		 */
		System.out.println(Employee.companyName);
		
		Employee e1 = new Employee(23, "Novina Koli");
		System.out.println(e1);
		
		Employee e2 = new Employee(22, "Novina Hareshwar Koli");
		System.out.println(e2);
		
		//without creating the object we can call static method
		Customer.display();
		Customer c = new Customer();
		System.out.println(c);
		
	}

}
