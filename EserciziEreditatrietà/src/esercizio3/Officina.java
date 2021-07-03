package esercizio3;

public class Officina {
	private Macchina[] macchineInRiparazione = new Macchina[10];

	public boolean aggiungiMacchina(Macchina m) {
		for (int i = 0; i < macchineInRiparazione.length; i++) {
			if (macchineInRiparazione[i] == null) {
				macchineInRiparazione[i] = m;
				return true;
			}
		}
		return false;
	}

//	public void eliminaMacchina(Macchina mac) {
//		for (int i = 0; i < macchineInRiparazione.length; i++) {
//			if (macchineInRiparazione.length[i]== mac) {
//				mac = null;
//			}
//		}
//	}

	public Macchina[] getMacchineInRiparazione() {
		return macchineInRiparazione;
	}

	public void setMacchineInRiparazione(Macchina[] macchineInRiparazione) {
		this.macchineInRiparazione = macchineInRiparazione;
	}
}
