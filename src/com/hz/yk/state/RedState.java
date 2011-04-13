package com.hz.yk.state;

public class RedState implements State {

	@Override
	public String getcolor() {
		return "Red";
	}

	@Override
	public void handlepull(Context c) {
		// 根据 pull 方法"如果是 blue 状态的切换到 red" ;
		c.setState(new BlueState());
		
	}

	@Override
	public void handlepush(Context c) {
		c.setState(new GreenState());
		
	}

}
