public class Compare{
    public static void main(String[] args) {
        String str = "Tonny";
        String str1 = "Tonny";
        String str2 = new String("Tonny");

        if(str == str1) {
            System.out.println("Strings are equals");
        }
        else{
            System.out.println("Strings are no equals");
        }

        if(str1 == str2) {
            System.out.println("Strings are equals");
        }
        else{
            System.out.println("Strings are not equals");       // here strings are not equals bcoz new string found
        }

        // for comparing only values of string
        if(str1.equals (str2)) {
            System.out.println("Strings are equals");
        }
        else{
            System.out.println("Strings are not equals");       // here we use equal function for comparing the values only 
        }
    }
}