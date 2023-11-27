package Avaliacao_Semestral_Ecomeerce;

public class Mastercard implements iBandeiraCartao{
	

	@Override
	public String Pagar(Cartao cartao, Double valor) {
		if(cartao.limite < valor) {
			return "Compra Aprovada";
		}else {
			return "Compra não aprovada";
		}
		
		
	}
	


	

}
