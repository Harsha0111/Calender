public class Matrix {
    public static void main(String[] args) {
    int array[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
    };
    spiralMatrixPrint(array);
    }

    private static void spiralMatrixPrint(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        int top = 0 ,bottom = rows-1, right = cols-1 ,left = 0;

        // defining path direction
        // 1-> right
        //2 -> down
        //3 -> left
        // 4-> top

        int dir = 1;
        while (top <= bottom && left <=right){

            if (dir == 1){
                // moving left to right
                for (int i = left; i <=right ; i++) {
                    System.out.println(array[top][i] + " ");
                }

                // need to move down and direction
                top+= 1; // making increment so +1
                dir=2; // need to move down

            } else if (dir==2) {
                // moving top to bottom
                for (int i = top; i <= bottom; i++) {
                    System.out.println(array[i][right] + " ");
                }
                //
                right = right-1;
                dir =3;

            } else if (dir == 3) {
                // moving right to left
                for (int i =right ; i >=left ; --i) {
                    System.out.println(array[bottom][i] + " ");
                }
                bottom -= 1;
                dir = 4;
            } else if (dir == 4) {
                // moving bottom to top
                for (int i = bottom; i >=top ; --i) {
                    System.out.println(array[i][left] + " ");

                }
                left += 1;
                dir = 1;

            }

        }
    }
}
