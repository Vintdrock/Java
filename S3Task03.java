import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * S3Task03 Анализатор списка
 * Реализуйте метод, который принимает на вход целочисленный массив arr:
 * - Создаёт список ArrayList, заполненный числами из исходого массива arr.
 * - Сортирует список по возрастанию и выводит на экран.
 * - Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное
 * значение в списке и выводит на экран - Maximum is {число}
 * - Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
 * Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

Integer[] arr - массив целых чисел. 
 */
public class S3Task03 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{-2, -1, 0, 1, 2, 3, 4, 5};
        S3Task03 ans = new S3Task03();      
        ans.analyzeNumbers(arr);
    }

    public void analyzeNumbers(Integer[] arr) {
        //создаем список из исходного массива
        List<Integer> listI = new ArrayList<Integer>(Arrays.asList(arr));

        //Сортировка списка
        Collections.sort(listI);
        System.out.println(listI);

        //В отсортированном списке минимальный на 0 позиции
        int min = listI.get(0);
        System.out.println("Minimum is " + min);

        //В отсортированном списке максимальный элемент на size-1 позиции
        int max = listI.get(listI.size()-1);
        System.out.println("Maximum is " + max);

        //Среднее арифметическое Average is =
        int sum = 0;
        for (int index = 0; index < listI.size(); index++) {
            sum+=listI.get(index);
        }
        double average = (double)sum / listI.size();

        System.out.println(sum);
        System.out.println(listI.size());
        System.out.printf("Average is = " + "%.1f", average);
    }
}
