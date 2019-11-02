package Decorator;

public class SegurodeCuenta extends Decorator {
	private int cobro = 199;

	public SegurodeCuenta(Banco componente) {
		super(componente);
	}

	public void funcionalidad(String usuario, int monto) {
		super.funcionalidad(usuario, monto);
		descuento(monto);
	}

	public void descuento(int monto) {
		if (monto > cobro) {
		int descuento = monto - cobro;
		System.out.println("Se descontaron " + cobro + " bs. de su cuenta. Su saldo actual es de " + descuento + " bs.");
	} else {
		System.out.println("No dispone de fondos suficientes (" + monto + " bs.) para pagar el seguro.");
	}
	}
}
