package com.hz.yk.decorator;

public class DecoratorAudiRed extends DecoratorParent {
	public DecoratorAudiRed() {

	}

	public DecoratorAudiRed(CarParent car) {
		super(car);
	}

	@Override
	public void print_face() {
		super.print_face();
		System.out.println("给　奥迪　喷涂鸦　-　颜色为　红色火焰");
	}

}
