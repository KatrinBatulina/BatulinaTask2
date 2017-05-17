package com.company;


public class Displacement {

    public static void Show(short[][] m) {
        for (short[] s : m) {
            for (short k : s) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }

    public static void MoveToLeft(short[][] m, int steps) {
        for (int i = 0; i < m.length; i++) {
            int realSteps = steps % m[i].length;
            if (realSteps == 0)
                continue;
            int rowLength = m[i].length;
            short[] temp = new short[rowLength];
            for (int j = 0; j < rowLength; j++) {
                int newIndex = (j - realSteps < 0) ? rowLength + j - realSteps : j - realSteps;
                temp[newIndex] = m[i][j];
            }
            for (int j = 0; j < rowLength; j++) {
                m[i][j] = temp[j];
            }
        }
    }


}