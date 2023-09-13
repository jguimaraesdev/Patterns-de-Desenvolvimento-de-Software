package Solid_AULA05_FactoryMethod;

 class Retangulo extends Geometria implements FiguraGeometrica{

	
	public int calculaArea() {
		
		return this.getBase() * this.getAltura();
		
	}
	
	public int calculaPerimetro() {
		
		return 2* (this.getBase() + this.getAltura());
		
		
	}

	public String getNomeFigura() {
		
		return "RETANGULO";
	}
	
}
