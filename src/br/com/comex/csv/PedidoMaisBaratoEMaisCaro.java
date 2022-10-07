package br.com.comex.csv;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class PedidoMaisBaratoEMaisCaro {
	
	public static void main(String[] args) throws IOException {
		
		LeitorPedidoCsv leitor = new LeitorPedidoCsv();
		List<PedidoCsv> pedidosCsv = leitor.readerPedidoCsv();
		List<Double> precos = new ArrayList<Double>();
		Locale ptBr = new Locale("pt", "BR");
		
		for (PedidoCsv preco : pedidosCsv) {
			double precosProd = Double.parseDouble(preco.getPreco());
			precos.add(precosProd);
		}
				
		Collections.sort(precos);
		
		System.out.println("Pedido mais barato: " + NumberFormat.getCurrencyInstance(ptBr).format(precos.get(0)));
		System.out.println("Pedido mais caro: " + NumberFormat.getCurrencyInstance(ptBr).format(precos.get(precos.size() - 1)));

	}
}
