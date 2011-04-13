package com.hz.yk.abstractfactory;

public abstract class Room {
	public void addDoor(Door door) {
		System.out.println("add door is :" + door.getName());
	}

	public void addWall(Wall wall) {
		System.out.println("add wall is :" + wall.getName());
	}
}
