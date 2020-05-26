package main;

import Eletrodomesticos.Eletrodomesticos;

public class main {

	public static void main(String[] args) {
		
		Eletrodomesticos eletrodomestico = new Eletrodomesticos();
		
		eletrodomestico.setNomeEletro("Geladeira");
		eletrodomestico.setCorEletro("Presto");
		eletrodomestico.setAnoEletro("2020");
		eletrodomestico.setTemPes(true);
		
		eletrodomestico.voltagem220();
		eletrodomestico.casasBahia();
		
		

	}

}
