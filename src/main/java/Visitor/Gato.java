package Visitor;

public class Gato implements IAnimal {
	private String enfermedad;

	public Gato(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	@Override
	public String enfermedad(IVeterinario vet) {
		return vet.curar(this);
	}
}
