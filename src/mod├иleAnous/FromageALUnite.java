package modèleAnous;
public class FromageALUnite extends Fromage {
	
	public FromageALUnite(String désignation) {
		super(désignation);
	}

	public String toString() {
		return super.toString() + ", vendu à l'unité";
	}

}
