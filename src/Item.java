
public class Item {

	private static int carbsTotal = 0;
	private static int fatTotal = 0;
	private static int protienTotal = 0;
	
	private String name;
	private int carbs;
	private int fat;
	private int protien;
	
	
	public Item(String name, int carbs, int fat, int protien) {
		super();
		this.name = name;
		this.carbs = carbs;
		this.fat = fat;
		this.protien = protien;
		carbsTotal = carbsTotal + carbs;
		fatTotal = fatTotal + fat;
		protienTotal = protienTotal + protien;
	}
	public static int getCarbsTotal() {
		return carbsTotal;
	}
	public static void setCarbsTotal(int carbsTotal) {
		Item.carbsTotal = carbsTotal;
	}
	public static int getFatTotal() {
		return fatTotal;
	}
	public static void setFatTotal(int fatTotal) {
		Item.fatTotal = fatTotal;
	}
	public static int getProtienTotal() {
		return protienTotal;
	}
	public static void setProtienTotal(int protienTotal) {
		Item.protienTotal = protienTotal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCarbs() {
		return carbs;
	}
	public void setCarbs(int carbs) {
		this.carbs = carbs;
	}
	public int getFat() {
		return fat;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public int getProtien() {
		return protien;
	}
	public void setProtien(int protien) {
		this.protien = protien;
	}
	
}
