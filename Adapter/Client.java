package Adapter;

/**
 * 适配着模式。本段代码中是对象适配者模式，也就是说在Adapter中定义一个Adaptee的对象，然后
 * 通过调用Adaptee的对象来实现功能。（类适配着模式是Adapter继承Adaptee实现Target接口，这样
 * Target对象就可以调用Adaptee的方法了）
 * */

public class Client {
	public static void main(String[] args){
		Target t = new Adapter();
		t.Request();
	}
}
