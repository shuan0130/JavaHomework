package HW1;
import javax.swing.*;
public class Equation {

	 static double a,b,c,d;
     public static void main(String[] args)
     {
             JOptionPane.showMessageDialog(null,"這是一個一元二次方程式(ax2+bx+c=0)，按下確定後請輸入糸數");
             String astr=JOptionPane.showInputDialog(null,"請輸入糸數a:");
             String bstr=JOptionPane.showInputDialog(null,"請輸入糸數b:");
             String cstr=JOptionPane.showInputDialog(null,"請輸入糸數c:");
             a=Integer.parseInt(astr);
             b=Integer.parseInt(bstr);
             c=Integer.parseInt(cstr);
             d=b*b-4*a*c;
             if((a==0)&&(b==0)&&(c==0))
                     System.out.println("無限多組解");
             else if((a==0)&&(b==0)&&(c!=0))
                     System.out.println("無解");
             else if((a==0)&&(b!=0))
                     System.out.println("只有一解:  x="+(-c)/b);
             else if((a!=0)&&(d==0))
                     System.out.println("重根: x="+String.valueOf((-b)/(2*a))+"  x="+String.valueOf((-b)/(2*a)));
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
                     System.out.println("是兩大虛根:");
                     System.out.println("x= "+abc1.toString());
                     System.out.println("x= "+abc2.toString());
             }
     }
}