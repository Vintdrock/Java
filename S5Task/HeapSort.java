package S5Task;
/**
 * S5Task03 HeapSort Сортировка массива с использованием кучи
 * Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort).
 * Программа должна работать следующим образом:
 * Принимать на вход массив целых чисел для сортировки. Если массив не предоставлен, программа использует массив по умолчанию.
 * Сначала выводить исходный массив на экран.
 * Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.
 * Выводить отсортированный массив на экран.
 * Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево на основе массива,
 * и heapSort, который выполняет собственно сортировку кучей.
 * Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.
 */
import java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
        // Для всех вершин дерева начиная с середины сортируемой части массива
        // (движемся влево до нулевого индекса)
        for (int i = sortLength / 2 - 1; i >= 0; i--) {
            int maxIndex;
            // Если у вершины два листа, выбираем больший
            if (i * 2 + 2 <= sortLength - 1) {
                if (tree[i * 2 + 2] > tree[i * 2 + 1]) maxIndex = i * 2 + 2;
                else maxIndex = i * 2 + 1;
            // Иначе один лист
            } else maxIndex = i * 2 + 1;
            // Сравниваем лист с максимальным значением с вершиной, при большем значении
            // дочернего элемента меняем его местами с вершиной
            if (tree[i] < tree[maxIndex]) {
                int temp = tree[i];
                tree[i] = tree[maxIndex];
                tree[maxIndex] = temp;
            }
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        // Выход из рекурсии: длина сортируемой части равна 0
        if (sortLength == 0) return;
        // Выстраивание элементов части массива в виде сортирующего дерева
        buildTree(sortArray, sortLength);
        // Замена местами первого и последнего элемента в сортируемой части
        int temp = sortArray[0];
        sortArray[0] = sortArray[sortLength - 1];
        sortArray[sortLength - 1] = temp;
        // Рекурсивно построение дерева и замена элементов для n - 1 элементов массива
        heapSort(sortArray, sortLength - 1);
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] initArray;

            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}