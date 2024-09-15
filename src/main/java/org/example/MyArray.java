package org.example;

import java.util.Scanner;

public class MyArray {
    int[] emptyArray = new int[5];
    int[] notEmptyArray = {5, 7, 8, 3, 2, 9, 7};

    void addItems(){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < emptyArray.length; i++) {
            System.out.println("Enter Item at index: "+i);
            emptyArray[i] = input.nextInt();
        }
    }

    void viewRecords(){
        for (int i = 0; i < notEmptyArray.length; i++) {
            System.out.println(notEmptyArray[i]);
            if(notEmptyArray[i] % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        //myArray.addItems();
        myArray.viewRecords();
    }
}
