package com.company;

public class Multithread implements Runnable{
    public static void main(String[]args){
        Multithread obj=new Multithread();
        for(int i=0;i<=10;i++){
            Thread thread=new Thread(obj);
            thread.setPriority(10);
            thread.start();
        }
        System.out.println("code is running outside the thread");
    }
    public void run() {
        System.out.println("code is running inside the thread"+ Thread.currentThread().getId() +"\n" + Thread.currentThread().getPriority());

    }
}