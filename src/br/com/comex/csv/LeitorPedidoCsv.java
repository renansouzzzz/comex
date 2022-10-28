package br.com.comex.csv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorPedidoCsv {
	
	public List<PedidoCsv> readerPedidoCsv() throws FileNotFoundException {		
		List<PedidoCsv> pedidos = new ArrayList<PedidoCsv>();

		InputStream file = new FileInputStream("pedidos.csv");
		Scanner scanner = new Scanner(file);
		
		scanner.nextLine();
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			String split[] = linha.split(",");

			String categoria = split[0];
			String produto = split[1];
			String preco = split[2];
			String quantidade = split[3];
			String data = split[4]; 

			PedidoCsv pedido = new PedidoCsv(categoria, produto, preco, quantidade, data);	
			pedidos.add(pedido);
		}
		
		scanner.close();
		
		return pedidos;
	} 

}
	
