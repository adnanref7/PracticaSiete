package Visitor;

public interface IVeterinario {
	public String curar(Gato cat);

	public String curar(Perro dog);

	public String curar(Caballo horse);
}
