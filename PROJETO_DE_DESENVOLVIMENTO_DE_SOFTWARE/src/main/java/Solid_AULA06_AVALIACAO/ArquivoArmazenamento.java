package Solid_AULA06_AVALIACAO;

import java.io.FileWriter;
import javax.swing.JOptionPane;

public class ArquivoArmazenamento implements Iarmazenamento {

	private String nomearquivo = "C:/arquivoVeiculos.txt";

    
		public void salvar(Veiculo veiculo) {
			
			
			try {
				
				
				FileWriter file = new FileWriter(this.nomearquivo);
				
				veiculo.toString();
				
	            file.write("Marca: "+ veiculo._modelo+"\n");
	            file.write("Modelo: "+ veiculo._modelo+"\n");
	            file.write("Ano: "+veiculo._anoFabricacao+"\n");
	            file.write("Preco: "+veiculo._preco+"\n\n");
	           
	            file.write("-----------------------\n\n");
	            file.flush();
	            file.close();
	            
				
				
				JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso!");
						
			}catch(Exception erro)
			{
				JOptionPane.showMessageDialog(null, "Ocorreu um erro de gravação doarquivo! \n" +erro.getMessage());
			}
		}


		public void atualizar(Object bean) {
			// TODO Stub de método gerado automaticamente
			
		}
		public void deletar(int id) {
			// TODO Stub de método gerado automaticamente
			
		}
		public Object getById(int id) {
			// TODO Stub de método gerado automaticamente
			return null;
		}

		public void atualizar(Veiculo veiculo) {
			// TODO Stub de método gerado automaticamente
			
		}


		public void salvar(Iveiculos veiculo) {
			// TODO Stub de método gerado automaticamente
			
		}


	
		
	}


