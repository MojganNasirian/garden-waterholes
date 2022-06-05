package com.codeWithMojgan;

import java.util.Scanner;

class riceGarden {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int cols = scan.nextInt();
            int rows = scan.nextInt();

            //2d Array:
            int data[][] = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    data[i][j] = scan.nextInt();
                }
            }
            int count= 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (((data[i][j]) < ((data[i][j])- 1)) && ((data[i][j]) < (data[i][j])+1)){
                        count++;
                    }
                }
            }
        System.out.println(count);
        }
    }
