package com.reprep;

class Th1 extends Thread{

    @Override
    public void run() {
        synchronized(this){
            System.out.println("A1");
        }
        
    }
    
}

class Th2 extends Thread{

    @Override
    public void run() {
       System.out.println("A2");
    }
    
}

public class Infx {
    public static void main(String[] args) {
        Th1 th1 = new Th1();
        Th2 th2 = new Th2();

            th1.start();
            th2.start();
        
    }
}
