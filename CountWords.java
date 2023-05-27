package GroupProject2;

public class CountWords {
    public static void main(String[] args) {

        String word = "Hello, world!";
        String[] strArr = word.split("[.,!?]");
        int count = strArr.length;
        System.out.println(count);
    }
}

/*
Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.
 */