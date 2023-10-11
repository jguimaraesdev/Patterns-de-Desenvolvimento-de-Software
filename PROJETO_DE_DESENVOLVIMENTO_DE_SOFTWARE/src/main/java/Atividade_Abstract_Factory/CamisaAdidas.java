package Atividade_Abstract_Factory;

public class CamisaAdidas extends Produto implements iProdutoVestuario {

	
	
	public Produto Selecionar() {
		
		Produto camisa = new Produto();
		
		camisa.Nome = "Camisa Italia";
		camisa.Preco = 359.58;
		camisa.SKU = "056431646846654";
		
		
		return camisa;
	}
	
	public String Imprime() {
		
		return displayinfo();
	}

	

}
