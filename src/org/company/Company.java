package org.company;
import org.client.Client;

public class Company extends Client {
	private void companyName() {
System.out.println("Company name is ABC");

	}
	private void companyDetails()
	{
		System.out.println("Company Id 123");
	}
	public static void main(String[] args) {
		Company a = new Company();
		a.companyName();
		a.clientName();
	}
}
