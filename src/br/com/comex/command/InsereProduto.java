package br.com.comex.command;

import java.math.BigDecimal;
import java.sql.Connection;

import br.com.comex.dao.jdbc.ProdutoDAO;
import br.com.comex.models.Produto;

public class InsereProduto implements Command {
	
	private String produtoNome;
	private BigDecimal produtoValor;
	private ProdutoDAO produtoNovo;
	
	public InsereProduto(String produtoNome, BigDecimal produtoValor,
			ProdutoDAO produtoNovo, Connection connect) {

		this.produtoNome = produtoNome;
		this.produtoValor = produtoValor;
		this.produtoNovo = produtoNovo;
		
		
	}

	@Override
	public void execute() throws Exception {
		
		Produto prod = new Produto(produtoNome, produtoValor);
		ProdutoDAO.insereProduto(prod, "ISENTO");
	}
	
}
