package br.com.comex.models;

import java.util.concurrent.atomic.AtomicInteger;

public class Cliente {
	private static AtomicInteger count = new AtomicInteger(0);
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String rua;
	private int numeroEnd;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;

	public Cliente(int id, String nome, String cpf, String telefone, String rua, int numeroEnd, String complemento, 
			String bairro, String cidade, String estado) {
		this.id = count.incrementAndGet();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua; 
		this.numeroEnd = numeroEnd;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public String getRua() {
		return this.rua;
	}
	
	public int getNumeroEnd() {
		return this.numeroEnd;
	}
	
	public String getComplemento() {
		return this.complemento;
	}
	
	public String getBairro() {
		return this.bairro;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public String getEstado() {
		return this.estado;
	}
}