package thejoeun.Servlet2023_04_19;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		 System.out.println("(g1 == g2) = " + (g1== g2));
		 ctx.close();
	}
}
