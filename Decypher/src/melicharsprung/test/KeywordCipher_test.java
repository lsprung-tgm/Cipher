package melicharsprung.test;

import static org.junit.Assert.*;
import melicharsprung.cipher.KeywordCipher;

import org.junit.Test;

/**
 * 
 * @author Daniel Melichar
 *
 */
public class KeywordCipher_test {

	@Test
	public void keywordcipher_one() {
		KeywordCipher kc = new KeywordCipher("cipher");
		kc.setKeyword("cipher");
		kc.encrypt("melichar");
	}

}
