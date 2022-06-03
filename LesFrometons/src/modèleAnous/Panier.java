package modèleAnous;


import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<Article> barquette;

	public Panier() {
		this.barquette = new ArrayList<Article>();
	}

	public void addFromages( Article a) {
		this.barquette.add(a);
	}

    @Override
	public String toString() {
		StringBuffer enForme = new StringBuffer();
		for (Article a : barquette) {
			enForme.append(a.toStringAvecStock());
		}
		return enForme.toString();
	}

	public String toStringIHM() {
		StringBuffer enForme = new StringBuffer();
		for (Article a : barquette) {
			enForme.append(a.toString());
		}
		return enForme.toString();
	}

}
