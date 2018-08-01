package com.yograj.threads;

public class SynchronizedMethods implements Runnable {
	
	
	Account acct = new Account();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedMethods runnableTemp = new SynchronizedMethods();
		
		Thread t1 = new Thread(runnableTemp);
		t1.setName("Raj");
		Thread t2 = new Thread(runnableTemp);
		t2.setName("Kavita");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName()+"  Running");
		
		
		for(int i=0; i<5; i++) {
			withdraw(20);
			if(acct.getBalance()<0) {
				System.out.println("Account overdrawn");
			}
		}
		
	}
	public  void withdraw(int amt) {
		if(amt<=acct.getBalance()) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw amount::"+amt);
			synchronized (this){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				acct.withdrawAmt(amt);
				System.out.println(Thread.currentThread().getName()+" completes withdrawl");
			}
		}else {
			System.out.println(Thread.currentThread().getName()+" Insufficient balance to withdraw");
		}
	}
	
}
class Account{
	
	 private int bal=100;
	public int getBalance() {
		//System.out.println(Thread.currentThread().getName()+" getting balance==> current bal::"+this.bal);
		return bal;
	}
	public void withdrawAmt(int amt) {
		bal=bal-amt;
	}
}