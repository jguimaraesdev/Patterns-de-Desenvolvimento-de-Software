package Atividade_Abstract_Factory;

public class TenisNike extends Produto implements iProdutoVestuario{

	public String Selecionar() {
		
		this.Nome = "Tenis Nike Air Force 1";
		this.Preco = "789.00";
		this.SKU = "26294949649489";
		
		
		return displayinfo();
	}
	
	public String Imprime() {
		
		return displayinfo();
	}
}
