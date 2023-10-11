package Atividade_Abstract_Factory;


public class App {

	public static void main(String[] args) {
		
		/*
		iFabricaVestuario fabrica = new Adidas(); //Esta parte se converterá em parâmetro de ambiente
		ConsumidorVestuario consumidor = new ConsumidorVestuario(fabrica);
		
		iFabricaVestuario fabrica1 = new Nike();
		ConsumidorVestuario consumidor1 = new ConsumidorVestuario(fabrica1);
		
		consumidor.estoque.adicionar(consumidor.camisa.Selecionar());
		consumidor.estoque.adicionar(consumidor.tenis.Selecionar());
		consumidor.estoque.adicionar(consumidor.camisa.Selecionar());
		consumidor.estoque.adicionar(consumidor.tenis.Selecionar());
		
		
		
		System.out.println(consumidor1.estoque.findAll());
		
		*/
		
		
		iFabricaEletronic fabrica = new Samsung(); //Esta parte se converterá em parâmetro de ambiente
		ConsumidorEletronico consumidor = new ConsumidorEletronico(fabrica);
		
		consumidor.estoque.adicionar(consumidor.notebook.Selecionar());
		consumidor.estoque.adicionar(consumidor.celular.Selecionar());
		
		System.out.println(consumidor.estoque.findAll());
		
	}

}
