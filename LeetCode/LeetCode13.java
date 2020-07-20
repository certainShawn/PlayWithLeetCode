import java.util.HashMap;
import java.util.Map;

public class Roman {
    static int finalNumber=0;
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
            finalNumber=finalNumber+ForRoman.get(memo);
        }
        return finalNumber;
        
    }
}