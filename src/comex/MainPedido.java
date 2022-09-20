package comex;

public class MainPedido {
	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(1, "15/09/2022", new Cliente(1, "Ana", "333.333.333-33", "(22)2222-1222", "Rua Souza Aparecida", 44, "Apartamento", 
				"Jd. Mourisco", "Ubatuba", "SP"));
		
		Pedido pedido2 = new Pedido(2, "18/09/2022", new Cliente(2, "Eli", "222.222.222-22", "(11)1111-1111", "Rua Barbosa Silva", 23, "Casa", 
				"Vila Araújo", "São José", "SP"));
		
		Pedido pedido3 = new Pedido(3, "19/09/2022", new Cliente(3, "Gabi", "444.444.444-44", "(44)4444-4444", "Avenida Silveira", 108, "Prédio 3", 
				"Gaslheu", "Pouso Alegre", "MG"));
		
		Pedido pedido4 = new Pedido(4, "13/09/2022", new Cliente(3, "Marcelo", "555.555.555-55", "(44)4444-4444", "Avenida Silveira", 108, "Prédio 3", 
				"Machel", "Porto", "Portugal"));
		
		System.out.println("Pedido " + pedido1.id + ":");
		System.out.println("Data: " + pedido1.data);
		System.out.println("Cliente: " + pedido1.cliente.getNome());
		
		System.out.println("");
		System.out.println("Pedido " + pedido2.id + ":");
		System.out.println("Data: " + pedido2.data);
		System.out.println("Cliente: " + pedido2.cliente.getNome());
		
		System.out.println("");
		System.out.println("Pedido " + pedido3.id + ":");
		System.out.println("Data: " + pedido3.data);
		System.out.println("Cliente: " + pedido3.cliente.getNome());
		
		System.out.println("");
		System.out.println("Pedido " + pedido4.id + ":");
		System.out.println("Data: " + pedido4.data);
		System.out.println("Cliente: " + pedido4.cliente.getNome());
	}
}
