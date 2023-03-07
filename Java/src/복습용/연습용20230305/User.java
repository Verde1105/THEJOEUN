package 복습용.연습용20230305;
//아이디와 패스워드 계좌번호(num)
public class User {
	String id = "";
	String password= "";
	int num = 0;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", num=" + num + "]";
	}
}