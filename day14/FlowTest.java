import javax.swing.*;
import java.awt.*;

public class FlowTest extends JFrame{
	private JPanel panel0;
	private JButton button0, button1, button2;
	public FlowTest(){
		super();
	        this.button0 = new JButton();
		this.button1 = new JButton();
		this.button2 = new JButton();
		JPanel panel0 = new JPanel(); 
		panel0.setLayout(new FlowLayout());
		panel0.add(this.button0);
		panel0.add(this.button1);
		panel0.add(this.button2);
		super.getContentPane().add(panel0);
	}

	public static void main(String[] args){
		FlowTest a = new FlowTest();
		a.setSize(300, 300);
		a.setLocation(0,0);
		a.setVisible(true);
	}

}
