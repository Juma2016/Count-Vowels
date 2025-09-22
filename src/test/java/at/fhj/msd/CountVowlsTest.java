package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountVowlsTest {
    @Test
    void testFindVowls() {

        assertEquals(2, CountVowls.findVowls("hello"));
        assertEquals(2, CountVowls.findVowls("java"));
        assertEquals(0, CountVowls.findVowls(""));
        assertEquals(0, CountVowls.findVowls(null));
    }
}
