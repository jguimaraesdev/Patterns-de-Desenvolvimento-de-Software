package Solid_AULA06_AVALIACAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BancoDeDadosArmazenamento implements Iarmazenamento{

	

	public void atualizar(Veiculo veiculo) {
		
		
		Connection conecta = DbConnection.getConexaoMySQL();
		
		try {
			
			String sql = "insert into veiculo("
					+ "marca, "
					+ "modelo, "
					+ "anofabricacao, "
					+ "preco, "
					+ "cilindrada, "
					+ "tipo)"
					+ "qtdPortas values(?,?,?,?,?,?,?)";
			
				PreparedStatement ps = conecta.prepareStatement(sql);
			
			
				ps.setString(1,);
				ps.setString(2, );
				ps.setInt(3, );
				ps.setDouble(4, );
				ps.setInt(5, 0);
				ps.setString(6, "Carro");
				ps.setInt(7, );
			
			
			int status = ps.executeUpdate();
			
			if(status!= 0) {
				System.out.println("Salvo!!!");
			}
			if(status == 0) {
				System.out.println("Tente novamente...!!");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void deletar(int id) {
		// TODO Stub de método gerado automaticamente
		
	}

	public Object getById(int id) {
		// TODO Stub de método gerado automaticamente
		return null;
	}

	public void salvar(Iveiculos veiculo) {
		// TODO Stub de método gerado automaticamente
		
	}
	
}
