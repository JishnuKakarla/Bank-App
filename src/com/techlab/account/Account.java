package com.techlab.account;

public class Account {
	private int accno;
	private String accname;
	private double balance;

	public Account(int accno, String accname, double balance) {
		this.accno = accno;
		this.accname = accname;
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public String getAccname() {
		return accname;
	}

	public double getbalance() {
		return balance;
	}

	public void display() {
		System.out.println("AccNo " + getAccno() + " AccName is " + getAccname() + " balance Amount  " + getbalance());
	}

	public void deposit(float amount) {
		System.out.println("deposited amount " + amount);
		this.balance += amount;
	}

	public void withdraw(float amount) throws insufficientbalenceexception {
		System.out.println("withdraw amount " + amount);
		if (this.balance - amount > 500 && amount < this.balance) {
			this.balance -= amount;
		} else {
			throw new insufficientbalenceexception("Insufficient Balance");
		}
	}
}
