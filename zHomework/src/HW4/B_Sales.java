package HW4;

public class B_Sales {
	//================================================================
	//a.�C�@�ӾP������P���`���B
	static void salesum(int[][] sales,int[] price) { 
		int[] sum = new int[price.length];
		
		for(int i = 0;i < sales.length; i++){
			sum[i] = 0;
			for(int j = 0;j < sales[i].length; j++){
				sum[i] += price[j]*sales[i][j]; 
			//	System.out.println(sum[i]);
			}System.out.printf("�P��� %d �P���`���B:%d\n",i+1,sum[i]);
		}System.out.println();

	}
	//================================================================
	//b. �C�@�Ӳ��~���P���`���B
	static void prosum(int[][] sales,int[] price,String[] product) {
		int[] sum = new int[sales[0].length]; //�����j�p����Ӽ�
		for(int i = 0;i < sales.length; i++) { //�C
			for(int j = 0;j < sales[i].length; j++) { //��
				sum[j] += price[j] * sales[i][j];	
			}	
		}
		System.out.printf("���~ %s �P���`���B:%d%n",product[0],sum[0]);
		System.out.printf("���~ %s �P���`���B:%d%n",product[1],sum[1]);
		System.out.printf("���~ %s �P���`���B:%d%n",product[2],sum[2]);
		System.out.printf("���~ %s �P���`���B:%d%n",product[3],sum[3]);
		System.out.printf("���~ %s �P���`���B:%d%n",product[4],sum[4]);
	}
	//================================================================
	//c. ���̦n�~�Z�]�P���`���B�̦h�̡^���P���
	static void salesman(int[][] sales,int[] price) {
		int[] sum = new int[sales.length];
		int max = sum[0];
		int i;
		for(i = 0;i < sales.length; i++){
			sum[i] = 0;
			for(int j = 0;j < sales[i].length; j++){
				sum[i] += price[j]*sales[i][j]; 
			}
			if(sum[i] > max)
				max = sum[i];	
		}
		System.out.println("\n�����P���:" + i);
	}
	//================================================================
	//d. �P���`���B�̦h�����~
	static void bestproduct(int[][] sales,int[] price,String[] product) {
		int[] sum = new int[sales[0].length]; //�����j�p����Ӽ�
		int max = sum[0];
		int i, j;
		for(i = 0;i < sales.length; i++) { 
			for(j = 0;j < sales[i].length; j++) { 
				sum[j] += price[j] * sales[i][j];	
			if(sum[j] > max)
				max = sum[j];
			}
		}
		System.out.println("�P���`���B�̦h�����~:" + product[i]);
	}
	//================================================================
	
	public static void main(String[] args) {
							  
		int[] price = {12,16,10,14,15};
		
		int[][] sales = {{33,32,56,45,33},
						 {77,33,68,45,23},
						 {43,55,43,67,65}
						};
		String[] product = {"A","B","C","D","E"};
		salesum(sales,price);
		prosum(sales,price,product);
		salesman(sales,price);
		bestproduct(sales,price,product);
	}
}


