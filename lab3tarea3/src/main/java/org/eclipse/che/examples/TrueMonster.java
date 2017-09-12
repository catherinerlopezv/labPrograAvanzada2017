package org.eclipse.che.examples;

public class TrueMonster {
    public static void main(String... argvs) {
	    Monster a1, b1, c1;
       a1=new FireMonster(12,30);
       System.out.println(a1.toString());
       
       
       b1= new WaterMonster(170,80);
       System.out.println(b1.toString());
       
       c1= new StoneMonster(90,60);
      System.out.println( c1.toString());
       
     
       
    }
    
}
