package org.eclipse.che.examples;

public class StoneMonster implements Monster {
    private double power;
    private double altura;
    public StoneMonster(double power, double altura){
        this.power=power;
        this.altura=altura;
    }
    
    public double getPower(){
        return this.power ;
    }
    public String toString(){
        return "Stone Monster [ su poder es: "+this.power +" su altura "+this.altura+" su altura es : "+this.getPower()+" m]";
    }
    

}
