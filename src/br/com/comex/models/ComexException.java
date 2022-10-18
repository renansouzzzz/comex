package br.com.comex.models;

// criando minha exception
public class ComexException extends RuntimeException{
	public ComexException(String msg) {
		super(msg);
	}
}
