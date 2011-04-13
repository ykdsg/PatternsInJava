package com.hz.yk.factory;

/**
 * 提供创建对象的接口
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) {
		//创建不同的汽车只需要改动这句代码就可以了
		CarFactoryInterface carFactory = new AudiCarFactoryImple();
		CarInterface carRef = carFactory.createCar();
		carRef.start();
		carRef.stop();

	}

}
