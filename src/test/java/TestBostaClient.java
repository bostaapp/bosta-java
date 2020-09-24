import org.testng.annotations.Test;


import com.bosta.BostaClient;
import com.bosta.enums.DeliveryType;
import com.bosta.request.delivery.Delivery;
import com.bosta.request.delivery.DropOffAddress;
import com.bosta.request.delivery.PackageDetails;
import com.bosta.request.delivery.Receiver;
import com.bosta.request.delivery.Specs;

public class TestBostaClient {
	BostaClient client = 
			new BostaClient("e0bef5cfcf2cb4051bc661fedf8f8ad328a23c151da6eb877cca3c");
	@Test
	public void testBostaClient() {
		// client.getDelivery("6849119");
		Receiver receiver = new Receiver
				.Builder("first name", "last name", "01010187373").build();
		PackageDetails packageDetails = new PackageDetails.Builder()
				.itemsCount(5)
				.document("Document")
				.description("dec")
				.build();
		Specs specs = new Specs.Builder()
				.size("SMALL")
				.packageDetails(packageDetails)
				.build();
		DropOffAddress dropOffAddress = new DropOffAddress.Builder()
				.city("EG-01")
				.zone("Maadi & Muqattam")
				.district("Maadi")
				.firstLine("Maadi")
				.secondLine("Nasr  City")
				.buildingNumber("123")
				.floor("12")
				.apartment("12")
				.build();
		Delivery delivery = new Delivery.Builder(DeliveryType.SEND, 500, receiver)
				.dropOffAddress(dropOffAddress)
				.specs(specs).notes("Notes")
				.businessReference("13123123")
				.webhookUrl("https://www.google.com/")
				.build();
		
		client.createDelivery(delivery);
	}

}
