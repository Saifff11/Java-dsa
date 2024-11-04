public class assignment{
    public static float avgOfnum(int a, int b, int c){
        float sum = a+b+c;
        System.out.println("sum is :"+sum);
        float avg = sum/3;
        return avg;
    }
    public static void main(String[] args) {
        float average = avgOfnum(48, 77, 30);
        System.out.println("average of 3 num is :"+average);
    }
}