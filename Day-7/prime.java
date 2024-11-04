// public class prime{
//     public static boolean isPrime(int n){
//             boolean isPrime = true;
//             for(int i=2;i<=n-2;i++){
//                 if(n%i==0){
//                     return  false;
//                 }
//             }
//             return true;
//     }
//     public static void main(String[] args) {
//         System.out.println(isPrime(2));
//     }
// }

// public class prime{
//     public static boolean isPrime(int n){
//         boolean isPrime = true;
//             if(n==2){
//                 return true;
//             }
//             for(int i=2;i<=Math.sqrt(n);i++){
//                 if(n%i==0){
//                     return false;
//                 }
//             }
//             return true;
//     }
//     public static void main(String[] args) {
//         System.out.println(isPrime(17));
//     }
// }

// print all prime number in range
public class prime{
    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
            
        }
    }
    public static boolean isPrime(int n){
        boolean isPrime = true;
            if(n==2){
                return true;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
    }
    public static void main(String[] args) {
        primeinrange(100);
        
    }
}


