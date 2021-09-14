package poActivity;
/* Imagine you are responsible for a portfolio of profitable stocks represented in an array.
 * Each item in the array represents the yearly profit of a corresponding stock.
 * The analyst gathers all distinct pairs of stocks that reached the target profit. 
 * Distinct pairs are pairs that differ in at least one element. Given the array of profits, 
 * find the number of distinct pairs of stocks where the sum of each pair’s profits is exactly equal to the target sum.
 */
public class Main {
	public static void main(String[] args) {
		int [] stocksProfit = {5, 7, 9, 13, 11, 6, 6, 3, 3};
		int target = 12;
		int number = distinctPairsNum(stocksProfit,target);
		System.out.println("The number of distinct pairs that equal " + target + " is: " + number);
	}
	
	private static int distinctPairsNum(int[] arr, int target) {
		if(arr.length < 1) {
			return 0;
		}
		
		int pairs = 0;
		for(int i =0; i < arr.length; i++) {
			for(int j=i+1; j< arr.length; j++) {
				if((arr[j] + arr[i]) == target) {
					//System.out.println( arr[i]  + " + " + arr[j] + " = " + target);
					pairs++;
				}
			}
		}
		return pairs;
	}
}


