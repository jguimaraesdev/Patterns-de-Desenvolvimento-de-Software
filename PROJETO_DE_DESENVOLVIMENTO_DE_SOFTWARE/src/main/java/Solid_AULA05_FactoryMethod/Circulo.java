package Solid_AULA05_FactoryMethod;

import java.lang.Math;

 	class Circulo extends Geometria implements FiguraGeometrica{

	
 		
 	//--------------------------------------------------------------------//	
	 
 	protected int calculaArea() {
		
 		return (int) (Math.PI*Math.pow(this.getRaio(), 2));
		
		
	}
	
	protected  int calculaPerimetro() {
		
		return (int) (2*(Math.PI*this.getRaio()));
	}

	
	
	
	//--------------------------------------------------------------------//
	
	
	
	public String getNomeFigura() {
		
		return "CIRCULO";
	}
}
