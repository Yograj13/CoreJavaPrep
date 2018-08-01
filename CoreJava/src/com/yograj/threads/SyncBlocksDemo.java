package com.yograj.threads;

public class SyncBlocksDemo implements Runnable {
	static AccountTemp atemp= new AccountTemp();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncBlocksDemo	syncBlocksDemo = new SyncBlocksDemo();
		Thread t1 = new Thread(syncBlocksDemo);
		Thread t2 = new Thread(syncBlocksDemo);
		Thread t3 = new Thread(syncBlocksDemo);
		
		t1.setName("Kavita");
		t2.setName("Yograj");
		t3.setName("Avani");
		t3.start();
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		//System.out.println();
		try {
			temp();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void temp() throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName()+" line before sync block");
		
		synchronized (atemp) {
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+"Account bal===>"+atemp.getBal());
			System.out.println(Thread.currentThread().getName()+" line in sync block");
		}
		System.out.println(Thread.currentThread().getName()+" line after sync block");
		
	}
}

class AccountTemp{
	private int bal=10;
	
	public int getBal() {
		bal=bal-5;
		return bal;
	}
}
