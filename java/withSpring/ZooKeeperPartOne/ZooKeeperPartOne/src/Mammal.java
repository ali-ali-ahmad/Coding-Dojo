
public class Mammal {
	private int energyLevel = 100;
	
	
	public void displayEnergy() {
		System.out.println("The Energy level is: " + energyLevel);
	}
	
    public Mammal(int energyLevel) {
        this.energyLevel = this.energyLevel + energyLevel;

    }
	
    public int getEnergyLevel() {
        return energyLevel;
    }
    
    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = this.energyLevel + energyLevel;
    }
}
