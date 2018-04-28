package HW4;

public class B_Sales {
	//================================================================
	//a.每一個銷售員的銷售總金額
	static void salesum(int[][] sales,int[] price) { 
		int[] sum = new int[price.length];
		
		for(int i = 0;i < sales.length; i++){
			sum[i] = 0;
			for(int j = 0;j < sales[i].length; j++){
				sum[i] += price[j]*sales[i][j]; 
			//	System.out.println(sum[i]);
			}System.out.printf("銷售員 %d 銷售總金額:%d\n",i+1,sum[i]);
		}System.out.println();

	}
	//================================================================
	//b. 每一個產品的銷售總金額
	static void prosum(int[][] sales,int[] price,String[] product) {
		int[] sum = new int[sales[0].length]; //元素大小為行個數
		for(int i = 0;i < sales.length; i++) { //列
			for(int j = 0;j < sales[i].length; j++) { //行
				sum[j] += price[j] * sales[i][j];	
			}	
		}
		System.out.printf("產品 %s 銷售總金額:%d%n",product[0],sum[0]);
		System.out.printf("產品 %s 銷售總金額:%d%n",product[1],sum[1]);
		System.out.printf("產品 %s 銷售總金額:%d%n",product[2],sum[2]);
		System.out.printf("產品 %s 銷售總金額:%d%n",product[3],sum[3]);
		System.out.printf("產品 %s 銷售總金額:%d%n",product[4],sum[4]);
	}
	//================================================================
	//c. 有最好業績（銷售總金額最多者）的銷售員
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
		System.out.println("\n黃金銷售員:" + i);
	}
	//================================================================
	//d. 銷售總金額最多的產品
	static void bestproduct(int[][] sales,int[] price,String[] product) {
		int[] sum = new int[sales[0].length]; //元素大小為行個數
		int max = sum[0];
		int i, j;
		for(i = 0;i < sales.length; i++) { 
			for(j = 0;j < sales[i].length; j++) { 
				sum[j] += price[j] * sales[i][j];	
			if(sum[j] > max)
				max = sum[j];
			}
		}
		System.out.println("銷售總金額最多的產品:" + product[i]);
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


