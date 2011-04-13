package com.hz.yk.strategy;

/**
 * 策略模式，定义一系列算法，将他们封装起来，并使他们可以相互替换。 使得算法可以独立于他的用户而变化，
 * 关于strategy与context的通信：1.传参数，这样耦合最小，但不是所有strategy都用到所有参数的会造成参数的冗余。
 * 2.传context自身this，这样耦合较大，而且context要定义比较精细的接口
 * 
 * @author "yangk"
 * @date 2010-4-25 下午03:48:43
 * 
 */
public class Main {
	public static void main(String[] args) {
		int lineCount = 4;
		int lineWidth = 12;

		Context myContext = new Context();

		Strategy strategyA = new StrategyA();
		Strategy strategyB = new StrategyB();

		String s = "This is a test string ! This is a test string !"
				+ " This is a test string ! This is a test string ! "
				+ "This is a test string ! This is a test string !";
		myContext.setText(s);

		myContext.setStrategy(strategyA);
		myContext.setLineWidth(lineWidth);
		myContext.drawText();

		myContext.setStrategy(strategyB);
		myContext.setLineCount(lineCount);
		myContext.drawText();
	}
}
