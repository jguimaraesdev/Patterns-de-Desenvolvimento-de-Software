package Atividade_Abstract_Factory;

import java.util.ArrayList;

public class inventarioEletronic implements iInventario{
	
	
	protected ArrayList<iProdutoEletronic> eletronicos = new ArrayList<iProdutoEletronic>();
	
	
	
	public String adicionar(Object tipo) {
		eletronicos.add((iProdutoEletronic) tipo);
		
		return "Produto Adicionado";
	}

	public String remover(Object tipo) {
		eletronicos.remove(tipo);
		
		return "Produto removido";
	}

	public String listar() {
		for (iProdutoEletronic x : eletronicos) {
			 
				return x.Imprime().;
			}
			return null;
		
	}
	
	
	
	
}
