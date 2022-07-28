package aplication;

import java.util.ArrayList;
import java.util.List;

import entities.ItemVenda;
import entities.Produto;
import entities.Usuario;
import entities.Venda;

public class LojaTgid {

	public static void main(String[] args) {

		/* lista de usuarios */
		Usuario usuario = new Usuario("James", "123.456.789-00", "james1232@gmail.com");

		/* lista de Produtos  */
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto("Notebook", 2000.0, 25, "Notebook dell"));
		produtos.add(new Produto("Mouse", 50.0, 30, "Mouse Logitech"));
		produtos.add(new Produto("Teclado", 100.0, 100, "Teclado Logitech"));
		produtos.add(new Produto("Monitor", 500.0, 100, "Monitor LG"));
		produtos.add(new Produto("Cadeira", 200.0, 25, "Cadeira de escritório"));

		/* lista de Vendas */
		List<ItemVenda> itens = new ArrayList<ItemVenda>();
		itens.add(new ItemVenda(produtos.get(0), 2));
		itens.add(new ItemVenda(produtos.get(1), 3));
		itens.add(new ItemVenda(produtos.get(2), 1));
		itens.add(new ItemVenda(produtos.get(3), 1));
		itens.add(new ItemVenda(produtos.get(4), 5));

		/* soma o valor dos produtos comprados */
		double valorTotal = 0;
		for (ItemVenda item : itens) {
			valorTotal += item.getValorTotal();
		}

		/* cria a venda */
		Venda compra = new Venda(usuario, itens, valorTotal);

		/* exibe os produtos do estoque */
		System.out.println("\nProdutos do estoque:");
		for (Produto produto : produtos) {
			System.out.println(produto + "\n" + "-----------------");
		}

		/* relatorio de venda */
		System.out.println("Relatório de Venda");
		System.out.println("=================");
		System.out.println("Usuário: " + compra.getUsuario().getNome());
		System.out.println("Itens:");

		/* faz o loop para imprimir os itens da venda, a quantidade e o valor */
		for (ItemVenda item : compra.getItens()) {
			System.out.println("\t" + item.getProduto().getNome() + " - " + item.getQuantidade() + "x"
					+ item.getProduto().getPreco());
		}
		System.out.println("Valor Total: R$ " + compra.getValorTotal());

	}

}
