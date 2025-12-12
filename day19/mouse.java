import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class mouse extends JFrame implements MouseListener{
	public void mousePressed(MouseEvent e) {
		int x = getX();
                int y = getY();
                System.out.println("x=" + x + " y=" + y);

                Graphics g = this.getGraphics();
                g.drawLine(x - 20, y - 10, x + 10, y + 10);
                g.drawLine(x+10, y+10, x-10, y-10);
                g.dispose();
                this.repaint();
	}
	public void mouseReleased(MouseEvent e) { }
	public void mouseClicked(MouseEvent e) { } 
	public void mouseEntered(MouseEvent e) { } 
	public void mouseExited(MouseEvent e) { }
	private BufferedImage bi;

	public mouse(){
		this.bi = new BufferedImage(400,400, BufferedImage.TYPE_INT_ARGB);
		Graphics g = this.bi.getGraphics();
		g.setColor(Color.black); g.fillRect(0, 0, 10, 10); 
		g.dispose();
		this.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(this.bi, 0, 0, this);
	}

	public static void main(String[] args){
		mouse a = new mouse();
		a.setSize(400, 400);
		a.setLocation(0,0);
		a.setVisible(true);
	}
}
