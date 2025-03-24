public class TransposeMatrix{
    public static void Transpose(int matrix[][]){
        int n = matrix.length;
        int m= matrix[0].length;

        // int transpose_array[][] = new int[m][n];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}
                         };
        Transpose(matrix);                
    }
}