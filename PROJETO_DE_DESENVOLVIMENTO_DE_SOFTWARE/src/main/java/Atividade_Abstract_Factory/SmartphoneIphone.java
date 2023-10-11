package Atividade_Abstract_Factory;

public class SmartphoneIphone extends Produto implements iProdutoEletronic {
	

	public Produto Selecionar() {
		
		Produto novo = new Produto();
		
		novo.Nome = "Iphone 14";
		novo.SKU =  "456987712389"; 
		novo.Preco = 50000.0;
		
			
		return novo;
	}
	
	
	public String Imprime() {
		
		return displayinfo();
	}
	
}
