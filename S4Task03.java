/**
 * S4Task03 Калькулятор с отменой последней операции
 * В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
 * Отмена последней операции должна быть реализована следующим образом: если передан оператор '<'
 * калькулятор должен вывести результат предпоследней операции.
 */

public class S4Task03 {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        a = 3;
        op = '+';
        b = 7;
        c = 4;
        op2 = '+';
        d = 7;
        undo = '<';

        S4Task03 calculator = new S4Task03();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double prevResult = result;

        result = calculator.calculate(op2, c, d);
        System.out.println(result);
        if (undo =='<')
        System.out.println(prevResult);
        
    }
    
    public int calculate(char op, int a, int b) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return (-1);
        }
    }

}
