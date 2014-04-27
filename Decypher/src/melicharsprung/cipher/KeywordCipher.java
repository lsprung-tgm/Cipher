package melicharsprung.cipher;

public class KeywordCipher extends MonoalphabeticCipher {
	public String codewordal = "";
	public KeywordCipher(String keyword) {
		setKeyword(keyword);
	}
	/**
	 * Der KeywordCipher funktioniert so:
	 * 
	 * Ein Codewort wird übergeben z.B. "cipher"
	 * Das gesetzte Geheimalphabet sieht dann wie folgt aus:
	 *  "cipherabdfgjklmnopqstuvwxyz"
	 *  
	 *  --> Das Codewort wird vorne drangeschrieben und dann kommen alle Buchstaben die das
	 *  Wort noch nicht beinhaltet alphabetisch sortiert hinten dran
	 * @param keyword
	 */
	public void setKeyword(String keyword) {
		String word = "";
		word+=keyword.charAt(0);
		for(int i = 1; i < keyword.length(); i++){
			if(word.contains(keyword.charAt(i)+"")){
				//do nothing
			}else{
				word+=keyword.charAt(i);
			}
		}
		codewordal = word.toLowerCase();
		for(char i = 97; i < 122; i++){
			if(codewordal.contains(i+"")); else {
				codewordal+=i;
			}
		}
	}
}
