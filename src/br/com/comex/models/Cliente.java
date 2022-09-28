package br.com.comex.models;


public class Cliente {
	private static long contadorID = 1;
	private long id;
	private String nome;
	private String cpf;
	private String telefone;
	private String rua;
	private String numeroEnd;
	private String complemento;
	private String bairro;
	private String cidade;
	private Estado estado;

	public Cliente(String nome, String cpf, String telefone, String rua, String numeroEnd, String complemento, 
			String bairro, String cidade, Estado estado) {
		
		this.id = contadorID;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua; 
		this.numeroEnd = numeroEnd;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		contadorID++;
	
		if (this.id < 0)
			throw new IllegalArgumentException("Id deve ser maior que 0");
		if (nome.length() < 5 | nome == null)
			throw new IllegalArgumentException("O nome deve ser maior que 5, e deve ser n nulo");
		if (cpf.length() < 11 | cpf.length() > 14 | cpf == null)
			throw new IllegalArgumentException("cpf deve conter de 11 a 14 carac,e deve sere n nulo");
		if (telefone.length() < 11 | telefone.length() > 16 | telefone == null)
			throw new IllegalArgumentException("telefone deve ser entre 11 e 16 numeros, e deve ser n nulo");
		if (rua.length() < 5 | cpf == null)
			throw new IllegalArgumentException("o nome da rua deve ter pelo menos 5 carac, e deve ser n nulo");	
		if (numeroEnd.length() <= 1 | numeroEnd == null)
			throw new IllegalArgumentException("numero do endereco deve conter 2, e deve ser mais carac ou n nulo");
		if (bairro.length() <= 1 | bairro == null)
			throw new IllegalArgumentException("bairro deve conter 2 ou mais carac, e deve sere n nulo");
		if (cidade.length() <= 1 | cidade == null)
			throw new IllegalArgumentException("cidade dever conter 2 ou mais catac, e deve ser n nulo");	
		if (this.estado != estado | numeroEnd == null)
			throw new IllegalArgumentException("estado deve conter 2 carac, e n pode ser nulo ");
	}
	
	public long getId() {
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
	
	public String getNumeroEnd() {
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
	
	public enum Estado {
		AC, AL, AP, AM, BA, CE, DF, ES, GO, MA, MT, MS, MG,
		PA, PB, PR, PE, PI, RJ, RN, RS, RO, RR, SC, SP, SE, TO;
	}
	
	public Estado getEstado() {
		return this.estado;
	}
	
	@Override
	public String toString() {
		return "Principais informações -> ID: " + getId() + " Nome: " + getNome();
	}
}