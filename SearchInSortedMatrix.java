public class SearchInSortedMatrix {
    public static boolean isExist(int[][] matrix, int targetvalue){
        int row = 0;
        int column = matrix[0].length - 1;
        while(row < matrix.length && column >= 0){
            if(matrix[row][column] == targetvalue){
                //System.out.println("Element found at row: " + row + " column: " + column);
                return true;
            }
            else if(matrix[row][column] > targetvalue){
                column--;
            }
            else{
                row++;
            }
        }
        //System.out.println("Element not found");
        return false;
    }
    public static void main(String[] args) {

        int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int ele = 29;
        System.out.println(isExist(matrix, ele));
        System.out.println(isExist(matrix, 100));
    }
    
}
