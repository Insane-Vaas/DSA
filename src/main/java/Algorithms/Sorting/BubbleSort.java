package Algorithms.Sorting;

import MiscellaneousFunctions.MiscellaneousFunctions;

import java.util.Scanner;

public class BubbleSort {

    MiscellaneousFunctions miscellaneousFunctions = new MiscellaneousFunctions();
    public void func(){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){

            arr[i] = scan.nextInt();

        }

        miscellaneousFunctions.printArr(arr);

        bubbleSort(arr);

    }

    private void bubbleSort(int[] arr){

        for(int i=arr.length-1;i>=0;i--){

            for(int j=0;j<i;j++){

                if(arr[j] > arr[j+1]){
                    int d = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =  d;
                }

            }
        }

    }

}
