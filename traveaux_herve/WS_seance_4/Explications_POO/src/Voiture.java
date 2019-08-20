
public class Voiture extends ServiceVoiture{

	//marque, modele , annee , la vitesse max , la vitesse en cours 
	//accelerer , freiner , stoper 
	
	private String marque;
	private String modele;
	private int annee;
	private double vitesseMax;
	private Double vitesseEncours;
	
	
	// Type prémitif : le type commence par miniscule
	// Type Classe/complexe : le type est une classe exemple Voiture v1;
	
	//Le contructeur avec paramètres
	public Voiture(String marque) {
		//super();
		this.marque = marque;
	}

	public Voiture() {
		
	}

	public Voiture(String marque, String modele, int annee, double vitesseMax, Double vitesseEncours) {
		//super();
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.vitesseMax = vitesseMax;
		this.vitesseEncours = vitesseEncours;
	}
	
	//visiblité typeRetour nomMethode([par1],[par2],...); ==> la signature d'une méthode

//Il s'agit d'une méthode "service" ==> déporter dans IServiceVoiture.java et implémenter dans ServiceVoiture.java	
//	public double accelerer(int pas) {
//		double vitesseCible = this.vitesseEncours + pas;
//		if(vitesseCible<=this.vitesseMax) {
//			this.vitesseEncours = this.vitesseEncours + pas;
//		}else {
//			this.vitesseEncours = this.vitesseMax;
//		}
//		
//		return this.vitesseEncours;
//	}
	
	public double freiner(int pas) {
		this.vitesseEncours = this.vitesseEncours - pas;
		return this.vitesseEncours;
	}
	
	public boolean stoper() {
		this.vitesseEncours = 0.0;
		//this.setVitesseEncours(0.0);
		return true;
	}
	
	//getter /accesseur
	public String getMarque() {
		return this.marque;
	}
	//setter / modificateur
	public void setMarque(String marque) {
		//Traitement
		this.marque = marque;
	}

	public String getModele() {
		return this.modele;
	}

	public void setModele(String modele1) {
		this.modele = modele1;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public double getVitesseMax() {
		return vitesseMax;
	}

	public void setVitesseMax(double vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

	public Double getVitesseEncours() {
		return vitesseEncours;
	}

	public void setVitesseEncours(Double vitesseEncours) {
		this.vitesseEncours = vitesseEncours;
	}
	//la définition 
	public String toString() {
		return "Marque : " + this.marque + " Modele : " +this.modele + " Vitesse en cours : "+this.vitesseEncours;
	}
	
}
