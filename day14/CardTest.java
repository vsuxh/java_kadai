public class CardTest extends JFrame{
        private JButton button;
        private JTextField textbox;
        private JLabel label;

        public CardTest(){
                super();
                this.button = new JButton("example");
                this.label = new JLabel("card");
                this.textbox = new JTextField("test", 10);

                JPanel  panel = new JPanel();
                panel.setLayout(new CardLayout());

                panel.add(this.button);
                panel.add(this.label);
                panel.add(this.textbox);

                getContentPane().add(panel, BorderLayout.CENTER);


        }

        public static void main(String[] args){
                CardTest a = new CardTest();
                a.setSize(600, 400);
                a.setLocation(0,0);
                a.setVisible(true);
        }
}
