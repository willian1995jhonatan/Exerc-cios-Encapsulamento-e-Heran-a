package model;

public class veiculo {
		
		private String nome;
		
		private String cor;
		
		private boolean quatroRodas;
		
		private String marca;
		
		private String anoFabricacao;
		
		private boolean direcaoHidraulica;

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public boolean isQuatroRodas() {
			return quatroRodas;
		}

		public void setQuatroRodas(boolean quatroRodas) {
			this.quatroRodas = quatroRodas;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getAnoFabricacao() {
			return anoFabricacao;
		}

		public void setAnoFabricacao(String anoFabricacao) {
			this.anoFabricacao = anoFabricacao;
		}

		public boolean isDirecaoHidraulica() {
			return direcaoHidraulica;
		}

		public void setDirecaoHidraulica(boolean direcaoHidraulica) {
			this.direcaoHidraulica = direcaoHidraulica;
		}
		
		public void andar() {
			System.out.println("O veículo " + this.nome + " está andando!");
		}
		
		public void funcionar() {
			System.out.println("O veículo " + this.nome + " está funiconando!");
		}
		

	

}
