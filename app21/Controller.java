import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;

public class Controller extends JFrame {
    private Model model;
    private View view;

    public Controller() {
        model = new Model();
        view = new View(model);

        add(view);
        pack();
        setTitle("Lights Out 4x4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        view.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int col = e.getX() / 80;
                int row = e.getY() / 80;

                model.pressCell(row, col);
                view.repaint();

                if (model.isCleared()) {
                    JOptionPane.showMessageDialog(null, "クリア！");
                }
            }
        });

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> {
            model.reset();
            view.repaint();
        });

        add(resetButton, BorderLayout.SOUTH);
        setVisible(true);
    }
    
    public static void main(String[] args) {
    new Controller();
}
}


