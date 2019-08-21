
public interface IServiceVoiture {

	//que la signature
	/**
	 * CE service permet d'accelerer la voiture passée en paramètre avec le pas
	 * @param v : voiture en question 
	 * @param pas : le pas d'accéleration
	 * @return : la vitesse apèrs l'acceleration
	 */
	public double accelerer(Voiture v,int pas);
	
	public double freiner(int pas);
	
	public boolean stoper();
	
	public int nombreVoitureCrees();
	
	public int nombreVoitureCrees(Voiture v);
}
