package test;

public class RunnableMain {
	 public static void main(String[] args){   
		 
		 /**
		  * 初始化一个实例
		  *  每个线程调用的是同一个ThreadTest对象中的run()方法，
		  *  访问的是同一个对象中的变量（tickets）的实例，
		  *  tickets只打印了一遍。满足多个售票点售票的原则.
		  */
		    ThreadTest t = new ThreadTest();   
		    new Thread(t).start();   
		    new Thread(t).start();   
		    new Thread(t).start();   
		    new Thread(t).start();   
		  }   
}
