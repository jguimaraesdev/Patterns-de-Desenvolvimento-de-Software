package Solid_AULA_07_FactoryMethod;

public class fabricaCassandra implements iFabrica{

	public iProduto fabricarProdutoA() {
		
		return new produtoACassandra();
	}

	public iProduto fabricarProdutoB() {
		
		return new produtoBCassandra();
	}

}
