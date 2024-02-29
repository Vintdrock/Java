/**
 * S1Task02 Вывести простые числа
 * Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000,
 * каждое на новой строке.Напишите свой код в методе printPrimeNums класса Answer. 
 */
public class S1Task02 {

    public static void main(String[] args) {
        for (int j = 2; j <= 1000; j++) {
            boolean simple = false;

            for (int i = 2; i * i <= j; i++) {
                simple = (j % i == 0);
                if (simple) {
                    break;
                }
            }
            if (!simple) {
                System.out.println(j);
            }
        }
    }
}