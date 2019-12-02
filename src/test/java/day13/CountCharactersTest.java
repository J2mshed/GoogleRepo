package day13;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountCharactersTest {
    /**
     * This method should return amount of specified characters in the text. Upper and lower case characters are meant to be the same character
     * @param text - text sentence
     * @param character - character amount of which we are counting
     * @return - amount oof character in text
     */
    public static int countCharacters(String text, char character) {
        int amountOfCharactersInText = 0;

        char[] chars = text.toLowerCase().toCharArray();
        for (char c : chars) {
            if (c==character){
                amountOfCharactersInText++;
            }
        }
//        Implementation goes here.
//        TIP String class has "text".toCharArray() method that transforms String to characters array.
        return amountOfCharactersInText;
    }

    @Test
    public void singleWordTest() {
        assertEquals(2, countCharacters("digitsARray", 'r'));
        assertEquals(2, countCharacters("digitsArray", 'a'));
        assertEquals(0, countCharacters("digitsArray", 'A'));
    }

//    Add additional tests here!
}