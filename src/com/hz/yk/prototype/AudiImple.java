package com.hz.yk.prototype;

import com.hz.yk.factory.CarInterface;

public class AudiImple implements CarInterface, Cloneable {
	private CarTyre carTyre;

	@Override
	public void start() {
		System.out.println("奥迪A6启动了");

	}

	@Override
	public void stop() {
		System.out.println("奥迪A6停止了");

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		super.clone();
		AudiImple audi = new AudiImple();
		audi.setCarTyre(new CarTyre());

		return audi;
	}

	/*
	 * set and get
	 */
	public CarTyre getCarTyre() {
		return carTyre;
	}

	public void setCarTyre(CarTyre carTyre) {
		this.carTyre = carTyre;
	}
}
