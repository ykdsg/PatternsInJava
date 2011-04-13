package com.hz.yk.facade;

public class CarFacadeImple {
	public void car_go_go(Car car_ref) {
		car_ref.check_box();
		car_ref.check_console();
		car_ref.check_stop();
		car_ref.start();
	}

}
