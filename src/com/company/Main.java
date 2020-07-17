package com.company;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        int[] table = new int[5];

        int t = table.length;

        int maks = 0;

        Random random = new Random();

        for (int i = 0; i + 1 <= t; i++)
        {
            table[i] = random.nextInt(100);
            System.out.print(" " +table[i]);
        }
        System.out.println();

        for (int z = 0; z + 1 <= t; z++)
        {
            if (maks < table[z])
            {
                maks = table[z];
            }
        }
        System.out.println("Największa liczba to: " +maks);

    }
}
