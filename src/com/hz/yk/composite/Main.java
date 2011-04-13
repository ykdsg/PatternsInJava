package com.hz.yk.composite;

/**
 * Composite(组合) 将对象以树形结构组织起来,以达成“部分－整体” 的层次结构， 使得客户端对单个对象和
组合对象的使用具有一致性. 
 * @author Administrator
 *
 */
public class Main {

	public static void main(String[] args) {
		Cabinet cabinet = new Cabinet("Tower");
		Chassis chassis = new Chassis("PC Chassis");
		// 将 PC Chassis 装到 Tower 中 (将盘盒装到箱子里)
		cabinet.add(chassis);
		// 将一个 10GB 的硬盘装到 PC Chassis (将硬盘装到盘盒里)
		chassis.add(new Disk("10 GB"));
		chassis.add(new Disk("20 GB"));

		// 调用 netPrice()方法;
		System.out.println("netPrice=" + cabinet.netPrice());
		System.out.println("discountPrice=" + cabinet.discountPrice());
	}
}
