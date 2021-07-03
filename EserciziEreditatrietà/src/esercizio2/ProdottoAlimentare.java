package esercizio2;

import java.time.LocalDate;

public class ProdottoAlimentare extends Prodotto {
	LocalDate dataDiScadenza;
	boolean vegano;
	public ProdottoAlimentare(String codiceEan, String descrizione, double prezzo, LocalDate dataDiScadenza,boolean vegano ) {
		super(codiceEan, descrizione, prezzo);
		this.dataDiScadenza = dataDiScadenza;
		this.vegano = vegano;
	}
}
