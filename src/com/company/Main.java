package com.company;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

//Задание № 1

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину массива");
        int sLength = scanner.nextInt();
        String[] array = new String[sLength];
        int maxLength = Integer.MIN_VALUE;
        int minLength = Integer.MAX_VALUE;
        String minStr = null;
        String maxStr = null;
        System.out.println("введите " + sLength + " числа/чисел");
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
        System.out.println("Самое длинное число: " + maxStr + " Его длина: " + maxLength);
        System.out.println("Самое короткое число: " + minStr + " Его длина: " + minLength);*/

//Задание № 2

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину массива");
        int arrayLength = scanner.nextInt();
        String[] myArray = new String[arrayLength];
        String temp;
        System.out.println("введите " + arrayLength + " числа/чисел");
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

//Задание № 3

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("кол-во элементов:");
        int n = scanner.nextInt();
        String[] stringArray = new String[n];
        System.out.println("введите " + n + " чисел/числа");
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scanner.next();
        }
        int sum = 0;
        for (int i = 0; i < stringArray.length; i++) {
            sum += stringArray[i].length();
        }
        int averageLength = sum / stringArray.length;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() < averageLength) {
                System.out.println("Число с длиной меньше средней: " + stringArray[i]);
                System.out.println("Длина числа: "+stringArray[i].length());
            }
            if (stringArray[i].length() > averageLength) {
                System.out.println("Число с длиной больше средней: " + stringArray[i]);
                System.out.println("Длина числа: "+stringArray[i].length());
            }
        }*/


//Задание № 4

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("введите кол-во элементов");
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
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] == 1) {
                    count++;
                }
            }
            System.out.println("количество различных цифр: "+count);
            if (count < min) {
                min = count;
                temp = s;
            }
        }
        System.out.println("первое число, в котором кол-во различных цифр минимально: "+temp);*/

//Задание № 5

        /*int[] arrayOfNumbers = {123, 426, 884, 976, 113, 222};
        int temp = 0;
        for (int number : arrayOfNumbers) {
            String s = Integer.toString(number);
            char charArray[] = s.toCharArray();
            for (char chs : charArray) {
                if (Character.digit(chs, 10) % 2 != 0) {
                    temp--;
                    break;
                }
            }
            temp++;
        }
        System.out.println(temp);*/

//Задание № 6

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("введите числа через пробел");
        String[] str = scanner.nextLine().split(" ");
        for (String element : str) {
            byte[] a = element.getBytes();
            byte[] b = element.getBytes();
            Arrays.sort(b);
            if (Arrays.equals(a, b)) {
                System.out.println("первое число, цифры в котором идут в строгом порядке возрастания: "+element);
                break;
            }
        }*/

//Задание № 7

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("введите числа через пробел");
        String[] stringArray = scanner.nextLine().split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            String s = stringArray[i];
            boolean flag = true;
            int[] myArray = new int[10];
            for (int k = 0; k < s.length(); k++) {
                int index = Integer.parseInt(s.substring(k, k + 1));
                myArray[index]++;
            }
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[j] > 1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("первое число, состоящее из различных цифр: "+s);
                break;
            }
        }*/

// Задание № 8

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("введите N");
        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];
        int value = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = value;
                value++;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }*/

//Задание № 9

     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("введите n");
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int random_number = ((int) Math.floor(Math.random() * (n * 2)) - n);
                a[i][j] = random_number;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }*/


//Задание № 9.1

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("введите размеры матрицы через Enter: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(15);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int temp;
   // для упорядочивания строк
        for (int row = 0; row < n; row++) {
            for (int i = 1; i < m; i++) {
                for (int j = m - 1; j >= i; j--) {
                    if (matrix[row][j - 1] > matrix[row][j]) {
                        temp = matrix[row][j - 1];
                        matrix[row][j - 1] = matrix[row][j];
                        matrix[row][j] = temp;
                    }
                }
            }
        }
    // для упорядочивания столбцов
        for (int column = 0; column < m; column++) {
            for (int i = 1; i < n; i++) {
                for (int j = n - 1; j >= i; j--) {
                    if (matrix[j - 1][column] > matrix[j][column]) {
                        temp = matrix[j - 1][column];
                        matrix[j - 1][column] = matrix[j][column];
                        matrix[j][column] = temp;
                    }
                }
            }
        }
    //вывод матрицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }*/


//Задание № 9.2

       /* Scanner scanner = new Scanner(System.in);
        short[][] matrix =
                       {{1, 2, 3, 5, 8},
                        {4, 5, 6, 7, 4},
                        {6, 3, 1, 9, 7},
                        {9, 0, 2, 3, 9}};

        Displacement.Show(matrix);
        System.out.print("-> k ");
        int k = scanner.nextInt();
        Displacement.MoveToLeft(matrix, k);
        Displacement.Show(matrix);*/

//Задание № 9.4

    /*    Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество строк");
        int m = scanner.nextInt();
        System.out.println("введите количество столбцов");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int random_number = ((int) Math.floor(Math.random() * (21)) - 10);
                matrix[i][j] = random_number;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            int firstIndex = -1;
            int secondIndex = -1;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > 0 && firstIndex < 0) {
                    firstIndex = j;
                    continue;
                }
                if (matrix[i][j] > 0 && secondIndex < 0) {
                    secondIndex = j;
                }
            }
            int sum = 0;
            if (firstIndex != -1 && secondIndex != -1) {
                for (int k = firstIndex + 1; k < secondIndex; k++) {
                    sum += matrix[i][k];
                }
            }
            System.out.println("сумма значений между первым и вторым положительным элементами в текущей строке: "+sum);
            System.out.println();
        }*/

//Задание № 9.5

      /*  Matrix m = new Matrix();
        m.MatrixVoid(2, 4, 5);
        m.DisplayMatrix();
        System.out.println("---");

        for (int i = 0; i < 4; i++) {
            m.rotateMatrix(90);
            System.out.println("---");
            m.DisplayMatrix();
        }*/

//Задание № 9.6

       /* System.out.println("Введите размеры матрицы через Enter: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = r.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            int average = 0, sum = 0;
            for (int j = 0; j < m; j++) {
                sum += matrix[i][j];
            }
            average = sum / m;
            for (int j = 0; j < m; j++) {
                matrix[i][j] -= average;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }*/


//Задание № 9.7

       /* int[][] matrix =
                       {{1, 2, 3, 0, 4, 0},
                        {0, 0, 0, 0, 0, 0},
                        {1, 2, 3, 0, 4, 0},
                        {0, 0, 0, 0, 0, 0},
                        {1, 1, 1, 0, 1, 0}};
        int N = 5;
        int n = N, m = N;
        boolean temp = false;
        System.out.println("Матрица до уплотнения:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " \t");
            }
            System.out.println();
        }
        // удаляем строки с 0
        for (int i = 0; i < n; i++) {
            temp = true;
            for (int j = 0; j < m; j++)
                if (matrix[i][j] != 0) {
                    temp = false;
                    break;
                }
            if (temp) {
                for (int k = i; k < (n - 1); k++)
                    for (int j = 0; j < m; j++)
                        matrix[k][j] = matrix[k + 1][j];
                --i;
                --n;
            }
        }
        // удаляем столбцы с 0
        for (int j = 0; j < m; j++) {
            temp = true;
            for (int i = 0; i < n; i++)
                if (matrix[i][j] != 0) {
                    temp = false;
                    break;
                }
            if (temp) {
                for (int k = j; k < (m - 1); k++)
                    for (int i = 0; i < m; i++)
                        matrix[i][k] = matrix[i][k + 1];
                --j;
                --m;
            }
        }
        System.out.println("Матрица после уплотнения:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }*/


//Задание № 9.8

       /* int array[][] =
                       {{1, 2, 0, 4, 6},
                        {8, 4, 7, 0, 3},
                        {0, 0, 3, 4, 8},
                        {1, 8, 0, 1, 1},
                        {1, 4, 1, 0, 6}};

        System.out.println("Исходный массив");
        ZeroMoving.printArr(array);
        System.out.println("Массив после перемещения 0 в конец:");
        ZeroMoving.zeroToRight(array);
        ZeroMoving.printArr(array);*/



    }
}




