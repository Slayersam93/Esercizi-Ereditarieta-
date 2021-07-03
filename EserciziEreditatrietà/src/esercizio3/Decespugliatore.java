package esercizio3;

import java.time.LocalDate;

public class Decespugliatore extends Macchina {
	private boolean accensioneElettrica;

	public Decespugliatore(int numeroOrdine, String marca, LocalDate dataIngresso, boolean accensioneElettrica) {
		super(numeroOrdine, marca, dataIngresso);
		this.accensioneElettrica = accensioneElettrica;
	}

	public boolean isAccensioneElettrica() {
		return accensioneElettrica;
	}

	public void setAccensioneElettrica(boolean accensioneElettrica) {
		this.accensioneElettrica = accensioneElettrica;
	}

}
