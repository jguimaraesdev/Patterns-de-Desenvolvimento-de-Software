package Atividade_Abstract_Factory;

public class Produto {
	
	protected String Nome;
	protected String SKU;
	protected String Preco;
	
	
	public String displayinfo() {
		
		String modelo = "Produto: " +Nome +"\nCOD: "+ SKU+"\nPreco: " + Preco+"\n";
		
		return modelo;
	}
	
		
	
}
