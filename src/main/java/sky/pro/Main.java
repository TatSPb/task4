package sky.pro;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        /**Задача: напишите код, с помощью которого можно перевернуть массив**/

        String[] array = {"1й", "2й", "3й", "4й",  "5й"};

        /*** Метод Collection.reverse()
         ***/
        System.out.println("Исходный массив: " + Arrays.toString(array)); //{"1й", "2й", "3й", "4й",  "5й"}
        List<String> list = Arrays.asList(array);
        Collections.reverse(list);
        System.out.println("Метод Collection.reverse(): " + Arrays.toString(array)); //{"5й", "4й", "3й", "2й",  "1й"}
        System.out.println();


        /*** Цикл for. Перебирает половину массива, меняя элементы в симметричных позициях.

         ***/
        System.out.println("Исходный массив: " + Arrays.asList(array)); //{"5й", "4й", "3й", "2й",  "1й"}
        for (int i = 0; i < array.length / 2; i++) {
                String temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        System.out.println("Цикл for: " + Arrays.asList(array));//{"1й", "2й", "3й", "4й",  "5й"}
        System.out.println();

        /*** Stream API. Используем метод IntStream.range для генерации последовательного потока чисел,
         * затем отображаем эту последовательность в индексы массива в порядке убывания
         ***/
        System.out.println("Исходный массив: " + Arrays.asList(array));//{"1й", "2й", "3й", "4й",  "5й"}
        Object[] reversedArray = IntStream.rangeClosed(1, array.length)
                .mapToObj(i -> array[array.length - i])
                .toArray();
        System.out.println("Stream API: " + Arrays.toString(reversedArray)); //{"5й", "4й", "3й", "2й",  "1й"}
    }
};




