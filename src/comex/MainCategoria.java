package comex;

public class MainCategoria {
	public static void main(String[] args) {
		Categoria categoria1 = new Categoria("INFORMÁTICA", true);
		Categoria categoria2 = new Categoria("MÓVEIS", false);
		Categoria categoria3 = new Categoria("LIVROS", true);
		
		
		System.out.println("Categoria " + categoria1.getNome() + 
				" (" + categoria1.getId() + " - " + categoria1.getNome() + ")");
		
		System.out.println("Categoria " + categoria2.getNome() + 
				" (" + categoria2.getId() + " - " + categoria2.setStatus() + ")");
		
		System.out.println("Categoria " + categoria3.getNome() + 
				" (" + categoria3.getId() + " - " + categoria3.setStatus() + ")");
	}
}