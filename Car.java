package fr.wildcodeschool.idetest.java7;

public class Car extends Vehicule{
	
	public Car(String brand,int kilometers) {
		super(brand, kilometers);
	}

	@Override
	public String doStuff() {
		
		return String.format("Je suis %s et je fais vroum vroum !", this.getBrand());
	}
	
	
}
