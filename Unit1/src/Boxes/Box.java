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
public class Box {
    double width;
    double height;
    double depth;
    
    //compute and return volume
    double volume(){
        return width*height*depth;
    }
    void setDim(double w,double h, double d){
        width=w;
        height=h;
        depth=d;
        
    }
    
}

class BoxDemo{
    public static void main(String[] args) {
        Box mybox1 =new Box();
        Box mybox2 =new Box();
        double vol;
        
        //initialization each box
        mybox1.setDim(10, 20, 30);
        mybox2.setDim(2,2,2);
        
        
        //Get volume of first box.
        vol=mybox1.volume();
        System.out.println("Volume of box1 is "+ vol);
        
        
        //Get volumet of Seconod box
        vol=mybox2.volume();
        System.out.println("Volume of second box is "+ vol);
    }
}
