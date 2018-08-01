package com.javaTest;

public class ThreeTest {
    public static void main(String args[]){
//        MyThree t1 = new MyThree("A");
//        MyThree t2 = new MyThree("B");
//        t1.start();
//        t2.start();
//        MyRunnable r1 = new MyRunnable("A");
//        MyRunnable r2 = new MyRunnable("B");
//        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r2);
//        t1.start();
//        t2.start();
//        for (int i = 0 ; i < 50 ; i ++){
//            if (i == 10){
//                try {
//                    t1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("主线程："+i);
//        }
        MyRunnable myRunnable = new MyRunnable("M");
        Thread thread = new Thread(myRunnable);
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        thread.start();
        thread1.start();
        thread2.start();
    }
}
