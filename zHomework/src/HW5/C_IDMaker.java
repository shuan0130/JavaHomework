package HW5;

import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
@SuppressWarnings("serial")
public class C_IDMaker extends JFrame{
   private String[] location = {
      "�x�_��", "�x����", "�򶩥�", "�x�n��", "������", "�x�_��", "�y����", "��鿤",
      "�Ÿq��", "�s�˿�", "�]�߿�", "�x����", "�n�뿤", "���ƿ�", "�s�˥�", "���L��",
      "�Ÿq��", "�x�n��", "������", "�̪F��", "�Ὤ��", "�x�F��", "������", "���",
      "�����s", "�s����"
   };
   private int[] locationNumber = {
      10, 11, 12, 13, 14, 15, 16, 17,
      34, 18, 19, 20, 21, 22, 35, 23,
      24, 25, 26, 27, 28, 29, 32, 30,
      31, 33
   };
   private char[] locationChar = {
      'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
      'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
      'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
      'Y', 'Z'
   };
   @SuppressWarnings({ "rawtypes", "unchecked" })
private JComboBox c = new JComboBox(location);
   @SuppressWarnings({ "rawtypes", "unchecked" })
private JComboBox s = new JComboBox(new String[]{"�k", "�k"});
   private JButton make = new JButton("�s�y");
   private JButton checkID = new JButton("�T�{");
   private JTextField tf = new JTextField(10);
 
   private ActionListener makeAction = new ActionListener(){
      public void actionPerformed(ActionEvent e){
         StringBuffer output = new StringBuffer();
         int[] number = new int[9];
         int locationIndex = c.getSelectedIndex();
         output.append(locationChar[locationIndex]);
         number[0] = (locationNumber[locationIndex] % 10) * 9 +
            (int)(locationNumber[locationIndex] / 10);
 
         output.append(number[1] = s.getSelectedIndex() + 1);
 
         Random r = new Random();
         for(int i = 2; i < number.length; i++){
            output.append(number[i] = r.nextInt(10));
         }
 
         int sum = number[0];
         for(int i = number.length - 1, j = 1; i > 0 ; i--, j++){
            sum += number[i] * j;
         }
         int check = (sum % 10) == 0 ? 0 : 10 - (sum % 10);
         output.append(check);
         tf.setText(output.toString());
      }
   };
 
   private ActionListener checkAction = new ActionListener(){
      public void actionPerformed(ActionEvent e){
         String s = tf.getText().trim();
         if(s.equals("")) return;
 
         if(checkID(s)){
            JOptionPane.showMessageDialog(null, "���T", "�����Ҧr���T�{",
               JOptionPane.INFORMATION_MESSAGE);
         }
         else{
            JOptionPane.showMessageDialog(null, "���~", "�����Ҧr���T�{",
               JOptionPane.ERROR_MESSAGE);
         }
      }
   };
 
   public C_IDMaker(){
      JPanel p1 = new JPanel();
      p1.add(c);
      p1.add(s);
      getContentPane().add(p1, BorderLayout.NORTH);
 
      JPanel p2 = new JPanel();
      make.addActionListener(makeAction);
      p2.add(make);
      checkID.addActionListener(checkAction);
      p2.add(checkID);
      getContentPane().add(p2, BorderLayout.CENTER);
      getContentPane().add(tf, BorderLayout.SOUTH);
   }
 
   public boolean checkID(String Chk2){
      String v[][] = {{"A", "�x�_��"}, {"B", "�x����"}, {"C", "�򶩥�"},
         {"D", "�x�n��"}, {"E", "������"}, {"F", "�x�_��"}, {"G", "�y����"},
         {"H", "��鿤"}, {"J", "�s�˿�"}, {"K", "�]�߿�"}, {"L", "�x����"},
         {"M", "�n�뿤"}, {"N", "���ƿ�"}, {"P", "���L��"}, {"Q", "�Ÿq��"},
         {"R", "�x�n��"}, {"S", "������"}, {"T", "�̪F��"}, {"U", "�Ὤ��"},
         {"V", "�x�F��"}, {"X", "���"}, {"Y", "�����s"}, {"W", "������"},
         {"Z", "�s����"}, {"I", "�Ÿq��"}, {"O", "�s�˥�"}
      };
 
      int inte = -1;
      String s1 = String.valueOf(Character.toUpperCase(Chk2.charAt(0)));
      for(int i = 0; i < 26; i++){
         if(s1.compareTo(v[i][0]) == 0){
            inte = i;
         }
      }
      int total = 0;
      int all[] = new int[11];
      String E = String.valueOf(inte + 10);
      int E1 = Integer.parseInt(String.valueOf(E.charAt(0)));
      int E2 = Integer.parseInt(String.valueOf(E.charAt(1)));
      all[0] = E1;
      all[1] = E2;
      try{
         for(int j = 2; j <= 10; j++)
            all[j] = Integer.parseInt(String.valueOf(Chk2.charAt(j - 1)));
         for(int k = 1; k <= 9; k++)
            total += all[k] * (10 - k);
         total += all[0] + all[10];
         if(total % 10 == 0)
            return true;
      }
      catch(Exception ee){;
      }
      return false;
   }
 
   public static void main(String[] args){
      C_IDMaker app = new C_IDMaker();
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      app.pack();
      app.setVisible(true);
   }
}