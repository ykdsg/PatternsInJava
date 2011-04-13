package com.hz.yk.template;

/**
 * 模板方法，定义一个操作中算法的骨架，而将一些具体的步骤延迟到子类。使得子类在不改变算法的结构就可以重新定义算法的某些特定步骤。
 * 例如AbstractRead定的getContent方法，就是算法骨架，且用final关键字使得子类不能重写该方法。但是子类可以自己定义getContent中
 * 涉及的三个实现的细节。
 * @author "yangk"
 * @date 2010-4-25 下午05:01:40 
 *
 */
public class Main {
	public static void main(String[] args) {
        // You should change the path of "test.txt" in your local machine
        String fileName = "F:\\workspace_ganymede\\PatternsInJava\\src\\com\\hz\\yk\\template\\test.txt";
//        String url = "http://www.the9.com/main.htm";
        
        AbstractRead fileRead = new ReadFile();
//        AbstractRead htmlRead = new ReadHtml();

        fileRead.setResource(fileName);
//        htmlRead.setResource(url);
        
        System.out.println("-----  Read from a file  -----");        
        fileRead.getContent();
//        System.out.println("-----  Read from a url  -----");
//        htmlRead.getContent();
    }
}
