package melicharsprung.test;

import static org.junit.Assert.*;
import melicharsprung.cipher.TranspositionCipher;

import org.junit.Test;

public class TranspositionCipher_test {
	TranspositionCipher tc;
	@Test
	public void test_encrypt_decrypt() {
		tc = new TranspositionCipher(); // transpositionlevel = 5
		String encr = tc.encrypt("luka"); // FUNKTIONIERT
		System.out.println(encr); 
		//TODO
		/**
		 * Fehlerbeschreibung:
		 * Enrypt funktioniert richtig, decrypt auch zum größten Teil jedoch werden wenn man
		 * etwas entschlüsselt an den text (genau so viele X drangehängt die benötigt werden
		 * um es nach dem transposition-verfahren zu Verschlüsseln)  gleiche Buchstaben drangehängt.
		 */
		String decr = tc.decrypt(encr); 
		System.out.println(decr);
	}
	/**
	 * Bei einer Wortlänge von 5 oder weniger wird das Wort nicht sehr gut entschlüsselt
	 * aus lukas wird --> lukas
	 * --> leicht durchschaubar <--
	 * 
	 * Bei mehreren Wörtern oder Buchstaben ist die verschlüsselg so gut wie nicht mehr durchschaubar.
	 */
}
