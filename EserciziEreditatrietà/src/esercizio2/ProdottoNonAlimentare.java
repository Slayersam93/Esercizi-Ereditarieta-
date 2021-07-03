package esercizio2;

public class ProdottoNonAlimentare extends  Prodotto {
	Merceologico categoriaMerceologico;

	public ProdottoNonAlimentare(String codiceEan, String descrizione, double prezzo,Merceologico categoriaMerceologico ) {
		super(codiceEan, descrizione, prezzo);
		this.categoriaMerceologico = categoriaMerceologico;
	}
}
