package Atividade_Abstract_Factory;

public class NotebookSamsung extends Produto implements iProdutoEletronic{

	public Produto Selecionar() {
		
		Produto novo = new Produto();
		
		novo.Nome = "Notebook Galaxy Book3 360";
		novo.SKU = "651649464184";
		novo.Preco = 65000.0;
		
		return novo;
}

	public String Imprime() {
		
		return displayinfo();
	}

}
