package com.javaTest;

public class MyThree extends Thread{
    public String name;
    MyThree(String name){
        this.name = name;
    }
    public void run() {
        for (int i = 0 ; i < 100 ; i ++){
            System.out.println(name+":"+i);
        }
        super.run();
    }
}
