package com.hz.yk.abstractfactory;

public class BedRoomFactory implements RoomFactory {

	@Override
	public Room CreateRoom() {
		return new BedRoom();
	}

	@Override
	public Door createDoor() {
		return new BedRoomDoor();
	}

	@Override
	public Wall createWall() {
		return new BedRoomWall();
	}

}
