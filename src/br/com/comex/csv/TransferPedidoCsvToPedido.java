package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.List;

public class TransferPedidoCsvToPedido {
	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidoCsv leitor = new LeitorPedidoCsv();
		List<PedidoCsv> pedidosCsv = leitor.readerPedidoCsv();
		
		
	}
}
