package test;

public class RunnableMain {
	 public static void main(String[] args){   
		 
		 /**
		  * ��ʼ��һ��ʵ��
		  *  ÿ���̵߳��õ���ͬһ��ThreadTest�����е�run()������
		  *  ���ʵ���ͬһ�������еı�����tickets����ʵ����
		  *  ticketsֻ��ӡ��һ�顣��������Ʊ����Ʊ��ԭ��.
		  */
		    ThreadTest t = new ThreadTest();   
		    new Thread(t).start();   
		    new Thread(t).start();   
		    new Thread(t).start();   
		    new Thread(t).start();   
		  }   
}
