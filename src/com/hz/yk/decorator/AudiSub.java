package com.hz.yk.decorator;

public class AudiSub implements CarParent {

	public AudiSub() {
	}

	// 奥迪汽车子类
	@Override
	public void print_face() {
		System.out.println("audi车默认的颜色为　黑色");
	}

}
