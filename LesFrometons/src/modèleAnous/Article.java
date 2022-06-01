package modèleAnous;

public class Article {

	private final Fromage fromage;
	private final String clé;
	private final float prixTTC;
	private int quantiteEnStock;
	
	public Article(Fromage fromage, String clé, float prixTTC) {
		this.fromage = fromage;
		this.clé = clé;
		this.prixTTC = prixTTC;
		this.quantiteEnStock = 0;
	}
	
	public Fromage getFromage() {
		return this.fromage;
	}

	public float getPrixTTC() {
		return this.prixTTC;
	}
	
	public int getQuantiteEnStock() {
		return quantiteEnStock;
	}
	
	public String getClé() {
		return this.clé;
	}

	public void setQuantiteEnStock(int quantiteEnStock) {
		this.quantiteEnStock = quantiteEnStock;
	}

	public String toString() {
		if (clé.equals(""))
			return this.fromage.getDésignation() + ", Prix TTC : " + this.getPrixTTC() + " €";
		else
			return this.fromage.getDésignation() + ", " + this.clé + ", Prix TTC : " + this.getPrixTTC() + " €";
	}
	
	public String toStringAvecStock() {
		return this.toString() + ", Quantité en stock : " + this.quantiteEnStock;
	}
	
	public boolean equals(Object obj) {
		Article other = (Article) obj;
		return (this.fromage.equals(other.fromage) && this.clé.equals(other.clé));
	}
	
}
