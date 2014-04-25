package melicharsprung.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfaceCipherView extends JFrame {

	private InterfaceCipherControl c;
	private InterfaceCipherModel m;
	
	public InterfaceCipherView(InterfaceCipherModel m, InterfaceCipherControl c) {
		this.m = m;
		this.c = c;
		
		this.setContentPane(new contentPanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Text Editor");
        this.setVisible(true);
        this.pack();
	}
	
	private class contentPanel extends JPanel {
		contentPanel() {
			// TO-DO
		}
	}
	
}
