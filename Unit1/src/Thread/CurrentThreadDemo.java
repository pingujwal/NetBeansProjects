/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author Administrator
 */
//Controlling the main Thread.

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t= Thread.currentThread();
        System.out.println("Current thread:" + t);
        //changethe name of the Thread
        t.setName("My Thread");
        System.out.println("After name change:"+ t);
        try{
            for(int n=5; n>0;n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
    }
    
}
