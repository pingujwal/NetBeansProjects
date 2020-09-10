/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boxes;

/**
 *
 * @author Administrator
 */
/* Here, Box uses a constructor to initialize the dimensions of a box.*/ 
public class BoxWithConstructor {
    double height;
    double width;
    double depth;
    
    //This is the constructor for Box.
    //this is constructor
    BoxWithConstructor(){
        System.out.println("Constructor Box");
        width=10;
        height=10;
        depth=5;
        
    }
    //compute and return volume
    
    double volume(){
            return width*height*depth;
            
    }
}    

class BoxDemo1{
    public static void main(String[] args) {
        // declare , allocate, and initialize Box objects
        BoxWithConstructor mybox1=new BoxWithConstructor();
        BoxWithConstructor mybox2=new BoxWithConstructor();
        double vol;
        
        //get volume of first box.
        
        vol=mybox1.volume();
        System.out.println("Volume is " + vol);
        
        // get volume of second box.
        vol=mybox2.volume();
        System.out.println("volume is " + vol);
        
        
    }
}
    