
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Qestion ９段の星（⭐️）で出来たピラミッドを作成しましょう。
		//ここで作成したい星の階段の段数を代入
		int s = 9;
		
		for(int i=1 ; i<s+1 ; i++){
		      for(int j=0; j<s-i; j++){
		        System.out.print("  ");
		      }
		      for(int k=0; k<i*2-1; k++){
		        System.out.print("☆");
		      }
		      System.out.println("");
		}
	}

}
