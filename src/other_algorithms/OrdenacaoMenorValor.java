package other_algorithms;

public class OrdenacaoMenorValor {

	public static void main(String[] args) {
		Produto produtos[] = new Produto[5];
		produtos[0] = new Produto ("Lamborghini", 1000000);
		produtos[1] = new Produto("Jipe", 46000);
		produtos[2] = new Produto("Brasília", 16000);
		produtos[3] = new Produto("Smart", 46000);
		produtos[4] = new Produto("Fusca", 17000);
		
		OrdenacaoMenorValor.ordernar(produtos);
	}

	private static void ordernar(Produto produtos[]) {
		for (int atual = 0; atual < produtos.length; atual++) {
			int menor = OrdenacaoMenorValor.buscaMenor(produtos, atual);
			Produto produtoAtual = produtos[atual];
			Produto produtoMenor = produtos[menor];
			produtos[atual] = produtoMenor;
			produtos[menor] = produtoAtual;
		}
		for(Produto produto : produtos) {
			System.out.println(produto.getNome() + " custa " + produto.getPreco());
		};		
	}
	
	private static int buscaMenor(Produto produtos[], int inicio) {
		int maisBarato = inicio;	
		for (int atual = inicio; atual < produtos.length; atual++) {
			if(produtos[atual].getPreco() < produtos[maisBarato].getPreco())
				maisBarato = atual;
		}
		return maisBarato;
	}
	
	private static class Produto {
		private final String nome;
		private final double preco;
		
		public Produto(String nome, double preco) {
			this.nome = nome;
			this.preco = preco;
		}

		public double getPreco() {
			return preco;
		}
		
		public String getNome() {
			return nome;
		}
				
		@Override
		public String toString() {
			return String.valueOf(preco);
		}
	}
	
}
