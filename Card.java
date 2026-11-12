public class Card{
	int[] numbas = new int[5];
	public Card(int[] nums){
		for(int i=0;i<5;i++){
		numbas[i] = nums[i];
		}
	}
	public int getNum(int numWant){
		return numbas[numWant];
	}
	public void row(){
		System.out.println("|---+---+---+---+---|");
	}
}
