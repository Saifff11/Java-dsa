public class Alphabets{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++) {
            sb.append(ch);  // here append is for met the all next and previous elements
        }
        System.out.println(sb);
    }
}