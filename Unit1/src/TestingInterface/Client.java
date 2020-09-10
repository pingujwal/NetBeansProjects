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
 class Client implements CallBack {
    // Implement Callback's interface 
 
public void CallBack(int p) 
{ System.out.println("callback called with " + p); } 
 
void nonIfaceMeth() 
{ 
    System.out.println("Classes that implement interfaces " + "may also define other members, too."); 
} 
} 