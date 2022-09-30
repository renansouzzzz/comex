package br.com.comex.models;

public class Pedido {
	private static long contadorID;
	private long id;
	private String data;
	public Cliente cliente;

	public Pedido(String data, Cliente cliente){
		this.id = contadorID;
		this.data = data;
		this.cliente = cliente;
		contadorID++;
	}

	public long getId() {
		return id;
	}
	
	public String getData() {
		return data;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	@Override
	public String toString() {
		return "Principais informações -> ID: " + getId() + " Data: " + getData();
	}

}
