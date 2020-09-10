/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author Administrator
 */
//Demonstrate method overlading.
class OverloadFunction {
    void test(){
        System.out.println("No Parameters");
    }
    
    //Overload test for one integer parameter
    void test(int a){
        System.out.println("a:" +a );
 
    }
    //overloading test for two integer parameter.
    void test(int a, int b){
        System.out.println("a and b:"+a+ ""+b);
    }
    //overlaoding test for a double parameter
    double test(double a){
        System.out.println("double a:"+ a);
        return a*a;
    
    
    }
    
}

class Overload{
    public static void main(String[] args) {
        OverloadFunction obj1=new OverloadFunction();
        double result;
        
        
        //call all version of test()
        obj1.test();
        obj1.test(10);
        obj1.test(20,30);
        obj1.test(20.4);
        result=obj1.test(100.1);
        System.out.println("Result of obj1.test(1001)"+ result);
    }
}
