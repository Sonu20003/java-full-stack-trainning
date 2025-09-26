package com.coforge.training.hibernateweb.model;

import jakarta.persistence.Entity;

@Entity
public class CurrentAccount extends Account {
	private double overdraftLimit;

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
}
