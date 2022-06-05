package modèleAnous;


import java.util.ArrayList;
import java.util.List;

public class Pannier {
    private List<Article> barquette;

	public Pannier() {
		this.barquette = new ArrayList<Article>();
	}

	public void addFromages( Article a) {
		this.barquette.add(a);
	}

	public int prixTotal() {
		int sum = 0;
		for (Article a: this.barquette) {
			sum += a.getPrixTTC();
		}
		return sum;
	}

	public int nombreElement() {
		return this.barquette.size();
	}

    @Override
	public String toString() {
		StringBuilder enForme = new StringBuilder();

		for (Article a : barquette) {
			enForme.append(a.toStringAvecStock());
		}
		return enForme.toString();	
	}

	public String toStringIHM() {
		StringBuilder enForme = new StringBuilder();

		for (Article a : barquette) {
			enForme.append(a.toString());
		}
		return enForme.toString();
	}

}
