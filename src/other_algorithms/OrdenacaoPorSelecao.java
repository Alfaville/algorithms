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
		
		System.out.println("Não ordenado:");
		for(Produto produto : produtos) {			
			System.out.println(produto.getNome() + " custa " + produto.getPreco());
		};	
				
		System.out.println("\n");
		OrdenacaoPorSelecao.ordenar(produtos);		
		System.out.println("\n");
		
		System.out.println("Ordenado:");
		for(Produto produto : produtos) {
			System.out.println(produto.getNome() + " custa " + produto.getPreco());
		};		
	}
	
	private static void ordenar(Produto produtos[]) {
		for (int atual = 0; atual < produtos.length - 1; atual++) {
			System.out.println("Estou na posição " + atual);
			int menor = OrdenacaoPorSelecao.buscaMenor(produtos, atual);
			Produto produtoAtual = produtos[atual];
			Produto produtoMenor = produtos[menor];
			produtos[atual] = produtoMenor;
			produtos[menor] = produtoAtual;
			System.out.println("posição[" + atual + "] = " + produtos[atual].getPreco() + " trocada com a posição[" + menor + "] = " + produtos[menor].getPreco());
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
