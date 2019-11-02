package Visitor;

import java.util.Date;

public class Veterinario implements IVeterinario {
	private Date fecha = new Date();
	private String recuperacion;

	@Override
	public String curar(Gato gato) {
		gato.setEnfermedad("ninguna");
		recuperacion = "El gato está sano después de su curación en fecha: " + fecha;
		return recuperacion;
	}

	@Override
	public String curar(Perro perro) {
		perro.setEnfermedad("ninguna");
		recuperacion = "El perro está sano después de su curación en fecha: " + fecha;
		return recuperacion;
	}

	@Override
	public String curar(Caballo caballo) {
		caballo.setEnfermedad("ninguna");
		recuperacion = "El caballo está sano después de su curación en fecha: " + fecha;
		return recuperacion;
	}

}
