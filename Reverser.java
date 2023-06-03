public class Reverser extends Transpose {
    public Reverser(String s) {
        super(s);
    }
    public String reverseText(String word) {
    	StringBuffer result = new StringBuffer(word);
    	result.reverse();
    	return result.toString();
    }
    
    public String decode(String word) {
        String reverseWord = super.decode(word);
        String[] words = reverseWord.split(" ");
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < words.length; i++)	{
        	result.append(words[i]);
        	if (i < words.length - 1)	{
        		result.append(" ");
        	}
        }
        return result.toString();
    }
}
