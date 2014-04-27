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
		 * Enrypt funktioniert richtig, decrypt auch zum gr��ten Teil jedoch werden wenn man
		 * etwas entschl�sselt an den text (genau so viele X drangeh�ngt die ben�tigt werden
		 * um es nach dem transposition-verfahren zu Verschl�sseln)  gleiche Buchstaben drangeh�ngt.
		 */
		String decr = tc.decrypt(encr); 
		System.out.println(decr);
	}
	/**
	 * Bei einer Wortl�nge von 5 oder weniger wird das Wort nicht sehr gut entschl�sselt
	 * aus lukas wird --> lukas
	 * --> leicht durchschaubar <--
	 * 
	 * Bei mehreren W�rtern oder Buchstaben ist die verschl�sselg so gut wie nicht mehr durchschaubar.
	 */
}
