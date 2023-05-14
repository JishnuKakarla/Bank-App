package com.techlab.account.test;

import com.techlab.account.Account;
import com.techlab.account.insufficientbalenceexception;

public class Accounttest {
	public static void main(String[] args) throws insufficientbalenceexception {

		Account account = new Account(1, "jishnu", 1000);

		account.display();
		account.deposit(200);
		account.display();
		try {
			account.withdraw(800);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		account.display();
		account.withdraw(300);
		account.display();
	}
}
