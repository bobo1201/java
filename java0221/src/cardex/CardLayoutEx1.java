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

public class CardLayoutEx1 extends JFrame implements ActionListener{
   JPanel jp;
   Cards cards;
   private JTextField textField;
   
   public CardLayoutEx1(){
      setTitle("CardLayout Test");
      setSize(500, 700);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setLocationRelativeTo(null);
      
      jp = new JPanel(new GridLayout(0, 5, 10, 0));
      
      addButton("<<", jp);
      addButton("<", jp);
      addButton(">", jp);
      addButton(">>", jp);
      addButton("종료", jp);
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
         for(int i=1 ; i<=10 ; i++){
            
        	textField = new JTextField();
        	textField.setText("현재카드 번호는" + i + "입니다");
            
            add(textField, BorderLayout.CENTER);
         }
         
      }//end of Cards constructor
      
   }//end of Cards class
   
   @Override
   public void actionPerformed(ActionEvent e) {
   
         if(e.getActionCommand().equals("종료")){
            setVisible(false);
            dispose();
            System.exit(0);
         }
         
         if(e.getActionCommand().equals("<<")){
            cards.layout.first(cards);
         }
         
         if(e.getActionCommand().equals("<")){
            cards.layout.previous(cards);
         }
         
         if(e.getActionCommand().equals(">")){
            cards.layout.next(cards);
         }
         
         if(e.getActionCommand().equals(">>")){
            cards.layout.last(cards);
         }
   }//end of actionPerformed method
   
   
   public static void main(String[] args){
	   CardLayoutEx1 cl = new CardLayoutEx1();
   }//end of main method
   
}//end of CardLayoutEx1 class