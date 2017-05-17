package com.company;


import java.util.Arrays;

public class ZeroMoving {
    public static void printArr(int[][] a) {

        for(int[]x:a)
        {
            for (int z : x)
            {
                System.out.print(z + "  ");
            }
            System.out.println();
        }

    }
    public static void zeroToRight(int[][] b) {
        for (int i = 0; i < b.length; i++)
        {
            int n = 0;
            int[] c = new int[b.length];
            for (int j = 0; j < b.length; j++)
            {
                if (b[i][j] != 0)
                {
                    c[n++] = b[i][j];
                }
            }
            b[i] = Arrays.copyOf(c, c.length);
        }
    }
}
