/**
 * Main class of the Java program. 
 * 
 * @author IES Severo Ochoa team
 * @since 2018-01
 * 
 */
public class Main {

    public static void main(String[] args) {
        
        // create the tank
        DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
        // La capacidad del depósito
        System.out.println("The tank with capacity " + tank.getDepositoMax() + " liters has been created. ");
        // El nivel del depósito
        System.out.println(" Its initial fuel level is  " + tank.getDepositoNivel() + " liters.");
        // Está vacío el depósito?
		System.out.println("El depósito está vacio? " + tank.estaVacio());
		// Está por la mitad el depósito?
		System.out.println("Está por la mitad el depósito? " + tank.estaPorLaMitad());
		// Llenar depósito con parámetros del método
		tank.fill(30.9);
	    System.out.println("Cuántos litros hemos llenado? " + tank.getDepositoNivel() + " liters.");
	    // Consumir con parámetros del método
	 	tank.consumir(26.9);
	 	System.out.println("Cuánto queda de depósito después del consumo? " + tank.getDepositoNivel() + " liters.");
    }
}
