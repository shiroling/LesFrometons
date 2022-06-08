package modèleAnous;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Articles {

	private List<Fromage> listeFromages;
	
	public Articles() {
		this.listeFromages = new LinkedList<>();
	}
	
	public void addFromages(List<Fromage> fromages) {
		this.listeFromages.addAll(fromages);
	}
	
	public String toStringFromagesEtArticles() {
		StringBuffer enForme = new StringBuffer();
		for (Fromage f : this.listeFromages) {
			enForme.append(f.toString() + '\n');
			if (f.nombreArticles() > 0) {
				for (Article article : f.getArticles()) {
					enForme.append(article.toString() + '\n');
				}
			}
		}
		return enForme.toString();
	}
	
	public String toStringArticlesEtStock() {
		StringBuffer enForme = new StringBuffer();
		for (Fromage f : this.listeFromages) {
			if (f.nombreArticles() > 0) {
				for (Article article : f.getArticles()) {
					enForme.append(article.toStringAvecStock() + '\n');
				}
			}
		}
		return enForme.toString();
	}
	
	public void regénérationDuStock() {
		for (Fromage f : this.listeFromages) {
			if (f.nombreArticles() > 0) {
				for (Article article : f.getArticles()) {
					article.setQuantiteEnStock((int) Math.round(Math.random()*100));
				}
			}
		}
	}
	
	public String vérificationSaisie( ) {
		StringBuffer enForme = new StringBuffer();
		for (Fromage f : this.listeFromages) {
			if (f.nombreArticles() == 0) {
				enForme.append("Pas d'articles pour " + f.toString() + '\n');
			}
		}
		return enForme.toString();
	}

	public List<Fromage> getListFromages() {
		return listeFromages;
	}

	public static List<Fromage> getStockOnly(List<Fromage> listeFromages) {
		List<Fromage> listFromagesStock = new ArrayList<>();
		for (Fromage f: listeFromages) {
			if (f.nombreArticles() > 0) {
				listFromagesStock.add(f);
			}
		}
		return listFromagesStock;
	}

	public List<String> getDesignationListFromages() {
		List<String> list = new ArrayList<>();
		for (Fromage f: listeFromages) {
			list.add(f.getDésignation());
		}
		return list;
	}

	public List<String> getDesignationListFromagesEnStock() {
		List<String> list = new ArrayList<>();
		for (Fromage f: getStockOnly(listeFromages)) {
			list.add(f.getDésignation());
		}
		return list;
	}

	public List<Fromage> getListFromagesBrebis() {
		List<Fromage> list = new ArrayList<>();
			for (Fromage f: listeFromages) {
				if (f.isBrebis()) {
					list.add(f);
				}
			}
		return list;
	}

	public List<String> getDesignationListFromagesBrebis() {
		List<String> list = new ArrayList<>();
		for (Fromage f: getListFromagesBrebis()) {
			list.add(f.getDésignation());
			}
		return list;
	}
	public List<String> getDesignationListFromagesBrebisEnStock() {
		List<String> list = new ArrayList<>();
		for (Fromage f: getStockOnly(getListFromagesBrebis())) {
			list.add(f.getDésignation());
			}
		return list;
	}

	public List<Fromage> getListFromagesVache() {
		List<Fromage> list = new ArrayList<>();
			for (Fromage f: listeFromages) {
				if (f.isVache()) {
					list.add(f);
				}
			}
		return list;
	}

	public List<String> getDesignationListFromagesVache() {
		List<String> list = new ArrayList<>();
		for (Fromage f: getListFromagesVache()) {
			list.add(f.getDésignation());
			}
		return list;
	}
	public List<String> getDesignationListFromagesVacheEnStock() {
		List<String> list = new ArrayList<>();
		for (Fromage f: getStockOnly(getListFromagesVache())) {
			list.add(f.getDésignation());
			}
		return list;
	}
	public List<Fromage> getListFromagesChevre() {
		List<Fromage> list = new ArrayList<>();
			for (Fromage f: listeFromages) {
				if (f.isChevre()) {
					list.add(f);
				}
			}
		return list;
	}
	public List<String> getDesignationListFromagesChevre() {
		List<String> liste = new ArrayList<>();
		for (Fromage f: getListFromagesChevre()) {
			liste.add(f.getDésignation());
			}
		return liste;
	}
	public List<String> getDesignationListFromagesChevreEnStock() {
		List<String> liste = new ArrayList<>();
		for (Fromage f: getStockOnly(getListFromagesChevre())) {
			liste.add(f.getDésignation());
			}
		return liste;
	}

}
