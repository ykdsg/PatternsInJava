package com.hz.yk.proxy;

public class ProxyBuyCarImple implements BuyCarPackage {
	private People people;

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public void buy_car() {
		if (people.getCash() > 3000) {
			System.out.println(people.getUsername() + "花" + people.getCash()
					+ "块　买了新车　交易结束");
		} else {
			System.out.println(people.getUsername() + "金钱不够，请继续比赛!");
		}
	}

}
