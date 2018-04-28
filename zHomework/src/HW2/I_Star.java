package HW2;

public class I_Star {

	static void first() {
		for(int i = 1;i <= 5;i++) {
			for(int j = 1;j <= i;j++) { 
				System.out.print("*");
				}
			System.out.print("\n");
		}
	}
	
	static void sec() {
		System.out.println("(2)-------------");
		for(int i = 1;i <= 5;i++) {
			for(int k = 1;k <= i;k++)
				System.out.print(" ");
			for(int j = 5;j >= i;j--) 
				System.out.print("*");
			
			System.out.println("");
		}
	}
		
	static void third() {
		System.out.println("(3)-------------");
	    int i,j,k;
       
        for(i = 1 ; i<=5 ; i++)
        {
            for( j = 1 ; j <= 5-i ; j++)
                System.out.print(" ");
            for(k = 1 ; k <=2*i-1 ; k++)
                System.out.print("*");
            System.out.println();
        }
	}
	
	public static void main(String[] args) {
		first();
		sec();
		third();
	}
}
