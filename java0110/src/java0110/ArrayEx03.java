 package java0110;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		String[] oldArr = { "java", "array", "copy" };
		
		String[] newArr = new String[5];
		String[] newArr1 = new String[5];
		String[] newArr2 = new String[5];		
		
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
		System.arraycopy(oldArr, 1, newArr1, 1, oldArr.length-1);
		System.arraycopy(oldArr, 0, newArr2, 2, oldArr.length-1);
		
		for(int i=0; i<newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<newArr.length; i++) {
			System.out.print(newArr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<newArr.length; i++) {
			System.out.print(newArr2[i] + " ");
		}
		System.out.println();
		
		for(String a: newArr) {
			System.out.print(a + " ");
		}
	}
}

// 출력 : 
// java array copy null null 
// null array copy null null 
// null null java array null 
// java array copy null null 