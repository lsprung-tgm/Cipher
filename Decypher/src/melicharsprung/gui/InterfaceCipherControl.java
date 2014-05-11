package melicharsprung.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class InterfaceCipherControl implements ActionListener, ItemListener {
	
	private InterfaceCipherModel m;
	private InterfaceCipherView v;
	public InterfaceCipherControl() {
		this.m = new InterfaceCipherModel();
		this.v = new InterfaceCipherView(this.m, this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == v.verschluesseln){
			String text = v.text.getText();
			
		}
		
	}
	public void itemStateChanged(ItemEvent e){
		if(e.getStateChange() == ItemEvent.SELECTED){
			v.schluessel.setText((String)v.auswahlschluessel.getSelectedItem());
			switch((String)v.auswahlschluessel.getSelectedItem()) {
			case "KeywordCipher":
				v.indexSchluessel = 1; 
				String keyword = JOptionPane.showInputDialog(null,"Ein Keyword bitte:");
				m.kc.setKeyword(keyword);
				v.schluessel.setText(m.kc.getKeyword());
				break;
				
				
			case "ShiftCipher":
				int value = Integer.parseInt(JOptionPane.showInputDialog(null,"Eine Schiftvalue bitte"));
				m.shc.setShiftAmmount(value);
				v.schluessel.setText(m.shc.getShiftAl());
				v.indexSchluessel = 2; break;
				
				
			case "SubstitutionCipher":
				v.indexSchluessel = 3; break;
			}
			v.methode.setText((String)v.auswahlcipher.getSelectedItem());
			switch((String)v.auswahlcipher.getSelectedItem()){
			case "TranspositionCipher":
				v.indexCipher = 1; break;
			case "MonoalphabeticCipher":
				v.indexCipher = 2; break;
			}
		}
	}
		
}
