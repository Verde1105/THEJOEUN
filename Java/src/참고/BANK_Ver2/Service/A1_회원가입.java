package 참고.BANK_Ver2.Service;
//import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import 참고.Dao.User;

public class A1_회원가입 {
	/* 1. 회원가입 기능 */
	public static List<User> 회원가입(List<User> database, String awtID, String awtPW) throws Exception{
		
		String id = null;
		String password = null;
		User user = new User();
		
		// awt를 통해 입력받는 경우 기존방식 skip
		if (awtID.equals("없음")) {
			System.out.print("아이디 입력 : ");
			id = new Scanner(System.in).nextLine();
			System.out.print("비밀번호 입력 : ");
			password = new Scanner(System.in).nextLine();
		}else {
			// 기존방식으로 접근하는 경우
			id = awtID;
			password = awtPW;
		}
		
		
		boolean debugMode = false;
		
		System.out.println("ID : "+id);
		System.out.println("PW : "+password);
		String 계좌번호 = "";
		
		if ( database.size() == 0) {
			/* 총 13자리 */
			// 1. 5
			// 2. 3
			// 3. 5
			계좌번호 =  String.valueOf((int)(Math.random()*(100000-10000))+10000);// 100000 ~ 10000 범위의 난수 발생
			계좌번호 += "-";
			계좌번호 +=String.valueOf((int)(Math.random()*(1000)-(100))+100);		// 100 - 1000 범위의 난수 발생
			계좌번호 += "-";
			계좌번호 += String.valueOf((int)(Math.random()*(100000-10000))+10000);// 100000 ~ 10000 범위의 난수 발생
			
			user.setId(id);					// 아이디
			user.setPw(password);			// 비밀번호
			user.setBalance("0");			// 비밀번호
			user.setAccountNum(계좌번호);	// 비밀번호
			insertData(id, password, 계좌번호);
			database.add(user);
		}else {
			
			for (int i = 0; i < database.size(); i++) {
				if ( database.get(i)!=null && !database.get(i).getId().equals(id) ) {
					// System.out.println(i + " index is null");
					
					/* 총 13자리 */
					// 1. 5
					// 2. 3
					// 3. 5
					계좌번호 =  String.valueOf((int)(Math.random()*(100000-10000))+10000);// 100000 ~ 10000 범위의 난수 발생
					계좌번호 += "-";
					계좌번호 +=String.valueOf((int)(Math.random()*(1000)-(100))+100);		// 100 - 1000 범위의 난수 발생
					계좌번호 += "-";
					계좌번호 += String.valueOf((int)(Math.random()*(100000-10000))+10000);// 100000 ~ 10000 범위의 난수 발생
					
					user.setId(id);					// 아이디
					user.setPw(password);			// 비밀번호
					user.setBalance("0");			// 비밀번호
					user.setAccountNum(계좌번호);	// 비밀번호
					
					database.add(user);
					insertData(id, password, 계좌번호);
					
					break;
				}else if( database.get(i).getId().equals(id) ){
					System.out.println("------------------------------------------------");
					System.out.println("************* === 회원가입 실패 === ************");
					System.out.println("************** 중복된 아이디 입니다.************");
					System.out.println("------------------------------------------------");
					break;
				}
			}// The end of for (data insert)
		}
		
		// 1. 기존파일 경로 path(경로)에 저장
		String path = System.getProperty("user.dir") + "\\src\\PROJECT\\BANK_Ver2\\Service\\Database.txt";
		
		// 2. 저장한 경로를 통해 파일쓰기 생성
		FileWriter textFw = new FileWriter(path, true);
		
		// 3. 파일쓰기를 통해 *쓰기버퍼*를 생성
		BufferedWriter textBw = new BufferedWriter(textFw);
		
		// 4. 회원가입한 데이터를 *쓰기버퍼*에 입력
		if (database.size()>0) {
			textBw.write(database.get(database.size()-1).toString()+"\n");
		}
		
		// 5. BufferedWriter(쓰기버퍼)에 입력한 내용을 파일에 저장
		textBw.flush();
		textBw.close();
		
		return database;
	}// The end of method
	
	public static void insertData(String id, String password, String AccountNum) {
		
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = null;
		Statement st = null;
		
		try {
			Class.forName(dr);
			System.out.println("데이터베이스 드라이버 로딩 성공");
			con = DriverManager.getConnection(url,"root", "java");
			System.out.println("데이터베이스 연결 성공!");
			st = con.createStatement();//창조자
//			String createSql = "create table 데이터베이스(ID varchar(5), PW varchar(15), balance int, accountNum varchar(100))";//id = 컬럼
			String insertSql = "INSERT INTO 데이터베이스 VALUES('"+id+"','"+password+"','0','"+AccountNum+"')";
//			st.executeUpdate(createSql);
			st.executeUpdate(insertSql);
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결실패");
			e.printStackTrace();//뭔 예외인지 설명해주는 애
		}finally {
			try {
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				System.out.printf("Exception >> %s",e2);
			}
		}
	}// The end of method
}
