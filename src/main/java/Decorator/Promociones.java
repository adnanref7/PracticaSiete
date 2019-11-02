package Decorator;

import java.util.Random;

public class Promociones extends Decorator {
	private Random r = new Random();
private int random = r.nextInt(75-25+1);
	public Promociones(Banco componente) {
		super(componente);
	}

	public void funcionalidad(String usuario, int monto) {
		super.funcionalidad(usuario, monto);
		sortear(monto);
	}

	public void sortear(int monto) {
		if (random % 2 == 0) {
			int duplicado = monto * 2;
			System.out.println("Usted ha ganado un sorteo, pasó de tener " + monto + " bs. a tener " + duplicado + " bs.");
		} else {
			System.out.println("Gacias por participar. Tal vez la próxima. Su saldo es " + monto + " bs.");
		}
	}
}
