package inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);		// 1byte씩 출력
			os.write(b);
			os.write(c);
			
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

// C드라이버의 Temp 폴더에 test1.db 파일이 생성됩니다.
// 해당 내용은 깨지기 때문에 변환이 따로 필요합니다.
// 모든 데이터 형태가 outputstream 형태로 저장 가능합니다.
