package org.eclipse.che.examples;

public class Triangle implements Shape{
    
    public double base;
    private double heigth;
    public Triangle(double base, double heigth){
        this.base = base;
        this.heigth=heigth;
        
    }
    public double getArea(){
        return(base*heigth)/2;
        
    }
    public String toString(){
        return "Triangle[base "+this.base+" heigth "+this.heigth+" area "+this.getArea()+"]";
        
    }
}
