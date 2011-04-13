package com.hz.yk.builder;

/**
 * 将一个复杂对象的构建与它的表示分离,使得同样的构建过程可以创建不同的表示. 
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) {

		MapCloudy MapCloudy = new MapCloudy();
		MapBuildAdv mapBuildAdv = new MapBuildAdv(MapCloudy);
		mapBuildAdv.createMap();

		System.out.println();

		MapSun map_sun = new MapSun();
		MapBuildLow map_build_low = new MapBuildLow(map_sun);
		map_build_low.createMap();

	}

}
