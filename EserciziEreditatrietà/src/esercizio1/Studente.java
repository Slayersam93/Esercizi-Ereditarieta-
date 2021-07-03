package esercizio1;

public class Studente extends Persona {
	private int matricolaStudente;
	private String corsoDiLaurea;
	private StatoStudente statoStudente;

	public Studente(String nome, String cognome,int matricolaStudente, String corsoDiLaurea,StatoStudente statoStudente) {
		super(nome, cognome);
		this.matricolaStudente = matricolaStudente;
		this.corsoDiLaurea = cognome;
		this.statoStudente = statoStudente;
		
		
		}
	
	public String infoStudente() {
		String infoPersona = info();
		String infoStudente = infoPersona +" " +matricolaStudente +" "+ corsoDiLaurea +" "+ statoStudente;
		return infoStudente;
	}

	public int getMatricolaStudente() {
		return matricolaStudente;
	}

	public String getCorsoDiLaurea() {
		return corsoDiLaurea;
	}

	public StatoStudente getStatoStudente() {
		return statoStudente;
	}
	
}
