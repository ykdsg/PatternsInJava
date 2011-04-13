package com.hz.yk.visitor;

public class Manager implements Element {

	// Fields 这里为了简单就用了和employee同样的字段。实际上可以不同，这个没有关系。
	private String name;
	private double income;
	private int vacationDays;

	public Manager(String name, double income, int vacationDays) {
		this.name = name;
		this.income = income;
		this.vacationDays = vacationDays;
	}

	@Override
	public void Accept(Visitor visitor) {
		visitor.visitManager(this);

	}

	/*
	 * set and get
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}
}
