import java.util.ArrayList;
import java.util.List;

public class Snail {

    public static void main(String[] args) {
        int[][] array=
               {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[] result = snail(array);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] snail(int[][] array) {
        List<Integer> resultList = new ArrayList<>();

        if (array == null || array.length == 0 || array[0].length == 0) {
            return new int[0];
        }

        int top = 0;
        int bottom = array.length - 1;
        int left = 0;
        int right = array[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int col = left; col <= right; col++) {
                resultList.add(array[top][col]);
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                resultList.add(array[row][right]);
            }
            right--;

            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    resultList.add(array[bottom][col]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    resultList.add(array[row][left]);
                }
                left++;
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
