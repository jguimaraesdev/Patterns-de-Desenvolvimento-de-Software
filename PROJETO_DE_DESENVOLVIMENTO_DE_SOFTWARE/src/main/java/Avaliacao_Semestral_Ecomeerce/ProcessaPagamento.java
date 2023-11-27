package Avaliacao_Semestral_Ecomeerce;



public class ProcessaPagamento {
	private iFabricaCartao cartao;
	private iBandeiraCartao Mastercard;
	private iBandeiraCartao Visa;
	private iBandeiraCartao Senff;
	private iBandeiraCartao Elo;
	public Double valor;
	
	ProcessaPagamento(Cartao cartao, double valor){
		this.cartao = (iFabricaCartao) cartao;
		this.Elo.Pagar(cartao, valor);
		this.Mastercard.Pagar(cartao, valor);
		this.Visa.Pagar(cartao, valor);
		this.Senff.Pagar(cartao, valor);
		
	}
}
