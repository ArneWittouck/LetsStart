package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    @Test
    void appendIfMissing() {
        StringProcessor stringProcessor = new StringProcessor();
        String result = stringProcessor.appendIfMissing("hallo!", "!");
        assertEquals(result, "hallo!");
    }

    @Test
    void appendIfMissingWithoutSuffix() {
        StringProcessor stringProcessor = new StringProcessor();
        String result = stringProcessor.appendIfMissing("hallo", "!");
        assertEquals(result, "hallo!");
    }
}