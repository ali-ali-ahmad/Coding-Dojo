
public class Gorilla extends Mammal {



	public Gorilla(int energyLevel) {
		super(energyLevel);
		// TODO Auto-generated constructor stub
	}
	public void throwSomething(int energyLevel) {
		super.setEnergyLevel( energyLevel);
		System.out.println("The gorilla has thrown something");
		System.out.println("The energy level will decrease  by 5%");
		super.displayEnergy();
		System.out.println("\n----------------------------------------------------");
	}
	public void eatBanana(int energyLevel) {
		super.setEnergyLevel( energyLevel);
		System.out.println("The gorilla is satisfied by the Banana");
		System.out.println("The energy level will increase  by 10%");
		super.displayEnergy();
		System.out.println("\n----------------------------------------------------");
	}
	public void climb(int energyLevel) {
		super.setEnergyLevel( energyLevel);
		System.out.println("The gorilla has climed a tree");
		System.out.println("The energy level will decrease  by 10%");
		super.displayEnergy();
		System.out.println("\n----------------------------------------------------");

	}
	


}
