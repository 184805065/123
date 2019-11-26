package accountSystem;
import user.*;
public class MobileAccountSystem {
	public User produce(String phonenumber) {
		return new MobileUser(phonenumber);
	}
}
