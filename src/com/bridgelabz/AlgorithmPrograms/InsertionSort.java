package com.bridgelabz.AlgorithmPrograms;

public class InsertionSort {
    public static void printArray(int arr[]){
        System.out.println("Print Array :");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = {9, 3, 5, 7, 2, 1};

        for (int i = 0; i < arr1.length; i++) {
            int current = arr1[i];
            int j = i - 1;
            while (j >= 0 && current < arr1[j]) {
                arr1[j + 1] = arr1[j];
                j--;
            }
            arr1[j+1]=current;
        }
        printArray(arr1);
    }
}
