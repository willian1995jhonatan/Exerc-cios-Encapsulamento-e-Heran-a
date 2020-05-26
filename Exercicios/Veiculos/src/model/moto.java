package model;

public class moto {
	
	private String nomeMoto;
	private boolean duasRodas;
	private String modelo;
	public String getNomeMoto() {
		return nomeMoto;
	}
	public void setNomeMoto(String nomeMoto) {
		this.nomeMoto = nomeMoto;
	}
	public boolean isDuasRodas() {
		return duasRodas;
	}
	public void setDuasRodas(boolean duasRodas) {
		this.duasRodas = duasRodas;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void acelerando() {
		System.out.println("A moto " + this.nomeMoto + " está acelerando!");
	}
	
	public void regularizada() {
		System.out.println("A moto " + this.nomeMoto + " está regularizada!");
	}

}
