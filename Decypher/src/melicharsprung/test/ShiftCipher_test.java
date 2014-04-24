package melicharsprung.test;

import static org.junit.Assert.*;
import melicharsprung.cipher.ShiftCipher;

import org.junit.Test;

/**
 * 
 * @author Daniel Melichar
 *
 */
public class ShiftCipher_test {

	@Test
	public void shiftciphertest_oneWord() {
		ShiftCipher sc = new ShiftCipher(5);
		sc.setShiftAmmount(5);
		String x = sc.encrypt("melichar");
		sc.decrypt(x);
	}
	
	@Test
	public void shiftciphertest_twoWords() {
		ShiftCipher sc = new ShiftCipher(5);
		sc.setShiftAmmount(5);
		String x = sc.encrypt("melichar daniel");
		sc.decrypt(x);
	}
}
