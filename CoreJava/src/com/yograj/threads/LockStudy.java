package com.yograj.threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockStudy{
	
	public static void main(String args[]) {
		
		Resource r = new Resource();
		ConcurrencyLockExample synchronizedLockExample = new ConcurrencyLockExample(r);
		Thread t1 = new Thread(synchronizedLockExample);
		Thread t2 = new Thread(synchronizedLockExample);
		
		t1.setName("Kavita");
		t2.setName("Yograj");
		t1.start();
		t2.start();
	}
	
}




class Resource {

	public void doSomething(){
		//do some operation, DB read, write etc
		System.out.println(Thread.currentThread().getName()+"  DB operation in progress........");
	}
	
	public void doLogging(){
		//logging, no need for thread safety
		System.out.println(Thread.currentThread().getName()+" Logging operation in progress........");
	}
}



class SynchronizedLockExample implements Runnable{

	private Resource resource;
	private Lock lock;
	
	public SynchronizedLockExample(Resource r){
		this.resource = r;
		this.lock= new ReentrantLock();
	}
	
	@Override
	public void run() {
		try {
			if(lock.tryLock()) {
			resource.doSomething();
			//resource.doLogging();
			}
		}finally {
			lock.unlock();
		}
			
	}
}

 class ConcurrencyLockExample implements Runnable{

	private Resource resource;
	private Lock lock;
	private Condition wait; //= lock.newCondition();
	private Condition notify;// = lock.newCondition();
	public ConcurrencyLockExample(Resource r){
		this.resource = r;
		this.lock = new ReentrantLock();
		wait = lock.newCondition();
		notify = lock.newCondition();
	}
	
	@Override
	public void run() {
		try {
			if(lock.tryLock(10, TimeUnit.SECONDS)){
				resource.doSomething();
				notify.signal();
			wait.await();
			
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			//release lock
			lock.unlock();
			//notify.signal();
		}
		resource.doLogging();
	}

}