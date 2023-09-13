package Solid_FactoryMethod;

 class Retangulo extends Geometria implements Iforma{

	
	 private Retangulo() {}
	 
	 
	 public static Retangulo desenhaRetangulo() {
		 return new Retangulo();
	 }
	 
	 
	//----------------------------------------------------------------------//
	 
	 
	 public String getNomeFigura() {
			
			return "RETANGULO";
		}
	 
	 
	 
	/* 
	 
	private int calculaArea() {
		
		return this.getBase() * this.getAltura();
		
	}
	
	private int calculaPerimetro() {
		
		return 2* (this.getBase() + this.getAltura());
		}
	*/	
	
	  
	
	
}
