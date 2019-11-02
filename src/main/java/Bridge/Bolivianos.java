package Bridge;

public class Bolivianos implements IMoneda {

	@Override
	public void cambio(double cantidad) {		
		System.out.println(cantidad + " bolivianos.");
	}

}
