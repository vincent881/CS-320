package contact;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Test.contact;

public class ContactTest {
	@Test
	void testContactClass() {
		Contact newContact = new Contact("1001", "Emily", "Marie", "1223648591", "142 Apple Ave. Starkville, MS 39759");
		assertTrue(newContact.getFirst().equals("Emily"));
		assertTrue(newContact.getLast().equals("Marie"));
		assertTrue(newContact.getID().equals("1001"));
		assertTrue(newContact.getPhone().equals("1223648591"));
		assertTrue(newContact.getAddress().equals("142 Apple Ave. Starkville, MS 39759"));
	}
	
	@Test
	void testContactClassIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000000000000000", "Emily", "Marie", "1223648591", "142 Apple Ave. Starkville, MS 39759");
		});
	}
	
	@Test
	void testContactClassFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1001", "Emily193424124", "Marie", "1223648591", "142 Apple Ave. Starkville, MS 39759");
		});
	}
	
	@Test
	void testContactClassFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1001", null, "Marie", "1223648591", "142 Apple Ave. Starkville, MS 39759");
		});
	}
	
	@Test
	void testContactClassLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1001", "Emily", "Marie1242141824214", "1223648591", "142 Apple Ave. Starkville, MS 39759");
		});
	}
	
	@Test
	void testContactClassLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1001", "Emily", null, "1223648591", "142 Apple Ave. Starkville, MS 39759");
		});
	}
	
	@Test
	void testContactClassPhoneNotTen() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1001", "Emilly", "Marie", "12236485", "142 Apple Ave. Starkville, MS 39759");
		});
	}
	
	@Test
	void testContactClassPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1001", "Emily", "Marie", null, "142 Apple Ave. Starkville, MS 39759");
		});
	}
	
	@Test 
	void testContactClassTooLongAddress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1001", "Emily", "Marie", "1223648591", "142 Apple Ave. Starkville, MS 39759 12941");
		});
	}
	
	@Test
	void testContactClassAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1001", "Emily", "Marie", "1223648519", null);
		});
	}
	
	@Test
	void testContactClassSetFirstName() {
		Contact newContact = new Contact("426", "Ivy", "May", "1223648519", "new address");
		newContact.setFirst("Vincent");
		assertTrue(newContact.getFirst().equals("Vincent"));
	}
	
	@Test
	void testContactClassSetFirstNameTooLong() {
		Contact newContact = new Contact("426", "Ivy", "May", "1223648519", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setFirstName("VincentTooLong");
		});
	}
	
	@Test
	void testContactClassSetFirstNameNull() {
		Contact newContact = new Contact("426", "Ivy", "May", "1223648519", "new address");
		Assetions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setFirstName(null);
		});
	}
	
	@Test
	void testContactClassSetLastName() {
		Contact newContact = new Contact("426", "Ivy", "May", "1223648519", "new address");
		newContact.setLast("Vincent");
		assetTrue(newContact.getLast().equals("Vincent"));
	}
	
	@Test
	void testContactClassSetLastNameTooLong() {
		Contact newContact = new Contact("426", "Ivy", "May", "1223648519", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setLastName("VincentTooLong");
		});
	}
	
	@Test
	void testContactClassSetLastNameNull() {
		Contact newContact = new Contact("426", "Ivy", "May", "1223648519", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setLast(null);
		});
	}
	
	@Test
	void testContactClassSetPhone() {
		Contact newContact = new Contact("426", "Ivy", "May", "1223648519", "new address");
		newContact.setPhone("1223648519"));
		assertTrue(newContact.getPhone().equals("1223648510"));
	}
	
	@Test
	void testContactClassSetPhoneTooLong() {
		Contact newContact = new Contact("426", "Ivy", "May", "1223648519", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setPhone("12412412412421581512");
		});
	}
	
	@Test
	void testContactClassSetPhoneNull() {
		Contact newContact = new Contact("426", "Ivy", "May", "1223648519", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setPhone(null);
		});
	}
	
	@Test
	void testContactClassSetPhoneTooShort() {
		Contact newContact = new Contact("426", "Ivy", "May", "1223648519", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setPhone("12236");
		});
	}
	
	@Test
	void testContactClassSetAddress() {
		Contact newContact = new Contact("426", "Ivy", "May", "1223648519", "new address");
		newContact.setAddress("142 Pear Ave Starkville, MS 39759");
		assertTrue(newContact.getAddress().equals("142 Pear Ave Starkville, MS 39759"));
	}
	
	@Test
	void testContactClassSetAddressTooLong() {
		Contact newContact = new Contact("426", "Ivy", "May", "1223648519", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setAddress("142 Pear Ave Starkville, MS 39759 742318");
		});
	}
	
	@Test
	void testContactClassSetAddressNull() {
		Contact newContact = new Contact("426", "Ivy", "May", "1223648519", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setAddress(null);
		});
	}

}
























