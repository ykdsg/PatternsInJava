package com.hz.yk.observer;

import java.util.Observable;
import java.util.Observer;

public class Alarm implements Observer {
	public void makeAlarm() {
		System.out.println("嘀嘀嘀...水已经烧开 ");
	}

	@Override
	public void update(Observable o, Object arg) {
		makeAlarm();
	}

}
