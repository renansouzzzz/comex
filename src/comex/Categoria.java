package comex;

import java.util.concurrent.atomic.AtomicInteger;

class Categoria {
	private static AtomicInteger count = new AtomicInteger(0);
	int id;
	String nome;
	boolean status;
	String aux;

	// Cada vez que o construtor for chamado, id++ será rodado.
	public Categoria(String nome, boolean status) {
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

	public String setStatus() {
		if (this.status) {
			aux = "Ativa";
		} else {
			aux = "Inativa";
		}
		return this.aux;
	}

}
