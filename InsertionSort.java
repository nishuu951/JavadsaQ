// Insertion Sort
import java.io.*;
import java.util.*;

public class InsertionSort {
    static void insertion(int arr[],int n){
     
     for(int i = 1;i<n;i++){
         for(int j = i-1;j>=0;j--){
             if(arr[j]>arr[j+1]){
                 swap(arr,j,j+1);
             }
             else{
                 break;
             }
         }
     }
        
    }
    static void swap(int arr[],int i,int j){
        int temp;
        temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]  = new int[n];
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    insertion(arr,n);
    for(int l = 0;l<n;l++){
        System.out.println(arr[l]);
    }
    }
}