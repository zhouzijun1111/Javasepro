package com.oppo;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        int[] arr2 = copy(arr);
        printArray(arr2);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
    public static int[] copy(int[] arr){
        int[] arr2 = new  int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
}
