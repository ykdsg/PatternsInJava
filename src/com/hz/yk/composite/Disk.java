package com.hz.yk.composite;

import java.util.Iterator;

public class Disk implements Equipment {
	private String name;

	public Disk(final String name) {
		this.name = name;
	}

	// 定义 Disk 网络价格为 1
	public double netPrice() {
		return 1.;
	}

	// 定义了 disk 折扣价格是 0.5 对折。
	public double discountPrice() {
		return .5;
	}

}
