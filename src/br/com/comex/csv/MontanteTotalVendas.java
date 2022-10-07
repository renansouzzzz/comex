package br.com.comex.csv;

import java.io.IOException;
import java.util.List;

public class MontanteTotalVendas {
	
	public static void main(String[] args) throws IOException {
		
		LeitorPedidoCsv leitor = new LeitorPedidoCsv();
		List<PedidoCsv> pedidosCsv = leitor.readerPedidoCsv();
		double soma = 0;
		
		for (PedidoCsv item : pedidosCsv) {
			String vendas = item.getPreco();
			String quantidades = item.getQuantidade();
			
			double parseVendas = Double.parseDouble(vendas);
			double parseQuantidades = Double.parseDouble(quantidades);
			
			soma = soma + parseVendas * parseQuantidades;
		}
		
		System.out.println("Montante de vendas: " + soma);
		
		
	}
}
