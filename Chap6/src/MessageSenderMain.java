
public class MessageSenderMain {


	public static void main(String[] args) {
		EMailSender obj1 =new EMailSender("생일을 축하합니다","고객센터","admin@dukeeshop.co.kr",
				"10%g 할인 쿠폰이 발생되었습니다.");

		SMSSender obj2 = new SMSSender("생일을 축카합니다",
				"고객센터","02-0000-0000","10%g 할인 쿠폰이 발생되었습니다.");
		
		obj1.sendMessage("ehdwnstls@hanmail.net");
		obj2.sendMessage("010-8516-5707");
	}

}
