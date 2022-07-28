package aplication;

import java.util.ArrayList;
import java.util.List;

import entities.ItemVenda;
import entities.Produto;
import entities.Usuario;
import entities.Venda;

public class LojaTgid {

	public static void main(String[] args) {

		Usuario usuario = new Usuario("João", "123.456.789-00", "joao@gmail.com");

		/* lista com os produtos */
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto("Notebook", 2000.0, 2, "Notebook dell"));
		produtos.add(new Produto("Mouse", 50.0, 3, "Mouse Logitech"));
		produtos.add(new Produto("Teclado", 100.0, 1, "Teclado Logitech"));
		produtos.add(new Produto("Monitor", 500.0, 1, "Monitor LG"));
		produtos.add(new Produto("Cadeira", 200.0, 2, "Cadeira de escritório"));

		/* lista com os itens da venda */
		List<ItemVenda> itens = new ArrayList<ItemVenda>();
		itens.add(new ItemVenda(produtos.get(0), 2));
		itens.add(new ItemVenda(produtos.get(1), 3));
		itens.add(new ItemVenda(produtos.get(2), 1));
		itens.add(new ItemVenda(produtos.get(3), 1));
		itens.add(new ItemVenda(produtos.get(4), 2));

		/* soma o valor dos produtos comprados*/
		double valorTotal = 0;
		for (ItemVenda item : itens) {
			valorTotal += item.getValorTotal();
		}

		/* cria a venda */
		Venda venda = new Venda(usuario, itens, valorTotal );

		/* relatorio de venda */
		System.out.println("Relatório de Venda");
		System.out.println("=================");
		System.out.println("Usuário: " + venda.getUsuario().getNome());
		System.out.println("Itens:");
		
		/* faz o loop para imprimir os itens da venda */
		for (ItemVenda item : venda.getItens()) {
			System.out.println("\t" + item.getProduto().getNome() + " - " + item.getQuantidade() + "x" + item.getProduto().getPreco());
		}
		System.out.println("Valor Total: R$ " + venda.getValorTotal());

	}

}
