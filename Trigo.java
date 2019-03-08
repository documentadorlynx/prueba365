 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
      
 public class Trigo extends JFrame implements ActionListener{
      private JButton b1;
      private JTextField campo1;
      private int numClicks = 0;
      
      public Trigo(){
            b1 = new JButton("Numero de clicks");
            b1.addActionListener(this);
            campo1 = new JTextField();
            this.getContentPane().add(b1,BorderLayout.NORTH);
            this.getContentPane().add(campo1,BorderLayout.SOUTH);
          }
     
     public void actionPerformed(ActionEvent e){
            numClicks++;
            campo1.setText(numClicks+"");
          }
     
     public static void main(String[] arg){
          Trigo miAplicacion = new Trigo();
          miAplicacion.setBounds(10,10,200,200);
          miAplicacion.pack();
          miAplicacion.setVisible(true);
          }
}