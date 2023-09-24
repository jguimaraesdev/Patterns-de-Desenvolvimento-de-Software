package Solid_AULA06_AVALIACAO;



public class Carro extends Veiculo implements Iveiculos{
	
	protected int _nroPortas;
	private Carro(String marca, String modelo, int portas, double preco, int ano) {
		this._marca = marca;
		this._modelo = modelo;
		this._nroPortas = portas;
		this._preco = preco;
		this._anoFabricacao = ano;
		
	}
	
	static Carro novoCarro(String marca, String modelo, int portas, double preco, int ano) {
		Carro novo = new Carro(marca, modelo, portas, preco, ano);
		
		return novo;
	}


	}
	
	
	
	
	
	
	
