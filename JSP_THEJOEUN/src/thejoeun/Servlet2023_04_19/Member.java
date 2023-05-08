package thejoeun.Servlet2023_04_19;

import java.time.LocalDateTime;

public class Member {
	private Long id;
	private String email;
	private String password;
	private String name;
	private LocalDateTime reDateTime;
	public Member(String email, String password, String name, LocalDateTime reDateTime) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.reDateTime = reDateTime;
	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getReDateTime() {
		return reDateTime;
	}
	public void setReDateTime(LocalDateTime reDateTime) {
		this.reDateTime = reDateTime;
	}
	public void changePassword(String oldPassword, String newPassword) {
		if(!password.equals(oldPassword))
			throw new WrongIdPasswordException();
		this.password = newPassword;
	}
}
