import java.util.*;
public class Solution {
    public static void main (String [] args){
        String s = "hello";
        Solution aa = new Solution();
        aa.reverseVowels(s);
        System.out.println(s);
    }
    public String reverseVowels(String s) {
        Set<Character> kk = new HashSet<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        
        if (s == null) return null;
        char[] ss = s.toCharArray();
        char n = 'a';
        int i=0, j= ss.length-1;
        while(i < j){
            if(kk.contains(ss[i])&&kk.contains(ss[j])){
                n = ss[i];
                ss[i]=ss[j];
                ss[j]=n;

            }
            else if(!kk.contains(ss[i])){
                i++;
            }
            else if (!kk.contains(ss[j])){
                j--;
            }
        }
        
        return new String(ss);
        
    }
   
}