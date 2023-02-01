package file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		// File 객체 생성
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
		// 존재하지 않으면 디렉토리 또는 파일 생성
		if(dir.exists() == false) { dir.mkdirs();}
		if(file1.exists() == false) { file1.createNewFile();}
		if(file2.exists() == false) { file2.createNewFile();}
		if(file3.exists() == false) { file3.createNewFile();}
		
		// Temp 폴더의 내용을 출력
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.printf("%-10s%-20s", "<DIR>", file.getName());
			} else {
				System.out.printf("%-10s%-20s", file.length(), file.getName());				
			}
			System.out.println();
		}
	}
}

//	출력 : 
//	2023-01-31 오후 14:30      0         file1.txt           
//	2023-01-31 오후 14:30      0         file2.txt           
//	2023-01-31 오후 14:30      0         file3.txt           
//	2022-12-05 오후 12:29      629       hello2022.class     
//	2022-12-05 오후 12:29      127       hello2022.java      
//	2023-01-31 오후 14:30      <DIR>     images              
//	2023-01-31 오후 14:07      193       object.dat          
//	2023-01-31 오전 11:33      46        primitive.db        
//	2023-01-31 오후 12:24      172       printstream.txt     
//	2023-01-31 오전 10:36      664489    targetFile1.jpg     
//	2023-01-31 오전 10:36      664489    targetFile2.jpg     
//	2023-01-27 오후 19:54      67167     test.jpg            
//	2023-01-31 오전 09:29      43        test.txt            
//	2023-01-30 오후 16:25      3         test1.db            
//	2023-01-30 오후 16:43      3         test2.db            
//	2023-01-30 오후 17:25      67167     test2.jpg           
//	2023-01-30 오후 16:51      3         test3.db            
//	2023-01-30 오후 17:51      67167     test5.jpg           
