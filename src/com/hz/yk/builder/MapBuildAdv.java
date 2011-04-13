package com.hz.yk.builder;

public class MapBuildAdv {
	private MapInterface map;

	public MapBuildAdv(MapInterface map) {
		super();
		this.map = map;
	}

	public void createMap() {
		System.out.println("创建一个高画质的地图");
		// 创建的顺序很重要 从天空往路面创建
		map.create_weather();
		map.create_house();
		map.create_tree();
		map.create_way();

	}
}
