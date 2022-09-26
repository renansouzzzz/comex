package comex;

public class MainCategoria {
	public static void main(String[] args) {
		
		// testando valores inválidos e válidos
		
		
		Categoria categoria1 = new Categoria("IN", true);
		Categoria categoria2 = new Categoria("MÓVEIS", false);
		Categoria categoria3 = new Categoria("LIVROS", true);
		
		//Categoria categoria1 = new Categoria("INFORMÁTICA", true);
		//Categoria categoria2 = new Categoria("MÓVEIS", false);
		//Categoria categoria3 = new Categoria("LIVROS", true);
		
		
		System.out.println("Categoria " + categoria1.getNome() + 
				" (" + categoria1.getId() + " - " + categoria1.getNome() + ")");
		
		System.out.println("Categoria " + categoria2.getNome() + 
				" (" + categoria2.getId() + " - " + categoria2.setStatus() + ")");
		
		System.out.println("Categoria " + categoria3.getNome() + 
				" (" + categoria3.getId() + " - " + categoria3.setStatus() + ")");
	}
}