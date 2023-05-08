package thejoeun.Servlet2023_04_19;

import org.apache.taglibs.standard.lang.jstl.BooleanLiteral;

public class RegisterRequest {
	private String email;
	private String password;
	private String confirmPassword;
	private String name;
	
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean isPasswordEqualToConfirmPassword() {
		return password.equals(confirmPassword);
	}
		
}
