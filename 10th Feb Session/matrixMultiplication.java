public class matrixMultiplication {
    public static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("----");
    }
    public static void main(String[] args){
        int[][] matrix1 = {{1,2},{3,4}};
        int[][] matrix2 = {{1,2},{3,4}};

        print(matrix1);print(matrix2);

        int row1 = 2,col1 = 2,row2 = 2,col2 = 2;

        if(col1 != row2){
            System.out.println("Cannot perform multiplication");
            return;
        }

        int[][] res = new int[row1][col2];

        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){

                for(int k=0;k<col1;k++){

                    res[i][j] += matrix1[i][k] * matrix2[k][j];
                    
                }
            }
        }

        print(res);

        


    }
}
