package Composite;

public class MainComposite {
	public static void main(String[] args) {
		Composite computadora = new Composite();
		computadora.add(new Computadora()); //100
		computadora.add(new Computadora()); //100

		Composite laboratorio1 = new Composite();
		Composite laboratorio2 = new Composite();

		laboratorio1.add(computadora); //200
		laboratorio1.add(computadora); //200
		laboratorio1.add(computadora); //200
		laboratorio1.add(computadora); //200
		laboratorio2.add(computadora); //200
		laboratorio2.add(computadora); //200
		
		//laboratorio1 cuesta 800 y laboratorio2 cuesta 400
		
		Composite contenedor = new Composite();
		
		contenedor.add(laboratorio2); //400
		contenedor.add(laboratorio1); //800
		contenedor.operacion(); //debería resultar 1200

	}
}
