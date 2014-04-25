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

	ShiftCipher sc;
	String x, y;
	
	@Test
	public void shiftciphertest_oneWord5() {
		sc = new ShiftCipher(5);
		x = sc.encrypt("melichar");
		y = sc.decrypt(x);
		assertEquals("melichar", y);
	}
	
	@Test
	public void shiftciphertest_twoWords5() {
		sc = new ShiftCipher(5);
		x = sc.encrypt("melichar daniel");
		y = sc.decrypt(x);
		assertEquals("melichar daniel", y);
	}
	
	@Test
	public void shiftciphertest_oneWord100() {
		sc = new ShiftCipher(100);
		x = sc.encrypt("melichar");
		y = sc.decrypt(x);
		assertEquals("melichar", y);
	}
}
