public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Question 素数を抽出するプログラムを作成しましょう。パラメータはint型の配列で入力されます。
//		要素数は入力者の任意です。
		

		int[] a = {1, 9, 3, 13, 67, 100, 91, 32, 41, 72};
		for (int i = 0;i < a.length;i++) {
			boolean sosuu = true ;
			int b;
			//素数の定義上割る数の初期値を１にすることはできないので2で考える。
			for(int k = 2; k < a[i] ;k++) {
				b = a[i] % k ;
				//2から順に割っていき、もしa[i]を割り切れる数があった場合falesとする。
				if (b == 0) {
					sosuu = false;
				}
			}
			//a[i]に割り切れる数が無かった場合、そのまま出力
			if (sosuu) {
				System.out.println(a[i]);
			}
		}
	}
}
