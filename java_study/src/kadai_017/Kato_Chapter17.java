package kadai_017;

abstract public class Kato_Chapter17 {

	//親クラスフィールド
		 //性を表す
		public final String familyName = "加藤";
		 //名を表す
		public String givenName;   
		//住所を表す
		public final String address    = "東京都中野区〇×"; //住所を表す

		
		/*親クラスのメソッド
		  共通の紹介*/
		public void commonIntroduce() {
			System.out.println("名前は" + familyName + givenName +"です");
			System.out.println("住所は" + address + "です");
		}
		
		//抽象メソッド
		
		abstract public void eachIntroduce();
		
		
		//紹介を実行
		public void execIntroduce() {
		
			commonIntroduce();
			eachIntroduce();
			System.out.println();
		}
		
	}