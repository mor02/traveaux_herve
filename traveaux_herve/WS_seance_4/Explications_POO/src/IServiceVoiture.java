
public interface IServiceVoiture {

	//que la signature
	
	public double accelerer(Voiture v,int pas);
	
	public double freiner(int pas);
	
	public boolean stoper();
	
	public int nombreVoiturecrees();
}
