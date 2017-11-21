package other_algorithms;

public class InsertionSort {

	public static void main(String[] args) {
		Produto produtos[] = new Produto[5];
		produtos[1] = new Produto("Iphone 8", 6500);
		produtos[3] = new Produto("Galax S7", 2600);
		produtos[0] = new Produto("Iphone X", 7500);
		produtos[4] = new Produto("Nokia", 50);
		produtos[2] = new Produto("Iphone 7", 3000);
		
		InsertionSort.ordenar(produtos);
		for(Produto produto : produtos) {
			System.out.println(produto.getNome() + " custa " + produto.getPreco());
		};		
	}
	
	//2,7,8,10
	private static void ordenar(Produto produtos[]) {		
		for (int atual = 0; atual < produtos.length; atual++) {
			int analise = atual;
			while(analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
				Produto produtoAnalise = produtos[analise];
				Produto produtoAnaliseMenos1 = produtos[analise -1];
				produtos[analise] = produtoAnaliseMenos1;
				produtos[analise -1] = produtoAnalise;
				analise--;
			}
		}
	}
	
}
