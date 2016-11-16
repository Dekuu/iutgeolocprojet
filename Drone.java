package td2.java;

public class Drone extends Robot {

	Drone(Casier unCasier){
		super(unCasier);
		this.deplacement = new Voler();
		this.manip = new Magnet();
	}

}
