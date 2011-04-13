package com.hz.yk.state;

/**
 * state模式 ， 允许一个对象在内部状态改变时改变它的行为。对象看起来像是修改了它的类
 * 
 * @author "yangk"
 * @date 2010-4-24 下午03:56:54
 * 
 */
public class Main {
	public static void main(String[] args) {
		State s = new BlueState();
		Context con = new Context(s);
		for (int i = 0; i < 5; i++) {
			con.pull();
		}

		for (int i = 0; i < 5; i++) {
			con.push();
		}
	}
}
