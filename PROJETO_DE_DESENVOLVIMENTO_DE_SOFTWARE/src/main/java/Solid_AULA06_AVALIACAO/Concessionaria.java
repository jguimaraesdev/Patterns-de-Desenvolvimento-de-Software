package Solid_AULA06_AVALIACAO;


public class Concessionaria {
	
	
	private Iarmazenamento estoqueVeiculo;
	private Iveiculos veiculo;
	
//---------------------------------------------------//
	//injeção de dependencia
	
	public Concessionaria(Iarmazenamento novo) {
		this.estoqueVeiculo = novo;
		 
	}

	
	//---------------------------------------------------//
	
	public Object carrosConcessionariaView() {
		
		
		return this.estoqueVeiculo.imprimirEstoque();
		 
		
	}

	
	//---------------------------------------------------//
	

	public Object carrosConcessionariaAdd(Object tipo) {
		
		
		this.estoqueVeiculo.adicionarVeiculo((Iveiculos) tipo);
		
		return null;
		 
		
	}

	
		
	
	
}
