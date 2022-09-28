package br.com.comex.models;


public class Categoria {
	private static long contadorID = 1;
	private long id;
	private String nome;
	statusE status;	
	
	public Categoria(String nome, statusE status) throws MyException {
		this.id = contadorID;
		this.nome = nome;
		this.status = status;
		contadorID++;
		if (id <= 0 | nome.length() < 3 |
				this.status != statusE.ATIVA |
				this.status != statusE.INATIVA) throw new MyException("ID deve ser "
						+ "maior que 0, nome não pode ser menor que 3 e status deve ser"
						+ "ativo ou inativo!");
		
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
}
