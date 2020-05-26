package model;

public class Moto extends Veiculo{
	
	private boolean suporte;
	private boolean bagageiro;
	
	public boolean isBagageiro() {
		return bagageiro;
	}
	public void setBagageiro(boolean bagageiro) {
		this.bagageiro = bagageiro;
	}
	public boolean isSuporte() {
		return suporte;
	}
	public void setSuporte(boolean suporte) {
		this.suporte = suporte;
	}
	
	public void empinar() {
		System.out.println("A moto " + getNome() + " está empinando");
	}
}
