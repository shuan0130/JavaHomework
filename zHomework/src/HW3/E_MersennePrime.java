package HW3;

public class E_MersennePrime extends D_Prime {

	static boolean isPrime(int n) {
	    if (n == 1 || n == 2) {
	        return true;
	    } else if (n % 2 == 0) {
	        return false;
	    }
	    for (int i = 3; i <= Math.sqrt(n); i += 2) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	public static void main(String[] args) {
	    int count = 0;

	    for (int i = 2; count < 9; i++) {
	        int ans = (int) Math.pow(2, i) - 1;
	        if (isPrime(ans)) {
	            System.out.printf("2^%d - 1 = %d %n", i, ans);
	            count++;
	        }
	    }
	}
}
