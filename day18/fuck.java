import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class fuck  extends JPanel{
	public fuck(){
		super.setBackground(Color.black);
		super.setPreferredSize(new Dimension(640, 240));
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.green);
		g.drawRect(10, 10, 50, 50);
	}
}
