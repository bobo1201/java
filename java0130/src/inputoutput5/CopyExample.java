package inputoutput5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = "C:/Temp/test.jpg";
		String targetFileName = "C:/Temp/test5.jpg";
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		
		byte[] data = new byte[1024];
		long startTime = System.nanoTime();
		
		while(true) {
			int num = is.read(data);
			if(num == -1) break;
			os.write(data, 0, num);
		}
		long endTime = System.nanoTime();
		
		System.out.println(endTime - startTime);
		
		os.flush();
		os.close();
		is.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}

//	1byte : 418250500
//	복사가 잘 되었습니다.

//	1024byte : 546300
//	복사가 잘 되었습니다.