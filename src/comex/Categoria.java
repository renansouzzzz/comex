package comex;

public class Categoria {
	int id;
	String nome;
	boolean status;
	String aux;

	
	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public String setStatus() {
		if(this.status) {
			aux = "Ativa";
		}
		else {
			aux = "Inativa";
		}
		return this.aux;
	}
	
}
