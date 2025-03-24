public class smallest{
    public static int getsmallest(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,1};
        System.out.println(getsmallest(numbers));
    }
}