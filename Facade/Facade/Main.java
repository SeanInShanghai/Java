package Facade;

/**
 * 这是一个外观模式的例子。
 * Main函数为Client端，通过调用Computer的函数start来启动计算机。但是Client端不需要
 * 对CPU，Memory和HardDrive分别启动。
 * 这样起到了一个“解耦”的作用，内部子系统经过变化后，不会影响Client的行为。
 * 这样看，Facade模式更像是一种从架构角度观察和分析系统的设计模式
 * */


public class Main {
	public static void main(String[] args){
		Computer c = new Computer();
		c.start();
	}
}
