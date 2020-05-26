package model;

public class carro extends veiculo {
		
		private String nomeCarro;
		
		private String anoCarro;
		
		private String corCarro;

		public String getNomeCarro() {
			return nomeCarro;
		}

		public void setNomeCarro(String nomeCarro) {
			this.nomeCarro = nomeCarro;
		}

		public String getAnoCarro() {
			return anoCarro;
		}

		public void setAnoCarro(String anoCarro) {
			this.anoCarro = anoCarro;
		}

		public String getCorCarro() {
			return corCarro;
		}

		public void setCorCarro(String corCarro) {
			this.corCarro = corCarro;
		}
		
		public void andar() {
			System.out.println("O carro " + this.nomeCarro + " está funcionando!");
		}
		
		public void cor() {
			System.out.println("A cor do carro é " + this.corCarro + "!");
		}

	

}
