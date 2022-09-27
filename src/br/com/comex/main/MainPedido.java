package br.com.comex.main;

import br.com.comex.models.Cliente;
import br.com.comex.models.Pedido;

public class MainPedido{
	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(1, "15/09/2022", new Cliente(1, "Ana", "333.333.333-33", "(22)2222-1222", "Rua Souza Aparecida", 44, "Apartamento", 
				"Jd. Mourisco", "Ubatuba", "SP"));
		
		Pedido pedido2 = new Pedido(2, "18/09/2022", new Cliente(2, "Eli", "222.222.222-22", "(11)1111-1111", "Rua Barbosa Silva", 23, "Casa", 
				"Vila Araújo", "São José", "SP"));
		
		Pedido pedido3 = new Pedido(3, "19/09/2022", new Cliente(3, "Gabi", "444.444.444-44", "(44)4444-4444", "Avenida Silveira", 108, "Prédio 3", 
				"Gaslheu", "Pouso Alegre", "MG"));
		
		Pedido pedido4 = new Pedido(4, "13/09/2022", new Cliente(3, "Marcelo", "555.555.555-55", "(44)4444-4444", "Rodovia Dutra", 56, "Casa", 
				"Machel", "Porto", "GO"));
		
		System.out.println("Pedido " + pedido1.getId() + ":");
		System.out.println("Data: " + pedido1.getData());
		System.out.println("Cliente: " + pedido1.cliente.getNome());
		
		System.out.println("");
		System.out.println("Pedido " + pedido2.getId() + ":");
		System.out.println("Data: " + pedido2.getData());
		System.out.println("Cliente: " + pedido2.cliente.getNome());
		
		System.out.println("");
		System.out.println("Pedido " + pedido3.getId() + ":");
		System.out.println("Data: " + pedido3.getData());
		System.out.println("Cliente: " + pedido3.cliente.getNome());
		
		System.out.println("");
		System.out.println("Pedido " + pedido4.getId() + ":");
		System.out.println("Data: " + pedido4.getData());
		System.out.println("Cliente: " + pedido4.cliente.getNome());
	}
}
