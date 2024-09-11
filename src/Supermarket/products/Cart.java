package Supermarket.products;

public class Cart {
	
	public static void main(String[] args) {
		BeverageProduct Sprite = new BeverageProduct("Sprite", 2.25, 10, SugarLevel.LIGHT);
		BeverageProduct Coke = new BeverageProduct("Coke", 5, 5, SugarLevel.ADDED_SUGAR);
		BeverageProduct Fanta = new BeverageProduct("Fanata", 2, 0, SugarLevel.NO_ADDEDSUGAR);
		
		
		DiaryProduct YogurtMilk = new DiaryProduct("Yogurt Milk", 2, 10, Fat.HALFCREAM);
		DiaryProduct FatMilk = new DiaryProduct("Fat Milk", 6, 5, Fat.FULLCREAM);
		DiaryProduct PercentMilk = new DiaryProduct("2% Milk", 1.1, 0, Fat.SKIMMED);
		
		
		System.out.println(Sprite.isHealthy());
		System.out.println(Coke.isHealthy());
		
	
		System.out.println(Coke.getActualPrice());
		System.out.println(Coke.getDiscount());
		System.out.println(Coke.getName());
		System.out.println(Coke.getPrice());
		System.out.println(Sprite.getActualPrice());
		System.out.println(Sprite.getName());
		
		
		System.out.println(Sprite);
		System.out.println(Coke);
		System.out.println(Fanta);
		
		System.out.println(YogurtMilk);
		System.out.println(FatMilk);
		System.out.println(PercentMilk);
		
		

	}
}
