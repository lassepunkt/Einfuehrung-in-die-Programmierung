public class CaesarEncrypter implements Encrypter {
    private int schluessel;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz .,!?";
    
    public CaesarEncrypter(int schluessel) {
        this.schluessel = schluessel;
    }
    
    public String encrypt(String message) {
        String encryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            for (int a = 0; a < alphabet.length(); a++) {
                if (message.charAt(i) == alphabet.charAt(a)) {
                    encryptedMessage += alphabet.charAt((a+this.schluessel)%alphabet.length());
                }
            }
        }
        return encryptedMessage;
    }
    
    public String decrypt(String message) {
        String decryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            for (int a = 0; a < alphabet.length(); a++) {
                if (message.charAt(i) == alphabet.charAt(a)) {
                    decryptedMessage += alphabet.charAt((a+(alphabet.length()-this.schluessel))%alphabet.length());
                }
            }
        }
        return decryptedMessage;
    }
}
