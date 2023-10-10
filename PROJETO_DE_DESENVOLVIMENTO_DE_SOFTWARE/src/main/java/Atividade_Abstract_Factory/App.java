package Atividade_Abstract_Factory;


public class App {

	public static void main(String[] args) {
		
		iFabricaEletronic marca = new Apple(); 
		
		ConsumidorEletronico consumidor1 = new ConsumidorEletronico(marca);
		System.out.println(consumidor1.getCelular().Selecionar());
		System.out.println(consumidor1.getEstoque().adicionar(consumidor1.getCelular().Selecionar()));
		System.out.println(consumidor1.getEstoque().listar());
		//----------------------------------------------------------------------//
		
		/*
		iFabricaVestuario renner = new Nike(); 
		
		ConsumidorVestuario consumidor2 = new ConsumidorVestuario(renner);
		System.out.println(consumidor2.getCamisa().Selecionar());
		
		*/
		
		
		
		

	}

}
