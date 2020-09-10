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
 class OtherPackage {
     OtherPackage() {
         P1.Protection p = new P1.Protection();
         System.out.println("other package constructor");
         // class or package only
         // System.out.println("n = " + p.n);
         // class only
         // System.out.println("n_pri = " + p.n_pri);
         // class, subclass or package only
         // System.out.println("n_pro = " + p.n_pro);
         System.out.println("n_pub = " + p.n_pub); 
     } 
    
}
