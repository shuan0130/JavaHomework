package HW4;
public class A_MaxMin {
	
	static void all(int[] num) {		//�L�X���X�Ӫ��üƭ�
		for(int i = 0;i < num.length; i++) {
			
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
		int[] num = new int[10];			// ����10�Ӱ}�C�Ŷ�
		for(int j = 0;j < num.length; j++) { // �üƱq50�ӼƦr�̨�10�ӭ�
			num[j] = (int)(Math.random()*50+1);
		}
		int max = num[0];	//�]�w�Ĥ@�Ӭ��̤j��
		int min = num[0];	//�]�w�Ĥ@�Ӭ��̤p��
		
		for(int i = 0;i < num.length; i++) { //���̤j�̤p��			
			if(num[i] > max)
				max = num[i];
			if(num[i] < min)
				min = num[i];
		}
		System.out.println("MAX:"+ max);
		System.out.println("MIN:"+ min);
		all(num);
	}
}

