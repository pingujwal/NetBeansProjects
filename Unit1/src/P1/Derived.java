/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

/**
 *
 * @author Administrator
 */
 class Derived extends Protection{
     Derived(){
         System.out.println("derived constructor");
         System.out.println("n=" + n);
         //class only
         // System.out.prntln("n=" + n_pri);
         System.out.println("n_pro =" + n_pro);
         System.out.println("n_pub =" +n_pub);
         
     }
    
}
