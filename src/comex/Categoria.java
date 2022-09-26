package comex;

import java.util.concurrent.atomic.AtomicInteger;

class Categoria {
	private static AtomicInteger count = new AtomicInteger(0);
	private int id;
	private String nome;
	private boolean status;
	String aux;

	IllegalArgumentException ex = new IllegalArgumentException();
	
	
	public Categoria(String nome, boolean status) {
		if (this.id <= 0) throw ex;
		if (this.nome.length() < 3) throw ex;
		if (aux != "Ativa" | aux != "Inativa") throw ex;
		this.id = count.incrementAndGet();
		this.nome = nome;
		this.status = status;
	}
		
	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	
	// como a variável aux está em execução, alterei neste set! {Ativa para Ativ, forçando
	//   o erro}
	
	public String setStatus() {
		if (this.status) {
			aux = "Ativ";
		} else {
			aux = "Inativa";
		}
		return this.aux;
	}

}
