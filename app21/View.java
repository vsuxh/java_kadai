import javax.swing.*;
import java.awt.*;

public class View extends JPanel {
    private Model model;
    private final int CELL_SIZE = 80;

    private Image onImage;
    private Image offImage;

    public View(Model model) {
        this.model = model;
        setPreferredSize(new Dimension(320, 320));

        onImage  = new ImageIcon("on.png").getImage();
        offImage = new ImageIcon("off.png").getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int size = model.getSize();

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                Image img = model.isOn(r, c) ? onImage : offImage;
                g.drawImage(
                    img,
                    c * CELL_SIZE,
                    r * CELL_SIZE,
                    CELL_SIZE,
                    CELL_SIZE,
                    this
                );
                g.setColor(Color.GRAY);
                g.drawRect(c * CELL_SIZE, r * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }
    }
}

