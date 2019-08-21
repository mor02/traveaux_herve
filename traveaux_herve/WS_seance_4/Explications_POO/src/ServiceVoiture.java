
public class ServiceVoiture implements IServiceVoiture{

//	public static double accelerer(Voiture v,int pas) {
//		double vitesseCible = v.getVitesseEncours() + pas;
//		if(vitesseCible<=v.getVitesseMax()) {
//			//this.vitesseEncours = this.vitesseEncours + pas;
//			v.setVitesseEncours(v.getVitesseEncours()+pas);
//		}else {
//			//this.vitesseEncours = this.vitesseMax;
//			v.setVitesseEncours(v.getVitesseMax());
//		}
//		
//		return v.getVitesseEncours();
//	}

	public  double accelerer(Voiture v,int pas) {
		double vitesseCible = v.getVitesseEncours() + pas;
		if(vitesseCible<=v.getVitesseMax()) {
			//this.vitesseEncours = this.vitesseEncours + pas;
			v.setVitesseEncours(v.getVitesseEncours()+pas);
		}else {
			//this.vitesseEncours = this.vitesseMax;
			v.setVitesseEncours(v.getVitesseMax());
		}
		
		return v.getVitesseEncours();
	}
	
	@Override
	public double freiner(int pas) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean stoper() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int nombreVoitureCrees() {
		return Voiture.nbVoitureCrees;
	}

	@Override
	public int nombreVoitureCrees(Voiture v) {
		// TODO Auto-generated method stub
		return 0;
	}

}
