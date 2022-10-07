package br.com.comex.csv;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class PedidoMaisBaratoEMaisCaro {
	
	public static void main(String[] args) throws IOException {
		
		LeitorPedidoCsv leitor = new LeitorPedidoCsv();
		List<PedidoCsv> pedidosCsv = leitor.readerPedidoCsv();
		ComparadorPorPreco comparar = new ComparadorPorPreco();
		Locale ptBr = new Locale("pt", "BR");
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(ptBr);						
		pedidosCsv.sort(comparar);
		
		double quantidadeDoubleB = Double.parseDouble(pedidosCsv.get(0).getQuantidade());
		double quantidadeDoubleC = Double.parseDouble(pedidosCsv.get(pedidosCsv.size() - 1).getQuantidade());
		
		System.out.println("Pedido mais barato: " + nf.format(Double.parseDouble(pedidosCsv.get(0).getPreco()) * quantidadeDoubleB)+ " (" + pedidosCsv.get(0).getProduto() + ")");
		System.out.println("Pedido mais caro: " + nf.format(Double.parseDouble(pedidosCsv.get(pedidosCsv.size() - 1).getPreco()) * quantidadeDoubleC) + " (" + pedidosCsv.get(pedidosCsv.size() - 1).getProduto() + ")");
		
		
	}
	
	
}


