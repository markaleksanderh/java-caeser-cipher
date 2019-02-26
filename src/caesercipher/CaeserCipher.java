package caesercipher;

import java.util.Scanner;

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
        String candidate = "";
        double candidateScore = 0;
        String candidateDecryption = "";
        double candidateDecryptionScore = 0;
        for (int i = 0; i < alphaLower.length(); i++) {
            candidateDecryption = encipher(encrypted, i);
            candidateDecryptionScore = score(candidateDecryption);
            if (candidateDecryptionScore > candidateScore) {
                candidateScore = candidateDecryptionScore;
                candidate = candidateDecryption;
            }
        }
        return candidate;
    }


    public double score(String encrypted) {
        double score = 0;
        for (int i = 0; i < encrypted.length(); i++) {
            String letter = encrypted.substring(i,i+1);
            switch(letter) {
                case "E":
                case "e":
                    score += 12.702;
                    break;
                case "T":
                case "t":
                    score += 9.056;
                    break;
                case "A":
                case "a":
                    score += 8.167;
                    break;
                case "O":
                case "o":
                    score += 7.507;
                    break;
                case "I":
                case "i":
                    score += 6.966;
                    break;
                default:
                    break;
            }
        }
        return score;
    }
    public static void main(String ... args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Encrypt (e) or decrypt (d)?");
        String choice = in.next();
        if (choice.charAt(0) == 'e') {
            // Get user input
        }
        else if (choice.charAt(0) == 'd') {
            // Get user input
        }
    }


}
