package com.hz.yk.decorator;

public abstract class DecoratorParent implements CarParent {
	// 装饰者接口
	protected CarParent car_parent_ref;

	public DecoratorParent() {

	}

	public DecoratorParent(CarParent car) {
		this.car_parent_ref = car;
	}

	@Override
	public void print_face() {
		if (null != car_parent_ref) {
			car_parent_ref.print_face();
		}

	}

}
