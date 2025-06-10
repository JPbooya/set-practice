import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
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

    @org.junit.jupiter.api.Test
    void testForUniqueChar_null() {
        assertTrue(UniqueCharacterChecker.hasUniqueCharacters(""));
    }

    @org.junit.jupiter.api.Test 
    void testForDuplicateRemover() {
        List<String> expected = Arrays.asList("bye", "hello");
        assertEquals(expected, DuplicateRemover.sortAndRemoveDuplicates(new String[]{"bye", "hello", "bye"}));
    }

    @org.junit.jupiter.api.Test 
    void testForDuplicateRemover_Null() {
        List<String> expected = Arrays.asList();
        assertEquals(expected, DuplicateRemover.sortAndRemoveDuplicates(new String[]{}));
    }

    @org.junit.jupiter.api.Test 
    void testForDuplicateRemover_allDup() {
        List<String> expected = Arrays.asList("bye");
        assertEquals(expected, DuplicateRemover.sortAndRemoveDuplicates(new String[]{"bye", "bye", "bye", "bye"}));
    }
    @org.junit.jupiter.api.Test 
    void testForDuplicateRemover_case() {
        List<String> expected = Arrays.asList("Bye", "hello");
        assertEquals(expected, DuplicateRemover.sortAndRemoveDuplicates(new String[]{"Bye", "hello"}));
    }

    @org.junit.jupiter.api.Test 
    void testForDuplicateRemover_caseAllSame() {
        List<String> expected = Arrays.asList("Hello", "hello");
        assertEquals(expected, DuplicateRemover.sortAndRemoveDuplicates(new String[]{"Hello", "Hello", "Hello", "hello"}));
    }
}






