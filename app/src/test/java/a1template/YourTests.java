// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

import org.junit.Test;
import static org.junit.Assert.*;

public class YourTests {

    @Test
    public void encodeTest() {
        CaesarCipher classUnderTest = new CaesarCipher(50);
        assertEquals("vjku ku c ugetgv oguucig", classUnderTest.encode("this is a secret message"));

        classUnderTest = new CaesarCipher(-3);
        assertEquals("wklv lvq'w yhub vhfuhw.", classUnderTest.encode("this isn't very secret."));
    }

    @Test
    public void decodeTest() {
        CaesarCipher classUnderTest = new CaesarCipher(50);
        assertEquals("this is a secret message", classUnderTest.decode("vjku ku c ugetgv oguucig"));

        classUnderTest = new CaesarCipher(-3);
        assertEquals("this isn't very secret.", classUnderTest.decode("wklv lvq'w yhub vhfuhw."));

    }

}