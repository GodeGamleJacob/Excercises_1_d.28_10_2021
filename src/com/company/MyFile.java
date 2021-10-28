package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MyFile {

        public static void readFromFile(){
            int[] heltal = new int[10];
            try {
                File myObj = new File("Textfile.txt");
                Scanner in = new Scanner(myObj);

                int i = 0;
                while (in.hasNext()){
                    heltal[i] = in.nextInt();
                    i++;
                }
                in.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println(Arrays.toString(heltal));
        }
}
