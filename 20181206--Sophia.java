import java.util.ArrayList;
import java.util.List;

public class Word{
    /** Scrambles a given word.
     *  @param word the word to be scrambled
     *  @return the scrambled word (possibly equal to word)
     *  Precondition: word is either an empty string or contains only uppercase letters
     *  Postcondition: the string returned was created from word as follows:
     *  - the word was scrambled, beginning at the first letter and continuing from left to right
     *  - two consecutive letters consisting of "A" followed by a letter that was not "A" was swapped
     *  - letters were swapped at most one
     */
    public static String scrambleWord(String word)
    {
        String k = word;
        for(int i = 2;i<word.length();i+2){
            if(((word.substring(0,i)).indexOf("A")=-1）||((word.substring(0,i)).indexOf("A")！=-1)&&（！(word.substring(i,i+1)).equals("A")))){
                  k = word;
            }
            else if(((word.substring(0,i)).indexOf("A")！=-1)&&！(word.substring(i,i+1)).equals("A"))
                  k = word.substring(0,i-1)+ word.substring(i,i+1)+word.substring(i-1,i)+word.substring(i);
            }
           
         return k;
        
               //
        String tmp = "";
        for(int i = 0;i<word.length()-1;i++){
            String a = word.substring(i,i+1);
            String b = word.substring(i+1,i+2);
            if(a.equals("A")&&!b.equals("A")){
                tmp+=b+a;
                i++;
            }
            else{
                tmp+=a;
                if(i==word.length()-2){
                    tmp+=word.substring(i+1,i+2);
                 }
            }}
        return tmp;
    }
    /** Modifies wordList by replacing each word with its scrambled
     *  version, removing any words that are unchanged as a result of scrambling.
     *  @param wordList the list of words
     *  Precondition: wordList contains only non-null objects
     *  Postcondition:
     *  - all words unchanged by scrambling have been removed from wordList
     *  - each of the remaining words has been replaced by its scrambled version
     *  - the relative ordering of the entries in wordList is the same as it was 
     *    before the method was called
     */
    public static void scrambleOrRemove(List<String> wordList){
        /* part (b) */
        for(int i = 0;i<wordList.size;i++){
            if(scramble(wordList.get(i).equals(wordList.get(i)){
                word.remove(i);
                i--;
            }
        }
        
    }

    public static void main(String[] args)
    {
        
    }
}
