package com.hz.yk.state;

public class BlueState implements State {

	@Override
	public String getcolor() {
		return "blue";
	}

	@Override
	public void handlepull(Context c) {
		// 根据 push 方法"如果是 blue 状态的切换到 green" ;
		c.setState(new GreenState());

	}

	@Override
	public void handlepush(Context c) {
		// 根据 pull 方法"如果是 blue 状态的切换到 red" ;
		c.setState(new RedState());

	}

}
