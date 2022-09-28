package br.com.comex.main;

import br.com.comex.models.*;

public class MainCalculadoraValorTotal {
	public static void main(String[] args) throws MyException {
		Pedido pedido1 = new Pedido(1, "15/09/2022", new Cliente("Ana", "333.333.333-33", "(22)2222-1222", "Rua Souza Aparecida", "44", "Apartamento", 
				"Jd. Mourisco", "Ubatuba", "SP"));
		
		Pedido pedido2 = new Pedido(2, "18/09/2022", new Cliente("Eli", "222.222.222-22", "(11)1111-1111", "Rua Barbosa Silva", "23", "Casa", 
				"Vila Araújo", "São José", "SP"));
		
		Pedido pedido3 = new Pedido(3, "19/09/2022", new Cliente("Gabi", "444.444.444-44", "(44)4444-4444", "Avenida Silveira", "108", "Prédio 3", 
				"Gaslheu", "Pouso Alegre", "MG"));
		
		Pedido pedido4 = new Pedido(4, "13/09/2022", new Cliente("Marcelo", "555.555.555-55", "(44)4444-4444", "Rodovia Dutra", "56", "Casa", 
				"Machel", "Porto", "GO"));
		
		ProdutoConstructor produto1 = new ProdutoConstructor("Óculos de Sol", 170.00, 4, "Acessório");
		ProdutoConstructor produto2 = new ProdutoConstructor("Monitor 144hz", 1760.00, 7, "Tecnologia");
		ProdutoConstructor produto3 = new ProdutoConstructor("Carregador Dell", 260.00, 2, "Tecnologia");
		ProdutoConstructor produto4 = new ProdutoConstructor("Violão 6 acordes", 670.00, 1, "Instrumento");
		
		
		ItemPedido itemPedido1 = new ItemPedido(1, 170.00, 2, produto1, pedido1, 0, 0);
		ItemPedido itemPedido2 = new ItemPedido(2, 1760.00, 5, produto2, pedido2, 0, 0);
		ItemPedido itemPedido3 = new ItemPedido(3, 260.00, 3, produto3, pedido3, 0, 0);
		ItemPedido itemPedido4 = new ItemPedido(4, 670.00, 11, produto4, pedido4, 0, 0);
		
		CalculadoraValorTotal calculo = new CalculadoraValorTotal(0, 0, 0, produto1, pedido1, 0, 0);
		
		
		System.out.println("Item do pedido " + itemPedido1.getId() + ":");
		System.out.println("Calculo total: " + calculo.calcula(produto1));
				
		System.out.println("");
		System.out.println("Item do pedido " + itemPedido2.getId() + ":");
		System.out.println("Calculo total: " + calculo.calcula(produto1));

		
		System.out.println("");
		System.out.println("Item do pedido " + itemPedido3.getId() + ":");
		System.out.println("Calculo total: " + calculo.calcula(produto1));

		
		System.out.println("");
		System.out.println("Item do pedido " + itemPedido4.getId() + ":");
		System.out.println("Calculo total: " + itemPedido4.calculaDesconto());

	
	}

}
