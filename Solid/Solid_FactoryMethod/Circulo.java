package Solid_FactoryMethod;

import java.lang.Math;

 	class Circulo extends Geometria implements Iforma{

 		
 	private Circulo(){}
 	
 	
 	
 	public static Circulo desenhaCirculo() {
 		return new Circulo();
 	}
 	
 	
 	//----------------------------------------------------------------------//
 	
 	
 	public String getNomeFigura() {
		
		return "CIRCULO";
	}
 	
 	
 	
 	/*
	
	private int calculaArea() {
			
	 	return (int) (Math.PI*Math.pow(this.getRaio(), 2));
			
			
	}
			
	private  int calculaPerimetro() {
			
		return (int) (2*(Math.PI*this.getRaio()));
	}
	
	*/
	
		
}
