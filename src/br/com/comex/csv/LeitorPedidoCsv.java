package br.com.comex.csv;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LeitorPedidoCsv {
	
	public static void main(String[] args) throws IOException{
		
		int totalLinhas = 1;
		
		List lista = new ArrayList<PedidoCsv>();
		
		FileInputStream file = new FileInputStream("pedidos.csv");
		InputStreamReader reader = new InputStreamReader(file);
		BufferedReader bf = new BufferedReader(reader);
		
		String linha = bf.readLine();
		
		while(linha != null) {
			System.out.println(linha + "\n");
			linha = bf.readLine();
			totalLinhas++;
		}
		
		int linhas = totalLinhas - 2;
		lista.add(linhas);		
		
		System.out.println("Total de pedidos: " + lista);
		
		bf.close();
	}

}
