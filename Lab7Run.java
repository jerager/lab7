import java.awt.*;


public class Lab7Run {

	public static void main(String[] args) {

		Lab7Frame frame = new Lab7Frame();
		frame.setUpFrame();

		frame.pack();
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(600,600));
		frame.repaint();

		// this method must finish and return before GUI 
		// handling begins
	}

}
