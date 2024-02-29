import java.util.ArrayList;
/**
 * S3Task02 Удаление четных элементов
 * Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива.
 * Необходимо удалить из списка четные числа и вернуть результирующий.
 * Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход
 * один параметр: Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>
 */
public class S3Task02 {
    public static void main(String[] args) {
        Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> result = removeEvenNumbers(arr);
        System.out.println(result);
    }

    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> notEven = new ArrayList<Integer>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] % 2 != 0)
                notEven.add(arr[index]);
        }
        return notEven;
    }
}
