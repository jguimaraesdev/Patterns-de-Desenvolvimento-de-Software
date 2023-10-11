package Atividade_Abstract_Factory;



public interface iInventario {
	
	void adicionar(Produto tipo);
	boolean remover(Produto tipo);
	
	String findAll();
}
