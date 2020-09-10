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
public class TestIface {
    public static void main(String args[ ]) {
        Client ob1 = new Client();
        AnotherClient ob2 = new AnotherClient();
        ob1.CallBack(42);
        ob2.CallBack(42); 
    }
    
    
}
