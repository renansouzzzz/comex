package br.com.comex.ws;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;

import br.com.comex.dao.jdbc.CategoriaDAO;
import br.com.comex.models.Categoria;

@WebService
public class ComexWs {

	private CategoriaDAO categoria = new CategoriaDAO();

	public List<Categoria> getCategorias() throws SQLException {
		List<Categoria> listaC = CategoriaDAO.listagemCategoria();

		return getCategorias();

	}
}
