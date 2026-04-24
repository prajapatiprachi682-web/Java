package DSA;

public class JavaArray5 {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] transpose = new int[3][3];

        // Transpose logic
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                transpose[j][i] = arr[i][j];
            }
        }

        // Print transpose
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}