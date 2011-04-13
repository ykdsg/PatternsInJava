package com.hz.yk.builder;

public class MapBuildLow {
	private MapInterface map;

	public MapBuildLow(MapInterface map) {
		super();
		this.map = map;
	}

	public void createMap() {
		System.out.println("创建一个低画质的地图");
		// 创建的顺序很重要 从天空往路面创建
		map.create_weather();
		map.create_house();
		// map.create_tree();将创建树的过程去掉
		map.create_way();

	}

}
