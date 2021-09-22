// Bubble Sort
import java.io.*;
import java.util.*;

public class BubbleSort {
    static void binary(int arr[],int n){
        for(int i = n-1;i>=0;i--){
            for(int j = 0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
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
    binary(arr,n);
    for(int l = 0;l<n;l++){
        System.out.println(arr[l]);
    }
    }
}