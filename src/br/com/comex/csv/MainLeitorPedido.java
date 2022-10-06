package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.List;

public class MainLeitorPedido {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidoCsv leitor = new LeitorPedidoCsv();
		List<PedidoCsv> pedidosCsv = leitor.readerPedidoCsv();
		
		int contador = 0;
		
		for (PedidoCsv linha : pedidosCsv) {
			contador++;
		}
		
		System.out.println("Total de pedidos: " + contador);
		}

}
