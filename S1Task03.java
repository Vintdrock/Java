/**
 * S1Task03 Калькулятор
 * Реализуйте простой калькулятор
 * В методе calculate класса Calculator реализовать калькулятор, который будет выполнять
 * математические операции (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.
 * В классе Printer необходимо реализовать проверку переданного оператора, 
 * при некорректном операторе программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".
 */
public class S1Task03 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int a = 5;
        char op = '/';
        int b = 5;
        double result;
        if ((op == '/') & (b == 0))
            System.out.println("Деление на ноль!");
        else {
            S1Task03 sTask03 = new S1Task03();
            result = sTask03.calculate(op, a, b);
            if (result == -1)
                System.out.println("Некорректный оператор : " + op);
            else
                System.out.println(result);
        }
        
    } 

    public double calculate(char op, int a, int b) {
        // Введите свое решение ниже
        if (op == '+') {
          return a + b;
        }
        if (op == '-') {
          return a - b;
        }
        if (op == '*') {
          return a * b;
        }
        if (op == '/') {
          return a / b;
        }
  return -1;
      }
}