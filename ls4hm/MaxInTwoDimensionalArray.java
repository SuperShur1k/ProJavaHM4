package org.example.lesson4.ls4hm;

import java.util.Arrays;

public class MaxInTwoDimensionalArray {
//    Напишите метод, который найдет максимум в двухмерном масиве целых.
//    Добавьте проверки на null ( если передаваемый массив null, если одномерные массивы null).
    public static Integer findMax(Integer[][] array) {
        if (array == null) {
            System.out.println("Ошибка: Переданный массив является null.");
            return null;
        }

        Integer max = null;

        for (int i = 0; i < array.length; i++) {
            Integer[] row = array[i];

            if (row == null) {
                System.out.println("Ошибка: Одномерный массив в двумерном массиве является null.");
                continue;
            }

            for (int j = 0; j < row.length; j++) {
                Integer num = row[j];

                if (num == null) {
                    System.out.println("Ошибка: Элемент в одномерном массиве является null.");
                    continue;
                }

                if (max == null || num > max) {
                    max = num;
                }
            }
        }

        if (max == null) {
            System.out.println("Ошибка: В массиве нет ненулевых элементов.");
        }

        return max;
    }

    public static void str(Integer[][] a) {
//        System.out.println("[");   Напишите метод для распечатки на экране двухмерного массива целых.
//        for (int i = 0; i < a.length; i++) {
//            System.out.print("[");
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.println(a[i][j]);
//                if (j < a[i].length - 1) {
//                    System.out.print(", ");
//                }
//            }
//            System.out.print("]");
//            if (i < a.length - 1) {
//                System.out.println(",");
//            } else {
//                System.out.println();
//            }
//        }
//        System.out.println("]");

        System.out.println(Arrays.deepToString(a));
    }

    public static void main(String[] args) {
        Integer[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Integer[][] array2 = {};
        System.out.println("Максимальный элемент в массиве: " + findMax(array));
        System.out.println("Максимальный элемент в массиве: " + findMax(array2));

        str(array);
    }
}
