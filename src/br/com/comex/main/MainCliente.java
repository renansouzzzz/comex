package br.com.comex.main;

import br.com.comex.models.Cliente;
import br.com.comex.models.Cliente.Estado;

public class MainCliente {
	public static void main(String[] args) {
	Cliente Ana = new Cliente("Ana Paula", "333.333.333-33", "(11) 1 1111-1111", "Rua Souza Aparecida", "44", "Apartamento", 
			"Jd. Mourisco", "Ubatuba", Estado.AM);
	
	Cliente Eli = new Cliente("Eli José", "222.222.222-22", "(22) 2 2222-2222", "Rua Barbosa Silva", "23", "Casa", 
			"Vila Araújo", "São José", Estado.SP);
	
	Cliente Gabi = new Cliente("Gabi Moura", "444.444.444-44", "(33) 3 333-3333", "Avenida Silveira", "108", "Prédio 3", 
			"Gaslheu", "Pouso Alegre", Estado.MG);
	
	System.out.println("-----------------------------");
	System.out.println("| ID: " + Ana.getId() + "                     |");
	System.out.println("| Nome: " + Ana.getNome() + "           |");
	System.out.println("| CPF: " + Ana.getCpf() + "       |");
	System.out.println("| Telefone: " + Ana.getTelefone() + "   |");
	System.out.println("| Rua: " + Ana.getRua() + "  |");
	System.out.println("| Número do endereço: " + Ana.getNumeroEnd() + "    |");
	System.out.println("| Complemento: " + Ana.getComplemento() + "  |");
	System.out.println("| Bairro: " + Ana.getBairro() + "      |");
	System.out.println("| Cidade: " + Ana.getCidade() + "           |");
	System.out.println("| Estado: " + Ana.getEstado() + "                |");
	System.out.println("-----------------------------");
	
	System.out.println("-----------------------------");
	System.out.println("| ID: " + Eli.getId() + "                     |");
	System.out.println("| Nome: " + Eli.getNome() + "            |");
	System.out.println("| CPF: " + Eli.getCpf() + "       |");
	System.out.println("| Telefone: " + Eli.getTelefone() + "   |");
	System.out.println("| Rua: " + Eli.getRua() + "    |");
	System.out.println("| Número do endereço: " + Eli.getNumeroEnd() + "    |");
	System.out.println("| Complemento: " + Eli.getComplemento() + "         |");
	System.out.println("| Bairro: " + Eli.getBairro() + "       |");
	System.out.println("| Cidade: " + Eli.getCidade() + "          |");
	System.out.println("| Estado: " + Eli.getEstado() + "                |");
	System.out.println("-----------------------------");
	
	System.out.println("-----------------------------");
	System.out.println("| ID: " + Gabi.getId() + "                     |");
	System.out.println("| Nome: " + Gabi.getNome() + "          |");
	System.out.println("| CPF: " + Gabi.getCpf() + "       |");
	System.out.println("| Telefone: " + Gabi.getTelefone() + "   |");
	System.out.println("| Rua: " + Gabi.getRua() + "     |");
	System.out.println("| Número do endereço: " + Gabi.getNumeroEnd() + "   |");
	System.out.println("| Complemento: " + Gabi.getComplemento() + "     |");
	System.out.println("| Bairro: " + Gabi.getBairro() + "           |");
	System.out.println("| Cidade: " + Gabi.getCidade() + "      |");
	System.out.println("| Estado: " + Gabi.getEstado() + "                |");
	System.out.println("-----------------------------");
	

	
	}
	
}

	