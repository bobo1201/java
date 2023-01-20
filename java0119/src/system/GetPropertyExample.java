package system;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {
		
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		// 전체 키와 값으로 출력
		System.out.println("----------------------------");
		System.out.println(" key: value ");
		System.out.println("----------------------------");
		Properties props = System.getProperties();
		Set keys = props.keySet();
		
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.printf("%-40s: %s\n", key, value);
		}
		
	}
}

//	출력 : 
//	Windows 10
//	codepc
//	C:\Users\codepc
//	----------------------------
//	 key: value 
//	----------------------------
//	java.runtime.name                       : Java(TM) SE Runtime Environment
//	sun.boot.library.path                   : C:\Program Files\Java\jdk1.8.0_251\jre\bin
//	java.vm.version                         : 25.251-b08
//	.
//	.
//	.
