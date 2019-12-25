import java.util.*;
public class DBUtil {
	private static DBUtil instance=null;
	private HashMap<String,User> users=new HashMap<String,User>();
	private DBUtil() {
		//陈冰洁-----------------------------------
		User u1=new User();
		u1.setCardId("1001");
		u1.setCardPwd("123456");
		u1.setUserName("陈冰洁");
		u1.setCall("17512345678");
		u1.setAccount(100000000);
		users.put(u1.getCardId(),u1);
		//-----------小明-------------------------
		User u2=new User();
		u2.setCardId("1002");
		u2.setCardPwd("1234567");
		u2.setUserName("小明");
		u2.setCall("17512345677");
		u2.setAccount(1000);
		users.put(u2.getCardId(),u2);
		//-----------小华-------------------------
		User u3=new User();
		u3.setCardId("1003");
		u3.setCardPwd("12345678");
		u3.setUserName("小华");
		u3.setCall("17512345679");
		u3.setAccount(100000);
		users.put(u3.getCardId(),u3);
	}
	public static DBUtil getInstance() {
		if(instance==null) {
			synchronized(DBUtil.class) {
				if(instance==null) {
					instance=new DBUtil();
				}
			}
		}
		return instance;
	}
	public User getUser(String cardId) {
		User user=(User)users.get(cardId);
		return user;
	}
	public HashMap<String,User>getUsers(){
		return users;
	}
}
