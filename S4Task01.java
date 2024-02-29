import java.util.LinkedList;
/**
 * S4Task01 Перевернутый LinkedList
 * Дан LinkedList с несколькими элементами разного типа. В методе revert класса LLTasks
 * реализуйте разворот этого списка без использования встроенного функционала.
 */
public class S4Task01 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");

        S4Task01 answer = new S4Task01();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);
    }

    public LinkedList<Object> revert(LinkedList<Object> ll) {
        for (int index = 0; index < ll.size()/2; index++) {
            Object temp = ll.get(index);
            ll.set(index, ll.get(ll.size() -1 -index));
            ll.set (ll.size()-1-index, temp);
        }
        return ll;
    }
}
