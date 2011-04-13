package com.hz.yk.abstractfactory;

public class LivingRoomFactory implements RoomFactory {

	@Override
	public Room CreateRoom() {
		return new LivingRoom();
	}

	@Override
	public Door createDoor() {
		return new LivingRoomDoor();
	}

	@Override
	public Wall createWall() {
		return new LivingRoomWall();
	}

}
