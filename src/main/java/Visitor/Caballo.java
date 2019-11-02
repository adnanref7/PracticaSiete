package Visitor;

public class Caballo implements IAnimal {
	private String enfermedad;

	public Caballo(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	@Override
	public String enfermedad(IVeterinario veterinario) {
		return veterinario.curar(this);
	}
}