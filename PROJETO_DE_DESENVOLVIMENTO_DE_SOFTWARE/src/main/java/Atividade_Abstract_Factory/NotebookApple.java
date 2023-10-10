package Atividade_Abstract_Factory;



public class NotebookApple extends Produto implements iProdutoEletronic{
	
	
	public String Selecionar() {
		
		this.Nome = "MacBook Air";
		this.SKU = "16519849819641";
		this.Preco = "7.600,00";
		
		return displayinfo();
}
	
	
	public String Imprime() {
		return displayinfo();
	}
	
	
	
	
	
}
