public class pattern{
    public static void hollowReactangle(int row, int col){
        
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void invertedRotatedpyramid(int row, int col){
            for(int i=1;i<=row;i++){
                for(int j=1;j<=row-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
    }

    public static void invertedhalfpyramid(int row, int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i+1;j++){
                System.out.print(" "+j);
            }
            System.out.println("");
        }
    }

    public static void eloydstriangle(int rows, int col){
        int counter = 1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+counter);
                counter++;
            }
            System.out.println("");
        }
    }

    public static void zeroandonetriangle(int rows, int col){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }

    public static void butterfly(int n){
        // ist half
        for(int i=1;i<=n;i++){
            // stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        // 2nd half
        for(int i=n;i>=1;i--){
            // stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void solidrhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void hollowrhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println("");
        }

         for(int i=n;i>=1;i--){
             for(int j=1;j<=n-i;j++){
                 System.out.print(" ");
             }
             for(int j=1;j<=(2*i-1);j++){
                 System.out.print("*");
             }
             System.out.println("");
         }
    }
    public static void main(String[] args) {
       // hollowReactangle(4, 5);
      // invertedRotatedpyramid(4, 4);
      // invertedhalfpyramid(4, 4);
       // eloydstriangle(4, 4);
        //zeroandonetriangle(5, 5);
       // butterfly(4);
        //solidrhombus(5);
       hollowrhombus(5);
      // diamond(6);

    }
}