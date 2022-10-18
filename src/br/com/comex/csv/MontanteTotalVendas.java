package br.com.comex.csv;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class MontanteTotalVendas {
	
	public static void main(String[] args) throws IOException {
		
		LeitorPedidoCsv leitor = new LeitorPedidoCsv();
		List<PedidoCsv> pedidosCsv = leitor.readerPedidoCsv();
		double soma = 0;
		
		Locale ptBr = new Locale("pt", "BR");
		
		for (PedidoCsv item : pedidosCsv) {
			String vendas = item.getPreco();
			String quantidades = item.getQuantidade();
			
			double parseVendas = Double.parseDouble(vendas);
			double parseQuantidades = Double.parseDouble(quantidades);
			
			soma = soma + parseVendas * parseQuantidades;
		}
		
		System.out.println("Montante de vendas: " + NumberFormat.getCurrencyInstance(ptBr).format(soma));
		
		
	}
}
