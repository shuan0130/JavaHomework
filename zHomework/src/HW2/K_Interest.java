package HW2;
//���르�H10%��Q���100000���A�q�Ӻ�h�H5%�ƧQ���100000���C�p��h�֦~��q�Ӻ⪺���i�H�W�L���르�A�ñN���ɨ�H���ƦL�X�C(27�~��)
public class K_Interest {	
	
	public static void main(String[] args) {
		int n = 1;
		double mon,count;
		while(n >= 1) {
			mon = 100000*(0.1*n+1);
			count = 100000*Math.pow(1+0.05, n);
			n++;
			if(count > mon){
				System.out.println("���르:" + (int)mon + ",�n����:" + (int)count);
				break;
			}
		}
		System.out.println("test:" + 100000*Math.pow(1+0.05, 3));
	}
}
