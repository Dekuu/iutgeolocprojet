package td2.java;

public class AutoTracteur extends Robot {

	AutoTracteur(Casier unCasier){
		super(unCasier);
		this.deplacement = new Voler();
		this.manip = new Magnet();
	}
}
