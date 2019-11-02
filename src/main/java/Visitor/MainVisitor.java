package Visitor;

public class MainVisitor {
	public static void main(String[] args) {
		Gato cat = new Gato("salmonela");
		Perro dog = new Perro("gripe");
		Caballo horse = new Caballo("Moquillo");
		System.out.println("Atendiendo al gato con enfermedad: " + cat.getEnfermedad());
		System.out.println("Atendiendo al perro con enfermedad: " + dog.getEnfermedad());
		System.out.println("Atendiendo al caballo con enfermedad: " + dog.getEnfermedad());
		Veterinario dogtor = new Veterinario();
		System.out.println(cat.enfermedad(dogtor));
		System.out.println(dog.enfermedad(dogtor));
		System.out.println(horse.enfermedad(dogtor));

		System.out.println("El gato está sano, enfermdades padecidas: " + cat.getEnfermedad());
		System.out.println("El perro está sano, enfermedades padecidas: " + dog.getEnfermedad());
		System.out.println("El caballo está sano, enfermedades padecidas: " + dog.getEnfermedad());
	}
}
