package Atividade_Observer;



class ConcreteObserver extends Observer {
	
	protected iObservable tracker;
	
	public ConcreteObserver() {}
	
    public ConcreteObserver(Order order) {
        this.order= order;
        this.order.addOrder(this);
    }

   

	public void update(Object arg) {
		
       
		System.out.println("Notificação para Pedido '" + this.order.getOrderId() + "' mudou para '" + arg +"'");
    	
	}
	
	
	public void imprimeObservers() {
		tracker.listOrders();
	}
}






