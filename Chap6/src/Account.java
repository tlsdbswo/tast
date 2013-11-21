/**
 * ������� Ŭ����
 * @author ������ 2013 10 03
 *
 */

class Account {
	/**
	 * ���¹�ȣ
	 */
    String accountNo;    // ���¹�ȣ
    /**
     * ������ �̸�
     */
    String ownerName;    // ������ �̸�
    /**
     * �ܾ�
     */
    int balance;         // �ܾ�
 
    
    /**
     * Account ������
     * @param accountNo:���¹�ȣ
     * @param ownerName:������ �̸� 
     * @param balance :�ܾ�
     */
    Account(String accountNo, String ownerName, int balance) {     // ������
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
     * ����Ѵ�.
     * @param amount:��ݾ�
     * @return :��ݾ�
     * @throws Exception
     */
    int withdraw(int amount) throws Exception {
        if (balance < amount){
            //return 0;
        		throw new Exception("�ܾ��� �����մϴ�.");
    }
        balance -= amount;
        return this.balance;
    }
}
