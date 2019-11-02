package Bridge;

public class Ahorro implements ICuenta {
	private IMoneda moneda;

	public Ahorro(IMoneda moneda) {
		this.moneda = moneda;
	}

	@Override
	public void interes(double cantidad) {
		double monto = cantidad * 0.02;
		System.out.println("el monto: " + cantidad + " tiene un interes de " + monto +".");
		moneda.cambio(monto);
	}

}
