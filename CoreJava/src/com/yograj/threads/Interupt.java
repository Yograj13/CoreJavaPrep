package com.yograj.threads;

public class Interupt implements Runnable {
 
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("This is message #" + i);
 
            try {
                Thread.sleep(10000);
                continue;
            } catch (InterruptedException ex) {
                System.out.println("I'm resumed");
            }
        }
    }
 
    public static void main(String[] args) {
        Thread t1 = new Thread(new Interupt());
        t1.start();
 
        try {
            Thread.sleep(5000);
            System.out.println("intruptinting thread");
            t1.interrupt();
 
        } catch (InterruptedException ex) {
            // do nothing
        }
 
    }
}