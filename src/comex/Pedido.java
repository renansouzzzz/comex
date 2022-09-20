package comex;

public class Pedido {
	int id;
	String data;
	Cliente cliente;

	public Pedido(int id, String data, Cliente cliente){
		this.id = id;
		this.data = data;
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}
	
	public String getData() {
		return data;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

}
