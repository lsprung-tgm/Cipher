package melicharsprung.gui;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class InterfaceCipherView extends JFrame {

	private InterfaceCipherControl c;
	private InterfaceCipherModel m;
	public JComboBox auswahlschluessel; 
	public JComboBox auswahlcipher;
	public JButton verschluesseln;
	public JButton entschluesseln;
	JLabel schluessel;
	JLabel methode;
	JTextField text;
	//werden immer neu gesetzt wenn sich etwas in der Combobox ändert
	int indexSchluessel;
	int indexCipher;
	public InterfaceCipherView(InterfaceCipherModel m, InterfaceCipherControl c) {
		this.m = m;
		this.c = c;
		
		
		//Layout
		this.setLayout(new GridLayout(3,1));
		text = new JTextField();
		Container a = new Container();
		a.setLayout(new GridLayout(1,3));
		Container b = new Container();
		b.setLayout(new GridLayout(1,2));
		Container d = new Container();
		d.setLayout(new GridLayout(1,4));
		
		JLabel schl = new JLabel("Schluessel: ");       d.add(schl);
		schluessel = new JLabel("-----");        d.add(schluessel);
		JLabel meth = new JLabel("CipherMethode: ");    d.add(meth);
		methode = new JLabel("-----");           d.add(methode);
		verschluesseln = new JButton("verschlüsseln");
		entschluesseln = new JButton("entschlüsseln");
		String[] ausw1 = {"SubstitutionCipher", "KeywordCipher", "ShiftCipher"};
		String[] ausw2 = {"MonoalphabeticCipher", "TranspositionCipher"};
		auswahlschluessel = new JComboBox(ausw1);
		auswahlcipher = new JComboBox(ausw2);
		
		//Oberfläche wird erstellt mithilfe einer Bestimmten Reihenfolge 
		a.add(text); a.add(verschluesseln); a.add(entschluesseln);
		this.add(d);
		b.add(auswahlcipher); b.add(auswahlschluessel);
		this.add(a); this.add(b);
		
		//Actionlistener setzen
		auswahlschluessel.addItemListener(c);
		auswahlcipher.addItemListener(c);
		verschluesseln.addActionListener(c);
		entschluesseln.addActionListener(c);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Text Editor");
        this.setSize(500, 500);
        this.setVisible(true);
        this.pack();
	}
	
//	public class contentPanel extends JPanel {
//		contentPanel() {
//			//Layout
//			this.setLayout(new GridLayout(3,1));
//			JTextField text = new JTextField();
//			Container a = new Container();
//			a.setLayout(new GridLayout(1,3));
//			Container b = new Container();
//			b.setLayout(new GridLayout(1,2));
//			Container d = new Container();
//			d.setLayout(new GridLayout(1,4));
//			
//			JLabel schl = new JLabel("Schluessel: ");       d.add(schl);
//			JLabel schluessel = new JLabel("-----");        d.add(schluessel);
//			JLabel meth = new JLabel("CipherMethode: ");    d.add(meth);
//			JLabel methode = new JLabel("-----");           d.add(methode);
//			JButton verschluesseln = new JButton("verschlüsseln");
//			JButton entschluesseln = new JButton("entschlüsseln");
//			String[] ausw1 = {"SubstitutionCipher", "KeywordCipher", "ShiftCipher"};
//			String[] ausw2 = {"MonoalphabeticCipher", "TranspositionCipher"};
//			JComboBox auswahlschluessel = new JComboBox(ausw1);
//			JComboBox auswahlcipher = new JComboBox(ausw2);
//			
//			//Oberfläche wird erstellt mithilfe einer Bestimmten Reihenfolge 
//			a.add(text); a.add(verschluesseln); a.add(entschluesseln);
//			this.add(d);
//			b.add(auswahlcipher); b.add(auswahlschluessel);
//			this.add(a); this.add(b);
//			
//			//Actionlistener setzen
//			auswahlschluessel.addActionListener(c);
//			auswahlcipher.addActionListener(c);
//			verschluesseln.addActionListener(c);
//			entschluesseln.addActionListener(c);
//		}
//	}
	
}
