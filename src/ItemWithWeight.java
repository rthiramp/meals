
public class ItemWithWeight {

	private String name;
	private int carbsWeight;
	private int protienWeight;
	private int fatWeight;
	private int totalWeight;
	
	public ItemWithWeight(String name, int carbsWeight, int protienWeight, int fatWeight) {
		super();
		this.name = name;
		this.carbsWeight = carbsWeight;
		this.protienWeight = protienWeight;
		this.fatWeight = fatWeight;
		this.totalWeight = carbsWeight + protienWeight + fatWeight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCarbsWeight() {
		return carbsWeight;
	}
	public void setCarbsWeight(int carbsWeight) {
		this.carbsWeight = carbsWeight;
	}
	public int getProtienWeight() {
		return protienWeight;
	}
	public void setProtienWeight(int protienWeight) {
		this.protienWeight = protienWeight;
	}
	public int getFatWeight() {
		return fatWeight;
	}
	public void setFatWeight(int fatWeight) {
		this.fatWeight = fatWeight;
	}
	public int getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}
	
	
}
