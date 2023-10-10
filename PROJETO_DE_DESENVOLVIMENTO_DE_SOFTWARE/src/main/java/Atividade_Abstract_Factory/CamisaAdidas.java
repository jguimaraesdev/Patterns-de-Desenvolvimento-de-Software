package Atividade_Abstract_Factory;

public class CamisaAdidas extends Produto implements iProdutoVestuario {

	
	
	public String Selecionar() {
		
		this.Nome = "Camisa Italia";
		this.Preco = "359.58";
		this.SKU = "056431646846654";
		
		
		return displayinfo();
	}
	
	public String Imprime() {
		
		return displayinfo();
	}

	

}
