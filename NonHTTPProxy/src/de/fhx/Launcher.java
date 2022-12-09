package de.fhx;
import java.awt.Dimension;
import javax.swing.JFrame;
import josh.ui.NonHttpUI;
import josh.utils.SharedBoolean;


public class Launcher {

	public static void main(String[] args) {
		JFrame main = new JFrame();
		main.setTitle("NoPE Standalone");
		main.setMinimumSize(new Dimension(500, 500));
		NonHttpUI plugin = new NonHttpUI(new BurpExtenderMock(), null, new SharedBoolean());
		main.add(plugin);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.pack();
		main.setVisible(true);
	}

}
