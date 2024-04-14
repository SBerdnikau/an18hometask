import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      0. Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том,
//      входит ли заданное число в массив или нет. Пусть число для поиска задается с консоли (класс Scanner).
//      Не использовать методы класса Arrays.
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число:");
        int[] array1 = {2,3,4,6,7,8,10,11,24,56,100};
        int number = scanner1.nextInt();
        boolean key = false;
        for (int item : array1) {
            if (number == item) {
                key = true;
                break;
            }
        }
        System.out.println(key ? "Число входит" : "Число не входит");


//       1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
//       Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
//       В результате должен быть новый массив без указанного числа.
        int[] array2 = {1,2,4,5,2,7,8,2,24,56,7,9,1};
        int[] result2 = new int[array2.length];
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int countRemoveValue = 0;
        for (int i = 0; i < array2.length; i++) {
            if (value == array2[i]) {
                countRemoveValue++;
            }else {
                array2[i - countRemoveValue] = array2[i];
            }
        }
        if (countRemoveValue == 0) {
            System.out.println("Число в массив не входит");
        }else {
            for (int i = 0; i < array2.length; i++) {
                result2[i] =  array2[i];
            }
            for (int temp : result2) {
                System.out.printf("%s\t" ,temp);
            }
        }


//       2. Создайте и заполните массив случайным числами и выведете
//       максимальное, минимальное и среднее значение
        int lengthArray = 6;
        int[] arrayRandom = new int[lengthArray];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = (int) (Math.random() * 20);
        }

        int min = arrayRandom[0];
        int max = arrayRandom[0];
        double average = 0;
        int sum = 0;

        for (int element : arrayRandom) {
            if (min > element) {
                min = element;
            }
            if (max < element) {
                max = element;
            }

            sum = sum + element;
            average = (double) sum / 2;
        }
        System.out.println("Максимальное: " + max);
        System.out.println("Минимальное: " +  min);
        System.out.println("Среднее:  " + average );



        //3.Создайте массив из произвольных чисел. Создайте новый массив, который будет хранить
        //эти же элементы, но в обратном порядке.
        int[] array3 = {1,2,4,5,7,8,9};
        int[] result3 = new int[array3.length];
        for (int i = 0; i < array3.length/2; i++) {
            int temp = array3[array3.length - 1 - i];
            array3[array3.length - 1 - i] = array3[i];
            array3[i] = temp;
        }
        for (int i = 0; i < array3.length; i++) {
            result3[i] = array3[i];
        }
        for (int item : result3) {
            System.out.printf("%s\t",item);
        }
    }
}
