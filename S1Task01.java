import java.util.Scanner;
/**
 * S1Task01 N-ое треугольное число
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n).
 * Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
 * Если число n < 1 (ненатуральное) метод должен вернуть -1.
 */
public class S1Task01 {
    public static void main (String[] args){
        System.out.print("Введите чило : ");
        Scanner input = new Scanner(System.in);
        Integer n = input.nextInt();
        input.close();
        if (n < 1) {
            System.out.printf("-1");
          }
          int sum = 0;
          for (int i = 1; i <= n; i++){
            sum +=i; 
          }
        System.out.printf("n-ое треугольное число " + n + " = " + sum);
        }
    // public void printing() {
    //     System.out.println("n-ое треугольное число = " + sum);
    // }
}