package buffer;

import java.io.*;

public class ReadLineExample {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
			new FileReader("src/buffer/ReadLineExample.java")
		);
		
		int lineNo = 1;
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			System.out.println(lineNo + "\t" + str);
			lineNo++;
		}
		br.close();
	}
}

//	출력 : 
//	1	package buffer;
//	2	
//	3	import java.io.*;
//	        ...
//	18			br.close();
//	19		}
//	20	}