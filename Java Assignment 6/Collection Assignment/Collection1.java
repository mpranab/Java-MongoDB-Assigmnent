import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collection1 {

	public static void main(String[] args) {
		HashMap<Long, Contact> m = new HashMap<>();
		m.put(9099119415L, new Contact(9894562064l, "Romeo", "romeo@gmail.com", Contact.Gender.Male));
		m.put(7978509592L, new Contact(9894562034l, "Juliet", "juliet@gmail.com", Contact.Gender.Female));
		Set<Long> keys = m.keySet();
		System.out.println("Keys:");
		for (long i : keys) {
			System.out.println(i);
		}
		System.out.println(" ");
		System.out.println("Values:");
		for (long i : keys) {
			System.out.println(m.get(i));
		}
		System.out.println(" ");
		System.out.println("Key and Value:");
		System.out.println(m);
	}

}

class Contact {

	long phoneNo;
	String name;
	String email;
	private Contact.Gender gen;

	enum Gender {
		Male, Female
	}

	public Contact(long phoneNo, String name, String email, Gender gen) {
		super();
		this.phoneNo = phoneNo;
		this.name = name;
		this.email = email;
		this.gen = gen;
	}

	@Override
	public String toString() {
		return "Contact [phoneNo=" + phoneNo + ", name=" + name + ", email=" + email + ", gen=" + gen + "]";
	}

}
