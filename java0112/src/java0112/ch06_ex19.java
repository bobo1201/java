package java0112;

public class ch06_ex19 {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고 : " + account.getBalance());
	}
}

class Account {
	
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	int balance;
	
	public int getBalance() {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			return balance;
		} else {
			return temp;
		}
		int temp = balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
