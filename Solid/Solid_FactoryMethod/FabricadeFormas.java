package Solid_FactoryMethod;



public class FabricadeFormas {
	
	private Iforma forma;
	
	
	
	//-----------------------------------------------------//
	
	//injeção de dependencia;
	
	
	
	public FabricadeFormas(Iforma tipo) {
		this.forma = tipo;
		
		
	}
	
	//-----------------------------------------------------//
	
	
	public String imprimeForma() {
		return this.forma.getNomeFigura();
	}
	
	//-----------------------------------------------------//
	

	
}
