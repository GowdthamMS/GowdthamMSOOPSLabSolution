package com.greatlearning.CredentialService;

import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.CredentialService.CredentialService;

public class DriverClass {
	public static void main(String[] args) {
		Employee employee = new Employee("Gowdtham", "MS");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;

		System.out.println("Please Enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();

		if (option == 1) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "tech");
			cs.showCredentials(employee, generatedEmail, cs.generatePassword());
		} else if (option == 2) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "admin");
			cs.showCredentials(employee, generatedEmail, cs.generatePassword());
		} else if (option == 3) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "hr");
			cs.showCredentials(employee, generatedEmail, cs.generatePassword());
		} else if (option == 4) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "legal");
			cs.showCredentials(employee, generatedEmail, cs.generatePassword());
		} else
			System.out.println("Enter a valid option");
		sc.close();
	}
}
