package com.hz.yk.visitor;

public interface Visitor {
	//职工的观察者 方法
	public void visitForEmployee(Employee employee);

	//经理的观察者 方法
	public void visitManager(Manager manager);

}
