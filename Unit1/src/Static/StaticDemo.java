/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

/**
 *
 * @author Administrator
 */
 class StaticDemo {
     static int a=42;
     static int b=99;
     static void callme(){
         System.out.println("a="+a);     
     }
  
}

class StaticByName{
    public static void main(String[] args) {
        StaticDemo.callme();
        System.out.println("b="+ StaticDemo.b);
    }
}
