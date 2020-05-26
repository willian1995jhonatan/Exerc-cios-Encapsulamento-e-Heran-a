package model;

//Exercício 1

public class Aeronaves {
	private String nomeAeronave;
	
	private String corAeronave;
	
	private boolean helice;
	
	private String anoAeronave;

	public String getNomeAeronave() {
		return nomeAeronave;
	}

	public void setNomeAeronave(String nomeAeronave) {
		this.nomeAeronave = nomeAeronave;
	}

	public String getCorAeronave() {
		return corAeronave;
	}

	public void setCorAeronave(String corAeronave) {
		this.corAeronave = corAeronave;
	}

	public boolean isHelice() {
		return helice;
	}

	public void setHelice(boolean helice) {
		this.helice = helice;
	}

	public String getAnoAeronave() {
		return anoAeronave;
	}

	public void setAnoAeronave(String anoAeronave) {
		this.anoAeronave = anoAeronave;
	}
	
	public void voar() {
		System.out.println("A Aeronave " + this.nomeAeronave + " está voando!");
	}
	
	public void emDia() {
		System.out.println("A Aeronave "+this.nomeAeronave + " está com a manutenção em dia");
	}
	
}
