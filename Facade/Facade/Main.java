package Facade;

/**
 * ����һ�����ģʽ�����ӡ�
 * Main����ΪClient�ˣ�ͨ������Computer�ĺ���start�����������������Client�˲���Ҫ
 * ��CPU��Memory��HardDrive�ֱ�������
 * ��������һ������������ã��ڲ���ϵͳ�����仯�󣬲���Ӱ��Client����Ϊ��
 * ��������Facadeģʽ������һ�ִӼܹ��Ƕȹ۲�ͷ���ϵͳ�����ģʽ
 * */


public class Main {
	public static void main(String[] args){
		Computer c = new Computer();
		c.start();
	}
}
