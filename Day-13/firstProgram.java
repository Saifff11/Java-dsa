import java.util.*;
public class firstProgram{
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");

        Scanner sc = new Scanner(System.in);
        String name;
       // name = sc.next(); // for single word
        // name = sc.nextLine(); // for more than one words
        // System.out.println(name);

        // for printing the length
       // String fullname = "Md Saif Ali";
       // System.out.println(fullname.length());

       // concatenation --> add two different strings
        String firstname = "Md Saif";
        String lastname = "Ali";
        String fullname = firstname+ " " +lastname;
        System.out.println(fullname);
    }
}