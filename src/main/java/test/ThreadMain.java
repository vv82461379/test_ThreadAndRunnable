package test;

public class ThreadMain {
	public static void main(String[] args) {
		/**
		 * ֻʵ����һ��Thread
		 * ���������start���Σ���ֻ������һ�Σ�������������
		 */
//		ThreadTest t = new ThreadTest();   
//	    t.start();   
//	    t.start();   
//	    t.start();   
//	    t.start(); 
		/**
		 * new���Σ���ʵ��������Thead��������ʵ����4�Σ�ÿ��ticket��ӡ�ĴΡ�
		 */
		new ThreadTest().start();   
	    new ThreadTest().start();   
	    new ThreadTest().start();   
	    new ThreadTest().start(); 
	}
}
