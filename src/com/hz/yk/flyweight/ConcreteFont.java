package com.hz.yk.flyweight;

public class ConcreteFont implements Font {
	private String color;
	private int size;
	private FontInner inner;

	public ConcreteFont(FontInner s) {
		inner = s;
		// id = "The char is: " + s;
	}

	public void SetFont(String _color, int _size) {
		color = _color;
		size = _size;
	}

	public void GetFont() {
		System.out.println("String :" + inner.getFontString() + "--- color is:"
				+ color + "--- size is:" + size);
	}
}
