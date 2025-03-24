public class SearchSortedMatrix{
    public static boolean StairCaseSearch(int matrix[][], int key){
        // consider top cell for this code

        int row = 0, col = matrix[0].length-1;
        while(col<matrix.length && row>=0) {
            // if(matrix[row][col]==key) {
            //     System.out.println("found key at("+row+","+col+")");
            //     return true;
            // }
            // else if (key < matrix[row][col]) {
            //     col--;
            // }
            // else if (key > matrix[row][col]) {
            //     row++;
            // }

            // consider bottom cell
            if(matrix[row][col]==key) {
                System.out.println("found key at("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]) {
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}  };
        int key = 29;                  
        StairCaseSearch(matrix, key);                
    }
}