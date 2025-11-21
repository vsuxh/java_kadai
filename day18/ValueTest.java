import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class ValueTest extends JFrame implements ActionListener{
	private JTextField value;
	private JSlider slide;
	private JPanel panel0;

	public ValueTest(){
		this.slide = new JSlider();
		this.slide.addActionListener(this);
		JPanel 	panel0 = new JPanel();
		this.value = new JTextField("Stright into the light, I found myself");
		panel0.add(this.value);
		panel0.add(this.slide);
		super.getContentPane().add(panel0);
	}

	public void actionPerformed(ActionEvent e){
		
	}

        public static void main(String[] args){
                ValueTest a = new ValueTest();
                a.setSize(300, 300);
                a.setLocation(0,0);
                a.setVisible(true);
        }

}
