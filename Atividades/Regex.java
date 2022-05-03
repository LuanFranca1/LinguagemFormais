package javaapplication2;
import java.util.regex.*;
public class Regex2 {
    
    
    public static void main(String[] args) {
        String regex;
        regex = "aa[ab]";
        System.out.println(Pattern.matches(regex,"aaab"));
    }
    
}
