package Java_2023_02_28;

public class SmartPlantMain {

	public static void main(String args[]) {
		Plant p = new Plant();
		p.name = "틔움";
		p.humidity = 30;
		p.water = 20;
		System.out.println(p.name);
		System.out.println(p.humidity);
		System.out.println(p.water);
	
		System.out.println("--------------------------------------");
		SmartPlant sp = new SmartPlant();
		sp.name = "new 틔움";
		sp.humidity = 40;
		sp.water = 30;

		System.out.println(sp.name);
		System.out.println(sp.humidity);
		System.out.println(sp.water);
		sp.autoCultivation();

	}
}