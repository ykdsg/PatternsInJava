package com.hz.yk.composite;

import java.util.Iterator;

public interface Equipment {
	public String name = null;

	// 网络价格
	public abstract double netPrice();

	// 折扣价格
	public abstract double discountPrice();

}
