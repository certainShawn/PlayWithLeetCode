package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode13 {
    static int FinalNumber=0;
    public int romanToInt(String s)
    {
        Map<Character,Integer> ForRoman = new HashMap<Character,Integer>(); 
        ForRoman.put('I', 1);
        ForRoman.put('V', 5);
        ForRoman.put('X', 10);
        ForRoman.put('L', 50);
        ForRoman.put('C', 100);
        ForRoman.put('D', 500);
        ForRoman.put('M', 1000);
        for(int i=0;i<s.length();i++)
        {
            Character memo=s.charAt(i);
            if(i<s.length()-1)
            {
                Character memoPlus=s.charAt(i+1);
                int compareDigit1=ForRoman.get(memo);
                int CompareDigit2=ForRoman.get(memoPlus);
            
                if(compareDigit1<=CompareDigit2)
                {
                    int memopluz=compareDigit1*CompareDigit2;
                    FinalNumber=FinalNumber+memopluz;
                }
                else
                {
                    FinalNumber=FinalNumber+ForRoman.get(memo);
                }
            }    
            if(i==s.length())
            {
                int lastDigit=ForRoman.get(memo); 
                FinalNumber=FinalNumber+lastDigit;
                break;
            }    
        }
        return FinalNumber;     
    }
}