package com.greatlearning.CredentialService;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {
	public char[] generatePassword() {
		String capitalLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String smallLetters = "qwertyuiopasdfghjklzxcvbnm";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*()<>?+-*_";

		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random random = new Random();
		char[] password = new char[10];
		{
			for (int i = 0; i < 10; i++) {
				password[i] = values.charAt(random.nextInt(values.length()));
			}
			return password;
		}
	}

	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + ".greatlearning.com";
	}

	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Dear " + employee.getFirstName()+" "+ employee.getLastName()
				+ " Your Generated Credential are as Follow");
		System.out.println("Email ---->" + email);
		System.out.print("Password ---->" + "");
		System.out.print(generatedPassword);
	}
}
