package Decorator;

public class CuentaDeBancoBasica implements Banco {
	private String propietario;
	private int monto;


	public void funcionalidad(String usuario, int monto) {
		System.out.println("Accediendo a la cuenta de " + usuario + "\nUsted tiene " + monto + " bs.");
	}


	public String getPropietario() {
		return propietario;
	}


	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}


	public int getMonto() {
		return monto;
	}


	public void setMonto(int monto) {
		this.monto = monto;
	}
	
}
