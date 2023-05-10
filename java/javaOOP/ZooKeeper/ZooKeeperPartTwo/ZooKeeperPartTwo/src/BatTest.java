import java.io.Console;

public class BatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lets play a game, Make the Bat do something:");
		System.out.println("Press 1: To make the Bat fly");
		System.out.println("Press 2: To make the Bat eat a human");
		System.out.println("Press 3: To make the Bat attack the town");
//		Bat bat = new Bat(0);
//			//		Bat setEnergy = new
//			bat.setEnergyLevel(300);

        while(true){
    		Bat bat = new Bat(0);
			//		Bat setEnergy = new
			bat.setEnergyLevel(300);
            Console console = System.console();
	        String number = console.readLine();
	        int action = Integer.parseInt(number);
	        if (action == 1) {
	    		Bat fly = new Bat(0);
	    		fly.fly(-50);
	    		bat.displayEnergy();
	        }
	        else if (action == 2) {
	    		Bat eatHumans = new Bat(0);
	    		eatHumans.eatHumans(25);
	    		bat.displayEnergy();
	        }
	        else if (action == 3) {
	    		Bat attachTown = new Bat(0);
	    		attachTown.attackTown(-100);
	    		bat.displayEnergy();
	    	}
	        continue;
        }
	}

}
