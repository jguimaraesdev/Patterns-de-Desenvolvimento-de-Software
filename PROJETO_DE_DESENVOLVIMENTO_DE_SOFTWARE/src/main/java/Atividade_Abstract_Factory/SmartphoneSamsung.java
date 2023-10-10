package Atividade_Abstract_Factory;

public class SmartphoneSamsung extends Produto  implements iProdutoEletronic{

	public String Selecionar() {
		
		this.Nome = "Samsung S23";
		this.SKU = "123644789623";
		this.Preco = "3.700,00";
		
		return displayinfo();
	}
	
	public String Imprime() {
		
		return displayinfo();
	}

}
