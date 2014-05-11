package melicharsprung.gui;

import melicharsprung.cipher.*;

public class InterfaceCipherModel {

	public KeywordCipher kc;
	public ShiftCipher shc;
	public SubstitutionCipher  suc;
	public TranspositionCipher tc;
	
	public InterfaceCipherModel() {
			kc = new KeywordCipher("lukas");
			shc = new ShiftCipher(3);
			suc = new SubstitutionCipher();
			tc = new TranspositionCipher();
	}
}
