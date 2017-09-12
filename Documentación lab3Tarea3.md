##Documentacion lab3 Tarea


#Monster
public interface Monster {
    
    public double getPower();
    public String Attack();

}


#Class FireMonster
public class  FireMonster implements Monster {
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
    

#Class WaterMonster

public class WaterMonster implements Monster {
       private double power;
    private double altura;
    public WaterMonster(double power, double altura){
        this.power=power;
        this.altura=altura;
    }
    
    public double getPower(){
        return this.power ;
    }
    public String toString(){
        return "Fire Monster[ su poder es: "+this.power +" su altura "+this.altura+" su altura es : "+this.getPower()+"m]";
    }
    
}


#Class StoneMonster

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
        return "Fire Monster[ su poder es: "+this.power +" su altura "+this.altura+" su altura es : "+this.getPower()+" m]";
    }
    
}


#Main
    
     public class TrueMonster {
    public static void main(String... argvs) {
	    
	    Monster a1, b1,c1;
       a1=new FireMonster(12,30);
       System.out.println(a1.toString());
       
       
       b1= new WaterMonster(170,80);
       System.out.println(b1.toString());
       
       c1= new StoneMonster(90,60);
      System.out.println( c1.toString());
       
     
       
    }
    
    
}