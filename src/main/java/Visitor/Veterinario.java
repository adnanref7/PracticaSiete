package Visitor;

import java.util.Date;

public class Veterinario implements IVeterinario {
	private Date fecha = new Date();
	private String recuperacion;

	@Override
	public String curar(Gato gato) {
		gato.setEnfermedad("ninguna");
		recuperacion = "El gato est� sano despu�s de su curaci�n en fecha: " + fecha;
		return recuperacion;
	}

	@Override
	public String curar(Perro perro) {
		perro.setEnfermedad("ninguna");
		recuperacion = "El perro est� sano despu�s de su curaci�n en fecha: " + fecha;
		return recuperacion;
	}

	@Override
	public String curar(Caballo caballo) {
		caballo.setEnfermedad("ninguna");
		recuperacion = "El caballo est� sano despu�s de su curaci�n en fecha: " + fecha;
		return recuperacion;
	}

}
