package Bridge;

public class MainBridge {
	public static void main(String[] args) {
		Bolivianos bs = new Bolivianos();
		Dolares ds = new Dolares();
		Euros es = new Euros();

		PlazoFijo plazoFijo = new PlazoFijo(bs);
		Ahorro ahorro = new Ahorro(ds);
		Credito credito = new Credito(es);

		ahorro.interes(1000);
		plazoFijo.interes(1000);
		credito.interes(1000);
		
		ahorro.interes(239);
		plazoFijo.interes(924);
		credito.interes(757);
		
	}
}
