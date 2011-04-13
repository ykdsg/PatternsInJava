package com.hz.yk.visitor;

import java.math.BigDecimal;

public class IncomeVisitor implements Visitor {

	@Override
	public void visitForEmployee(Employee employee) {
		// Provide 10% pay raise
		employee.setIncome(BigDecimal.valueOf(employee.getIncome()).multiply(
				BigDecimal.valueOf(1.10)).doubleValue());
		System.out.println("Employee:" + employee.getName() + "'s new income: "
				+ employee.getIncome());
	}

	@Override
	public void visitManager(Manager manager) {
		manager.setIncome(manager.getIncome() * 2.0);
		System.out.println("Manager:" + manager.getName() + "'s new income: "
				+ manager.getIncome());
	}

}
