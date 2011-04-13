package com.hz.yk.abstractfactory;

public interface RoomFactory {
	public Room CreateRoom();

	public Door createDoor();

	public Wall createWall();
}
