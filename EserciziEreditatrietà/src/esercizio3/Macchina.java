package esercizio3;

import java.time.LocalDate;

public class Macchina {
	private int numeroOrdine;
	private String marca;
	private LocalDate dataIngresso;
	private Lavorazioni[] lavorazioni = new Lavorazioni [10]; 
	
	public Macchina(int numeroOrdine, String marca, LocalDate dataIngresso) {
		this.numeroOrdine = numeroOrdine;
		this.marca = marca;
		this.dataIngresso = dataIngresso;
	}

	public boolean aggiungiLavorazioni (Lavorazioni l) {
		for (int i=0; i<lavorazioni.length;i++) {
			if(lavorazioni[i]==null) {
				lavorazioni[i]=l;
				return true;
			}
		}
		return false;
	}
	public double calcolacosti () {
		double costi = 0;
		for (int i=0; i<lavorazioni.length; i++) {
			if (lavorazioni[i]!= null) {
				costi = lavorazioni[i].getCosto() + costi;
			}
		}
		return costi;
	}
	public void eliminaLavorazioni (Lavorazioni lav) {
		for (int i=0; i<lavorazioni.length;i++) {
			if(lavorazioni[i]==lav) {
				lav = null;
			}
	}
}

public int getNumeroOrdine() {
		return numeroOrdine;
	}

	public void setNumeroOrdine(int numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public LocalDate getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(LocalDate dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	public Lavorazioni[] getLavorazioni() {
		return lavorazioni;
	}

	public void setLavorazioni(Lavorazioni[] lavorazioni) {
		this.lavorazioni = lavorazioni;
	}
}
