import org.testng.annotations.Test;


import com.bosta.BostaClient;

public class TestBostaClient {
	BostaClient client = 
			new BostaClient("6fdd50c8c9234db89a60a807abb503bb49c461e6cb7b89df56b275b84718cf79");
	@Test
	public void testBostaClient() {
		client.getDelivery("2774255");
		// Receiver receiver = new Receiver.Builder("first name", "last name", "01010187373").build();
		// Delivery delivery = new Delivery.Builder(10, 500, receiver).build();
		
		// client.createDelivery(delivery);
	}

}
