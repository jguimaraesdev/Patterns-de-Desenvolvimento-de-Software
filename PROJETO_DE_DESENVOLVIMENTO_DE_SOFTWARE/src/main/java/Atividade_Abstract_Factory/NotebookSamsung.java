package Atividade_Abstract_Factory;

public class NotebookSamsung extends Produto implements iProdutoEletronic{

	public String Selecionar() {
		
		this.Nome = "Notebook Galaxy Book3 360";
		this.SKU = "651649464184";
		this.Preco = "6.500,00";
		
		return displayinfo();
}

	public String Imprime() {
		
		return displayinfo();
	}

}
