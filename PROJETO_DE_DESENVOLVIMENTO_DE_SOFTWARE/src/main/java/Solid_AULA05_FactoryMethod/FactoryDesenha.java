package Solid_AULA05_FactoryMethod;

public class FactoryDesenha {
	
	public FactoryDesenha(Circulo circulo) {
		// TODO Auto-generated constructor stub
	}

	public String getFigura(String Nome) {
		
		if(Nome.equals("Circulo")) {
			return new Circulo().getNomeFigura();
		}
		
		if(Nome.equals("Retangulo")) {
			return new Retangulo().getNomeFigura();
		}
		
		return "";
		
	}

}
