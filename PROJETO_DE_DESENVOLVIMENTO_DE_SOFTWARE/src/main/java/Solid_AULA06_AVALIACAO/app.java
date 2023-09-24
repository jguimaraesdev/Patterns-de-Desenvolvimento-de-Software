package Solid_AULA06_AVALIACAO;

public class app {

	public static void main(String[] args) {
		
		// Escolha entre BancoDeDadosArmazenamento ou ArquivoArmazenamento
		Iarmazenamento armazenamento = new BancoDeDadosArmazenamento();
		Iveiculos carro1 = Carro.novoCarro("Toyota", "Corolla", 2023, 35000.0, 4);
		
		
		Concessionaria concessionaria = new Concessionaria(armazenamento, carro1);
		
		// Adicionar veículos ao estoque da concessionária
        
       
        		
        	
        				
        Veiculo motocicleta1 = Motocicleta.novaMotocicleta("Honda", "CBR500R", 8000.0, 2015, "500cc");
        
        concessionaria._salvaVeiculo(carro1);
        concessionaria._salvaVeiculo(motocicleta1);
	}

}
