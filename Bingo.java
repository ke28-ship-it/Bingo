public class Bingo{
	public static void main(String[] args){
		int[] numsas = new int[5];
		for(int i=0;i<5;i++){
			numsas[i] = (int) (Math.random() * 15) + (15*i);
		}
		Card c1 = new Card(numsas);
		
		c1.row();
		System.out.println(" ");
		for(int n=0;n<5;n++){
			System.out.print(c1.getNum(n) + "\t");
		}
	}
}