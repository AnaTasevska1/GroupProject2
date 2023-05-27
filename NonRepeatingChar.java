package GroupProject2;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String word="abracadabra";

        for (int i = 0; i < word.length(); i++) {
            boolean nonRepeat = true;
            for (int j = 0; j < word.length(); j++) {
                if (i!=j && word.charAt(i)==word.charAt(j)){
                    nonRepeat=false;
                    break;
                }
            }if (nonRepeat){
                System.out.println(word.charAt(i));
                return;
            }
        }
    }
}

/*
Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.
 */
