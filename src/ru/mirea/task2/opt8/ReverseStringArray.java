package ru.mirea.task2.opt8;

public class ReverseStringArray {
    public static void main(String[] args) {
        String[] words = {"1", "2", "3", "4", "5", "6", "7"};

        System.out.println("Исходный массив:");
        printArray(words);

        // Элементы местами в обратном порядке
        int left = 0;
        int right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        System.out.println("\nПеревернутый массив:");
        printArray(words);
    }

    // Функция для вывода массива на экран
    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
