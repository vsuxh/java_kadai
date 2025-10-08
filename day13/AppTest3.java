import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;

public class AppTest3 extends JFrame implements ActionListener{
	private JButton button;
	public AppTest3(){
		super(); 
		this.button = new JButton("押さんかい");
		super.getContentPane().add(this.button);
		this.button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == this.button){System.out.println("nu");}
	}

	public static void main(String[] args){
		AppTest3 a = new AppTest3();
		a.setSize(300, 300);
		a.setLocation(0,0);
		a.setVisible(true);
	}

}
