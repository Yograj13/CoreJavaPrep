package com.yograj.threads;

import java.util.concurrent.Executor;

public class ExecutorStudy implements Executor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorStudy executorStudy = new ExecutorStudy();
		//TempRunnable tempRunnable = new TempRunnable();
		executorStudy.execute(new TempRunnable());
		executorStudy.execute(new TempRunnable());
	}

	@Override
	public void execute(Runnable command) {
		command.run();
		
	}

}

class TempRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method executed");
	}
	
}