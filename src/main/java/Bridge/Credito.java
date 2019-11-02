package Bridge;

public class Credito implements ICuenta {
	private IMoneda moneda;

	public Credito(IMoneda moneda) {
		this.moneda = moneda;
	}

	@Override
	public void interes(double cantidad) {
		System.out.println("el monto: " + cantidad + " no tiene interes. ");
		moneda.cambio(cantidad);
	}

}
