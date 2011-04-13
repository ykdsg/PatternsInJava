package com.hz.yk.composite;

import java.util.Iterator;

public interface Equipments extends Equipment {
	// 增加部件方法
	public boolean add(Equipment equipment);

	// 删除部件方法
	public boolean remove(Equipment equipment);

	// 注意这里，这里就提供一种用于访问组合体类的部件方法。
	public Iterator iter();
}
