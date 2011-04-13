package com.hz.yk.visitor;

/**
 * 访问者模式的目的是封装一些施加于某种数据结构元素之上的操作。一旦这些操作需要修改的话，接受这个操作的数据结构则可以保持不变。
 * 
 * @author Administrator
 * 
 */
public class Main {
	public static void main(String[] args) {
		// Setup employee collection
		Workers e = new Workers();
		e.attach(new Employee("Hank", 25000.0, 14));
		e.attach(new Employee("Elly", 35000.0, 16));
		e.attach(new Manager("Dick", 35000.0, 16));

		// Create two visitors
		IncomeVisitor v1 = new IncomeVisitor();
		VacationVisitor v2 = new VacationVisitor();

		// Employees are visited
		e.Accept(v1);
		System.out.println("---华丽的分割线---");
		e.Accept(v2);
	}

}
