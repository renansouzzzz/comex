package br.com.comex.csv;

import java.util.Comparator;

public class ComparadorPorPreco implements Comparator<PedidoCsv> {

	@Override
	public int compare(PedidoCsv p1, PedidoCsv p2) {

		double preco1 = Double.parseDouble(p1.getPreco());
		double preco2 = Double.parseDouble(p2.getPreco());
		
		int quantidade1 = Integer.parseInt(p1.getQuantidade());
		int quantidade2 = Integer.parseInt(p2.getQuantidade());
		
		preco1 = preco1 * quantidade1;
		preco2 = preco2 * quantidade2;

		if (preco1 == preco2) {
			return 0;
		} else if (preco1 > preco2) {
			return 1;
		} else {
			return -1;
		}
		
	}
	
}