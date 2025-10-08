import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;

public class AppTest5 extends JFrame implements ActionListener{
        private JButton button;
        public AppTest5(){
                super();
                this.button = new JButton("謚ｼ縺輔ｓ縺九＞");
//              super.getContentPane().add(this.button);
                super.getContentPane().setLayout(null);
                this.button.addActionListener(this);
                this.button.setBounds(0, 0, 300, 300);
                super.getContentPane().add(button);
        }

        public void actionPerformed(ActionEvent e){
                if(e.getSource() == this.button){
                        System.out.println("nu");
                        this.button.setText("fuck");
                }
        }

        public static void main(String[] args){
                AppTest5 a = new AppTest5();
                a.setSize(300, 300);
                a.setLocation(0,0);
                a.setVisible(true);
        }

}
