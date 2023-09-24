package Solid_AULA06_AVALIACAO;


public class Concessionaria {
	
	
	protected Iarmazenamento _salvaVeiculo;
	protected Iveiculos veiculo;
	
//---------------------------------------------------//
	//injeção de dependencia
	
	public Concessionaria(Iarmazenamento novo, Iveiculos tipo) {
		this._salvaVeiculo = novo;
		this.veiculo = tipo; 
	}


	public void _salvaVeiculo(Iveiculos veiculo) {
		_salvaVeiculo.salvar(veiculo);
		
	}

	
	//---------------------------------------------------//
	

	

	
		
	
	
}
