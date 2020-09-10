/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestingInterface;

/**
 *
 * @author Administrator
 */
class AnotherClient implements CallBack {
    // Implement Callback's interface 
 
    public void CallBack(int p) {
    System.out.println("Another version of callback");
    System.out.println("p squared is " + (p*p)); 
  } 
} 
 
