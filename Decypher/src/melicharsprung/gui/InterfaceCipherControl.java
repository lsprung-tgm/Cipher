package melicharsprung.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceCipherControl implements ActionListener {
	
	private InterfaceCipherModel m;
	private InterfaceCipherView v;
	
	public InterfaceCipherControl() {
		this.m = new InterfaceCipherModel();
		this.v = new InterfaceCipherView(this.m, this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
}
