package java0118;

class AgeException extends Exception{
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
}

public class Exception05 {
	
	public static void ticketing(int age) throws AgeException{
		if(age < 0){
			throw new AgeException("나이 입력이 잘못되었습니다.");
		}
	}
	
	public static void main(String[] args) {			
		int age = -19;
		try {
			ticketing(age);
		} catch(AgeException e) {
			e.printStackTrace();
		}
	}
}

//	출력 : 
//	java0118.AgeException: 나이 입력이 잘못되었습니다.
//		at java0118.Exception05.ticketing(Exception05.java:14)
//		at java0118.Exception05.main(Exception05.java:21)
