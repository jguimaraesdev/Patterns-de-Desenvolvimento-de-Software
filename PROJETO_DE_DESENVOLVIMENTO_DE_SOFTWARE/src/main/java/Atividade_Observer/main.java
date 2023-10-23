package Atividade_Observer;

public class main {

	public static void main(String[] args) {
		 	//(String Status, String Location, String  customerName)
		
		Order order1 = new Order("Pedro");
        Order order2 = new Order("João");
        
        
        
        order1.addOrder(new ConcreteObserver(order1));
        order2.addOrder(new ConcreteObserver(order2));

        //order1.setStatus("Entregue");
       order1.setLocation("Cliente");
	   
        ConcreteObserver x = new ConcreteObserver();
        x.imprimeObservers();
	}

}
