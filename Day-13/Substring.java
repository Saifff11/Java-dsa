public class Substring{
    public static String Substring(String str, int si, int ei) {
        String substr = "";
        for(int i=si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "hello world";
       // System.out.println(Substring(str, 0, 5));
       System.out.println(str.substring(0,4));      // here substring is java preDefine function
    }
}