package Atividade_Observer;

import java.util.UUID;

public interface iObservable {
	
	void addOrder(Observer o);
	public void updateOrderStatus(UUID orderId, String newStatus);
	public void updateOrderLocation(UUID orderId, String newLocation);
	public void listOrders();
	public void notifyObservers(Object arg);
}
