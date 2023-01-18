package resource;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (MyResource res = new MyResource("A")){
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리 : " + e.getMessage());
		}
		
		System.out.println();
		
		try (MyResource res = new MyResource("A")){
			String data = res.read2();
			// NumberFormatException 발생
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리 : " + e.getMessage());
		}
		
		System.out.println();

//		MyResource res1 = new MyResource("A");
//		MyResource res2 = new MyResource("B");
//		try(res1;res2){
//		java 9부터 위의 코드는 실행가능합니다.
		try(
			MyResource res1 = new MyResource("A");
			MyResource res2 = new MyResource("B");
		){
			String data1 = res1.read1();
			String data2 = res2.read1();			
		} catch(Exception e) {
			System.out.println("예외 처리 : " + e.getMessage());
		}
	}
}

//	출력 : 
//	[MyResource(A) 열기]
//	[MyResource(A) 읽기]
//	[MyResource(A) 닫기]
//	
//	[MyResource(A) 열기]
//	[MyResource(A) 읽기]
//	[MyResource(A) 닫기]
//	예외 처리 : For input string: "abc"
//	
//	[MyResource(A) 열기]
//	[MyResource(B) 열기]
//	[MyResource(A) 읽기]
//	[MyResource(B) 읽기]
//	[MyResource(B) 닫기]
//	[MyResource(A) 닫기]