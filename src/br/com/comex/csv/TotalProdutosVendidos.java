package br.com.comex.csv;

import java.io.IOException;
import java.util.List;

public class TotalProdutosVendidos {
	
	public static void main(String[] args) throws IOException {
		
		LeitorPedidoCsv leitor = new LeitorPedidoCsv();
		List<PedidoCsv> pedidosCsv = leitor.readerPedidoCsv();
		
		int total = 0;
		
		for (PedidoCsv produto : pedidosCsv) {
			int parse = Integer.parseInt(produto.getQuantidade());
			total = total + parse;
		}
		
		System.out.println("Total de produtos vendidos: " + total);

	}
}
