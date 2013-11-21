/**
 * 은행계좌 클래스
 * @author 신윤재 2013 10 03
 *
 */

class Account {
	/**
	 * 계좌번호
	 */
    String accountNo;    // 계좌번호
    /**
     * 예금주 이름
     */
    String ownerName;    // 예금주 이름
    /**
     * 잔액
     */
    int balance;         // 잔액
 
    
    /**
     * Account 생성자
     * @param accountNo:계좌번호
     * @param ownerName:예금주 이름 
     * @param balance :잔액
     */
    Account(String accountNo, String ownerName, int balance) {     // 생성자
        this.accountNo = accountNo; 
        this.ownerName = ownerName;  
        this.balance = balance;       
    }
    /**
     * 
     * @param amount
     */
    void  deposit(int amount)  {       
        balance += amount;
    }
    /**
     * 출금한다.
     * @param amount:출금액
     * @return :출금액
     * @throws Exception
     */
    int withdraw(int amount) throws Exception {
        if (balance < amount){
            //return 0;
        		throw new Exception("잔액이 부족합니다.");
    }
        balance -= amount;
        return this.balance;
    }
}
