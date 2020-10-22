import java.util.Date;

import org.testng.annotations.Test;


import com.bosta.BostaClient;
import com.bosta.common.ContactPerson;
import com.bosta.enums.DeliveryType;
import com.bosta.enums.ScheduledTimeSlot;
import com.bosta.request.delivery.CreateDeliveryRequest;
import com.bosta.request.delivery.DropOffAddress;
import com.bosta.request.delivery.PackageDetails;
import com.bosta.request.delivery.Receiver;
import com.bosta.request.delivery.Specs;
import com.bosta.request.delivery.UpdateDeliveryRequest;
import com.bosta.request.pickup.CreatePickupRequest;
import com.bosta.request.pickup.UpdatePickupRequest;

public class TestBostaClient {
	BostaClient client = 
			new BostaClient("e0bef5cfcf2cb4051bc661fedf8f8ad328a23c151da6eb877cca3c");
	@Test
	public void testBostaClient() {
		testUpdatePickup();
	}

	public void testListDeliveries(int perPage, int page) {
		try {
			client.listDeliveries(perPage, page);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	public void testListDeliveries() {
		try {
			client.listDeliveries();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	public void testGetDeliveryTracking() {
		try {
			client.getDeliveryTracking("8C-4g4wA5G");
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	public void testGetDeliveryAwb() {
		try {
			client.getDeliveryAwb("8C-4g4wA5G");
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	public void testTerminateDelivery() {
		try {
			client.terminateDelivery("CxQe6vcxe7");
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	public void testUpdateDelivery() {
		try {
			UpdateDeliveryRequest delivery = new UpdateDeliveryRequest.Builder()
					.notes("Notes test")
					.businessReference("55555555")
					.webhookUrl("https://www.google.com/test")
					.build();
			client.updateDelivery(delivery, "T7Sev1-rwN");
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	public void testGetDelivery() {
		try {
			client.getDelivery("6849119");
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	public void testCreateDelivery() {
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
		CreateDeliveryRequest delivery = new CreateDeliveryRequest.Builder(DeliveryType.SEND, 500, receiver)
				.dropOffAddress(dropOffAddress)
				.specs(specs).notes("Notes")
				.businessReference("13123123")
				.webhookUrl("https://www.google.com/")
				.build();

		try {
			client.createDelivery(delivery);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	public void testCreatePickup() {
		ContactPerson contactPerson = new ContactPerson
				.Builder()
				.email("test@email.coom")
				.name("Test name")
				.phone("01001001000")
				.build();

		CreatePickupRequest createPickupRequest = new CreatePickupRequest
				.Builder(new Date("Mon Nov 9 2020 00:00:00 GMT+0200"),ScheduledTimeSlot.FROM_10_TO_13)
				.notes("Test")
				.contactPerson(contactPerson)
				.build();
		try {
			client.createPickup(createPickupRequest);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	public void testListPickups(int pageId) {
		try {
			client.listPickups(pageId);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	public void testGetPickup(String pickupId) {
		try {
			client.getPickup(pickupId);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	
	public void testUpdatePickup() {
		ContactPerson contactPerson = new ContactPerson
				.Builder()
				.email("test@email.coom")
				.name("Test name")
				.phone("01001001000")
				.build();

		UpdatePickupRequest updatePickupRequest = new UpdatePickupRequest
				.Builder()
				.notes("Test update")
				.contactPerson(contactPerson)
				.build();
		try {
			client.updatePickup(updatePickupRequest, "070000000349");
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}
