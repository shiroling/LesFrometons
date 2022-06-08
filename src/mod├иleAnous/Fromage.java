package modèleAnous;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Fromage implements Comparable<Fromage> {
	
	private String désignation;
	private String description;
	private TypeLait typeFromage;
	private List<Article> articles;

	public Fromage(String désignation) {
		this.désignation = désignation;
		this.articles = new LinkedList<Article>();
	}	
	
	public String getDésignation() {
		return this.désignation;
	}
	
	public String getDescription() {
		if (this.description == null)
			return "Pas de description de ce fromage pour le moment. Nous en sommes désolés";
		return this.description;
	}

	public void addDescription(String description) {
		this.description = description;
	}
	
	public void updateTypeFromage(TypeLait type) {
		this.typeFromage = type;
	}
	
	public TypeLait getTypeFromage() {
		return this.typeFromage;
	}

	public String toString() {
		return this.getDésignation() 
				+ ", Fromage au lait de " 
				+ this.typeFromage.getTypeDeLait();
	}
	
	public void addArticle(String clé, float prixTTC) {
		this.articles.add(new Article(this, clé, prixTTC));
	}
	
	public int nombreArticles() {
		return this.articles.size();
	}
	
	public List<Article> getArticles() {
		return this.articles;
	}
	
	public int compareTo(Fromage f) {
		return this.désignation.compareTo(f.désignation);
	}
	
	public boolean equals(Object obj) {
		Fromage other = null;
		if( obj instanceof Fromage) {
			other = (Fromage) obj;
		}
		return Objects.equals(this.désignation, other.désignation);
	}

	public boolean isChevre() {
		return this.typeFromage == TypeLait.CHEVRE;
	}
	public boolean isVache() {
		return this.typeFromage == TypeLait.VACHE;
	}
	public boolean isBrebis() {
		return this.typeFromage == TypeLait.BREBIS;
	}
}
