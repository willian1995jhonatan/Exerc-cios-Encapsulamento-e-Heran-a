package main;

import model.carro;
import model.moto;

public class main {

	public static void main(String[] args) {
		
		carro carro = new carro();
		
		carro.setNomeCarro("Audi");
		carro.setAnoCarro("2020");
		carro.setCorCarro("Branco");
		carro.setDirecaoHidraulica(true);
		carro.setQuatroRodas(true);
		
		carro.andar();
		carro.cor();
		
		
		System.out.println("\n-------------------------\n");
		
		moto moto = new moto();
		
		moto.setDuasRodas(true);
		moto.setNomeMoto("Ninja");
		moto.setModelo("Kawasaki");
		
		
		moto.acelerando();
		moto.regularizada();
		
	}
}
