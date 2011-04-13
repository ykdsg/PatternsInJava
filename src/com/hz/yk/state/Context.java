package com.hz.yk.state;

public class Context {
	private State state = null; // 我们将原来的 Color state 改成了新建的 State state;

	public Context(State state) {
		this.setState(state);
	}

	// setState 是用来改变 state 的状态 使用 setState 实现状态的切换
	public void setState(State state) {
		this.state = state;
	}

	public void push() {
		// 状态的切换的细节部分,在本例中是颜色的变化,已经封装在子类的handlepush 中实现,这里无需关心
		state.handlepush(this);
		print(state);
	}

	public void pull() {
		state.handlepull(this);
		print(state);

	}

	private void print(State state) {
		System.out.println("现在的颜色：" + state.getcolor());
	}

}
