package Atividade_Abstract_Factory;



public  class inventarioEletronic extends Estoque implements iInventario{
	
	
	
	public void adicionar(Produto tipo) {
		this.Eletronicos.add(tipo);
		
		
	}

	
	public boolean remover(Produto tipo) {
		for(Produto x : this.Eletronicos) {
			if(x.equals(tipo)) {
				this.Eletronicos.remove(x);
				return true;
			}
		}
		return false;
		
	
	}	
	
	


	public String findAll() {
		
		String var = "";
		
		
		for (Produto x : this.Eletronicos) {
			 var = var +"\n"+ x.Nome +"\n"+ x.Preco +"\n" + x.SKU +"\n";
			
		}
		
		return var;
	
	}
	

	
}
