package inputoutput2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test2.db");
			
			byte array[] = {10, 20, 30};
			
			os.write(array);

			
			// 버퍼를 비워둠
			os.flush();
			
			// 사용하는 메모리를 더이상 사용하지 않음(메모리 해제)
			// 메모리를 닫지 않으면 초기화 되지 않고 남습니다.
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
