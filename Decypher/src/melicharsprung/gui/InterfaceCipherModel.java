package melicharsprung.gui;
 
 import melicharsprung.cipher.*;
 
 public class InterfaceCipherModel {
 
 	public KeywordCipher kc = new KeywordCipher("lukas");
 	//Die folgende Klasse hat probleme, die Gui läst sich bei einer initialisierung nicht ausführen
 	public ShiftCipher shc;
 	public SubstitutionCipher suc = new SubstitutionCipher();
 	public TranspositionCipher tc = new TranspositionCipher();
 	public MonoalphabeticCipher mc = new MonoalphabeticCipher();
 	
 	public InterfaceCipherModel() {
 		
 	}
 }