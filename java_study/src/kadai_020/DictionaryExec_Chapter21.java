package kadai_020;

public class DictionaryExec_Chapter21 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();
		dictionary.fruitDic();
		
		String[] searchWords = {"apple", "banana", "grape","orange"};
		
		
		for(String word : searchWords) {
			
		dictionary.setSearchWord(word);
		
	
		dictionary.searchDic();
		}
	}
}

