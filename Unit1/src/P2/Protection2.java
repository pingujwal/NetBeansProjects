/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

/**
 *
 * @author Administrator
 */
 class Protection2 extends P1.Protection{
     Protection2(){
         System.out.println("derived other package constructor");
         //clas or package only
         //System.out.println("n="+ n);
         //class only
         //System.out.println("n_pri="+ n_pri);
         System.out.println("n_pro="+n_pro);
         System.out.println("n_pub="+n_pub);
         
     }
    
}
