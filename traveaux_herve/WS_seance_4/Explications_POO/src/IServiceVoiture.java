
public interface IServiceVoiture {

	//que la signature
	/**
	 * CE service permet d'accelerer la voiture pass�e en param�tre avec le pas
	 * @param v : voiture en question 
	 * @param pas : le pas d'acc�leration
	 * @return : la vitesse ap�rs l'acceleration
	 */
	public double accelerer(Voiture v,int pas);
	
	public double freiner(int pas);
	
	public boolean stoper();
	
	public int nombreVoitureCrees();
	
	public int nombreVoitureCrees(Voiture v);
}
