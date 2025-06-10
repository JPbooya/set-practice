import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class JunitTesting {
    @org.junit.jupiter.api.Test
    void testForCommonElms() {
        Set<Integer> expected = new HashSet<>(Arrays.asList(4,5,6));
        assertEquals(expected, CommonElementsFinder.findCommonElements(new int[]{4,5,6}, new int[]{4,5,6}));
    }

    @org.junit.jupiter.api.Test
    void testForCommonElms_OneElms() {
        Set<Integer> expected = new HashSet<>(Arrays.asList(3));
        assertEquals(expected, CommonElementsFinder.findCommonElements(new int[]{1,2,3}, new int[]{3,4,5}));
    }

    @org.junit.jupiter.api.Test
    void testForCommonElms_TwoElms() {
        Set<Integer> expected = new HashSet<>(Arrays.asList(2,3));
        assertEquals(expected, CommonElementsFinder.findCommonElements(new int[]{1,2,3}, new int[]{2,3,4,5}));
    }

    @org.junit.jupiter.api.Test
    void testForCommonElms_NoCommon() {
        Set<Integer> expected = new HashSet<>(Arrays.asList());
        assertEquals(expected, CommonElementsFinder.findCommonElements(new int[]{1,2,3}, new int[]{4,5,6}));
    }

    @org.junit.jupiter.api.Test
    void testForUniqueChar() {
        assertTrue(UniqueCharacterChecker.hasUniqueCharacters("bye"));
    }

    @org.junit.jupiter.api.Test 
    void testForNonUniqeChar() {
        assertFalse(UniqueCharacterChecker.hasUniqueCharacters("Hello"));
    }
}


