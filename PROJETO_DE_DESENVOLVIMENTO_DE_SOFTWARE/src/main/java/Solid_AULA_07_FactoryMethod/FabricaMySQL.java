package Solid_AULA_07_FactoryMethod;

public class FabricaMySQL implements iFabrica {

	public iProduto fabricarProdutoA() {
		return new produtoAMysql();
	}

	public iProduto fabricarProdutoB() {
		return new ProdutoBMysql();
	}

}
