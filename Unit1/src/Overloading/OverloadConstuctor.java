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
public class OverloadConstuctor {
    double width;
    double height;
    double depth; 
 
// constructor used when all dimensions specified
    OverloadConstuctor(double w, double h, double d) {
        width = w;
        height = h;
        depth = d; 
    } 
    // constructor used when no dimensions specified 
    OverloadConstuctor() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box 
    }  
    // constructor used when cube is created 
    OverloadConstuctor(double len){
        width=height=depth=len; 
    }
    // compute and return volume 
    double volume(){
        return width*height*depth;
    }
}

class OverloadCons{
    public static void main(String[] args) {
        //create boxes using the various constructors
        OverloadConstuctor mycon1=new OverloadConstuctor(10,20,5);
        OverloadConstuctor mycon2=new OverloadConstuctor();
        OverloadConstuctor mycube=new OverloadConstuctor(4);
        double vol;
        //get volume of first constructor
        vol=mycon1.volume();
        System.out.println("Volume of mycon1 is "+ vol);
        
        //get volume o second constructor
        vol=mycon2.volume();
        System.out.println("Volume if mycon2 is " + vol);
        
        //get volume of cube
        vol=mycube.volume();
        System.out.println("Volume of mycube is "+ vol);
    }
}