package com.yograj.threads;

public class WaitNotify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t1 = new MyThread();
		t1.setName("Kavita");
		
		t1.start();
		
		synchronized (t1) {
			System.out.println("Wait for Kavita to finish her job......");
			try {
				t1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(" thread interrupted Wait is almost  Over");
			}
			System.out.println("Wait Over");
		}
		
	}

}
class MyThread extends Thread{
	 public void run() {
		 
		 System.out.println(Thread.currentThread().getName()+"  Running ");
		 try {
			
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+"  almost done ");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 notify();
	 }
}