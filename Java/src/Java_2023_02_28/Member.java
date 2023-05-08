package Java_2023_02_28;

public class Member {

	private String name;
	private String id;
	private String pw;
	public Member(String name, String id, String pw) {
		this.name= name; 
		this.id=id; 
		this.pw=pw;
	}
	public void setName(String name){		//자바 빈 디자인패턴
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
}
