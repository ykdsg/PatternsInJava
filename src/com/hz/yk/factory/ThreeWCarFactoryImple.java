package com.hz.yk.factory;

public class ThreeWCarFactoryImple implements CarFactoryInterface {

	@Override
	public CarInterface createCar() {
		Car3w car3w = new Car3w();
		car3w.setName("大众甲壳虫");
		car3w.setSpeed(400);

		return car3w;

	}

}
