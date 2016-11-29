package test;

public class ThreadMain {
	public static void main(String[] args) {
		/**
		 * 只实例化一个Thread
		 * 结果：无论start几次，都只是启动一次，不会多次启动。
		 */
//		ThreadTest t = new ThreadTest();   
//	    t.start();   
//	    t.start();   
//	    t.start();   
//	    t.start(); 
		/**
		 * new几次，则实例化几次Thead，本例中实例化4次，每张ticket打印四次。
		 */
		new ThreadTest().start();   
	    new ThreadTest().start();   
	    new ThreadTest().start();   
	    new ThreadTest().start(); 
	}
}
