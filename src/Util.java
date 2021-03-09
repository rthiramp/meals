
public class Util {

	public static int getCalaries(int calaries, int percent)
	{
		return (calaries*percent)/100;
	}
	
	public static int getWeight(int calaries, double perGramCalaries)
	{
		return (int)(calaries/perGramCalaries);
	}
	
	public static int getWeightPerItem(int totalWeight, int percent, int totalItemPercent)
	{
		return (int)(totalWeight*percent)/totalItemPercent;
	}
}
