package S6HW;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

class PhoneBookData {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    // Добавление данных в телефонную книгу.
    public void addRes(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> phones = new ArrayList<>();
            phones.add(phoneNum);
            phoneBook.put(name, phones);
        }
    }

    // Поиск номеров телефона по имени.
    public ArrayList<Integer> find(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return new ArrayList<Integer>();
    }

    // Вывод телефонной книги.
    public void showPhoneBook() {
        if (!phoneBook.isEmpty()) {

            // Сортировка по убыванию числа телефонов.
            Map<String, List<Integer>> sorted = phoneBook.entrySet().stream()
                    .sorted(comparingInt(e -> -e.getValue().size()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> {
                        throw new AssertionError();
                    }, LinkedHashMap::new));

            System.out.println(sorted);
        } else
            System.out.println("Телефонная книга пуста :(\n");
    }
}

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBookData phoneBookData = new PhoneBookData();
        // Добавление тестовых данных
        phoneBookData.addRes("Виталий", 921111);
        phoneBookData.addRes("Антон", 922222);
        phoneBookData.addRes("Василий", 923333);
        phoneBookData.addRes("Кирилл", 924444);
        Boolean flag;
        flag = true;
        while (flag == true) {
            System.out.println("\n1. Добавить запись;\n2. Найти запись;\n3. Вывести весь список;\n0. Выход.\n");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Выберите действие: ");
            int list = scanner.nextInt();
            scanner.nextLine();
            String name;

            switch (list) {
                case 0:
                    flag = false;
                    scanner.close();
                    break;
                case 1:
                    System.out.print("Введите имя: ");
                    name = scanner.nextLine();
                    System.out.print("Введите номер: ");
                    Integer phoneNum = scanner.nextInt();
                    phoneBookData.addRes(name, phoneNum);
                    break;
                case 2:
                    System.out.print("Введите имя для поиска номера(ов): ");
                    name = scanner.nextLine();
                    System.out.println(phoneBookData.find(name));
                    break;
                case 3:
                    phoneBookData.showPhoneBook();
                    break;
                default:
                    System.out.print("Команда не распознана. Попробуйте еще раз.\n");
                    break;

            }
        }

    }
}