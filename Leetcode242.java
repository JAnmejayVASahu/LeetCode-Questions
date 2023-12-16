import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        int length1 = s.length();
        int length2 = t.length();

        //if the length of those two string are difference then, thhose string are not anagram
        if(length1 != length2){
            System.err.println("Not anagram, becoz length is not equal!\n");
             return false;
        }

        // if the string's length equal then check each member of those two string
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        
        if(!Arrays.equals(sChar, tChar)){
            System.err.println("Those strings are not anagram.");
        }
        else{
            System.err.println("Those strings are anagram.");
        }
        return true;
    }
}
public class Leetcode242{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.err.println("\nTestcase - 1");
        s.isAnagram("anagram", "nagaram");
        System.err.println("\nTestcase - 2");
        s.isAnagram("rat", "car");
        System.err.println("\nTestcase - 3");
        s.isAnagram("rat", "cata");

    }
}
