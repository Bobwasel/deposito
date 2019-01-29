import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	    private double depMax;
	    private double depNivel;

		test(double tankMax, double tankLevel) {
	       this.depMax   = tankMax;
	       this.depNivel = tankLevel;
	    }

	    public double getDepositoNivel(){
	       return depNivel;
	    }

		public double getDepositoMax(){
	       return depMax;
	    }

	    public boolean estaVacio(){
	      return depNivel == 0;
	    }

	    public boolean estaLleno(){
		  return depNivel == depMax;
	    }

	    public void fill(double amount){
	    	depNivel = depMax/2;
	    	depNivel = depNivel + amount;
	    }

		public void consumir(double amount){
	       depNivel = depNivel - amount;
	    }
		
	 public static void main(String[] args) {
		        
		     
		 DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		        
		 System.out.println("The tank with capacity " + tank.getDepositoMax() + " liters has been created. ");
		 System.out.println(" Its initial fuel level is  " + tank.getDepositoNivel() + " liters.");
		 
		 // La capacidad del depósito
		 tank.fill(40);
		 System.out.println(tank);
	}
}
