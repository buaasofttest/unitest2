package edu.buaa.sse.lesson.unittest;

/**
 * Created by tina on 2015/10/17.
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class TestLongestSubstringwithoutReapeatCharacter {

    @Test
    public void testCounter(){
        LongestSubstringwithoutReapeatCharacter sut = new LongestSubstringwithoutReapeatCharacter();

        String str1 ="abc";
        assertEquals( sut.counter(str1),3);

        String str2 ="abca";
        assertEquals( sut.counter(str2),3);

        assertEquals(sut.counter(""),0);
        assertEquals(sut.counter("a"),1);
        assertEquals(sut.counter("aa"),1);
        assertEquals(sut.counter("ab"),2);
        assertEquals(sut.counter("aba"),2);
    }

    @Test
    public void testSubstring(){
        LongestSubstringwithoutReapeatCharacter sut = new LongestSubstringwithoutReapeatCharacter();
        assertEquals(sut.lengthOfLongestSubstring(""),0);
        assertEquals(sut.lengthOfLongestSubstring("a"),1);
        assertEquals(sut.lengthOfLongestSubstring("aa"),1);
        assertEquals(sut.lengthOfLongestSubstring("aab"),2);
        assertEquals(sut.lengthOfLongestSubstring("aabcadefgtt"),8);

    }

}
