package Adapter;

public class MainAdapter {

	public static void main(String[] args) {

		Televisor tele = new Televisor();
		Lavadora lava = new Lavadora();
		Refrigerador refri = new Refrigerador();
		AdaptadorArtefactos adaptadorteles = new AdaptadorArtefactos(tele);
		AdaptadorArtefactos adaptadorlavas = new AdaptadorArtefactos(lava);
		AdaptadorArtefactos adaptadorrefris = new AdaptadorArtefactos(refri);
		tele.setCosto(1000);
		lava.setCosto(2000);
		refri.setCosto(3000);
		tele.setTiempoDeGarantia(5);
		lava.setTiempoDeGarantia(4);
		refri.setTiempoDeGarantia(3);
		System.out.println("Precio de televisor : " + adaptadorteles.getPrecio());
		System.out.println("precio de lavadora: " + adaptadorlavas.getPrecio());
		System.out.println("precio de refrigerador: " + adaptadorrefris.getPrecio());
		System.out.println("tiempo de vida de televisor : " + adaptadorteles.getTiempoDeVida());
		System.out.println("tiempo de vida de lavadora: " + adaptadorlavas.getTiempoDeVida());
		System.out.println("tiempo de vida de refrigerador: " + adaptadorrefris.getTiempoDeVida());
	}

}
