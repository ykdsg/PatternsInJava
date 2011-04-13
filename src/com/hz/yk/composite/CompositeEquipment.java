package com.hz.yk.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CompositeEquipment implements Equipments {
	private int i = 0;
	// 定义一个 Vector 用来存放'儿子'
	private List<Equipment> equipmentList = new ArrayList<Equipment>();

	private String name;

	public CompositeEquipment(String name) {
		this.name = name;
	}

	public boolean add(Equipment equipment) {
		return this.equipmentList.add(equipment);
	}

	@Override
	public boolean remove(Equipment equipment) {
		return this.equipmentList.remove(equipment);
	}

	public double netPrice() {
		double netPrice = 0.;
		Iterator iter = equipmentList.iterator();
		while (iter.hasNext()) {
			netPrice += ((Equipment) iter.next()).netPrice();
		}
		return netPrice;
	}

	public double discountPrice() {
		double discountPrice = 0.;
		Iterator iter = equipmentList.iterator();
		while (iter.hasNext()) {
			discountPrice += ((Equipment) iter.next()).discountPrice();
		}

		return discountPrice;
	}

	// 注意这里，这里就提供用于访问自己组合体内的部件方法。
	// 上面dIsk 之所以没有， 是因为Disk是个单独(Primitive)的元素.
	public Iterator iter() {
		return equipmentList.iterator();
	}

	// 重载 Iterator 方法
	public boolean hasNext() {
		return i < equipmentList.size();
	}

	// 重载 Iterator 方法
	public Object next() {
		if (hasNext())
			return equipmentList.indexOf(i++);
		else
			throw new NoSuchElementException();
	}

}
