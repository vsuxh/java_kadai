import javax.swing.*;
import java.awt.*;

public class ComplexTest extends JFrame{
	private JPanel panel0, panel1, panel2;
	private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8;
	public ComplexTest(){
		super();
	        this.button0 = new JButton();
		this.button1 = new JButton();
		this.button2 = new JButton();
		this.button3 = new JButton();
		this.button4 = new JButton();
		this.button5 = new JButton();
		this.button6 = new JButton();
		this.button7 = new JButton();
		this.button8 = new JButton();

		JPanel panel0 = new JPanel();
	        JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel0.setLayout(new BorderLayout());
		panel1.setLayout(new BorderLayout());
		panel2.setLayout(new BorderLayout());

		panel1.add(this.button3, BorderLayout.SOUTH);
		panel1.add(this.button4, BorderLayout.NORTH);

		panel2.add(this.button5, BorderLayout.WEST);
		panel2.add(this.button6, BorderLayout.CENTER);
		panel2.add(this.button7, BorderLayout.EAST);

		panel0.add(this.button0, BorderLayout.CENTER);
		panel0.add(this.button1, BorderLayout.WEST);
		panel0.add(this.button2, BorderLayout.SOUTH);
		panel0.add(panel1, BorderLayout.EAST);
		panel0.add(panel2, BorderLayout.NORTH);
		super.getContentPane().add(panel0);
	}

	public static void main(String[] args){
		ComplexTest a = new ComplexTest();
		a.setSize(600, 400);
		a.setLocation(0,0);
		a.setVisible(true);
	}

}
