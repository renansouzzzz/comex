package br.com.comex.models;

import java.util.concurrent.atomic.AtomicInteger;

public class Categoria {
	private static AtomicInteger count = new AtomicInteger(0);
	private int id;
	private String nome;
	statusE status;	
	
	public Categoria(String nome, statusE status) {
		if (id <= 0 | nome.length() < 3 |
				this.status != statusE.ATIVA |
				this.status != statusE.INATIVA) throw new IllegalArgumentException();
		this.id = count.incrementAndGet();
		this.nome = nome;
		this.status = status;
	}
	
	public Categoria(Categoria cat) {
		
	}
		
	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}
	
	public static enum statusE {
		ATIVA, INATIVA;
	}
	
	public statusE getStatus() {
		return status;
	}
}
