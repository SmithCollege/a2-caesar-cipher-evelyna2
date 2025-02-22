// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class CaesarCipher {

    /** Character array to store the letters in the alphabet in order */
    Character[] alphabet;

    /** DynamicArray object providing ArrayList-like operations for Characters */
    DynamicArray<Character> cipher;

    /**
     * Private offset that tracks how many positions to shift the index for
     * This cipher
     */
    private int offset;

    /**
     * Constructor that should define the instance variables, including
     * populating the alphabet
     * 
     * @param offset Offset to use when creating `cipher` of DynamicArray type
     */
    CaesarCipher(int offset) {
        this.offset = offset;
        this.alphabet = new Character[26];
        for (int f = 0; f < 26; f++) {
            char charValue = Character.toLowerCase((char) ('a' + f));
            this.alphabet[f] = charValue;
        }
        this.cipher = new DynamicArray<Character>(this.offset, alphabet);
        for (int i = 0; i < 26; i++) {
            this.cipher.set(i, alphabet[(i - (this.offset % 26) + 26) % 26]);
        }
    }

    /**
     * Returns the character stored in the given index
     * 
     * @param i the index
     * @return the character
     */
    public char get(int i) {
        return this.cipher.get(i);
    }

    /**
     * Implementation of linear search that looks through the alphabet
     * array to identify the position of the passed value
     * 
     * @param val character to search for
     * @return int indicating position of val in the alphabet array
     */
    public int findIndex(char val) {
        for (int i = 0; i < this.alphabet.length; i++) {
            if (this.alphabet[i] == val) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Encode a message using the cipher
     * 
     * @param String message to encode
     * @return encoded message
     */
    public String encode(String message) {
        String result = "";
        message = message.toLowerCase();
        char[] messageArr = message.toCharArray();
        for (int i = 0; i < messageArr.length; i++) {
            int cur = this.findIndex(messageArr[i]);
            if (cur != -1) {
                result += cipher.get(cur);
            } else {
                result += messageArr[i]; // return unchanged
            }

        }
        return result;
    }

    /**
     * Decode a message using the cipher
     * 
     * @param String message to decode
     * @return decoded message
     */
    public String decode(String message) {
        String result = "";
        message = message.toLowerCase();
        char[] messageArr = message.toCharArray();
        for (int i = 0; i < messageArr.length; i++) {
            int cur = cipher.indexOf(messageArr[i]);
            if (cur != -1) {
                result += alphabet[cur];
            } else {
                result += messageArr[i]; // return unchanged
            }

        }
        return result;
    }

    public static void main(String[] args) {
    }

}
