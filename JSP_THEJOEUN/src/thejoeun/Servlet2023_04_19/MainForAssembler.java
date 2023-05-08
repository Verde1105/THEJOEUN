package thejoeun.Servlet2023_04_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainForAssembler {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("명령어를 입력하세요 : ");
			String command = reader.readLine();
			if ( command.equalsIgnoreCase("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			if (command.startsWith("neew")) {
				processNewCommand(command.split(" "));
				continue;
			}else if (command.startsWith("change ")) {
				processChangeCommand(command.split(" "));
				continue;
			}
		}
	}
	
		private static Assembler assembler = new Assembler();
		private static void processNewCommand(String[] args) {
			if (args.length !=5) {
				printHelp();
				return;
			}
			MemberRegisterService reService = assembler.getMemberRegisterService();
			RegisterRequest req = new RegisterRequest();
			req.setemail(args[1]);
			req.setName(args[2]);
			req.setPassword(args[3]);
			req.setConfirmPassword(args[4]);
			if(!req.isPasswordEqualToConfirmPassword()) {
				System.out.println("암호와 확인이 일치하지 않습니다.\n");
				return;
			}
			try {
				reService.regist(req);
				System.out.println("등록했습니다.\n");
			} catch (Exception e) {}
		}
	
	
	private static void processChangeCommand(String[] args) {
		if (args.length != 4) {
			printHelp();
			return;
		}
		
		ChangPasswordService changPwdsvc = assembler.getChangPasswordService();
		try {
			changPwdsvc.ChangPassword(args[1],args[2],args[3]);
			System.out.println("암호를 변경했습니다.\n");
		} catch (MemberMotFoundException e) {
			System.out.println("존재하지 않는 이메일입니다.\n");
		} catch (WrongIdPasswordException ex) {
			System.out.println("이메일과 암호가 일치하지 않습니다.\n");
		}
	}
	private static void printHelp() {
		System.out.println();
		System.out.println("잘못된 명령입니다. 아래 명령어 사용법을 확인하세요.");
		System.out.println("명령어 사용법 : ");
		System.out.println("new 이메일 이름 비밀번호 비밀번호확인");
		System.out.println("change 이메일 현재비밀번호 변경비밀번호");
		System.out.println();
	}
	
}