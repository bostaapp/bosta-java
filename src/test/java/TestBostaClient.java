import org.testng.annotations.Test;


import com.bosta.BostaClient;
import com.bosta.dto.delivery.Delivery;
import com.bosta.dto.delivery.Receiver;

public class TestBostaClient {
	BostaClient client = 
			new BostaClient("e0bef5cfcf2cb4051bc661fedf8f8ad328a23c151da6eb877cca3c1a32c6111b");
	@Test
	public void testBostaClient() {
		// client.getDelivery("2774255");
		Receiver receiver = new Receiver.Builder("first name", "last name", "01010187373").build();
		Delivery delivery = new Delivery.Builder(10, 500, receiver).build();
		
		client.createDelivery(delivery);
	}

}
