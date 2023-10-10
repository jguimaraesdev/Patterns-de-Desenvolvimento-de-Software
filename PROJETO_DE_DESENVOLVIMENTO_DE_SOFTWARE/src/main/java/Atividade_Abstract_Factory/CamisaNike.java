package Atividade_Abstract_Factory;

public class CamisaNike extends Produto implements iProdutoVestuario{

	public String Selecionar() {
		
		this.Nome = "Camisa Brasil";
		this.Preco = "349.90";
		this.SKU = "614313465654";
		
		return displayinfo();
	}
	
	public String Imprime() {
		
		return displayinfo();
	}
}
