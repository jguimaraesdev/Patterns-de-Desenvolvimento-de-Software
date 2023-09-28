package Solid_AULA06_AVALIACAO;

public class Motocicleta extends Veiculo implements Iveiculos{
	
	String _cilindrada;

	public String salvar() {
		
		String sql = String.format("(marca, modelo, anofabricacao, preco, motor, tipo, qtdportas "
				+ "values(%s, %s, %s, %s, %s, Motocicleta, 0)",
				this._marca, this._modelo, this._anoFabricacao, this._preco, this._cilindrada);  
			
		
		return sql;
	}

	public void atualizar() {
		// TODO Stub de método gerado automaticamente
		
	}

	public void deletar(int id) {
		// TODO Stub de método gerado automaticamente
		
	}

	public Object getById(int id) {
		// TODO Stub de método gerado automaticamente
		return null;
	}
	
	
	
	
	
}