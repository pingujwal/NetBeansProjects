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
class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t=new Thread(this,"Demo Thread");
        System.out.println("Child thread:"+t);
        t.start();//Start the thread.
    }
    //This is the entry point for the second thread.
    public void run(){
            try{
        for(int i=5;i>0;i--){
            System.out.println("Child Thread:" + i);
            Thread.sleep(500);
        }
    }catch(InterruptedExpection e){
            System.out.println("Child interrupted.");
}
            System.out.println("Exiting child thread.");
    
    
}
}

class ThreadDemo{
    public static void main(String[] args) {
        new NewThread();//create a new thread.
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main Thread:" + i);
                Thread.sleep(1000);
            }
        }catch(InterrupedExpection e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
    
