package comex;

public class MainCategoria {
	public static void main(String[] args) {
		Categoria categoria1 = new Categoria();
		Categoria categoria2 = new Categoria();
		Categoria categoria3 = new Categoria();
		
		categoria1.id = 1;
		categoria1.nome = "INFORMÁTICA";
		categoria1.status = true;
		
		categoria2.id = 2;
		categoria2.nome = "MÓVEIS";
		categoria2.status = false;
		
		categoria3.id = 3;
		categoria3.nome = "LIVROS";
		categoria3.status = true;
		
		
		System.out.println("Categoria " + categoria1.nome + 
				" (" + categoria1.id + " - " + categoria1.setStatus() + ")");
		
		System.out.println("Categoria " + categoria2.nome + 
				" (" + categoria2.id + " - " + categoria2.setStatus() + ")");
		
		System.out.println("Categoria " + categoria3.nome + 
				" (" + categoria3.id + " - " + categoria3.setStatus() + ")");
	}
}