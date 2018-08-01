package com.javaTest;

public class MyRunnable implements Runnable {
    private int num = 5;
    private String name;
    MyRunnable(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0 ; i < 10 ; i ++){
//            System.out.println(name+":"+i);
            synchronized(this){
                if (num > 0){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("剩余数："+num--);
                }
            };
        }
    }
}
