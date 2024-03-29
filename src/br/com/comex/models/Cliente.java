package br.com.comex.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
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

	public Cliente() {
		
	}
	
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
		
		validacaoId();
		validacaoNome();
		validacaoCpf();
		validacaoTelefone();
		validacaoEndereco();		
	}
	
	public Cliente(Integer id,String nome, String cpf, String telefone, String rua,
			String numeroEnd, String complemento, String bairro, String cidade, String estados) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua;
		this.numeroEnd = numeroEnd;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
	public void validacaoId() {
		if (id < 0)
			throw new ComexException("Id deve ser maior que 0");
	}
	
	public void validacaoNome() {
		if (nome.length() < 5 | nome == null)
			throw new ComexException("O nome deve ser maior que 5, e deve ser n nulo");
		
		if (nome.matches("[0-9].*")) 
			throw new ComexException("O nome deve iniciar com letras!");
	}
	
	public void validacaoTelefone() {
		if (telefone.length() < 11 | telefone.length() > 16 | telefone == null)
			throw new ComexException("telefone deve ser entre 11 e 16 numeros, e deve ser n nulo");
	
		if (!telefone.matches("^\\([0-9]{2}\\) [0-9]{1} ([0-9]{4}-[0-9]{4})$")) 
			throw new ComexException("O telefone deve ser formatado da "
					+ "forma correta. Ex: (00) 0 0000-0000");
	}
	
	public void validacaoCpf() {
		if (cpf.length() < 11 | cpf.length() > 14 | cpf == null)
			throw new IllegalArgumentException("cpf deve conter de 11 a 14 carac,e deve sere n nulo");
		
		if (!cpf.matches("^([0-9]{3}\\.?){3}-?[0-9]{2}$")) 
			throw new IllegalArgumentException("O CPF deve conter '.' e '-' ");
	}
	
	public void validacaoEndereco() {
		
		if (rua.length() < 5 | rua == null)
			throw new IllegalArgumentException("o nome da rua deve ter pelo menos 5 carac, e deve ser n nulo");
		
		if (bairro.length() <= 1 | bairro == null)
			throw new IllegalArgumentException("bairro deve conter 2 ou mais carac, e deve sere n nulo");
		
		if (cidade.length() <= 1 | cidade == null)
			throw new IllegalArgumentException("cidade dever conter 2 ou mais catac, e deve ser n nulo");	
		
		if (estado != estado)
			throw new IllegalArgumentException("estado deve conter 2 carac, e n pode ser nulo ");
		
		if (numeroEnd.length() <= 1 | numeroEnd == null)
			throw new IllegalArgumentException("numero do endereco deve conter 2, e deve ser mais carac ou n nulo");
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
	
	public void setId(long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setNumeroEnd(String numeroEnd) {
		this.numeroEnd = numeroEnd;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
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
		return "ID: " + getId() + "\n Nome: " + getNome() + "\n CPF: " + getCpf() +
				"\n Telefone: " + getTelefone() + "\n Rua: " + getRua()
				+ "\n Numero Endereço: " + getNumeroEnd() + "\n Complemento: " + getComplemento() +
				"\n Bairro: " + getBairro() + "\n Cidade: " + getCidade() + "\n\n";
	}
}