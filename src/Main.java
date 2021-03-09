import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		final double CARB_CALORIES_PER_GRAM = 4.1;
		final double PROTEIN_CALORIES_PER_GRAM = 4.1;
		final double FAT_CALORIES_PER_GRAM = 9;
		
		int calories;
		int carbPercentage;
		int proteinPercentage;
		int fatPercentage;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter calaries -> ");
		calories = sc.nextInt();
		System.out.println("Enter carbPercentage -> ");
		carbPercentage = sc.nextInt();
		System.out.println("Enter proteinPercentage -> ");
		proteinPercentage = sc.nextInt();
		System.out.println("Enter fatPercentage -> ");
		fatPercentage = sc.nextInt();
		
		int carbs_calaries = Util.getCalaries(calories, carbPercentage);
		int protein_calaries = Util.getCalaries(calories, proteinPercentage);
		int fat_calaries = Util.getCalaries(calories, fatPercentage);
		
		int carbs_weight = Util.getWeight(carbs_calaries, CARB_CALORIES_PER_GRAM);
		int protien_weight = Util.getWeight(protein_calaries, PROTEIN_CALORIES_PER_GRAM);
		int fat_weight = Util.getWeight(fat_calaries, FAT_CALORIES_PER_GRAM);
		
		//System.out.println(carbs_calaries);
		//System.out.println(protein_calaries);
		//System.out.println(fat_calaries);
		
		//System.out.println(carbs_weight);
		//System.out.println(protien_weight);
		//System.out.println(fat_weight);

		Item rice = new Item("Rice", 92, 0, 8);
		Item yellowLentils = new Item("Yellow Lentils", 76, 0, 24);
		Item egg = new Item("Egg", 10, 50, 40);
		Item peanuts = new Item("Peanuts", 8, 60, 32);
		Item cashew = new Item("Cashew", 0, 70, 30);
		Item milk = new Item("Milk", 30, 40, 30);
		Item apple = new Item("Apple", 100, 0, 0);
		Item spinach = new Item("Spinach", 60, 0, 40);
		Item butter = new Item("Butter", 0, 100, 0);
		Item cheese = new Item("Cheese", 0, 60, 40);
		Item almonds = new Item("Almonds", 5, 55, 40);
		
		
		
		ItemWithWeight riceWeight = new ItemWithWeight("Rice", Util.getWeightPerItem(carbs_weight, rice.getCarbs(), Item.getCarbsTotal()),
				Util.getWeightPerItem(protien_weight, rice.getProtien(), Item.getProtienTotal()), Util.getWeightPerItem(fat_weight, rice.getFat(), Item.getFatTotal()));
		ItemWithWeight yellowLentilsWeight = new ItemWithWeight("Yellow Lentils", Util.getWeightPerItem(carbs_weight, yellowLentils.getCarbs(), Item.getCarbsTotal()),
				Util.getWeightPerItem(protien_weight, yellowLentils.getProtien(), Item.getProtienTotal()), Util.getWeightPerItem(fat_weight, yellowLentils.getFat(), Item.getFatTotal()));
		ItemWithWeight eggWeight = new ItemWithWeight("Egg", Util.getWeightPerItem(carbs_weight, egg.getCarbs(), Item.getCarbsTotal()),
				Util.getWeightPerItem(protien_weight, egg.getProtien(), Item.getProtienTotal()), Util.getWeightPerItem(fat_weight, egg.getFat(), Item.getFatTotal()));
		ItemWithWeight peanutsWeight = new ItemWithWeight("Peanuts", Util.getWeightPerItem(carbs_weight, peanuts.getCarbs(), Item.getCarbsTotal()),
				Util.getWeightPerItem(protien_weight, peanuts.getProtien(), Item.getProtienTotal()), Util.getWeightPerItem(fat_weight, peanuts.getFat(), Item.getFatTotal()));
		ItemWithWeight cashewWeight = new ItemWithWeight("Cashew", Util.getWeightPerItem(carbs_weight, cashew.getCarbs(), Item.getCarbsTotal()),
				Util.getWeightPerItem(protien_weight, cashew.getProtien(), Item.getProtienTotal()), Util.getWeightPerItem(fat_weight, cashew.getFat(), Item.getFatTotal()));
		ItemWithWeight milkWeight = new ItemWithWeight("Milk", Util.getWeightPerItem(carbs_weight, milk.getCarbs(), Item.getCarbsTotal()),
				Util.getWeightPerItem(protien_weight, milk.getProtien(), Item.getProtienTotal()), Util.getWeightPerItem(fat_weight, milk.getFat(), Item.getFatTotal()));
		ItemWithWeight appleWeight = new ItemWithWeight("Apple", Util.getWeightPerItem(carbs_weight, apple.getCarbs(), Item.getCarbsTotal()),
				Util.getWeightPerItem(protien_weight, apple.getProtien(), Item.getProtienTotal()), Util.getWeightPerItem(fat_weight, apple.getFat(), Item.getFatTotal()));
		ItemWithWeight spinachWeight = new ItemWithWeight("Spinach", Util.getWeightPerItem(carbs_weight, spinach.getCarbs(), Item.getCarbsTotal()),
				Util.getWeightPerItem(protien_weight, spinach.getProtien(), Item.getProtienTotal()), Util.getWeightPerItem(fat_weight, spinach.getFat(), Item.getFatTotal()));
		ItemWithWeight butterWeight = new ItemWithWeight("Butter", Util.getWeightPerItem(carbs_weight, butter.getCarbs(), Item.getCarbsTotal()),
				Util.getWeightPerItem(protien_weight, butter.getProtien(), Item.getProtienTotal()), Util.getWeightPerItem(fat_weight, butter.getFat(), Item.getFatTotal()));
		ItemWithWeight cheeseWeight = new ItemWithWeight("Cheese", Util.getWeightPerItem(carbs_weight, cheese.getCarbs(), Item.getCarbsTotal()),
				Util.getWeightPerItem(protien_weight, cheese.getProtien(), Item.getProtienTotal()), Util.getWeightPerItem(fat_weight, cheese.getFat(), Item.getFatTotal()));
		ItemWithWeight almondsWeight = new ItemWithWeight("Almonds", Util.getWeightPerItem(carbs_weight, almonds.getCarbs(), Item.getCarbsTotal()),
				Util.getWeightPerItem(protien_weight, almonds.getProtien(), Item.getProtienTotal()), Util.getWeightPerItem(fat_weight, almonds.getFat(), Item.getFatTotal()));
		
		List<ItemWithWeight> ItemWithWeightList = Arrays.asList(riceWeight, yellowLentilsWeight, eggWeight, peanutsWeight, cashewWeight, milkWeight, appleWeight, spinachWeight, butterWeight, cheeseWeight, almondsWeight);
		
		
		
	    //System.out.println(Item.getCarbsTotal());
	    //System.out.println(Item.getFatTotal());
	    //System.out.println(Item.getProtienTotal());
	    
	    System.out.println("******************************************************************************");
	    ItemWithWeightList.forEach(item-> System.out.println(item.getName()+" weight in grams : "+item.getTotalWeight()));
	    System.out.println("******************************************************************************");
	    
	    sc.close();

	}

}
