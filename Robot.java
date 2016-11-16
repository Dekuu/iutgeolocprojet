package td2.java;

public class Robot {
	int numeroCase;
	Objet monObjet;
	Casier monCasier;
	Deplacement deplacement;
	Manipulation manip;
	
	Robot(Casier unCasier){
		this.monCasier = unCasier;
		this.monObjet = null;
		this.numeroCase = 0;
	}
	
	public void executerSeDeplacer(int numeroCaseArrivee){
		System.out.println("Case Départ : "+ this.numeroCase);
		deplacement.seDeplacer();
		this.numeroCase = numeroCaseArrivee;
		System.out.println("Case Arrivee : "+ this.numeroCase);
	}
	
	public void executerSaisir(){
		manip.saisir();
		this.monObjet = monCasier.libere_objet(this.numeroCase);
		System.out.println("Objet saisi : "+this.monObjet);
		
	}
	
	public void executerRelacher(){
		manip.relacher();
		System.out.println("Objet relaché : "+this.monObjet);
		this.monCasier.prend_objet(this.monObjet, this.numeroCase);
		this.monObjet = null;
	}
}
