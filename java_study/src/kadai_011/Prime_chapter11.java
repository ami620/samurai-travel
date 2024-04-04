package kadai_011;

public class Prime_chapter11 {

	public static void main(String[] args) {
	    boolean[] isPrime = new boolean[101];
	    for (int i = 2; i <= 100; i++) {
	        isPrime[i] = true;
	    }
	    for (int i =2; i <= 100; i++) {
	        if (isPrime[i]) {
	            
	            for (int j =i *2; j <= 100; j+= i)
	                isPrime[j] =false;
	        }
	    }
	    for (int i = 2; i <= 100; i++) {
	        if (isPrime[i]) {
	            System.out.println(i);
	        }
	    }
	}} 
