package com.bridgelabz.AlgorithmPrograms;

public class BubbleSort {
    public static void printArray(int arr[]){
        System.out.println("Print Array :");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={9,3,5,7,2,1};

        for (int i=0;i< arr.length-1;i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }
}

