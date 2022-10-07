import java.util.Scanner;

public class MatrixTry {
    public static void main(String[] args) {
        int array[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        spiralMatrix(array);
    }

    private static void spiralMatrix(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        // directions
        //1-> right
        // 2 -> bottom
        //3-> left
        // 4-> top

        int dir = 1;
        //while (top <= bottom && left <= right) {
        Scanner sc = new Scanner(System.in);

        while (true) {
             System.out.println("Enter yr choice");
            int choice = sc.nextInt();
            if (dir == 1) {
                for (int i = left; i <= right; i++) {
                    System.out.println(array[top][i]);
                } //top is increment from 0 to +1 i.e,top increment to reach bottom
                top += 1;
                dir = 2;

            } else if (dir == 2) {
                for (int i = top; i <= bottom; i++) {
                    System.out.println(array[i][right]);
                } //right is decrement format to go for left
                right -= 1;
                dir = 3;

            } else if (dir == 3) {
                for (int i = right; i >= left; --i) {
                    System.out.println(array[bottom][i]);
                }// bottom to top na decrement
                bottom -= 1;
                dir = 4;

            } else if (dir == 4) {
                for (int i = bottom; i >= top; --i) {
                    System.out.println(array[i][left]);
                }//left to right na increment
                left += 1;
                dir = 1;

            } else if (dir == 5) {
                for (int i = left; i <= right; i++) {
                    System.out.println(array[top][i]);
                } //top is increment from 0 to +1 i.e,top increment to reach bottom
                top += 1;
                dir = 2;
            }

        }
    }
}

