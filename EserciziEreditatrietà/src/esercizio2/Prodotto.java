package esercizio2;

public class Prodotto {
	private String codiceEan;
	private String descrizione;
	private double prezzo;
	
	public Prodotto(String codiceEan, String descrizione, double prezzo) {
		this.codiceEan = codiceEan;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	public double applicaSconto() {
		prezzo = prezzo -(prezzo*0.05);
		return prezzo;
	}
	public String datiProdotto() {
		return codiceEan +" "+  descrizione +" "+prezzo;
	}
	
	public String getCodiceEan() {
		return codiceEan;
	}

	public void setCodiceEan(String codiceEan) {
		this.codiceEan = codiceEan;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
		

}
