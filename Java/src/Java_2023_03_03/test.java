
public class test {//클래스명 z로 바꿀

		class X {
		   protected int i = 10;                        
		   protected String msg = " I am an X.";            
		   
		   public void print() {                        
		      System.out.println(msg);
		   }
		   
		   public void play() {                        
		      System.out.println("Play.."+msg);
		   }
		}

		class Y extends X {
		   protected int i = 20;                        
		   protected String msg = "I am an Y.";            
		   @Override
		   public void print() {                        
		      System.out.println(msg);
		   }
		   
		}

		public class Z extends Y{
		   protected int i = 30;                        
		   protected String msg = "I am a Z.";
		   public void print() {                        
		      System.out.println(msg);
		   }
		   public void play() {
		      System.out.println("Play.." + msg);
		   }
		   public void doZ() {
		      System.out.println("do something in Z.");
		   }

		public void test(int i) {
			Z	z = new Z();//형변환 이루어짐
			Y	Y = z;
			X	x = z;
//			문제
			z.print();//오버라이드,아이엠어제트가 나와야 정상
			y.print();
			x.print();
			super.print();//아이엠 언 와이가 나와야 정상
			play();//DIS.플레이?
			super.play();
//			y.doz();
			//super.super.print();
			System.out.println("\ni =" + i);
			System.out.println("this.i = " + this.i);
			System.out.println("super.i =" + super.i);
			System.out.println("y.i = " + y.i);
			System.out.println("x.i = " + x.i);
			System.out.println("((Y)this).i = " + ((Y)this).i);
			System.out.println("((X)this).i = " + ((X)this).i);
		}
		}
		
		public static void main(String[] args) {
			Z z = new Z();
			z.test(15);
			
		}
		
	}
