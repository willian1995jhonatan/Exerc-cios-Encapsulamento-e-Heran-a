package main;

import model.Carro;
import model.Moto;

public class main {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setNome("uno");
		carro.setAno(1994);
		carro.setMarca("Fiat");
		carro.setPortas(2);
		carro.setRodas(4);
		carro.setTurbo(false);
		carro.setTetoSolar(false);
		carro.setVelocidade(15);
		
		carro.acelerar(30);
		carro.freiar(5);
		carro.curva();
		carro.acelerar(50);
		carro.curva();
		
		Moto moto = new Moto();
		
		moto.setAno(2008);
		moto.setBagageiro(true);
		moto.setMarca("Yamaha");
		moto.setNome("FZ25");
		moto.setRodas(2);
		moto.setSuporte(true);
		moto.setVelocidade(0);

		moto.freiar(1);
		moto.acelerar(50);
		moto.freiar(10);
		moto.curva();
		moto.acelerar(30);
		moto.curva();
	}

}
