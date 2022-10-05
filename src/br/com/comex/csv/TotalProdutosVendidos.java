package br.com.comex.csv;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TotalProdutosVendidos {
	
	public static void main(String[] args) throws IOException {
		
		int total = 0;	
		FileInputStream file = new FileInputStream("pedidos.csv");
		Scanner scanner = new Scanner(file);
				
		scanner.nextLine();
		
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			String split[] = linha.split(",");
			int parse = Integer.parseInt(split[3]);

			total = total + parse;			
		}
		scanner.close();
			
	System.out.println("Total de produtos vendidos: " + total);
	}
}
