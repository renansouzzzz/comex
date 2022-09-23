package comex;

import java.util.concurrent.atomic.AtomicInteger;

public class Pedido {
	private static AtomicInteger count = new AtomicInteger(0);
	int id;
	String data;
	Cliente cliente;

	public Pedido(int id, String data, Cliente cliente){
		this.id = count.incrementAndGet();
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
