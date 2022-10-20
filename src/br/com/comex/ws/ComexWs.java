package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.comex.dao.jdbc.CategoriaDAO;
import br.com.comex.dao.jdbc.ProdutoDAO;
import br.com.comex.models.Categoria;
import br.com.comex.models.ConnectionFactory;
import br.com.comex.models.Produto;

@WebService
public class ComexWs {
	
	private Connection connection = 
			new ConnectionFactory().iniciaConexao();
	
	private CategoriaDAO categoria = new CategoriaDAO(connection);
	private ProdutoDAO produto = new ProdutoDAO(connection);

	public List<Categoria> getCategorias() throws SQLException {
		List<Categoria> listaC = categoria.listagemCategoria();

		return listaC;
	}
	
	@WebMethod(operationName="AdicionarCategoria")
	public Categoria adicionarCategoria
	(@WebParam(name="categoriaItem") Categoria c) 
			throws SQLException {
		
		categoria.insereCategoria(c);
		
		return c;
	}
	
	@WebMethod(operationName="ListarClientes")
	public List<Produto> listarClientes() throws SQLException {
		return produto.listagemProduto();
		
	}
}
