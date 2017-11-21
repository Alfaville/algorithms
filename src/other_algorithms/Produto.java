package other_algorithms;

public class Produto {

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
