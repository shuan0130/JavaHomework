package HW1;
import javax.swing.*;
public class Equation {

	 static double a,b,c,d;
     public static void main(String[] args)
     {
             JOptionPane.showMessageDialog(null,"�o�O�@�Ӥ@���G����{��(ax2+bx+c=0)�A���U�T�w��п�J�ͼ�");
             String astr=JOptionPane.showInputDialog(null,"�п�J�ͼ�a:");
             String bstr=JOptionPane.showInputDialog(null,"�п�J�ͼ�b:");
             String cstr=JOptionPane.showInputDialog(null,"�п�J�ͼ�c:");
             a=Integer.parseInt(astr);
             b=Integer.parseInt(bstr);
             c=Integer.parseInt(cstr);
             d=b*b-4*a*c;
             if((a==0)&&(b==0)&&(c==0))
                     System.out.println("�L���h�ո�");
             else if((a==0)&&(b==0)&&(c!=0))
                     System.out.println("�L��");
             else if((a==0)&&(b!=0))
                     System.out.println("�u���@��:  x="+(-c)/b);
             else if((a!=0)&&(d==0))
                     System.out.println("����: x="+String.valueOf((-b)/(2*a))+"  x="+String.valueOf((-b)/(2*a)));
             else if((a!=0)&&(d>0))
             {
                     System.out.println("x="+String.valueOf(((-b)+Math.sqrt(Math.abs(d)))/(2*a)));
                     System.out.println("x="+String.valueOf(((-b)-Math.sqrt(Math.abs(d)))/(2*a)));
             }
             else if((a!=0)&&(d<0))
             {
                     StringBuffer abc1=new StringBuffer();
                     StringBuffer abc2=new StringBuffer();
                     String k=String.valueOf((-b)/(2*a));
                     String q=String.valueOf((Math.sqrt(Math.abs(d)))/(2*a));
                     abc1.append(k+"+"+q+"i");
                     abc2.append(k+"-"+q+"i");
                     System.out.println("�O��j���:");
                     System.out.println("x= "+abc1.toString());
                     System.out.println("x= "+abc2.toString());
             }
     }
}