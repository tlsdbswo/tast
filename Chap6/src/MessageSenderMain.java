
public class MessageSenderMain {


	public static void main(String[] args) {
		EMailSender obj1 =new EMailSender("������ �����մϴ�","������","admin@dukeeshop.co.kr",
				"10%g ���� ������ �߻��Ǿ����ϴ�.");

		SMSSender obj2 = new SMSSender("������ ��ī�մϴ�",
				"������","02-0000-0000","10%g ���� ������ �߻��Ǿ����ϴ�.");
		
		obj1.sendMessage("ehdwnstls@hanmail.net");
		obj2.sendMessage("010-8516-5707");
	}

}
