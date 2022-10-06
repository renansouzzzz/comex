package br.com.comex.csv;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class MontanteTotalVendas {
	
	public static void main(String[] args) throws IOException {
		
		double total = 0;	
		FileInputStream file = new FileInputStream("pedidos.csv");
		Scanner scanner = new Scanner(file);
				
		scanner.nextLine();
		
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			String split[] = linha.split(",");
			double parse = Float.parseFloat(split[2]);

			total = total + parse;			
		}
		scanner.close();
			
	System.out.println("Total de produtos vendidos: " + total);
	}
}
