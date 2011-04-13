package com.hz.yk.abstractfactory;

/**
 * 抽象工厂：提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们的具体类
 * 
 * @author "yangk"
 * @date 2010-5-2 下午03:22:43
 * 
 */
public class Main {
	public static void main(String[] args) {
		RoomFactory roomFactory = new LivingRoomFactory();
		// ----- Create Living Room
		Room myLivingRoom = roomFactory.CreateRoom();
		// ----- Create a door in living room
		myLivingRoom.addDoor(roomFactory.createDoor());
		// ----- Create a wall in living room
		myLivingRoom.addWall(roomFactory.createWall());

		// ----- Create Bed Room
		roomFactory = new BedRoomFactory();
		Room myBedRoom = roomFactory.CreateRoom();
		// ----- Create a door in bedroom
		myBedRoom.addDoor(roomFactory.createDoor());
		// ----- Create a wall in bedroom
		myBedRoom.addWall(roomFactory.createWall());

	}
}
