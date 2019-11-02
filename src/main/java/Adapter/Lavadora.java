package Adapter;

public class Lavadora implements IArtefacto2 {
	private int tiempoDeGarantia;
	private int costo;

	@Override
	public int getTiempoDeGarantia() {
		return tiempoDeGarantia;
	}

	@Override
	public void setTiempoDeGarantia(int tdg) {
		this.tiempoDeGarantia = tdg;
	}

	@Override
	public int getCosto() {
		return costo;
	}

	@Override
	public void setCosto(int costo) {
		this.costo = costo;

	}
}
