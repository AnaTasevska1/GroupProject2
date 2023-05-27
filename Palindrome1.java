package GroupProject2;

public class Palindrome1 {
    public static void main(String[] args) {

        String str = "Madam";
        String str1 = str.replaceAll("\\s", "").toLowerCase();
        String reversedString = new StringBuilder(str1).reverse().toString();

        if (str1.equals(reversedString)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

/*
Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and backward.
For example, "madam" is a palindrome.
 */