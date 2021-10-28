package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static double gennemsnit (int[] heltal, int antal) {
        int sum = 0;
        for (int i = 0; i < antal; i++) {
            sum = heltal[i];
        }
            return sum/antal;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] heltal = new int[10];
        for (int i = 0; i < 10; i++) {
            heltal[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(heltal));
        System.out.println("Du har : " + Array.getLength(heltal) + "tal i dit array!.");
        System.out.println("Gennemsnittet i dit array er : " + gennemsnit(heltal, 10));
    }
}