package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.comex.dao.jdbc.CategoriaDAO;
import br.com.comex.dao.jdbc.ClienteDAO;
import br.com.comex.dao.jdbc.ProdutoDAO;
import br.com.comex.models.Categoria;
import br.com.comex.models.Cliente;
import br.com.comex.models.ConnectionFactory;
import br.com.comex.models.Produto;

@WebService
public class ComexWs {
	
	private Connection connection = 
			new ConnectionFactory().iniciaConexao();
	
	private CategoriaDAO categoria = new CategoriaDAO(connection);
	private ClienteDAO cliente = new ClienteDAO(connection);
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
	public List<Cliente> listarClientes() throws SQLException {
		List<Cliente> listaCliente = cliente.listagemCliente();
		
		return listaCliente;
	}
	
	@WebMethod(operationName="InsereCliente")
	public Cliente adicionarCliente(Cliente c) throws SQLException {
		
		cliente.insereCliente(c);
		
		return c;
	}
	
	@WebMethod(operationName="ListarProdutos")
	public List<Produto> listarProdutos() throws SQLException {
		List<Produto> listaP = produto.listagemProduto();
		
		return listaP;
		
	}
}
