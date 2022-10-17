package br.com.comex.command;

import java.math.BigDecimal;
import java.sql.Connection;

import br.com.comex.dao.jdbc.CrudProdutosDAO;
import br.com.comex.models.Produto;

public class InsereProduto implements Command {
	
	private String produtoNome;
	private BigDecimal produtoValor;
	private CrudProdutosDAO produtoNovo;
	
	public InsereProduto(String produtoNome, BigDecimal produtoValor,
			CrudProdutosDAO produtoNovo, Connection connect) {

		this.produtoNome = produtoNome;
		this.produtoValor = produtoValor;
		this.produtoNovo = produtoNovo;
		
		
	}

	@Override
	public void execute() throws Exception {
		
		Produto prod = new Produto(produtoNome, produtoValor);
		CrudProdutosDAO.insereProduto(prod, "ISENTO");
	}
	
}
