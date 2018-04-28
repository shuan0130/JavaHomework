package HW2;

public class G_Rabbit {
	
	static void while1() {
		int i = 0;
		int a = 0;
		while(i == 0){
			a++;
			if(a % 3 == 1 && a % 5 == 3 && a % 7 == 2){
				System.out.println(a);
				break;
			}	
		}
	}

	public static void main(String[] args) {
		for(int i = 0;i < 200; i++) {
			if(i % 3 == 1 && i % 5 == 3 && i % 7 == 2)
				System.out.println(i + "\t");
		}
		System.out.println("------");
		while1();
		
	}
}
