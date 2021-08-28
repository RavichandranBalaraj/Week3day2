package Week3.day1;
import Week3.day1.Mobile;
public class Excecution {
	public static void main(String[] args) {
		System.out.println("***********androidphone***********");
		Mobile Moobj =new Androidphone();
		Moobj.Sendmsg();
		Moobj.Savecontact();
		Moobj.Makecall();
		Moobj.Takevideo();
		System.out.println("***********Smartphone***********");
		Mobile sm=new Smartphone();
		sm.Sendmsg();
		sm.Savecontact();
		sm.Makecall();
		sm.connectwhatsapp();
		
		
	}

}
