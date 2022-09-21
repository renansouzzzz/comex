package comex;

public class Categoria {
	int id = 0;
	String nome;
	boolean status;
	String aux;

	// Cada vez que o construtor for chamado, id++ será rodado.
	public Categoria(String nome, boolean status) {
		this.nome = nome;
		this.status = status;
		this.id = id++;
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
