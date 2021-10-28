package com.company;
import java.util.Scanner;
public class TestToScreen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        double y;
        String s;
        x = in.nextInt();
        System.out.println(x);
        y = in.nextDouble();
        System.out.println(y);
        s = in.nextLine();
        System.out.println(s);
    }
}
