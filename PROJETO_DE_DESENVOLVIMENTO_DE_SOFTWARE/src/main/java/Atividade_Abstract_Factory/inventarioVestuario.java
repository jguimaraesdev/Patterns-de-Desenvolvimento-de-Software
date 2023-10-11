package Atividade_Abstract_Factory;

import java.util.List;

public class inventarioVestuario extends Estoque implements iInventario {
	
	
	
	public void adicionar(Produto tipo) {
		this.Vestuario.add(tipo);
		
	}

	
	public boolean remover(Produto tipo) {
		for(Produto x : this.Vestuario) {
			if(x.SKU.equals(tipo.SKU)) {
				this.Vestuario.remove(x);
				return true;
			}
		}
		return false;
		
	
	}	
	


	public String findAll() {
		
		String var = "";
		
		for (Produto x : this.Vestuario) {
			 var = var +"\n"+ x.Nome +"\n"+ x.Preco +"\n" + x.SKU;
			
		}
		
		return var;
	}
	
}
