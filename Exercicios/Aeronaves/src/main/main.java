package main;

//Exercício 1

import model.Aeronaves;

public class main {

	public static void main(String[] args) {
		
		Aeronaves aeronave = new Aeronaves();
		
		aeronave.setNomeAeronave("Passáro Marrom");
		aeronave.setHelice(true);
		aeronave.setCorAeronave("Marrom");
		aeronave.setAnoAeronave("1995");
		
		
		aeronave.voar();
		aeronave.emDia();

	}

}
