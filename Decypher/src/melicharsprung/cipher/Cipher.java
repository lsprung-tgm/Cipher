package melicharsprung.cipher;

/**
 * Interface f�r die Methoden encrypt und decrypt
 * @author Melichar Daniel
 * @version 31.03.2014
*/
public interface Cipher {	
	public String encrypt(String text);
	public String decrypt(String text);
}
