package Adapter;

public class AdaptadorArtefactos implements IArtefacto1 {
	private IArtefacto2 art = new Televisor();
	private IArtefacto2 art1 = new Lavadora();
	private IArtefacto2 art2 = new Refrigerador();
	private int precio;
	private int tiempoDeVida;

	public AdaptadorArtefactos(IArtefacto2 ia) {
		if (art!=ia) {
			this.art = ia;			
		} else if (ia!=art1) {
			this.art1=ia;
		} else if (ia!=art2) {
			this.art2=ia;
		} else {
			System.out.println("no es posible.");
		}
	}

	@Override
	public int getPrecio() {
		precio = this.art.getCosto();

		return precio;
	}

	@Override
	public int getTiempoDeVida() {
		tiempoDeVida = this.art.getTiempoDeGarantia();
		return tiempoDeVida;
	}

	@Override
	public void setPrecio(int precio) {

		this.precio = this.art.getCosto();
	}

	@Override
	public void setTiempoDeVida(int tiempoDeVida) {
		this.tiempoDeVida = this.art.getTiempoDeGarantia();

	}
}
