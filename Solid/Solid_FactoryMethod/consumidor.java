package Solid_FactoryMethod;

public class consumidor {

	public static void main(String[] args) {
		
		
		
		
		FabricadeFormas x = new FabricadeFormas(Circulo.desenhaCirculo());
		
		System.out.println(x.imprimeForma());
		
		FabricadeFormas y = new FabricadeFormas(Retangulo.desenhaRetangulo());
		
		System.out.println(y.imprimeForma());
	
	}

}
