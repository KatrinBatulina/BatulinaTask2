package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину массива");
        int sLength = scanner.nextInt();
        String[] array = new String[sLength];
        int maxLength = Integer.MIN_VALUE;
        int minLength = Integer.MAX_VALUE;
        String minStr = null;
        String maxStr = null;
        System.out.println("введите числа");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
            if (array[i].length() < minLength) {
                minLength = array[i].length();
                minStr = array[i];

            }
            if (array[i].length() > maxLength) {
                maxLength = array[i].length();
                maxStr = array[i];
            }
        }
        System.out.println("Максимальное число: " + maxStr + " Его длина: " + maxLength);
        System.out.println("Минимальное число: " + minStr + " Его длина: " + minLength);*/


       /* Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину массива");
        int arrayLength = scanner.nextInt();
        String[] myArray = new String[arrayLength];
        String temp;
        System.out.println("введите " + arrayLength + " чисел");
        for (int i = 0; i < arrayLength; i++) {
            myArray[i] = scanner.next();
        }
        for (int i = arrayLength - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (myArray[j].length() > myArray[j + 1].length()) {
                    temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(myArray[i]);
        }*/


       /* final String[] strings = new String[10];
        final Scanner scanner = new Scanner(System.in);
        float temp = 0.0F;
        System.out.println("Enter:");
        try {
            for (int i = 0; i < strings.length; i++)
                temp += (strings[i] = scanner.nextLine()).length();
        } finally {
            scanner.close();
        }
        final float centerLength = temp / strings.length;
        System.out.println("Result:");
        int i;
        for (i = 0; i < strings.length; i++) {
            if (strings[i].length() < centerLength)
                System.out.println("числл с длиной меньше средней:" + strings[i]);
        }
        for (i = 0; i < strings.length; i++) {
            if (strings[i].length() > centerLength)
                System.out.println("число с длиной больше средней:" + strings[i]);
        }*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество элементов ");
        int arrayLength = scanner.nextInt();
        String[] array = new String[arrayLength];
        System.out.println("введите " + arrayLength + " чисел");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].length();
        }
        int averageLength = sum / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < averageLength) {
                System.out.println("число с длиной меньше средней: " + array[i]+". Его длина: "+array[i].length());
            }
            if (array[i].length() > averageLength) {
                System.out.println("число с длиной больше средней: " + array[i]+". Его длина: "+array[i].length());
            }
        }*/


      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину массива");
        int arrayLength = scanner.nextInt();
        String[] stringArray = new String[arrayLength];
        System.out.println("введите элементы");
        for (int j = 0; j < stringArray.length; j++) {
            stringArray[j] = scanner.next();
        }
        int min = Integer.MAX_VALUE;
        String temp=null;
        for (int j = 0; j < stringArray.length; j++) {
            int count = 0;
            String s = stringArray[j];
            int[] myArray = new int[10];
            for (int i = 0; i < s.length(); i++) {
                int index = Integer.parseInt(s.substring(i, i + 1));
                myArray[index]++;
            }
            System.out.println(Arrays.toString(myArray));
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] == 1) {
                    count++;
                }
            }
            System.out.println(count);
            if (count < min) {
                min = count;
                temp = s;
            }
        }
        System.out.println(temp);*/


       /* Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину массива");
        int arrayLength = scanner.nextInt();
        String[] stringArray = new String[arrayLength];
        System.out.println("введите элементы");
        for (int j = 0; j < stringArray.length; j++) {
            stringArray[j] = scanner.next();
        }
        int min = Integer.MAX_VALUE;
        String temp = null;
        for (String s : stringArray) {
            int count = 0;
            int firstNumber = 0;
            int secondNumber = 0;
            boolean flag = true;
            for (int i = 0; i < s.length() - 1; i++) {
                firstNumber = Integer.parseInt(s.substring(i, i + 1));
                secondNumber = Integer.parseInt(s.substring(i + 1, i + 2));
                if (secondNumber > firstNumber) {
                    flag = true;
                    count++;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                if (count < min) {
                    min = count;
                    temp = s;
                }
            }
        }
        System.out.println(temp);*/




    }


}
