package com.hz.yk.facade;

/**
 * Facade 的定义: 为子系统中的一组接口提供一个一致的界面.
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) {
		CarFacadeImple car_facade_imple_ref = new CarFacadeImple();
		car_facade_imple_ref.car_go_go(new Car());
	}

}
