package br.com.comex.csv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TotalCategorias {
	public static void main(String[] args) throws FileNotFoundException {

		List lista = new ArrayList<PedidoCsv>();
		FileInputStream file = new FileInputStream("pedidos.csv");
		Scanner scanner = new Scanner(file);
				
		scanner.nextLine();
		String split[] = null;

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			split = linha.split(",");
			if(lista.contains(split[0])) continue;
				lista.add(split[0]);
		}

		scanner.close();
			
	System.out.println("Total de categorias: " + lista.size() + "  -  " + lista);

	
	}		
}


	

