package modèleAnous;

public class FromageEntierOuMoitie extends Fromage {
	
	public static final String MOITIE = "moitié";
	public static final String ENTIER = "entier";

	public FromageEntierOuMoitie(String désignation) {
		super(désignation);
	}
	
	public String toString() {
		return super.toString() + ", vendu entier ou par moitié";
	}

}
