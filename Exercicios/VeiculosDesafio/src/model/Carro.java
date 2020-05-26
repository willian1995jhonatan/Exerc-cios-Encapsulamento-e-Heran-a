package model;

public class Carro extends Veiculo{

	private int portas;
	private boolean turbo;
	private boolean tetoSolar;
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public boolean isTurbo() {
		return turbo;
	}
	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	public boolean isTetoSolar() {
		return tetoSolar;
	}
	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}
	
	public void derrapar() {
		System.out.println("O carro " + getNome() + " está derrapando");
	}
}
