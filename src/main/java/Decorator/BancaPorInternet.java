package Decorator;

public class BancaPorInternet extends Decorator {
	private boolean permiso=false;

	public BancaPorInternet(Banco banco) {
		super(banco);
	}

	@Override
	public void funcionalidad(String usuario, int monto) {
		super.funcionalidad(usuario, monto);
		this.permiso = true;
		permiso(usuario, monto);
	}

	public void permiso(String usuario, int monto) {
		permiso=true;
		System.out.println(usuario+ ": habilitado para compras Online menores a su saldo " + monto + " bs.");
	}

	public boolean isPermiso() {
		return permiso;
	}

	public void setPermiso(boolean permiso) {
		this.permiso = permiso;
	}

}
