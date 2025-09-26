package com.coforge.training.hibernateweb.model;

public class SavingsAccount extends Account {
	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
