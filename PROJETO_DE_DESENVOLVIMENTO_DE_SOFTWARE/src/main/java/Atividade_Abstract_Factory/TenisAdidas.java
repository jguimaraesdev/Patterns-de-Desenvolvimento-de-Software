package Atividade_Abstract_Factory;

public class TenisAdidas extends Produto implements iProdutoVestuario{

	public String Selecionar() {
		
		this.Nome = "Tenis Adizero Pro3";
		this.Preco = "2.099,00";
		this.SKU = "654659875665";
		
		
		return displayinfo();
	}
	
	public String Imprime() {
		
		return displayinfo();
	}

}
