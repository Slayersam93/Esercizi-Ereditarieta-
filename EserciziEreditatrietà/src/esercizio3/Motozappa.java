package esercizio3;

import java.time.LocalDate;

public class Motozappa extends Macchina {
	private int numeroFrese;
	private int numeroRuote;

	public Motozappa(int numeroOrdine, String marca, LocalDate dataIngresso, int numeroFrese, int numeroRuote) {
		super(numeroOrdine, marca, dataIngresso);
		this.numeroFrese = numeroFrese;
		this.numeroRuote = numeroRuote;
	}

	public int getNumeroFrese() {
		return numeroFrese;
	}

	public void setNumeroFrese(int numeroFrese) {
		this.numeroFrese = numeroFrese;
	}

	public int getNumeroRuote() {
		return numeroRuote;
	}

	public void setNumeroRuote(int numeroRuote) {
		this.numeroRuote = numeroRuote;
	}

}
