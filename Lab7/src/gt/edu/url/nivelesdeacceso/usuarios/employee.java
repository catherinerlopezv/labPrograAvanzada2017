/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.nivelesdeacceso.usuarios;

/**
 *
 * @author t203
 */
public abstract class employee {
    public String name;
    private int hireYear;
    protected String country;
  
    public void setHireYear(int hireYear){
        this.hireYear=hireYear;
    }
    
    public int getHireYear(){
        return this.hireYear;
    }
    protected abstract double monthlyPay();
    protected abstract double annualPay();
    
}
