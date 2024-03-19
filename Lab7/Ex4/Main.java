package Lab7.Ex4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String string = "Test, test 123";
        stringStats(string);
    }

    static void stringStats(String string){
        Pattern vowel_pattern = Pattern.compile("[aeiouyAEIOUY]");
        Matcher vowel_matcher = vowel_pattern.matcher(string);

        Pattern letter_pattern = Pattern.compile("[a-zA-z]");
        Matcher letter_matcher = letter_pattern.matcher(string);

        Pattern whitespace_pattern = Pattern.compile(" ");
        Matcher whitespace_matcher = whitespace_pattern.matcher(string);

        Pattern number_pattern = Pattern.compile("[0-9]");
        Matcher number_matcher = number_pattern.matcher(string);

        int letter = 0;
        int vowel = 0;
        int consonant = 0;
        int whitespace = 0;
        int number = 0;
        int special = 0;

        for(int i = 0; i < string.length();i++){
            if(letter_matcher.find()){
                letter++;
                if(vowel_matcher.find()){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
            else if(whitespace_matcher.find()){
                whitespace++;
            }
            else if(number_matcher.find()){
                number++;
            }
            else {
                special++;
            }
        }

        System.out.printf("Podany tekst \"%s\" zawiera: \n",string);
        System.out.printf("%s liter, w tym %s samogłosek oraz %s spółgłosek \n", letter, vowel, consonant);
        System.out.printf("%s białych znaków \n",whitespace);
        System.out.printf("%s liczb \n",number);
        System.out.printf("%s innych znaków \n",special);

    }
}
