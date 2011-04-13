package com.hz.yk.factory;

public class AudiCarFactoryImple implements CarFactoryInterface {

	@Override
	public CarInterface createCar() {
		CarAudi audi = new CarAudi();
		audi.setName("奥迪A6");
		audi.setSpeed(300);

		return audi;

	}

}
