package S5Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * S5Task01 PhoneBook Телефонная книга
 * Напишите программу, представляющую телефонную книгу. Программа должна иметь следующие функции:
 * add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
 * Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
 * Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.
 * find(String name): Поиск номеров телефона по имени в телефонной книге.
 * Если запись с именем name существует, возвращает список номеров телефона для этой записи.
 * Если запись с именем name не существует, возвращает пустой список.
 * getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена, а значения - списки номеров телефона.
 */
class PhoneBook {
    private Map<String, List<Integer>> phoneBook;
        public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }
        public void add (String name, Integer phoneNum) {
        List<Integer> numbers = phoneBook.getOrDefault(name, new ArrayList<>());
        numbers.add(phoneNum);
        phoneBook.put(name, numbers);
    }

    public List<Integer> find(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public Map<String, List<Integer>> getPhoneBook() {
        return phoneBook;
    }

    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;

            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name1, phone1);
        phoneBook.add(name1, phone2);
        phoneBook.add(name2, phone2);

        System.out.println(phoneBook.find(name1));
        System.out.println(phoneBook.getPhoneBook());
        System.out.println(phoneBook.find("Me"));
    }
}