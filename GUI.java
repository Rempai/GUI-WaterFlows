import javax.swing.;
import java.awt.;

class GUI{
    public static void main(String args[]){
        JPanel panel = new JPanel();

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("home");
        JMenu m2 = new JMenu("apparaten");
        JMenu m3 = new JMenu("sensoren");
        JMenuItem m11 = new JMenuItem("home");
        JMenuItem m12 = new JMenuItem("apparaten");
        JMenuItem m13 = new JMenuItem("sensoren");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        m1.add(m11);
        m2.add(m12);
        m3.add(m13);

        JLabel label = new JLabel("menu");
        panel.add(label);

        JFrame frome = new JFrame("menu");
        frome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frome.setSize(100,500);



        JButton homeb = new JButton("home");
        JButton apparaten = new JButton("apparaten");
        JButton sensoren = new JButton("sensoren");
        panel.add(homeb);
        panel.add(apparaten);
        panel.add(sensoren);
        JTextArea ta = new JTextArea();
        frome.getContentPane() .add( BorderLayout.NORTH,ta);
        frome.getContentPane() .add(BorderLayout.NORTH, panel);
        frome.getContentPane()  .add(BorderLayout.NORTH, mb);
        ImageIcon Image1;


        frome.setVisible(true);


    }

}
