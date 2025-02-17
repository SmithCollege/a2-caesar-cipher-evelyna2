// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class CaesarCipher {

    /** Character array to store the letters in the alphabet in order */
    Character[] alphabet;

    /** DynamicArray object providing ArrayList-like operations for Characters */
    DynamicArray<Character> cipher;

    /** Private offset that tracks how many positions to shift the index for
    * This cipher */
    private int offset;

    /** Constructor that should define the instance variables, including
     * populating the alphabet
     * @param offset Offset to use when creating `cipher` of DynamicArray type
     */
    CaesarCipher(int offset){
        this.alphabet = new Character[26];
        this.alphabet[0]= 'A';
        this.alphabet[1]= 'B';
        this.alphabet[2]= 'C';
        this.alphabet[3]= 'D';
        this.alphabet[4]= 'E';
        this.alphabet[5]= 'F';
        this.alphabet[6]= 'G';
        this.alphabet[7]= 'H';
        this.alphabet[8]= 'I';
        this.alphabet[9]= 'J';
        this.alphabet[10]= 'K';
        this.alphabet[11]= 'L';
        this.alphabet[12]= 'M';
        this.alphabet[13]= 'N';
        this.alphabet[14]= 'O';
        this.alphabet[15]= 'P';
        this.alphabet[16]= 'Q';
        this.alphabet[17]= 'R';
        this.alphabet[18]= 'S';
        this.alphabet[19]= 'T';
        this.alphabet[20]= 'U';
        this.alphabet[21]= 'V';
        this.alphabet[22]= 'W';
        this.alphabet[23]= 'X';
        this.alphabet[24]= 'Y';
        this.alphabet[25]= 'Z';
        for(int i = 0; i<)
        this.offset = offset;
    }

    /** Implementation of linear search that looks through the alphabet
     * array to identify the position of the passed value
     * @param val character to search for
     * @return int indicating position of val in the alphabet array
     */
    public int findIndex(char val){
        for(int i = 0; i<this.alphabet.length; i++){
            if(this.alphabet[i].equals(val)){
                return i;
            }
        }
        return -1;
    }

    /** Encode a message using the cipher
     * @param T message to encode
     * @return encoded message */  
    public String encode(String message){
        String result = "";
        char[] messageArr = message.toCharArray();
        for(int i = 0; i<messageArr.length; i++){
            int cur = this.findIndex(messageArr[i]);
            messageArr[i]= this.alphabet[cur+this.offset];
        }

        return result; 
     }

    /** Decode a message using the cipher 
     * @param String message to decode
     * @param int key to use in decoding
     * @return decoded message
    */
    public String decode(String message){
        // Fill in here and update return statement based on your code
        return new String();
    }

    public static void main(String[] args) {
    }
    
}
