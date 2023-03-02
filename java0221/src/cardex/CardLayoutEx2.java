package cardex;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CardLayoutEx2 extends JFrame implements ActionListener{
   JPanel jp;
   Cards cards;
   private JTextField textField, textField2;
   
   public CardLayoutEx2(){
      setTitle("CardLayout Test");
      setSize(500, 700);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setLocationRelativeTo(null);
      
      jp = new JPanel(new GridLayout(0, 5, 10, 0));
      
      addButton("<", jp);
      addButton(">", jp);
      addButton("홈", jp);
      add(jp, BorderLayout.NORTH);
      cards = new Cards();
      add(cards, BorderLayout.CENTER);
      
      setVisible(true);
      
   }//end of CardTest constructor
   
   public void addButton(String str, Container target){
      JButton bt = new JButton(str);
      bt.addActionListener(this);
      target.add(bt);
   }//end of addButton method
   
   class Cards extends JPanel{
      CardLayout layout;
      
      public Cards(){
         layout = new CardLayout();
         setLayout(layout);
         
         textField = new JTextField();
         textField.setText("현재카드 번호는" + 1 + "입니다");
         add(textField, BorderLayout.CENTER);
         
         textField2 = new JTextField();
         textField2.setText("현재카드 번호는" + 2 + "입니다");
         add(textField2, BorderLayout.CENTER);
         
      }//end of Cards constructor
      
   }//end of Cards class
   
   @Override
   public void actionPerformed(ActionEvent e) {
   
         if(e.getActionCommand().equals("홈")){
            setVisible(false);
            dispose();
            System.exit(0);
         }
         
         if(e.getActionCommand().equals("<")){
            cards.layout.previous(cards);
         }
         
         if(e.getActionCommand().equals(">")){
            cards.layout.next(cards);
         }
         
   }//end of actionPerformed method
   
   
   public static void main(String[] args){
	   CardLayoutEx2 cl = new CardLayoutEx2();
   }//end of main method
   
}//end of CardLayoutEx1 class