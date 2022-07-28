package entities;

public class Produto {

	private String nome;
	private Double preco;
	private int quantidade;
	private String descricao;
	
	public Produto(String nome, Double preco, int quantidade, String descricao) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.descricao = descricao;
	}
	
	public Produto(String nome, Double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "Produto {\nnome=" + nome + ",\npreco=" + preco + ",\nquantidade em estoque =" + quantidade + ",\ndescricao=" + descricao
				+ "}";
	}
	
}
