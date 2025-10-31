
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class freetest extends JFrame implements ActionListener{
	private JRadioButton rb1, rb2, rb3;
	private JButton kettei;
	private JPanel panel0;

	public freetest(){
		this.rb1 = new JRadioButton("就職");
		this.rb2 = new JRadioButton("専攻科進学");
		this.rb3 = new JRadioButton("大学編入学", true);
		JPanel panel0 = new JPanel();

	}

	        public void actionPerformed(ActionEvent e){
			if (e.getSource() == this.kettei) { 
				if (this.rb1.isSelected() == true) {
        				System.out.println("実習系科目には特にしっかり取り組みましょう!");
    				}
			}
        	}

	public static void main(String[] args){
	freetest a = new  freetest();
	a.setSize(300, 300);
	a.setLocation(0,0);
	a.setVisible(true);
	}
}
