package contact;
import java.util.ArrayList;

public class ContactService {
	
	public static String publicID;
	public String publicLastName;
	public String publicFirstName;
	public String publicAddress;
	public String publicPhone;
	
	static ArrayList<Contact> contactList = new ArrayList<Contact>(0);
	
	public static String generateUniqueID() {
		String uniqueID;
		if (contactList.isEmpty()) {
			publicID = "1000000001";
		}
		else {
			int arraySize = contactList.size();
			publicID = contactList.get(arraySize - 1).getID();
		}
		int tempInt = Integer.valueOf(publicID);
		tempInt +=1;
		uniqueID = Integer.toString(tempInt);
		return uniqueID;
	}
	
	public static void addContact(String begName, String endName, String phone, String address) {
		String ID = generateUniqueID();
		Contact Contact1 = new Contact(ID, begName, endName, phone, address);
		contactList.add(Contact1);
	}
	
	public static void addContact(Contact newContact) {
		String tempID = newContact.getID();
		for (int i = 0; i < contactList.size(); i++) {
			if (tempID.equals(contactList.get(i).getID())) {
				throw new IllegalArgumentException("Contact id is not unique");
			}
		}
		contactList.add(newContact);
	}
	
	public static void updateFirstName(String uniqueID, String publicFirstName) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueID.compareTo(contactList.get(i).getID()) == 0) {
				contactList.get(i).setFirst(publicFirstName);
			}
		}
	}
	
	public static void updateLastName(String uniqueID, String publicLastName) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueID.compareTo(contactList.get(i).getID()) == 0) {
				contactList.get(i).setLast(publicLastName);
			}
		}
	}
	
	public static void updatePhone(String uniqueID, String publicPhone) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueID.compareTo(contactList.get(i).getID()) == 0) {
				contactList.get(i).setLast(publicPhone);
			}
		}
	}
	
	public static void updateAddress(String uniqueID, String publicAddress) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueID.compareTo(contactList.get(i).getID()) == 0) {
				contactList.get(i).setLast(publicAddress);
			}
		}
	}
	
	public static void deleteContact(String uniqueID) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueID.compareTo(contactList.get(i).getID()) == 0) {
				int position = i;
				contactList.remove(position);
			}
		}
	}
	
	public static int searchContact(String uniqueID) {
		int result = 0;
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueID.compareTo(contactList.get(i).getID()) == 0) {
				result = 1;
			}
			else {
				result = 2;
			}
		}
		return result;
	}
	
	public static int findIndex(String uniqueID) {
		int result = 0;
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueID.compareTo(contactList.get(i).getID()) == 0) {
				result = i;
			}
		}
		return result;
	}

}


































