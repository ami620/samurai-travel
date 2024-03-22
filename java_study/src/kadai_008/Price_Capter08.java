package kadai_008;

public class Price_Capter08 {

	public static void main(String[] args) {
		String age = "30代";
        int price;

        switch (age) {
            case "10代"->  price = 1000;
            case "20代"->  price = 2000;
            case "30代"->  price = 3000;
            case "40代"->  price = 3000;
            case "50代"->  price = 4000;
            case "60代"->  price = 4000;
            case "70代"->  price = 4000;
            case "80代"->  price = 5000;
            default -> price = 500;
        }

        System.out.println(age + "の料金は" + price + "円");
    }
	
	
}
