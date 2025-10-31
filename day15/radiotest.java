import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class radiotest extends JFrame implements ActionListener{
	private JRadioButton rb1, rb2, rb3;
	private JButton kettei;
	private JPanel panel0;

	public radiotest(){
		this.rb1 = new JRadioButton("就職");
		this.rb2 = new JRadioButton("専攻科進学");
		this.rb3 = new JRadioButton("大学編入学", true);
		JPanel panel0 = new JPanel();

		ButtonGroup group = new ButtonGroup();
		group.add(this.rb1);
		group.add(this.rb2);
		group.add(this.rb3);
		this.kettei = new JButton("進路決定");

		panel0.add(this.rb1);
		panel0.add(this.rb2);
		panel0.add(this.rb3);
		this.kettei.addActionListener(this);
		panel0.add(this.kettei);
		super.getContentPane().add(panel0);
	}

	        public void actionPerformed(ActionEvent e){
			if (e.getSource() == this.kettei) { 
				if (this.rb1.isSelected() == true) {
        				System.out.println("実習系科目には特にしっかり取り組みましょう!");
    				}
			}
        	}

	public static void main(String[] args){
	radiotest a = new  radiotest();
	a.setSize(300, 300);
	a.setLocation(0,0);
	a.setVisible(true);
	}
}
