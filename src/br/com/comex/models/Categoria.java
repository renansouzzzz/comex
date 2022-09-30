package br.com.comex.models;


public class Categoria {
	private static long contadorID = 1;
	private long id;
	private String nome;
	statusE status;	
	
	public Categoria(String nome, statusE status) throws ComexException {
		this.id = contadorID;
		this.nome = nome;
		this.status = status;
		contadorID++;
		validacaoId();
		validacaoStatus();
		validacaoNome();
	}

	public void validacaoId() throws ComexException {
		if (id <= 0 | nome.length() < 3) 
			throw new ComexException("ID deve ser maior que 0,"
					+ " nome não pode ser menor que 3 e status deve ser ativo ou inativo!");
	}
	
	public void validacaoStatus() throws ComexException {
		if (status != statusE.ATIVA &&
				status != statusE.INATIVA) 
			throw new ComexException("O status deve prevalecer Ativa ou Inativa!");
	}
	
	public void validacaoNome() throws ComexException {
		if (nome.matches("[0-9].*")) 
			throw new ComexException("O nome deve iniciar com letras!");
	}

	public long getId() {
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
	
	@Override
	public String toString() {
		return "Principais informações -> ID: " + getId() + " Nome: " + getNome();
	}
}

