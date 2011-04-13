package com.hz.yk.state;

public interface State {
	public void handlepush(Context c);

	public void handlepull(Context c);

	public String getcolor();
}
