package Atividade_Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import Solid_AULA08_Observer.ABSObserver;

public class orderTracker implements iObservable{
	
	

	private List<Observer> orders = new ArrayList<>();
	
	
	
	
	@Override
	public void addOrder(Observer o) {
		
		this.orders.add(o);
	}


	@Override
	public void updateOrderStatus(UUID orderId, String newStatus) {
		
		for(Observer x: orders) {
			
		 if (x.order.getOrderId() == orderId) {
	            
	            x.order.setStatus(newStatus);
		 }
		}
	}



	@Override
	public void updateOrderLocation(UUID orderId, String newLocation) {
		
		for(Observer x: orders) {
			
			 if (x.order.getOrderId() == orderId) {
		            
		            x.order.setLocation(newLocation);
			 }
		}
		
	}




	@Override
	public void listOrders() {
		
		
		for(Observer x: getOrders()) {
	
			  System.out.println(x);
		                    
		}
		
	}
	
	@Override
	public void notifyObservers(Object arg) {
		
		for (Observer observer : orders) {
            observer.update(arg);
        }
		
	}

	
	//---------------------------------------------------------------------------------//
	
	public List<Observer> getOrders() {
		return orders;
	}


	public void setOrders(List<Observer> orders) {
		this.orders = orders;
	}
}
	   