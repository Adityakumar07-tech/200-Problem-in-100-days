package Array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            swap( arr,start , end);
            start++;
            end--;
        }
     }
     static void swap( int[] arr , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
     }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of Array :");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the Element in your Array : ");
        for(int num = 0 ; num<arr.length; num++){
            arr[num] = in.nextInt();
        }

        System.out.println("Array that you Enter : ");
        System.out.println(Arrays.toString(arr));

        reverseArray(arr);
        System.out.println("Array after Reverse : ");
        System.out.println(Arrays.toString(arr));



    }
}
