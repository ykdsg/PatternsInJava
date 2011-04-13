package com.hz.yk.visitor;

public class VacationVisitor implements Visitor {
	@Override
	public void visitForEmployee(Employee employee) {
		employee.setVacationDays(employee.getVacationDays() + 3);
		System.out.println("Employee:" + employee.getName()
				+ "'s new vacation days: " + employee.getVacationDays());

	}

	@Override
	public void visitManager(Manager manager) {
		manager.setVacationDays(manager.getVacationDays() + 5);
		System.out.println("Manager:" + manager.getName()
				+ "'s new vacation days: " + manager.getVacationDays());

	}
}
