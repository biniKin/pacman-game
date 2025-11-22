
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int borderWidth = columnCount * tileSize;
        int borderHeight = rowCount * tileSize;

        JFrame frame = new JFrame(); // create a JFrame object

        PacMan pacmanGame = new PacMan();
        frame.setResizable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(borderWidth, borderHeight);
        frame.add(pacmanGame);
        frame.pack();
        frame.setVisible(true); // make it visible first

    }
}
