package Algorithms.Sorting;

import MiscellaneousFunctions.MiscellaneousFunctions;

import java.util.Scanner;

public class InsertionSort {

    MiscellaneousFunctions miscellaneousFunctions = new MiscellaneousFunctions();

    public void func(){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }

        insertionSortFunc(a);

        miscellaneousFunctions.printArr(a);
    }

    private void insertionSortFunc(int[] arr){

        for(int i=1;i<arr.length;i++){

            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] = key;
            miscellaneousFunctions.printArr(arr);
        }

    }


}
