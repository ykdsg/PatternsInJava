package com.hz.yk.decorator;

public class DecoratorAudiPurple extends DecoratorParent {
	public DecoratorAudiPurple() {

	}

	public DecoratorAudiPurple(CarParent car) {
		super(car);
	}

	@Override
	public void print_face() {
		super.print_face();
		System.out.println("给　奥迪　喷涂鸦　-　颜色为　紫色霞光");
	}

}
