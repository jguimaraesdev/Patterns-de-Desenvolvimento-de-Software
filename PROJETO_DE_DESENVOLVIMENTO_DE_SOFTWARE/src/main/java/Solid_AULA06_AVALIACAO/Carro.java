package Solid_AULA06_AVALIACAO;



public class Carro extends Veiculo implements Iveiculos{
	
	int _nroPortas;
	String motor;
	String _nome = "Carro";
	
	public String salvar() {
		
		
		String sql = String.format("%s,%s,%s,%s,%s,%s,%s",
				this._marca, this._modelo, this._anoFabricacao, this._preco,this.motor, this._nome, this._nroPortas);  
			
		
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
	
	
	
	
	
	
	
