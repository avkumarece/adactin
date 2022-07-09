package org.company;
import org.client.Client;

public class Company extends Client {
	private void companyName() {
System.out.println("Company name is ABC");

	}
<<<<<<< HEAD
	private void ramMethod() {
		System.out.println("hello");
=======
	private void companyDetails()
	{
		System.out.println("Company Id 123");
>>>>>>> 1fa2dfeba0d265100aa1ab2fe0a348c7b2bccdc4
	}
	public static void main(String[] args) {
		Company a = new Company();
		a.companyName();
		a.clientName();
	}
}
