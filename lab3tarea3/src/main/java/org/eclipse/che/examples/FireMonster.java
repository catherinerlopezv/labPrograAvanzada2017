package org.eclipse.che.examples;

public class FireMonster implements Monster {
    private double power;
    private double altura;
    public FireMonster(double power, double altura){
        this.power=power;
        this.altura=altura;
    }
    
    public double getPower(){
        return this.power ;
    }
    public String toString(){
        return "Fire Monster[ su poder es: "+this.power +" su altura "+this.altura+" su altura es : "+this.getPower()+" m]";
    }
}
