package thejoeun.Servlet2023_04_19;

public class Greeter {
	
	private String format;
	public void setFormat(String format) {
		this.format = format;
	}
	public String greet(String guest) {
		return String.format(format, guest);
	}
}
