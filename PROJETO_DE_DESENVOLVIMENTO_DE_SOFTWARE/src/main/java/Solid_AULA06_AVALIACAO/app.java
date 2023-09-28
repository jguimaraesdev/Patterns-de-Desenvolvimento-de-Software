package Solid_AULA06_AVALIACAO;

public class app {

	public static void main(String[] args) {
		
		// Escolha entre BancoDeDadosArmazenamento ou ArquivoArmazenamento
		Iarmazenamento armazenamento = new BancoDeDadosArmazenamento(); // ou new ArquivoArmazenamento()
		
		Carro carro1 = new  Carro();
		carro1._marca = "Volkswagem";
		carro1._modelo= "Gol";
		carro1._anoFabricacao = 2018;
		carro1._nroPortas = 5;
		carro1._preco = 54000.0;
		carro1.motor = "1.6 High";
		
		
		
		
		
		// Escolha entre BancoDeDadosArmazenamento ou ArquivoArmazenamento
		Concessionaria concessionaria = new Concessionaria(armazenamento);
		
		concessionaria.carrosConcessionariaAdd(carro1);
		
        System.out.println(concessionaria.carrosConcessionariaView());

}
}
