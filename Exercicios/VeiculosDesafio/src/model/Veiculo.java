package model;

public class Veiculo {
	
	private String nome;
	private int ano;
	private String marca;
	private int velocidade;
	private int rodas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	
	public void acelerar(int vezes) {
		for(int i = 0; i < vezes; i++) {
			this.velocidade++;
		}
		System.out.println("O veiculo " + this.nome + " está a " + this.velocidade + " km/h ");
	}
	public void freiar(int vezes) {
		for(int i = 0; i < vezes; i++) {
			if ((int)this.velocidade >0) {
				this.velocidade--;
				System.out.println("O veiculo " + this.nome + " está a " + this.velocidade + " km/h ");
			}
			else {
				System.out.println("O veiculo " + this.nome + " já está parado");
				break;
			}
		}
	}
	public void curva() {
		System.out.println("O veiculo" + this.nome + "está fazendo uma curva");
		if((int)this.velocidade >= 70) {
			this.capotamento();
		}
	}
	private void capotamento() {
		System.out.println("O veiculo" + this.nome + "capotou");
	}
}
