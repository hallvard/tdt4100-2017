package of8;

public interface Animal {

	// I vanlige klasser betyr "final"-nøkkelordet konstant
	// I et interface kan man droppe det, da alle "variabler"
	// må være konstanter
	String INTERFACE_NAME = "Animal"; // Dette er en konstant (final og static)
	double g = 9.81;
	
	String getName(); // Abstrakt metode, ingen kropp
	String makeAnimalSound();
	
}
