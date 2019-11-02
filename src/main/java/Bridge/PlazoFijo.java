package Bridge;

public class PlazoFijo implements ICuenta {
	private IMoneda moneda;

	public PlazoFijo(IMoneda moneda) {
		this.moneda = moneda;
	}

	@Override
	public void interes(double cantidad) {
		double monto = cantidad * 0.05;
		System.out.println("el monto: " + cantidad + " tiene un interes de " + monto + ".");
		moneda.cambio(monto);
	}
}
