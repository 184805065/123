import user.*;
import accountSystem.*;
import utility.XMLUtility;
public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TelcomUser telcomUser = new TelcomUser("13800138000");
		telcomUser.generateCommunicateRecord();
		telcomUser.printDetails();
	}

}
