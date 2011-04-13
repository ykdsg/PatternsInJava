package com.hz.yk.proxy;

public class Main {
	public static void main(String[] args) {
		People people_ref1 = new People();
		people_ref1.setCash(4000);
		people_ref1.setUsername("高洪岩");

		People people_ref2 = new People();
		people_ref2.setCash(2000);
		people_ref2.setUsername("岩洪高");

		ProxyBuyCarImple proxy_buy_car_imple = new ProxyBuyCarImple();
		proxy_buy_car_imple.setPeople(people_ref1);
		proxy_buy_car_imple.buy_car();

		proxy_buy_car_imple.setPeople(people_ref2);
		proxy_buy_car_imple.buy_car();

	}

}
