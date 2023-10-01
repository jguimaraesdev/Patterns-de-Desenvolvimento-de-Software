package Solid_AULA_07_FactoryMethod;

public class consumidor {
	private iFabrica fabrica;
	public iProduto produtoA;
	public iProduto produtoB;
	consumidor(iFabrica fabrica){
		this.fabrica = fabrica;
		this.produtoA = fabrica.fabricarProdutoA();
		this.produtoB = fabrica.fabricarProdutoB();
	}
}
