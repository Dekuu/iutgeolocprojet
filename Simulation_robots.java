package td2.java;

public class Simulation_robots {


	public static void main(String[] args) {
		Casier c = new Casier(3);
		c.prend_objet(new Objet("Ordinateur Portable",5), 2);
		
		System.out.println("Drone:\nEtat Initial : "+ c);
		
		Drone d = new Drone(c);
		d.executerSeDeplacer(2);
		d.executerSaisir();
		d.executerSeDeplacer(1);
		d.executerRelacher();
		
		System.out.println("Etat Final : "+ c);
		
		System.out.println("AutoTracteur:\nEtat Initial : "+ c);

		AutoTracteur a = new AutoTracteur(c);
		a.executerSeDeplacer(1);
		a.executerSaisir();
		a.executerSeDeplacer(0);
		a.executerRelacher();
		
		System.out.println("Etat Final : "+ c);

		
		
	}

}
