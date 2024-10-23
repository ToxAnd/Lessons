package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printThreeWords(); //1
        checkSumSign(1, 2); //2
        printColor(0); //3
        compareNumbers(1, 0); //4
        System.out.println(sumFor10_20(1, 2) + "\n"); //5
        checkNumSign(10); //6
        System.out.println(checkNumSign2(10) + "\n"); //7
        printStringNumOfTimes("Hello, world, again!", 3); //8
        System.out.println(checkLeapYear(3) + "\n"); //9
        System.out.println(Arrays.toString(swapArr0_1(new int[]{1, 0, 1, 0})) + "\n"); //10
        System.out.println(Arrays.toString(createArrLen100()) + "\n"); //11
        System.out.println(Arrays.toString(createArrTask12()) + "\n"); //12
        create2DemArr(5); //12
        System.out.println(Arrays.toString(createArrTask14(5, 0)) + "\n"); //14
    }

    public static void  printThreeWords(){ //1
        System.out.println(
                "Orange \n" + "Banana \n" + "Apple \n");
    }

    public static void checkSumSign(int a, int b){ //2
        if(a + b >= 0){
            System.out.println("Сумма положительная \n");
        } else {
            System.out.println("Сумма отрицательная \n");
        }
    }

    public static void printColor(int value){ //3
        if(value <= 0){
            System.out.println("Красный \n");
        } else if (value <= 100) {
            System.out.println("Желтый \n");
        } else {
            System.out.println("Зелёный \n");
        }
    }

    public static void compareNumbers(int a, int b){ //4
        if (a >= b){
            System.out.println("a >= b \n");
        } else {
            System.out.println("a < b \n");
        }
    }

    public static boolean sumFor10_20(int a, int b){ //5
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkNumSign(int value){ //6
        if (value >= 0){
            System.out.println("Число положительное \n");
        } else {
            System.out.println("Число отрицательное \n");
        }
    }

    public static boolean checkNumSign2(int value) { //7
        return value < 0;
    }

    public static void printStringNumOfTimes(String str, int times){ //8
        for(int i = 0; i < times; i++){
            System.out.println(str);
        }
        System.out.println();
    }

    public static boolean checkLeapYear(int value){ //9
        return !(value % 100 == 0) && value % 4 == 0 || value % 400 == 0;
    }

    public static int[] swapArr0_1(int[] arr){ //10
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static int[] createArrLen100(){ //11
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        return arr;
    }

    public static int[] createArrTask12(){ //12
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < 6) arr[i] *= 12;
        }
        return arr;
    }

    public static void create2DemArr(int value){ //13
        int[][] arr = new int[value][value];
        for(int i = 0; i < value; i++){
            for(int j = 0; j < value; j++){
                if(i == j || i + j == value - 1) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[] createArrTask14(int len, int initialValue){ //14
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}