package kadai_024;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	 private Scanner scanner = new Scanner(System.in);
	    private String[] hands = { "r", "s", "p" };
	    private Map<String, String> handMap = new HashMap<String, String>() {
	        {
	            put("r", "グー");
	            put("s", "チョキ");
	            put("p", "パー");
	        }
	    };

	    public String getMyChoice() {
	        String myChoice = "";
	        while (true) {
	            System.out.println("自分のじゃんけんの手を入力しましょう");
	            System.out.println("グーはrockのrを入力しましょう");
	            System.out.println("チョキはscissorsのsを入力しましょう");
	            System.out.println("パーはpaperのpを入力しましょう");
	            myChoice = scanner.nextLine();
	            if (handMap.containsKey(myChoice)) {
	                break;
	            } else {
	                System.out.println("エラー: 正しいじゃんけんの手を入力してください");
	            }
	        }
	        return myChoice;
	    }

	    public String getRandom() {
	        int index = (int) Math.floor(Math.random() * 3);
	        return hands[index];
	    }

	    public void playGame(String myChoice, String opponentChoice) {
	        System.out.println("自分の手は" + handMap.get(myChoice) + ", 対戦相手の手は" + handMap.get(opponentChoice));
	        if (myChoice.equals(opponentChoice)) {
	            System.out.println("あいこです");
	        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
	                (myChoice.equals("s") && opponentChoice.equals("p")) ||
	                (myChoice.equals("p") && opponentChoice.equals("r"))) {
	            System.out.println("自分の勝ちです");
	        } else {
	            System.out.println("自分の負けです");
	        }
	    }
	}