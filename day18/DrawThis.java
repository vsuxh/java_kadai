import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*; 

public class DrawThis extends JFrame{
	private fuck mp;
	public DrawThis(){
		this.mp = new fuck();
		JPanel panel0 = new JPanel();
		panel0.add(this.mp);
		super.getContentPane().add(panel0);
	}
	
	public static void main(String[] args){
        DrawThis a = new DrawThis();
        a.setSize(300, 300);
        a.setLocation(0,0);
        a.setVisible(true);
        }
}
