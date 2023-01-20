package reflection02;

public class GetResourceExample {
	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}
}

//	출력 : 
//	/C:/javawork/java0120/bin/reflection02/photo1.jpg
//	/C:/javawork/java0120/bin/reflection02/images/photo2.jpg
