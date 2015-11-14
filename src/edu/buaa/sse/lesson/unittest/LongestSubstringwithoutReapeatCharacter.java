package edu.buaa.sse.lesson.unittest;
import java.util.HashSet;
import java.util.Hashtable;
/**
 * Created by tina on 2015/10/17.
 */

public class LongestSubstringwithoutReapeatCharacter {

    public int lengthOfLongestSubstring(String inputString){
        int maxnumber = 0;
        for(int i= 0; i<inputString.length();i++){
            int temp =counter(inputString.substring(i));
            if (temp>maxnumber) maxnumber = temp;
        }
        return maxnumber;
    }

    public int counter(String inputString){
        int maxnumber = 0;
        HashSet hashSet = new HashSet();
        for(char s:inputString.toCharArray()){
            if(hashSet.contains(s)) return maxnumber;
            else {hashSet.add(s); maxnumber++;};
        }
        return inputString.length();
    }

    public int lengthOfLongestSubstring1(String s) {
        char[] str = s.toCharArray();
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            int count = 0;
            Hashtable<Character, Integer> hash = new Hashtable<Character, Integer>();
            for (int j = i; j < str.length; j++) {
                if (!hash.containsKey(str[j])) {
                    hash.put(str[j], j);
                } else {
                    count = hash.get(str[j]) - i + 1;
                    break;
                }
            }
            if (count > max)
                max = count;
        }
        return max;
    }
}
