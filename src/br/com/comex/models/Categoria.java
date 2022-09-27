package br.com.comex.models;

import java.util.concurrent.atomic.AtomicInteger;

public class Categoria {
	private static AtomicInteger count = new AtomicInteger(0);
	private int id;
	private String nome;
	String aux;
	statusCat status;

	IllegalArgumentException ex = new IllegalArgumentException();
	
	
	public Categoria(String nome, statusCat status) {
		this.id = count.incrementAndGet();
		this.nome = nome;
	}
	
	public Categoria(Categoria cat) {
		if (id <= 0 | nome.length() < 3 |
				cat.status != statusCat.ATIVA |
				cat.status != statusCat.INATIVA) throw ex;
	}
		
	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}
	
	public enum statusCat {
		ATIVA, INATIVA;
	}
	
	public statusCat getStatus() {
		return status;
	}

}
