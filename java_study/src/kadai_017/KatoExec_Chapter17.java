package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		//子クラスのオブジェクト化
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		
		
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();
		
		
		var katoFamily = new Kato_Chapter17[] {taro, ichiro, hanako};
		for (var kato: katoFamily) {
		kato.execIntroduce();
	}
	
	}
}