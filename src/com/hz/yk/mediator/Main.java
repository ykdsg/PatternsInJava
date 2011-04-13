package com.hz.yk.mediator;

/*
 * 用一个中介对象来封装一系列关于对象交互行为
 * 
 * 各个对象之间的交互操作非常多;每个对象的行为操作都依赖彼此对方,修改一个对象的行
为,同时会涉及到修改很多其他对象的行为,如果使用 Mediator 模式,可以使各个对象间的
耦合松散,只需关心和 Mediator 的关系,使多对多的关系变成了一对多的关系,可以降低系
统的复杂性,提高可修改扩展性. 
 * 
 */
public class Main {
	public static void main(String[] args) {
		Mediator myMed = new ConcreteMediator();
		ColleagueA a = new ColleagueA(myMed);
		ColleagueB b = new ColleagueB(myMed);
		ColleagueC c = new ColleagueC(myMed);

		a.Change();
		b.Change();
		c.Change();
	}
}
