package com.hz.yk.decorator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 动态给一个对象添加一些额外的职责,就象在墙上刷油漆.使用 Decorator 模式相比用生成
子类方式达到功能的扩充显得更为灵活. 
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		AudiSub audi_sub_ref = new AudiSub();
		DecoratorAudiRed decorator_audi_red_ref = new DecoratorAudiRed(
				audi_sub_ref);
		DecoratorAudiPurple decorator_audi_purple_ref = new DecoratorAudiPurple(
				decorator_audi_red_ref);
		System.out.println("#######1:");
		decorator_audi_purple_ref.print_face();

		DecoratorAudiRed decorator_audi_red_ref2 = new DecoratorAudiRed(
				new DecoratorAudiPurple());
		System.out.println("#######2:");
		decorator_audi_red_ref2.print_face();

		DecoratorAudiRed decorator_audi_red_ref3 = new DecoratorAudiRed(
				new AudiSub());
		System.out.println("#######3:");
		decorator_audi_red_ref3.print_face();

		DecoratorAudiPurple decorator_audi_purple_ref2 = new DecoratorAudiPurple(
				new DecoratorAudiRed());
		System.out.println("#######4:");
		decorator_audi_purple_ref2.print_face();

		FileInputStream f = new FileInputStream(new File(""));
		BufferedInputStream b = new BufferedInputStream(f);
	}

}
