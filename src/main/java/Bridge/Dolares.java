package Bridge;

public class Dolares implements IMoneda {
	private double monto= 6.91;

	@Override
	public void cambio(double cantidad) {
		double ans = cantidad * monto;
		System.out.println(cantidad + " dolares son: " + ans + " bolivianos.");
	}

}
