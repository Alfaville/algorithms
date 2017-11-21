package other_algorithms;

/**
 * Ordenação por seleção (Selection Short)
 * -> Resolver problemas de ordenação
 * 
 * @author alfaville
 *
 */
public class OrdenacaoPorSelecao {

	public static void main(String[] args) {
		Produto produtos[] = new Produto[5];
		produtos[1] = new Produto("Iphone 8", 6500);
		produtos[3] = new Produto("Galax S7", 2600);
		produtos[0] = new Produto("Iphone X", 7500);
		produtos[4] = new Produto("Nokia", 50);
		produtos[2] = new Produto("Iphone 7", 3000);
		
		OrdenacaoPorSelecao.ordenar(produtos);
		for(Produto produto : produtos) {
			System.out.println(produto.getNome() + " custa " + produto.getPreco());
		};		
	}
	
	private static void ordenar(Produto produtos[]) {
		for (int atual = 0; atual < produtos.length - 1; atual++) {
			int menor = OrdenacaoPorSelecao.buscaMenor(produtos, atual);
			Produto produtoAtual = produtos[atual];
			Produto produtoMenor = produtos[menor];
			produtos[atual] = produtoMenor;
			produtos[menor] = produtoAtual;
		}
	}
	
	private static int buscaMenor(Produto produtos[], int inicio) {
		int maisBarato = inicio;	
		for (int atual = inicio; atual <= produtos.length - 1; atual++) {
			if(produtos[atual].getPreco() < produtos[maisBarato].getPreco())
				maisBarato = atual;
		}
		return maisBarato;
	}
	
}
