import javax.swing.*;
import java.awt.*;

public class BorderTest extends JFrame{
	private JPanel panel0;
	private JButton button0, button1, button2;
	public BorderTest(){
		super();
	        this.button0 = new JButton();
		this.button1 = new JButton();
		this.button2 = new JButton();
		JPanel panel0 = new JPanel(); 
		panel0.setLayout(new BorderLayout());
		panel0.add(this.button0, BorderLayout.CENTER);
		panel0.add(this.button1, BorderLayout.WEST);
		panel0.add(this.button2, BorderLayout.SOUTH);
		super.getContentPane().add(panel0);
	}

	public static void main(String[] args){
		BorderTest a = new BorderTest();
		a.setSize(600, 400);
		a.setLocation(0,0);
		a.setVisible(true);
	}

}
