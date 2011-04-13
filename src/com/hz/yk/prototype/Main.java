package com.hz.yk.prototype;

/**
 * 用原型实例指定创建对象的种类,并且通过拷贝这些原型创建新的对象. 
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) {

		try {
			AudiImple car_ref_my = new AudiImple();
			car_ref_my.setCarTyre(new CarTyre());
			System.out.println("我的奥迪车的参数是：" + car_ref_my);
			System.out.println("我的奥迪车的轮胎参数是：" + car_ref_my.getCarTyre());

			AudiImple car_ref_other = (AudiImple) car_ref_my.clone();
			System.out.println("其它人的奥迪车的参数是：" + car_ref_other);
			System.out.println("其它人的奥迪车的轮胎参数是：" + car_ref_other.getCarTyre());

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
