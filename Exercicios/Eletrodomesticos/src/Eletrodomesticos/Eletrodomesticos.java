package Eletrodomesticos;

public class Eletrodomesticos {

	private String nomeEletro;
	
	private String corEletro;
	
	private String anoEletro;
	
	private boolean temPes;

	public String getNomeEletro() {
		return nomeEletro;
	}

	public void setNomeEletro(String nomeEletro) {
		this.nomeEletro = nomeEletro;
	}

	public String getCorEletro() {
		return corEletro;
	}

	public void setCorEletro(String corEletro) {
		this.corEletro = corEletro;
	}

	public String getAnoEletro() {
		return anoEletro;
	}

	public void setAnoEletro(String anoEletro) {
		this.anoEletro = anoEletro;
	}

	public boolean isTemPes() {
		return temPes;
	}

	public void setTemPes(boolean temPes) {
		this.temPes = temPes;
	}
	
	public void voltagem220() {
		System.out.println("O eletrodoméstico " + this.nomeEletro + " tem a voltagem de 220!");
	}
	
	public void casasBahia() {
		System.out.println("O eletrodoméstico "+this.nomeEletro + " foi comprado na casas bahia");
	}
	
	

}
