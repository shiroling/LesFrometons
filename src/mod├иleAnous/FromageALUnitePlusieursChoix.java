package modèleAnous;

public class FromageALUnitePlusieursChoix extends Fromage {
	
	public FromageALUnitePlusieursChoix(String désignation) {
		super(désignation);
	}
	
	public String toString() {
		return super.toString() + ", vendu à l'unité avec plusieurs choix";
	}

}
