package Atividade_Abstract_Factory;

import java.util.ArrayList;

public class inventarioVestuario implements iInventario {
	
	
	protected ArrayList<iFabricaVestuario> vestuario = new ArrayList<iFabricaVestuario>();
	
	
	
	
	public String adicionar(Object tipo) {
		vestuario.add((iFabricaVestuario) tipo);
		
		return "Produto Adicionado";
	}

	public String remover(Object tipo) {
		vestuario.remove(tipo);
		
		return "Produto removido";
	}

	public String listar() {
		for (iFabricaVestuario x : vestuario) {
			return x.toString();
		}
		return null;
	}

}
