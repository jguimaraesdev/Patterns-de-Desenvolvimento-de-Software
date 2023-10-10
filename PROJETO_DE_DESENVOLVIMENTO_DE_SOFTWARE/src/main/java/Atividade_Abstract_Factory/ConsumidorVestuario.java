package Atividade_Abstract_Factory;

public class ConsumidorVestuario {

	private iFabricaVestuario fabrica;
	
	private iProdutoVestuario camisa;
	private iProdutoVestuario tenis;
	private iInventario estoque;
	
	ConsumidorVestuario(iFabricaVestuario compra){
		
		this.fabrica = compra;
		this.setCamisa(fabrica.faricaCamisa());
		this.setTenis(fabrica.faricaTenis());
		this.setEstoque(compra.manager());
	}

	
	
	
	//-------------------------------------------------------------//
	
	
	public iProdutoVestuario getCamisa() {
		return camisa;
	}

	public void setCamisa(iProdutoVestuario camisa) {
		this.camisa = camisa;
	}


	public iProdutoVestuario getTenis() {
		return tenis;
	}

	public void setTenis(iProdutoVestuario tenis) {
		this.tenis = tenis;
	}




	public iInventario getEstoque() {
		return estoque;
	}




	public void setEstoque(iInventario estoque) {
		this.estoque = estoque;
	}
}
