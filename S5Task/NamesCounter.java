package S5Task;
import java.util.HashMap;
/**
 * S5Task02 NamesCounter Подсчет повторяющихся имен
 * НВы работаете с приложением для учета имен пользователей. Ваша задача - разработать программу,
 * которая принимает на вход пять имен пользователей (или использует имена по умолчанию, если аргументы не предоставлены)
 * и подсчитывает, сколько раз каждое имя встречается.
 * Программа должна использовать HashMap для хранения имен и их количества вхождений.
 * По завершении, программа выводит результат в виде пар "имя - количество".
 */
class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {
        if (names.containsKey(name)) {
            names.put(name, names.get(name) + 1);
        } else {
            names.put(name, 1);
        }
    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
        System.out.println(names);
    }
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        String name4;
        String name5;
            name1 = "Elena";
            name2 = "Elena";
            name3 = "Elena";
            name4 = "Elena";
            name5 = "Ivan";
 
        NamesCounter namesCounter = new NamesCounter();

        namesCounter.addName(name1);
        namesCounter.addName(name2);
        namesCounter.addName(name3);
        namesCounter.addName(name4);

        namesCounter.addName(name5);

        namesCounter.showNamesOccurrences();
    }
}
