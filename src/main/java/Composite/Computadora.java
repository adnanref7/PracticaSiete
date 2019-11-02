package Composite;

public class Computadora implements AComponent {
private int precio =100;
	public Computadora() {
		super();
	}

	@Override
	public Integer operacion() {
		System.out.println("COMPUTADORA: 100$" );
	return precio;
	}
	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public void add(AComponent component) {	
			System.out.println("Añadiendo computadora");
		
	}

	@Override
	public void remove(AComponent component) {
		System.out.println("Borrando computadora");

	}

	@Override
	public void getChild(int position) {
		System.out.println("\t COMPUTADORA. " );
	}

}
