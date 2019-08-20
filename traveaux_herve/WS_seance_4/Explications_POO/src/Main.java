
public class Main {

	public static void main(String[] args) {
		
		
		Voiture v1 = new Voiture("Honda", "JAZZ", 2018, 220.00, 0.0);
		
		
		
		System.out.println(v1.toString());
		//l'appel
		//ServiceVoiture.accelerer(v1,50);
		v1.accelerer(v1, 50);
		System.out.println(v1.toString());
		//v1.accelerer(100);
		v1.accelerer(v1,100);
		System.out.println(v1.toString());
		v1.accelerer(v1,100);
		//ServiceVoiture.accelerer(v1,100);
		
		System.out.println(v1.toString());
		
		Voiture v2 = new Voiture("Honda", "CRV", 2018, 240.00, 0.0);
		
		//ServiceVoiture.accelerer(v2,50);
		System.out.println(v1.toString());
//		
//		System.out.println(v2.toString());
		
//		Voiture v3 = new Voiture("SEAT");
//		
//		// l'appel d'une méthode (toString())
//		System.out.println(v3.toString());
		
	}

}
