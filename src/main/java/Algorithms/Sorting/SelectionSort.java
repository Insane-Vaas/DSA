package Algorithms.Sorting;

import MiscellaneousFunctions.MiscellaneousFunctions;

import java.util.Scanner;

public class SelectionSort {

    MiscellaneousFunctions miscellaneousFunctions = new MiscellaneousFunctions();
    public void func(){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){

            arr[i] = scan.nextInt();

        }

        miscellaneousFunctions.printArr(arr);

        selectionSort(arr);

    }

    private void selectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){

                if(arr[i] > arr[j] && arr[j] < arr[min]){
                    min = j;
                }

            }
            int d = arr[i];
            arr[i] = arr[min];
            arr[min] = d;

        }

    }

}
