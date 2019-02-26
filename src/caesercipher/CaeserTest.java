package caesercipher;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaeserTest {
    CaeserCipher cipher = new CaeserCipher();

    @Test
    public void shouldReturnCipheredLower() {
        assertEquals("uryyb jbeyq", cipher.encipher("hello world", 13));
    }

    @Test
    public void shouldReturnCipheredUpper() {
        assertEquals("URYYB JBEYQ", cipher.encipher("HELLO WORLD", 13));
    }

    @Test
    public void shouldReturnCipheredMixedLong() {
        assertEquals("P2456u aol Qhch wyvny!!!httpun shu####n¢bhnl, hu pualymhjl pz h ylmlylujl afwl, zptpshy av h jshz55555.", cipher.encipher("I2456n the Java progr!!!amming lan####g¢uage, an interface is a reference type, similar to a clas55555.", 7));
    }

    @Test
    public void shouldReturnDeciphered() {
        assertEquals("Here’s an example of an incredibly common kind of bug in Python.", cipher.decipher("Axkx’l tg xqtfiex hy tg bgvkxwbuer vhffhg dbgw hy unz bg Irmahg."));
    }

    @Test
    public void shouldReturnScoreSimple() {
        assertEquals(44.398, cipher.score("etaoi"), 0.001);
    }
}
