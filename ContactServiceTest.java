package contact;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.api.Test;

public class ContactServiceTest {
	
	@Test
	void testContactServiceClass() {
		ContactService.addContact("Emily", "Marie", "1223648591", "142 Apple Ave. Starkville, MS 39759");
		assertTrue(ContactService.contactList.get(0).getID().equals("0000000000"));
		assertTrue(ContactService.contactList.get(0).getFirst().equals("Emily"));
		assertTrue(ContactService.contactList.get(0).getLast().equals("Marie"));
		assertTrue(ContactService.contactList.get(0).getPhone().equals("1223648591"));
		assertTrue(ContactService.contactList.get(0).getAddress().equals("142 Apple Ave. Starkville, MS 39759");
	}
	
	@Test
	void testContactServiceDelete() {
		ContactService.addContact("Emily", "Marie", "1223648591", "142 Apple Ave. Starkville, MS 39759");
		int size = ContactService.contactList.size();
		ContactService.deleteContact("0000000001");
		assertTrue(ContactService.searchContact("0000000001") == 2);
	}
	
	@Test
	void testContactServiceUpdateFirstName() {
		ContactService.addContact("Emily", "Marie", "1223648591", "142 Apple Ave. Starkville, MS 39759");
		int size = ContactService.contactList.size();
		System.out.println(ContactService.contactList.get(size - 1).getID());
		System.out.println(ContactService.contactList.get(size - 1).getFirst());
		ContactService.updateFirstName("0000000003", "Stephanie");
		System.out.println(ContactService.contactList.get(size - 1).getFirst());
		assertTrue(ContactService.contactList.get(size - 1).getFirst().equals("Stephanie"));
	}
	
	@Test
	void testContactServiceUpdateLastName() {
		int size = ContactService.contactList.size();
		ContactService.updateLastName("0000000003", "Jesse");
		assertTrue(ContactService.contactList.get(size - 1).getLast().equals("Jesse"));
	}
	
	@Test
	void testContactServiceUpdatePhone() {
		int target = 0;
		target = ContactService.findIndex("0000000003");
		ContactService.updatePhone("0000000003", "2289348909");
		assertTrue(ContactService.contactList.get(target).getPhone().equals("2289348909"));
	}
	
	@Test
	void testContactServiceUpdateAddress() {
		int target = 0;
		target = ContactService.findIndex("0000000003");
		ContactService.updateAddress("0000000003", "521 Strawberry St Starkville, MS 39759");
	}
	
	@Test
	void testContactServiceUniqueID() {
		Contact newContact = new Contact("6324", "Nick", "Farrel", "4348597640", "Original Address");
		ContactService.addContact(newContact);
		Contact duplicateID = new Contact("6324", "Nick", "Farrel", "4348597640", "Duplicate Address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService.addContact(duplicateID);
		});
	}

}
