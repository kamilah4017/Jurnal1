package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner (System.in);

        System.out.print("Input : ");
        int input = sc.nextInt();

        System.out.println();

        System.out.println("output : ");
        for (int i = 1; i <= input; i++) {
            int x = cari(i);
            System.out.print(x + " ");
        }

    }

    public static int cari(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return cari(n - 1) + cari(n - 2);
        }
    }
}
