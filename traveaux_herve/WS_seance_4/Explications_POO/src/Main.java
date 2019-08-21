import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		Voiture v1 = new Voiture("Honda", "JAZZ", 2018, 220.00, 0.0);
	
		IServiceVoiture serviceVoiture;
		
		//System.out.println(v1.toString());
		//l'appel
		//ServiceVoiture.accelerer(v1,50);
		v1.accelerer(v1, 50);
		//System.out.println(v1.toString());
		//v1.accelerer(100);
		v1.accelerer(v1,100);
		//System.out.println(v1.toString());
		v1.accelerer(v1,100);
		//ServiceVoiture.accelerer(v1,100);
		
		//System.out.println(v1.toString());
		
		Voiture v2 = new Voiture("Honda", "CRV", 2018, 240.00, 0.0);
		
		Voiture v3 = new Voiture();
		
		Voiture v4 = new Voiture();
		
		//System.out.println("Le nombre de voitures créees pour le moment : " + Voiture.nbVoitureCrees);
		
		//ServiceVoiture.accelerer(v2,50);
		//System.out.println(v1.toString());
//		
//		System.out.println(v2.toString());
		
//		Voiture v3 = new Voiture("SEAT");
//		
//		// l'appel d'une méthode (toString())
//		System.out.println(v3.toString());
		
		List<Voiture> listVoiture = new ArrayList<Voiture>();
		//List<Voiture> listVoiture = new LinkedList()<Voiture>();
		listVoiture.add(v1);
		listVoiture.add(v2);
		listVoiture.add(v3);
		if(listVoiture.contains(v3)) {
			System.out.println("la voiture v3 est dans la liste");
		}else {
			System.out.println("la voiture v3 n'existe pas dans liste");
		}
		System.out.println(listVoiture.get(0));
		for(Voiture vTemp : listVoiture) {
			System.out.println(vTemp.toString());
		}
		
		Voiture[] tableauVoitures = new Voiture[10];
		tableauVoitures[0] = v1;
		tableauVoitures[9] = v1;
	}

}
