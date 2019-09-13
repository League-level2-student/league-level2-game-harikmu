
import java.awt.Dimension;

import javax.swing.JFrame;

public class FruitNinja {
	public static void main(String[] args) throws Exception {
		FruitNinja fruitninja = new FruitNinja();
		fruitninja.setup();
	}
	private JFrame f = new JFrame();
	final static int WIDTH = 500;
	final static int HEIGHT = 800;
	
	public FruitNinja() {
		
	}
	private void setup() {
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
