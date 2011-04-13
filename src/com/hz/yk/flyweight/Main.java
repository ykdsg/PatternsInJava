package com.hz.yk.flyweight;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int[] size = { 8, 9, 10, 11, 12 };
		String[] color = { "FFFFFF", "000000", "FF00FF", "CCCCCC", "111111" };
		FontInnerFactory fontInnerFactory = new FontInnerFactory();
		String aString = "A test string";
		List<Font> fontList = new ArrayList();
		for (int i = 0; i < aString.length(); i++) {
			int j = 0;
			j = (int) Math.floor(Math.random() * 5);
			// System.out.println("j is:" + j + "---" +aString.substring(i,
			// i+1));
			ConcreteFont font = new ConcreteFont(fontInnerFactory.GetFlyWeight(
					aString.substring(i, i + 1), ""));
			font.SetFont(color[j], size[j]);
			fontList.add(font);
		}

		Hashtable myHashTable = fontInnerFactory.GetFactory();
		System.out.println("Hash table size is:" + myHashTable.size());
		for (Font font : fontList) {
			font.GetFont();
		}
	}
}
