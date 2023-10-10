package Atividade_Abstract_Factory;



public class ConsumidorEletronico {
	
	
	private iFabricaEletronic fabrica;
	private iProdutoEletronic celular;
	private iProdutoEletronic notebook;
	private iInventario estoque; 
	
	ConsumidorEletronico(iFabricaEletronic produto){
		
		this.setFabrica(produto);
		this.setCelular(produto.fabricarSmartphone());
		this.setNotebook(produto.fabricarNotebook());
		this.setEstoque(produto.manager());
	}

	
	
	
	//---------------------------------------------------------------------//
	
	
	public iProdutoEletronic getCelular() {
		return celular;
	}

	public void setCelular(iProdutoEletronic celular) {
		this.celular = celular;
		
		
	}

	public iProdutoEletronic getNotebook() {
		return notebook;
	}

	public void setNotebook(iProdutoEletronic notebook) {
		this.notebook = notebook;
	}


	public iFabricaEletronic getFabrica() {
		return fabrica;
	}

	public void setFabrica(iFabricaEletronic fabrica) {
		this.fabrica = fabrica;
	}




	public iInventario getEstoque() {
		return estoque;
	}




	public void setEstoque(iInventario estoque) {
		this.estoque = estoque;
	}




	

}
