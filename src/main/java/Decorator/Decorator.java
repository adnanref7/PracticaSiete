package Decorator;

public abstract class Decorator implements Banco {
	private Banco componente;

	public Decorator(Banco componente) {
		this.componente = componente;
	}

	public void funcionalidad(String usuario, int monto) {
		componente.funcionalidad(usuario, monto);
	}
}
