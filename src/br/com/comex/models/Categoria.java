package br.com.comex.models;


public class Categoria {
	private static int contadorID = 1;
	private static int id;
	private String nome;
	private String sts;
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
	
	public Categoria(Integer id, String nome, String sts) {
		this.id = id;
		this.nome = nome;
		this.sts = sts;
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

	public static int getId() {
		return id;
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
	
	public String getSts() {
		return sts;
	}
	
	@Override
	public String toString() {
		return "Categoria [nome=" + nome + ", status=" + sts + "]";
	}
}

