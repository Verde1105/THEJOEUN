package Java_2023_03_08;

public class 로또정답 {
	public static void main(String[] args) {
		int[] temp = new int[6];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = ran.nextInt(6) + 1;
			for (int j = 0; j < i; j++) {
				if(temp[i]==temp[j]) {
					temp[i] =ran.nextInt(6) + 1;
					j = -i;
				}
				
			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		
	}
}
