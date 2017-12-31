package other_algorithms;

/**
 * Ordenacao por selecao (Selection Short)
 * 
 * @author alfaville
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		Produto produtos[] = new Produto[5];
		produtos[1] = new Produto("Iphone 8", 6500);
		produtos[3] = new Produto("Galax S7", 2600);
		produtos[0] = new Produto("Iphone X", 7500);
		produtos[4] = new Produto("Nokia", 50);
		produtos[2] = new Produto("Iphone 7", 3000);
		
		System.out.println("Nao ordenado:");
		for(Produto produto : produtos) {			
			System.out.println(produto.getNome() + " custa " + produto.getPreco());
		};	
				
		System.out.println("\n");
		SelectionSort.ordenar(produtos);		
		System.out.println("\n");
		
		System.out.println("Ordenado:");
		for(Produto produto : produtos) {
			System.out.println(produto.getNome() + " custa " + produto.getPreco());
		};		
	}
	
	private static void ordenar(Produto produtos[]) {
		for (int atual = 0; atual < produtos.length - 1; atual++) { // n^2 - 2n^2
			System.out.println("Estou na posicao " + atual);
			int menor = SelectionSort.buscaMenor(produtos, atual);
			Produto produtoAtual = produtos[atual];
			Produto produtoMenor = produtos[menor];
			produtos[atual] = produtoMenor;
			produtos[menor] = produtoAtual;
			System.out.println("posicao[" + atual + "] = " + produtos[atual].getPreco() + " trocada com a posicao[" + menor + "] = " + produtos[menor].getPreco());
		}
	}
	
	private static int buscaMenor(Produto produtos[], int posicao) {
		int maisBarato = posicao;	
		for (int atual = posicao; atual <= produtos.length - 1; atual++) { 
			if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) //if false => n else 2n
				maisBarato = atual;
		}
		return maisBarato;
	}
	
}
