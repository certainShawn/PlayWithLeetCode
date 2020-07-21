package LeetCode;

public class TestClass {
    public static void main(String args[])
    {
        LeetCode13 leetCode13=new LeetCode13();
        int testcase2=leetCode13.romanToInt("III");
        int testcase3=leetCode13.romanToInt("IV");
        int testcase4=leetCode13.romanToInt("IX");
        int testcase5=leetCode13.romanToInt("LVIII");
        int testcase6=leetCode13.romanToInt("MCMXCIV");
        System.out.print(testcase2);
        System.out.print(testcase3);
        System.out.print(testcase4);
        System.out.print(testcase5);
        System.out.print(testcase6);
    }
}