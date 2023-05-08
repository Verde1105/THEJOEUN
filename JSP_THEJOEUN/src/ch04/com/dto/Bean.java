package ch04.com.dto;

public class Bean {
	private String id;
	private String pw;
	private String name;
	
	public Bean() {	
	}
	
	public String getPw() {
		return pw;
	}

	public Bean setPw(String pw) {
		this.pw = pw;
		return this;
	}

	public String getId() {
		return id;
	}

	public Bean setId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Bean setName(String name) {
		this.name = name;
		return this;
	}

}
