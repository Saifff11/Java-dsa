public class largest{
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=1; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,5,8,2,10,66};
        System.out.println(getlargest(numbers));
    }
}