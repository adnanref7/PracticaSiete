package Decorator;

public class MainDecorator {
	   public static void main(String[] args) {
	        Banco cuentaBatman = new CuentaDeBancoBasica();
	        cuentaBatman = new BancaPorInternet(cuentaBatman);
	        cuentaBatman = new SegurodeCuenta(cuentaBatman);
	        cuentaBatman = new Promociones(cuentaBatman);

	        cuentaBatman.funcionalidad("Batman", 10000000);
	    System.out.println();
	        Banco cuentaCatWoman = new CuentaDeBancoBasica();
	        cuentaCatWoman = new BancaPorInternet(cuentaCatWoman);
	        cuentaCatWoman = new Promociones(cuentaCatWoman);
	        
	        cuentaBatman.funcionalidad("Catwoman", 9999);
		    System.out.println(); 
	        Banco cuentaRobin = new CuentaDeBancoBasica();
	        cuentaRobin = new SegurodeCuenta(cuentaRobin);
	        cuentaRobin = new Promociones(cuentaRobin);

	        cuentaRobin.funcionalidad("Robin", 10);
	    }
}
