package com.hz.yk.adapter;

/**
 * 适配器:将两个不兼容的类纠合在一起使用
 * 
 * @author Administrator
 * 
 */
public class Main {
	public static void main(String[] args) {
		SquarePeg square = new SquarePeg();
		square.insert("%%%%%%%");

		// RoundPeg 属于 Adaptee,是被适配者.PegAdapter 是 Adapter,将 Adaptee(被适配者
		// RoundPeg)和 Target(目标 SquarePeg)进行适配
		RoundPeg roundPeg = new RoundPeg();
		square = new PegAdapter(roundPeg);
		square.insert("!!!!!!!!!!");
	}

}
