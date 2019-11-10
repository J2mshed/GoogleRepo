import org.junit.Assert;
import org.junit.Test;

public class StringExamples {
    static String test;

    @Test
    public static void main(String[] args) {
        // append string
        System.out.println("abc"+"xyz"); // abcxyz
        System.out.println("abc".concat("xyz")); //abcxyz
        System.out.println("a+b+c"+"-321"); // a+b+c-321
        System.out.println("a 123"+-321); // a 123-321

        // substring
        System.out.println("abcdef".substring(3)); // def
        System.out.println("abcdef".substring(2,5)); //cde

        // replace
        System.out.println(String.format("ab%sef","cd"));
        System.out.println(String.format("ab%sef%s","cd","gh"));

        // is Empty and other similars
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("c")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("z")); // false
        System.out.println("abc".contains("ab")); //true
        System.out.println("abc".contains("a"+"z")); //false
        System.out.println("abc".contains("a"+"c")); //false
        System.out.println("abc".contains("a"+"b")); //true
        System.out.println("a2c".contains("a"+ 2)); //true


        System.out.println("".isEmpty()); // true
        System.out.println("abc".isEmpty()); // false
        System.out.println(""+" abc".isEmpty()); // false

        // Lenght
        System.out.println("abcdef".length()); //6
        System.out.println("abc"+" def".length()); // abc4
        System.out.println("abc"+"   ".length()); // abc3
        System.out.println("abc".length() + " def".length()); // 7
        System.out.println("abc 7".length() + "-5 def".length()); // 11
        System.out.println(1 + 2 + 3 + "abc 7".length() + "-5 def".length()); // 17

        // uppercase, lowercase
        System.out.println("AbCdEf".toLowerCase()); // abcdef
        System.out.println("AbCdEf".toUpperCase()); // ABCDEF

        // equality
        System.out.println("ABC".equals("abc")); // false
        System.out.println("abc".equals("abc")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); //true
        System.out.println("abcDD".equalsIgnoreCase("ABCdd")); // true
        System.out.println("abcDD12ssae22".equalsIgnoreCase("ABCdd12ssae22"));


        //Asserts

        Assert.assertEquals("assert equal","assert"+" equal");
        Assert.assertNotEquals("assert equal","assert"+"equal");
        Assert.assertEquals("ABCD", "abcd".toUpperCase());
        Assert.assertEquals("abcd", "AbCd".toLowerCase());
        Assert.assertEquals("assert", ("asse".concat("rt")));
        Assert.assertEquals("def", "abcdef".substring(3));
        Assert.assertEquals("de", "abcdef".substring(3,5));
        Assert.assertEquals(true, "qwerty".startsWith("qw"));
        Assert.assertEquals(true, "qwerty".endsWith("ty"));


    }
}
