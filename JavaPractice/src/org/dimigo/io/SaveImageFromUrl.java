/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 * 	 |_SaveImageFromUrl
 * 1. 개요: 
 * 2. 작성일: 2015. 10. 22.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */
public class SaveImageFromUrl {

	public static void main(String[] args) {
		
		String imageUrl = "http://cfs7.tistory.com/upload_control/download.blog?fhandle=YmxvZzgyMzM1QGZzNy50aXN0b3J5LmNvbTovYXR0YWNoLzAvMDYwMDAwMDAwMDAwLmpwZw%3D%3D";
		
		
		try {
			
			URL url = new URL(imageUrl);
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("files/logo.png");

			//파일에 write하기
			int result;
			byte[] buf = new byte[100];
			
			while((result = is.read(buf)) != -1) {
				os.write(buf, 0, result);
			}
			
			System.out.println("Done");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
