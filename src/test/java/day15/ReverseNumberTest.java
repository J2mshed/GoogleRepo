package day15;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseNumberTest {
    /**
     * This method reverses digit
     *
     * @param digit
     * @return reversed digit
     */
    public static int getReversedDigit(int digit) {
        int reversedDigit = digit;

        digit = Math.abs(digit);
        int reversed =0;
  //      String digitInString = Integer.toString(digit);
        while( digit > 0 )
        {
        //    int reversed = reversedDigit%10;
            reversed = reversed * 10 + digit%10;
            digit /= 10;

        }

        reversedDigit= reversed;
//        Implementation goes here.
        return reversedDigit;
    }

      @Test
      public void positiveDigitTest() {
          assertEquals(1, getReversedDigit(1));
          assertEquals(321, getReversedDigit(123));
      }

      @Test
      public void negativeDigitTest() {
          assertEquals(1, getReversedDigit(-1));
      }

      @Test
      public void zeroTest() {
          assertEquals(0, getReversedDigit(0));
      }

      @Test
      public void bigValueTest() {
          assertEquals(76723, getReversedDigit(Short.MAX_VALUE));
      }

      @Test
      public void smallValueTest() { assertEquals(86723, getReversedDigit(Short.MIN_VALUE));}
}
