package first.common.etc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class FileUpload {
	
	FTPClient ftp = null;
	
	public FileUpload(String host, String user,String pwd) {
		ftp= new FTPClient();
		ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
		int reply;
		try {
			ftp.connect(host);
			reply=ftp.getReplyCode();
			
			if (!FTPReply.isPositiveCompletion(reply)) {
	            System.out.println("ftp connection refused");
	        }
			ftp.login(user, pwd);
			ftp.setFileType(FTP.BINARY_FILE_TYPE);
			ftp.enterLocalPassiveMode();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void removeFile(String fileName, String hostDir) {
		try {
			ftp.deleteFile(hostDir+fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void uploadFile(String localFileFullName, String fileName, String hostDir) {
		try {
			InputStream input=new FileInputStream(new File(localFileFullName));
			this.ftp.storeFile(hostDir+fileName, input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void disconnet() {
		if(this.ftp.isConnected()) {
			try {
				this.ftp.logout();
				this.ftp.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	

	public static void main(String[] args) {
		
		//파일 이름 불러오기 위해 날짜스트링 지정
		Calendar c1 = new GregorianCalendar();
		c1.add(Calendar.DATE, -1); // 오늘날짜로부터 -1
		SimpleDateFormat dateForm= new SimpleDateFormat("yyyy-MM-dd");
		String date = dateForm.format(c1.getTime()); // String으로 저장	
		System.out.println(date);
		
	 System.out.println("Start");
	 
	 FileUpload ftpUp= new FileUpload("192.168.111.101","anonymous","111111");
	 ftpUp.removeFile("log.csv","/pub/");
	 ftpUp.uploadFile("c:\\logs\\carInfoLog.log."+date,"log.csv","/pub/");
	 ftpUp.disconnet();
	 System.out.println("Done");
		

	}

}
