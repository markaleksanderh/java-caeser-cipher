package caesercipher;

public class CaeserCipher {

    private static String alphaLower = "abcdefghijklmnopqrstuvwxyz";
    private static String alphaUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String encipher(String input, int shift) {
        String ciphered = "";

        for (int i  = 0; i < input.length(); i++) {

            int positionLower = alphaLower.indexOf(input.substring(i, i+1));
            int positionUpper = alphaUpper.indexOf(input.substring(i, i+1));
            if (positionLower != -1) {
                int shifted = (positionLower + shift) % alphaLower.length();
                String shiftedCharacter = alphaLower.substring(shifted, shifted+1);
                ciphered += shiftedCharacter;
            }

            else if (positionUpper != -1) {
                int shifted = (positionUpper + shift) % alphaUpper.length();
                String shiftedCharacter = alphaUpper.substring(shifted, shifted+1);
                ciphered += shiftedCharacter;
            }

            else {
                ciphered += input.substring(i, i+1);
            }

        }
        return ciphered;
    }

    public String decipher(String encrypted) {
        return encrypted;
    }
}
