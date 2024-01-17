public class CaesarEncrypter implements Encrypter{
    private int schluessel;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz .,!?";
    
    public CaesarEncrypter(int schluessel) {
        this.schluessel = schluessel;
    }
    
    public String encrypt(String message) {
        String encryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            encryptedMessage += alphabet.charAt((alphabet.indexOf(message.charAt(i))+this.schluessel)%alphabet.length());
        }
        return encryptedMessage;
    }

    public String decrypt(String message) {
        String decryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            decryptedMessage += alphabet.charAt((alphabet.indexOf(message.charAt(i))+(alphabet.length()-this.schluessel))%alphabet.length());
        }
        return decryptedMessage;
    }
}
