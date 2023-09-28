package Solid_AULA06_AVALIACAO;

public class Motocicleta extends Veiculo implements Iveiculos{
	
	protected String _cilindrada;
	
	private Motocicleta(String marca, String modelo, double preco, int ano, String cilindrada) {
		this._marca = marca;
		this._modelo = modelo;
		this._preco = preco;
		this._anoFabricacao = ano;
		this._cilindrada = cilindrada;
		
	}
	
	public static Motocicleta novaMotocicleta(String marca, String modelo, double preco, int ano, String cilindrada) {
		Motocicleta novo = new Motocicleta(marca, modelo, preco, ano, cilindrada);
		
		return novo;
	}
	
	
	
}