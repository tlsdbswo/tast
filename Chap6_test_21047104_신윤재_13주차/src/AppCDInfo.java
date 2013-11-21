
public class AppCDInfo extends CDInfo implements Lendable{
	String borrower;
	String checkOutDate;
	byte state;
	
	AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
	}

	@Override
	public void checkOut(String borrower, String date) {
	if (state ==0){
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		
		System.out.println("*"+title+"CD가 대출되었습니다.");
		System.out.println("대출인:"+this.borrower);
		System.out.println("대출일:"+this.checkOutDate );
		}else{
			System.out.println("대불이 불가능 합니다");
		}
	
	
	}

	@Override
	public void checkIn() {
		this.borrower =null;
		this.checkOutDate = null;
	}

}
