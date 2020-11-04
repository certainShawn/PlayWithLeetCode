class Solution {
    
    public int reverse(int x) {     
        Integer miden=new Integer(x);
        String numString=miden.toString();
        StringBuilder stringBuilder=new StringBuilder(numString);
        if(stringBuilder.charAt(0)=='-')
        {
            stringBuilder.deleteCharAt(0);
        }
        char[] charater=new char[numString.length()-1];
        for(int i=0;i<stringBuilder.length();i++)
        {
            charater[stringBuilder.length()-1-i]=stringBuilder.charAt(stringBuilder.length()-i);
        }
        String resultmiddien=charater.toString();
        Integer resultfinal=new Integer(resultmiddien);
        int result=resultfinal.intValue();
    return result;
    }
}