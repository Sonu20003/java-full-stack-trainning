package myPackage;
/**
* Author   : Sonu.2
* Date     : Sep 2, 2025
* Time     : 11:15:25 PM
* Project  : CoreJava
*/

class OtherThread implements Runnable {

	@Override
	public void run() {
		for(int i = 5; i>=0; i--) {
			System.out.print(i+"\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class MyThread implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<=5; i++) {
			System.out.println(i+"\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		MyThread temp1 = new MyThread();
		OtherThread temp2 = new OtherThread();
		Thread t1 = new Thread(temp1);
		Thread t2 = new Thread(temp2);
		
		t1.start();
		
		t2.start();
		
		
	}
}
