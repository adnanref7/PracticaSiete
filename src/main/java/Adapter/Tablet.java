package Adapter;

public class Tablet implements IArtefacto1 {

	private int precio;
	private int tiempoDeVida;

	@Override
	public int getPrecio() {
		return precio;
	}

	@Override
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int getTiempoDeVida() {
		return tiempoDeVida;
	}

	@Override
	public void setTiempoDeVida(int tiempoDeVida) {
		this.tiempoDeVida = tiempoDeVida;

	}
}