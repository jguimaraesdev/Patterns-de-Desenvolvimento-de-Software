package Avaliacao_Semestral_Ecomeerce;

public class consumidor {

	public static void main(String[] args) {
		
		Cartao cartao = new Cartao();
		cartao.limite= 350.00;
		
		
		
		Double valor = 450.00;
		
		ProcessaPagamento transacao = ProcessaPagamento(cartao, valor);
	
		
		
	
}