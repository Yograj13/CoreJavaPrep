package com.yograj.threads;

public class HelloRunnable implements Runnable {
 
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("This is message #" + i +Thread.currentThread().getName());
 
            try {
                Thread.sleep(1000);
                continue;
            } catch (InterruptedException ex) {
                System.out.println("I'm resumed");
            }
        }
    }
 
    public static void main(String[] args) {
        Thread t1 = new Thread(new HelloRunnable());
        Thread t4 = new Thread(() -> System.out.println("executing thread using lambda"));
        t4.start();
        t1.setName("one");
        t1.start();
        Thread t2 = new Thread(new Test());
        t2.setName("two");
        t2.start();
        try {
            //Thread.sleep(5000);
           // t1.join();
        	t2.join();
 
        } catch (InterruptedException ex) {
            // do nothing
        }
        System.out.println("I'm in"+Thread.currentThread().getName());
        System.out.println("t4 state=======>"+t4.getState());
 
    }
}


class Test implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.currentThread().interrupt();
		
		System.out.println("Executing test class run");
	}
	
}