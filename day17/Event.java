import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;


public class Event extends JFrame implements ActionListener{
	private JButton button;
	private JTextField text;
	private JTextArea area;
	private JPanel panel;
	String s="", a="";
	public Event(){
		super(); 
		this.text = new JTextField(26);
		this.area = new JTextArea(26, 52);
		this.panel = new JPanel();
		FlowLayout flow = new FlowLayout();
	
		panel.setLayout(flow);
		panel.add(this.text);
		panel.add(this.area);
		super.getContentPane().add(this.panel);
		this.text.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource() == this.text) { 
                        this.s = this.text.getText();
			this.area.setText(a + s + System.getProperty("line.separator"));
			this.a = this.s; this.text.setText("");
                }
	}

	public static void main(String[] args){
		Event a = new Event();
		a.setSize(1000, 1000);
		a.setLocation(0,0);
		a.setVisible(true);
	}

}
