package Atividade_Observer;



import java.util.UUID;

public class Order extends orderTracker{
	
    private UUID orderId;
    private String status;
    private String location;
    private String customerName;
    
 
    //---------------------------------------------------------------------------------//
   

	public Order(String  customerName) {
        this.setOrderId(UUID.randomUUID()); // Gera um identificador único para o pedido
        this.setStatus("Pendente");
        this.setLocation("Aguardando");
        this.setCustomerName(customerName);
    }
	
	
	  //---------------------------------------------------------------------------------//

	public UUID getOrderId() {
		return orderId;
	}


	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
		this.notifyObservers(status);
		
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
        this.notifyObservers(location);
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
    
	public String imprimirorder() {
		
		String var = ("\nPedido: "+ orderId 
        + "\nStatus: " + status 
        + "\nLocalização: " + location
        + "\nNome: " + customerName);
		
		return var;
	}
    
  //---------------------------------------------------------------------------------//
    
    
    
    
    
    
  
 	
 	
}

