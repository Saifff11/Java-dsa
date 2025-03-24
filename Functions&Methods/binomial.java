public class binomial{
    public static int binocoef(int n, int r){
            int nfact = fact(n);
            int rfact = fact(r);
            int nMrfact = fact(n-r);

            int binocoef = nfact/(rfact - nMrfact);
            return binocoef;

    }

    public static int fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
        
        fact = fact * i;
        
        }
        return fact;
    }
    public static void main(String args[]){
        System.out.println(binocoef(3, 2));
    }
}