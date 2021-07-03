package esercizio1;

import java.time.LocalDate;

public class Lavoratore  extends Persona {
	private String matricolaLavoratore;
	private String azienda;
	private LocalDate dataAssunzione;
	private StatoLavoratore statoLavoratore;

	public Lavoratore (String nome, String cognome,String matricolaLavoratore, String azienda,LocalDate dataAssunzione,StatoLavoratore statoLavoratore) {
		super(nome, cognome);
		this.matricolaLavoratore = matricolaLavoratore;
		this.azienda = azienda;
		this.dataAssunzione = dataAssunzione;
		this.statoLavoratore = statoLavoratore;
		
		
		}
	
	public String infoStudente() {
		String infoPersona = info();
		String infoStudente = infoPersona +" " +matricolaLavoratore +" "+ azienda +" "+  dataAssunzione +" "+ statoLavoratore;
		return infoStudente;
	}

	public String getMatricolaLavoratore() {
		return matricolaLavoratore;
	}

	public String getAzienda() {
		return azienda;
	}

	public StatoLavoratore getstatoLavoratore() {
		return statoLavoratore;
	}
}
