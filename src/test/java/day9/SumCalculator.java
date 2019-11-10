package day9;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class SumCalculator {
        public int calculateSumFor(int maxValue) {
            int sum = 0;
            for(int i=0; i<=maxValue; i++){
                sum=sum+i;
            }
            //System.out.println("Sum is "+sum);
            return sum;
        }

        @Test
        public void testSumForZero() {
            assertEquals(0, new SumCalculator().calculateSumFor(0));
        }

        @Test
        public void testSumForOne() {
            assertEquals(1, new SumCalculator().calculateSumFor(1));
        }

        @Test
        public void testSumForTwo() {
            assertEquals(3, new SumCalculator().calculateSumFor(2));
        }

        @Test
        public void testSumForThree() {
            assertEquals(6, new SumCalculator().calculateSumFor(3));
        }

        @Test
        public void testSumForFour() {
            assertEquals(10, new SumCalculator().calculateSumFor(4));
        }

        @Test
        public void testSumForOneTwenty() {
            assertEquals(120, new SumCalculator().calculateSumFor(15));
        }





        public int calculateSumWhile(int maxValue) {
            int sum = 0;
            int i=0;
            while(i<=maxValue){
                sum=sum+i; i++;
            }
            return sum;
        }

        @Test
        public void testSumWhileZero() {
            assertEquals(0, new SumCalculator().calculateSumWhile(0));
        }

        @Test
        public void testSumWhileOne() {
            assertEquals(1, new SumCalculator().calculateSumWhile(1));
        }

        @Test
        public void testSumWhileTwo() {
            assertEquals(3, new SumCalculator().calculateSumWhile(2));
        }

        @Test
        public void testSumWhileThree() {
            assertEquals(6, new SumCalculator().calculateSumWhile(3));
        }

        @Test
        public void testSumWhileFour() {
            assertEquals(10, new SumCalculator().calculateSumWhile(4));
        }

        @Test
        public void testSumWhileOneTwenty() {
            assertEquals(120, new SumCalculator().calculateSumWhile(15));
        }





        public int calculateSumDoWhile(int maxValue) {
            int sum = 0;
            int i=0;
            do { sum=sum+i; i++;}
            while(i<=maxValue);
            //System.out.println("Sum is "+sum);
            return sum;
        }
        @Test
        public void testSumDoWhileZero() {
            assertEquals(0, new SumCalculator().calculateSumWhile(0));
        }
        @Test
        public void testSumDoWhileOne() {
            assertEquals(1, new SumCalculator().calculateSumDoWhile(1));
        }
        @Test
        public void testSumDoWhileTwo() {
            assertEquals(5, new SumCalculator().calculateSumDoWhile(2));
        }
        @Test
        public void testSumDoWhilehree() {
            assertEquals(6, new SumCalculator().calculateSumDoWhile(3));
        }
        @Test
        public void testSumDoWhileour() {
            assertEquals(10, new SumCalculator().calculateSumDoWhile(4));
        }
        @Test
        public void testSumDoWhileOneTwenty() {
            assertEquals(120, new SumCalculator().calculateSumDoWhile(15));
        }
    }





