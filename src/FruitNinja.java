
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;

public class FruitNinja {
	public static void main(String[] args) throws Exception {
		FruitNinja fruitninja = new FruitNinja();
		fruitninja.setup();
	}
	private JFrame f = new JFrame();
	final static int WIDTH = 700;
	final static int HEIGHT = 700;
	private GamePanel panel;
	public FruitNinja() {
		panel = new GamePanel();
	}
	private void setup() {
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(panel);
		f.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
		f.pack();
		panel.startGame();
		f.addKeyListener(panel);
		f.addMouseListener(panel);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(WIDTH, HEIGHT);
	}
}
