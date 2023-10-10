package Atividade_Abstract_Factory;

public class SmartphoneIphone extends Produto implements iProdutoEletronic {
	

	

	public String Selecionar() {
		
		this.Nome = "Iphone 14";
		this.SKU = "456987712389";
		this.Preco = "5.000,00";
			
		return displayinfo();
	}
	
	public String Imprime() {
		
		return displayinfo();
	}
	
}
