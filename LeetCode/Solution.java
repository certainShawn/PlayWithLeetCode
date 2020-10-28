import java.lang.*;
import java.util.Arrays;
class Solution {
    
    public int reverse(int x) {     
        Integer miden=new Integer(x);
        String numString=miden.toString();
        char[] charater=new char[numString.length()-1];
        for(int i=0;i<numString.length();i++)
        {
            StringBuilder stringBuilder=new StringBuilder(numString);
            
            charater[i]=stringBuilder.charAt(numString.length()-i);
        }
        if(charater[(numString.length()-1)]=='-')
        {
            char[] charater1=Arrays.copyOfRange(charater,0, numString.length()-2)
        }
        int result=0;
    return result;
    }

}