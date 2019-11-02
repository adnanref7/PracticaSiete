package Bridge;

public class Euros implements IMoneda {
	private double monto=7.72;


	@Override
	public void cambio(double cantidad) {
		double ans= cantidad * monto;
		System.out.println(cantidad + " euros son: " + ans + " bolivianos.");
	}

}
