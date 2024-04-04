package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	
HashMap<String,String> fruitAry = new HashMap<String,String>();
	
	String givenWord;
	
	public void fruitDic() {
	fruitAry.put("apple","りんご");
	fruitAry.put("peach","もも");
	fruitAry.put("banana","バナナ");
	fruitAry.put("lemon","レモン");
	fruitAry.put("pear","梨");
	fruitAry.put("kiwi","キウィ");
	fruitAry.put("strawberry","いちご");
	fruitAry.put("grape","ぶどう");
	fruitAry.put("muscat","マスカット");
	fruitAry.put("cherry","さくらんぼ");
	}

	public void setSearchWord(String givenWord) {
		this.givenWord = givenWord;
	}
	
	public void searchDic() {
		if (fruitAry.containsKey(givenWord)) {
			String meaning = fruitAry.get(givenWord);
			System.out.println(givenWord + "の意味は" + meaning +"です");
		} else {
			System.out.println(givenWord + "は辞書に存在しません");
		}
	}
	}

	

  
