import java.util.Arrays;

/**
 * S3Task01 Сортировка слиянием
 * Внутри класса MergeSort напишите метод mergeSort,
 * который принимает массив целых чисел, реализует алгоритм сортировки слиянием.
 * Метод должен возвращать отсортированный массив.
 */
public class S3Task01 {

    public static void main(String[] args) {

            int [] result = new int[]{5, 1, 6, 2, 3, 4};
            // int[] sort = mergeSort(result);
            // for (int i = 0; i < result.length; i++) {
            //     System.out.println(sort[i]);
            // }
            S3Task01 s3Task01 = new S3Task01();
            String arraySort = Arrays.toString(s3Task01.mergeSort(result));
            System.out.println(arraySort);
    }

    public int[] mergeSort(int[] result) {
        if (result.length < 2) {
            return result;
        } else {
          int[] left = mergeSort(Arrays.copyOfRange(result,0, result.length/2));
          int[] right = mergeSort(Arrays.copyOfRange(result,result.length / 2, result.length));
          return merge(left ,right);
        }
    }

    public static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        if (i == left.length) {
            while (j < right.length) {
                result[k] = right[j];
                j++;k++;
            }
        }
        if (j == right.length) {
            while (i < left.length) {
                result[k] = left[i];
                i++;k++;
            }
        }
        return result;
    }
}