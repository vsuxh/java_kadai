import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;

public class AppTest4 extends JFrame implements ActionListener{
	private JButton button;
	public AppTest4(){
		super(); 
		this.button = new JButton("押さんかい");
//		super.getContentPane().add(this.button);
		super.getContentPane().setLayout();
		this.button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == this.button){
			System.out.println("nu");
			this.button.setText("fuck");
		}
	}

	public static void main(String[] args){
		AppTest4 a = new AppTest4();
		a.setSize(300, 300);
		a.setLocation(0,0);
		a.setVisible(true);
	}

}
