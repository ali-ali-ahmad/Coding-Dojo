

public class Bat extends Mammal {

	public Bat(int energyLevel) {
		super(energyLevel);
		// TODO Auto-generated constructor stub
	}
//	super.setEnergyLevel(300);
	
	public void fly(int energyLevel) {
		super.setEnergyLevel(energyLevel);
		System.out.println("The Bat is flying");
		System.out.println("The energy level will decrease  by 50");
		super.displayEnergy();
		System.out.println("\n----------------------------------------------------");
	}
	public void eatHumans(int energyLevel) {
		super.setEnergyLevel(energyLevel);
		System.out.println("The Bat is eating Humans");
		System.out.println("The energy level will increase  by 25");
		super.displayEnergy();
		System.out.println("\n----------------------------------------------------");
	}
	public void attackTown(int energyLevel) {
		super.setEnergyLevel(energyLevel);
		System.out.println("The Bat is attacking the Town, RRRuuunnnnnnnn");
		System.out.println("The energy level will decrease  by 100");
		super.displayEnergy();
		System.out.println("\n----------------------------------------------------");

	}
	


}



